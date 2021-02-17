package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.CouponProductCategoryRelation;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 优惠券和产品分类关系表
 *
 * @author wangzj
 * @since  2021-02-15 22:56:47
 */
public interface CouponProductCategoryRelationService extends IService<CouponProductCategoryRelation> {

    PageVo queryPage(QueryCondition params);
}

