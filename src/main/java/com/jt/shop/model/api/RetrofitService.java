package com.jt.shop.model.api;

import com.jt.shop.model.entity.HeaderBean;
import com.jt.shop.model.entity.Listben;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 类描述：
 * 作者：郭富东
 * 创建日期： 2017/2/4 0004 下午 4:01
 * 更新日期：
 */
public interface RetrofitService {

    //emobile/?url=/home/category
    @GET("emobile/")
    Call<Listben> getListData(@Query("url") String url);

    @GET("emobile/")
    Call<HeaderBean> getHeaderData(@Query("url") String url);
}
