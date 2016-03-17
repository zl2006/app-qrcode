/*
* 文 件 名:  PrizeType.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  奖品类型
* 修 改 人:  zhouliang
* 修改时间:  2015年6月24日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.activity;

import java.util.Date;

/**
* 奖品类型
* 
* @author  zhouliang
* @version  [１.０, 2015年6月24日]
* @since     [开店助手-超级营销-实体模块/１.０]
*/
public class PrizeType {
    /**
     * 奖品类型ID
     */
    private Long prizetypeID;
    
    /**
     * 奖品类型的编码
     */
    private String prizeTypeCode;
    
    /**
     * 奖品类型使用的单位
     */
    private String prizeTypeUnit;
    
    /**
     * 奖品类型名称,比如红包,流量,话费等
     */
    private String name;
    
    /**
     * 奖品类型图标
     */
    private String icon;
    
    /**
     *  '实物或虚拟物品类型, VIR:虚拟物品, GOODS:实物.'
     */
    private String type;
    
    /**
     * 备注
     */
    private String meto;
    
    /**
     * 状态，0：无效，1：有效
     */
    private Integer status;
    
    /**
     * 支撑的平台,主要平台有微信(WX), 淘宝(TAO)等,0表示不支持1表示支持 ,   {"ALL":1, "WX":0, "TAO":1}
     */
    private String platform;
    
    private Date createTime;
    
    private Date updateTime;
    
    /**
    * @return 返回 prizetypeID
    */
    public Long getPrizetypeID() {
        return prizetypeID;
    }
    
    /**
    * @param 对prizetypeID进行赋值
    */
    public void setPrizetypeID(Long prizetypeID) {
        this.prizetypeID = prizetypeID;
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
    * @return 返回 icon
    */
    public String getIcon() {
        return icon;
    }
    
    /**
    * @param 对icon进行赋值
    */
    public void setIcon(String icon) {
        this.icon = icon;
    }
    
    /**
    * @return 返回 type
    */
    public String getType() {
        return type;
    }
    
    /**
    * @param 对type进行赋值
    */
    public void setType(String type) {
        this.type = type;
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
    * @return 返回 platform
    */
    public String getPlatform() {
        return platform;
    }
    
    /**
    * @param 对platform进行赋值
    */
    public void setPlatform(String platform) {
        this.platform = platform;
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
    * @return 返回 prizeTypeCode
    */
    public String getPrizeTypeCode() {
        return prizeTypeCode;
    }
    
    /**
    * @param 对prizeTypeCode进行赋值
    */
    public void setPrizeTypeCode(String prizeTypeCode) {
        this.prizeTypeCode = prizeTypeCode;
    }
    
    /**
    * @return 返回 prizeTypeUnit
    */
    public String getPrizeTypeUnit() {
        return prizeTypeUnit;
    }
    
    /**
    * @param 对prizeTypeUnit进行赋值
    */
    public void setPrizeTypeUnit(String prizeTypeUnit) {
        this.prizeTypeUnit = prizeTypeUnit;
    }
    
}
