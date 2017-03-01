package com.jt.shop.adapter;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.facebook.drawee.view.SimpleDraweeView;

/**
 * 类描述：
 * 作者：郭富东
 * 创建日期： 2017/2/4 0004 下午 2:47
 * 更新日期：
 */
public class BaseViewHolder extends RecyclerView.ViewHolder {

    public View itemView;
    private Context context;

    public BaseViewHolder(View itemView, Context context) {
        super(itemView);
        this.itemView = itemView;
        this.context = context;
    }

    /**
     * 通过id找View
     * @param viewId
     * @param <T>
     * @return
     */
    public <T extends View> T getViewById(@IdRes int viewId){
        return (T) itemView.findViewById(viewId);
    }

    /**
     * 给TextView设置文本
     * @param viewId
     * @param text
     */
    public void setText(@IdRes int viewId,String text){
        TextView tv = getViewById(viewId);
        tv.setText(text);
    }

    /**
     * 设置网络图片（Glide）
     * @param viewId
     * @param url
     */
    public void setImagUrl(@IdRes int viewId,String url){
        ImageView img = getViewById(viewId);
        Glide.with(context).load(url).asBitmap().into(img);
    }

    /**
     * 设置圆形图片 （Fresco）
     * @param viewId
     * @param url
     */
    public void setCircleImgUrl(@IdRes int viewId,String url){
        SimpleDraweeView img = getViewById(viewId);
        img.setImageURI(url);
    }

}
