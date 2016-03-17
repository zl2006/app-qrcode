/*
* 文 件 名:  BatchProduct.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  批次对应的产品
* 修 改 人:  zhouliang
* 修改时间:  2015年6月24日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.qrcode;

/**
* 批次对应的产品
* 
* @author  zhouliang
* @version  [１.０, 2015年6月24日]
* @since  [开店助手-超级营销-实体模块/１.０]
*/
public class BatchProduct {
    private Long batchPrdID;
    
    /**
     * 批次ID
     */
    private Long batchID;
    
    /**
     * 产品ID
     */
    private Long productID;
    
    /**
     * 产品来源，OWNER：本平台  TAOBAO：淘宝
     */
    private String productSrc;
    
    /**
     * 码数量'
     */
    private Integer qrcodeNum;
    
    /**
    * @return 返回 batchPrdID
    */
    public Long getBatchPrdID() {
        return batchPrdID;
    }
    
    /**
    * @param 对batchPrdID进行赋值
    */
    public void setBatchPrdID(Long batchPrdID) {
        this.batchPrdID = batchPrdID;
    }
    
    /**
    * @return 返回 batchID
    */
    public Long getBatchID() {
        return batchID;
    }
    
    /**
    * @param 对batchID进行赋值
    */
    public void setBatchID(Long batchID) {
        this.batchID = batchID;
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
    * @return 返回 productSrc
    */
    public String getProductSrc() {
        return productSrc;
    }
    
    /**
    * @param 对productSrc进行赋值
    */
    public void setProductSrc(String productSrc) {
        this.productSrc = productSrc;
    }
    
    /**
    * @return 返回 qrcodeNum
    */
    public Integer getQrcodeNum() {
        return qrcodeNum;
    }
    
    /**
    * @param 对qrcodeNum进行赋值
    */
    public void setQrcodeNum(Integer qrcodeNum) {
        this.qrcodeNum = qrcodeNum;
    }
    
}
