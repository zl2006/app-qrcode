/*
* 文 件 名:  ProductExtAttr.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  <描述>
* 修 改 人:  zhouliang
* 修改时间:  2015年6月24日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.product;

/**
* 产品扩展属性值
* 
* @author  zhouliang
* @version  [１.０, 2015年6月24日]
* @since  [开店助手-超级营销-实体模块/１.０]
*/
public class ProductExtAttr {
    private Long prtExtAttrID;
    
    /**
     * 产品
     */
    private Long productID;
    
    /**
     * 属性值，表达方式为属性ID:属性值,  {attr1: v1, attr2:[v2_1,v2_2]}
     */
    private String attrValues;
    
    /**
    * @return 返回 prtExtAttrID
    */
    public Long getPrtExtAttrID() {
        return prtExtAttrID;
    }
    
    /**
    * @param 对prtExtAttrID进行赋值
    */
    public void setPrtExtAttrID(Long prtExtAttrID) {
        this.prtExtAttrID = prtExtAttrID;
    }
    
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
    * @return 返回 attrValues
    */
    public String getAttrValues() {
        return attrValues;
    }
    
    /**
    * @param 对attrValues进行赋值
    */
    public void setAttrValues(String attrValues) {
        this.attrValues = attrValues;
    }
    
}
