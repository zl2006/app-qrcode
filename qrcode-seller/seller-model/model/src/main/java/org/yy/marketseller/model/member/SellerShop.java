/*
* 文 件 名:  SellerShop.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  店铺
* 修 改 人:  zhouliang
* 修改时间:  2015年6月24日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.member;

import java.util.Date;

/**
*店铺
* 
* @author  zhouliang
* @version  [１.０, 2015年6月24日]
* @since  [开店助手-超级营销-实体模块/１.０]
*/
public class SellerShop {
    /**
     * 店铺编号
     */
    private Long sid;
    
    /**
     * 店铺所有者卖家账号
     */
    private String sellerNick;
    
    /**
     * 第三方店铺ID
     */
    private Long shopID;
    
    /**
     * 第三方店铺链接
     */
    private String href;
    
    /**
     * 店铺所在的第三方平台类型,值为本平台：OWNER，淘宝平台：TAOBAO，拍拍：PAIPAI
     */
    private String thirdSystemType;
    
    /**
     * 店铺标题
     */
    private String title;
    
    /**
     * 店标地址
     */
    private String picPath;
    
    /**
     * 开店时间
     */
    private Date createTime;
    
    private Date updateTime;
    
    /**
    * @return 返回 sid
    */
    public Long getSid() {
        return sid;
    }
    
    /**
    * @param 对sid进行赋值
    */
    public void setSid(Long sid) {
        this.sid = sid;
    }
    
    /**
    * @return 返回 sellerNick
    */
    public String getSellerNick() {
        return sellerNick;
    }
    
    /**
    * @param 对sellerNick进行赋值
    */
    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }
    
    /**
    * @return 返回 shopID
    */
    public Long getShopID() {
        return shopID;
    }
    
    /**
    * @param 对shopID进行赋值
    */
    public void setShopID(Long shopID) {
        this.shopID = shopID;
    }
    
    /**
    * @return 返回 href
    */
    public String getHref() {
        return href;
    }
    
    /**
    * @param 对href进行赋值
    */
    public void setHref(String href) {
        this.href = href;
    }
    
    /**
    * @return 返回 thirdSystemType
    */
    public String getThirdSystemType() {
        return thirdSystemType;
    }
    
    /**
    * @param 对thirdSystemType进行赋值
    */
    public void setThirdSystemType(String thirdSystemType) {
        this.thirdSystemType = thirdSystemType;
    }
    
    /**
    * @return 返回 title
    */
    public String getTitle() {
        return title;
    }
    
    /**
    * @param 对title进行赋值
    */
    public void setTitle(String title) {
        this.title = title;
    }
    
    /**
    * @return 返回 picPath
    */
    public String getPicPath() {
        return picPath;
    }
    
    /**
    * @param 对picPath进行赋值
    */
    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }
    
    /**
    * @return 返回 createTime
    */
    public Date getCreateTime() {
        return createTime;
    }
    
    /**
    * @param 对createTime进行赋值
    */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    /**
    * @return 返回 updateTime
    */
    public Date getUpdateTime() {
        return updateTime;
    }
    
    /**
    * @param 对updateTime进行赋值
    */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    
}
