/*
* 文 件 名:  ProductServiceImpl.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  产品服务
* 修 改 人:  zhouliang
* 修改时间:  2016年3月30日
* 修改内容:  <修改内容>
*/
package org.yy.qrcodeseller.service.product.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.yy.framework.basedata.query.ResultDto;
import org.yy.qrcodeseller.dao.product.ProductDao;
import org.yy.qrcodeseller.dto.product.ProductDto;
import org.yy.qrcodeseller.model.product.Product;
import org.yy.qrcodeseller.service.product.ProductService;

/**
*  产品服务
* 
* @author  zhouliang
* @version  [1.0, 2016年3月30日]
* @since  [qrcodeseller/1.0]
*/
@Service
public class ProductServiceImpl implements ProductService {
    
    @Resource
    private ProductDao productDao;
    
    /** {@inheritDoc} */
    @Override
    public ResultDto<Product> findProduct(ProductDto productDto) {
        return productDao.findProductForPage(productDto);
    }
    
}
