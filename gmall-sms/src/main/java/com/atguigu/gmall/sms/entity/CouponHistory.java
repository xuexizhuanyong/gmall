package com.atguigu.gmall.sms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 优惠券使用、领取历史表
 * @author wangzj
 * @since 2021-02-15 22:56:47
 */
@ApiModel
@Data
@TableName("sms_coupon_history")
public class CouponHistory implements Serializable {
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
	@ApiModelProperty(name = "couponId",value = "")
	private Long couponId;
	/**
	 * 
	 */
	@ApiModelProperty(name = "memberId",value = "")
	private Long memberId;
	/**
	 * 
	 */
	@ApiModelProperty(name = "couponCode",value = "")
	private String couponCode;
	/**
	 * 领取人昵称
	 */
	@ApiModelProperty(name = "memberNickname",value = "领取人昵称")
	private String memberNickname;
	/**
	 * 获取类型：0->后台赠送；1->主动获取
	 */
	@ApiModelProperty(name = "getType",value = "获取类型：0->后台赠送；1->主动获取")
	private Integer getType;
	/**
	 * 
	 */
	@ApiModelProperty(name = "createTime",value = "")
	private Date createTime;
	/**
	 * 使用状态：0->未使用；1->已使用；2->已过期
	 */
	@ApiModelProperty(name = "useStatus",value = "使用状态：0->未使用；1->已使用；2->已过期")
	private Integer useStatus;
	/**
	 * 使用时间
	 */
	@ApiModelProperty(name = "useTime",value = "使用时间")
	private Date useTime;
	/**
	 * 订单编号
	 */
	@ApiModelProperty(name = "orderId",value = "订单编号")
	private Long orderId;
	/**
	 * 订单号码
	 */
	@ApiModelProperty(name = "orderSn",value = "订单号码")
	private String orderSn;

}
