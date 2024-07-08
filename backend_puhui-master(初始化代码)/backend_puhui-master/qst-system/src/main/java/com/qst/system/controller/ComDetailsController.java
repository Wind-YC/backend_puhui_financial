package com.qst.system.controller;

import com.qst.common.core.controller.BaseController;
import com.qst.common.core.domain.AjaxResult;
import com.qst.common.core.page.TableDataInfo;
import com.qst.system.domain.ComDetails;
import com.qst.system.service.*;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    @Autowired
    private ICitiesService citiesService;
    @Autowired
    private IAreasService areasService;
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
    @GetMapping("/proCom/{pro}/{cities}/{area}")
    public AjaxResult selectComDetailsByPCA(@PathVariable("pro") String proId, @PathVariable("cities") String cityId,@PathVariable("area") String areaId){
        AjaxResult ajax = AjaxResult.success();
        ArrayList<String> list = new ArrayList<>();
        list.add(provincesService.selectProById(proId).getProvinceid());
        list.add(citiesService.selectCityById(cityId).getCityid());
        list.add(areasService.selectAreaById(areaId).getAreaid());
        ajax.put("info",list);
        return ajax;
    }

}
