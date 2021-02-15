package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.ProductImage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品图片表
 * @author wangzj
 * @since  2021-02-15 21:51:58
 */
@Mapper
public interface ProductImageDao extends BaseMapper<ProductImage> {
	
}
