package com.qst.system.mapper;

import com.qst.system.domain.ComDetails;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ComDetailsMapper{
    List<ComDetails> selectComDetailsList(ComDetails comDetails);

    ComDetails selectComDetailsById(Integer cId);
    int deleteCompanyById(List<Integer> ids);

    int addComDetails(ComDetails comDetails);

    int updateComStatusTo5(ComDetails comDetails);
    int updateComStatusTo3(List<Integer> id);

    int updateComDetails(ComDetails comDetails);

}
