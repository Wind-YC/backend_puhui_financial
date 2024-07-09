package com.qst.system.mapper;

import com.qst.system.domain.Score;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ScoreMapper {
    List<Score> selectScoreList(Score score);
    int addScore(Score score);
    int removeScoreById(List<Integer> ids);

    Score selectScoreById(Integer id);

    int update(Score score);
}
