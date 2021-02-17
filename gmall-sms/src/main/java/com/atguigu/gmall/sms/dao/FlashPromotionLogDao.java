package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.FlashPromotionLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 限时购通知记录
 * @author wangzj
 * @since  2021-02-15 22:56:47
 */
@Mapper
public interface FlashPromotionLogDao extends BaseMapper<FlashPromotionLog> {
	
}
