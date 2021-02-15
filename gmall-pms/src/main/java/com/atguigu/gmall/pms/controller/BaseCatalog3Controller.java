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

import com.atguigu.gmall.pms.entity.BaseCatalog3;
import com.atguigu.gmall.pms.service.BaseCatalog3Service;

/**
 * 
 * @author wangzj
 * @since  2021-02-15 21:51:58
 */
@Api(tags = " 管理")
@RestController
@RequestMapping("pms/basecatalog3")
public class BaseCatalog3Controller {
    @Autowired
    private BaseCatalog3Service baseCatalog3Service;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:basecatalog3:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = baseCatalog3Service.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('pms:basecatalog3:info')")
    public Resp<BaseCatalog3> info(@PathVariable("id") Long id){
		BaseCatalog3 baseCatalog3 = baseCatalog3Service.getById(id);

        return Resp.ok(baseCatalog3);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:basecatalog3:save')")
    public Resp<Object> save(@RequestBody BaseCatalog3 baseCatalog3){
		baseCatalog3Service.save(baseCatalog3);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:basecatalog3:update')")
    public Resp<Object> update(@RequestBody BaseCatalog3 baseCatalog3){
		baseCatalog3Service.updateById(baseCatalog3);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:basecatalog3:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		baseCatalog3Service.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
