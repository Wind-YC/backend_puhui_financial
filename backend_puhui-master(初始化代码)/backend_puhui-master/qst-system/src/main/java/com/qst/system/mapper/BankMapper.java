package com.qst.system.mapper;

import com.qst.system.domain.Bank;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BankMapper {
    List<Bank> selectBankList();
    int addBank(Bank bank);
    int removeBankById(List<Integer> ids);
    Bank selectBankById(Integer id);
    int update(Bank bank);
}
