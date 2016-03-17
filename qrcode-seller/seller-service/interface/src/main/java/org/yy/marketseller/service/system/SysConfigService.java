/*
* 文 件 名:  SysConfig.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  系统配置服务
* 修 改 人:  zhouliang
* 修改时间:  2015年5月14日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.service.system;

import org.yy.framework.basedata.exception.ServiceException;
import org.yy.marketseller.model.system.SysConfig;

/**
* 系统配置服务
* 
* @author  zhouliang
* @version  [1.0, 2015年5月14日]
* @since  [码平台-商家后台-传输对象层/1.0]
*/
public interface SysConfigService {
    
    /**
    * 根据 配置编码获取系统配置R
    * 
    * @param code
    *            配置编码
    * @return 系统配置
    */
    public SysConfig findSysConfig(String code)throws ServiceException;
    
    /**
     * 保存系统配置
     * 
     * @param sysConfig
     *            系统配置
     * @return系统配置
     */
    public int insertSysConfig(SysConfig sysConfig)throws ServiceException;
    
}
