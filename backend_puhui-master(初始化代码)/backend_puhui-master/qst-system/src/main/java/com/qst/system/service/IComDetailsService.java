package com.qst.system.service;

import com.qst.system.domain.ComDetails;

import java.util.List;

public interface IComDetailsService {
    List<ComDetails> selectComDetails(ComDetails comDetails);
    ComDetails selectComDetailsById(Integer cId);
}
