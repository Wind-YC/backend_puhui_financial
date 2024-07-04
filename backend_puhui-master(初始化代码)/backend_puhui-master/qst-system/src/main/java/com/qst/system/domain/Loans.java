package com.qst.system.domain;


import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class Loans {

  @ApiModelProperty(value = "id")
  private Integer loaId;

  @ApiModelProperty(value = "贷款编号")
  private String loaNo;

  @ApiModelProperty(value = "企业ID")
  private String loaComNo;

  @ApiModelProperty(value = "银行id")
  private Integer loaBankId;

  @ApiModelProperty(value = "贷款期限")
  private Integer loaLisId;

  @ApiModelProperty(value = "贷款用途")
  private String loaUse;

  @ApiModelProperty(value = "贷款积分")
  private String loaIntegral;

  @ApiModelProperty(value = "贷款利率")
  private String loaRate;

  @ApiModelProperty(value = "贷款状态")
  private String loaState;

  @ApiModelProperty(value = "贷款时间")
  private Date loaTime;

  @ApiModelProperty(value = "贷款金额")
  private Integer loaMoney;

  @ApiModelProperty(value = "到期时间")
  private Date loaEndTime;

  @ApiModelProperty(value = "删除标识")
  private String loaDel;

  @ApiModelProperty(value = "收款账户")
  private String bAccountNo;

  @ApiModelProperty(value = "收款人")
  private String bName;

  @ApiModelProperty(value = "开户行")
  private String bBankName;

  @ApiModelProperty(value = "身份证号")
  private String bIdcard;

  @ApiModelProperty(value = "签约材料")
  private String loaSign;


  public Integer getLoaId() {
    return loaId;
  }

  public void setLoaId(Integer loaId) {
    this.loaId = loaId;
  }

  public String getLoaNo() {
    return loaNo;
  }

  public void setLoaNo(String loaNo) {
    this.loaNo = loaNo;
  }

  public String getLoaComNo() {
    return loaComNo;
  }

  public void setLoaComNo(String loaComNo) {
    this.loaComNo = loaComNo;
  }

  public Integer getLoaBankId() {
    return loaBankId;
  }

  public void setLoaBankId(Integer loaBankId) {
    this.loaBankId = loaBankId;
  }

  public Integer getLoaLisId() {
    return loaLisId;
  }

  public void setLoaLisId(Integer loaLisId) {
    this.loaLisId = loaLisId;
  }

  public String getLoaUse() {
    return loaUse;
  }

  public void setLoaUse(String loaUse) {
    this.loaUse = loaUse;
  }

  public String getLoaIntegral() {
    return loaIntegral;
  }

  public void setLoaIntegral(String loaIntegral) {
    this.loaIntegral = loaIntegral;
  }

  public String getLoaRate() {
    return loaRate;
  }

  public void setLoaRate(String loaRate) {
    this.loaRate = loaRate;
  }

  public String getLoaState() {
    return loaState;
  }

  public void setLoaState(String loaState) {
    this.loaState = loaState;
  }

  public Date getLoaTime() {
    return loaTime;
  }

  public void setLoaTime(Date loaTime) {
    this.loaTime = loaTime;
  }

  public Integer getLoaMoney() {
    return loaMoney;
  }

  public void setLoaMoney(Integer loaMoney) {
    this.loaMoney = loaMoney;
  }

  public Date getLoaEndTime() {
    return loaEndTime;
  }

  public void setLoaEndTime(Date loaEndTime) {
    this.loaEndTime = loaEndTime;
  }

  public String getLoaDel() {
    return loaDel;
  }

  public void setLoaDel(String loaDel) {
    this.loaDel = loaDel;
  }

  public String getbAccountNo() {
    return bAccountNo;
  }

  public void setbAccountNo(String bAccountNo) {
    this.bAccountNo = bAccountNo;
  }

  public String getbName() {
    return bName;
  }

  public void setbName(String bName) {
    this.bName = bName;
  }

  public String getbBankName() {
    return bBankName;
  }

  public void setbBankName(String bBankName) {
    this.bBankName = bBankName;
  }

  public String getbIdcard() {
    return bIdcard;
  }

  public void setbIdcard(String bIdcard) {
    this.bIdcard = bIdcard;
  }

  public String getLoaSign() {
    return loaSign;
  }

  public void setLoaSign(String loaSign) {
    this.loaSign = loaSign;
  }

  @Override
  public String toString() {
    return "Loans{" +
            "loaId=" + loaId +
            ", loaNo='" + loaNo + '\'' +
            ", loaComNo='" + loaComNo + '\'' +
            ", loaBankId=" + loaBankId +
            ", loaLisId=" + loaLisId +
            ", loaUse='" + loaUse + '\'' +
            ", loaIntegral='" + loaIntegral + '\'' +
            ", loaRate='" + loaRate + '\'' +
            ", loaState='" + loaState + '\'' +
            ", loaTime=" + loaTime +
            ", loaMoney=" + loaMoney +
            ", loaEndTime=" + loaEndTime +
            ", loaDel='" + loaDel + '\'' +
            ", bAccountNo='" + bAccountNo + '\'' +
            ", bName='" + bName + '\'' +
            ", bBankName='" + bBankName + '\'' +
            ", bIdcard='" + bIdcard + '\'' +
            ", loaSign='" + loaSign + '\'' +
            '}';
  }
}
