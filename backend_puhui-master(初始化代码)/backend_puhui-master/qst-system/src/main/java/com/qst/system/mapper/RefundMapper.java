package com.qst.system.mapper;

import com.qst.system.domain.Refund;
import org.apache.ibatis.annotations.Mapper;

import java.sql.Ref;
import java.util.List;

@Mapper
public interface RefundMapper {
    List<Refund> selectRefundList(Refund refund);
    int add(Refund refund);
    int deleteRefByIds(List<Integer> ids);
    List<Refund> selectRefByIds(List<Integer> ids);
    int updateRef(Refund refund);
}
