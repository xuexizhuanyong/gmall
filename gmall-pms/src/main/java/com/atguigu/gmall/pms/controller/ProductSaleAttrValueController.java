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

import com.atguigu.gmall.pms.entity.ProductSaleAttrValue;
import com.atguigu.gmall.pms.service.ProductSaleAttrValueService;

/**
 * spu销售属性值
 * @author wangzj
 * @since  2021-02-15 21:51:58
 */
@Api(tags = "spu销售属性值 管理")
@RestController
@RequestMapping("pms/productsaleattrvalue")
public class ProductSaleAttrValueController {
    @Autowired
    private ProductSaleAttrValueService productSaleAttrValueService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:productsaleattrvalue:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = productSaleAttrValueService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('pms:productsaleattrvalue:info')")
    public Resp<ProductSaleAttrValue> info(@PathVariable("id") Long id){
		ProductSaleAttrValue productSaleAttrValue = productSaleAttrValueService.getById(id);

        return Resp.ok(productSaleAttrValue);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:productsaleattrvalue:save')")
    public Resp<Object> save(@RequestBody ProductSaleAttrValue productSaleAttrValue){
		productSaleAttrValueService.save(productSaleAttrValue);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:productsaleattrvalue:update')")
    public Resp<Object> update(@RequestBody ProductSaleAttrValue productSaleAttrValue){
		productSaleAttrValueService.updateById(productSaleAttrValue);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:productsaleattrvalue:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		productSaleAttrValueService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
