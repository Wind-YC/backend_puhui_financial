package com.qst.system.mapper;


import com.qst.system.domain.BankSend;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BankSendMapper {
    List<BankSend> selectBankSendList(BankSend bankSend);
    int addBankSend(BankSend bankSend);
    int updateStatus(BankSend bankSend);
    int delete(List<Integer> ids);
    BankSend selectBankSendById(Integer id);
    int update(BankSend bankSend);
}
