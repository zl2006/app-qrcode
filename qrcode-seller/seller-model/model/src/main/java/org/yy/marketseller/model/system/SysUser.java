/*
* 文 件 名:  SysUser.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  系统用户
* 修 改 人:  zhouliang
* 修改时间:  2015年8月6日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.system;

import java.util.Date;

/**
* 系统用户
* 
* @author  zhouliang
* @version  [1.0, 2015年5月13日]
* @since  [开店助手-超级营销-模型层/1.0]
*/
public class SysUser {
    /**
     * 系统用户ID
     */
    private Long userID;
    
    /**
     * 用户名
     */
    private String userName;
    
    /**
     * 用户密码
     */
    private String pwd;
    
    /**
     * 用户角色，ADMIN/NORMAL/CUSTOMER
     */
    private String role;
    
    /**
     * 手机
     */
    private String mobile;
    
    /**
     * 邮件
     */
    private String email;
    
    /**
     * 用户状态，1为有效，0为无效
     */
    private Integer status = 1;
    
    /**
     * 备注
     */
    private String meto;
    
    /**
     * 最后登录时间
     */
    private Date lastLoginTime;
    
    /**
     * 创建时间
     */
    private Date createTime;
    
    private Date updateTime;
    
    /**
    * @return 返回 userID
    */
    public Long getUserID() {
        return userID;
    }
    
    /**
    * @param 对userID进行赋值
    */
    public void setUserID(Long userID) {
        this.userID = userID;
    }
    
    /**
    * @return 返回 userName
    */
    public String getUserName() {
        return userName;
    }
    
    /**
    * @param 对userName进行赋值
    */
    public void setUserName(String userName) {
        this.userName = userName;
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
    * @return 返回 role
    */
    public String getRole() {
        return role;
    }
    
    /**
    * @param 对role进行赋值
    */
    public void setRole(String role) {
        this.role = role;
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
