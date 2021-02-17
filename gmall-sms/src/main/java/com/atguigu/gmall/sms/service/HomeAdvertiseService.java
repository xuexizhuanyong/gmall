package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.HomeAdvertise;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 首页轮播广告表
 *
 * @author wangzj
 * @since  2021-02-15 22:56:47
 */
public interface HomeAdvertiseService extends IService<HomeAdvertise> {

    PageVo queryPage(QueryCondition params);
}

