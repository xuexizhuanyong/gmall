package com.atguigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.atguigu.gmall.sms.dao.CouponProductCategoryRelationDao;
import com.atguigu.gmall.sms.entity.CouponProductCategoryRelation;
import com.atguigu.gmall.sms.service.CouponProductCategoryRelationService;

@Service("couponProductCategoryRelationService")
public class CouponProductCategoryRelationServiceImpl extends ServiceImpl<CouponProductCategoryRelationDao, CouponProductCategoryRelation> implements CouponProductCategoryRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<CouponProductCategoryRelation> page = this.page(
                new Query<CouponProductCategoryRelation>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}