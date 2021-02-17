package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.CouponProductRelation;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 优惠券和产品的关系表
 *
 * @author wangzj
 * @since  2021-02-15 22:56:47
 */
public interface CouponProductRelationService extends IService<CouponProductRelation> {

    PageVo queryPage(QueryCondition params);
}

