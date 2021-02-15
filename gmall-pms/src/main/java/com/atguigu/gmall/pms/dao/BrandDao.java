package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.Brand;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌表
 * @author wangzj
 * @since  2021-02-15 21:51:57
 */
@Mapper
public interface BrandDao extends BaseMapper<Brand> {
	
}
