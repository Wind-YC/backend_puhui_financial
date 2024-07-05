package com.qst.system.mapper;

import com.qst.system.domain.Company;

import java.util.List;

public interface CompanyMapper {
    //查询公司总数量
    int selectCompanyCount();
    List<Company> selectCompanyList(Company company);
}
