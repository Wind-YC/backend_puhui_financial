package com.qst.system.service.impl;

import com.qst.system.domain.BankSend;
import com.qst.system.mapper.BankMapper;
import com.qst.system.mapper.BankSendMapper;
import com.qst.system.service.IBankSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankSendServiceImpl implements IBankSendService {
    @Autowired
    private BankSendMapper bankSendMapper;
    @Override
    public List<BankSend> selectBankSendList(BankSend bankSend) {
        return bankSendMapper.selectBankSendList(bankSend);
    }

    @Override
    public int insertBankSend(BankSend bankSend) {
        return bankSendMapper.addBankSend(bankSend);
    }

    @Override
    public int updateStatus(BankSend bankSend) {

        return bankSendMapper.updateStatus(bankSend);
    }

    @Override
    public int delete(List<Integer> ids) {
        return bankSendMapper.delete(ids);
    }

    @Override
    public BankSend selectBankSendById(Integer id) {
        return bankSendMapper.selectBankSendById(id);
    }

    @Override
    public int update(BankSend bankSend) {
        return bankSendMapper.update(bankSend);
    }
}
