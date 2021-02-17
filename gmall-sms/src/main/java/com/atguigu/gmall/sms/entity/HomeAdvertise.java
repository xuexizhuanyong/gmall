package com.atguigu.gmall.sms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 首页轮播广告表
 * @author wangzj
 * @since 2021-02-15 22:56:47
 */
@ApiModel
@Data
@TableName("sms_home_advertise")
public class HomeAdvertise implements Serializable {
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
	@ApiModelProperty(name = "name",value = "")
	private String name;
	/**
	 * 轮播位置：0->PC首页轮播；1->app首页轮播
	 */
	@ApiModelProperty(name = "type",value = "轮播位置：0->PC首页轮播；1->app首页轮播")
	private Integer type;
	/**
	 * 
	 */
	@ApiModelProperty(name = "pic",value = "")
	private String pic;
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
	 * 上下线状态：0->下线；1->上线
	 */
	@ApiModelProperty(name = "status",value = "上下线状态：0->下线；1->上线")
	private Integer status;
	/**
	 * 点击数
	 */
	@ApiModelProperty(name = "clickCount",value = "点击数")
	private Integer clickCount;
	/**
	 * 下单数
	 */
	@ApiModelProperty(name = "orderCount",value = "下单数")
	private Integer orderCount;
	/**
	 * 链接地址
	 */
	@ApiModelProperty(name = "url",value = "链接地址")
	private String url;
	/**
	 * 备注
	 */
	@ApiModelProperty(name = "note",value = "备注")
	private String note;
	/**
	 * 排序
	 */
	@ApiModelProperty(name = "sort",value = "排序")
	private Integer sort;

}
