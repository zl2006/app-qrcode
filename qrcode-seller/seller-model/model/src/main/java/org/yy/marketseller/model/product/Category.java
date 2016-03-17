/*
* 文 件 名:  Category.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述: 产品类目
* 修 改 人:  zhouliang
* 修改时间:  2015年6月24日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.product;

import java.util.Date;

/**
* 产品类目
* 1,只有页子节点才有属性.
   2,它是由一系列属性组组成, 每个属性组会有多个属性
* 
* @author  zhouliang
* @version  [１.０, 2015年6月24日]
* @since  [开店助手-超级营销-实体模块/１.０]
*/
public class Category {
    /**
     * 产品类目标识
     */
    private Long categoryID;
    
    /**
     * 类目编码, 唯一
     */
    private String categoryCode;
    
    /**
     * 类目名称
     */
    private String name;
    
    /**
     * 父类目, -1表示没有父节点.默认为-1
     */
    private Long parentCategoryID;
    
    /**
     * 是否页子节点，页子节点才有属性信息。\n1为页子节点
     */
    private Integer isLeaf;
    
    /**
     * 状态：0为无效，1为有效，默认为1
     */
    private Integer status = 1;
    
    /**
     * 描述
     */
    private String description;
    
    private String hold1;
    
    private Date createTime;
    
    private Date updateTime;
    
    /**
    * @return 返回 categoryID
    */
    public Long getCategoryID() {
        return categoryID;
    }
    
    /**
    * @param 对categoryID进行赋值
    */
    public void setCategoryID(Long categoryID) {
        this.categoryID = categoryID;
    }
    
    /**
    * @return 返回 categoryCode
    */
    public String getCategoryCode() {
        return categoryCode;
    }
    
    /**
    * @param 对categoryCode进行赋值
    */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
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
    * @return 返回 parentCategoryID
    */
    public Long getParentCategoryID() {
        return parentCategoryID;
    }
    
    /**
    * @param 对parentCategoryID进行赋值
    */
    public void setParentCategoryID(Long parentCategoryID) {
        this.parentCategoryID = parentCategoryID;
    }
    
    /**
    * @return 返回 isLeaf
    */
    public Integer getIsLeaf() {
        return isLeaf;
    }
    
    /**
    * @param 对isLeaf进行赋值
    */
    public void setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf;
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
