package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.ProductSaleAttrDao;
import com.atguigu.gmall.pms.entity.ProductSaleAttr;
import com.atguigu.gmall.pms.service.ProductSaleAttrService;

@Service("productSaleAttrService")
public class ProductSaleAttrServiceImpl extends ServiceImpl<ProductSaleAttrDao, ProductSaleAttr> implements ProductSaleAttrService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<ProductSaleAttr> page = this.page(
                new Query<ProductSaleAttr>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}