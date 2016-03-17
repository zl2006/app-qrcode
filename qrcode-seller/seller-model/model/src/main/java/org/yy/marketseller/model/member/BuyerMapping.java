/*
* 文 件 名:  BuyerMapping.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述: 　买家在各平台的映射信息
* 修 改 人:  zhouliang
* 修改时间:  2015年6月24日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.member;

import java.util.Date;

/**
* 买家在各平台的映射信息
* 
* @author  zhouliang
* @version  [１.０, 2015年6月2９日]
* @since  [开店助手-超级营销-实体模块/１.０]
*/
public class BuyerMapping {
    private Long mappingID;
    
    /**
     * 统一平台的买家昵称
     */
    private String buyerNick;
    
    /**
     * 第三方平台的卖家昵称
     */
    private String thirdSellerNick;
    
    /**
     * 映射的第三平台
     */
    private String thirdSystemType;
    
    /**
     * 映射的第三方平台买家ＩＤ
     */
    private Long thirdBuyerID;
    
    /**
     * 映射的第三方平台买家昵称
     */
    private String thirdBuyerNick;
    
    private Date createTime;
    
    private Date updateTime;
    
    /**
    * @return 返回 mappingID
    */
    public Long getMappingID() {
        return mappingID;
    }
    
    /**
    * @param 对mappingID进行赋值
    */
    public void setMappingID(Long mappingID) {
        this.mappingID = mappingID;
    }
    
    /**
    * @return 返回 buyerNick
    */
    public String getBuyerNick() {
        return buyerNick;
    }
    
    /**
    * @param 对buyerNick进行赋值
    */
    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }
    
    /**
    * @return 返回 thirdSellerNick
    */
    public String getThirdSellerNick() {
        return thirdSellerNick;
    }
    
    /**
    * @param 对thirdSellerNick进行赋值
    */
    public void setThirdSellerNick(String thirdSellerNick) {
        this.thirdSellerNick = thirdSellerNick;
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
    * @return 返回 thirdBuyerID
    */
    public Long getThirdBuyerID() {
        return thirdBuyerID;
    }
    
    /**
    * @param 对thirdBuyerID进行赋值
    */
    public void setThirdBuyerID(Long thirdBuyerID) {
        this.thirdBuyerID = thirdBuyerID;
    }
    
    /**
    * @return 返回 thirdBuyerNick
    */
    public String getThirdBuyerNick() {
        return thirdBuyerNick;
    }
    
    /**
    * @param 对thirdBuyerNick进行赋值
    */
    public void setThirdBuyerNick(String thirdBuyerNick) {
        this.thirdBuyerNick = thirdBuyerNick;
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
