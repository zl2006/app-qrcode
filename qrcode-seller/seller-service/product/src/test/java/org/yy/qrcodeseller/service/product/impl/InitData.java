/*
* 文 件 名:  InitData.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  <描述>
* 修 改 人:  zhouliang
* 修改时间:  2016年3月21日
* 修改内容:  <修改内容>
*/
package org.yy.qrcodeseller.service.product.impl;

import java.io.InputStreamReader;
import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.jdbc.ScriptRunner;
import org.yy.qrcodeseller.dao.product.CategoryDao;

/**
* <一句话功能简述>
* <功能详细描述>
* 
* @author  zhouliang
* @version  [版本号, 2016年3月21日]
* @since  [产品/模块版本]
*/
public class InitData {
    
    private DataSource dataSource;
    
    public void init()
        throws Exception {
        
        Connection connect = dataSource.getConnection();
        //清理数据库
        ScriptRunner r = new ScriptRunner(connect);
        InputStreamReader isr =
            new InputStreamReader(CategoryDao.class.getClassLoader().getResourceAsStream("sql/clear.sql"));
        r.runScript(isr);
        
        isr = new InputStreamReader(CategoryDao.class.getClassLoader().getResourceAsStream("sql/createtable.sql"));
        r.runScript(isr);
        
        isr = new InputStreamReader(CategoryDao.class.getClassLoader().getResourceAsStream("sql/initdata.sql"));
        r.runScript(isr);
        
        isr = null;
        
        connect.close();
        
    }
    
    /**
    * @param 对dataSource进行赋值
    */
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    
}
