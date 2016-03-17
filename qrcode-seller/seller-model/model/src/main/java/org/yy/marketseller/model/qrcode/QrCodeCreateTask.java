/*
* 文 件 名:  QrCodeCreateTask.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  批量生成码的任务
* 修 改 人:  zhouliang
* 修改时间:  2015年6月24日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.qrcode;

import java.util.Date;

/**
* 批量生成码的任务
* 
* @author  zhouliang
* @version  [１.０, 2015年6月24日]
* @since  [开店助手-超级营销-实体模块/１.０]
*/
public class QrCodeCreateTask {
    /**
     * 二维码创建任务ID
     */
    private Long createQrID;
    
    /**
     * 批次ID
     */
    private Long batchID;
    
    /**
     * 产品信息。格式如[{productID:产品id,num:产品数量},{productID:产品id,num:产品数量}]\n空时表示码与物品没有关联。
     */
    private String products;
    
    /**
     * 已生成码数量
     */
    private Integer makeNum;
    
    /**
     * 开始生成时间
     */
    private Date startTime;
    
    /**
     * 生成完成时间
     */
    private Date finishTime;
    
    /**
     * 码生成状态：0表示未开始，1表示进行中，2表示生成成功，4表示生成失败
     */
    private Integer status;
    
    /**
     * 码文件下载URL
     */
    private String downloadUrl;
    
    /**
     * 最后下载时间
     */
    private Date downloadTime;
    
    /**
    * @return 返回 createQrID
    */
    public Long getCreateQrID() {
        return createQrID;
    }
    
    /**
    * @param 对createQrID进行赋值
    */
    public void setCreateQrID(Long createQrID) {
        this.createQrID = createQrID;
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
    * @return 返回 products
    */
    public String getProducts() {
        return products;
    }
    
    /**
    * @param 对products进行赋值
    */
    public void setProducts(String products) {
        this.products = products;
    }
    
    /**
    * @return 返回 makeNum
    */
    public Integer getMakeNum() {
        return makeNum;
    }
    
    /**
    * @param 对makeNum进行赋值
    */
    public void setMakeNum(Integer makeNum) {
        this.makeNum = makeNum;
    }
    
    /**
    * @return 返回 startTime
    */
    public Date getStartTime() {
        return startTime;
    }
    
    /**
    * @param 对startTime进行赋值
    */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    
    /**
    * @return 返回 finishTime
    */
    public Date getFinishTime() {
        return finishTime;
    }
    
    /**
    * @param 对finishTime进行赋值
    */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
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
    * @return 返回 downloadUrl
    */
    public String getDownloadUrl() {
        return downloadUrl;
    }
    
    /**
    * @param 对downloadUrl进行赋值
    */
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
    
    /**
    * @return 返回 downloadTime
    */
    public Date getDownloadTime() {
        return downloadTime;
    }
    
    /**
    * @param 对downloadTime进行赋值
    */
    public void setDownloadTime(Date downloadTime) {
        this.downloadTime = downloadTime;
    }
    
}
