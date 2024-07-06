package com.qst.system.controller;

import com.qst.common.core.controller.BaseController;
import com.qst.common.core.domain.AjaxResult;
import com.qst.common.core.page.TableDataInfo;
import com.qst.system.domain.ComDetails;
import com.qst.system.service.IComDetailsService;
import com.qst.system.service.ICompanyService;
import com.qst.system.service.IProvincesService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/{cID}")
    public AjaxResult selectCompaniesById(@PathVariable("cID") Integer cid){
        return AjaxResult.success(comDetailsService.selectComDetailsById(cid));
    }
    @DeleteMapping("/{cID}")
    public AjaxResult deleteCompaniesById(@PathVariable("cID") List<Integer> cid){
        comDetailsService.updateComStatusTo3(cid);

        return toAjax(comDetailsService.deleteCompanyById(cid));
    }
    @PostMapping
    public AjaxResult add(@RequestBody ComDetails comDetails){
        comDetailsService.addComDetails(comDetails);
        return toAjax(comDetailsService.updateComStatusTo5(comDetails));
    }
    @PutMapping
    public AjaxResult update(@RequestBody ComDetails comDetails){
        return toAjax(comDetailsService.updateComDetails(comDetails));
    }

}
