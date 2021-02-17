package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.FlashPromotionSession;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 限时购场次表
 *
 * @author wangzj
 * @since  2021-02-15 22:56:47
 */
public interface FlashPromotionSessionService extends IService<FlashPromotionSession> {

    PageVo queryPage(QueryCondition params);
}

