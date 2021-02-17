package com.atguigu.gmall.sms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 限时购场次表
 * @author wangzj
 * @since 2021-02-15 22:56:47
 */
@ApiModel
@Data
@TableName("sms_flash_promotion_session")
public class FlashPromotionSession implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "编号")
	private Long id;
	/**
	 * 场次名称
	 */
	@ApiModelProperty(name = "name",value = "场次名称")
	private String name;
	/**
	 * 每日开始时间
	 */
	@ApiModelProperty(name = "startTime",value = "每日开始时间")
	private Date startTime;
	/**
	 * 每日结束时间
	 */
	@ApiModelProperty(name = "endTime",value = "每日结束时间")
	private Date endTime;
	/**
	 * 启用状态：0->不启用；1->启用
	 */
	@ApiModelProperty(name = "status",value = "启用状态：0->不启用；1->启用")
	private Integer status;
	/**
	 * 创建时间
	 */
	@ApiModelProperty(name = "createTime",value = "创建时间")
	private Date createTime;

}
