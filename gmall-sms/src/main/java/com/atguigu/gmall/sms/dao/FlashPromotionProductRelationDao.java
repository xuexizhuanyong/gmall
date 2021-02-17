package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.FlashPromotionProductRelation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品限时购与商品关系表
 * @author wangzj
 * @since  2021-02-15 22:56:47
 */
@Mapper
public interface FlashPromotionProductRelationDao extends BaseMapper<FlashPromotionProductRelation> {
	
}
