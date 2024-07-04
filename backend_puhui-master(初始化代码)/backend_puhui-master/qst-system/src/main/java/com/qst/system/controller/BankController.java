package com.qst.system.controller;

import com.qst.common.core.domain.AjaxResult;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system/bank")
public class BankController {
    @RequestMapping("/list")
    public void BankList(){

    }
}
