package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.ProductLadder;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 产品阶梯价格表(只针对同商品)
 *
 * @author wangzj
 * @since  2021-02-15 21:51:57
 */
public interface ProductLadderService extends IService<ProductLadder> {

    PageVo queryPage(QueryCondition params);
}

