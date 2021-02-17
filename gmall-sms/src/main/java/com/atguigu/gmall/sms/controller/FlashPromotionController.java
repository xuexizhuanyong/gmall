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

import com.atguigu.gmall.sms.entity.FlashPromotion;
import com.atguigu.gmall.sms.service.FlashPromotionService;

/**
 * 限时购表
 * @author wangzj
 * @since  2021-02-15 22:56:47
 */
@Api(tags = "限时购表 管理")
@RestController
@RequestMapping("sms/flashpromotion")
public class FlashPromotionController {
    @Autowired
    private FlashPromotionService flashPromotionService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:flashpromotion:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = flashPromotionService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:flashpromotion:info')")
    public Resp<FlashPromotion> info(@PathVariable("id") Long id){
		FlashPromotion flashPromotion = flashPromotionService.getById(id);

        return Resp.ok(flashPromotion);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:flashpromotion:save')")
    public Resp<Object> save(@RequestBody FlashPromotion flashPromotion){
		flashPromotionService.save(flashPromotion);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:flashpromotion:update')")
    public Resp<Object> update(@RequestBody FlashPromotion flashPromotion){
		flashPromotionService.updateById(flashPromotion);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:flashpromotion:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		flashPromotionService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
