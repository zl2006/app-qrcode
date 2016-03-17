/*
* 文 件 名:  ServiceOrder.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  服务订单
* 修 改 人:  zhouliang
* 修改时间:  2015年6月15日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.saas;

import java.util.Calendar;
import java.util.Date;

/**
* 服务订单
* 
* @author  zhouliang
* @version  [１.０, 2015年6月15日]
* @since  [开店助手-超级营销-实体模块/１.０]
*/
public class ServiceOrder {
    /**
     * 订单ID
     */
    private Integer orderID;
    
    /**
     * 订购的服务
     */
    private Integer defineID;
    
    /**
     * 订购的版本
     */
    private Integer versionID;
    
    /**
     * 订购者
     */
    private String sellerNick;
    
    /**
     * 订购时间
     */
    private Date orderTime;
    
    /**
     * 订购期限,以天为单位
     */
    private Integer orderDuration;
    
    /**
     * 订购的价钱,分为单位
     */
    private Integer price;
    
    /**
     * 状态,1为有效,2为退款
     */
    private String status = "1";
    
    private Date createTime;
    
    private Date updateTime;
    
    /**
    * @return 返回 orderID
    */
    public Integer getOrderID() {
        return orderID;
    }
    
    /**
    * @param 对orderID进行赋值
    */
    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }
    
    /**
    * @return 返回 defineID
    */
    public Integer getDefineID() {
        return defineID;
    }
    
    /**
    * @param 对defineID进行赋值
    */
    public void setDefineID(Integer defineID) {
        this.defineID = defineID;
    }
    
    /**
    * @return 返回 versionID
    */
    public Integer getVersionID() {
        return versionID;
    }
    
    /**
    * @param 对versionID进行赋值
    */
    public void setVersionID(Integer versionID) {
        this.versionID = versionID;
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
    * @return 返回 orderTime
    */
    public Date getOrderTime() {
        return orderTime;
    }
    
    /**
    * @param 对orderTime进行赋值
    */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }
    
    /**
    * @return 返回 orderDuration
    */
    public Integer getOrderDuration() {
        return orderDuration;
    }
    
    /**
    * @param 对orderDuration进行赋值
    */
    public void setOrderDuration(Integer orderDuration) {
        this.orderDuration = orderDuration;
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
    * @return 返回 status
    */
    public String getStatus() {
        return status;
    }
    
    public boolean validate() {
        return "1".equals(status);
    }
    
    /**
    * @param 对status进行赋值
    */
    public void setStatus(String status) {
        this.status = status;
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
     * 是否过期
     */
    public boolean expire() {
        //开始时间
        long start = orderTime.getTime();
        
        //结束时间,　订购日期+期限
        Calendar endDate = Calendar.getInstance();
        endDate.setTime(orderTime);
        endDate.add(Calendar.DAY_OF_YEAR, orderDuration);
        long end = endDate.getTime().getTime();
        
        //当前时间大于等于订购时间并且小于等于结束时间表示有效
        long now = new Date().getTime();
        return start <= now && now <= end;
    }
    
    public static void main(String[] args) {
        Calendar endDate = Calendar.getInstance();
        endDate.add(Calendar.DAY_OF_YEAR, 365);
        System.out.println(endDate);
    }
}
