/*
* 文 件 名:  SellerAuthh.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  平台卖家在第三方平台（淘宝，微信）的授权信息
* 修 改 人:  zhouliang
* 修改时间:  2015年6月24日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.member;

import java.util.Date;

/**
*平台卖家在第三方平台（淘宝，微信）的授权信息
* 
* @author  zhouliang
* @version  [１.０, 2015年6月2９日]
* @since  [开店助手-超级营销-实体模块/１.０]
*/
public class SellerAuth {
    /**
     * 授权ID
     */
    private Long authID;
    
    /**
     * 平台卖家账号
     */
    private String sellerNick;
    
    /**
     * 第三方授权平台类型，值为本平台：OWNER，淘宝平台：TAOBAO，拍拍：PAIPAI
     */
    private String thirdSystemType;
    
    /**
     * 第三方平台授权卖家账号ID
     */
    private String thirdSellerID;
    
    /**
     * 第三方平台授权卖家昵称
     */
    private String thirdSellerNick;
    
    /**
     * 第三方平台授权卖家子账号ID
     */
    private String thirdSubSellerID;
    
    /**
     * 第三方平台授权卖家子账号昵称
     */
    private String thirdSubSellerNick;
    
    /**
     * 访问第三方平台API的令牌TOKEN
     */
    private String accessToken;
    
    /**
     * TOKEN类型
     */
    private String tokenType;
    
    /**
     * TOKEN过期时间，单位为秒
     */
    private Integer expiresIn;
    
    /**
     * '刷新授权的TOKEN
     */
    private String refreshToken;
    
    /**
     * 刷新TOKEN的过期时间，单位为秒
     */
    private Integer reExpiresIn;
    
    /**
     * 'R1级别API的TOKEN过期时间
     */
    private Integer r1ExpiresIn;
    
    /**
     * R2级别API的TOKEN过期时间
     */
    private Integer r2ExpiresIn;
    
    /**
     * W1级别API的TOKEN过期时间
     */
    private Integer w1ExpiresIn;
    
    /**
     * W2级别API的TOKEN过期时间
     */
    private Integer w2ExpiresIn;
    
    /**
     * 创建时间
     */
    private Date createTime;
    
    private Date updateTime;
    
    /**
    * @return 返回 authID
    */
    public Long getAuthID() {
        return authID;
    }
    
    /**
    * @param 对authID进行赋值
    */
    public void setAuthID(Long authID) {
        this.authID = authID;
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
    * @return 返回 thirdSystemType
    */
    public String getThirdSystemType() {
        return thirdSystemType;
    }
    
    /**
    * @param 对thirdSystemType进行赋值
    */
    public void setThirdSystemType(String thirdSystemType) {
        this.thirdSystemType = thirdSystemType;
    }
    
    /**
    * @return 返回 thirdSellerID
    */
    public String getThirdSellerID() {
        return thirdSellerID;
    }
    
    /**
    * @param 对thirdSellerID进行赋值
    */
    public void setThirdSellerID(String thirdSellerID) {
        this.thirdSellerID = thirdSellerID;
    }
    
    /**
    * @return 返回 thirdSellerNick
    */
    public String getThirdSellerNick() {
        return thirdSellerNick;
    }
    
    /**
    * @param 对thirdSellerNick进行赋值
    */
    public void setThirdSellerNick(String thirdSellerNick) {
        this.thirdSellerNick = thirdSellerNick;
    }
    
    /**
    * @return 返回 thirdSubSellerID
    */
    public String getThirdSubSellerID() {
        return thirdSubSellerID;
    }
    
    /**
    * @param 对thirdSubSellerID进行赋值
    */
    public void setThirdSubSellerID(String thirdSubSellerID) {
        this.thirdSubSellerID = thirdSubSellerID;
    }
    
    /**
    * @return 返回 thirdSubSellerNick
    */
    public String getThirdSubSellerNick() {
        return thirdSubSellerNick;
    }
    
    /**
    * @param 对thirdSubSellerNick进行赋值
    */
    public void setThirdSubSellerNick(String thirdSubSellerNick) {
        this.thirdSubSellerNick = thirdSubSellerNick;
    }
    
    /**
    * @return 返回 accessToken
    */
    public String getAccessToken() {
        return accessToken;
    }
    
    /**
    * @param 对accessToken进行赋值
    */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
    
    /**
    * @return 返回 tokenType
    */
    public String getTokenType() {
        return tokenType;
    }
    
    /**
    * @param 对tokenType进行赋值
    */
    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }
    
    /**
    * @return 返回 expiresIn
    */
    public Integer getExpiresIn() {
        return expiresIn;
    }
    
    /**
    * @param 对expiresIn进行赋值
    */
    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }
    
    /**
    * @return 返回 refreshToken
    */
    public String getRefreshToken() {
        return refreshToken;
    }
    
    /**
    * @param 对refreshToken进行赋值
    */
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
    
    /**
    * @return 返回 reExpiresIn
    */
    public Integer getReExpiresIn() {
        return reExpiresIn;
    }
    
    /**
    * @param 对reExpiresIn进行赋值
    */
    public void setReExpiresIn(Integer reExpiresIn) {
        this.reExpiresIn = reExpiresIn;
    }
    
    /**
    * @return 返回 r1ExpiresIn
    */
    public Integer getR1ExpiresIn() {
        return r1ExpiresIn;
    }
    
    /**
    * @param 对r1ExpiresIn进行赋值
    */
    public void setR1ExpiresIn(Integer r1ExpiresIn) {
        this.r1ExpiresIn = r1ExpiresIn;
    }
    
    /**
    * @return 返回 r2ExpiresIn
    */
    public Integer getR2ExpiresIn() {
        return r2ExpiresIn;
    }
    
    /**
    * @param 对r2ExpiresIn进行赋值
    */
    public void setR2ExpiresIn(Integer r2ExpiresIn) {
        this.r2ExpiresIn = r2ExpiresIn;
    }
    
    /**
    * @return 返回 w1ExpiresIn
    */
    public Integer getW1ExpiresIn() {
        return w1ExpiresIn;
    }
    
    /**
    * @param 对w1ExpiresIn进行赋值
    */
    public void setW1ExpiresIn(Integer w1ExpiresIn) {
        this.w1ExpiresIn = w1ExpiresIn;
    }
    
    /**
    * @return 返回 w2ExpiresIn
    */
    public Integer getW2ExpiresIn() {
        return w2ExpiresIn;
    }
    
    /**
    * @param 对w2ExpiresIn进行赋值
    */
    public void setW2ExpiresIn(Integer w2ExpiresIn) {
        this.w2ExpiresIn = w2ExpiresIn;
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
