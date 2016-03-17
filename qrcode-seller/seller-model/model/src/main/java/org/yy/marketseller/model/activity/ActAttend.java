/*
* 文 件 名:  ActAttend.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述: 活动参与记录
* 修 改 人:  zhouliang
* 修改时间:  2015年6月24日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.activity;

import java.util.Date;

/**
* 活动参与记录
* 
* @author  zhouliang
* @version  [１.０, 2015年6月24日]
* @since     [开店助手-超级营销-实体模块/１.０]
*/
public class ActAttend {
    /**
     * 参与活动记录ID
     */
    private Long attendID;
    
    /**
     * 活动参与人
     */
    private String buyerNick;
    
    /**
     * 活动ID
     */
    private Long activityID;
    
    /**
     * 参加活动时间
     */
    private Date attendTime;
    
    /**
     * 是否中奖，0:未中奖，1：中奖
     */
    private Integer isWin;
    
    /**
     * 是否派奖，0为没有，1为有
     */
    private Integer isAward;
    
    /**
     * 奖品类型
     */
    private String prizeTypeCode;
    
    /**
     * 获取的奖项，参见TB_ACT_PRIZEITEM表
     */
    private Long prizeItemID;
    
    /**
     * 奖品数量
     */
    private Integer awardNum;
    
    /**
     * 用户中奖后的回填信息: {name:"", address:"",mobile:""},可以自己填加
     */
    private String backFill;
    
    /**参数可以定义为：奖品类型，金额，码串等*/
    /**
     * 参数一
     */
    private String param1;
    
    /**
     * 参数二
     */
    private String param2;
    
    /**
     * 参数三
     */
    private String param3;
    
    private String hold1;
    
    private String hold2;
    
    private String hold3;
    
    /**
     * 备注
     */
    private String meto;
    
    /**
     * 码串或参与依据
     */
    private String keyword;
    
    /**
     * 处理失败次数
     */
    private Integer failureTimes;
    
    /**
     * 失败原因
     */
    private String failureReason;
    
    private Date createTime;
    
    private Date updateTime;
    
    /**
    * @return 返回 attendID
    */
    public Long getAttendID() {
        return attendID;
    }
    
    /**
    * @param 对attendID进行赋值
    */
    public void setAttendID(Long attendID) {
        this.attendID = attendID;
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
    
    /**
    * @return 返回 attendTime
    */
    public Date getAttendTime() {
        return attendTime;
    }
    
    /**
    * @param 对attendTime进行赋值
    */
    public void setAttendTime(Date attendTime) {
        this.attendTime = attendTime;
    }
    
    /**
    * @return 返回 isWin
    */
    public Integer getIsWin() {
        return isWin;
    }
    
    /**
    * @param 对isWin进行赋值
    */
    public void setIsWin(Integer isWin) {
        this.isWin = isWin;
    }
    
    /**
    * @return 返回 prizeItemID
    */
    public Long getPrizeItemID() {
        return prizeItemID;
    }
    
    /**
    * @param 对prizeItemID进行赋值
    */
    public void setPrizeItemID(Long prizeItemID) {
        this.prizeItemID = prizeItemID;
    }
    
    /**
    * @return 返回 awardNum
    */
    public Integer getAwardNum() {
        return awardNum;
    }
    
    /**
    * @param 对awardNum进行赋值
    */
    public void setAwardNum(Integer awardNum) {
        this.awardNum = awardNum;
    }
    
    /**
    * @return 返回 backFill
    */
    public String getBackFill() {
        return backFill;
    }
    
    /**
    * @param 对backFill进行赋值
    */
    public void setBackFill(String backFill) {
        this.backFill = backFill;
    }
    
    /**
    * @return 返回 param1
    */
    public String getParam1() {
        return param1;
    }
    
    /**
    * @param 对param1进行赋值
    */
    public void setParam1(String param1) {
        this.param1 = param1;
    }
    
    /**
    * @return 返回 param2
    */
    public String getParam2() {
        return param2;
    }
    
    /**
    * @param 对param2进行赋值
    */
    public void setParam2(String param2) {
        this.param2 = param2;
    }
    
    /**
    * @return 返回 param3
    */
    public String getParam3() {
        return param3;
    }
    
    /**
    * @param 对param3进行赋值
    */
    public void setParam3(String param3) {
        this.param3 = param3;
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
    * @return 返回 hold3
    */
    public String getHold3() {
        return hold3;
    }
    
    /**
    * @param 对hold3进行赋值
    */
    public void setHold3(String hold3) {
        this.hold3 = hold3;
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
    * @return 返回 isAward
    */
    public Integer getIsAward() {
        return isAward;
    }
    
    /**
    * @param 对isAward进行赋值
    */
    public void setIsAward(Integer isAward) {
        this.isAward = isAward;
    }
    
    /**
    * @return 返回 prizeTypeCode
    */
    public String getPrizeTypeCode() {
        return prizeTypeCode;
    }
    
    /**
    * @param 对prizeTypeCode进行赋值
    */
    public void setPrizeTypeCode(String prizeTypeCode) {
        this.prizeTypeCode = prizeTypeCode;
    }
    
    /**
    * @return 返回 keyword
    */
    public String getKeyword() {
        return keyword;
    }
    
    /**
    * @param 对keyword进行赋值
    */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
    
    /**
    * @return 返回 failureTimes
    */
    public Integer getFailureTimes() {
        return failureTimes;
    }
    
    /**
    * @param 对failureTimes进行赋值
    */
    public void setFailureTimes(Integer failureTimes) {
        this.failureTimes = failureTimes;
    }
    
    /**
    * @return 返回 failureReason
    */
    public String getFailureReason() {
        return failureReason;
    }
    
    /**
    * @param 对failureReason进行赋值
    */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
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
