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
 * 产品满减表(只针对同商品)
 * @author wangzj
 * @since 2021-02-15 21:51:57
 */
@ApiModel
@Data
@TableName("pms_product_full_reduction")
public class ProductFullReduction implements Serializable {
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
	 * 
	 */
	@ApiModelProperty(name = "fullPrice",value = "")
	private BigDecimal fullPrice;
	/**
	 * 
	 */
	@ApiModelProperty(name = "reducePrice",value = "")
	private BigDecimal reducePrice;

}
