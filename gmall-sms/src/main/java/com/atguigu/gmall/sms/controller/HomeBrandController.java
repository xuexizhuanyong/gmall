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

import com.atguigu.gmall.sms.entity.HomeBrand;
import com.atguigu.gmall.sms.service.HomeBrandService;

/**
 * 首页推荐品牌表
 * @author wangzj
 * @since  2021-02-15 22:56:47
 */
@Api(tags = "首页推荐品牌表 管理")
@RestController
@RequestMapping("sms/homebrand")
public class HomeBrandController {
    @Autowired
    private HomeBrandService homeBrandService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:homebrand:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = homeBrandService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:homebrand:info')")
    public Resp<HomeBrand> info(@PathVariable("id") Long id){
		HomeBrand homeBrand = homeBrandService.getById(id);

        return Resp.ok(homeBrand);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:homebrand:save')")
    public Resp<Object> save(@RequestBody HomeBrand homeBrand){
		homeBrandService.save(homeBrand);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:homebrand:update')")
    public Resp<Object> update(@RequestBody HomeBrand homeBrand){
		homeBrandService.updateById(homeBrand);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:homebrand:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		homeBrandService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
