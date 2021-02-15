package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.ProductOperateLog;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 
 *
 * @author wangzj
 * @since  2021-02-15 21:51:57
 */
public interface ProductOperateLogService extends IService<ProductOperateLog> {

    PageVo queryPage(QueryCondition params);
}

