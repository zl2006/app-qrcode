/*
* 文 件 名:  PrizeItem.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  奖池中的奖品项
* 修 改 人:  zhouliang
* 修改时间:  2015年6月24日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.activity;

import java.util.Date;

/**
* 奖池中的奖品项
* 
* @author  zhouliang
* @version  [１.０, 2015年6月24日]
* @since     [开店助手-超级营销-实体模块/１.０]
*/
public class PrizeItem {
    /**
     * 奖项ID
     */
    private Long prizeItemID;
    
    /**
     * 奖品类型
     */
    private Long prizeTypeID;
    
    /**
     * 奖池
     */
    private Long prizePoolID;
    
    /**
     * 当奖品类型为实物,商家要从礼品表(商品表)中选择.
     */
    private Long productID;
    
    /**
     * 奖品名称
     */
    private String name;
    
    /**
     * 备注
     */
    private String meto;
    
    /**
     * 奖品数量
     */
    private Integer prizeNum;
    
    /**
     * 剩余奖品数量
     */
    private Integer remindNum;
    
    /**
     * 奖品价格，单位为分
     */
    private Integer price;
    
    /**
     * 中奖率
     */
    private Integer rate;
    
    /**
     * 状态，0：无效，1：有效
     */
    private Integer status;
    
    /**
     * 项发放限制类型，0为不限制，1为每天，2为每月，3为每年
     */
    private Integer limitType;
    
    /**
     * 奖项发放每日／每月／每年数量限制，0表示不限制。
     */
    private Integer limitNum;
    
    private String hold1;
    
    private String hold2;
    
    private String hold3;
    
    private Date createTime;
    
    private Date updateTime;
    
    /**
    * @return 返回 prizeItemID
    */
    public Long getPrizeItemID() {
        return prizeItemID;
    }
    
    /**
    * @param 对prizeItemID进行赋值
    */
    public void setPrizeItemID(Long prizeItemID) {
        this.prizeItemID = prizeItemID;
    }
    
    /**
    * @return 返回 prizeTypeID
    */
    public Long getPrizeTypeID() {
        return prizeTypeID;
    }
    
    /**
    * @param 对prizeTypeID进行赋值
    */
    public void setPrizeTypeID(Long prizeTypeID) {
        this.prizeTypeID = prizeTypeID;
    }
    
    /**
    * @return 返回 prizePoolID
    */
    public Long getPrizePoolID() {
        return prizePoolID;
    }
    
    /**
    * @param 对prizePoolID进行赋值
    */
    public void setPrizePoolID(Long prizePoolID) {
        this.prizePoolID = prizePoolID;
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
    * @return 返回 meto
    */
    public String getMeto() {
        return meto;
    }
    
    /**
    * @param 对meto进行赋值
    */
    public void setMeto(String meto) {
        this.meto = meto;
    }
    
    /**
    * @return 返回 prizeNum
    */
    public Integer getPrizeNum() {
        return prizeNum;
    }
    
    /**
    * @param 对prizeNum进行赋值
    */
    public void setPrizeNum(Integer prizeNum) {
        this.prizeNum = prizeNum;
    }
    
    /**
    * @return 返回 remindNum
    */
    public Integer getRemindNum() {
        return remindNum;
    }
    
    /**
    * @param 对remindNum进行赋值
    */
    public void setRemindNum(Integer remindNum) {
        this.remindNum = remindNum;
    }
    
    /**
    * @return 返回 price
    */
    public Integer getPrice() {
        return price;
    }
    
    /**
    * @param 对price进行赋值
    */
    public void setPrice(Integer price) {
        this.price = price;
    }
    
    /**
    * @return 返回 rate
    */
    public Integer getRate() {
        return rate;
    }
    
    /**
    * @param 对rate进行赋值
    */
    public void setRate(Integer rate) {
        this.rate = rate;
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
    * @return 返回 hold3
    */
    public String getHold3() {
        return hold3;
    }
    
    /**
    * @param 对hold3进行赋值
    */
    public void setHold3(String hold3) {
        this.hold3 = hold3;
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
    
    /**
    * @return 返回 limitType
    */
    public Integer getLimitType() {
        return limitType;
    }
    
    /**
    * @param 对limitType进行赋值
    */
    public void setLimitType(Integer limitType) {
        this.limitType = limitType;
    }
    
    /**
    * @return 返回 limitNum
    */
    public Integer getLimitNum() {
        return limitNum;
    }
    
    /**
    * @param 对limitNum进行赋值
    */
    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }
    
}
