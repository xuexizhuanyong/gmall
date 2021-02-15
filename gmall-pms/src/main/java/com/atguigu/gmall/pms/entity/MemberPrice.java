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
 * 商品会员价格表
 * @author wangzj
 * @since 2021-02-15 21:51:57
 */
@ApiModel
@Data
@TableName("pms_member_price")
public class MemberPrice implements Serializable {
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
	@ApiModelProperty(name = "memberLevelId",value = "")
	private Long memberLevelId;
	/**
	 * 会员价格
	 */
	@ApiModelProperty(name = "memberPrice",value = "会员价格")
	private BigDecimal memberPrice;
	/**
	 * 
	 */
	@ApiModelProperty(name = "memberLevelName",value = "")
	private String memberLevelName;

}
