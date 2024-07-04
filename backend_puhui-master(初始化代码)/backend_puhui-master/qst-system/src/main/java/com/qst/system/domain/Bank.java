package com.qst.system.domain;

import com.qst.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;

public class Bank extends BaseEntity {
    // 序列号,用于对象序列号与反序列化(讲人话就是能够将对象写入文件中)
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "银行id")
    private Integer bankId;

    @ApiModelProperty(value = "银行名称")
    private String bankName;

    @ApiModelProperty(value = "电子邮箱")
    private String bankEmail;

    @ApiModelProperty(value = "密码")
    private String bankPassword;

    @ApiModelProperty(value = "贷款利率")
    private String bankRate;

    @ApiModelProperty(value = "联系方式")
    private String bankPhone;

    @ApiModelProperty(value = "贷款期限")
    private String bankLength;

    @ApiModelProperty(value = "省id")
    private String bankProId;

    @ApiModelProperty(value = "市ID")
    private String bankCitId;

    @ApiModelProperty(value = "区ID")
    private String bankAraId;

    @ApiModelProperty(value = "详细地址")
    private String bankAdress;

    @ApiModelProperty(value = "删除标识")
    private String bankDel;

    @ApiModelProperty(value = "贷款产品说明")
    private String bankBz;

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankEmail() {
        return bankEmail;
    }

    public void setBankEmail(String bankEmail) {
        this.bankEmail = bankEmail;
    }

    public String getBankPassword() {
        return bankPassword;
    }

    public void setBankPassword(String bankPassword) {
        this.bankPassword = bankPassword;
    }

    public String getBankRate() {
        return bankRate;
    }

    public void setBankRate(String bankRate) {
        this.bankRate = bankRate;
    }

    public String getBankPhone() {
        return bankPhone;
    }

    public void setBankPhone(String bankPhone) {
        this.bankPhone = bankPhone;
    }

    public String getBankLength() {
        return bankLength;
    }

    public void setBankLength(String bankLength) {
        this.bankLength = bankLength;
    }

    public String getBankProId() {
        return bankProId;
    }

    public void setBankProId(String bankProId) {
        this.bankProId = bankProId;
    }

    public String getBankCitId() {
        return bankCitId;
    }

    public void setBankCitId(String bankCitId) {
        this.bankCitId = bankCitId;
    }

    public String getBankAraId() {
        return bankAraId;
    }

    public void setBankAraId(String bankAraId) {
        this.bankAraId = bankAraId;
    }

    public String getBankAdress() {
        return bankAdress;
    }

    public void setBankAdress(String bankAdress) {
        this.bankAdress = bankAdress;
    }

    public String getBankDel() {
        return bankDel;
    }

    public void setBankDel(String bankDel) {
        this.bankDel = bankDel;
    }

    public String getBankBz() {
        return bankBz;
    }

    public void setBankBz(String bankBz) {
        this.bankBz = bankBz;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankId=" + bankId +
                ", bankName='" + bankName + '\'' +
                ", bankEmail='" + bankEmail + '\'' +
                ", bankPassword='" + bankPassword + '\'' +
                ", bankRate='" + bankRate + '\'' +
                ", bankPhone='" + bankPhone + '\'' +
                ", bankLength='" + bankLength + '\'' +
                ", bankProId='" + bankProId + '\'' +
                ", bankCitId='" + bankCitId + '\'' +
                ", bankAraId='" + bankAraId + '\'' +
                ", bankAdress='" + bankAdress + '\'' +
                ", bankDel='" + bankDel + '\'' +
                ", bankBz='" + bankBz + '\'' +
                '}';
    }
}