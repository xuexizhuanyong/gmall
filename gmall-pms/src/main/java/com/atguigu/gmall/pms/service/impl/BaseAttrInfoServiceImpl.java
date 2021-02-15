package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.BaseAttrInfoDao;
import com.atguigu.gmall.pms.entity.BaseAttrInfo;
import com.atguigu.gmall.pms.service.BaseAttrInfoService;

@Service("baseAttrInfoService")
public class BaseAttrInfoServiceImpl extends ServiceImpl<BaseAttrInfoDao, BaseAttrInfo> implements BaseAttrInfoService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<BaseAttrInfo> page = this.page(
                new Query<BaseAttrInfo>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}