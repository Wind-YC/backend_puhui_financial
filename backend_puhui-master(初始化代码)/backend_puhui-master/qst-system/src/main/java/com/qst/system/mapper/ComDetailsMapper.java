package com.qst.system.mapper;

import com.qst.system.domain.ComDetails;
import com.qst.system.domain.Company;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ComDetailsMapper{
    List<ComDetails> selectComDetailsList(ComDetails comDetails);

    ComDetails selectComDetailsById(Integer cId);
}
