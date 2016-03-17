/*
* 文 件 名:  PrizePool.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  奖池
* 修 改 人:  zhouliang
* 修改时间:  2015年6月24日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.activity;

import java.util.Date;

/**
* 奖池
* 
* @author  zhouliang
* @version  [１.０, 2015年6月24日]
* @since     [开店助手-超级营销-实体模块/１.０]
*/
public class PrizePool {
    /**
     * 奖池ID
     */
    private Long prizePoolID;
    
    /**
     * 卖家账号
     */
    private String sellerNick;
    
    /**
     * 奖池名称
     */
    private String name;
    
    /**
     * 每天每人的中奖次数
     */
    private Integer everydayAward;
    
    /**
     * 每人总共的中奖次数
     */
    private Integer totalAward;
    
    /**
     * 是否限制中奖数量 ，0：为不限制 ，1为限制
     */
    private Integer isLimit;
    
    /**
     * 描述
     */
    private String description;
    
    /**
     * 状态，0：无效，1：有效
     */
    private Integer status;
    
    /**
     * 奖池有效范围，起始时间
     */
    private Date startTime;
    
    /**
     * 奖池有效范围：结束时间
     */
    private Date endTime;
    
    private Date createTime;
    
    private Date updateTime;
    
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
    * @return 返回 everydayAward
    */
    public Integer getEverydayAward() {
        return everydayAward;
    }
    
    /**
    * @param 对everydayAward进行赋值
    */
    public void setEverydayAward(Integer everydayAward) {
        this.everydayAward = everydayAward;
    }
    
    /**
    * @return 返回 totalAward
    */
    public Integer getTotalAward() {
        return totalAward;
    }
    
    /**
    * @param 对totalAward进行赋值
    */
    public void setTotalAward(Integer totalAward) {
        this.totalAward = totalAward;
    }
    
    /**
    * @return 返回 isLimit
    */
    public Integer getIsLimit() {
        return isLimit;
    }
    
    /**
    * @param 对isLimit进行赋值
    */
    public void setIsLimit(Integer isLimit) {
        this.isLimit = isLimit;
    }
    
    /**
    * @return 返回 description
    */
    public String getDescription() {
        return description;
    }
    
    /**
    * @param 对description进行赋值
    */
    public void setDescription(String description) {
        this.description = description;
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
    * @return 返回 endTime
    */
    public Date getEndTime() {
        return endTime;
    }
    
    /**
    * @param 对endTime进行赋值
    */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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
    
}
