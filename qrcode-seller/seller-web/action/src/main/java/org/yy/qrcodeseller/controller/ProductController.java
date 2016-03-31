/*
* 文 件 名:  ProductController.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  产品控制器
* 修 改 人:  zhouliang
* 修改时间:  2016年3月28日
* 修改内容:  <修改内容>
*/
package org.yy.qrcodeseller.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.yy.framework.base.controller.AbstractController;
import org.yy.qrcodeseller.dto.product.ProductDto;
import org.yy.qrcodeseller.service.product.ProductService;
import org.yy.sso.client.SSOUtil;

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
    
    @Resource
    private ProductService productService;
    
    private String moduleName;
    
    public ProductController() {
        setModuleName();
    }
    
    @RequestMapping("/list")
    public ModelAndView list(ProductDto productDto, HttpServletRequest request)
        throws Exception {
        String userID = SSOUtil.getUserID(request);
        if (productDto == null) {
            productDto = new ProductDto();
        }
        productDto.setSellerNick(userID);
        return processSuccess(moduleName + "list", productService.findProduct(productDto), productDto);
    }
    
    /** {@inheritDoc} */
    @Override
    protected void setModuleName() {
        this.moduleName = "tiles_base/product/";
    }
}
