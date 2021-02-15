package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.ProductLadderDao;
import com.atguigu.gmall.pms.entity.ProductLadder;
import com.atguigu.gmall.pms.service.ProductLadderService;

@Service("productLadderService")
public class ProductLadderServiceImpl extends ServiceImpl<ProductLadderDao, ProductLadder> implements ProductLadderService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<ProductLadder> page = this.page(
                new Query<ProductLadder>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}