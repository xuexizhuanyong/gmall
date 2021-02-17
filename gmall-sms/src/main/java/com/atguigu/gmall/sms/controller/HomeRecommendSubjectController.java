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

import com.atguigu.gmall.sms.entity.HomeRecommendSubject;
import com.atguigu.gmall.sms.service.HomeRecommendSubjectService;

/**
 * 首页推荐专题表
 * @author wangzj
 * @since  2021-02-15 22:56:47
 */
@Api(tags = "首页推荐专题表 管理")
@RestController
@RequestMapping("sms/homerecommendsubject")
public class HomeRecommendSubjectController {
    @Autowired
    private HomeRecommendSubjectService homeRecommendSubjectService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:homerecommendsubject:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = homeRecommendSubjectService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:homerecommendsubject:info')")
    public Resp<HomeRecommendSubject> info(@PathVariable("id") Long id){
		HomeRecommendSubject homeRecommendSubject = homeRecommendSubjectService.getById(id);

        return Resp.ok(homeRecommendSubject);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:homerecommendsubject:save')")
    public Resp<Object> save(@RequestBody HomeRecommendSubject homeRecommendSubject){
		homeRecommendSubjectService.save(homeRecommendSubject);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:homerecommendsubject:update')")
    public Resp<Object> update(@RequestBody HomeRecommendSubject homeRecommendSubject){
		homeRecommendSubjectService.updateById(homeRecommendSubject);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:homerecommendsubject:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		homeRecommendSubjectService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
