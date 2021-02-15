package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品评价表
 * @author wangzj
 * @since 2021-02-15 21:51:57
 */
@ApiModel
@Data
@TableName("pms_comment")
public class Comment implements Serializable {
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
	@ApiModelProperty(name = "memberNickName",value = "")
	private String memberNickName;
	/**
	 * 
	 */
	@ApiModelProperty(name = "productName",value = "")
	private String productName;
	/**
	 * 评价星数：0->5
	 */
	@ApiModelProperty(name = "star",value = "评价星数：0->5")
	private Integer star;
	/**
	 * 评价的ip
	 */
	@ApiModelProperty(name = "memberIp",value = "评价的ip")
	private String memberIp;
	/**
	 * 
	 */
	@ApiModelProperty(name = "createTime",value = "")
	private Date createTime;
	/**
	 * 
	 */
	@ApiModelProperty(name = "showStatus",value = "")
	private Integer showStatus;
	/**
	 * 购买时的商品属性
	 */
	@ApiModelProperty(name = "productAttribute",value = "购买时的商品属性")
	private String productAttribute;
	/**
	 * 
	 */
	@ApiModelProperty(name = "collectCouont",value = "")
	private Integer collectCouont;
	/**
	 * 
	 */
	@ApiModelProperty(name = "readCount",value = "")
	private Integer readCount;
	/**
	 * 
	 */
	@ApiModelProperty(name = "content",value = "")
	private String content;
	/**
	 * 上传图片地址，以逗号隔开
	 */
	@ApiModelProperty(name = "pics",value = "上传图片地址，以逗号隔开")
	private String pics;
	/**
	 * 评论用户头像
	 */
	@ApiModelProperty(name = "memberIcon",value = "评论用户头像")
	private String memberIcon;
	/**
	 * 
	 */
	@ApiModelProperty(name = "replayCount",value = "")
	private Integer replayCount;

}
