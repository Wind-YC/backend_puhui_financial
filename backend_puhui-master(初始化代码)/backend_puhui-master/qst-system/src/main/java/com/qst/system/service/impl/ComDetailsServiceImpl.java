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

    @Override
    public ComDetails selectComDetailsById(Integer cId) {
        return comDetailsMapper.selectComDetailsById(cId);
    }

    @Override
    public int deleteCompanyById(List<Integer> id) {

        return comDetailsMapper.deleteCompanyById(id);
    }

    @Override
    public int addComDetails(ComDetails comDetails) {
        return comDetailsMapper.addComDetails(comDetails);
    }

    @Override
    public int updateComStatusTo5(ComDetails comDetails) {
        return comDetailsMapper.updateComStatusTo5(comDetails);
    }

    @Override
    public int updateComStatusTo3(List<Integer> id) {
        return comDetailsMapper.updateComStatusTo3(id);
    }

    @Override
    public int updateComDetails(ComDetails comDetails){
        return comDetailsMapper.updateComDetails(comDetails);
    }


}
