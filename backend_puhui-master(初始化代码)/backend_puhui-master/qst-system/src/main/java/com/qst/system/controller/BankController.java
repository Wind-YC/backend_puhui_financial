package com.qst.system.controller;

import com.qst.common.core.controller.BaseController;
import com.qst.common.core.domain.AjaxResult;
import com.qst.common.core.page.TableDataInfo;
import com.qst.common.utils.poi.ExcelUtil;
import com.qst.system.domain.Bank;
import com.qst.system.service.IBankService;
import org.apache.ibatis.annotations.Mapper;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/bank")
public class BankController extends BaseController {
    @Autowired
    private IBankService bankService;
    @RequestMapping("/list")
    public TableDataInfo BankList(){
        startPage();
        return getDataTable(bankService.selectBankList());
    }
    @PostMapping
    public AjaxResult add(@RequestBody Bank bank){
        return toAjax(bankService.addBank(bank));
    }
    @DeleteMapping("/{ids}")
    public AjaxResult removeBankById(@PathVariable("ids") List<Integer> ids){
        return toAjax(bankService.removeBankById(ids));
    }
    @RequestMapping("/{ids}")
    public AjaxResult selectBankById(@PathVariable("ids") Integer id){
        return AjaxResult.success(bankService.selectBankById(id));
    }
    @PutMapping
    public AjaxResult update(@RequestBody Bank bank){
        return toAjax(bankService.update(bank));
    }
    @GetMapping("/export")
    public AjaxResult export()
    {
        startPage();
        List<Bank> list = bankService.selectBankList();
        ExcelUtil<Bank> util = new ExcelUtil<>(Bank.class);
        return util.exportExcel(list, "企业详情数据");
    }
}
