package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.BaseSaleAttrDao;
import com.atguigu.gmall.pms.entity.BaseSaleAttr;
import com.atguigu.gmall.pms.service.BaseSaleAttrService;

@Service("baseSaleAttrService")
public class BaseSaleAttrServiceImpl extends ServiceImpl<BaseSaleAttrDao, BaseSaleAttr> implements BaseSaleAttrService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<BaseSaleAttr> page = this.page(
                new Query<BaseSaleAttr>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}