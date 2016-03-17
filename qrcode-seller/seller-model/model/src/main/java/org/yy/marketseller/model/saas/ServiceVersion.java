/*
* 文 件 名:  ServiceVersion.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  服务版本
* 修 改 人:  zhouliang
* 修改时间:  2015年6月15日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.saas;

import java.util.Date;

/**
* 服务版本,　不同版本有不同功能.　并且与服务定价相关
* 
* @author  zhouliang
* @version  [１.０, 2015年6月15日]
* @since  [开店助手-超级营销-实体模块/１.０]
*/
public class ServiceVersion {
    /**
     * 版本标识
     */
    private Integer versionID;
    
    /**
     * 所属服务
     */
    private Integer defineID;
    
    /**
     * 版本名称
     */
    private String name;
    
    /**
     * 描述
     */
    private String description;
    
    /**
     * 每月价格，单位为元。定义为-1时表示不支持按月购买
     */
    private Integer monthPrice;
    
    /**
     * 每季价格，单位为元。定义为-1时表示不支持按季购买
     */
    private Integer quarterPrice;
    
    /**
     * 每半年价格，单位为元。定义为-1时表示不支持按半年购买
     */
    private Integer halfYearPrice;
    
    /**
     * 每年价格，单位为元。定义为-1时表示不支持按年购买
     */
    private Integer yearPrice;
    
    /**
     * 试用天数，－1时表示不支持试用。最多支持15天试用
     */
    private Integer trialDays;
    
    private Date createTime;
    
    private Date updateTime;
    
    /**
    * @return 返回 versionID
    */
    public Integer getVersionID() {
        return versionID;
    }
    
    /**
    * @param 对versionID进行赋值
    */
    public void setVersionID(Integer versionID) {
        this.versionID = versionID;
    }
    
    /**
    * @return 返回 defineID
    */
    public Integer getDefineID() {
        return defineID;
    }
    
    /**
    * @param 对defineID进行赋值
    */
    public void setDefineID(Integer defineID) {
        this.defineID = defineID;
    }
    
    /**
    * @return 返回 name
    */
    public String getName() {
        return name;
    }
    
    /**
    * @param 对name进行赋值
    */
    public void setName(String name) {
        this.name = name;
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
    * @return 返回 monthPrice
    */
    public Integer getMonthPrice() {
        return monthPrice;
    }
    
    /**
    * @param 对monthPrice进行赋值
    */
    public void setMonthPrice(Integer monthPrice) {
        this.monthPrice = monthPrice;
    }
    
    /**
    * @return 返回 quarterPrice
    */
    public Integer getQuarterPrice() {
        return quarterPrice;
    }
    
    /**
    * @param 对quarterPrice进行赋值
    */
    public void setQuarterPrice(Integer quarterPrice) {
        this.quarterPrice = quarterPrice;
    }
    
    /**
    * @return 返回 halfYearPrice
    */
    public Integer getHalfYearPrice() {
        return halfYearPrice;
    }
    
    /**
    * @param 对halfYearPrice进行赋值
    */
    public void setHalfYearPrice(Integer halfYearPrice) {
        this.halfYearPrice = halfYearPrice;
    }
    
    /**
    * @return 返回 yearPrice
    */
    public Integer getYearPrice() {
        return yearPrice;
    }
    
    /**
    * @param 对yearPrice进行赋值
    */
    public void setYearPrice(Integer yearPrice) {
        this.yearPrice = yearPrice;
    }
    
    /**
    * @return 返回 trialDays
    */
    public Integer getTrialDays() {
        return trialDays;
    }
    
    /**
    * @param 对trialDays进行赋值
    */
    public void setTrialDays(Integer trialDays) {
        this.trialDays = trialDays;
    }
    
}
