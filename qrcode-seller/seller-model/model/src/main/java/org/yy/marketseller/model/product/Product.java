/*
* 文 件 名:  Product.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  产品信息，都是本平台自定义的产品信息
* 修 改 人:  zhouliang
* 修改时间:  2015年6月24日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.product;

import java.util.Date;

/**
* 产品信息，都是本平台自定义的产品信息
* 
* @author  zhouliang
* @version  [１.０, 2015年6月24日]
* @since  [开店助手-超级营销-实体模块/１.０]
*/
public class Product {
    /**
     * 产品标识
     */
    private Long productID;
    
    /**
     * 产品类目
     */
    private Long categoryID;
    
    /**
     * 卖家账号
     */
    private String sellerNick;
    
    /**
     * 产品编码
     */
    private String prdCode;
    
    /**
     * 产品名称
     */
    private String name;
    
    /**
     * 品牌
     */
    private String brand;
    
    /**
     * 产品促销标题
     */
    private String title;
    
    /**
     * 产品价格，单位为分
     */
    private Integer price;
    
    /**
     * 是否可以作为礼品发放,1表示可以,0表示不行.默认为0
     */
    private Integer isGift = 0;
    
    /**
     * 产品图像地址
     */
    private String image1Url;
    
    private String image2Url;
    
    private String image3Url;
    
    /**
     * 产品链接
     */
    private String prdUrl;
    
    /**
     * 备注
     */
    private String meto;
    
    /**
     * 状态，0为无效，1为有效。默认为1
     */
    private Integer status = 1;
    
    private Date createTime;
    
    private Date updateTime;
    
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
    * @return 返回 categoryID
    */
    public Long getCategoryID() {
        return categoryID;
    }
    
    /**
    * @param 对categoryID进行赋值
    */
    public void setCategoryID(Long categoryID) {
        this.categoryID = categoryID;
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
    * @return 返回 prdCode
    */
    public String getPrdCode() {
        return prdCode;
    }
    
    /**
    * @param 对prdCode进行赋值
    */
    public void setPrdCode(String prdCode) {
        this.prdCode = prdCode;
    }
    
    /**
    * @return 返回 name
    */
    public String getName() {
        return name;
    }
    
    /**
    * @param 对name进行赋值
    */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
    * @return 返回 brand
    */
    public String getBrand() {
        return brand;
    }
    
    /**
    * @param 对brand进行赋值
    */
    public void setBrand(String brand) {
        this.brand = brand;
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
    * @return 返回 price
    */
    public Integer getPrice() {
        return price;
    }
    
    /**
    * @param 对price进行赋值
    */
    public void setPrice(Integer price) {
        this.price = price;
    }
    
    /**
    * @return 返回 isGift
    */
    public Integer getIsGift() {
        return isGift;
    }
    
    /**
    * @param 对isGift进行赋值
    */
    public void setIsGift(Integer isGift) {
        this.isGift = isGift;
    }
    
    /**
    * @return 返回 image1Url
    */
    public String getImage1Url() {
        return image1Url;
    }
    
    /**
    * @param 对image1Url进行赋值
    */
    public void setImage1Url(String image1Url) {
        this.image1Url = image1Url;
    }
    
    /**
    * @return 返回 image2Url
    */
    public String getImage2Url() {
        return image2Url;
    }
    
    /**
    * @param 对image2Url进行赋值
    */
    public void setImage2Url(String image2Url) {
        this.image2Url = image2Url;
    }
    
    /**
    * @return 返回 image3Url
    */
    public String getImage3Url() {
        return image3Url;
    }
    
    /**
    * @param 对image3Url进行赋值
    */
    public void setImage3Url(String image3Url) {
        this.image3Url = image3Url;
    }
    
    /**
    * @return 返回 prdUrl
    */
    public String getPrdUrl() {
        return prdUrl;
    }
    
    /**
    * @param 对prdUrl进行赋值
    */
    public void setPrdUrl(String prdUrl) {
        this.prdUrl = prdUrl;
    }
    
    /**
    * @return 返回 meto
    */
    public String getMeto() {
        return meto;
    }
    
    /**
    * @param 对meto进行赋值
    */
    public void setMeto(String meto) {
        this.meto = meto;
    }
    
    /**
    * @return 返回 status
    */
    public Integer getStatus() {
        return status;
    }
    
    /**
    * @param 对status进行赋值
    */
    public void setStatus(Integer status) {
        this.status = status;
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
