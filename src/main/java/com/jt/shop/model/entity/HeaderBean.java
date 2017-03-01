package com.jt.shop.model.entity;

import java.util.List;

/**
 * 类描述：
 * 作者：郭富东
 * 创建日期： 2017/2/4 0004 下午 3:39
 * 更新日期：
 */
public class HeaderBean {


    /**
     * data : {"player":[{"action":"","action_id":0,"description":"","photo":{"small":"http://106.14.32.204/eshop/data/afficheimg/20161201pyadkl.jpg","thumb":"http://106.14.32.204/eshop/data/afficheimg/20161201pyadkl.jpg","url":"http://106.14.32.204/eshop/data/afficheimg/20161201pyadkl.jpg"},"url":"http://"},{"action":"","action_id":0,"description":"","photo":{"small":"http://106.14.32.204/eshop/data/afficheimg/20161201ansxot.jpg","thumb":"http://106.14.32.204/eshop/data/afficheimg/20161201ansxot.jpg","url":"http://106.14.32.204/eshop/data/afficheimg/20161201ansxot.jpg"},"url":"http://"},{"action":"","action_id":0,"description":"","photo":{"small":"http://106.14.32.204/eshop/data/afficheimg/20161201ecmcps.jpg","thumb":"http://106.14.32.204/eshop/data/afficheimg/20161201ecmcps.jpg","url":"http://106.14.32.204/eshop/data/afficheimg/20161201ecmcps.jpg"},"url":"http://"},{"action":"","action_id":0,"description":"","photo":{"small":"http://106.14.32.204/eshop/data/afficheimg/20161201seisfo.jpg","thumb":"http://106.14.32.204/eshop/data/afficheimg/20161201seisfo.jpg","url":"http://106.14.32.204/eshop/data/afficheimg/20161201seisfo.jpg"},"url":"http://"},{"action":"","action_id":0,"description":"","photo":{"small":"http://106.14.32.204/eshop/data/afficheimg/20161201qifytg.jpg","thumb":"http://106.14.32.204/eshop/data/afficheimg/20161201qifytg.jpg","url":"http://106.14.32.204/eshop/data/afficheimg/20161201qifytg.jpg"},"url":"http://"}],"promote_goods":[{"brief":"","id":"77","img":{"small":"http://106.14.32.204/eshop/images/201611/thumb_img/77_thumb_G_1480507560317.jpg","thumb":"http://106.14.32.204/eshop/images/201611/goods_img/77_G_1480507560205.jpg","url":"http://106.14.32.204/eshop/images/201611/source_img/77_G_1479972580628.jpg"},"market_price":"￥175元","name":"静曼儿新款连衣裙针织衫两件套长袖套头半高领毛衣+百褶","promote_price":"￥100元","shop_price":"￥146元"},{"brief":"","id":"76","img":{"small":"http://106.14.32.204/eshop/images/201611/thumb_img/76_thumb_G_1480507560730.jpg","thumb":"http://106.14.32.204/eshop/images/201611/goods_img/76_G_1480507560603.jpg","url":"http://106.14.32.204/eshop/images/201611/source_img/76_G_1479971999537.jpg"},"market_price":"￥247元","name":"cachecache 韩版时尚V领百褶连衣裙","promote_price":"￥158元","shop_price":"￥206元"},{"brief":"","id":"74","img":{"small":"http://106.14.32.204/eshop/images/201611/thumb_img/74_thumb_G_1480507560932.jpg","thumb":"http://106.14.32.204/eshop/images/201611/goods_img/74_G_1480507560471.jpg","url":"http://106.14.32.204/eshop/images/201611/source_img/74_G_1479971689464.jpg"},"market_price":"￥190元","name":"betu百图修身显瘦百褶裙 背心裙 圆领无袖连衣裙","promote_price":"￥120元","shop_price":"￥158元"},{"brief":"","id":"75","img":{"small":"http://106.14.32.204/eshop/images/201611/thumb_img/75_thumb_G_1480507560948.jpg","thumb":"http://106.14.32.204/eshop/images/201611/goods_img/75_G_1480507560921.jpg","url":"http://106.14.32.204/eshop/images/201611/source_img/75_G_1479971816944.jpg"},"market_price":"￥202元","name":"betu百图百褶格子短裙 七分袖荷叶领连衣裙","promote_price":"￥148元","shop_price":"￥168元"}]}
     * status : {"succeed":1}
     */

    public DataEntity data;
    public StatusEntity status;

    public static class DataEntity {
        /**
         * player : [{"action":"","action_id":0,"description":"","photo":{"small":"http://106.14.32.204/eshop/data/afficheimg/20161201pyadkl.jpg","thumb":"http://106.14.32.204/eshop/data/afficheimg/20161201pyadkl.jpg","url":"http://106.14.32.204/eshop/data/afficheimg/20161201pyadkl.jpg"},"url":"http://"},{"action":"","action_id":0,"description":"","photo":{"small":"http://106.14.32.204/eshop/data/afficheimg/20161201ansxot.jpg","thumb":"http://106.14.32.204/eshop/data/afficheimg/20161201ansxot.jpg","url":"http://106.14.32.204/eshop/data/afficheimg/20161201ansxot.jpg"},"url":"http://"},{"action":"","action_id":0,"description":"","photo":{"small":"http://106.14.32.204/eshop/data/afficheimg/20161201ecmcps.jpg","thumb":"http://106.14.32.204/eshop/data/afficheimg/20161201ecmcps.jpg","url":"http://106.14.32.204/eshop/data/afficheimg/20161201ecmcps.jpg"},"url":"http://"},{"action":"","action_id":0,"description":"","photo":{"small":"http://106.14.32.204/eshop/data/afficheimg/20161201seisfo.jpg","thumb":"http://106.14.32.204/eshop/data/afficheimg/20161201seisfo.jpg","url":"http://106.14.32.204/eshop/data/afficheimg/20161201seisfo.jpg"},"url":"http://"},{"action":"","action_id":0,"description":"","photo":{"small":"http://106.14.32.204/eshop/data/afficheimg/20161201qifytg.jpg","thumb":"http://106.14.32.204/eshop/data/afficheimg/20161201qifytg.jpg","url":"http://106.14.32.204/eshop/data/afficheimg/20161201qifytg.jpg"},"url":"http://"}]
         * promote_goods : [{"brief":"","id":"77","img":{"small":"http://106.14.32.204/eshop/images/201611/thumb_img/77_thumb_G_1480507560317.jpg","thumb":"http://106.14.32.204/eshop/images/201611/goods_img/77_G_1480507560205.jpg","url":"http://106.14.32.204/eshop/images/201611/source_img/77_G_1479972580628.jpg"},"market_price":"￥175元","name":"静曼儿新款连衣裙针织衫两件套长袖套头半高领毛衣+百褶","promote_price":"￥100元","shop_price":"￥146元"},{"brief":"","id":"76","img":{"small":"http://106.14.32.204/eshop/images/201611/thumb_img/76_thumb_G_1480507560730.jpg","thumb":"http://106.14.32.204/eshop/images/201611/goods_img/76_G_1480507560603.jpg","url":"http://106.14.32.204/eshop/images/201611/source_img/76_G_1479971999537.jpg"},"market_price":"￥247元","name":"cachecache 韩版时尚V领百褶连衣裙","promote_price":"￥158元","shop_price":"￥206元"},{"brief":"","id":"74","img":{"small":"http://106.14.32.204/eshop/images/201611/thumb_img/74_thumb_G_1480507560932.jpg","thumb":"http://106.14.32.204/eshop/images/201611/goods_img/74_G_1480507560471.jpg","url":"http://106.14.32.204/eshop/images/201611/source_img/74_G_1479971689464.jpg"},"market_price":"￥190元","name":"betu百图修身显瘦百褶裙 背心裙 圆领无袖连衣裙","promote_price":"￥120元","shop_price":"￥158元"},{"brief":"","id":"75","img":{"small":"http://106.14.32.204/eshop/images/201611/thumb_img/75_thumb_G_1480507560948.jpg","thumb":"http://106.14.32.204/eshop/images/201611/goods_img/75_G_1480507560921.jpg","url":"http://106.14.32.204/eshop/images/201611/source_img/75_G_1479971816944.jpg"},"market_price":"￥202元","name":"betu百图百褶格子短裙 七分袖荷叶领连衣裙","promote_price":"￥148元","shop_price":"￥168元"}]
         */

        public List<PlayerEntity> player;
        public List<PromoteGoodsEntity> promote_goods;

        public static class PlayerEntity {
            /**
             * action :
             * action_id : 0
             * description :
             * photo : {"small":"http://106.14.32.204/eshop/data/afficheimg/20161201pyadkl.jpg","thumb":"http://106.14.32.204/eshop/data/afficheimg/20161201pyadkl.jpg","url":"http://106.14.32.204/eshop/data/afficheimg/20161201pyadkl.jpg"}
             * url : http://
             */

            public String action;
            public int action_id;
            public String description;
            public PhotoEntity photo;
            public String url;

            public static class PhotoEntity {
                /**
                 * small : http://106.14.32.204/eshop/data/afficheimg/20161201pyadkl.jpg
                 * thumb : http://106.14.32.204/eshop/data/afficheimg/20161201pyadkl.jpg
                 * url : http://106.14.32.204/eshop/data/afficheimg/20161201pyadkl.jpg
                 */

                public String small;
                public String thumb;
                public String url;
            }
        }

        public static class PromoteGoodsEntity {
            /**
             * brief :
             * id : 77
             * img : {"small":"http://106.14.32.204/eshop/images/201611/thumb_img/77_thumb_G_1480507560317.jpg","thumb":"http://106.14.32.204/eshop/images/201611/goods_img/77_G_1480507560205.jpg","url":"http://106.14.32.204/eshop/images/201611/source_img/77_G_1479972580628.jpg"}
             * market_price : ￥175元
             * name : 静曼儿新款连衣裙针织衫两件套长袖套头半高领毛衣+百褶
             * promote_price : ￥100元
             * shop_price : ￥146元
             */

            public String brief;
            public String id;
            public ImgEntity img;
            public String market_price;
            public String name;
            public String promote_price;
            public String shop_price;

            public static class ImgEntity {
                /**
                 * small : http://106.14.32.204/eshop/images/201611/thumb_img/77_thumb_G_1480507560317.jpg
                 * thumb : http://106.14.32.204/eshop/images/201611/goods_img/77_G_1480507560205.jpg
                 * url : http://106.14.32.204/eshop/images/201611/source_img/77_G_1479972580628.jpg
                 */

                public String small;
                public String thumb;
                public String url;
            }
        }
    }

    public static class StatusEntity {
        /**
         * succeed : 1
         */

        public int succeed;
    }
}
