package com.atguigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.atguigu.gmall.sms.dao.FlashPromotionDao;
import com.atguigu.gmall.sms.entity.FlashPromotion;
import com.atguigu.gmall.sms.service.FlashPromotionService;

@Service("flashPromotionService")
public class FlashPromotionServiceImpl extends ServiceImpl<FlashPromotionDao, FlashPromotion> implements FlashPromotionService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<FlashPromotion> page = this.page(
                new Query<FlashPromotion>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}