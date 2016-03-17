/*
* 文 件 名:  Seller.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  <描述>
* 修 改 人:  zhouliang
* 修改时间:  2015年6月24日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.member;

import java.util.Date;

/**
* 平台卖家信息
* 
* @author  zhouliang
* @version  [１.０, 2015年6月24日]
* @since  [开店助手-超级营销-实体模块/１.０]
*/
public class Seller {
    /**
     * 卖家ID
     */
    private Long sellerID;
    
    /**
     * 1  : 卖家账号，注册后不能修改，不能重复注册。
     * 2：候选主键
     */
    private String sellerNick;
    
    /**
     * 卖家CODE， 身份标识。特殊用途
     */
    private String code;
    
    /**
     * 密码
     */
    private String pwd;
    
    /**
     * 性别，值为F，M。默认为M
     */
    private String sex;
    
    /**
     * 生日，例如：2015－1－1
     */
    private Date birthday;
    
    /**
     * 卖家头像地址
     */
    private String avatar;
    
    /**
     * 卖家邮箱
     */
    private String email;
    
    /**
     * 卖家QQ
     */
    private String qq;
    
    /**
     * 最后登录时间
     */
    private Date lastLoginTime;
    
    /**
     * 创建时间
     */
    private Date createTime;
    
    /**
     * 更新时间
     */
    private Date updateTime;
    
    /**
    * @return 返回 sellerID
    */
    public Long getSellerID() {
        return sellerID;
    }
    
    /**
    * @param 对sellerID进行赋值
    */
    public void setSellerID(Long sellerID) {
        this.sellerID = sellerID;
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
    * @return 返回 birthday
    */
    public Date getBirthday() {
        return birthday;
    }
    
    /**
    * @param 对birthday进行赋值
    */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
    /**
    * @return 返回 avatar
    */
    public String getAvatar() {
        return avatar;
    }
    
    /**
    * @param 对avatar进行赋值
    */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
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
    
    /**
    * @return 返回 code
    */
    public String getCode() {
        return code;
    }
    
    /**
    * @param 对code进行赋值
    */
    public void setCode(String code) {
        this.code = code;
    }
    
}
