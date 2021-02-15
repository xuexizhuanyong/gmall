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

import com.atguigu.gmall.pms.entity.ProductOperateLog;
import com.atguigu.gmall.pms.service.ProductOperateLogService;

/**
 * 
 * @author wangzj
 * @since  2021-02-15 21:51:57
 */
@Api(tags = " 管理")
@RestController
@RequestMapping("pms/productoperatelog")
public class ProductOperateLogController {
    @Autowired
    private ProductOperateLogService productOperateLogService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:productoperatelog:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = productOperateLogService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('pms:productoperatelog:info')")
    public Resp<ProductOperateLog> info(@PathVariable("id") Long id){
		ProductOperateLog productOperateLog = productOperateLogService.getById(id);

        return Resp.ok(productOperateLog);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:productoperatelog:save')")
    public Resp<Object> save(@RequestBody ProductOperateLog productOperateLog){
		productOperateLogService.save(productOperateLog);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:productoperatelog:update')")
    public Resp<Object> update(@RequestBody ProductOperateLog productOperateLog){
		productOperateLogService.updateById(productOperateLog);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:productoperatelog:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		productOperateLogService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
