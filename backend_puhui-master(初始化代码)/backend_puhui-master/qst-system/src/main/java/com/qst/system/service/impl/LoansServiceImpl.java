package com.qst.system.service.impl;

import com.qst.system.domain.Loans;
import com.qst.system.mapper.LoansMapper;
import com.qst.system.service.ILoansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoansServiceImpl implements ILoansService {
    @Autowired
    private LoansMapper loansMapper;
    @Override
    public int selectLoanMoney() {
        return loansMapper.selectLoanMoney();
    }

    @Override
    public int selectLoanCount() {
        return loansMapper.selectLoanCount();
    }

    @Override
    public List<Loans> selectLoansList(Loans loans) {
        return loansMapper.selectLoansList(loans);
    }

    @Override
    public Loans selectLoansById(Integer loansId) {
        return loansMapper.selectLoansById(loansId);
    }

    @Override
    public int insertLoans(Loans loans) {
        return loansMapper.insertLoans(loans);
    }

}
