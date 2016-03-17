/*
* 文 件 名:  ServiceOrderDTO.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  <描述>
* 修 改 人:  zhouliang
* 修改时间:  2015年6月15日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.dto.saas;

import java.util.Date;

import org.yy.framework.basedata.query.AbstractQueryDto;

/**
* 服务订单查询条件
* 
* @author  zhouliang
* @version  [１.０, 2015年6月15日]
* @since  [开店助手-超级营销--传输对象层/1.0]
*/
public class ServiceOrderDTO extends AbstractQueryDto {
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -1400404651885799072L;
    
    /**
     * 订购的服务
     */
    private Integer defineID;
    
    /**
     * 订购者
     */
    private String sellerNick;
    
    /**
     * 订购时间(起始)
     */
    private Date startOrderTime;
    
    /**
     * 订购时间(结束)
     */
    private Date endOrderTime;
    
    /**
     * 状态,1为有效
     */
    private String status;
    
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
    * @return 返回 startOrderTime
    */
    public Date getStartOrderTime() {
        return startOrderTime;
    }
    
    /**
    * @param 对startOrderTime进行赋值
    */
    public void setStartOrderTime(Date startOrderTime) {
        this.startOrderTime = startOrderTime;
    }
    
    /**
    * @return 返回 endOrderTime
    */
    public Date getEndOrderTime() {
        return endOrderTime;
    }
    
    /**
    * @param 对endOrderTime进行赋值
    */
    public void setEndOrderTime(Date endOrderTime) {
        this.endOrderTime = endOrderTime;
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
    
}
