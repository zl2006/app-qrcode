/*
* 文 件 名:  ActProducts.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  参与扫码活动的产品
* 修 改 人:  zhouliang
* 修改时间:  2015年6月24日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.activity;

/**
* 参与扫码活动的产品
* 
* @author  zhouliang
* @version  [１.０, 2015年6月24日]
* @since     [开店助手-超级营销-实体模块/１.０]
*/
public class ActProducts {
    private Long actProductsID;
    
    /**
     * 产品ID
     */
    private Long productID;
    
    /**
     * 产品来源，OWNER：本平台  TAOBAO：淘宝，JD：京东
     */
    private String productSrc;
    
    /**
     * 活动ID
     */
    private Long activityID;
    
    /**
    * @return 返回 actProductsID
    */
    public Long getActProductsID() {
        return actProductsID;
    }
    
    /**
    * @param 对actProductsID进行赋值
    */
    public void setActProductsID(Long actProductsID) {
        this.actProductsID = actProductsID;
    }
    
    /**
    * @return 返回 productID
    */
    public Long getProductID() {
        return productID;
    }
    
    /**
    * @param 对productID进行赋值
    */
    public void setProductID(Long productID) {
        this.productID = productID;
    }
    
    /**
    * @return 返回 productSrc
    */
    public String getProductSrc() {
        return productSrc;
    }
    
    /**
    * @param 对productSrc进行赋值
    */
    public void setProductSrc(String productSrc) {
        this.productSrc = productSrc;
    }
    
    /**
    * @return 返回 activityID
    */
    public Long getActivityID() {
        return activityID;
    }
    
    /**
    * @param 对activityID进行赋值
    */
    public void setActivityID(Long activityID) {
        this.activityID = activityID;
    }
    
}
