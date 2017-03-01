package com.jt.shop.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.github.jdsjlzx.interfaces.OnRefreshListener;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter;
import com.jt.shop.R;
import com.jt.shop.adapter.HomeListAdapter;
import com.jt.shop.adapter.HomePrototAdapter;
import com.jt.shop.model.GlideImageLoader;
import com.jt.shop.model.api.RetrofitApi;
import com.jt.shop.model.api.RetrofitService;
import com.jt.shop.model.entity.HeaderBean;
import com.jt.shop.model.entity.Listben;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements OnRefreshListener{

    @BindView(R.id.recycler_home)
    LRecyclerView mRecyclerView;
    private Unbinder unbinder;
    private LRecyclerViewAdapter mLRecyclerViewAdapter;
    private List<Listben.DataEntity> dataList;
    private List<HeaderBean.DataEntity.PromoteGoodsEntity> dataPorot;
    private Banner banner;
    private RecyclerView promotRecycler;
    private HomePrototAdapter prototAdapter;
    private Call<HeaderBean> headerCall;
    private Call<Listben> listCall;
    private HomeListAdapter listAdapter;
    private boolean isReshHead = false;
    private boolean isReshList = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(this);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);
        initRecyclerView();
        initHeaderView();
        getDataFromNet();

    }


    /** 初始化头部View */
    private void initHeaderView() {
        //设置轮播图
        //设置banner样式
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
        //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());
        //设置轮播时间
        banner.setDelayTime(3000);
        //设置指示器位置（当banner模式中有指示器时）
        banner.setIndicatorGravity(BannerConfig.CENTER);
        //设置促销商品横向列表
        promotRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        dataPorot = new ArrayList<>();
        prototAdapter = new HomePrototAdapter(this,dataPorot,new int[]{R.layout.item_home_porot});
        promotRecycler.setAdapter(prototAdapter);
    }

    /** 初始化RecyClerView*/
    private void initRecyclerView() {
        //设置数据
        dataList = new ArrayList<>();
        listAdapter = new HomeListAdapter(this,dataList,new int[]{R.layout.item_home_list01,
                R.layout.item_home_list02,R.layout.item_home_list03});
        //设置RecyclerView的样式
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        mLRecyclerViewAdapter = new LRecyclerViewAdapter(listAdapter);
        mRecyclerView.setAdapter(mLRecyclerViewAdapter);
        //设置头部View
        View header = LayoutInflater.from(this).inflate(R.layout.layout_home_header,(ViewGroup)findViewById(android.R.id.content), false);
        banner = (Banner) header.findViewById(R.id.banner);
        promotRecycler = (RecyclerView) header.findViewById(R.id.recycler_home_proto);
        mLRecyclerViewAdapter.addHeaderView(header);
        mRecyclerView.setOnRefreshListener(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
        if(!listCall.isCanceled())listCall.cancel();
        if(!headerCall.isCanceled())headerCall.cancel();
    }

    public void getDataFromNet() {
        //RetrofitApi.getInstance(this)  :可能会造成内存泄漏
        RetrofitService retrofitService =
                RetrofitApi.getInstance(getApplicationContext()).getRetrofitService();
        //获取头部视图数据
        headerCall = retrofitService.getHeaderData("/home/data");
        headerCall.enqueue(new Callback<HeaderBean>() {
            @Override
            public void onResponse(Call<HeaderBean> call, Response<HeaderBean> response) {
                if(response.isSuccessful() && response.code() == 200){//访问成功
                    List<String> imgUrls = new ArrayList<>();
                    HeaderBean headerBean = response.body();
                    //设置轮播图的数据
                    for (int i = 0; i < headerBean.data.player.size(); i++) {
                        imgUrls.add(headerBean.data.player.get(i).photo.url);
                    }
                    banner.setImages(imgUrls);
                    banner.start();
                    if(isReshHead){
                        //设置促销商品数据
                        prototAdapter.updateData(headerBean.data.promote_goods);
                        isReshHead = false;
                        Toast.makeText(MainActivity.this, "数据已刷新", Toast.LENGTH_SHORT).show();
                    }else{
                        //设置促销商品数据
                        prototAdapter.addData(headerBean.data.promote_goods);
                    }

                }
            }

            @Override
            public void onFailure(Call<HeaderBean> call, Throwable t) {
                Toast.makeText(MainActivity.this, "访问失败", Toast.LENGTH_SHORT).show();
            }
        });
        //获取列表数据
        listCall = retrofitService.getListData("/home/category");
        listCall.enqueue(new Callback<Listben>() {
            @Override
            public void onResponse(Call<Listben> call, Response<Listben> response) {
                if(response.isSuccessful() && response.code() == 200){//访问成功
                    Listben listben = response.body();
                    if(isReshList){
                        isReshList = false;
                        listAdapter.updateData(listben.data);
                        mRecyclerView.refreshComplete(0);
                    }else{
                        listAdapter.addData(listben.data);
                    }
                    mLRecyclerViewAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onFailure(Call<Listben> call, Throwable t) {
                Toast.makeText(MainActivity.this, "访问失败", Toast.LENGTH_SHORT).show();

            }
        });

    }

    /** 下拉刷新*/
    @Override
    public void onRefresh() {
        //设置标志位
        isReshHead = true;
        isReshList = true;
        getDataFromNet();
    }
}
