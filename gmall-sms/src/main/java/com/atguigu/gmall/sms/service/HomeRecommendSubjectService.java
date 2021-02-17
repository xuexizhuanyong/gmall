package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.HomeRecommendSubject;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 首页推荐专题表
 *
 * @author wangzj
 * @since  2021-02-15 22:56:47
 */
public interface HomeRecommendSubjectService extends IService<HomeRecommendSubject> {

    PageVo queryPage(QueryCondition params);
}

