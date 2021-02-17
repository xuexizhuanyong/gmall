package com.atguigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.atguigu.gmall.sms.dao.HomeNewProductDao;
import com.atguigu.gmall.sms.entity.HomeNewProduct;
import com.atguigu.gmall.sms.service.HomeNewProductService;

@Service("homeNewProductService")
public class HomeNewProductServiceImpl extends ServiceImpl<HomeNewProductDao, HomeNewProduct> implements HomeNewProductService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<HomeNewProduct> page = this.page(
                new Query<HomeNewProduct>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}