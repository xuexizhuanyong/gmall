package com.atguigu.gmall.sms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 首页推荐专题表
 * @author wangzj
 * @since 2021-02-15 22:56:47
 */
@ApiModel
@Data
@TableName("sms_home_recommend_subject")
public class HomeRecommendSubject implements Serializable {
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
	@ApiModelProperty(name = "subjectId",value = "")
	private Long subjectId;
	/**
	 * 
	 */
	@ApiModelProperty(name = "subjectName",value = "")
	private String subjectName;
	/**
	 * 
	 */
	@ApiModelProperty(name = "recommendStatus",value = "")
	private Integer recommendStatus;
	/**
	 * 
	 */
	@ApiModelProperty(name = "sort",value = "")
	private Integer sort;

}
