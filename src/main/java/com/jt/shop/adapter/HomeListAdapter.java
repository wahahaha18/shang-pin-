package com.jt.shop.adapter;

import android.content.Context;

import com.jt.shop.R;
import com.jt.shop.model.entity.Listben;

import java.util.List;

/**
 * 类描述：
 * 作者：郭富东
 * 创建日期： 2017/2/4 0004 下午 3:12
 * 更新日期：
 */
public class HomeListAdapter extends BaseAdapter<Listben.DataEntity>{

    /**
     * @param context
     * @param datas
     * @param layoutIds :item 布局id 支持多种类型
     */
    public HomeListAdapter(Context context, List<Listben.DataEntity> datas, int[] layoutIds) {
        super(context, datas, layoutIds);
    }

    @Override
    public void setItemData(BaseViewHolder holder, Listben.DataEntity data, int itemType) {
        holder.setText(R.id.tv_home_list_title,data.name);
        switch (itemType){
            case 0:
                holder.setImagUrl(R.id.img_home_listitem01,data.goods.get(0).img.thumb);
                holder.setImagUrl(R.id.img_home_listitem02,data.goods.get(1).img.thumb);
                holder.setImagUrl(R.id.img_home_listitem03,data.goods.get(2).img.thumb);
                break;
            case 1:
                holder.setImagUrl(R.id.img_home_listitem01,data.goods.get(0).img.thumb);
                holder.setImagUrl(R.id.img_home_listitem02,data.goods.get(1).img.thumb);
                holder.setImagUrl(R.id.img_home_listitem03,data.goods.get(2).img.thumb);
                holder.setImagUrl(R.id.img_home_listitem04,data.goods.get(3).img.thumb);
                break;
            case 2:
                holder.setImagUrl(R.id.img_home_listitem01,data.goods.get(0).img.thumb);
                holder.setImagUrl(R.id.img_home_listitem02,data.goods.get(1).img.thumb);
                holder.setImagUrl(R.id.img_home_listitem03,data.goods.get(2).img.thumb);
                holder.setImagUrl(R.id.img_home_listitem04,data.goods.get(3).img.thumb);
                holder.setImagUrl(R.id.img_home_listitem05,data.goods.get(4).img.thumb);
                break;
        }

    }
}
