package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sku销售属性值
 * @author wangzj
 * @since 2021-02-15 21:51:58
 */
@ApiModel
@Data
@TableName("pms_sku_sale_attr_value")
public class SkuSaleAttrValue implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "id")
	private Long id;
	/**
	 * 库存单元id
	 */
	@ApiModelProperty(name = "skuId",value = "库存单元id")
	private Long skuId;
	/**
	 * 销售属性id（冗余)
	 */
	@ApiModelProperty(name = "saleAttrId",value = "销售属性id（冗余)")
	private Long saleAttrId;
	/**
	 * 销售属性值id
	 */
	@ApiModelProperty(name = "saleAttrValueId",value = "销售属性值id")
	private Long saleAttrValueId;
	/**
	 * 销售属性名称(冗余)
	 */
	@ApiModelProperty(name = "saleAttrName",value = "销售属性名称(冗余)")
	private String saleAttrName;
	/**
	 * 销售属性值名称(冗余)
	 */
	@ApiModelProperty(name = "saleAttrValueName",value = "销售属性值名称(冗余)")
	private String saleAttrValueName;

}
