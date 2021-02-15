package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.SkuSaleAttrValue;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * sku销售属性值
 *
 * @author wangzj
 * @since  2021-02-15 21:51:58
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValue> {

    PageVo queryPage(QueryCondition params);
}

