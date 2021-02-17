package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.FlashPromotionProductRelation;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品限时购与商品关系表
 *
 * @author wangzj
 * @since  2021-02-15 22:56:47
 */
public interface FlashPromotionProductRelationService extends IService<FlashPromotionProductRelation> {

    PageVo queryPage(QueryCondition params);
}

