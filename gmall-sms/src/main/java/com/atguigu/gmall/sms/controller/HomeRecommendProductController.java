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

import com.atguigu.gmall.sms.entity.HomeRecommendProduct;
import com.atguigu.gmall.sms.service.HomeRecommendProductService;

/**
 * 人气推荐商品表
 * @author wangzj
 * @since  2021-02-15 22:56:47
 */
@Api(tags = "人气推荐商品表 管理")
@RestController
@RequestMapping("sms/homerecommendproduct")
public class HomeRecommendProductController {
    @Autowired
    private HomeRecommendProductService homeRecommendProductService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:homerecommendproduct:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = homeRecommendProductService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:homerecommendproduct:info')")
    public Resp<HomeRecommendProduct> info(@PathVariable("id") Long id){
		HomeRecommendProduct homeRecommendProduct = homeRecommendProductService.getById(id);

        return Resp.ok(homeRecommendProduct);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:homerecommendproduct:save')")
    public Resp<Object> save(@RequestBody HomeRecommendProduct homeRecommendProduct){
		homeRecommendProductService.save(homeRecommendProduct);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:homerecommendproduct:update')")
    public Resp<Object> update(@RequestBody HomeRecommendProduct homeRecommendProduct){
		homeRecommendProductService.updateById(homeRecommendProduct);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:homerecommendproduct:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		homeRecommendProductService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
