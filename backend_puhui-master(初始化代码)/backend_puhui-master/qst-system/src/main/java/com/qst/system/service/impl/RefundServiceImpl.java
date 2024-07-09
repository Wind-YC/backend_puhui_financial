package com.qst.system.service.impl;

import com.qst.system.domain.Refund;
import com.qst.system.mapper.RefundMapper;
import com.qst.system.service.IRefundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RefundServiceImpl implements IRefundService {
    @Autowired
    private RefundMapper refundMapper;
    @Override
    public List<Refund> selectRefundList(Refund refund) {
        return refundMapper.selectRefundList(refund);
    }

    @Override
    public int insertRefund(Refund refund) {

        return refundMapper.add(refund);
    }

    @Override
    public int deleteRefByIds(List<Integer> ids) {

        return refundMapper.deleteRefByIds(ids);
    }

    @Override
    public List<Refund> selectRefByIds(List<Integer> ids) {
        return refundMapper.selectRefByIds(ids);
    }

    @Override
    public int updateRef(Refund refund) {
        return refundMapper.updateRef(refund);
    }
}
