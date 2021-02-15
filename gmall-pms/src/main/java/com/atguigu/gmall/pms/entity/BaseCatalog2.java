package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @author wangzj
 * @since 2021-02-15 21:51:58
 */
@ApiModel
@Data
@TableName("pms_base_catalog2")
public class BaseCatalog2 implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "编号")
	private Integer id;
	/**
	 * 二级分类名称
	 */
	@ApiModelProperty(name = "name",value = "二级分类名称")
	private String name;
	/**
	 * 一级分类编号
	 */
	@ApiModelProperty(name = "catalog1Id",value = "一级分类编号")
	private Integer catalog1Id;

}
