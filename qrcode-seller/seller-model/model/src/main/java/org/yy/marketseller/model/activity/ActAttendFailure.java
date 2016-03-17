/*
* 文 件 名:  ActAttendFailure.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  活动参与中奖后的发放失败记录
* 修 改 人:  zhouliang
* 修改时间:  2015年6月24日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.activity;

import java.util.Date;

/**
* 活动参与中奖后的发放失败记录
* 
* @author  zhouliang
* @version  [１.０, 2015年6月24日]
* @since     [开店助手-超级营销-实体模块/１.０]
*/
public class ActAttendFailure {
    
    /**
     * 失败ID
     */
    private Integer failureID;
    
    /**
     * 活动ID
     */
    private Long activityID;
    
    /**
     * 活动名称
     */
    private String activityName;
    
    /**
     * 活动参与人
     */
    private String buyerNick;
    
    /**
     * 失败原因
     */
    private String failureReason;
    
    /**
     * 失败次数
     */
    private Integer failureTimes;
    
    /**
     * 失败源
     */
    private Long attendID;
    
    /**
     * 更新时间
     */
    private Date updateTime;
    
    /**
    * @return 返回 failureID
    */
    public Integer getFailureID() {
        return failureID;
    }
    
    /**
    * @param 对failureID进行赋值
    */
    public void setFailureID(Integer failureID) {
        this.failureID = failureID;
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
