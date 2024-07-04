package com.qst.system.service.impl;

import com.qst.system.domain.BankSend;
import com.qst.system.mapper.BankSendChartMapper;
import com.qst.system.service.IBankSendChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BankSendChartServiceImpl implements IBankSendChartService {
    @Autowired
    private BankSendChartMapper bankSendChartMapper;

    /**
     * 放款图标-用折线图表示,业务层
     * @param bankSend
     * @return
     */
    @Override
    public List<BankSend> selectBankSendChartList(BankSend bankSend) {
        return bankSendChartMapper.selectBankSendChartList(bankSend);
    }
}