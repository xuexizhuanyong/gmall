package com.atguigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.atguigu.gmall.sms.dao.HomeAdvertiseDao;
import com.atguigu.gmall.sms.entity.HomeAdvertise;
import com.atguigu.gmall.sms.service.HomeAdvertiseService;

@Service("homeAdvertiseService")
public class HomeAdvertiseServiceImpl extends ServiceImpl<HomeAdvertiseDao, HomeAdvertise> implements HomeAdvertiseService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<HomeAdvertise> page = this.page(
                new Query<HomeAdvertise>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}