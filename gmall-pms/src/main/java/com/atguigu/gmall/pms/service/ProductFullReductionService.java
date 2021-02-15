package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.ProductFullReduction;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 产品满减表(只针对同商品)
 *
 * @author wangzj
 * @since  2021-02-15 21:51:57
 */
public interface ProductFullReductionService extends IService<ProductFullReduction> {

    PageVo queryPage(QueryCondition params);
}

