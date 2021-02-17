package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.FlashPromotionSession;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 限时购场次表
 * @author wangzj
 * @since  2021-02-15 22:56:47
 */
@Mapper
public interface FlashPromotionSessionDao extends BaseMapper<FlashPromotionSession> {
	
}
