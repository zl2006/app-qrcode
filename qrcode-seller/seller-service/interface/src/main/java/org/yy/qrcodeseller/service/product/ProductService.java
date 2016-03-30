/*
* 文 件 名:  ProductService.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  产品服务类
* 修 改 人:  zhouliang
* 修改时间:  2016年3月30日
* 修改内容:  <修改内容>
*/
package org.yy.qrcodeseller.service.product;

import org.yy.framework.basedata.query.ResultDto;
import org.yy.qrcodeseller.dto.product.ProductDto;
import org.yy.qrcodeseller.model.product.Product;

/**
* 产品服务类
* 
* @author  zhouliang
* @version  [1.0, 2016年3月30日]
* @since  [qrcodeseller/1.0]
*/
public interface ProductService {
    
    /**
     * 查询产品列表
     * @param productDto 查询条件
     * @return 产品列表
     */
    public ResultDto<Product> findProduct(ProductDto productDto);
}
