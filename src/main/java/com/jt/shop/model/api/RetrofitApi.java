package com.jt.shop.model.api;

import android.content.Context;

import java.io.File;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 类描述：
 * 作者：郭富东
 * 创建日期： 2017/2/4 0004 下午 3:54
 * 更新日期：
 */
public class RetrofitApi {

    private static final String BASE_URL = "http://106.14.32.204/eshop/";
    private static RetrofitApi instance;
    private Context context;
    private RetrofitService retrofitService;

    private RetrofitApi(Context context) {
        this.context = context;
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        //设置缓存
        File cacheFile = new File(context.getCacheDir(), "cache");
        Cache cache = new Cache(cacheFile, 10 * 1024 * 1024);//最大缓存10M
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor).cache(cache).build();
        Retrofit retrofit = new Retrofit.Builder()
                .client(client).baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build();
        retrofitService = retrofit.create(RetrofitService.class);

    }

    /**
     * 获取RetrofitApi的实例，线程安全
     *
     * @return :实例
     */
    public static RetrofitApi getInstance(Context context) {
        if (instance == null) {
            //同步，线程安全
            synchronized (RetrofitApi.class) {
                if (instance == null) {
                    instance = new RetrofitApi(context);
                }
            }
        }
        return instance;
    }

    public RetrofitService getRetrofitService() {
        return retrofitService;
    }

}
