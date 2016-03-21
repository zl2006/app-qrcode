/*
* 文 件 名:  CategoryDao.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  类目数据库操作
* 修 改 人:  zhouliang
* 修改时间:  2016年3月21日
* 修改内容:  <修改内容>
*/
package org.yy.qrcodeseller.dao.product;

import org.springframework.stereotype.Repository;
import org.yy.framework.base.dao.AbstractMyBatisDao;
import org.yy.qrcodeseller.model.product.Category;

/**
* 类目数据库操作
* 
* @author  zhouliang
* @version  [1.0, 2016年3月21日]
* @since  [qrcodeseller/1.0]
*/
@Repository("categoryDao")
public class CategoryDao extends AbstractMyBatisDao {
    
    public Category findCategory(Integer categoryID) {
        return sqlSession.selectOne("PRODUCT.FIND_CATEGORY_BY_ID", categoryID);
    }
}
