package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 品牌表
 * @author wangzj
 * @since 2021-02-15 21:51:57
 */
@ApiModel
@Data
@TableName("pms_brand")
public class Brand implements Serializable {
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
	 * 首字母
	 */
	@ApiModelProperty(name = "firstLetter",value = "首字母")
	private String firstLetter;
	/**
	 * 
	 */
	@ApiModelProperty(name = "sort",value = "")
	private Integer sort;
	/**
	 * 是否为品牌制造商：0->不是；1->是
	 */
	@ApiModelProperty(name = "factoryStatus",value = "是否为品牌制造商：0->不是；1->是")
	private Integer factoryStatus;
	/**
	 * 
	 */
	@ApiModelProperty(name = "showStatus",value = "")
	private Integer showStatus;
	/**
	 * 产品数量
	 */
	@ApiModelProperty(name = "productCount",value = "产品数量")
	private Integer productCount;
	/**
	 * 产品评论数量
	 */
	@ApiModelProperty(name = "productCommentCount",value = "产品评论数量")
	private Integer productCommentCount;
	/**
	 * 品牌logo
	 */
	@ApiModelProperty(name = "logo",value = "品牌logo")
	private String logo;
	/**
	 * 专区大图
	 */
	@ApiModelProperty(name = "bigPic",value = "专区大图")
	private String bigPic;
	/**
	 * 品牌故事
	 */
	@ApiModelProperty(name = "brandStory",value = "品牌故事")
	private String brandStory;

}
