// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;

public class User {

  @SerializedName("union_id")
  private String unionId;
  @SerializedName("user_id")
  private String userId;
  @SerializedName("open_id")
  private String openId;
  @SerializedName("name")
  private String name;
  @SerializedName("en_name")
  private String enName;
  @SerializedName("nickname")
  private String nickname;
  @SerializedName("email")
  private String email;
  @SerializedName("mobile")
  private String mobile;
  @SerializedName("mobile_visible")
  private Boolean mobileVisible;
  @SerializedName("gender")
  private Integer gender;
  @SerializedName("avatar_key")
  private String avatarKey;
  @SerializedName("avatar")
  private AvatarInfo avatar;
  @SerializedName("status")
  private UserStatus status;
  @SerializedName("department_ids")
  private String[] departmentIds;
  @SerializedName("leader_user_id")
  private String leaderUserId;
  @SerializedName("city")
  private String city;
  @SerializedName("country")
  private String country;
  @SerializedName("work_station")
  private String workStation;
  @SerializedName("join_time")
  private Integer joinTime;
  @SerializedName("is_tenant_manager")
  private Boolean isTenantManager;
  @SerializedName("employee_no")
  private String employeeNo;
  @SerializedName("employee_type")
  private Integer employeeType;
  @SerializedName("orders")
  private UserOrder[] orders;
  @SerializedName("custom_attrs")
  private UserCustomAttr[] customAttrs;
  @SerializedName("enterprise_email")
  private String enterpriseEmail;
  @SerializedName("job_title")
  private String jobTitle;
  @SerializedName("is_frozen")
  private Boolean isFrozen;
  @SerializedName("ent_email_password")
  private String entEmailPassword;

  // builder 开始
  public User() {
  }

  public User(Builder builder) {
    this.unionId = builder.unionId;
    this.userId = builder.userId;
    this.openId = builder.openId;
    this.name = builder.name;
    this.enName = builder.enName;
    this.nickname = builder.nickname;
    this.email = builder.email;
    this.mobile = builder.mobile;
    this.mobileVisible = builder.mobileVisible;
    this.gender = builder.gender;
    this.avatarKey = builder.avatarKey;
    this.avatar = builder.avatar;
    this.status = builder.status;
    this.departmentIds = builder.departmentIds;
    this.leaderUserId = builder.leaderUserId;
    this.city = builder.city;
    this.country = builder.country;
    this.workStation = builder.workStation;
    this.joinTime = builder.joinTime;
    this.isTenantManager = builder.isTenantManager;
    this.employeeNo = builder.employeeNo;
    this.employeeType = builder.employeeType;
    this.orders = builder.orders;
    this.customAttrs = builder.customAttrs;
    this.enterpriseEmail = builder.enterpriseEmail;
    this.jobTitle = builder.jobTitle;
    this.isFrozen = builder.isFrozen;
    this.entEmailPassword = builder.entEmailPassword;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getUnionId() {
    return this.unionId;
  }

  public void setUnionId(String unionId) {
    this.unionId = unionId;
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getOpenId() {
    return this.openId;
  }

  public void setOpenId(String openId) {
    this.openId = openId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEnName() {
    return this.enName;
  }

  public void setEnName(String enName) {
    this.enName = enName;
  }

  public String getNickname() {
    return this.nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getMobile() {
    return this.mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public Boolean getMobileVisible() {
    return this.mobileVisible;
  }

  public void setMobileVisible(Boolean mobileVisible) {
    this.mobileVisible = mobileVisible;
  }

  public Integer getGender() {
    return this.gender;
  }

  public void setGender(Integer gender) {
    this.gender = gender;
  }

  public String getAvatarKey() {
    return this.avatarKey;
  }

  public void setAvatarKey(String avatarKey) {
    this.avatarKey = avatarKey;
  }

  public AvatarInfo getAvatar() {
    return this.avatar;
  }

  public void setAvatar(AvatarInfo avatar) {
    this.avatar = avatar;
  }

  public UserStatus getStatus() {
    return this.status;
  }

  public void setStatus(UserStatus status) {
    this.status = status;
  }

  public String[] getDepartmentIds() {
    return this.departmentIds;
  }

  public void setDepartmentIds(String[] departmentIds) {
    this.departmentIds = departmentIds;
  }

  public String getLeaderUserId() {
    return this.leaderUserId;
  }

  public void setLeaderUserId(String leaderUserId) {
    this.leaderUserId = leaderUserId;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getWorkStation() {
    return this.workStation;
  }

  public void setWorkStation(String workStation) {
    this.workStation = workStation;
  }

  public Integer getJoinTime() {
    return this.joinTime;
  }

  public void setJoinTime(Integer joinTime) {
    this.joinTime = joinTime;
  }

  public Boolean getIsTenantManager() {
    return this.isTenantManager;
  }

  public void setIsTenantManager(Boolean isTenantManager) {
    this.isTenantManager = isTenantManager;
  }

  public String getEmployeeNo() {
    return this.employeeNo;
  }

  public void setEmployeeNo(String employeeNo) {
    this.employeeNo = employeeNo;
  }

  public Integer getEmployeeType() {
    return this.employeeType;
  }

  public void setEmployeeType(Integer employeeType) {
    this.employeeType = employeeType;
  }

  public UserOrder[] getOrders() {
    return this.orders;
  }

  public void setOrders(UserOrder[] orders) {
    this.orders = orders;
  }

  public UserCustomAttr[] getCustomAttrs() {
    return this.customAttrs;
  }

  public void setCustomAttrs(UserCustomAttr[] customAttrs) {
    this.customAttrs = customAttrs;
  }

  public String getEnterpriseEmail() {
    return this.enterpriseEmail;
  }

  public void setEnterpriseEmail(String enterpriseEmail) {
    this.enterpriseEmail = enterpriseEmail;
  }

  public String getJobTitle() {
    return this.jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public Boolean getIsFrozen() {
    return this.isFrozen;
  }

  public void setIsFrozen(Boolean isFrozen) {
    this.isFrozen = isFrozen;
  }

  public String getEntEmailPassword() {
    return this.entEmailPassword;
  }

  public void setEntEmailPassword(String entEmailPassword) {
    this.entEmailPassword = entEmailPassword;
  }

  public static class Builder {

    private String unionId;
    private String userId;
    private String openId;
    private String name;
    private String enName;
    private String nickname;
    private String email;
    private String mobile;
    private Boolean mobileVisible;
    private Integer gender;
    private String avatarKey;
    private AvatarInfo avatar;
    private UserStatus status;
    private String[] departmentIds;
    private String leaderUserId;
    private String city;
    private String country;
    private String workStation;
    private Integer joinTime;
    private Boolean isTenantManager;
    private String employeeNo;
    private Integer employeeType;
    private UserOrder[] orders;
    private UserCustomAttr[] customAttrs;
    private String enterpriseEmail;
    private String jobTitle;
    private Boolean isFrozen;
    private String entEmailPassword;

    public Builder unionId(String unionId) {
      this.unionId = unionId;
      return this;
    }

    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }

    public Builder openId(String openId) {
      this.openId = openId;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder enName(String enName) {
      this.enName = enName;
      return this;
    }

    public Builder nickname(String nickname) {
      this.nickname = nickname;
      return this;
    }

    public Builder email(String email) {
      this.email = email;
      return this;
    }

    public Builder mobile(String mobile) {
      this.mobile = mobile;
      return this;
    }

    public Builder mobileVisible(Boolean mobileVisible) {
      this.mobileVisible = mobileVisible;
      return this;
    }

    public Builder gender(Integer gender) {
      this.gender = gender;
      return this;
    }

    public Builder gender(com.lark.oapi.service.contact.v3.enums.GenderTypeEnum gender) {
      this.gender = gender.getValue();
      return this;
    }

    public Builder avatarKey(String avatarKey) {
      this.avatarKey = avatarKey;
      return this;
    }

    public Builder avatar(AvatarInfo avatar) {
      this.avatar = avatar;
      return this;
    }

    public Builder status(UserStatus status) {
      this.status = status;
      return this;
    }

    public Builder departmentIds(String[] departmentIds) {
      this.departmentIds = departmentIds;
      return this;
    }

    public Builder leaderUserId(String leaderUserId) {
      this.leaderUserId = leaderUserId;
      return this;
    }

    public Builder city(String city) {
      this.city = city;
      return this;
    }

    public Builder country(String country) {
      this.country = country;
      return this;
    }

    public Builder workStation(String workStation) {
      this.workStation = workStation;
      return this;
    }

    public Builder joinTime(Integer joinTime) {
      this.joinTime = joinTime;
      return this;
    }

    public Builder isTenantManager(Boolean isTenantManager) {
      this.isTenantManager = isTenantManager;
      return this;
    }

    public Builder employeeNo(String employeeNo) {
      this.employeeNo = employeeNo;
      return this;
    }

    public Builder employeeType(Integer employeeType) {
      this.employeeType = employeeType;
      return this;
    }


    public Builder orders(UserOrder[] orders) {
      this.orders = orders;
      return this;
    }

    public Builder customAttrs(UserCustomAttr[] customAttrs) {
      this.customAttrs = customAttrs;
      return this;
    }

    public Builder enterpriseEmail(String enterpriseEmail) {
      this.enterpriseEmail = enterpriseEmail;
      return this;
    }


    public Builder jobTitle(String jobTitle) {
      this.jobTitle = jobTitle;
      return this;
    }


    public Builder isFrozen(Boolean isFrozen) {
      this.isFrozen = isFrozen;
      return this;
    }

    public Builder entEmailPassword(String entEmailPassword) {
      this.entEmailPassword = entEmailPassword;
      return this;
    }


    public User build() {
      return new User(this);
    }
  }
}
