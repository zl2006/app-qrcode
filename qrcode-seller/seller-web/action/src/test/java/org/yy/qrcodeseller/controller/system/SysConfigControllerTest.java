package org.yy.qrcodeseller.controller.system;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.yy.framework.base.test.AbstractMVCSpringTest;
import org.yy.framework.basedata.Constants;
import org.yy.marketseller.model.system.SysConfig;

public class SysConfigControllerTest extends AbstractMVCSpringTest {
    
    @Test
    public void testList()
        throws Exception {
        MvcResult result =
            mockMvc.perform(MockMvcRequestBuilders.get("/system/sysconfig/detail.do").param("code", "test1"))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
        //SysConfig o = (SysConfig)result.getModelAndView().getModel();
        Map<String,Object> modelMap =  result.getModelAndView().getModel();
        SysConfig o = (SysConfig)modelMap.get(Constants.RESULT_DATA_NAME);
        Assert.assertEquals("test1", o.getCode());
        Assert.assertEquals("test1", o.getName());
        Assert.assertTrue(o.getIsSingleValue());
        Assert.assertEquals("test1", o.getValuess());
    }
}