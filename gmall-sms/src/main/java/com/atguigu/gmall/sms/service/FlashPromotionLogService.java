package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.FlashPromotionLog;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 限时购通知记录
 *
 * @author wangzj
 * @since  2021-02-15 22:56:47
 */
public interface FlashPromotionLogService extends IService<FlashPromotionLog> {

    PageVo queryPage(QueryCondition params);
}

