/*
* 文 件 名:  ActAttendFailureDTO.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  活动参与失败记录查询
* 修 改 人:  zhouliang
* 修改时间:  2015年8月17日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.dto.activity;

import org.yy.framework.basedata.query.AbstractQueryDto;

/**
*活动参与失败记录查询
* 
* @author  zhouliang
* @version  [１.０, 2015年8月10日]
* @since  [开店助手-超级营销-传输对象层/1.0]
*/
public class ActAttendFailureDTO extends AbstractQueryDto {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 4018575691108158321L;
    
    /**
     * 活动ID
     */
    private Long activityID;
    
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
