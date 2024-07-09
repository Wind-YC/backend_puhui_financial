package com.qst.system.controller;

import com.qst.common.core.controller.BaseController;
import com.qst.common.core.domain.AjaxResult;
import com.qst.system.service.impl.CompanyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system/aptitude")
public class AptitudeController extends BaseController {
    @Autowired
    private CompanyServiceImpl companyService;

    @GetMapping("/comName")
    public AjaxResult selectComName(){
        return AjaxResult.success(companyService.selectAllComName());
    }
}
