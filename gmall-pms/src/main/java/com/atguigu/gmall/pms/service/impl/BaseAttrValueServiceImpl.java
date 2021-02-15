package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.BaseAttrValueDao;
import com.atguigu.gmall.pms.entity.BaseAttrValue;
import com.atguigu.gmall.pms.service.BaseAttrValueService;

@Service("baseAttrValueService")
public class BaseAttrValueServiceImpl extends ServiceImpl<BaseAttrValueDao, BaseAttrValue> implements BaseAttrValueService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<BaseAttrValue> page = this.page(
                new Query<BaseAttrValue>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}