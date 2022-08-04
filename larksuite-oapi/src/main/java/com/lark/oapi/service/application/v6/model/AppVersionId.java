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

package com.lark.oapi.service.application.v6.model;

import com.google.gson.annotations.SerializedName;

public class AppVersionId {

  @SerializedName("version")
  private String version;
  @SerializedName("version_id")
  private String versionId;

  // builder 开始
  public AppVersionId() {
  }

  public AppVersionId(Builder builder) {
    this.version = builder.version;
    this.versionId = builder.versionId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getVersion() {
    return this.version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getVersionId() {
    return this.versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  public static class Builder {

    private String version;
    private String versionId;

    public Builder version(String version) {
      this.version = version;
      return this;
    }

    public Builder versionId(String versionId) {
      this.versionId = versionId;
      return this;
    }


    public AppVersionId build() {
      return new AppVersionId(this);
    }
  }
}
