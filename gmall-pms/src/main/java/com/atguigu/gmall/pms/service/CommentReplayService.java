package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.CommentReplay;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 产品评价回复表
 *
 * @author wangzj
 * @since  2021-02-15 21:51:58
 */
public interface CommentReplayService extends IService<CommentReplay> {

    PageVo queryPage(QueryCondition params);
}

