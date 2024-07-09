package com.qst.system.service;

import com.qst.system.domain.Bank;

import java.util.List;

public interface IBankService {
    List<Bank> selectBankList(Bank bank);
    int addBank(Bank bank);
    int removeBankById(List<Integer> ids);
    Bank selectBankById(Integer id);
    int update(Bank bank);
}
