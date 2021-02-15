package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.BaseAttrInfo;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 属性表
 *
 * @author wangzj
 * @since  2021-02-15 21:51:58
 */
public interface BaseAttrInfoService extends IService<BaseAttrInfo> {

    PageVo queryPage(QueryCondition params);
}

