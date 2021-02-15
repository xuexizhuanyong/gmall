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

import com.atguigu.gmall.pms.entity.ProductLadder;
import com.atguigu.gmall.pms.service.ProductLadderService;

/**
 * 产品阶梯价格表(只针对同商品)
 * @author wangzj
 * @since  2021-02-15 21:51:57
 */
@Api(tags = "产品阶梯价格表(只针对同商品) 管理")
@RestController
@RequestMapping("pms/productladder")
public class ProductLadderController {
    @Autowired
    private ProductLadderService productLadderService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:productladder:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = productLadderService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('pms:productladder:info')")
    public Resp<ProductLadder> info(@PathVariable("id") Long id){
		ProductLadder productLadder = productLadderService.getById(id);

        return Resp.ok(productLadder);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:productladder:save')")
    public Resp<Object> save(@RequestBody ProductLadder productLadder){
		productLadderService.save(productLadder);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:productladder:update')")
    public Resp<Object> update(@RequestBody ProductLadder productLadder){
		productLadderService.updateById(productLadder);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:productladder:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		productLadderService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
