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
 * 优惠卷表
 * @author wangzj
 * @since 2021-02-15 22:56:47
 */
@ApiModel
@Data
@TableName("sms_coupon")
public class Coupon implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "")
	private Long id;
	/**
	 * 优惠卷类型；0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券
	 */
	@ApiModelProperty(name = "type",value = "优惠卷类型；0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券")
	private Integer type;
	/**
	 * 
	 */
	@ApiModelProperty(name = "name",value = "")
	private String name;
	/**
	 * 使用平台：0->全部；1->移动；2->PC
	 */
	@ApiModelProperty(name = "platform",value = "使用平台：0->全部；1->移动；2->PC")
	private Integer platform;
	/**
	 * 数量
	 */
	@ApiModelProperty(name = "count",value = "数量")
	private Integer count;
	/**
	 * 金额
	 */
	@ApiModelProperty(name = "amount",value = "金额")
	private BigDecimal amount;
	/**
	 * 每人限领张数
	 */
	@ApiModelProperty(name = "perLimit",value = "每人限领张数")
	private Integer perLimit;
	/**
	 * 使用门槛；0表示无门槛
	 */
	@ApiModelProperty(name = "minPoint",value = "使用门槛；0表示无门槛")
	private BigDecimal minPoint;
	/**
	 * 
	 */
	@ApiModelProperty(name = "startTime",value = "")
	private Date startTime;
	/**
	 * 
	 */
	@ApiModelProperty(name = "endTime",value = "")
	private Date endTime;
	/**
	 * 使用类型：0->全场通用；1->指定分类；2->指定商品
	 */
	@ApiModelProperty(name = "useType",value = "使用类型：0->全场通用；1->指定分类；2->指定商品")
	private Integer useType;
	/**
	 * 备注
	 */
	@ApiModelProperty(name = "note",value = "备注")
	private String note;
	/**
	 * 发行数量
	 */
	@ApiModelProperty(name = "publishCount",value = "发行数量")
	private Integer publishCount;
	/**
	 * 已使用数量
	 */
	@ApiModelProperty(name = "useCount",value = "已使用数量")
	private Integer useCount;
	/**
	 * 领取数量
	 */
	@ApiModelProperty(name = "receiveCount",value = "领取数量")
	private Integer receiveCount;
	/**
	 * 可以领取的日期
	 */
	@ApiModelProperty(name = "enableTime",value = "可以领取的日期")
	private Date enableTime;
	/**
	 * 优惠码
	 */
	@ApiModelProperty(name = "code",value = "优惠码")
	private String code;
	/**
	 * 可领取的会员类型：0->无限时
	 */
	@ApiModelProperty(name = "memberLevel",value = "可领取的会员类型：0->无限时")
	private Integer memberLevel;

}
