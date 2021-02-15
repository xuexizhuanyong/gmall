package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.ProductOperateLogDao;
import com.atguigu.gmall.pms.entity.ProductOperateLog;
import com.atguigu.gmall.pms.service.ProductOperateLogService;

@Service("productOperateLogService")
public class ProductOperateLogServiceImpl extends ServiceImpl<ProductOperateLogDao, ProductOperateLog> implements ProductOperateLogService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<ProductOperateLog> page = this.page(
                new Query<ProductOperateLog>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}