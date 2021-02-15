package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.Brand;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 品牌表
 *
 * @author wangzj
 * @since  2021-02-15 21:51:57
 */
public interface BrandService extends IService<Brand> {

    PageVo queryPage(QueryCondition params);
}

