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

package com.lark.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;

public class DisplayAppV2 {

  @SerializedName("app_token")
  private String appToken;
  @SerializedName("name")
  private String name;
  @SerializedName("is_advanced")
  private Boolean isAdvanced;

  // builder 开始
  public DisplayAppV2() {
  }

  public DisplayAppV2(Builder builder) {
    this.appToken = builder.appToken;
    this.name = builder.name;
    this.isAdvanced = builder.isAdvanced;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getAppToken() {
    return this.appToken;
  }

  public void setAppToken(String appToken) {
    this.appToken = appToken;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Boolean getIsAdvanced() {
    return this.isAdvanced;
  }

  public void setIsAdvanced(Boolean isAdvanced) {
    this.isAdvanced = isAdvanced;
  }

  public static class Builder {

    private String appToken;
    private String name;
    private Boolean isAdvanced;

    public Builder appToken(String appToken) {
      this.appToken = appToken;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder isAdvanced(Boolean isAdvanced) {
      this.isAdvanced = isAdvanced;
      return this;
    }


    public DisplayAppV2 build() {
      return new DisplayAppV2(this);
    }
  }
}
