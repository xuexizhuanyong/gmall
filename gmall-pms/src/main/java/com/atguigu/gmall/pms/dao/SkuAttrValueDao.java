package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.SkuAttrValue;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * sku平台属性值关联表
 * @author wangzj
 * @since  2021-02-15 21:51:58
 */
@Mapper
public interface SkuAttrValueDao extends BaseMapper<SkuAttrValue> {
	
}
