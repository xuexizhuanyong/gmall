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

import com.atguigu.gmall.sms.entity.HomeAdvertise;
import com.atguigu.gmall.sms.service.HomeAdvertiseService;

/**
 * 首页轮播广告表
 * @author wangzj
 * @since  2021-02-15 22:56:47
 */
@Api(tags = "首页轮播广告表 管理")
@RestController
@RequestMapping("sms/homeadvertise")
public class HomeAdvertiseController {
    @Autowired
    private HomeAdvertiseService homeAdvertiseService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:homeadvertise:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = homeAdvertiseService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:homeadvertise:info')")
    public Resp<HomeAdvertise> info(@PathVariable("id") Long id){
		HomeAdvertise homeAdvertise = homeAdvertiseService.getById(id);

        return Resp.ok(homeAdvertise);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:homeadvertise:save')")
    public Resp<Object> save(@RequestBody HomeAdvertise homeAdvertise){
		homeAdvertiseService.save(homeAdvertise);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:homeadvertise:update')")
    public Resp<Object> update(@RequestBody HomeAdvertise homeAdvertise){
		homeAdvertiseService.updateById(homeAdvertise);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:homeadvertise:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		homeAdvertiseService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
