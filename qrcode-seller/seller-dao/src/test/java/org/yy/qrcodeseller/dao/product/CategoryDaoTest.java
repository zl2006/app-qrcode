/*
* 文 件 名:  CategoryDaoTest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  <描述>
* 修 改 人:  zhouliang
* 修改时间:  2016年3月21日
* 修改内容:  <修改内容>
*/
package org.yy.qrcodeseller.dao.product;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.yy.framework.base.test.AbstractSpringTest;
import org.yy.qrcodeseller.model.product.Category;

/**
* <一句话功能简述>
* <功能详细描述>
* 
* @author  zhouliang
* @version  [版本号, 2016年3月21日]
* @since  [产品/模块版本]
*/
public class CategoryDaoTest extends AbstractSpringTest {
    
    @Resource
    private CategoryDao categoryDao;
    
    @Test
    public void testInsertCategory() {
        Category c = new Category();
        c.setCode("CODE");
        c.setCreateTime(new Date());
        c.setHold1("hold1");
        c.setIsLeaf(false);
        c.setMeto("meto");
        c.setName("测试类目");
        c.setParentID(-1);
        c.setStatus(true);
        c.setUpdateTime(new Date());
        int i = categoryDao.insertCategory(c);
        Assert.assertTrue(i > 0);
        Assert.assertNotNull(c.getCategoryID());
    }
    
    @Test
    public void testFindCategoryByID() {
        Category c = categoryDao.findCategoryByID(1);
        Assert.assertEquals("手机", c.getName());
        Assert.assertEquals("手机，下面可分智能手机，功能手机等", c.getMeto());
        Assert.assertEquals("hold", c.getHold1());
        Assert.assertEquals("MOBILE", c.getCode());
    }
    
    @Test
    public void testFindCategoryCode() {
        Category c = categoryDao.findCategoryByCode("FUNC_MOBILE");
        Assert.assertEquals("功能手机", c.getName());
        Assert.assertEquals("功能手机", c.getMeto());
        Assert.assertEquals("hold", c.getHold1());
        Assert.assertEquals("FUNC_MOBILE", c.getCode());
    }
    
    public void testDeleteCategoryByID() {
        int r = categoryDao.deleteCategoryByID(3);
        Assert.assertTrue(1 == r);
    }
}
