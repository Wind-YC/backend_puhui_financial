package com.qst.system.service;

import com.qst.system.domain.Overdue;

import java.util.List;

public interface IOverdueService {
    int insertOverdue(Overdue overdue);
    int removeOverdueByIds(List<Integer> ids);
    int updateOverdue(Overdue overdue);
}
