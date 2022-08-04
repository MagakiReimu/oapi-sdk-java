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

public class BatchItemResult {

  @SerializedName("item_id")
  private String itemId;
  @SerializedName("is_success")
  private Boolean isSuccess;
  @SerializedName("err")
  private String err;

  // builder 开始
  public BatchItemResult() {
  }

  public BatchItemResult(Builder builder) {
    this.itemId = builder.itemId;
    this.isSuccess = builder.isSuccess;
    this.err = builder.err;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getItemId() {
    return this.itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public Boolean getIsSuccess() {
    return this.isSuccess;
  }

  public void setIsSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
  }

  public String getErr() {
    return this.err;
  }

  public void setErr(String err) {
    this.err = err;
  }

  public static class Builder {

    private String itemId;
    private Boolean isSuccess;
    private String err;

    public Builder itemId(String itemId) {
      this.itemId = itemId;
      return this;
    }

    public Builder isSuccess(Boolean isSuccess) {
      this.isSuccess = isSuccess;
      return this;
    }

    public Builder err(String err) {
      this.err = err;
      return this;
    }


    public BatchItemResult build() {
      return new BatchItemResult(this);
    }
  }
}
