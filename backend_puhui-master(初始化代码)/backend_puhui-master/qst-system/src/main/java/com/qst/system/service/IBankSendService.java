package com.qst.system.service;

import com.qst.system.domain.BankSend;

import java.util.List;

public interface IBankSendService {
    List<BankSend> selectBankSendList(BankSend bankSend);
    int insertBankSend(BankSend bankSend);
    int updateStatus(BankSend bankSend);
    int delete(List<Integer> ids);
    BankSend selectBankSendById(Integer id);
    int update(BankSend bankSend);
}
