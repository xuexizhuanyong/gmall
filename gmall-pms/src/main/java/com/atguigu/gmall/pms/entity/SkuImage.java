package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 库存单元图片表
 * @author wangzj
 * @since 2021-02-15 21:51:57
 */
@ApiModel
@Data
@TableName("pms_sku_image")
public class SkuImage implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "编号")
	private Long id;
	/**
	 * 商品id
	 */
	@ApiModelProperty(name = "skuId",value = "商品id")
	private Long skuId;
	/**
	 * 图片名称（冗余）
	 */
	@ApiModelProperty(name = "imgName",value = "图片名称（冗余）")
	private String imgName;
	/**
	 * 图片路径(冗余)
	 */
	@ApiModelProperty(name = "imgUrl",value = "图片路径(冗余)")
	private String imgUrl;
	/**
	 * 商品图片id
	 */
	@ApiModelProperty(name = "productImgId",value = "商品图片id")
	private Long productImgId;
	/**
	 * 是否默认
	 */
	@ApiModelProperty(name = "isDefault",value = "是否默认")
	private String isDefault;

}
