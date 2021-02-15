package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 属性值表
 * @author wangzj
 * @since 2021-02-15 21:51:58
 */
@ApiModel
@Data
@TableName("pms_base_attr_value")
public class BaseAttrValue implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "编号")
	private Long id;
	/**
	 * 属性值名称
	 */
	@ApiModelProperty(name = "valueName",value = "属性值名称")
	private String valueName;
	/**
	 * 属性id
	 */
	@ApiModelProperty(name = "attrId",value = "属性id")
	private Long attrId;
	/**
	 * 启用：1 停用：0 1
	 */
	@ApiModelProperty(name = "isEnabled",value = "启用：1 停用：0 1")
	private String isEnabled;

}
