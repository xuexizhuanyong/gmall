package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.BaseCatalog1;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 一级分类表
 *
 * @author wangzj
 * @since  2021-02-15 21:51:58
 */
public interface BaseCatalog1Service extends IService<BaseCatalog1> {

    PageVo queryPage(QueryCondition params);
}

