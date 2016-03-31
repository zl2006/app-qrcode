/*
* 文 件 名:  ProductDto.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  产品查询条件
* 修 改 人:  zhouliang
* 修改时间:  2016年3月28日
* 修改内容:  <修改内容>
*/
package org.yy.qrcodeseller.dto.product;

import org.hibernate.validator.constraints.NotEmpty;
import org.yy.framework.basedata.query.AbstractQueryDto;
import org.yy.framework.document.anno.Field;
import org.yy.framework.document.anno.Model;
import org.yy.framework.document.anno.TypeEnum;

/**
* 产品查询条件
* 
* @author  zhouliang
* @version  [1.0, 2016年3月28日]
* @since  [qrcodeseller/1.0]
*/
@Model(name = "产品查询条件", desc = "产品查询条件")
public class ProductDto extends AbstractQueryDto {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 86725680222751630L;
    
    /**
     * 产品名称
     */
    @Field(cnname = "产品名称", desc = "产品名称", type = TypeEnum.STRING, length = 128)
    private String name;
    
    /**
     * 产品编码
     */
    @Field(cnname = "产品编码", desc = "产品编码，可以由产品名称的首个字母组成", type = TypeEnum.STRING, length = 64)
    private String prdCode;
    
    /**
     * 产品类目
     */
    @Field(cnname = "产品标识", desc = "产品标识，数据库自动增长", type = TypeEnum.INTETER)
    private Integer categoryID;
    
    /**
     * 产品状态
     */
    @Field(cnname = "状态", desc = "状态，0为无效，1为有效", type = TypeEnum.INTETER)
    private Integer status;
    
    /**
     * 产品所属商家
     */
    @Field(cnname = "卖家昵称", desc = "卖家昵称", type = TypeEnum.STRING, length = 128, nullable = false)
    @NotEmpty(message = "卖家昵称不能为空！")
    private String sellerNick;
    
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
    
}
