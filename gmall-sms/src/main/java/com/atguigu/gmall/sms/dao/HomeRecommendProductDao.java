package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.HomeRecommendProduct;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 人气推荐商品表
 * @author wangzj
 * @since  2021-02-15 22:56:47
 */
@Mapper
public interface HomeRecommendProductDao extends BaseMapper<HomeRecommendProduct> {
	
}
