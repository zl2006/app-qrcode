/*
* 文 件 名:  Activity.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  活动信息
* 修 改 人:  zhouliang
* 修改时间:  2015年6月24日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.activity;

import java.util.Date;

/**
* 活动信息
* 
* @author  zhouliang
* @version  [１.０, 2015年6月24日]
* @since     [开店助手-超级营销-实体模块/１.０]
*/
public class Activity {
    
    /**
     * 活动ID
     */
    private Long activityID;
    
    /**
     * 奖池ＩＤ
     */
    private Long prizePoolID;
    
    /**
     * 活动名称
     */
    private String activityName;
    
    /**
     * 业务服务,相当于一个业务插件
     */
    private Integer serviceDefineID;
    
    /**
     * 活动创建人
     */
    private String sellerNick;
    
    /**
     * 开始时间
     */
    private Date startTime;
    
    /**
     * 结束时间
     */
    private Date endTime;
    
    /**
     * 会员限制，0表示无限制，1表示会员，2表示非会员
     */
    private String memberLimit;
    
    /**
     * 状态，0为无效，1为生效
     */
    private Integer status;
    
    /**
     * 活动规则：{rule1:v1, rule2:v2}
     */
    private String rules;
    
    private String meto;
    
    private String hold1;
    
    private String hold2;
    
    private Date createTime;
    
    private Date updateTime;
    
    /**
     * 更新人
     */
    private String updatePerson;
    
    /**
     * 是否到期提醒，0为不提醒，1为提醒
     */
    private Integer isExpireRemind;
    
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
    * @return 返回 prizePoolID
    */
    public Long getPrizePoolID() {
        return prizePoolID;
    }
    
    /**
    * @param 对prizePoolID进行赋值
    */
    public void setPrizePoolID(Long prizePoolID) {
        this.prizePoolID = prizePoolID;
    }
    
    /**
    * @return 返回 activityName
    */
    public String getActivityName() {
        return activityName;
    }
    
    /**
    * @param 对activityName进行赋值
    */
    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }
    
    /**
    * @return 返回 serviceDefineID
    */
    public Integer getServiceDefineID() {
        return serviceDefineID;
    }
    
    /**
    * @param 对serviceDefineID进行赋值
    */
    public void setServiceDefineID(Integer serviceDefineID) {
        this.serviceDefineID = serviceDefineID;
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
    * @return 返回 startTime
    */
    public Date getStartTime() {
        return startTime;
    }
    
    /**
    * @param 对startTime进行赋值
    */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    
    /**
    * @return 返回 endTime
    */
    public Date getEndTime() {
        return endTime;
    }
    
    /**
    * @param 对endTime进行赋值
    */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    
    /**
    * @return 返回 memberLimit
    */
    public String getMemberLimit() {
        return memberLimit;
    }
    
    /**
    * @param 对memberLimit进行赋值
    */
    public void setMemberLimit(String memberLimit) {
        this.memberLimit = memberLimit;
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
    * @return 返回 rules
    */
    public String getRules() {
        return rules;
    }
    
    /**
    * @param 对rules进行赋值
    */
    public void setRules(String rules) {
        this.rules = rules;
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
    * @return 返回 updatePerson
    */
    public String getUpdatePerson() {
        return updatePerson;
    }
    
    /**
    * @param 对updatePerson进行赋值
    */
    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson;
    }
    
    /**
    * @return 返回 isExpireRemind
    */
    public Integer getIsExpireRemind() {
        return isExpireRemind;
    }
    
    /**
    * @param 对isExpireRemind进行赋值
    */
    public void setIsExpireRemind(Integer isExpireRemind) {
        this.isExpireRemind = isExpireRemind;
    }
    
}
