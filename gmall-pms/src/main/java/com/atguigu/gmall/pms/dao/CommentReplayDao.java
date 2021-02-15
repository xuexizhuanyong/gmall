package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CommentReplay;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 产品评价回复表
 * @author wangzj
 * @since  2021-02-15 21:51:58
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplay> {
	
}
