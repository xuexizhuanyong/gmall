package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.ProductFullReductionDao;
import com.atguigu.gmall.pms.entity.ProductFullReduction;
import com.atguigu.gmall.pms.service.ProductFullReductionService;

@Service("productFullReductionService")
public class ProductFullReductionServiceImpl extends ServiceImpl<ProductFullReductionDao, ProductFullReduction> implements ProductFullReductionService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<ProductFullReduction> page = this.page(
                new Query<ProductFullReduction>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}