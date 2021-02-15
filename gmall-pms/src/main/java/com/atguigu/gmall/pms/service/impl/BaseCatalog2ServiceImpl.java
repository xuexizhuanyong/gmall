package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.BaseCatalog2Dao;
import com.atguigu.gmall.pms.entity.BaseCatalog2;
import com.atguigu.gmall.pms.service.BaseCatalog2Service;

@Service("baseCatalog2Service")
public class BaseCatalog2ServiceImpl extends ServiceImpl<BaseCatalog2Dao, BaseCatalog2> implements BaseCatalog2Service {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<BaseCatalog2> page = this.page(
                new Query<BaseCatalog2>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}