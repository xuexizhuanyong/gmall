package com.atguigu.gmall.sms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 限时购表
 * @author wangzj
 * @since 2021-02-15 22:56:47
 */
@ApiModel
@Data
@TableName("sms_flash_promotion")
public class FlashPromotion implements Serializable {
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
	@ApiModelProperty(name = "title",value = "")
	private String title;
	/**
	 * 开始日期
	 */
	@ApiModelProperty(name = "startDate",value = "开始日期")
	private Date startDate;
	/**
	 * 结束日期
	 */
	@ApiModelProperty(name = "endDate",value = "结束日期")
	private Date endDate;
	/**
	 * 上下线状态
	 */
	@ApiModelProperty(name = "status",value = "上下线状态")
	private Integer status;
	/**
	 * 秒杀时间段名称
	 */
	@ApiModelProperty(name = "createTime",value = "秒杀时间段名称")
	private Date createTime;

}
