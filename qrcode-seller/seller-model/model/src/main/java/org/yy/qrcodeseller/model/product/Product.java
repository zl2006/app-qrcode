/*
* 文 件 名:  Product.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  产品信息
* 修 改 人:  zhouliang
* 修改时间:  2016年3月28日
* 修改内容:  <修改内容>
*/
package org.yy.qrcodeseller.model.product;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.yy.framework.document.anno.Field;
import org.yy.framework.document.anno.Model;
import org.yy.framework.document.anno.TypeEnum;

/**
* 产品信息
* 
* @author  zhouliang
* @version  [1.0, 2016年3月28日]
* @since  [qrcodeseller/1.0]
*/
@Model(name = "产品信息", desc = "产品信息,定义产品名称，品牌，图片等基本属性")
public class Product implements Serializable {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -997550754718534832L;
    
    @Field(cnname = "产品标识", desc = "产品标识，数据库自动增长", type = TypeEnum.INTETER)
    private Integer productId;
    
    @Field(cnname = "产品编码", desc = "产品编码，可以由产品名称的首个字母组成", type = TypeEnum.STRING, length = 64)
    @Size(min = 0, max = 64, message = "产品编码长度必须在0到64之间")
    private String prdCode;
    
    @Field(cnname = "类目标识", desc = "类目标识", type = TypeEnum.INTETER, nullable = false)
    @NotEmpty(message = "类目标识不能为空")
    private Integer categoryID;
    
    @Field(cnname = "产品名称", desc = "产品名称", type = TypeEnum.STRING, nullable = false, length = 128)
    @NotEmpty(message = "产品名称不能为空！")
    @Size(min = 1, max = 128, message = "产品名称长度必须在1到128之间")
    private String name;
    
    @Field(cnname = "品牌名称", desc = "品牌名称", type = TypeEnum.STRING, length = 128)
    @Size(min = 0, max = 128, message = "品牌名称长度必须在0到128之间")
    private String brand;
    
    @Field(cnname = "产品标题", desc = "产品标题", type = TypeEnum.STRING, length = 64)
    @Size(min = 0, max = 64, message = "产品标题长度必须在0到64之间")
    private String title;
    
    @Field(cnname = "价格", desc = "价格", type = TypeEnum.INTETER)
    @Min(value = 0, message = "价格不能为负数")
    private Integer price;
    
    @Field(cnname = "图片一", desc = "图片一", type = TypeEnum.STRING, length = 128)
    @Size(min = 0, max = 128, message = "图片地址必须在0到128之间")
    private String image1Url;
    
    @Field(cnname = "图片二", desc = "图片二", type = TypeEnum.STRING, length = 128)
    @Size(min = 0, max = 128, message = "图片地址必须在0到128之间")
    private String image2Url;
    
    @Field(cnname = "图片三", desc = "图片三", type = TypeEnum.STRING, length = 128)
    @Size(min = 0, max = 128, message = "图片地址必须在0到128之间")
    private String image3Url;
    
    @Field(cnname = "产品链接", desc = "产品链接 ", type = TypeEnum.STRING, length = 128)
    @Size(min = 0, max = 128, message = "产品链接必须在0到128之间")
    private String proUrl;
    
    @Field(cnname = "备注信息", desc = "备注信息", type = TypeEnum.STRING, length = 128)
    @Size(min = 0, max = 128, message = "备注信息必须在0到128之间")
    private String meto;
    
    @Field(cnname = "状态", desc = "状态，0为无效，1为有效", type = TypeEnum.INTETER, nullable = false)
    @NotEmpty(message = "状态不能为空")
    private Integer status;
    
    @Field(cnname = "卖家昵称", desc = "卖家昵称", type = TypeEnum.STRING, length = 128, nullable = false)
    @NotEmpty(message = "卖家不能为空")
    @Size(min = 1, max = 128, message = "卖家昵称必须在1到128之间")
    private String sellerNick;
    
    @Field(cnname = "创建时间", desc = "创建时间", type = TypeEnum.DATE, nullable = false)
    @NotEmpty(message = "创建时间不能为空")
    private Date createTime;
    
    @Field(cnname = "更新时间", desc = "更新时间", type = TypeEnum.DATE, nullable = false)
    @NotEmpty(message = "更新不能为空")
    private Date updateTime;
    
    /**
    * @return 返回 productId
    */
    public Integer getProductId() {
        return productId;
    }
    
    /**
    * @param 对productId进行赋值
    */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    
    /**
    * @return 返回 prdCode
    */
    public String getPrdCode() {
        return prdCode;
    }
    
    /**
    * @param 对prdCode进行赋值
    */
    public void setPrdCode(String prdCode) {
        this.prdCode = prdCode;
    }
    
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
    * @return 返回 brand
    */
    public String getBrand() {
        return brand;
    }
    
    /**
    * @param 对brand进行赋值
    */
    public void setBrand(String brand) {
        this.brand = brand;
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
    * @return 返回 price
    */
    public Integer getPrice() {
        return price;
    }
    
    /**
    * @param 对price进行赋值
    */
    public void setPrice(Integer price) {
        this.price = price;
    }
    
    /**
    * @return 返回 image1Url
    */
    public String getImage1Url() {
        return image1Url;
    }
    
    /**
    * @param 对image1Url进行赋值
    */
    public void setImage1Url(String image1Url) {
        this.image1Url = image1Url;
    }
    
    /**
    * @return 返回 image2Url
    */
    public String getImage2Url() {
        return image2Url;
    }
    
    /**
    * @param 对image2Url进行赋值
    */
    public void setImage2Url(String image2Url) {
        this.image2Url = image2Url;
    }
    
    /**
    * @return 返回 image3Url
    */
    public String getImage3Url() {
        return image3Url;
    }
    
    /**
    * @param 对image3Url进行赋值
    */
    public void setImage3Url(String image3Url) {
        this.image3Url = image3Url;
    }
    
    /**
    * @return 返回 proUrl
    */
    public String getProUrl() {
        return proUrl;
    }
    
    /**
    * @param 对proUrl进行赋值
    */
    public void setProUrl(String proUrl) {
        this.proUrl = proUrl;
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
    * @return 返回 status
    */
    public Integer getStatus() {
        return status;
    }
    
    /**
    * @param 对status进行赋值
    */
    public void setStatus(Integer status) {
        this.status = status;
    }
    
    /**
    * @return 返回 sellerNick
    */
    public String getSellerNick() {
        return sellerNick;
    }
    
    /**
    * @param 对sellerNick进行赋值
    */
    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + ((categoryID == null) ? 0 : categoryID.hashCode());
        result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
        result = prime * result + ((image1Url == null) ? 0 : image1Url.hashCode());
        result = prime * result + ((image2Url == null) ? 0 : image2Url.hashCode());
        result = prime * result + ((image3Url == null) ? 0 : image3Url.hashCode());
        result = prime * result + ((meto == null) ? 0 : meto.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((prdCode == null) ? 0 : prdCode.hashCode());
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        result = prime * result + ((proUrl == null) ? 0 : proUrl.hashCode());
        result = prime * result + ((productId == null) ? 0 : productId.hashCode());
        result = prime * result + ((sellerNick == null) ? 0 : sellerNick.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
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
        Product other = (Product)obj;
        if (brand == null) {
            if (other.brand != null)
                return false;
        }
        else if (!brand.equals(other.brand))
            return false;
        if (categoryID == null) {
            if (other.categoryID != null)
                return false;
        }
        else if (!categoryID.equals(other.categoryID))
            return false;
        if (createTime == null) {
            if (other.createTime != null)
                return false;
        }
        else if (!createTime.equals(other.createTime))
            return false;
        if (image1Url == null) {
            if (other.image1Url != null)
                return false;
        }
        else if (!image1Url.equals(other.image1Url))
            return false;
        if (image2Url == null) {
            if (other.image2Url != null)
                return false;
        }
        else if (!image2Url.equals(other.image2Url))
            return false;
        if (image3Url == null) {
            if (other.image3Url != null)
                return false;
        }
        else if (!image3Url.equals(other.image3Url))
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
        if (prdCode == null) {
            if (other.prdCode != null)
                return false;
        }
        else if (!prdCode.equals(other.prdCode))
            return false;
        if (price == null) {
            if (other.price != null)
                return false;
        }
        else if (!price.equals(other.price))
            return false;
        if (proUrl == null) {
            if (other.proUrl != null)
                return false;
        }
        else if (!proUrl.equals(other.proUrl))
            return false;
        if (productId == null) {
            if (other.productId != null)
                return false;
        }
        else if (!productId.equals(other.productId))
            return false;
        if (sellerNick == null) {
            if (other.sellerNick != null)
                return false;
        }
        else if (!sellerNick.equals(other.sellerNick))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        }
        else if (!status.equals(other.status))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        }
        else if (!title.equals(other.title))
            return false;
        if (updateTime == null) {
            if (other.updateTime != null)
                return false;
        }
        else if (!updateTime.equals(other.updateTime))
            return false;
        return true;
    }
    
    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "Product [productId=" + productId + ", prdCode=" + prdCode + ", categoryID=" + categoryID + ", name="
            + name + ", brand=" + brand + ", title=" + title + ", price=" + price + ", image1Url=" + image1Url
            + ", image2Url=" + image2Url + ", image3Url=" + image3Url + ", proUrl=" + proUrl + ", meto=" + meto
            + ", status=" + status + ", sellerNick=" + sellerNick + ", createTime=" + createTime + ", updateTime="
            + updateTime + "]";
    }
    
}
