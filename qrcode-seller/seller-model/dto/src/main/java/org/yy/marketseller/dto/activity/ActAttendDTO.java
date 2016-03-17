/*
* 文 件 名:  ActAttendDTO.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  <描述>
* 修 改 人:  zhouliang
* 修改时间:  2015年8月17日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.dto.activity;

import org.yy.framework.basedata.query.AbstractQueryDto;

/**
*活动参数记录查询组合条件
* 
* @author  zhouliang
* @version  [１.０, 2015年8月10日]
* @since  [开店助手-超级营销-传输对象层/1.0]
*/
public class ActAttendDTO extends AbstractQueryDto {
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -3073708050586217359L;
    
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
    
}
