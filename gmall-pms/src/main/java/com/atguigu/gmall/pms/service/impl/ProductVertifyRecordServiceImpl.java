package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.ProductVertifyRecordDao;
import com.atguigu.gmall.pms.entity.ProductVertifyRecord;
import com.atguigu.gmall.pms.service.ProductVertifyRecordService;

@Service("productVertifyRecordService")
public class ProductVertifyRecordServiceImpl extends ServiceImpl<ProductVertifyRecordDao, ProductVertifyRecord> implements ProductVertifyRecordService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<ProductVertifyRecord> page = this.page(
                new Query<ProductVertifyRecord>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}