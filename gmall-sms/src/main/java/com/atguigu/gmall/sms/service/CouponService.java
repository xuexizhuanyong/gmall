package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.Coupon;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 优惠卷表
 *
 * @author wangzj
 * @since  2021-02-15 22:56:47
 */
public interface CouponService extends IService<Coupon> {

    PageVo queryPage(QueryCondition params);
}

