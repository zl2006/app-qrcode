/*
* 文 件 名:  CategoryDaoTest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  <描述>
* 修 改 人:  zhouliang
* 修改时间:  2016年3月21日
* 修改内容:  <修改内容>
*/
package org.yy.qrcodeseller.dao.product;

import javax.annotation.Resource;

import org.junit.Test;
import org.yy.framework.base.test.AbstractSpringTest;

/**
* <一句话功能简述>
* <功能详细描述>
* 
* @author  zhouliang
* @version  [版本号, 2016年3月21日]
* @since  [产品/模块版本]
*/
public class CategoryDaoTest extends AbstractSpringTest {
    
    @Resource(name="categoryDao")
    private CategoryDao categoryDao;
    
    /**
     * Test method for {@link org.yy.qrcodeseller.dao.product.CategoryDao#findCategory(java.lang.Integer)}.
     */
    @Test
    public void testFindCategory() {
        categoryDao.findCategory(1);
    }
    
}
