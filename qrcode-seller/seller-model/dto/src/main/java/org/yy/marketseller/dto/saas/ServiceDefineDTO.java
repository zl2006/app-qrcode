/*
* 文 件 名:  ServiceDefineDTO.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  服务定义查询条件
* 修 改 人:  zhouliang
* 修改时间:  2015年6月15日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.dto.saas;

import org.yy.framework.basedata.query.AbstractQueryDto;

/**
* 服务定义查询条件
* 
* @author  zhouliang
* @version  [１.０, 2015年6月15日]
* @since  [开店助手-超级营销--传输对象层/1.0]
*/
public class ServiceDefineDTO extends AbstractQueryDto {
    
     /**
     * 注释内容
     */
    private static final long serialVersionUID = -7494860151400989366L;
    /**
     * 服务所属类目
     */
    private Integer categoryID;
    
    /**
    * @return 返回 categoryID
    */
    public Integer getCategoryID() {
        return categoryID;
    }
    
    /**
    * @param 对categoryID进行赋值
    */
    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }
    
}
