/*
* 文 件 名:  PrizePoolDTO.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  奖池查询组合条件
* 修 改 人:  zhouliang
* 修改时间:  2015年8月17日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.dto.activity;

import org.yy.framework.basedata.query.AbstractQueryDto;

/**
* 奖池查询组合条件
* 
* @author  zhouliang
* @version  [１.０, 2015年8月10日]
* @since  [开店助手-超级营销-传输对象层/1.0]
*/
public class PrizePoolDTO extends AbstractQueryDto {
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 6869708849444418607L;
    
    /**
     * 卖家账号
     */
    private String sellerNick;
    
    /**
     * 奖池名称
     */
    private String name;
    
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
    
}
