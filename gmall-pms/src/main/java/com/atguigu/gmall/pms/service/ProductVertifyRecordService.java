package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.ProductVertifyRecord;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品审核记录
 *
 * @author wangzj
 * @since  2021-02-15 21:51:58
 */
public interface ProductVertifyRecordService extends IService<ProductVertifyRecord> {

    PageVo queryPage(QueryCondition params);
}

