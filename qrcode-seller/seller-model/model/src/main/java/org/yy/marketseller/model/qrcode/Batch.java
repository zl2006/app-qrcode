/*
* 文 件 名:  Batch.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述: 码批次
* 修 改 人:  zhouliang
* 修改时间:  2015年6月24日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.qrcode;

import java.util.Date;

/**
* 码批次, 产品二维码批次信息，可以为多个产品创建二维码
* 
* @author  zhouliang
* @version  [１.０, 2015年6月15日]
* @since  [开店助手-超级营销-实体模块/１.０]
* */
public class Batch {
    
    /**
     * 批次标识
     */
    private Long batchID;
    
    /**
     * 批次编码,需要一定生成规则
     */
    private String batchCode;
    
    /**
     * 批次名称，此批二维码的目的
     */
    private String batchName;
    
    /**
     * 批次密码, 主要用于通过接口(密码会作为参数)生成二维码. 加密后的字符串
     */
    private String pwd;
    
    /**
     * 码类型，1表示通用码，2表示一物一码
     */
    private Integer qrType;
    
    /**
     * 活动ID，此批码参与什么活动.　此值可以为空
     */
    private Long activityID;
    
    /**
     * 二维码总数量
     */
    private Integer qrcodeNum;
    
    /**
     * 此批次二维码所有者，为各平台下卖家昵称
     */
    private String sellerNick;
    
    /**
     * 状态：1为有效，0为作废。默认有效
     */
    private Integer status =1;
    
    /**
     * 目标地址：http://m.taobao.com
     */
    private String targetUrl;
    
    /**
     * 实际二维码访问的跳转地址：http://spring.taobao.com
     */
    private String jumpUrl;
    
    /**
     * 生效时间
     */
    private Date validTime;
    
    private String hold1;
    
    private String hold2;
    
    /**
     * 码的生成方式,　值可以为:　TAOBAO(淘宝),　SELLER(卖家),　SELF(本平台)      
     */
    private String generationType;
    
    /**
     * 批次创建时间
     */
    private Date createTime;
    
    /**
     * 批次更新时间
     */
    private Date updateTime;
    
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
    * @return 返回 batchCode
    */
    public String getBatchCode() {
        return batchCode;
    }
    
    /**
    * @param 对batchCode进行赋值
    */
    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
    }
    
    /**
    * @return 返回 batchName
    */
    public String getBatchName() {
        return batchName;
    }
    
    /**
    * @param 对batchName进行赋值
    */
    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }
    
    /**
    * @return 返回 pwd
    */
    public String getPwd() {
        return pwd;
    }
    
    /**
    * @param 对pwd进行赋值
    */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
    /**
    * @return 返回 qrType
    */
    public Integer getQrType() {
        return qrType;
    }
    
    /**
    * @param 对qrType进行赋值
    */
    public void setQrType(Integer qrType) {
        this.qrType = qrType;
    }
    
    /**
    * @return 返回 activityID
    */
    public Long getActivityID() {
        return activityID;
    }
    
    /**
    * @param 对activityID进行赋值
    */
    public void setActivityID(Long activityID) {
        this.activityID = activityID;
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
    
    /**
    * @return 返回 sellerNick
    */
    public String getSellerNick() {
        return sellerNick;
    }
    
    /**
    * @param 对sellerNick进行赋值
    */
    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
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
    * @return 返回 targetUrl
    */
    public String getTargetUrl() {
        return targetUrl;
    }
    
    /**
    * @param 对targetUrl进行赋值
    */
    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }
    
    /**
    * @return 返回 jumpUrl
    */
    public String getJumpUrl() {
        return jumpUrl;
    }
    
    /**
    * @param 对jumpUrl进行赋值
    */
    public void setJumpUrl(String jumpUrl) {
        this.jumpUrl = jumpUrl;
    }
    
    /**
    * @return 返回 validTime
    */
    public Date getValidTime() {
        return validTime;
    }
    
    /**
    * @param 对validTime进行赋值
    */
    public void setValidTime(Date validTime) {
        this.validTime = validTime;
    }
    
    /**
    * @return 返回 hold1
    */
    public String getHold1() {
        return hold1;
    }
    
    /**
    * @param 对hold1进行赋值
    */
    public void setHold1(String hold1) {
        this.hold1 = hold1;
    }
    
    /**
    * @return 返回 hold2
    */
    public String getHold2() {
        return hold2;
    }
    
    /**
    * @param 对hold2进行赋值
    */
    public void setHold2(String hold2) {
        this.hold2 = hold2;
    }
    
    /**
    * @return 返回 generationType
    */
    public String getGenerationType() {
        return generationType;
    }
    
    /**
    * @param 对generationType进行赋值
    */
    public void setGenerationType(String generationType) {
        this.generationType = generationType;
    }
    
    /**
    * @return 返回 createTime
    */
    public Date getCreateTime() {
        return createTime;
    }
    
    /**
    * @param 对createTime进行赋值
    */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
    
}
