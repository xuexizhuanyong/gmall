package com.atguigu.gmall.sms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品限时购与商品关系表
 * @author wangzj
 * @since 2021-02-15 22:56:47
 */
@ApiModel
@Data
@TableName("sms_flash_promotion_product_relation")
public class FlashPromotionProductRelation implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "编号")
	private Long id;
	/**
	 * 
	 */
	@ApiModelProperty(name = "flashPromotionId",value = "")
	private Long flashPromotionId;
	/**
	 * 编号
	 */
	@ApiModelProperty(name = "flashPromotionSessionId",value = "编号")
	private Long flashPromotionSessionId;
	/**
	 * 
	 */
	@ApiModelProperty(name = "productId",value = "")
	private Long productId;
	/**
	 * 限时购价格
	 */
	@ApiModelProperty(name = "flashPromotionPrice",value = "限时购价格")
	private BigDecimal flashPromotionPrice;
	/**
	 * 限时购数量
	 */
	@ApiModelProperty(name = "flashPromotionCount",value = "限时购数量")
	private Integer flashPromotionCount;
	/**
	 * 每人限购数量
	 */
	@ApiModelProperty(name = "flashPromotionLimit",value = "每人限购数量")
	private Integer flashPromotionLimit;
	/**
	 * 排序
	 */
	@ApiModelProperty(name = "sort",value = "排序")
	private Integer sort;

}
