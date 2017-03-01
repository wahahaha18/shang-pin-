package com.jt.shop.adapter;

import android.content.Context;

import com.jt.shop.R;
import com.jt.shop.model.entity.HeaderBean;

import java.util.List;

/**
 * 类描述：
 * 作者：郭富东
 * 创建日期： 2017/2/4 0004 下午 3:38
 * 更新日期：
 */
public class HomePrototAdapter extends BaseAdapter<HeaderBean.DataEntity.PromoteGoodsEntity>{

    /**
     * @param context
     * @param datas
     * @param layoutIds :item 布局id 支持多种类型
     */
    public HomePrototAdapter(Context context, List<HeaderBean.DataEntity.PromoteGoodsEntity> datas, int[] layoutIds) {
        super(context, datas, layoutIds);
    }

    @Override
    public void setItemData(BaseViewHolder holder, HeaderBean.DataEntity.PromoteGoodsEntity data, int itemType) {
        holder.setCircleImgUrl(R.id.drawee_home_porpt,data.img.thumb);
    }
}
