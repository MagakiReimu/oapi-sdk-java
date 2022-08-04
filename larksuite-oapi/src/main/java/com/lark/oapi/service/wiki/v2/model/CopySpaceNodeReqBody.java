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

package com.lark.oapi.service.wiki.v2.model;

import com.google.gson.annotations.SerializedName;

public class CopySpaceNodeReqBody {

  @SerializedName("target_parent_token")
  private String targetParentToken;
  @SerializedName("target_space_id")
  private String targetSpaceId;
  @SerializedName("title")
  private String title;

  // builder 开始
  public CopySpaceNodeReqBody() {
  }

  public CopySpaceNodeReqBody(Builder builder) {
    this.targetParentToken = builder.targetParentToken;
    this.targetSpaceId = builder.targetSpaceId;
    this.title = builder.title;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getTargetParentToken() {
    return this.targetParentToken;
  }

  public void setTargetParentToken(String targetParentToken) {
    this.targetParentToken = targetParentToken;
  }

  public String getTargetSpaceId() {
    return this.targetSpaceId;
  }

  public void setTargetSpaceId(String targetSpaceId) {
    this.targetSpaceId = targetSpaceId;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public static class Builder {

    private String targetParentToken;
    private String targetSpaceId;
    private String title;

    public Builder targetParentToken(String targetParentToken) {
      this.targetParentToken = targetParentToken;
      return this;
    }

    public Builder targetSpaceId(String targetSpaceId) {
      this.targetSpaceId = targetSpaceId;
      return this;
    }

    public Builder title(String title) {
      this.title = title;
      return this;
    }


    public CopySpaceNodeReqBody build() {
      return new CopySpaceNodeReqBody(this);
    }
  }
}
