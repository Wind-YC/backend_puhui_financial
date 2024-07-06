package com.qst.system.service.impl;

import com.qst.system.domain.Company;
import com.qst.system.mapper.CompanyMapper;
import com.qst.system.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements ICompanyService {
    @Autowired
    private CompanyMapper companyMapper;
    /**
     * 返回数量
     * **/
    @Override
    public int selectCompanyCount() {
        return companyMapper.selectCompanyCount();
    }

    @Override
    public List<Company> selectCompanyList(Company company) {
        return companyMapper.selectCompanyList(company);
    }

    @Override
    public List<Company> selectCompanyName() {
        return companyMapper.selectCompanyName();
    }

    @Override
    public int insertCompany(Company company) {
        return companyMapper.insertCompany(company);
    }

    @Override
    public Company selectCompanyById(Integer cid) {
        return companyMapper.selectCompanyById(cid);

    }

    @Override
    public int updateCompany(Company company) {
        return companyMapper.updateCompany(company);
    }

    @Override
    public int deleteCompanyById(List<Integer> cid) {
        return companyMapper.deleteCompanyById(cid);
    }


}
