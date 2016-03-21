/*
* 文 件 名:  Category.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  产品类目
* 修 改 人:  zhouliang
* 修改时间:  2016年3月21日
* 修改内容:  <修改内容>
*/
package org.yy.qrcodeseller.model.product;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.yy.framework.document.anno.Field;
import org.yy.framework.document.anno.Model;
import org.yy.framework.document.anno.TypeEnum;

/**
* 产品类目
* 
* @author  zhouliang
* @version  [1.0, 2016年3月21日]
* @since  [qrcodeseller/1.0]
*/
@Model(name = "产品类目", desc = "产品类目,一般定义两级类目，只允许叶子节点有类目属性")
public class Category implements Serializable {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 4700653901978128744L;
    
    @Field(cnname = "类目标识", desc = "类目标识，数据库自动增长", type = TypeEnum.INTETER)
    private Integer categoryID;
    
    @Field(cnname = "类目编码", desc = "类目编码，可以由类目名称的首个字母组成", type = TypeEnum.STRING, nullable = false, length = 32)
    @NotEmpty(message = "类目编码不能为空！")
    @Size(min = 0, max = 32, message = "类目编码长度必须在0到32之间")
    private String code;
    
    @Field(cnname = "类目名称", desc = "类目名称", type = TypeEnum.STRING, nullable = false, length = 64)
    @NotEmpty(message = "类目名称不能为空！")
    @Size(min = 0, max = 64, message = "类目名称长度必须在0到64之间")
    private String name;
    
    @Field(cnname = "父类目", desc = "父类目，如果为顶级类目时为-1", type = TypeEnum.INTETER, nullable = false)
    @NotEmpty(message = "父类目不能为空！")
    private Integer parentID = -1;
    
    @Field(cnname = "是否页子节点", desc = "是否页子节点，页子节点才有属性信息。1为页子节点", type = TypeEnum.INTETER, nullable = false)
    @NotEmpty(message = "是否页子节点不能为空！")
    private Boolean isLeaf;
    
    @Field(cnname = "状态", desc = "状态：0为无效，1为有效，默认为1。", type = TypeEnum.INTETER, nullable = false)
    @NotEmpty(message = "状态不能为空！")
    private Boolean status = true;
    
    @Field(cnname = "备用", desc = "备用", type = TypeEnum.STRING)
    @Size(min = 0, max = 128, message = "备用数据长度必须在0到128之间")
    private String hold1;
    
    @Field(cnname = "备注", desc = "备注", type = TypeEnum.STRING)
    @Size(min = 0, max = 128, message = "备注数据长度必须在0到128之间")
    private String meto;
    
    @Field(cnname = "创建时间", desc = "创建时间", type = TypeEnum.DATE, nullable = false)
    @NotEmpty(message = "创建时间不能为空！")
    private Date createTime;
    
    @Field(cnname = "更新时间", desc = "创建时间", type = TypeEnum.DATE, nullable = false)
    @NotEmpty(message = "更新时间不能为空！")
    private Date updateTime;
    
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
    * @return 返回 name
    */
    public String getName() {
        return name;
    }
    
    /**
    * @param 对name进行赋值
    */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
    * @return 返回 parentID
    */
    public Integer getParentID() {
        return parentID;
    }
    
    /**
    * @param 对parentID进行赋值
    */
    public void setParentID(Integer parentID) {
        this.parentID = parentID;
    }
    
    /**
    * @return 返回 isLeaf
    */
    public Boolean getIsLeaf() {
        return isLeaf;
    }
    
    /**
    * @param 对isLeaf进行赋值
    */
    public void setIsLeaf(Boolean isLeaf) {
        this.isLeaf = isLeaf;
    }
    
    /**
    * @return 返回 status
    */
    public Boolean getStatus() {
        return status;
    }
    
    /**
    * @param 对status进行赋值
    */
    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    /**
    * @return 返回 hold1
    */
    public String getHold1() {
        return hold1;
    }
    
    /**
    * @param 对hold1进行赋值
    */
    public void setHold1(String hold1) {
        this.hold1 = hold1;
    }
    
    /**
    * @return 返回 meto
    */
    public String getMeto() {
        return meto;
    }
    
    /**
    * @param 对meto进行赋值
    */
    public void setMeto(String meto) {
        this.meto = meto;
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
    
    /**
    * @return 返回 updateTime
    */
    public Date getUpdateTime() {
        return updateTime;
    }
    
    /**
    * @param 对updateTime进行赋值
    */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    
    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "Category [categoryID=" + categoryID + ", code=" + code + ", name=" + name + ", parentID=" + parentID
            + ", isLeaf=" + isLeaf + ", status=" + status + ", hold1=" + hold1 + ", meto=" + meto + ", createTime="
            + createTime + ", updateTime=" + updateTime + "]";
    }
    
    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((categoryID == null) ? 0 : categoryID.hashCode());
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
        result = prime * result + ((hold1 == null) ? 0 : hold1.hashCode());
        result = prime * result + ((isLeaf == null) ? 0 : isLeaf.hashCode());
        result = prime * result + ((meto == null) ? 0 : meto.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((parentID == null) ? 0 : parentID.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((updateTime == null) ? 0 : updateTime.hashCode());
        return result;
    }
    
    /** {@inheritDoc} */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Category other = (Category)obj;
        if (categoryID == null) {
            if (other.categoryID != null)
                return false;
        }
        else if (!categoryID.equals(other.categoryID))
            return false;
        if (code == null) {
            if (other.code != null)
                return false;
        }
        else if (!code.equals(other.code))
            return false;
        if (createTime == null) {
            if (other.createTime != null)
                return false;
        }
        else if (!createTime.equals(other.createTime))
            return false;
        if (hold1 == null) {
            if (other.hold1 != null)
                return false;
        }
        else if (!hold1.equals(other.hold1))
            return false;
        if (isLeaf == null) {
            if (other.isLeaf != null)
                return false;
        }
        else if (!isLeaf.equals(other.isLeaf))
            return false;
        if (meto == null) {
            if (other.meto != null)
                return false;
        }
        else if (!meto.equals(other.meto))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (parentID == null) {
            if (other.parentID != null)
                return false;
        }
        else if (!parentID.equals(other.parentID))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        }
        else if (!status.equals(other.status))
            return false;
        if (updateTime == null) {
            if (other.updateTime != null)
                return false;
        }
        else if (!updateTime.equals(other.updateTime))
            return false;
        return true;
    }
    
}
