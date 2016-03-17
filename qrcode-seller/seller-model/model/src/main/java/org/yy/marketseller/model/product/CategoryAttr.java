/*
* 文 件 名:  CategoryAttr.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  <描述>
* 修 改 人:  zhouliang
* 修改时间:  2015年6月24日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.product;

/**
*类目属性定义
* 
* @author  zhouliang
* @version  [１.０, 2015年6月24日]
* @since  [开店助手-超级营销-实体模块/１.０]
*/
public class CategoryAttr {
    /**
     * 类目属性标识
     */
    private Long categoryAttrID;
    
    /**
     * 属性组
     */
    private Long categoryAttrGroupID;
    
    /**
     * 属性名称(中文)
     */
    private String attrName;
    
    /**
     * 属性名称（英文）
     */
    private String attrEname;
    
    /**
     * 数据类型，1为NUMBER, 2为STRING，3为日期, 4为维度值.默认为字符串
     */
    private String dateType;
    
    /**
     * 是否为SKU属性：0表示否，1表示是。默认为0
     */
    private Integer skuFlg = 0;
    
    /**
     * 是否多值：0为单值，1为多值。默认为0
     */
    private Integer multFlg = 0;
    
    /**
     * 当类型为维度值时，表示方法为{n1: v1, n2: v2, n3 : v3}
     */
    private String multValue;
    
    /**
     * 度量单位，例如内存M，G等
     */
    private String unit;
    
    /**
    * @return 返回 categoryAttrID
    */
    public Long getCategoryAttrID() {
        return categoryAttrID;
    }
    
    /**
    * @param 对categoryAttrID进行赋值
    */
    public void setCategoryAttrID(Long categoryAttrID) {
        this.categoryAttrID = categoryAttrID;
    }
    
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
    * @return 返回 attrName
    */
    public String getAttrName() {
        return attrName;
    }
    
    /**
    * @param 对attrName进行赋值
    */
    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }
    
    /**
    * @return 返回 attrEname
    */
    public String getAttrEname() {
        return attrEname;
    }
    
    /**
    * @param 对attrEname进行赋值
    */
    public void setAttrEname(String attrEname) {
        this.attrEname = attrEname;
    }
    
    /**
    * @return 返回 dateType
    */
    public String getDateType() {
        return dateType;
    }
    
    /**
    * @param 对dateType进行赋值
    */
    public void setDateType(String dateType) {
        this.dateType = dateType;
    }
    
    /**
    * @return 返回 multValue
    */
    public String getMultValue() {
        return multValue;
    }
    
    /**
    * @param 对multValue进行赋值
    */
    public void setMultValue(String multValue) {
        this.multValue = multValue;
    }
    
    /**
    * @return 返回 skuFlg
    */
    public Integer getSkuFlg() {
        return skuFlg;
    }
    
    /**
    * @param 对skuFlg进行赋值
    */
    public void setSkuFlg(Integer skuFlg) {
        this.skuFlg = skuFlg;
    }
    
    /**
    * @return 返回 multFlg
    */
    public Integer getMultFlg() {
        return multFlg;
    }
    
    /**
    * @param 对multFlg进行赋值
    */
    public void setMultFlg(Integer multFlg) {
        this.multFlg = multFlg;
    }
    
    /**
    * @return 返回 unit
    */
    public String getUnit() {
        return unit;
    }
    
    /**
    * @param 对unit进行赋值
    */
    public void setUnit(String unit) {
        this.unit = unit;
    }
    
}
