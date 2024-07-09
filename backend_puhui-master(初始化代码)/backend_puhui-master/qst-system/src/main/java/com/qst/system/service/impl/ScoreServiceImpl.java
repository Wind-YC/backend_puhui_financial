package com.qst.system.service.impl;

import com.qst.system.domain.Score;
import com.qst.system.mapper.ScoreMapper;
import com.qst.system.service.IScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreServiceImpl implements IScoreService {
    @Autowired
    private ScoreMapper scoreMapper;
    @Override
    public List<Score> selectScoreList(Score score) {
        return scoreMapper.selectScoreList(score);
    }

    @Override
    public int addScore(Score score) {
        return scoreMapper.addScore(score);
    }

    @Override
    public int removeScoreByIds(List<Integer> ids) {
        return scoreMapper.removeScoreById(ids);
    }

    @Override
    public Score selectScoreById(Integer id) {
        return scoreMapper.selectScoreById(id);
    }

    @Override
    public int update(Score score) {
        return scoreMapper.update(score);
    }
}
