package com.qst.system.mapper;

import com.qst.system.domain.Company;

import java.util.List;

public interface CompanyMapper {
    //查询公司总数量
    int selectCompanyCount();
    List<Company> selectCompanyList(Company company);
    List<Company> selectAllComName();

    List<Company> selectCompanyName();

    int insertCompany(Company company);

    Company selectCompanyById(Integer id);

    int updateCompany(Company company);

    int deleteCompanyById(List<Integer> cid);
}
