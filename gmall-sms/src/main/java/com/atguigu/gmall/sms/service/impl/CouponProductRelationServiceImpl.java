package com.atguigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.atguigu.gmall.sms.dao.CouponProductRelationDao;
import com.atguigu.gmall.sms.entity.CouponProductRelation;
import com.atguigu.gmall.sms.service.CouponProductRelationService;

@Service("couponProductRelationService")
public class CouponProductRelationServiceImpl extends ServiceImpl<CouponProductRelationDao, CouponProductRelation> implements CouponProductRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<CouponProductRelation> page = this.page(
                new Query<CouponProductRelation>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}