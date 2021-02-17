package com.atguigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.atguigu.gmall.sms.dao.HomeRecommendProductDao;
import com.atguigu.gmall.sms.entity.HomeRecommendProduct;
import com.atguigu.gmall.sms.service.HomeRecommendProductService;

@Service("homeRecommendProductService")
public class HomeRecommendProductServiceImpl extends ServiceImpl<HomeRecommendProductDao, HomeRecommendProduct> implements HomeRecommendProductService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<HomeRecommendProduct> page = this.page(
                new Query<HomeRecommendProduct>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}