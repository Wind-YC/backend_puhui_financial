package com.qst.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.qst.common.annotation.Excel;
import com.qst.common.core.domain.BaseEntity;

/**
 * 放款对象 bank_send
 *
 * @author qst
 * @date 2021-09-27
 */
@ApiModel("放款实体类")
public class BankSend extends BaseEntity
{

  /** 主键 */
  @ApiModelProperty("编号")
  private Integer senId;

  /** 银行ID */
  @ApiModelProperty("银行ID")
  @Excel(name = "银行ID")
  private Integer senBankId;

  /** 贷款ID */
  @ApiModelProperty("贷款ID")
  @Excel(name = "贷款ID")
  private Integer senLoaId;

  /** 企业ID */
  @ApiModelProperty("企业ID")
  @Excel(name = "企业ID")
  private Integer senComId;

  /** 放款账号 */
  @ApiModelProperty("放款账号")
  @Excel(name = "放款账号")
  private String senAccount;

  /** 放款用户姓名 */
  @ApiModelProperty("放款用户姓名")
  @Excel(name = "放款用户姓名")
  private String senUname;

  /** 放款用户证件号 */
  @ApiModelProperty("放款用户证件号")
  @Excel(name = "放款用户证件号")
  private String senUid;

  /** 放款金额 */
  @ApiModelProperty("放款金额")
  @Excel(name = "放款金额")
  private String senMoney;

  /** 放款时间 */
  @ApiModelProperty("放款时间")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @Excel(name = "放款时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
  private Date senTime;

  /** 放款方式 */
  @ApiModelProperty("放款方式")
  @Excel(name = "放款方式")
  private String senMode;

  /** 放款状态 */
  @ApiModelProperty("放款状态")
  @Excel(name = "放款状态")
  private String senStatus;

  /** 删除标识 */
  @ApiModelProperty("删除标识")
  private String senDel;

  private Company company;

  private Loans loans;

  private Bank bank;
  private Idcard idcard;

  @Override
  public String toString() {
    return "BankSend{" +
            "senId=" + senId +
            ", senBankId=" + senBankId +
            ", senLoaId=" + senLoaId +
            ", senComId=" + senComId +
            ", senAccount='" + senAccount + '\'' +
            ", senUname='" + senUname + '\'' +
            ", senUid='" + senUid + '\'' +
            ", senMoney='" + senMoney + '\'' +
            ", senTime=" + senTime +
            ", senMode='" + senMode + '\'' +
            ", senStatus='" + senStatus + '\'' +
            ", senDel='" + senDel + '\'' +
            ", company=" + company +
            ", loans=" + loans +
            ", bank=" + bank +
            ", idcard=" + idcard +
            '}';
  }

  public Integer getSenId() {
    return senId;
  }

  public void setSenId(Integer senId) {
    this.senId = senId;
  }

  public Integer getSenBankId() {
    return senBankId;
  }

  public void setSenBankId(Integer senBankId) {
    this.senBankId = senBankId;
  }

  public Integer getSenLoaId() {
    return senLoaId;
  }

  public void setSenLoaId(Integer senLoaId) {
    this.senLoaId = senLoaId;
  }

  public Integer getSenComId() {
    return senComId;
  }

  public void setSenComId(Integer senComId) {
    this.senComId = senComId;
  }

  public String getSenAccount() {
    return senAccount;
  }

  public void setSenAccount(String senAccount) {
    this.senAccount = senAccount;
  }

  public String getSenUname() {
    return senUname;
  }

  public void setSenUname(String senUname) {
    this.senUname = senUname;
  }

  public String getSenUid() {
    return senUid;
  }

  public void setSenUid(String senUid) {
    this.senUid = senUid;
  }

  public String getSenMoney() {
    return senMoney;
  }

  public void setSenMoney(String senMoney) {
    this.senMoney = senMoney;
  }

  public Date getSenTime() {
    return senTime;
  }

  public void setSenTime(Date senTime) {
    this.senTime = senTime;
  }

  public String getSenMode() {
    return senMode;
  }

  public void setSenMode(String senMode) {
    this.senMode = senMode;
  }

  public String getSenStatus() {
    return senStatus;
  }

  public void setSenStatus(String senStatus) {
    this.senStatus = senStatus;
  }

  public String getSenDel() {
    return senDel;
  }

  public void setSenDel(String senDel) {
    this.senDel = senDel;
  }

  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  public Loans getLoans() {
    return loans;
  }

  public void setLoans(Loans loans) {
    this.loans = loans;
  }

  public Bank getBank() {
    return bank;
  }

  public void setBank(Bank bank) {
    this.bank = bank;
  }

  public Idcard getIdcard() {
    return idcard;
  }

  public void setIdcard(Idcard idcard) {
    this.idcard = idcard;
  }
}
