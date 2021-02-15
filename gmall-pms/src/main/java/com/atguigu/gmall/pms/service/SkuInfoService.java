package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.SkuInfo;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 库存单元表
 *
 * @author wangzj
 * @since  2021-02-15 21:51:58
 */
public interface SkuInfoService extends IService<SkuInfo> {

    PageVo queryPage(QueryCondition params);
}

