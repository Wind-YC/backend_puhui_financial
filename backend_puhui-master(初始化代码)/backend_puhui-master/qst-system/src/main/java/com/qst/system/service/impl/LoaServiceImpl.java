package com.qst.system.service.impl;

import com.qst.system.mapper.LoaMapper;
import com.qst.system.service.ILoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoaServiceImpl implements ILoaService {

    @Autowired
    private LoaMapper loaMapper;

    @Override
    public long selectLoaMoney() {
        return loaMapper.selectLoaMoney();
    }

    @Override
    public int selectLoaCount() {
        return loaMapper.selectLoaCount();
    }


}
