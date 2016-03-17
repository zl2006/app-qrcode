/*
* 文 件 名:  MemberDynamic.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  会员动态
* 修 改 人:  zhouliang
* 修改时间:  2015年6月24日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.member;

import java.util.Date;

/**
* 买家会员动态
* 
* @author  zhouliang
* @version  [１.０, 2015年6月2９日]
* @since  [开店助手-超级营销-实体模块/１.０]
*/
public class BuyerDynamic {
    private Long dynamicID;
    
    /**
     * 会员在哪个卖家上面发生的动态
     */
    private String sellerNick;
    
    /**
     * 买家昵称
     */
    private String buyerNick;
    
    /**
     * 动态描述
     */
    private String description;
    
    private Date createTime;
    
    /**
    * @return 返回 dynamicID
    */
    public Long getDynamicID() {
        return dynamicID;
    }
    
    /**
    * @param 对dynamicID进行赋值
    */
    public void setDynamicID(Long dynamicID) {
        this.dynamicID = dynamicID;
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
    * @return 返回 description
    */
    public String getDescription() {
        return description;
    }
    
    /**
    * @param 对description进行赋值
    */
    public void setDescription(String description) {
        this.description = description;
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
    
}
