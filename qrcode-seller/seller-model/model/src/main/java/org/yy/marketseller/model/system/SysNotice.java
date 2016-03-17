/*
* 文 件 名:  SysNotice.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  系统通知
* 修 改 人:  zhouliang
* 修改时间:  2015年8月6日
* 修改内容:  <修改内容>
*/
package org.yy.marketseller.model.system;

import java.util.Date;

/**
*  系统通知
* 
* @author  zhouliang
* @version  [1.0, 2015年5月13日]
* @since  [开店助手-超级营销-模型层/1.0]
*/
public class SysNotice {
    /**
     * 通知ID
     */
    private Long noticeID;
    
    /**
     * 标题
     */
    private String title;
    
    /**
     * 链接
     */
    private String href;
    
    /**
     * 发布时间
     */
    private Date publishTime;
    
    /**
     * 是否置顶,1为置顶
     */
    private Integer isTop = 0;
    
    /**
     * 通知类型：1为首页通知，2为弹窗通知
     */
    private Integer type = 1;
    
    /**
    * @return 返回 noticeID
    */
    public Long getNoticeID() {
        return noticeID;
    }
    
    /**
    * @param 对noticeID进行赋值
    */
    public void setNoticeID(Long noticeID) {
        this.noticeID = noticeID;
    }
    
    /**
    * @return 返回 title
    */
    public String getTitle() {
        return title;
    }
    
    /**
    * @param 对title进行赋值
    */
    public void setTitle(String title) {
        this.title = title;
    }
    
    /**
    * @return 返回 href
    */
    public String getHref() {
        return href;
    }
    
    /**
    * @param 对href进行赋值
    */
    public void setHref(String href) {
        this.href = href;
    }
    
    /**
    * @return 返回 publishTime
    */
    public Date getPublishTime() {
        return publishTime;
    }
    
    /**
    * @param 对publishTime进行赋值
    */
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }
    
    /**
    * @return 返回 isTop
    */
    public Integer getIsTop() {
        return isTop;
    }
    
    /**
    * @param 对isTop进行赋值
    */
    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }
    
    /**
    * @return 返回 type
    */
    public Integer getType() {
        return type;
    }
    
    /**
    * @param 对type进行赋值
    */
    public void setType(Integer type) {
        this.type = type;
    }
    
}
