package com.qst.system.controller;

import com.netflix.discovery.converters.Auto;
import com.qst.common.core.controller.BaseController;
import com.qst.common.core.domain.AjaxResult;
import com.qst.common.core.page.TableDataInfo;
import com.qst.common.utils.uuid.IdUtils;
import com.qst.system.domain.Bank;
import com.qst.system.domain.Loans;
import com.qst.system.service.IBankService;
import com.qst.system.service.ILoansService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.sf.jsqlparser.schema.Table;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api("贷款控制类")
@RestController
@RequestMapping("/system/loans")
public class LoansController extends BaseController {
    @Autowired
    ILoansService loansService;
    @Autowired
    IBankService bankService;
    /**
     * 查询贷款列表
     */
    @ApiOperation("查询贷款列表")
    @GetMapping("/list")
    public TableDataInfo list(Loans loans){
        startPage();
        return getDataTable(loansService.selectLoansList(loans));
    }
    /**
     * 查询银行列表
     */
//    @ApiOperation("查询银行列表")
//    @GetMapping("/bankName")
//    public AjaxResult listBankName(){
//        return AjaxResult.success(bankService.getBankList(null));
//    }
    /**
     * 新增贷款
     */
    @ApiOperation("新增贷款")
    @PostMapping
    public AjaxResult insertLoans(@RequestBody Loans loans){
        loans.setLoaNo(IdUtils.getUUID_8());
        return toAjax(loansService.insertLoans(loans));
    }
    /**
     * 查询贷款详情
     */
    @ApiOperation("查看贷款详情")
    @GetMapping("/{loansId}")
    public AjaxResult selectLoansById(@PathVariable("loansId")Integer loansId){
        return AjaxResult.success(loansService.selectLoansById(loansId));
    }
    @GetMapping("/loansNo")
    public AjaxResult selectLoansNo(Loans loans){
        return AjaxResult.success(loansService.selectLoansList(loans));
    }
    @GetMapping("/bankName")
    public AjaxResult selectBankName(Bank bank){
        return AjaxResult.success(bankService.selectBankList(bank));
    }
}
