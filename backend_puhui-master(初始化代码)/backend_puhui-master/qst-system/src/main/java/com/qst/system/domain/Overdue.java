package com.qst.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.qst.common.annotation.Excel;
import com.qst.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 逾期对象 overdue
 * 
 * @author qst
 * @date 2021-09-28
 */
@ApiModel("逾期实体类")
public class Overdue extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    @ApiModelProperty("主键")
    private Integer oveId;

    /** 企业编号 */
    @ApiModelProperty("企业编号")
    @Excel(name = "企业编号")
    private Integer oveComNo;

    /** 企业编号 */
    @ApiModelProperty("贷款id")
    @Excel(name = "贷款id")
    private Integer oveLoaId;

    /** 逾期金额 */
    @ApiModelProperty("逾期金额")
    @Excel(name = "逾期金额")
    private Integer oveMoney;

    /** 逾期开始时间 */
    @ApiModelProperty("逾期开始时间")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "逾期开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date oveStartTime;

    /** 逾期结束时间 */
    @ApiModelProperty("逾期结束时间")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "逾期结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date oveLastTime;

    /** 减少积分数 */
    @ApiModelProperty("减少积分数")
    @Excel(name = "减少积分数")
    private Integer oveCutCount;

    /** 额外利息 */
    @ApiModelProperty("额外利息")
    @Excel(name = "额外利息")
    private String oveAddInt;

    /** 删除标识 0 正常 2 删除 */
    @ApiModelProperty("删除标识")
    private String oveDel;

    private Company company;

    private Loans loans;

    public Integer getOveId() {
        return oveId;
    }

    public void setOveId(Integer oveId) {
        this.oveId = oveId;
    }

    public Integer getOveComNo() {
        return oveComNo;
    }

    public void setOveComNo(Integer oveComNo) {
        this.oveComNo = oveComNo;
    }

    public Integer getOveLoaId() {
        return oveLoaId;
    }

    public void setOveLoaId(Integer oveLoaId) {
        this.oveLoaId = oveLoaId;
    }

    public Integer getOveMoney() {
        return oveMoney;
    }

    public void setOveMoney(Integer oveMoney) {
        this.oveMoney = oveMoney;
    }

    public Date getOveStartTime() {
        return oveStartTime;
    }

    public void setOveStartTime(Date oveStartTime) {
        this.oveStartTime = oveStartTime;
    }

    public Date getOveLastTime() {
        return oveLastTime;
    }

    public void setOveLastTime(Date oveLastTime) {
        this.oveLastTime = oveLastTime;
    }

    public Integer getOveCutCount() {
        return oveCutCount;
    }

    public void setOveCutCount(Integer oveCutCount) {
        this.oveCutCount = oveCutCount;
    }

    public String getOveAddInt() {
        return oveAddInt;
    }

    public void setOveAddInt(String oveAddInt) {
        this.oveAddInt = oveAddInt;
    }

    public String getOveDel() {
        return oveDel;
    }

    public void setOveDel(String oveDel) {
        this.oveDel = oveDel;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("oveId", getOveId())
            .append("oveComNo", getOveComNo())
            .append("oveLoaId", getOveLoaId())
            .append("oveMoney", getOveMoney())
            .append("oveStartTime", getOveStartTime())
            .append("oveLastTime", getOveLastTime())
            .append("oveCutCount", getOveCutCount())
            .append("oveAddInt", getOveAddInt())
            .append("oveDel", getOveDel())
            .toString();
    }
}
