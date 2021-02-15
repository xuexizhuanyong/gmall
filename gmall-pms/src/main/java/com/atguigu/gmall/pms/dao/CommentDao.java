package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价表
 * @author wangzj
 * @since  2021-02-15 21:51:57
 */
@Mapper
public interface CommentDao extends BaseMapper<Comment> {
	
}
