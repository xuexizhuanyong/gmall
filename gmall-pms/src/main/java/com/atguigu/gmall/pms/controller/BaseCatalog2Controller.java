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

import com.atguigu.gmall.pms.entity.BaseCatalog2;
import com.atguigu.gmall.pms.service.BaseCatalog2Service;

/**
 * 
 * @author wangzj
 * @since  2021-02-15 21:51:58
 */
@Api(tags = " 管理")
@RestController
@RequestMapping("pms/basecatalog2")
public class BaseCatalog2Controller {
    @Autowired
    private BaseCatalog2Service baseCatalog2Service;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:basecatalog2:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = baseCatalog2Service.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('pms:basecatalog2:info')")
    public Resp<BaseCatalog2> info(@PathVariable("id") Integer id){
		BaseCatalog2 baseCatalog2 = baseCatalog2Service.getById(id);

        return Resp.ok(baseCatalog2);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:basecatalog2:save')")
    public Resp<Object> save(@RequestBody BaseCatalog2 baseCatalog2){
		baseCatalog2Service.save(baseCatalog2);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:basecatalog2:update')")
    public Resp<Object> update(@RequestBody BaseCatalog2 baseCatalog2){
		baseCatalog2Service.updateById(baseCatalog2);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:basecatalog2:delete')")
    public Resp<Object> delete(@RequestBody Integer[] ids){
		baseCatalog2Service.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
