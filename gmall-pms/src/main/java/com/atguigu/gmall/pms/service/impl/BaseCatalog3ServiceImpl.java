package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.BaseCatalog3Dao;
import com.atguigu.gmall.pms.entity.BaseCatalog3;
import com.atguigu.gmall.pms.service.BaseCatalog3Service;

@Service("baseCatalog3Service")
public class BaseCatalog3ServiceImpl extends ServiceImpl<BaseCatalog3Dao, BaseCatalog3> implements BaseCatalog3Service {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<BaseCatalog3> page = this.page(
                new Query<BaseCatalog3>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}