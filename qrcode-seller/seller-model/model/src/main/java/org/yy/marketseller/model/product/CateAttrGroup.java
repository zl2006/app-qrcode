/*
* 文 件 名:  CategoryGroup.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:   类目属性组
* 修 改 人:  zhouliang
* 修改时间:  2015年6月24日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.product;

/**
* 类目属性组
* 
* @author  zhouliang
* @version  [１.０, 2015年6月24日]
* @since  [开店助手-超级营销-实体模块/１.０]
*/
public class CateAttrGroup {
    /**
     * 属性组标识
     */
    private Long categoryAttrGroupID;
    
    /**
     * 产品类目
     */
    private Long categoryID;
    
    /**
     * 属性组名称
     */
    private String attrGroupName;
    
    /**
     * 状态，0为无效，1为有效. 默认为1
     */
    private Integer status = 1;
    
    /**
     * 描述
     */
    private String description;
    
    /**
    * @return 返回 categoryAttrGroupID
    */
    public Long getCategoryAttrGroupID() {
        return categoryAttrGroupID;
    }
    
    /**
    * @param 对categoryAttrGroupID进行赋值
    */
    public void setCategoryAttrGroupID(Long categoryAttrGroupID) {
        this.categoryAttrGroupID = categoryAttrGroupID;
    }
    
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
    * @return 返回 attrGroupName
    */
    public String getAttrGroupName() {
        return attrGroupName;
    }
    
    /**
    * @param 对attrGroupName进行赋值
    */
    public void setAttrGroupName(String attrGroupName) {
        this.attrGroupName = attrGroupName;
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
}
