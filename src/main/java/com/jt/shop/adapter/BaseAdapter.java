package com.jt.shop.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * 类描述：
 * 作者：郭富东
 * 创建日期： 2017/2/4 0004 下午 2:46
 * 更新日期：
 */
public abstract class BaseAdapter<T> extends RecyclerView.Adapter<BaseViewHolder> {

    private final Context context;
    private final List<T> datas;
    private final int[] layoutIds;
    private OnItemClickListener listener;

    /**
     * @param context
     * @param datas
     * @param layoutIds :item 布局id 支持多种类型
     */
    public BaseAdapter(Context context, List<T> datas, int[] layoutIds) {
        this.context = context;
        this.datas = datas;
        this.layoutIds = layoutIds;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(layoutIds[viewType],parent,false);
        BaseViewHolder holder = new BaseViewHolder(itemView,context);
        return holder;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, final int position) {
        setItemData(holder,datas.get(position),getItemViewType(position));
        //设置点击监听
        if(listener != null){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClick(view,position);
                }
            });
        }


    }

    @Override
    public int getItemCount() {
        return datas == null ? 0 : datas.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position % layoutIds.length;
    }

    /**
     * 设置item数据
     * @param holder
     * @param data
     * @param itemType ：item对应的数据类型
     */
    public abstract void setItemData(BaseViewHolder holder,T data,int itemType);

    /** item点击监听接口 */
    public interface OnItemClickListener{

        /**
         * @param view
         * @param position
         */
        void onItemClick(View view,int position);
    }

    /**
     * 设置item点击监听
     * @param listener
     */
    public void setOnItemClickListener(OnItemClickListener listener){
        this.listener = listener;
    }


    /**
     * 添加数据
     * @param data
     */
    public void addData(List<T> data){
        datas.addAll(data);
        notifyDataSetChanged();
    }

    /**
     * 更新数据
     * @param data
     */
    public void updateData(List<T> data){
        datas.clear();
        datas.addAll(data);
        notifyDataSetChanged();
    }
}
