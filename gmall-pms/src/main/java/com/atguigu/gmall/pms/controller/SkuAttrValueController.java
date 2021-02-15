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

import com.atguigu.gmall.pms.entity.SkuAttrValue;
import com.atguigu.gmall.pms.service.SkuAttrValueService;

/**
 * sku平台属性值关联表
 * @author wangzj
 * @since  2021-02-15 21:51:58
 */
@Api(tags = "sku平台属性值关联表 管理")
@RestController
@RequestMapping("pms/skuattrvalue")
public class SkuAttrValueController {
    @Autowired
    private SkuAttrValueService skuAttrValueService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:skuattrvalue:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = skuAttrValueService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('pms:skuattrvalue:info')")
    public Resp<SkuAttrValue> info(@PathVariable("id") Long id){
		SkuAttrValue skuAttrValue = skuAttrValueService.getById(id);

        return Resp.ok(skuAttrValue);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:skuattrvalue:save')")
    public Resp<Object> save(@RequestBody SkuAttrValue skuAttrValue){
		skuAttrValueService.save(skuAttrValue);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:skuattrvalue:update')")
    public Resp<Object> update(@RequestBody SkuAttrValue skuAttrValue){
		skuAttrValueService.updateById(skuAttrValue);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:skuattrvalue:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		skuAttrValueService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
