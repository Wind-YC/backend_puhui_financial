package com.qst.system.controller;

import com.qst.common.core.controller.BaseController;
import com.qst.common.core.domain.AjaxResult;
import com.qst.common.core.page.TableDataInfo;
import com.qst.system.domain.Score;
import com.qst.system.service.ICompanyService;
import com.qst.system.service.IScoreService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system/score")
@Api("用户积分控制类")
public class ScoreController extends BaseController {
    @Autowired
    private IScoreService scoreService;
    @Autowired
    private ICompanyService companyService;
    @GetMapping("/list")
    public TableDataInfo selectScoreList(Score score){
        startPage();
        return getDataTable(scoreService.selectScoreList(score));
    }
    @GetMapping("/comName")
    public AjaxResult selectComName(){
        AjaxResult success = AjaxResult.success();
        success.put("data",companyService.selectAllComName());
        return success;
    }
    @PostMapping
    public AjaxResult add(Score score){
        System.out.println(score);
        return toAjax(scoreService.addScore(score));
    }
}
