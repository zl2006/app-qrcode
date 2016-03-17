/*
* 文 件 名:  SystConfigController.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  系统配置控制器
* 修 改 人:  zhouliang
* 修改时间:  2015年5月14日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.controller.system;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.yy.framework.base.controller.AbstractController;
import org.yy.marketseller.model.system.SysConfig;
import org.yy.marketseller.service.system.SysConfigService;

/**
* 系统配置控制器
* 
* @author  zhouliang
* @version  [1.0, 2015年5月14日]
* @since [码平台-商家后台-控制层/1.0]
*/
@Controller
@RequestMapping("/system/sysconfig")
public class SystConfigController extends AbstractController {
    
    @Resource(name = "sysConfigService")
    private SysConfigService sysConfigService;
    
    //模块名称
    private String moduleName;
    
    /** {@inheritDoc} */
    @Override
    protected void setModuleName() {
        this.moduleName = "system/sysconfig/";
    }
    
    @RequestMapping("/pre_add")
    public ModelAndView preAdd() {
        return processSuccess(moduleName + "add", null);
    }
    
    @RequestMapping("/list")
    public ModelAndView list()
        throws Exception {
        return processSuccess(moduleName + "list", null);
    }
    
    @RequestMapping("/detail")
    //http://localhost:8080/system/sysconfig/detail.do?code=test1
    //http://localhost:8080/system/sysconfig/detail.json?code=test1
    public ModelAndView detail(@RequestParam("code") String code)
        throws Exception {
        SysConfig sc = sysConfigService.findSysConfig(code);
        return processSuccess(moduleName + "detail", sc);
    }
    
}
