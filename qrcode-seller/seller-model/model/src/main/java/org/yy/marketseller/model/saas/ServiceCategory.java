/*
* 文 件 名:  ServiceCategory.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  服务类目
* 修 改 人:  zhouliang
* 修改时间:  2015年6月15日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.saas;

import java.util.Date;

/**
* 服务类目
* 
* @author  zhouliang
* @version  [１.０, 2015年6月15日]
* @since  [开店助手-超级营销-实体模块/１.０]
*/
public class ServiceCategory {
    
    /**
     * 服务类目标识
     */
    private Integer categoryID;
    
    /**
     * 父类目标识, 顶级类目值为-1. 默认为-1
     */
    private Integer parentID = -1;
    
    /**
     * 服务类目名称
     */
    private String name;
    
    /**
     * 类目图标
     */
    private String icon;
    
    /**
     * 状态,0为无效,1为有效
     */
    private String status;
    
    /**
     * 类目描述
     */
    private String description;
    
    private Date createTime;
    
    private Date updateTime;
    
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
    * @return 返回 parentID
    */
    public Integer getParentID() {
        return parentID;
    }
    
    /**
    * @param 对parentID进行赋值
    */
    public void setParentID(Integer parentID) {
        this.parentID = parentID;
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
    public String getStatus() {
        return status;
    }
    
    /**
    * @param 对status进行赋值
    */
    public void setStatus(String status) {
        this.status = status;
    }
    
    public boolean validate() {
        return "1".equals(status);
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
    
}
