package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.BaseSaleAttr;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 
 *
 * @author wangzj
 * @since  2021-02-15 21:51:58
 */
public interface BaseSaleAttrService extends IService<BaseSaleAttr> {

    PageVo queryPage(QueryCondition params);
}

