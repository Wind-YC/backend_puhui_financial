package com.qst.system.domain;


import com.qst.common.core.domain.BaseEntity;

public class Idcard extends BaseEntity {

  private Integer id;
  private String username;
  private String idcard;
  private String address;
  private String birthday;
  private String gender;
  private String nation;
  private Integer comId;
  private String period;

  @Override
  public String toString() {
    return "Idcard{" +
            "id=" + id +
            ", username='" + username + '\'' +
            ", idcard='" + idcard + '\'' +
            ", address='" + address + '\'' +
            ", birthday='" + birthday + '\'' +
            ", gender='" + gender + '\'' +
            ", nation='" + nation + '\'' +
            ", comId=" + comId +
            ", period='" + period + '\'' +
            '}';
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getIdcard() {
    return idcard;
  }

  public void setIdcard(String idcard) {
    this.idcard = idcard;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getNation() {
    return nation;
  }

  public void setNation(String nation) {
    this.nation = nation;
  }

  public Integer getComId() {
    return comId;
  }

  public void setComId(Integer comId) {
    this.comId = comId;
  }

  public String getPeriod() {
    return period;
  }

  public void setPeriod(String period) {
    this.period = period;
  }
}
