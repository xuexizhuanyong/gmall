package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.HomeNewProduct;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 新鲜好物表
 *
 * @author wangzj
 * @since  2021-02-15 22:56:47
 */
public interface HomeNewProductService extends IService<HomeNewProduct> {

    PageVo queryPage(QueryCondition params);
}

