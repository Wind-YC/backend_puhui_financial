package com.qst.system.controller;

import com.qst.common.core.controller.BaseController;
import com.qst.common.core.domain.AjaxResult;
import com.qst.common.core.page.TableDataInfo;
import com.qst.system.domain.Overdue;
import com.qst.system.domain.Refund;
import com.qst.system.service.IOverdueService;
import com.qst.system.service.IRefundService;
import com.qst.system.util.ConstUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/system/refund")
public class RefundController extends BaseController {
    @Autowired
    private IRefundService refundService;
    @Autowired
    private IOverdueService overdueService;

    @GetMapping("/list")
    public TableDataInfo selectRefundList(Refund refund){
        startPage();
        return getDataTable(refundService.selectRefundList(refund));
    }
    @PostMapping
    public AjaxResult add(@RequestBody Refund refund){
        if(refund.getRefState().equals("3")){
            Overdue due = new Overdue();
            due.setOveComNo(Integer.valueOf(refund.getRefComNo()));
            due.setOveLoaId(refund.getRefLoId());
            due.setOveMoney(refund.getRefMoney());
            due.setOveStartTime(new Date());
            due.setOveCutCount(ConstUtil.COUNT.intValue());
            due.setOveDel(ConstUtil.DEL_SIGN);
            due.setOveAddInt(ConstUtil.RATE); // 逾期利息
            overdueService.insertOverdue(due);
            refund.setRefOveId(due.getOveId());
        }
        return toAjax(refundService.insertRefund(refund));
    }
    @DeleteMapping("/{ids}")
    public AjaxResult deleteRefByIds(@PathVariable("ids") List<Integer> ids){
        List<Refund> selectResult = refundService.selectRefByIds(ids);
        List<Integer> removeOveList = new ArrayList<>();
        for(Refund i : selectResult){
            if(i.getRefState().equals("3")){
                removeOveList.add(i.getRefOveId());
            }
        }
        overdueService.removeOverdueByIds(removeOveList);
        return toAjax(refundService.deleteRefByIds(ids));
    }
    @GetMapping("/{ids}")
    public AjaxResult selectRefByIds(@PathVariable("ids") List<Integer> ids){
        return AjaxResult.success(refundService.selectRefByIds(ids).get(0));
    }
    @PutMapping
    public AjaxResult update(@RequestBody Refund refund){
        //state: 1/2->3
        if(refund.getRefState().equals("3")&& !refundService.selectRefByIds(Collections.singletonList(refund.getRefId())).get(0).getRefState().equals("3")){
            Overdue due = new Overdue();
            due.setOveComNo(Integer.valueOf(refund.getRefComNo()));
            due.setOveLoaId(refund.getRefLoId());
            due.setOveMoney(refund.getRefMoney());
            due.setOveStartTime(new Date());
            due.setOveCutCount(ConstUtil.COUNT.intValue());
            due.setOveDel(ConstUtil.DEL_SIGN);
            due.setOveAddInt(ConstUtil.RATE); // 逾期利息
            overdueService.insertOverdue(due);
            refund.setRefOveId(due.getOveId());
        //state 3->1/2
        }else if(!refund.getRefState().equals("3")&& refundService.selectRefByIds(Collections.singletonList(refund.getRefId())).get(0).getRefState().equals("3")){
            List<Integer> tempList = new ArrayList<>();
            tempList.add(refund.getRefOveId());
            overdueService.removeOverdueByIds(tempList);
            refund.setRefOveId(null);
        //state 3->3
        }else if(refund.getRefState().equals("3")&& refundService.selectRefByIds(Collections.singletonList(refund.getRefId())).get(0).getRefState().equals("3")){
            Overdue due = new Overdue();
            due.setOveId(refund.getRefOveId());
            due.setOveComNo(Integer.valueOf(refund.getRefComNo()));
            due.setOveLoaId(refund.getRefLoId());
            due.setOveMoney(refund.getRefMoney());
            due.setOveStartTime(new Date());
            due.setOveCutCount(ConstUtil.COUNT.intValue());
            due.setOveDel(ConstUtil.DEL_SIGN);
            due.setOveAddInt(ConstUtil.RATE); // 逾期利息
            overdueService.updateOverdue(due);
        }
        return toAjax(refundService.updateRef(refund));
    }
}
