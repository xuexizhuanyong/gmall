package com.atguigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.atguigu.gmall.sms.dao.HomeBrandDao;
import com.atguigu.gmall.sms.entity.HomeBrand;
import com.atguigu.gmall.sms.service.HomeBrandService;

@Service("homeBrandService")
public class HomeBrandServiceImpl extends ServiceImpl<HomeBrandDao, HomeBrand> implements HomeBrandService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<HomeBrand> page = this.page(
                new Query<HomeBrand>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}