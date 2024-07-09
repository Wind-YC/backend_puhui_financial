package com.qst.system.controller;

import com.qst.common.core.controller.BaseController;
import com.qst.common.core.domain.AjaxResult;
import com.qst.common.core.page.TableDataInfo;
import com.qst.system.domain.Score;
import com.qst.system.service.ICompanyService;
import com.qst.system.service.IScoreService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/score")
@Api("用户积分控制类")
public class ScoreController extends BaseController {
    @Autowired
    private IScoreService scoreService;
    @Autowired
    private ICompanyService companyService;
    private List<Score> scoreList;
    private Score selectResult;
    @GetMapping("/list")
    public TableDataInfo selectScoreList(Score score){
        startPage();
        this.scoreList=scoreService.selectScoreList(score);
        return getDataTable(scoreList);
    }
    @GetMapping("/comName")
    public AjaxResult selectComName(){
        AjaxResult success = AjaxResult.success();
        success.put("data",companyService.selectAllComName());
        return success;
    }
    @PostMapping
    public AjaxResult add(@RequestBody Score score){

        return toAjax(scoreService.addScore(score));
    }
    @DeleteMapping("/{ids}")
    public AjaxResult removeScoreByIds(@PathVariable("ids") List<Integer> ids){
        return toAjax(scoreService.removeScoreByIds(ids));
    }
    @GetMapping("/{id}")
    public AjaxResult selectScoreById(@PathVariable("id") Integer id){
        this.selectResult=scoreService.selectScoreById(id);
        return AjaxResult.success(selectResult);
    }
    @PutMapping
    public AjaxResult update(@RequestBody Score score){
        if(score.getComId()==null)
            return AjaxResult.error("[操作失败]：企业名称不能为空！");
        //发生修改
        if(!score.getComId().equals(selectResult.getComId())){
            scoreList.remove(this.selectResult);
            for(Score i:scoreList){
                if(i.getComId().equals(score.getComId())){
                    return AjaxResult.error("[操作失败]：该企业积分记录已存在！");
                }
            }
        }
        return toAjax(scoreService.update(score));
    }
}
