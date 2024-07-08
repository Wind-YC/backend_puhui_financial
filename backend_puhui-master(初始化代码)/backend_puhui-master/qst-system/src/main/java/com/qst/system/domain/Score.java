package com.qst.system.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.qst.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel("用户积分实体类")
public class Score extends BaseEntity {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty("用户积分ID")
  private Integer scoreId;
  @ApiModelProperty("公司ID")
  private Integer comId;
  @ApiModelProperty("积分值")
  private Integer scoreNum;
  @ApiModelProperty("更新时间")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date updateTime;
  @ApiModelProperty("更新详情")
  private String updateDetail;
  @ApiModelProperty("公司名称")
  private String comName;
//  @ApiModelProperty("公司")
//  private Company company;


  @Override
  public String toString() {
    return "Score{" +
            "scoreId=" + scoreId +
            ", comId=" + comId +
            ", scoreNum=" + scoreNum +
            ", updateTime=" + updateTime +
            ", updateDetail='" + updateDetail + '\'' +
            ", comName='" + comName + '\'' +
            '}';
  }

  public Integer getScoreId() {
    return scoreId;
  }

  public void setScoreId(Integer scoreId) {
    this.scoreId = scoreId;
  }

  public Integer getComId() {
    return comId;
  }

  public void setComId(Integer comId) {
    this.comId = comId;
  }

  public Integer getScoreNum() {
    return scoreNum;
  }

  public void setScoreNum(Integer scoreNum) {
    this.scoreNum = scoreNum;
  }

  @Override
  public Date getUpdateTime() {
    return updateTime;
  }

  @Override
  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  public String getUpdateDetail() {
    return updateDetail;
  }

  public void setUpdateDetail(String updateDetail) {
    this.updateDetail = updateDetail;
  }

  public String getComName() {
    return comName;
  }

  public void setComName(String comName) {
    this.comName = comName;
  }
}
