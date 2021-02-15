package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.SkuInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 库存单元表
 * @author wangzj
 * @since  2021-02-15 21:51:58
 */
@Mapper
public interface SkuInfoDao extends BaseMapper<SkuInfo> {
	
}
