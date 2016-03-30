/*
* 文 件 名:  ProductDaoTest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  <描述>
* 修 改 人:  zhouliang
* 修改时间:  2016年3月29日
* 修改内容:  <修改内容>
*/
package org.yy.qrcodeseller.dao.product;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.yy.framework.base.test.AbstractSpringTest;
import org.yy.framework.basedata.query.ResultDto;
import org.yy.qrcodeseller.dto.product.ProductDto;
import org.yy.qrcodeseller.model.product.Product;

/**
* <一句话功能简述>
* <功能详细描述>
* 
* @author  zhouliang
* @version  [版本号, 2016年3月29日]
* @since  [产品/模块版本]
*/
public class ProductDaoTest extends AbstractSpringTest {
    
    @Resource
    private ProductDao productDao;
    
    /**
     * Test method for {@link org.yy.qrcodeseller.dao.product.ProductDao#findProductForPage(org.yy.qrcodeseller.dto.product.ProductDto)}.
     */
    @Test
    public void testFindProductForPage()
        throws Exception {
        ProductDto prdDto = new ProductDto();
        prdDto.setCategoryID(2);
        ResultDto<Product> result = productDao.findProductForPage(prdDto);
        
        Assert.assertTrue(result.getPagination().getTotal() == 3);
        Assert.assertTrue(result.getResult().size() == 3);
        
    }
}
