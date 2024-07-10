package com.qst.system.controller;

import com.qst.common.core.controller.BaseController;
import com.qst.common.core.domain.AjaxResult;
import com.qst.common.core.page.TableDataInfo;
import com.qst.system.domain.Bank;
import com.qst.system.domain.BankSend;
import com.qst.system.domain.Loans;
import com.qst.system.domain.Overdue;
import com.qst.system.service.IBankSendService;
import com.qst.system.service.ILoansService;
import com.qst.system.service.IOverdueService;
import com.qst.system.service.impl.BankSendServiceImpl;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/overdue")
public class OverdueController extends BaseController {
    @Autowired
    private IOverdueService overdueService;
    @Autowired
    private ILoansService loansService;
    private List<Overdue> overdueList;
    @GetMapping("/list")
    public TableDataInfo selectOveList(Overdue overdue){
        startPage();
        this.overdueList=overdueService.selectOveList(overdue);
        return getDataTable(this.overdueList);
    }
    @PostMapping
    public AjaxResult insert(@RequestBody Overdue overdue){
        for (Overdue i : overdueList) {
            if (overdue.getOveLoaId().equals(i.getOveLoaId())) {
                return AjaxResult.error("[新增失败]该货款ID的逾期记录已存在！");
            }
        }
        Loans selectLoansResult = loansService.selectLoansById(overdue.getOveLoaId());
        if (!overdue.getOveComNo().toString().equals(selectLoansResult.getLoaComNo())) {
            return AjaxResult.error("[新增失败]该货款ID与企业ID不匹配！");
        }
        if (overdue.getOveMoney()>selectLoansResult.getLoaMoney()) {
            return AjaxResult.error("[新增失败]该货款ID的逾期金额不得大于贷款金额！");
        }
        return toAjax(overdueService.insertOverdue(overdue));
    }
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable("ids")List<Integer> ids){
        return toAjax(overdueService.removeOverdueByIds(ids));
    }

    @GetMapping("/{id}")
    public AjaxResult selectOveById(@PathVariable("id")Integer id){
        return AjaxResult.success(overdueService.selectOveById(id));
    }
    @PutMapping
    public AjaxResult update(@RequestBody Overdue overdue){
        Loans selectLoansResult = loansService.selectLoansById(overdue.getOveLoaId());
        if (!overdue.getOveComNo().toString().equals(selectLoansResult.getLoaComNo())) {
            return AjaxResult.error("[修改失败]该货款ID与企业ID不匹配！");
        }
        if (overdue.getOveMoney()>selectLoansResult.getLoaMoney()) {
            return AjaxResult.error("[修改失败]该货款ID的逾期金额不得大于贷款金额！");
        }
        return toAjax(overdueService.updateOverdue(overdue));
    }
}
