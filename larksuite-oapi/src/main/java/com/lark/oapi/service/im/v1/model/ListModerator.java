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

package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class ListModerator {

  @SerializedName("user_id_type")
  private String userIdType;
  @SerializedName("user_id")
  private String userId;
  @SerializedName("tenant_key")
  private String tenantKey;

  // builder 开始
  public ListModerator() {
  }

  public ListModerator(Builder builder) {
    this.userIdType = builder.userIdType;
    this.userId = builder.userId;
    this.tenantKey = builder.tenantKey;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getUserIdType() {
    return this.userIdType;
  }

  public void setUserIdType(String userIdType) {
    this.userIdType = userIdType;
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getTenantKey() {
    return this.tenantKey;
  }

  public void setTenantKey(String tenantKey) {
    this.tenantKey = tenantKey;
  }

  public static class Builder {

    private String userIdType;
    private String userId;
    private String tenantKey;

    public Builder userIdType(String userIdType) {
      this.userIdType = userIdType;
      return this;
    }

    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }

    public Builder tenantKey(String tenantKey) {
      this.tenantKey = tenantKey;
      return this;
    }


    public ListModerator build() {
      return new ListModerator(this);
    }
  }
}
