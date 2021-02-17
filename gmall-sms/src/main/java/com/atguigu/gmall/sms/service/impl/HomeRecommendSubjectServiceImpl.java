package com.atguigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.atguigu.gmall.sms.dao.HomeRecommendSubjectDao;
import com.atguigu.gmall.sms.entity.HomeRecommendSubject;
import com.atguigu.gmall.sms.service.HomeRecommendSubjectService;

@Service("homeRecommendSubjectService")
public class HomeRecommendSubjectServiceImpl extends ServiceImpl<HomeRecommendSubjectDao, HomeRecommendSubject> implements HomeRecommendSubjectService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<HomeRecommendSubject> page = this.page(
                new Query<HomeRecommendSubject>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}