package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 产品评价回复表
 * @author wangzj
 * @since 2021-02-15 21:51:58
 */
@ApiModel
@Data
@TableName("pms_comment_replay")
public class CommentReplay implements Serializable {
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
	@ApiModelProperty(name = "commentId",value = "")
	private Long commentId;
	/**
	 * 
	 */
	@ApiModelProperty(name = "memberNickName",value = "")
	private String memberNickName;
	/**
	 * 
	 */
	@ApiModelProperty(name = "memberIcon",value = "")
	private String memberIcon;
	/**
	 * 
	 */
	@ApiModelProperty(name = "content",value = "")
	private String content;
	/**
	 * 
	 */
	@ApiModelProperty(name = "createTime",value = "")
	private Date createTime;
	/**
	 * 评论人员类型；0->会员；1->管理员
	 */
	@ApiModelProperty(name = "type",value = "评论人员类型；0->会员；1->管理员")
	private Integer type;

}
