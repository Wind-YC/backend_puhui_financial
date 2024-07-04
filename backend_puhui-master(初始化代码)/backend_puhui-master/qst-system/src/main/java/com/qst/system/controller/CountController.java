package com.qst.system.controller;

import com.qst.common.core.controller.BaseController;
import com.qst.common.core.domain.AjaxResult;
import com.qst.system.service.ICompanyService;
import com.qst.system.service.ILoaService;
import com.qst.system.service.INotificationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system/count")
@Api("首页统计控制层")
public class CountController extends BaseController {
    @Autowired
    ICompanyService companyService;
    @Autowired
    INotificationService notificationService;
    @Autowired
    ILoaService loaService;

    @ApiOperation("查询公司数量")
    @RequestMapping("/companyCount")
    public AjaxResult companyCount(){
        int i = companyService.selectCompanyCount();
        return AjaxResult.success(i);

    }
    @RequestMapping("/noticeCount")
    public AjaxResult notificationCount(){
        int i = notificationService.selectNotificationCount();
        return AjaxResult.success(i);
    }
    @RequestMapping("/loaMoney")
    public AjaxResult loaMoneyCount(){
        long i = loaService.selectLoaMoney();
        return AjaxResult.success(i);
    }
    @RequestMapping("/loaCount")
    public AjaxResult loaCount(){
        int i = loaService.selectLoaCount();
        return AjaxResult.success(i);
    }
}
