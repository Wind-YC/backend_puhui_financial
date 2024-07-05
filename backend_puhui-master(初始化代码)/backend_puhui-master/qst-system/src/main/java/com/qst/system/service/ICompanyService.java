package com.qst.system.service;

import com.qst.system.domain.Company;

import java.util.List;

public interface ICompanyService {
    int selectCompanyCount();
    List<Company> selectCompanyList(Company company);
}
