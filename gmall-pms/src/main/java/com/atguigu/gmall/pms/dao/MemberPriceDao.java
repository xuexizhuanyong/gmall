package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.MemberPrice;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格表
 * @author wangzj
 * @since  2021-02-15 21:51:57
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPrice> {
	
}
