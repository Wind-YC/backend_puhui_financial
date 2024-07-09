package com.qst.system.service;

import com.qst.system.domain.Loans;

import java.util.List;

public interface ILoansService {
    public int selectLoanMoney();

    public int selectLoanCount();

    public List<Loans> selectLoansList(Loans loans);

    public Loans selectLoansById(Integer loansId);

    public int insertLoans(Loans loans);
}
