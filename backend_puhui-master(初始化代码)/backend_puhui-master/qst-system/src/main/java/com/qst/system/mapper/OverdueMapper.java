package com.qst.system.mapper;


import com.qst.system.domain.Overdue;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OverdueMapper {
    int insertOverdue(Overdue overdue);
    int removeOverdueByIds(List<Integer> ids);
    int updateOverdue(Overdue overdue);
}
