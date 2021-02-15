package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 产品阶梯价格表(只针对同商品)
 * @author wangzj
 * @since 2021-02-15 21:51:57
 */
@ApiModel
@Data
@TableName("pms_product_ladder")
public class ProductLadder implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "")
	private Long id;
	/**
	 * 
	 */
	@ApiModelProperty(name = "productId",value = "")
	private Long productId;
	/**
	 * 满足的商品数量
	 */
	@ApiModelProperty(name = "count",value = "满足的商品数量")
	private Integer count;
	/**
	 * 折扣
	 */
	@ApiModelProperty(name = "discount",value = "折扣")
	private BigDecimal discount;
	/**
	 * 折后价格
	 */
	@ApiModelProperty(name = "price",value = "折后价格")
	private BigDecimal price;

}
