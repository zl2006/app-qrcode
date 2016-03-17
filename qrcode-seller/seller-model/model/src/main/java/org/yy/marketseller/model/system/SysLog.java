/*
* 文 件 名:  SysLog.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  系统日志
* 修 改 人:  zhouliang
* 修改时间:  2015年8月6日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.system;

import java.util.Date;

/**
*系统日志
* 
* @author  zhouliang
* @version  [1.0, 2015年5月13日]
* @since  [开店助手-超级营销-模型层/1.0]
*/
public class SysLog {
    private Long logID;
    
    /**
     * 日志编码，主要记录错误编码
     */
    private String code;
    
    /**
     * 日志级别：DEBUG、WARN、INFO、ERROR
     */
    private String level;
    
    /**
     * 日志简述
     */
    private String resume;
    
    /**
     * 日志内容
     */
    private String content;
    
    private Date createTime;
    
    /**
    * @return 返回 logID
    */
    public Long getLogID() {
        return logID;
    }
    
    /**
    * @param 对logID进行赋值
    */
    public void setLogID(Long logID) {
        this.logID = logID;
    }
    
    /**
    * @return 返回 code
    */
    public String getCode() {
        return code;
    }
    
    /**
    * @param 对code进行赋值
    */
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
    * @return 返回 level
    */
    public String getLevel() {
        return level;
    }
    
    /**
    * @param 对level进行赋值
    */
    public void setLevel(String level) {
        this.level = level;
    }
    
    /**
    * @return 返回 resume
    */
    public String getResume() {
        return resume;
    }
    
    /**
    * @param 对resume进行赋值
    */
    public void setResume(String resume) {
        this.resume = resume;
    }
    
    /**
    * @return 返回 content
    */
    public String getContent() {
        return content;
    }
    
    /**
    * @param 对content进行赋值
    */
    public void setContent(String content) {
        this.content = content;
    }
    
    /**
    * @return 返回 createTime
    */
    public Date getCreateTime() {
        return createTime;
    }
    
    /**
    * @param 对createTime进行赋值
    */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
}
