package com.qst.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.qst.common.core.domain.BaseEntity;
import com.qst.common.core.domain.entity.Cities;
import com.qst.common.core.domain.entity.Provinces;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel("企业详情实体类")
public class ComDetails extends BaseEntity {
  private static final long serialVersionUID = 1L;
  @ApiModelProperty(value = "主键")
  private Integer cId;

  @ApiModelProperty(value = "企业Id")
  private Integer coId;

  @ApiModelProperty(value = "企业积分")
  private String cIntegral;

  @ApiModelProperty(value = "营业执照")
  private String cLicense;

  @ApiModelProperty(value = "企业类型 (0 个人独资 ，1 合伙企业 2 有限责任公司 3 股份有限公司)")
  private String cType;

  @ApiModelProperty(value = "法人姓名")
  private String cLegalName;

  @ApiModelProperty(value = "法人证件号")
  private String cLegalId;

  @ApiModelProperty(value = "法人证件路径")
  private String cLegalImg;

  @ApiModelProperty(value = "有效期限")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date cLegalTime;

  @ApiModelProperty(value = "注册省")
  private String cPro;

  @ApiModelProperty(value = "注册市")
  private String cCity;

  @ApiModelProperty(value = "公司详细地址")
  private String cAddress;

  @ApiModelProperty(value = "经营范围")
  private String cBusSco;

  @ApiModelProperty(value = "营业执照到期时间")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date cLicTime;

  @ApiModelProperty(value = "删除标识 0 存在 2 删除")
  private String cDel;

  private Cities cities;

  @Override
  public String toString() {
    return "ComDetails{" +
            "cId=" + cId +
            ", coId=" + coId +
            ", cIntegral='" + cIntegral + '\'' +
            ", cLicense='" + cLicense + '\'' +
            ", cType='" + cType + '\'' +
            ", cLegalName='" + cLegalName + '\'' +
            ", cLegalId='" + cLegalId + '\'' +
            ", cLegalImg='" + cLegalImg + '\'' +
            ", cLegalTime=" + cLegalTime +
            ", cPro='" + cPro + '\'' +
            ", cCity='" + cCity + '\'' +
            ", cAddress='" + cAddress + '\'' +
            ", cBusSco='" + cBusSco + '\'' +
            ", cLicTime=" + cLicTime +
            ", cDel='" + cDel + '\'' +
            ", cities=" + cities +
            ", provinces=" + provinces +
            ", company=" + company +
            '}';
  }

  public Cities getCities() {
    return cities;
  }

  public void setCities(Cities cities) {
    this.cities = cities;
  }

  public Provinces getProvinces() {
    return provinces;
  }

  public void setProvinces(Provinces provinces) {
    this.provinces = provinces;
  }

  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  private Provinces provinces;

  private Company company;
  public Integer getcId() {
    return cId;
  }

  public void setcId(Integer cId) {
    this.cId = cId;
  }

  public Integer getCoId() {
    return coId;
  }

  public void setCoId(Integer coId) {
    this.coId = coId;
  }

  public String getcIntegral() {
    return cIntegral;
  }

  public void setcIntegral(String cIntegral) {
    this.cIntegral = cIntegral;
  }

  public String getcLicense() {
    return cLicense;
  }

  public void setcLicense(String cLicense) {
    this.cLicense = cLicense;
  }

  public String getcType() {
    return cType;
  }

  public void setcType(String cType) {
    this.cType = cType;
  }

  public String getcLegalName() {
    return cLegalName;
  }

  public void setcLegalName(String cLegalName) {
    this.cLegalName = cLegalName;
  }

  public String getcLegalId() {
    return cLegalId;
  }

  public void setcLegalId(String cLegalId) {
    this.cLegalId = cLegalId;
  }

  public String getcLegalImg() {
    return cLegalImg;
  }

  public void setcLegalImg(String cLegalImg) {
    this.cLegalImg = cLegalImg;
  }

  public Date getcLegalTime() {
    return cLegalTime;
  }

  public void setcLegalTime(Date cLegalTime) {
    this.cLegalTime = cLegalTime;
  }

  public String getcPro() {
    return cPro;
  }

  public void setcPro(String cPro) {
    this.cPro = cPro;
  }

  public String getcCity() {
    return cCity;
  }

  public void setcCity(String cCity) {
    this.cCity = cCity;
  }

  public String getcAddress() {
    return cAddress;
  }

  public void setcAddress(String cAddress) {
    this.cAddress = cAddress;
  }

  public String getcBusSco() {
    return cBusSco;
  }

  public void setcBusSco(String cBusSco) {
    this.cBusSco = cBusSco;
  }

  public Date getcLicTime() {
    return cLicTime;
  }

  public void setcLicTime(Date cLicTime) {
    this.cLicTime = cLicTime;
  }

  public String getcDel() {
    return cDel;
  }

  public void setcDel(String cDel) {
    this.cDel = cDel;
  }

}
