package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.ProductFullReduction;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 产品满减表(只针对同商品)
 * @author wangzj
 * @since  2021-02-15 21:51:57
 */
@Mapper
public interface ProductFullReductionDao extends BaseMapper<ProductFullReduction> {
	
}
