package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.BaseCatalog1Dao;
import com.atguigu.gmall.pms.entity.BaseCatalog1;
import com.atguigu.gmall.pms.service.BaseCatalog1Service;

@Service("baseCatalog1Service")
public class BaseCatalog1ServiceImpl extends ServiceImpl<BaseCatalog1Dao, BaseCatalog1> implements BaseCatalog1Service {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<BaseCatalog1> page = this.page(
                new Query<BaseCatalog1>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}