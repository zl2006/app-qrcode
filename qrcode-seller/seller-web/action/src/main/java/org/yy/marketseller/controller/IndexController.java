 /*
 * 文 件 名:  IndexController.java
 * 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
 * 描    述:  首页控制器
 * 修 改 人:  zhouliang
 * 修改时间:  2015年5月15日
 * 修改内容:  <修改内容>
 */
package org.yy.marketseller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.yy.framework.base.controller.AbstractController;

/**
* 首页控制器
* 
* @author  zhouliang
* @version  [1.0, 2015年5月14日]
* @since [码平台-商家后台-控制层/1.0]
*/
@Controller
public class IndexController extends AbstractController {
    
    /** {@inheritDoc} */
    @Override
    protected void setModuleName() {
        
    }
    
    @RequestMapping("/")
    public ModelAndView  idx(){
        return new ModelAndView("index");
    }
    
}
