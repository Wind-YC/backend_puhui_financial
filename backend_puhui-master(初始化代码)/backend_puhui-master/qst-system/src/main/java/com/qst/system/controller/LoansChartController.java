package com.qst.system.controller;

import com.netflix.discovery.converters.Auto;
import com.qst.common.core.controller.BaseController;
import com.qst.common.core.domain.AjaxResult;
import com.qst.system.domain.Loans;
import com.qst.system.service.impl.LoansServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/system/loanschart")
public class LoansChartController extends BaseController {
    @Autowired
    private LoansServiceImpl loansService;

    @GetMapping("/list")
    public AjaxResult selectLoansList(Loans loans){
        Map<String,Object> result = new HashMap<>();
        List<Loans> loansList= loansService.selectLoansList(loans);
        result.put("rows",loansList);
        return AjaxResult.success(result);
    }
}
