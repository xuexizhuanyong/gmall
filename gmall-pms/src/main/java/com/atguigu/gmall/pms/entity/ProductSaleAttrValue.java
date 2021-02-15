package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu销售属性值
 * @author wangzj
 * @since 2021-02-15 21:51:58
 */
@ApiModel
@Data
@TableName("pms_product_sale_attr_value")
public class ProductSaleAttrValue implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "id")
	private Long id;
	/**
	 * 商品id
	 */
	@ApiModelProperty(name = "productId",value = "商品id")
	private Long productId;
	/**
	 * 销售属性id
	 */
	@ApiModelProperty(name = "saleAttrId",value = "销售属性id")
	private Long saleAttrId;
	/**
	 * 销售属性值名称
	 */
	@ApiModelProperty(name = "saleAttrValueName",value = "销售属性值名称")
	private String saleAttrValueName;

}
