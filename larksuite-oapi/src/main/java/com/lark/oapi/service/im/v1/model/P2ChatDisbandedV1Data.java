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

public class P2ChatDisbandedV1Data {

  @SerializedName("chat_id")
  private String chatId;
  @SerializedName("operator_id")
  private UserId operatorId;
  @SerializedName("external")
  private Boolean external;
  @SerializedName("operator_tenant_key")
  private String operatorTenantKey;

  public String getChatId() {
    return this.chatId;
  }

  public void setChatId(String chatId) {
    this.chatId = chatId;
  }

  public UserId getOperatorId() {
    return this.operatorId;
  }

  public void setOperatorId(UserId operatorId) {
    this.operatorId = operatorId;
  }

  public Boolean getExternal() {
    return this.external;
  }

  public void setExternal(Boolean external) {
    this.external = external;
  }

  public String getOperatorTenantKey() {
    return this.operatorTenantKey;
  }

  public void setOperatorTenantKey(String operatorTenantKey) {
    this.operatorTenantKey = operatorTenantKey;
  }

}
