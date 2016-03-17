/*
* 文 件 名:  SysCity.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  城市信息
* 修 改 人:  zhouliang
* 修改时间:  2015年8月6日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.system;

/**
* 城市信息
* 
* @author  zhouliang
* @version  [1.0, 2015年5月13日]
* @since  [开店助手-超级营销--模型层/1.0]
*/
public class SysCity {
    
    /**
     * 城市ID
     */
    private Long cityID;
    
    /**
     * 城市编码
     */
    private String cityCode;
    
    /**
     * 城市名称
     */
    private String cityName;
    
    /**
     * 上级城市ID,没有时为－1
     */
    private Long parentCityID;
    
    /**
     * 类型：1为省，2为市，3为县
     */
    private Integer type;
    
    /**
    * @return 返回 cityID
    */
    public Long getCityID() {
        return cityID;
    }
    
    /**
    * @param 对cityID进行赋值
    */
    public void setCityID(Long cityID) {
        this.cityID = cityID;
    }
    
    /**
    * @return 返回 cityCode
    */
    public String getCityCode() {
        return cityCode;
    }
    
    /**
    * @param 对cityCode进行赋值
    */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }
    
    /**
    * @return 返回 cityName
    */
    public String getCityName() {
        return cityName;
    }
    
    /**
    * @param 对cityName进行赋值
    */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    
    /**
    * @return 返回 parentCityID
    */
    public Long getParentCityID() {
        return parentCityID;
    }
    
    /**
    * @param 对parentCityID进行赋值
    */
    public void setParentCityID(Long parentCityID) {
        this.parentCityID = parentCityID;
    }
    
    /**
    * @return 返回 type
    */
    public Integer getType() {
        return type;
    }
    
    /**
    * @param 对type进行赋值
    */
    public void setType(Integer type) {
        this.type = type;
    }
    
}
