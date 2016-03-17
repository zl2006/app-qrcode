/*
* 文 件 名:  QrCode.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  二维码
* 修 改 人:  zhouliang
* 修改时间:  2015年6月24日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.qrcode;

import java.util.Date;

/**
* 二维码
* 
* @author  zhouliang
* @version  [１.０, 2015年6月24日]
* @since  [开店助手-超级营销-实体模块/１.０]
*/
public class QrCode {
    /**
     * 码ID
     */
    private Long qrcodeID;
    
    /**
     * 二维码串，纯字符串码信息
     */
    private String qrcode;
    
    /**
     * 码状态,  0未激活, 1有效未被扫， 2有效已被扫， 3作废无效
     */
    private String status;
    
    /**
     * 被扫次数 , 默认为0
     */
    private Integer times = 0;
    
    /**
     * 批次ID
     */
    private Long batchID;
    
    /**
     * 码对应的批次中产品
     */
    private Long batchPrdID;
    
    /**
     * 批量生成的任务ID，\n如果有值表示批量生成否则通过接口调用生成（值为－1）。\n主要控制用来导出
     */
    private Long createQrID;
    
    /**
     * 更新时间
     */
    private Date updateTime;
    
    /**
     * 首次扫码人昵称
     */
    private String fscanBuyerNick;
    
    /**
     * 首次扫码时间
     */
    private Date fscanTime;
    
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
    
    /**
    * @return 返回 times
    */
    public Integer getTimes() {
        return times;
    }
    
    /**
    * @param 对times进行赋值
    */
    public void setTimes(Integer times) {
        this.times = times;
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
    
    /**
    * @return 返回 fscanBuyerNick
    */
    public String getFscanBuyerNick() {
        return fscanBuyerNick;
    }
    
    /**
    * @param 对fscanBuyerNick进行赋值
    */
    public void setFscanBuyerNick(String fscanBuyerNick) {
        this.fscanBuyerNick = fscanBuyerNick;
    }
    
    /**
    * @return 返回 fscanTime
    */
    public Date getFscanTime() {
        return fscanTime;
    }
    
    /**
    * @param 对fscanTime进行赋值
    */
    public void setFscanTime(Date fscanTime) {
        this.fscanTime = fscanTime;
    }
    
}
