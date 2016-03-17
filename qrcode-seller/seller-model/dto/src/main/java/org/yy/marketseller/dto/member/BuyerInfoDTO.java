/*
* 文 件 名:  BuyerDTO.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:   买家查询组合条件
* 修 改 人:  zhouliang
* 修改时间:  2015年8月27日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.dto.member;

import org.yy.framework.basedata.query.AbstractQueryDto;

/**
* 买家查询组合条件
* 
* @author  zhouliang
* @version  [１.０, 2015年8月27日]
* @since  [开店助手-超级营销-传输对象层/1.0]
*/
public class BuyerInfoDTO extends AbstractQueryDto {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -5445442266810083091L;
    
    private Integer memberInfoID;
    
    /**
     * 会员卡
     */
    private String memberCard;
    
    /**
     * 买家昵称
     */
    private String buyerNick;
    
    /**
     * 卖家昵称
     */
    private String sellerNick;
    
    /**
    * @return 返回 memberInfoID
    */
    public Integer getMemberInfoID() {
        return memberInfoID;
    }
    
    /**
    * @param 对memberInfoID进行赋值
    */
    public void setMemberInfoID(Integer memberInfoID) {
        this.memberInfoID = memberInfoID;
    }
    
    /**
    * @return 返回 memberCard
    */
    public String getMemberCard() {
        return memberCard;
    }
    
    /**
    * @param 对memberCard进行赋值
    */
    public void setMemberCard(String memberCard) {
        this.memberCard = memberCard;
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
    
}
