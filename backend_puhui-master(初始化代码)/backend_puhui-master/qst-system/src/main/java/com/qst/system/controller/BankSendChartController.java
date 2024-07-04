package com.qst.system.controller;

import com.qst.common.core.domain.AjaxResult;
import com.qst.system.domain.BankSend;
import com.qst.system.service.IBankSendChartService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Api("放款图标控制类")
@RestController
@RequestMapping("/system/sendchart/")
public class BankSendChartController {

    @Autowired  // 自动注入bankSendCharSeriveImpl对象
    IBankSendChartService bankSendChartService;

    @ApiOperation("首页放款图表,用折线图表示")
    @GetMapping("/chart")
    public AjaxResult chart() {
        // 创建一个HashMap(键值对)集合,用于存放公司名称集合、放款金额集合
        HashMap<String, Object> map = new HashMap<>();
        // 创建一个ArrayList集合(单列集合),用于存放所有公司名称
        ArrayList<String> names = new ArrayList<>();
        // 创建一个ArrayList集合(单列集合),用于存放所有放款金额
        ArrayList<String> moneys = new ArrayList<>();
        // 将BankSend数据全部查询出来
        List<BankSend> list = bankSendChartService.selectBankSendChartList(null);
        // 若查询出来的数据不为空,且集合里面的元素个数大于0,则进行遍历
        if (list != null && list.size() > 0) {
            for (BankSend bankSend : list) {
                // 获取BankSend对象中的公司名称,并往names集合里面放
                names.add(bankSend.getCompany().getComName());
                // 获取BankSend对象中的放款金额,并往moneys集合里面放
                moneys.add(bankSend.getSenMoney());
            }
        }
        // 把两个装有数据的集合,放到map集合,并起名(前端根据map集合的键来取值)
        map.put("expectedData", names);
        map.put("actualData", moneys);
        return AjaxResult.success(map);
    }
}