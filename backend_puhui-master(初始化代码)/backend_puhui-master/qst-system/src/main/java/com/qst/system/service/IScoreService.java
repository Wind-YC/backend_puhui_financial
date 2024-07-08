package com.qst.system.service;

import com.qst.system.domain.Score;

import java.util.List;

public interface IScoreService {
    List<Score> selectScoreList(Score score);
    int addScore(Score score);
}
