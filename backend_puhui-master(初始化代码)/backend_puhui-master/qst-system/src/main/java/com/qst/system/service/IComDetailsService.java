package com.qst.system.service;

import com.qst.system.domain.ComDetails;

import java.util.List;

public interface IComDetailsService {
    List<ComDetails> selectComDetails(ComDetails comDetails);

    ComDetails selectComDetailsById(Integer cId);

    int deleteCompanyById(List<Integer> id);

    int addComDetails(ComDetails comDetails);

    int updateComStatusTo5(ComDetails comDetails);
    int updateComStatusTo3(List<Integer> id);

    int updateComDetails(ComDetails comDetails);
}

