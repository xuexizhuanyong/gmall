package com.atguigu.gmall.sms.controller;

import java.util.Arrays;

import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.java.core.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.atguigu.gmall.sms.entity.CouponProductCategoryRelation;
import com.atguigu.gmall.sms.service.CouponProductCategoryRelationService;

/**
 * 优惠券和产品分类关系表
 * @author wangzj
 * @since  2021-02-15 22:56:47
 */
@Api(tags = "优惠券和产品分类关系表 管理")
@RestController
@RequestMapping("sms/couponproductcategoryrelation")
public class CouponProductCategoryRelationController {
    @Autowired
    private CouponProductCategoryRelationService couponProductCategoryRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:couponproductcategoryrelation:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = couponProductCategoryRelationService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:couponproductcategoryrelation:info')")
    public Resp<CouponProductCategoryRelation> info(@PathVariable("id") Long id){
		CouponProductCategoryRelation couponProductCategoryRelation = couponProductCategoryRelationService.getById(id);

        return Resp.ok(couponProductCategoryRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:couponproductcategoryrelation:save')")
    public Resp<Object> save(@RequestBody CouponProductCategoryRelation couponProductCategoryRelation){
		couponProductCategoryRelationService.save(couponProductCategoryRelation);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:couponproductcategoryrelation:update')")
    public Resp<Object> update(@RequestBody CouponProductCategoryRelation couponProductCategoryRelation){
		couponProductCategoryRelationService.updateById(couponProductCategoryRelation);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:couponproductcategoryrelation:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		couponProductCategoryRelationService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
