package com.atguigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.atguigu.gmall.sms.dao.FlashPromotionSessionDao;
import com.atguigu.gmall.sms.entity.FlashPromotionSession;
import com.atguigu.gmall.sms.service.FlashPromotionSessionService;

@Service("flashPromotionSessionService")
public class FlashPromotionSessionServiceImpl extends ServiceImpl<FlashPromotionSessionDao, FlashPromotionSession> implements FlashPromotionSessionService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<FlashPromotionSession> page = this.page(
                new Query<FlashPromotionSession>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}