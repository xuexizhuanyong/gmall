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

import com.atguigu.gmall.pms.entity.BaseSaleAttr;
import com.atguigu.gmall.pms.service.BaseSaleAttrService;

/**
 * 
 * @author wangzj
 * @since  2021-02-15 21:51:58
 */
@Api(tags = " 管理")
@RestController
@RequestMapping("pms/basesaleattr")
public class BaseSaleAttrController {
    @Autowired
    private BaseSaleAttrService baseSaleAttrService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:basesaleattr:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = baseSaleAttrService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('pms:basesaleattr:info')")
    public Resp<BaseSaleAttr> info(@PathVariable("id") Long id){
		BaseSaleAttr baseSaleAttr = baseSaleAttrService.getById(id);

        return Resp.ok(baseSaleAttr);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:basesaleattr:save')")
    public Resp<Object> save(@RequestBody BaseSaleAttr baseSaleAttr){
		baseSaleAttrService.save(baseSaleAttr);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:basesaleattr:update')")
    public Resp<Object> update(@RequestBody BaseSaleAttr baseSaleAttr){
		baseSaleAttrService.updateById(baseSaleAttr);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:basesaleattr:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		baseSaleAttrService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
