package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.ProductImage;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品图片表
 *
 * @author wangzj
 * @since  2021-02-15 21:51:58
 */
public interface ProductImageService extends IService<ProductImage> {

    PageVo queryPage(QueryCondition params);
}

