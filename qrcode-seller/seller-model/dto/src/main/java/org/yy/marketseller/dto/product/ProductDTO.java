/*
* 文 件 名:  ProductDTO.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  产品查询DTO
* 修 改 人:  zhouliang
* 修改时间:  2015年8月11日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.dto.product;

import org.yy.framework.basedata.query.AbstractQueryDto;

/**
* 产品查询DTO
* 
* @author  zhouliang
* @version  [１.０, 2015年8月11日]
* @since  [开店助手-超级营销-传输对象层/1.0]
*/
public class ProductDTO extends AbstractQueryDto {
     /**
     * 注释内容
     */
    private static final long serialVersionUID = -1922354573802140993L;

    /**
     * 产品标识
     */
    private Long productID;
    
    /**
     * 产品编码
     */
    private String prdCode;
    
    /**
     * 产品名称
     */
    private String name;
    
    /**
     * 产品类目
     */
    private Long categoryID;
    
    /**
    * @return 返回 productID
    */
    public Long getProductID() {
        return productID;
    }
    
    /**
    * @param 对productID进行赋值
    */
    public void setProductID(Long productID) {
        this.productID = productID;
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
    
}
