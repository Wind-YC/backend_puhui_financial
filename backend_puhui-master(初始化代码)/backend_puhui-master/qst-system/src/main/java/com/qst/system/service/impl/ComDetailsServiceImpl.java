package com.qst.system.service.impl;

import com.qst.system.domain.ComDetails;
import com.qst.system.mapper.ComDetailsMapper;
import com.qst.system.service.IComDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComDetailsServiceImpl implements IComDetailsService {
    @Autowired
    private ComDetailsMapper comDetailsMapper;
    @Override
    public List<ComDetails> selectComDetails(ComDetails comDetails) {
        return comDetailsMapper.selectComDetailsList(comDetails);
    }
}
