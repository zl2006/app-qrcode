/*
* 文 件 名:  ProductDao.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  产品DAO
* 修 改 人:  zhouliang
* 修改时间:  2016年3月28日
* 修改内容:  <修改内容>
*/
package org.yy.qrcodeseller.dao.product;

import org.yy.framework.basedata.query.ResultDto;
import org.yy.qrcodeseller.dto.product.ProductDto;
import org.yy.qrcodeseller.model.product.Product;

/**
* 产品DAO
* 
* @author  zhouliang
* @version  [1.0, 2016年3月28日]
* @since  [qrcodeseller/1.0]
*/
public interface ProductDao {
    
    /**
     * 根据产品列表（分页）
     * @param productDto 产品查询条件
     * @return 产品列表
     */
    public ResultDto<Product> findProductForPage(ProductDto productDto);
    
    //非分页
    //public List<Product> findProductForList(ProductDto productDto);
}
