/*
* 文 件 名:  ProductController.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  产品控制器
* 修 改 人:  zhouliang
* 修改时间:  2016年3月28日
* 修改内容:  <修改内容>
*/
package org.yy.qrcodeseller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.yy.framework.base.controller.AbstractController;

/**
* 产品控制器
* 
* @author  zhouliang
* @version  [1.0, 2016年3月28日]
* @since  [码平台-商家后台-控制层/1.0]
*/
@Controller
@RequestMapping("/product")
public class ProductController extends AbstractController {
    
    private String moduleName;
    
    public ProductController() {
        setModuleName();
    }
    
    @RequestMapping("/list")
    public ModelAndView list() {
        return new ModelAndView(moduleName + "list");
    }
    
    /** {@inheritDoc} */
    @Override
    protected void setModuleName() {
        this.moduleName = "tiles_base/product/";
    }
}
