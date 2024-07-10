package com.qst.system.service.impl;

import com.qst.system.domain.Overdue;
import com.qst.system.mapper.OverdueMapper;
import com.qst.system.service.IOverdueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OverdueServiceImpl implements IOverdueService {
    @Autowired
    private OverdueMapper overdueMapper;

    @Override
    public List<Overdue> selectOveList(Overdue overdue) {

        return overdueMapper.selectOveList(overdue);
    }

    @Override
    public int insertOverdue(Overdue overdue) {
        return overdueMapper.insertOverdue(overdue);
    }

    @Override
    public int removeOverdueByIds(List<Integer> ids) {
        return overdueMapper.removeOverdueByIds(ids);
    }

    @Override
    public int updateOverdue(Overdue overdue) {
        return overdueMapper.updateOverdue(overdue);
    }

    @Override
    public Overdue selectOveById(Integer id) {
        return overdueMapper.selectOveById(id);
    }
}
