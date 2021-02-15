package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.SkuAttrValueDao;
import com.atguigu.gmall.pms.entity.SkuAttrValue;
import com.atguigu.gmall.pms.service.SkuAttrValueService;

@Service("skuAttrValueService")
public class SkuAttrValueServiceImpl extends ServiceImpl<SkuAttrValueDao, SkuAttrValue> implements SkuAttrValueService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SkuAttrValue> page = this.page(
                new Query<SkuAttrValue>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}