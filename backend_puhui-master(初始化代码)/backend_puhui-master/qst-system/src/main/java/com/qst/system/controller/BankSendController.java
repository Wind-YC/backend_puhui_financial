package com.qst.system.controller;

import com.qst.common.core.controller.BaseController;
import com.qst.common.core.domain.AjaxResult;
import com.qst.common.core.page.TableDataInfo;
import com.qst.system.domain.Bank;
import com.qst.system.domain.BankSend;
import com.qst.system.domain.Loans;
import com.qst.system.service.IBankSendService;
import com.qst.system.service.ILoansService;
import com.qst.system.service.impl.BankSendServiceImpl;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/send")
public class BankSendController extends BaseController {
    @Autowired
    private IBankSendService bankSendService;
    @Autowired
    private ILoansService loansService;
    private List<BankSend> bankSendList;
    @GetMapping("/list")
    public TableDataInfo selectBankSendList(BankSend bankSend){
        startPage();
        this.bankSendList=bankSendService.selectBankSendList(bankSend);
        return getDataTable(this.bankSendList);
    }
    @PostMapping
    public AjaxResult add(@RequestBody BankSend bankSend) {
        for (BankSend i : bankSendList) {
            if (bankSend.getSenLoaId().equals(i.getSenLoaId())) {
                return AjaxResult.error("[新增失败]该货款ID的放款记录已存在！");
            }
        }
        Loans selectLoansResult = loansService.selectLoansById(bankSend.getSenLoaId());
        if (!bankSend.getSenBankId().equals(selectLoansResult.getLoaBankId())) {
            return AjaxResult.error("[新增失败]该货款ID与放款银行不匹配！");
        }
        if (!bankSend.getSenComId().toString().equals(selectLoansResult.getLoaComNo())) {
            return AjaxResult.error("[新增失败]该货款ID与企业ID不匹配！");
        }
        if (!bankSend.getSenAccount().equals(selectLoansResult.getbAccountNo())) {
            return AjaxResult.error("[新增失败]该货款ID与放款账号不匹配！");
        }
        if (!bankSend.getSenUid().equals(selectLoansResult.getbIdcard())) {
            return AjaxResult.error("[新增失败]该货款ID与用户证件号不匹配！");
        }
        if (Integer.parseInt(bankSend.getSenMoney())>selectLoansResult.getLoaMoney()) {
            return AjaxResult.error("[新增失败]该货款ID的放款金额不得大于贷款金额！");
        }
        return toAjax(bankSendService.insertBankSend(bankSend));
    }
    @PutMapping("/changeSendStatus")
    public AjaxResult updateStatus (@RequestBody BankSend banksend){
        return toAjax(bankSendService.updateStatus(banksend));
    }
    @DeleteMapping("/{ids}")
    public AjaxResult delete(@PathVariable("ids")List<Integer> ids){
        return toAjax(bankSendService.delete(ids));
    }
    @GetMapping("/{id}")
    public AjaxResult selectBankSendById(@PathVariable("id")Integer id){
        return AjaxResult.success(bankSendService.selectBankSendById(id));
    }
    @PutMapping
    public AjaxResult update(@RequestBody BankSend bankSend){
        Loans selectLoansResult = loansService.selectLoansById(bankSend.getSenLoaId());
        if (!bankSend.getSenBankId().equals(selectLoansResult.getLoaBankId())) {
            return AjaxResult.error("[修改失败]该货款ID与放款银行不匹配！");
        }
        if (!bankSend.getSenComId().toString().equals(selectLoansResult.getLoaComNo())) {
            return AjaxResult.error("[修改失败]该货款ID与企业ID不匹配！");
        }
        if (!bankSend.getSenAccount().equals(selectLoansResult.getbAccountNo())) {
            return AjaxResult.error("[修改失败]该货款ID与放款账号不匹配！");
        }
        if (!bankSend.getSenUid().equals(selectLoansResult.getbIdcard())) {
            return AjaxResult.error("[修改失败]该货款ID与用户证件号不匹配！");
        }
        if (Integer.parseInt(bankSend.getSenMoney())>selectLoansResult.getLoaMoney()) {
            return AjaxResult.error("[修改失败]该货款ID的放款金额不得大于贷款金额！");
        }
        return toAjax(bankSendService.update(bankSend));
    }
}
