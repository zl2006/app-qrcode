/*
* 文 件 名:  ServiceDefine.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  服务定义
* 修 改 人:  zhouliang
* 修改时间:  2015年6月15日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.saas;

import java.util.Date;

/**
* 服务定义,默认服务打开页面为http://context/service/ename
* 
* @author  zhouliang
* @version  [１.０, 2015年6月15日]
* @since  [开店助手-超级营销-实体模块/１.０]
*/
public class ServiceDefine {
    /**
     * 服务定义标识
     */
    private Integer defineID;
    
    /**
     * 服务名称
     */
    private String name;
    
    /**
     * 服务英文名称,　此名称确定了点击服务时的页面
     */
    private String ename;
    
    /**
     * 服务所属类目
     */
    private Integer categoryID;
    
    /**
     * 描述
     */
    private String description;
    
    /**
     * 图标
     */
    private String icon;
    
    /**
     * 服务定义: 0为无效,1为有效
     */
    private Integer status = 1;
    
    private Date createTime;
    
    private Date updateTime;
    
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
    * @return 返回 ename
    */
    public String getEname() {
        return ename;
    }
    
    /**
    * @param 对ename进行赋值
    */
    public void setEname(String ename) {
        this.ename = ename;
    }
    
    /**
    * @return 返回 categoryID
    */
    public Integer getCategoryID() {
        return categoryID;
    }
    
    /**
    * @param 对categoryID进行赋值
    */
    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
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
    * @return 返回 icon
    */
    public String getIcon() {
        return icon;
    }
    
    /**
    * @param 对icon进行赋值
    */
    public void setIcon(String icon) {
        this.icon = icon;
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
    
    public boolean validate() {
        return "1".equals(status);
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
