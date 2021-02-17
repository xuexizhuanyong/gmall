package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.HomeRecommendProduct;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 人气推荐商品表
 *
 * @author wangzj
 * @since  2021-02-15 22:56:47
 */
public interface HomeRecommendProductService extends IService<HomeRecommendProduct> {

    PageVo queryPage(QueryCondition params);
}

