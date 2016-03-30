/*
* 文 件 名:  ProductDto.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  产品查询条件
* 修 改 人:  zhouliang
* 修改时间:  2016年3月28日
* 修改内容:  <修改内容>
*/
package org.yy.qrcodeseller.dto.product;

import org.yy.framework.basedata.query.AbstractQueryDto;

/**
* 产品查询条件
* 
* @author  zhouliang
* @version  [1.0, 2016年3月28日]
* @since  [qrcodeseller/1.0]
*/
public class ProductDto extends AbstractQueryDto {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -8234931831830069376L;
    
    /**
     * 产品名称
     */
    private String name;
    
    /**
     * 产品编码
     */
    private String prdCode;
    
    /**
     * 产品类目
     */
    private Integer categoryID;
    
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
    * @return 返回 prdCode
    */
    public String getPrdCode() {
        return prdCode;
    }
    
    /**
    * @param 对prdCode进行赋值
    */
    public void setPrdCode(String prdCode) {
        this.prdCode = prdCode;
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
    
}
