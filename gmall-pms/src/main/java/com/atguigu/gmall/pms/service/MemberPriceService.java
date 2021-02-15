package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.MemberPrice;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品会员价格表
 *
 * @author wangzj
 * @since  2021-02-15 21:51:57
 */
public interface MemberPriceService extends IService<MemberPrice> {

    PageVo queryPage(QueryCondition params);
}

