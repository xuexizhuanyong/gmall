package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.ProductSaleAttrValueDao;
import com.atguigu.gmall.pms.entity.ProductSaleAttrValue;
import com.atguigu.gmall.pms.service.ProductSaleAttrValueService;

@Service("productSaleAttrValueService")
public class ProductSaleAttrValueServiceImpl extends ServiceImpl<ProductSaleAttrValueDao, ProductSaleAttrValue> implements ProductSaleAttrValueService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<ProductSaleAttrValue> page = this.page(
                new Query<ProductSaleAttrValue>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}