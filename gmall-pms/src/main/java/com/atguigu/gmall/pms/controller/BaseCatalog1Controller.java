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

import com.atguigu.gmall.pms.entity.BaseCatalog1;
import com.atguigu.gmall.pms.service.BaseCatalog1Service;

/**
 * 一级分类表
 * @author wangzj
 * @since  2021-02-15 21:51:58
 */
@Api(tags = "一级分类表 管理")
@RestController
@RequestMapping("pms/basecatalog1")
public class BaseCatalog1Controller {
    @Autowired
    private BaseCatalog1Service baseCatalog1Service;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:basecatalog1:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = baseCatalog1Service.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('pms:basecatalog1:info')")
    public Resp<BaseCatalog1> info(@PathVariable("id") Integer id){
		BaseCatalog1 baseCatalog1 = baseCatalog1Service.getById(id);

        return Resp.ok(baseCatalog1);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:basecatalog1:save')")
    public Resp<Object> save(@RequestBody BaseCatalog1 baseCatalog1){
		baseCatalog1Service.save(baseCatalog1);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:basecatalog1:update')")
    public Resp<Object> update(@RequestBody BaseCatalog1 baseCatalog1){
		baseCatalog1Service.updateById(baseCatalog1);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:basecatalog1:delete')")
    public Resp<Object> delete(@RequestBody Integer[] ids){
		baseCatalog1Service.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
