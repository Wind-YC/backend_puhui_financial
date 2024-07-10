package com.qst.system.mapper;

import com.qst.system.domain.Loans;

import java.util.List;

public interface LoansMapper {
    int selectLoanMoney();

    int selectLoanCount();

    List<Loans> selectLoansList(Loans loans);

    Loans selectLoansById(Integer loansId);

    int insertLoans(Loans loans);
    Loans selectLoansByNo(String no);

}
