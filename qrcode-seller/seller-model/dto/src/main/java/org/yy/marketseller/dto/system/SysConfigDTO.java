/*
* 文 件 名:  SysConfigDTO.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  系统配置查询条件
* 修 改 人:  zhouliang
* 修改时间:  2015年5月13日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.dto.system;

import org.yy.framework.basedata.query.AbstractQueryDto;

/**
* 系统配置查询条件
* 
* @author  zhouliang
* @version  [1.0, 2015年5月13日]
* @since  [开店助手-超级营销--传输对象层/1.0]
*/
public class SysConfigDTO extends AbstractQueryDto {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -2925682300344034044L;
    
    /**
     * 配置ＩＤ
     */
    private Long configID;
    
    /**
     * 配置显示名称
     */
    private String name;
    
    /**
     *  配置编码
     */
    private String code;
    
    /**
    * @return 返回 configID
    */
    public Long getConfigID() {
        return configID;
    }
    
    /**
    * @param 对configID进行赋值
    */
    public void setConfigID(Long configID) {
        this.configID = configID;
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
    
    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "SysConfigDTO [configID=" + configID + ", name=" + name + ", code=" + code + "]";
    }
    
    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        result = prime * result + ((configID == null) ? 0 : configID.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    
    /** {@inheritDoc} */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        SysConfigDTO other = (SysConfigDTO)obj;
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
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        return true;
    }
    
}
