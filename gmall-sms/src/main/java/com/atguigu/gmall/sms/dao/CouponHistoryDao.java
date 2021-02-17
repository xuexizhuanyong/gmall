package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponHistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券使用、领取历史表
 * @author wangzj
 * @since  2021-02-15 22:56:47
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistory> {
	
}
