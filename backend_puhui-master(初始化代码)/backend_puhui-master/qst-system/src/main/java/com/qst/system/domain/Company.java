package com.qst.system.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.qst.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel("公司实体类")
public class Company extends BaseEntity {
  private static final long serialVersionUID = 1L;


  @ApiModelProperty(value = "公司ID")
  private Integer comId;

  @ApiModelProperty(value = "企业编号")
  private String comNo;

  @ApiModelProperty(value = "企业名称")
  private String comName;

  @ApiModelProperty(value = "邮箱")
  private String comEmail;

  @ApiModelProperty(value = "电话")
  private String comPhone;

  @ApiModelProperty(value = "密码")
  private String comPwd;

  @ApiModelProperty(value = "注册时间")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date comTime;

  @ApiModelProperty(value = "备注、激活码")
  private String comRemark;

  @ApiModelProperty(value = "公司状态 0 正常,1 停用, 2 未激活")
  private String comStatus;

  @ApiModelProperty(value = "删除状态")
  private String comDel;


  public Integer getComId() {
    return comId;
  }

  public void setComId(Integer comId) {
    this.comId = comId;
  }

  public String getComNo() {
    return comNo;
  }

  public void setComNo(String comNo) {
    this.comNo = comNo;
  }

  public String getComName() {
    return comName;
  }

  public void setComName(String comName) {
    this.comName = comName;
  }

  public String getComEmail() {
    return comEmail;
  }

  public void setComEmail(String comEmail) {
    this.comEmail = comEmail;
  }

  public String getComPhone() {
    return comPhone;
  }

  public void setComPhone(String comPhone) {
    this.comPhone = comPhone;
  }

  public String getComPwd() {
    return comPwd;
  }

  public void setComPwd(String comPwd) {
    this.comPwd = comPwd;
  }

  public Date getComTime() {
    return comTime;
  }

  public void setComTime(Date comTime) {
    this.comTime = comTime;
  }

  public String getComRemark() {
    return comRemark;
  }

  public void setComRemark(String comRemark) {
    this.comRemark = comRemark;
  }

  public String getComStatus() {
    return comStatus;
  }

  public void setComStatus(String comStatus) {
    this.comStatus = comStatus;
  }

  public String getComDel() {
    return comDel;
  }

  public void setComDel(String comDel) {
    this.comDel = comDel;
  }


  @Override
  public String toString() {
    return "Company{" +
            "comId=" + comId +
            ", comNo='" + comNo + '\'' +
            ", comName='" + comName + '\'' +
            ", comEmail='" + comEmail + '\'' +
            ", comPhone='" + comPhone + '\'' +
            ", comPwd='" + comPwd + '\'' +
            ", comTime=" + comTime +
            ", comRemark='" + comRemark + '\'' +
            ", comStatus='" + comStatus + '\'' +
            ", comDel='" + comDel + '\'' +
            '}';
  }
}
