/*
* 文 件 名:  CategoryDTO.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  产品类目查询组合条件
* 修 改 人:  zhouliang
* 修改时间:  2015年8月10日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.dto.product;

import org.yy.framework.basedata.query.AbstractQueryDto;

/**
* 产品类目查询组合条件
* 
* @author  zhouliang
* @version  [１.０, 2015年8月10日]
* @since  [开店助手-超级营销-传输对象层/1.0]
*/
public class CategoryDTO extends AbstractQueryDto {
    
     /**
     * 注释内容
     */
    private static final long serialVersionUID = -8205863111578591037L;

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
    
}
