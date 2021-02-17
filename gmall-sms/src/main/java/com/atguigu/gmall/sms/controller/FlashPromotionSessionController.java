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

import com.atguigu.gmall.sms.entity.FlashPromotionSession;
import com.atguigu.gmall.sms.service.FlashPromotionSessionService;

/**
 * 限时购场次表
 * @author wangzj
 * @since  2021-02-15 22:56:47
 */
@Api(tags = "限时购场次表 管理")
@RestController
@RequestMapping("sms/flashpromotionsession")
public class FlashPromotionSessionController {
    @Autowired
    private FlashPromotionSessionService flashPromotionSessionService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:flashpromotionsession:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = flashPromotionSessionService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:flashpromotionsession:info')")
    public Resp<FlashPromotionSession> info(@PathVariable("id") Long id){
		FlashPromotionSession flashPromotionSession = flashPromotionSessionService.getById(id);

        return Resp.ok(flashPromotionSession);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:flashpromotionsession:save')")
    public Resp<Object> save(@RequestBody FlashPromotionSession flashPromotionSession){
		flashPromotionSessionService.save(flashPromotionSession);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:flashpromotionsession:update')")
    public Resp<Object> update(@RequestBody FlashPromotionSession flashPromotionSession){
		flashPromotionSessionService.updateById(flashPromotionSession);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:flashpromotionsession:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		flashPromotionSessionService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
