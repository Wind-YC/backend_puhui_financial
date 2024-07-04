package com.qst.system.service;

import com.qst.system.domain.BankSend;

import java.util.List;

public interface IBankSendChartService {

    /**
     *  查询放款信息
     */
    List<BankSend> selectBankSendChartList(BankSend bankSend);

}