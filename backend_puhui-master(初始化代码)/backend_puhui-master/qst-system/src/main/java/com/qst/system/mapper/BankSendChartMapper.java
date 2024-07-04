package com.qst.system.mapper;

import com.qst.system.domain.BankSend;

import java.util.List;

public interface BankSendChartMapper {

    /* 根据给定条件,查询放款信息 */
    List<BankSend> selectBankSendChartList(BankSend bankSend);

}