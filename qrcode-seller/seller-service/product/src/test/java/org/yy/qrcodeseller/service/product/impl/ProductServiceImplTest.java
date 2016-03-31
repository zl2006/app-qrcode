/*
* 文 件 名:  ProductServiceImplTest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  <描述>
* 修 改 人:  zhouliang
* 修改时间:  2016年3月30日
* 修改内容:  <修改内容>
*/
package org.yy.qrcodeseller.service.product.impl;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.yy.framework.base.test.AbstractSpringTest;
import org.yy.framework.basedata.query.ResultDto;
import org.yy.qrcodeseller.dto.product.ProductDto;
import org.yy.qrcodeseller.model.product.Product;
import org.yy.qrcodeseller.service.product.ProductService;

/**
* <一句话功能简述>
* <功能详细描述>
* 
* @author  zhouliang
* @version  [版本号, 2016年3月30日]
* @since  [产品/模块版本]
*/
public class ProductServiceImplTest extends AbstractSpringTest {
    
    @Resource
    private ProductService productService;
    
    /**
     * Test method for {@link org.yy.qrcodeseller.service.product.impl.ProductServiceImpl#findProduct(org.yy.qrcodeseller.dto.product.ProductDto)}.
     */
    @Test
    public void testFindProduct()
        throws Exception {
        ProductDto dto = new ProductDto();
        dto.setName("红米");
        ResultDto<Product> rs = productService.findProduct(dto);
        Assert.assertTrue(rs.getPagination().getTotal() >= 2);
        dto = new ProductDto();
        dto.setCategoryID(2);
        rs = productService.findProduct(dto);
        Assert.assertTrue(rs.getPagination().getTotal() >= 3);
    }
    
}
