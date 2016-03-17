/*
* 文 件 名:  SysConfig.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  系统配置信息
* 修 改 人:  zhouliang
* 修改时间:  2015年5月13日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.system;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
* 系统配置信息
* 
* @author  zhouliang
* @version  [1.0, 2015年5月13日]
* @since  [开店助手-超级营销--模型层/1.0]
*/
public class SysConfig {
    
    /**
     * 配置ＩＤ
     */
    private Long configID;
    
    /**
     * 配置显示名称
     */
    @NotEmpty(message = "配置名称不能为空！")
    @Size(min = 0, max = 32, message = "配置名称长度必须在0到32之间")
    private String name;
    
    /**
     *  配置编码
     */
    @NotEmpty(message = "配置编码不能为空！")
    @Size(min = 0, max = 32, message = "配置编码长度必须在0到32之间")
    private String code;
    
    /**
     * 值，单值时直接存储，多值时{key:value, key:value}.如果多值没有key时，统一存字符串。
     */
    @NotEmpty(message = "配置值不能为空！")
    @Size(min = 0, max = 512, message = "配置值长度必须在0到512之间")
    private String valuess;
    
    /**
     *是否单值：1为单值，0为多值。默认为1。 true为单值，false为多值
     */
    private Boolean isSingleValue = Boolean.TRUE;
    
    /**
     * 数据类型：INT, DOUBLE, FLOAT,CHAR
     */
    private String dataType;
    
    /**
     * 配置描述
     */
    private String meto;
    
    /**
     * 备用字段1
     */
    private String hold1;
    
    /**
     * 备用字段1
     */
    private String hold2;
    
    private Date createTime;
    
    private Date updateTime;
    
    public Long getConfigID() {
        return configID;
    }
    
    public void setConfigID(Long configID) {
        this.configID = configID;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public String getValuess() {
        return valuess;
    }
    
    public void setValuess(String valuess) {
        this.valuess = valuess;
    }
    
    public Boolean getIsSingleValue() {
        return isSingleValue;
    }
    
    public void setIsSingleValue(Boolean isSingleValue) {
        this.isSingleValue = isSingleValue;
    }
    
    public String getMeto() {
        return meto;
    }
    
    public void setMeto(String meto) {
        this.meto = meto;
    }
    
    public String getHold1() {
        return hold1;
    }
    
    public void setHold1(String hold1) {
        this.hold1 = hold1;
    }
    
    public String getHold2() {
        return hold2;
    }
    
    public void setHold2(String hold2) {
        this.hold2 = hold2;
    }
    
    public String getDataType() {
        return dataType;
    }
    
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }
    
    public Date getCreateTime() {
        return createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    public Date getUpdateTime() {
        return updateTime;
    }
    
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    
    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "SysConfig [configID=" + configID + ", name=" + name + ", code=" + code + ", valuess=" + valuess
            + ", isSingleValue=" + isSingleValue + ", dataType=" + dataType + ", meto=" + meto + ", hold1=" + hold1
            + ", hold2=" + hold2 + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
    }
    
    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        result = prime * result + ((configID == null) ? 0 : configID.hashCode());
        return result;
    }
    
    /** {@inheritDoc} */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SysConfig other = (SysConfig)obj;
        if (code == null) {
            if (other.code != null)
                return false;
        }
        else if (!code.equals(other.code))
            return false;
        if (configID == null) {
            if (other.configID != null)
                return false;
        }
        else if (!configID.equals(other.configID))
            return false;
        return true;
    }
    
}
