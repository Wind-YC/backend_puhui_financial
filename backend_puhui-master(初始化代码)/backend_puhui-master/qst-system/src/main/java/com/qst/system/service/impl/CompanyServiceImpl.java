package com.qst.system.service.impl;

import com.qst.system.mapper.CompanyMapper;
import com.qst.system.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
