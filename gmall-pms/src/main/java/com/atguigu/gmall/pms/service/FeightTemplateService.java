package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.FeightTemplate;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 运费模版
 *
 * @author wangzj
 * @since  2021-02-15 21:51:57
 */
public interface FeightTemplateService extends IService<FeightTemplate> {

    PageVo queryPage(QueryCondition params);
}

