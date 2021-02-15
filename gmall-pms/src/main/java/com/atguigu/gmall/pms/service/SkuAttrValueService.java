package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.SkuAttrValue;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * sku平台属性值关联表
 *
 * @author wangzj
 * @since  2021-02-15 21:51:58
 */
public interface SkuAttrValueService extends IService<SkuAttrValue> {

    PageVo queryPage(QueryCondition params);
}

