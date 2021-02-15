package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.SkuImage;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 库存单元图片表
 *
 * @author wangzj
 * @since  2021-02-15 21:51:57
 */
public interface SkuImageService extends IService<SkuImage> {

    PageVo queryPage(QueryCondition params);
}

