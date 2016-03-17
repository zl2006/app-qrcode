/*
* 文 件 名:  ActTimes.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述: 允许买家参与活动的次数
* 修 改 人:  zhouliang
* 修改时间:  2015年6月24日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.activity;

import java.util.Date;

/**
* 允许买家参与活动的次数
* 
* @author  zhouliang
* @version  [１.０, 2015年6月24日]
* @since     [开店助手-超级营销-实体模块/１.０]
*/
public class ActTimes {
    
    private Integer timesID;
    
    /**
     * 活动ＩＤ
     */
    private Long activityID;
    
    /**
     * 买家昵称
     */
    private String buyerNick;
    
    /**
     * 买家参与活动允许的次数
     */
    private Integer times;
    
    /**
     * 次数限制规则：0表示总次数，1表示每天次数。
     */
    private Integer limitType;
    
    private Date createTime;
    
    private Date updateTime;
    
    /**
    * @return 返回 timesID
    */
    public Integer getTimesID() {
        return timesID;
    }
    
    /**
    * @param 对timesID进行赋值
    */
    public void setTimesID(Integer timesID) {
        this.timesID = timesID;
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
    * @return 返回 times
    */
    public Integer getTimes() {
        return times;
    }
    
    /**
    * @param 对times进行赋值
    */
    public void setTimes(Integer times) {
        this.times = times;
    }

    /**
    * @return 返回 limitType
    */
    public Integer getLimitType() {
        return limitType;
    }

    /**
    * @param 对limitType进行赋值
    */
    public void setLimitType(Integer limitType) {
        this.limitType = limitType;
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
