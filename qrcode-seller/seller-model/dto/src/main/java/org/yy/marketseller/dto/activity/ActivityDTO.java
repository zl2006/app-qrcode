/*
* 文 件 名:  ActivityDTO.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述: 活动查询组合条件
* 修 改 人:  zhouliang
* 修改时间:  2015年8月17日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.dto.activity;

import org.yy.framework.basedata.query.AbstractQueryDto;

/**
* 活动查询组合条件
* 
* @author  zhouliang
* @version  [１.０, 2015年8月10日]
* @since  [开店助手-超级营销-传输对象层/1.0]
*/
public class ActivityDTO extends AbstractQueryDto {
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 9185286935968769312L;
    
    /**
     * 活动名称
     */
    private String activityName;
    
    /**
     * 活动创建人
     */
    private String sellerNick;
    
    /**
     * 状态，0为无效，1为生效
     */
    private Integer status;
    
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
    
}
