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
 * 
 * @author wangzj
 * @since 2021-02-15 21:51:57
 */
@ApiModel
@Data
@TableName("pms_product_operate_log")
public class ProductOperateLog implements Serializable {
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
	@ApiModelProperty(name = "priceOld",value = "")
	private BigDecimal priceOld;
	/**
	 * 
	 */
	@ApiModelProperty(name = "priceNew",value = "")
	private BigDecimal priceNew;
	/**
	 * 
	 */
	@ApiModelProperty(name = "salePriceOld",value = "")
	private BigDecimal salePriceOld;
	/**
	 * 
	 */
	@ApiModelProperty(name = "salePriceNew",value = "")
	private BigDecimal salePriceNew;
	/**
	 * 赠送的积分
	 */
	@ApiModelProperty(name = "giftPointOld",value = "赠送的积分")
	private Integer giftPointOld;
	/**
	 * 
	 */
	@ApiModelProperty(name = "giftPointNew",value = "")
	private Integer giftPointNew;
	/**
	 * 
	 */
	@ApiModelProperty(name = "usePointLimitOld",value = "")
	private Integer usePointLimitOld;
	/**
	 * 
	 */
	@ApiModelProperty(name = "usePointLimitNew",value = "")
	private Integer usePointLimitNew;
	/**
	 * 操作人
	 */
	@ApiModelProperty(name = "operateMan",value = "操作人")
	private String operateMan;
	/**
	 * 
	 */
	@ApiModelProperty(name = "createTime",value = "")
	private Date createTime;

}
