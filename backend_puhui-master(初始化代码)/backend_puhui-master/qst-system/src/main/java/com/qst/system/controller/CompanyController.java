package com.qst.system.controller;

import com.qst.common.core.controller.BaseController;
import com.qst.common.core.page.TableDataInfo;
import com.qst.system.domain.Company;
import com.qst.system.service.ICompanyService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api("企业控制类")
@RestController
@RequestMapping("/system/company")
public class CompanyController extends BaseController {

    @Autowired
    private ICompanyService companyService;
    @GetMapping("/list")
    public TableDataInfo list(Company company){
        startPage();
        List<Company> list = companyService.selectCompanyList(company);
        return getDataTable(list);
    }
}
