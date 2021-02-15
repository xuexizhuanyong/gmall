package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.ProductSaleAttrValue;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * spu销售属性值
 *
 * @author wangzj
 * @since  2021-02-15 21:51:58
 */
public interface ProductSaleAttrValueService extends IService<ProductSaleAttrValue> {

    PageVo queryPage(QueryCondition params);
}

