package com.qst.system.controller;

import com.qst.common.core.controller.BaseController;
import com.qst.common.core.domain.AjaxResult;
import com.qst.common.core.page.TableDataInfo;
import com.qst.system.domain.ComDetails;
import com.qst.system.service.IComDetailsService;
import com.qst.system.service.ICompanyService;
import com.qst.system.service.IProvincesService;
import com.qst.system.service.impl.ProvincesServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("企业控制类")
@RestController
@RequestMapping("/system/details")
public class ComDetailsController extends BaseController {
    @Autowired
    private IComDetailsService comDetailsService;
    @Autowired
    private IProvincesService provincesService;
    @Autowired
    private ICompanyService companyService;
    @GetMapping("/list")
    public TableDataInfo list(ComDetails comDetails){
        startPage();
        return getDataTable(comDetailsService.selectComDetails(comDetails));
    }
    @GetMapping("/pro")
    public AjaxResult getInfoPro(){

        AjaxResult ajax=AjaxResult.success();
        ajax.put("provincs",provincesService.selectProvincesAndCity());
        return ajax;

    }

    @GetMapping("/companyName")
    public AjaxResult getCompanyName(){

        return AjaxResult.success(companyService.selectCompanyName());
    }
    @GetMapping("/companies/{cID}")
    public AjaxResult selectCompanies(@PathVariable("cID") Integer cid){
        return AjaxResult.success(comDetailsService.selectComDetailsById(cid));
    }
}
