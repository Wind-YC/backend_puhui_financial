package com.qst.system.service.impl;

import com.qst.system.domain.Bank;
import com.qst.system.mapper.BankMapper;
import com.qst.system.service.IBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImpl implements IBankService {
    @Autowired
    private BankMapper bankMapper;
    @Override
    public List<Bank> selectBankList() {
        return bankMapper.selectBankList();
    }

    @Override
    public int addBank(Bank bank) {

        return  bankMapper.addBank(bank);
    }

    @Override
    public int removeBankById(List<Integer> ids) {
        return bankMapper.removeBankById(ids);
    }

    @Override
    public Bank selectBankById(Integer id) {
        return bankMapper.selectBankById(id);
    }

    @Override
    public int update(Bank bank) {
        return bankMapper.update(bank);
    }
}
