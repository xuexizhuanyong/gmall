package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.HomeBrand;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页推荐品牌表
 * @author wangzj
 * @since  2021-02-15 22:56:47
 */
@Mapper
public interface HomeBrandDao extends BaseMapper<HomeBrand> {
	
}
