/*
* 文 件 名:  Buyer.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  买家信息
* 修 改 人:  zhouliang
* 修改时间:  2015年6月24日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.member;

import java.util.Date;

/**
* 买家信息
* 
* @author  zhouliang
* @version  [１.０, 2015年6月24日]
* @since  [开店助手-超级营销-实体模块/１.０]
*/
public class Buyer {
    /**
     * 买家ID
     */
    private Long buyerID;
    
    /**
     * 卖家昵称
     */
    private String buyerNick;
    
    /**
     * 真实昵称
     */
    private String realNick;
    
    /**
     * 真实姓名
     */
    private String name;
    
    /**
     * 电话
     */
    private String tel;
    
    /**
     * 手机
     */
    private String mobile;
    
    /**
     * 邮箱
     */
    private String email;
    
    /**
     * QQ
     */
    private String qq;
    
    /**
     * 城市
     */
    private String city;
    
    /**
     * 性别，F：女，M:男
     */
    private String sex;
    
    /**
     * 职业
     */
    private String job;
    
    /**
     * 地址
     */
    private String address;
    
    /**
     * 状态：1为有效，2为黑名单
     */
    private String status;
    
    private String hold1;
    
    private String hold2;
    
    private Date lastLoginTime;
    
    private Date createTime;
    
    private Date updateTime;
    
    /**
    * @return 返回 buyerID
    */
    public Long getBuyerID() {
        return buyerID;
    }
    
    /**
    * @param 对buyerID进行赋值
    */
    public void setBuyerID(Long buyerID) {
        this.buyerID = buyerID;
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
    * @return 返回 realNick
    */
    public String getRealNick() {
        return realNick;
    }
    
    /**
    * @param 对realNick进行赋值
    */
    public void setRealNick(String realNick) {
        this.realNick = realNick;
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
    * @return 返回 tel
    */
    public String getTel() {
        return tel;
    }
    
    /**
    * @param 对tel进行赋值
    */
    public void setTel(String tel) {
        this.tel = tel;
    }
    
    /**
    * @return 返回 mobile
    */
    public String getMobile() {
        return mobile;
    }
    
    /**
    * @param 对mobile进行赋值
    */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    /**
    * @return 返回 email
    */
    public String getEmail() {
        return email;
    }
    
    /**
    * @param 对email进行赋值
    */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
    * @return 返回 qq
    */
    public String getQq() {
        return qq;
    }
    
    /**
    * @param 对qq进行赋值
    */
    public void setQq(String qq) {
        this.qq = qq;
    }
    
    /**
    * @return 返回 city
    */
    public String getCity() {
        return city;
    }
    
    /**
    * @param 对city进行赋值
    */
    public void setCity(String city) {
        this.city = city;
    }
    
    /**
    * @return 返回 sex
    */
    public String getSex() {
        return sex;
    }
    
    /**
    * @param 对sex进行赋值
    */
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    /**
    * @return 返回 job
    */
    public String getJob() {
        return job;
    }
    
    /**
    * @param 对job进行赋值
    */
    public void setJob(String job) {
        this.job = job;
    }
    
    /**
    * @return 返回 address
    */
    public String getAddress() {
        return address;
    }
    
    /**
    * @param 对address进行赋值
    */
    public void setAddress(String address) {
        this.address = address;
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
    * @return 返回 lastLoginTime
    */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }
    
    /**
    * @param 对lastLoginTime进行赋值
    */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
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
