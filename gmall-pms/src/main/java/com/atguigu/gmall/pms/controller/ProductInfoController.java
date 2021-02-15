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

import com.atguigu.gmall.pms.entity.ProductInfo;
import com.atguigu.gmall.pms.service.ProductInfoService;

/**
 * 
 * @author wangzj
 * @since  2021-02-15 21:51:58
 */
@Api(tags = " 管理")
@RestController
@RequestMapping("pms/productinfo")
public class ProductInfoController {
    @Autowired
    private ProductInfoService productInfoService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:productinfo:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = productInfoService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('pms:productinfo:info')")
    public Resp<ProductInfo> info(@PathVariable("id") Long id){
		ProductInfo productInfo = productInfoService.getById(id);

        return Resp.ok(productInfo);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:productinfo:save')")
    public Resp<Object> save(@RequestBody ProductInfo productInfo){
		productInfoService.save(productInfo);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:productinfo:update')")
    public Resp<Object> update(@RequestBody ProductInfo productInfo){
		productInfoService.updateById(productInfo);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:productinfo:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		productInfoService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
