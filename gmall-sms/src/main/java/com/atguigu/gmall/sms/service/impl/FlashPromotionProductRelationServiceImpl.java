package com.atguigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.atguigu.gmall.sms.dao.FlashPromotionProductRelationDao;
import com.atguigu.gmall.sms.entity.FlashPromotionProductRelation;
import com.atguigu.gmall.sms.service.FlashPromotionProductRelationService;

@Service("flashPromotionProductRelationService")
public class FlashPromotionProductRelationServiceImpl extends ServiceImpl<FlashPromotionProductRelationDao, FlashPromotionProductRelation> implements FlashPromotionProductRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<FlashPromotionProductRelation> page = this.page(
                new Query<FlashPromotionProductRelation>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}