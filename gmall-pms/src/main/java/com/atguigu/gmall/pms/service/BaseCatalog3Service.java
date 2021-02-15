package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.BaseCatalog3;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 
 *
 * @author wangzj
 * @since  2021-02-15 21:51:58
 */
public interface BaseCatalog3Service extends IService<BaseCatalog3> {

    PageVo queryPage(QueryCondition params);
}

