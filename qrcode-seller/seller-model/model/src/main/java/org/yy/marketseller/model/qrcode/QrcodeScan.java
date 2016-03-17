/*
* 文 件 名:  QrcodeScan.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  <描述>
* 修 改 人:  zhouliang
* 修改时间:  2015年6月24日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.qrcode;

import java.util.Date;

/**
* 扫码记录
* 
* @author  zhouliang
* @version  [１.０, 2015年6月24日]
* @since  [开店助手-超级营销-实体模块/１.０]
*/
public class QrcodeScan {
    /**
     * 扫码记录标识
     */
    private Integer recordID;
    
    /**
     * 扫码人
     */
    private String buyerNick;
    
    /**
     * 扫码时间
     */
    private Date scanTime;
    
    /**
     * 码ID,无效码时为-1
     */
    private Long qrcodeID;
    
    /**
     * 码串
     */
    private String qrcode;
    
    /**
     * 状态：1有效扫码，2重复扫码，3无效码
     */
    private String status;
    
    /**
    * @return 返回 recordID
    */
    public Integer getRecordID() {
        return recordID;
    }
    
    /**
    * @param 对recordID进行赋值
    */
    public void setRecordID(Integer recordID) {
        this.recordID = recordID;
    }
    
    /**
    * @return 返回 buyerNick
    */
    public String getBuyerNick() {
        return buyerNick;
    }
    
    /**
    * @param 对buyerNick进行赋值
    */
    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }
    
    /**
    * @return 返回 scanTime
    */
    public Date getScanTime() {
        return scanTime;
    }
    
    /**
    * @param 对scanTime进行赋值
    */
    public void setScanTime(Date scanTime) {
        this.scanTime = scanTime;
    }
    
    /**
    * @return 返回 qrcodeID
    */
    public Long getQrcodeID() {
        return qrcodeID;
    }
    
    /**
    * @param 对qrcodeID进行赋值
    */
    public void setQrcodeID(Long qrcodeID) {
        this.qrcodeID = qrcodeID;
    }
    
    /**
    * @return 返回 qrcode
    */
    public String getQrcode() {
        return qrcode;
    }
    
    /**
    * @param 对qrcode进行赋值
    */
    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
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
    
}
