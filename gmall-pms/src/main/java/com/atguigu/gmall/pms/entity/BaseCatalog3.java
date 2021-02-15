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
@TableName("pms_base_catalog3")
public class BaseCatalog3 implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "编号")
	private Long id;
	/**
	 * 三级分类名称
	 */
	@ApiModelProperty(name = "name",value = "三级分类名称")
	private String name;
	/**
	 * 二级分类编号
	 */
	@ApiModelProperty(name = "catalog2Id",value = "二级分类编号")
	private Long catalog2Id;

}
