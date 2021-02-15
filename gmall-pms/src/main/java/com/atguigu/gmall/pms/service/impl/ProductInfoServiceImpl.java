package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.ProductInfoDao;
import com.atguigu.gmall.pms.entity.ProductInfo;
import com.atguigu.gmall.pms.service.ProductInfoService;

@Service("productInfoService")
public class ProductInfoServiceImpl extends ServiceImpl<ProductInfoDao, ProductInfo> implements ProductInfoService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<ProductInfo> page = this.page(
                new Query<ProductInfo>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}