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

import com.atguigu.gmall.sms.entity.HomeNewProduct;
import com.atguigu.gmall.sms.service.HomeNewProductService;

/**
 * 新鲜好物表
 * @author wangzj
 * @since  2021-02-15 22:56:47
 */
@Api(tags = "新鲜好物表 管理")
@RestController
@RequestMapping("sms/homenewproduct")
public class HomeNewProductController {
    @Autowired
    private HomeNewProductService homeNewProductService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:homenewproduct:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = homeNewProductService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:homenewproduct:info')")
    public Resp<HomeNewProduct> info(@PathVariable("id") Long id){
		HomeNewProduct homeNewProduct = homeNewProductService.getById(id);

        return Resp.ok(homeNewProduct);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:homenewproduct:save')")
    public Resp<Object> save(@RequestBody HomeNewProduct homeNewProduct){
		homeNewProductService.save(homeNewProduct);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:homenewproduct:update')")
    public Resp<Object> update(@RequestBody HomeNewProduct homeNewProduct){
		homeNewProductService.updateById(homeNewProduct);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:homenewproduct:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		homeNewProductService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
