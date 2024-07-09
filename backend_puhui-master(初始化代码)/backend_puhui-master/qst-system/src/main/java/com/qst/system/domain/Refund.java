package com.qst.system.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.qst.common.core.domain.BaseEntity;

import java.util.Date;

public class Refund extends BaseEntity {

  private static final long serialVersionUID = 1L;

  private Integer refId;
  private String refComNo;
  private Integer refBankId;
  private Integer refLoId;
  private Integer refOveId;
  @JsonFormat(pattern = "yyyy-MM-dd")
  private Date refTime;
  private Integer refMoney;
  private String refMode;
  private String refState;
  private String refDel;
  @JsonFormat(pattern = "yyyy-MM-dd")
  private Date refActTime;
  private Company company;
  private Bank bank;
  private Overdue overdue;
  private Loans loans;

  @Override
  public String toString() {
    return "Refund{" +
            "refId=" + refId +
            ", refComNo='" + refComNo + '\'' +
            ", refBankId=" + refBankId +
            ", refLoId=" + refLoId +
            ", refOveId=" + refOveId +
            ", refTime=" + refTime +
            ", refMoney=" + refMoney +
            ", refMode='" + refMode + '\'' +
            ", refState='" + refState + '\'' +
            ", refDel='" + refDel + '\'' +
            ", refActTime=" + refActTime +
            ", company=" + company +
            ", bank=" + bank +
            ", overdue=" + overdue +
            ", loans=" + loans +
            '}';
  }

  public Integer getRefId() {
    return refId;
  }

  public void setRefId(Integer refId) {
    this.refId = refId;
  }

  public String getRefComNo() {
    return refComNo;
  }

  public void setRefComNo(String refComNo) {
    this.refComNo = refComNo;
  }

  public Integer getRefBankId() {
    return refBankId;
  }

  public void setRefBankId(Integer refBankId) {
    this.refBankId = refBankId;
  }

  public Integer getRefLoId() {
    return refLoId;
  }

  public void setRefLoId(Integer refLoId) {
    this.refLoId = refLoId;
  }

  public Integer getRefOveId() {
    return refOveId;
  }

  public void setRefOveId(Integer refOveId) {
    this.refOveId = refOveId;
  }

  public Date getRefTime() {
    return refTime;
  }

  public void setRefTime(Date refTime) {
    this.refTime = refTime;
  }

  public Integer getRefMoney() {
    return refMoney;
  }

  public void setRefMoney(Integer refMoney) {
    this.refMoney = refMoney;
  }

  public String getRefMode() {
    return refMode;
  }

  public void setRefMode(String refMode) {
    this.refMode = refMode;
  }

  public String getRefState() {
    return refState;
  }

  public void setRefState(String refState) {
    this.refState = refState;
  }

  public String getRefDel() {
    return refDel;
  }

  public void setRefDel(String refDel) {
    this.refDel = refDel;
  }

  public Date getRefActTime() {
    return refActTime;
  }

  public void setRefActTime(Date refActTime) {
    this.refActTime = refActTime;
  }

  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  public Bank getBank() {
    return bank;
  }

  public void setBank(Bank bank) {
    this.bank = bank;
  }

  public Overdue getOverdue() {
    return overdue;
  }

  public void setOverdue(Overdue overdue) {
    this.overdue = overdue;
  }

  public Loans getLoans() {
    return loans;
  }

  public void setLoans(Loans loans) {
    this.loans = loans;
  }
}
