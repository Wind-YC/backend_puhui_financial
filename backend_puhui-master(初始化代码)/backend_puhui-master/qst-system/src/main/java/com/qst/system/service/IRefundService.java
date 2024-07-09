package com.qst.system.service;

import com.qst.system.domain.Refund;

import java.util.List;

public interface IRefundService {
    List<Refund> selectRefundList(Refund refund);
    int insertRefund(Refund refund);
    int deleteRefByIds(List<Integer> ids);
    List<Refund> selectRefByIds(List<Integer> ids);
    int updateRef(Refund refund);
}
