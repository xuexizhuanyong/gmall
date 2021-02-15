package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.BaseAttrValue;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 属性值表
 *
 * @author wangzj
 * @since  2021-02-15 21:51:58
 */
public interface BaseAttrValueService extends IService<BaseAttrValue> {

    PageVo queryPage(QueryCondition params);
}

