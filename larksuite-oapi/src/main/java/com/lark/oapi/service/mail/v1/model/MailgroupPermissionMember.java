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

package com.lark.oapi.service.mail.v1.model;

import com.google.gson.annotations.SerializedName;

public class MailgroupPermissionMember {

  @SerializedName("permission_member_id")
  private String permissionMemberId;
  @SerializedName("user_id")
  private String userId;
  @SerializedName("department_id")
  private String departmentId;
  @SerializedName("type")
  private String type;

  // builder 开始
  public MailgroupPermissionMember() {
  }

  public MailgroupPermissionMember(Builder builder) {
    this.permissionMemberId = builder.permissionMemberId;
    this.userId = builder.userId;
    this.departmentId = builder.departmentId;
    this.type = builder.type;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getPermissionMemberId() {
    return this.permissionMemberId;
  }

  public void setPermissionMemberId(String permissionMemberId) {
    this.permissionMemberId = permissionMemberId;
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getDepartmentId() {
    return this.departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public static class Builder {

    private String permissionMemberId;
    private String userId;
    private String departmentId;
    private String type;

    public Builder permissionMemberId(String permissionMemberId) {
      this.permissionMemberId = permissionMemberId;
      return this;
    }

    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }

    public Builder departmentId(String departmentId) {
      this.departmentId = departmentId;
      return this;
    }

    public Builder type(String type) {
      this.type = type;
      return this;
    }

    public Builder type(com.lark.oapi.service.mail.v1.enums.TypeEnum type) {
      this.type = type.getValue();
      return this;
    }


    public MailgroupPermissionMember build() {
      return new MailgroupPermissionMember(this);
    }
  }
}
