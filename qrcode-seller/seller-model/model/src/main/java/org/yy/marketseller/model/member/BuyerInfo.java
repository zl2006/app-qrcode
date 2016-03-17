/*
* 文 件 名:  MemberInfo.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  会员信息
* 修 改 人:  zhouliang
* 修改时间:  2015年6月24日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.member;

import java.util.Date;

/**
* 买家会员信息,买家与卖家产生的数据信息
* 
* @author  zhouliang
* @version  [１.０, 2015年6月2９日]
* @since  [开店助手-超级营销-实体模块/１.０]
*/
public class BuyerInfo {
    
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
     * 会员红包总金额
     */
    private Long redEnvelope;
    
    /**
     * 会员集分宝总金额
     */
    private Long SetPoints;
    
    /**
     * 会员总积分(积水）等
     */
    private Long score;
    
    /**
     * 会员彩票总数
     */
    private Long lottery;
    
    /**
     * 会员流量包总额
     */
    private Long packetFlow;
    
    /**
     * 会员优惠券总数
     */
    private Long coupon;
    
    /**
     * 状态，0为无效，1为有效，默认为有效
     */
    private String status;
    
    /**
     * 推荐人
     */
    private String referee;
    
    private String hold1;
    
    private String hold2;
    
    private Date createTime;
    
    private Date updateTime;
    
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
    
    /**
    * @return 返回 redEnvelope
    */
    public Long getRedEnvelope() {
        return redEnvelope;
    }
    
    /**
    * @param 对redEnvelope进行赋值
    */
    public void setRedEnvelope(Long redEnvelope) {
        this.redEnvelope = redEnvelope;
    }
    
    /**
    * @return 返回 setPoints
    */
    public Long getSetPoints() {
        return SetPoints;
    }
    
    /**
    * @param 对setPoints进行赋值
    */
    public void setSetPoints(Long setPoints) {
        SetPoints = setPoints;
    }
    
    /**
    * @return 返回 score
    */
    public Long getScore() {
        return score;
    }
    
    /**
    * @param 对score进行赋值
    */
    public void setScore(Long score) {
        this.score = score;
    }
    
    /**
    * @return 返回 lottery
    */
    public Long getLottery() {
        return lottery;
    }
    
    /**
    * @param 对lottery进行赋值
    */
    public void setLottery(Long lottery) {
        this.lottery = lottery;
    }
    
    /**
    * @return 返回 packetFlow
    */
    public Long getPacketFlow() {
        return packetFlow;
    }
    
    /**
    * @param 对packetFlow进行赋值
    */
    public void setPacketFlow(Long packetFlow) {
        this.packetFlow = packetFlow;
    }
    
    /**
    * @return 返回 coupon
    */
    public Long getCoupon() {
        return coupon;
    }
    
    /**
    * @param 对coupon进行赋值
    */
    public void setCoupon(Long coupon) {
        this.coupon = coupon;
    }
    
    /**
    * @return 返回 status
    */
    public String getStatus() {
        return status;
    }
    
    /**
    * @param 对status进行赋值
    */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
    * @return 返回 referee
    */
    public String getReferee() {
        return referee;
    }
    
    /**
    * @param 对referee进行赋值
    */
    public void setReferee(String referee) {
        this.referee = referee;
    }
    
    /**
    * @return 返回 hold1
    */
    public String getHold1() {
        return hold1;
    }
    
    /**
    * @param 对hold1进行赋值
    */
    public void setHold1(String hold1) {
        this.hold1 = hold1;
    }
    
    /**
    * @return 返回 hold2
    */
    public String getHold2() {
        return hold2;
    }
    
    /**
    * @param 对hold2进行赋值
    */
    public void setHold2(String hold2) {
        this.hold2 = hold2;
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
    
    
    
}
