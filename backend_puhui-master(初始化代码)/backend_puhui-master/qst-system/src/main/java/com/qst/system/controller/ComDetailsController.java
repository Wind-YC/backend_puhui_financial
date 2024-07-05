package com.qst.system.controller;

import com.qst.common.core.controller.BaseController;
import com.qst.common.core.page.TableDataInfo;
import com.qst.system.domain.ComDetails;
import com.qst.system.service.IComDetailsService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("企业控制类")
@RestController
@RequestMapping("/system/details")
public class ComDetailsController extends BaseController {
    @Autowired
    private IComDetailsService comDetailsService;
    @GetMapping("/list")
    public TableDataInfo list(ComDetails comDetails){
        startPage();
        return getDataTable(comDetailsService.selectComDetails(comDetails));
    }
}
