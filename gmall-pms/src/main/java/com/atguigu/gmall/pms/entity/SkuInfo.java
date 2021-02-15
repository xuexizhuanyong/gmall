package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 库存单元表
 * @author wangzj
 * @since 2021-02-15 21:51:58
 */
@ApiModel
@Data
@TableName("pms_sku_info")
public class SkuInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 库存id(itemID)
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "库存id(itemID)")
	private Long id;
	/**
	 * 商品id
	 */
	@ApiModelProperty(name = "productId",value = "商品id")
	private Long productId;
	/**
	 * 价格
	 */
	@ApiModelProperty(name = "price",value = "价格")
	private Double price;
	/**
	 * sku名称
	 */
	@ApiModelProperty(name = "skuName",value = "sku名称")
	private String skuName;
	/**
	 * 商品规格描述
	 */
	@ApiModelProperty(name = "skuDesc",value = "商品规格描述")
	private String skuDesc;
	/**
	 * 
	 */
	@ApiModelProperty(name = "weight",value = "")
	private Double weight;
	/**
	 * 品牌(冗余)
	 */
	@ApiModelProperty(name = "tmId",value = "品牌(冗余)")
	private Long tmId;
	/**
	 * 三级分类id（冗余)
	 */
	@ApiModelProperty(name = "catalog3Id",value = "三级分类id（冗余)")
	private Long catalog3Id;
	/**
	 * 默认显示图片(冗余)
	 */
	@ApiModelProperty(name = "skuDefaultImg",value = "默认显示图片(冗余)")
	private String skuDefaultImg;

}
