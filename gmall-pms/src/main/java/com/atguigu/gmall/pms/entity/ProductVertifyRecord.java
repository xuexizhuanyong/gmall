package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品审核记录
 * @author wangzj
 * @since 2021-02-15 21:51:58
 */
@ApiModel
@Data
@TableName("pms_product_vertify_record")
public class ProductVertifyRecord implements Serializable {
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
	@ApiModelProperty(name = "createTime",value = "")
	private Date createTime;
	/**
	 * 审核人
	 */
	@ApiModelProperty(name = "vertifyMan",value = "审核人")
	private String vertifyMan;
	/**
	 * 
	 */
	@ApiModelProperty(name = "status",value = "")
	private Integer status;
	/**
	 * 反馈详情
	 */
	@ApiModelProperty(name = "detail",value = "反馈详情")
	private String detail;

}
