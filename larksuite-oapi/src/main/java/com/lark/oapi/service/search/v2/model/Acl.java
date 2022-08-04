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

package com.lark.oapi.service.search.v2.model;

import com.google.gson.annotations.SerializedName;

public class Acl {

  @SerializedName("access")
  private String access;
  @SerializedName("value")
  private String value;
  @SerializedName("type")
  private String type;

  // builder 开始
  public Acl() {
  }

  public Acl(Builder builder) {
    this.access = builder.access;
    this.value = builder.value;
    this.type = builder.type;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getAccess() {
    return this.access;
  }

  public void setAccess(String access) {
    this.access = access;
  }

  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public static class Builder {

    private String access;
    private String value;
    private String type;

    public Builder access(String access) {
      this.access = access;
      return this;
    }

    public Builder access(com.lark.oapi.service.search.v2.enums.AclAccessEnum access) {
      this.access = access.getValue();
      return this;
    }

    public Builder value(String value) {
      this.value = value;
      return this;
    }

    public Builder type(String type) {
      this.type = type;
      return this;
    }

    public Builder type(com.lark.oapi.service.search.v2.enums.AclTypeEnum type) {
      this.type = type.getValue();
      return this;
    }


    public Acl build() {
      return new Acl(this);
    }
  }
}
