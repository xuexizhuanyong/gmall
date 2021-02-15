package com.atguigu.gmall.pms.controller;

import java.util.Arrays;

import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.java.core.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.atguigu.gmall.pms.entity.ProductSaleAttr;
import com.atguigu.gmall.pms.service.ProductSaleAttrService;

/**
 * 
 * @author wangzj
 * @since  2021-02-15 21:51:58
 */
@Api(tags = " 管理")
@RestController
@RequestMapping("pms/productsaleattr")
public class ProductSaleAttrController {
    @Autowired
    private ProductSaleAttrService productSaleAttrService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:productsaleattr:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = productSaleAttrService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('pms:productsaleattr:info')")
    public Resp<ProductSaleAttr> info(@PathVariable("id") Long id){
		ProductSaleAttr productSaleAttr = productSaleAttrService.getById(id);

        return Resp.ok(productSaleAttr);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:productsaleattr:save')")
    public Resp<Object> save(@RequestBody ProductSaleAttr productSaleAttr){
		productSaleAttrService.save(productSaleAttr);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:productsaleattr:update')")
    public Resp<Object> update(@RequestBody ProductSaleAttr productSaleAttr){
		productSaleAttrService.updateById(productSaleAttr);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:productsaleattr:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		productSaleAttrService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
