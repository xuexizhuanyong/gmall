package com.atguigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.atguigu.gmall.sms.dao.FlashPromotionLogDao;
import com.atguigu.gmall.sms.entity.FlashPromotionLog;
import com.atguigu.gmall.sms.service.FlashPromotionLogService;

@Service("flashPromotionLogService")
public class FlashPromotionLogServiceImpl extends ServiceImpl<FlashPromotionLogDao, FlashPromotionLog> implements FlashPromotionLogService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<FlashPromotionLog> page = this.page(
                new Query<FlashPromotionLog>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}