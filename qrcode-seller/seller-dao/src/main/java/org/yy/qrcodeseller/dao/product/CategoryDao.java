/*
* 文 件 名:  CategoryDao.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  类目数据库操作
* 修 改 人:  zhouliang
* 修改时间:  2016年3月21日
* 修改内容:  <修改内容>
*/
package org.yy.qrcodeseller.dao.product;

import org.yy.qrcodeseller.model.product.Category;

/**
* 类目数据库操作
* 
* @author  zhouliang
* @version  [1.0, 2016年3月21日]
* @since  [qrcodeseller/1.0]
*/
public interface CategoryDao {
    
    /**
     * 根据类目ID查询类目详情
     * @param categoryID 类目ID
     * @return 类目
     */
    public Category findCategoryByID(Integer categoryID);
    
    /**
     * 根据类目ID查询类目详情
     * @param code 类目编码
     * @return 类目
     */
    public Category findCategoryByCode(String code);
    
    /**
     * 插入类目
     * @param catetory 类目
     * @return 记录数
     */
    public Integer insertCategory(Category category);
    
    /**
     * 更新类目
     * @param category 类目
     * @return 记录数
     */
    public Integer updateCategory(Category category);
    
    /**
     * 删除类目
     * @param code 类目code
     * @return 记录数
     */
    public Integer deleteCategoryByID(Integer categoryID);
}
