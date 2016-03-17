/*
* 文 件 名:  SellerDTO.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  卖家查询组合条件
* 修 改 人:  zhouliang
* 修改时间:  2015年9月6日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.dto.member;

import org.yy.framework.basedata.query.AbstractQueryDto;

/**
* 卖家查询组合条件
* 
* @author  zhouliang
* @version  [１.０, 2015年9月6日]
* @since  [开店助手-超级营销-传输对象层/1.0]
*/
public class SellerDTO extends AbstractQueryDto {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -3787112922879776038L;
    
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
     * 性别，值为F，M。默认为M
     */
    private String sex;
    
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
    
}
