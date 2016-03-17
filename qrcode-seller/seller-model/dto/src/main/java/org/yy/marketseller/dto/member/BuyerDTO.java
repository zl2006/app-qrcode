/*
* 文 件 名:  BuyerDTO.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:   买家查询组合条件
* 修 改 人:  zhouliang
* 修改时间:  2015年8月27日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.dto.member;

import org.yy.framework.basedata.query.AbstractQueryDto;

/**
* 买家查询组合条件
* 
* @author  zhouliang
* @version  [１.０, 2015年8月27日]
* @since  [开店助手-超级营销-传输对象层/1.0]
*/
public class BuyerDTO extends AbstractQueryDto {
     /**
     * 注释内容
     */
    private static final long serialVersionUID = -8680787650855208659L;

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
    
}
