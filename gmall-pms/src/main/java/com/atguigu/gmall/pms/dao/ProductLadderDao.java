package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.ProductLadder;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 产品阶梯价格表(只针对同商品)
 * @author wangzj
 * @since  2021-02-15 21:51:57
 */
@Mapper
public interface ProductLadderDao extends BaseMapper<ProductLadder> {
	
}
