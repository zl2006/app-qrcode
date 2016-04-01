/*
* 文 件 名:  ProductControllerTest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  <描述>
* 修 改 人:  zhouliang
* 修改时间:  2016年3月30日
* 修改内容:  <修改内容>
*/
package org.yy.qrcodeseller.controller;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.yy.framework.base.test.AbstractMVCSpringTest;
import org.yy.framework.basedata.query.ResultDto;
import org.yy.qrcodeseller.model.product.Product;

/**
* <一句话功能简述>
* <功能详细描述>
* 
* @author  zhouliang
* @version  [版本号, 2016年3月30日]
* @since  [产品/模块版本]
*/
public class ProductControllerTest extends AbstractMVCSpringTest {
    
    /**
     * Test method for {@link org.yy.qrcodeseller.controller.ProductController#list(org.yy.qrcodeseller.dto.product.ProductDto)}.
     */
    @SuppressWarnings("unchecked")
    @Test
    public void testList()
        throws Exception {
        MvcResult result =
            mockMvc.perform(MockMvcRequestBuilders.get("/product/list")
                .sessionAttr("_userid_", "18665867002")
                .param("name", "红米"))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
        ResultDto<Product> productResult = (ResultDto<Product>)result.getModelAndView().getModel().get("data");
        Assert.assertTrue(productResult.getResult().size() >= 2);
        
    }
    
}
