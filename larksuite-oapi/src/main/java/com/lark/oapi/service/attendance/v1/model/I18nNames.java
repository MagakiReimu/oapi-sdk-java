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

package com.lark.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;

public class I18nNames {

  @SerializedName("ch")
  private String ch;
  @SerializedName("en")
  private String en;
  @SerializedName("ja")
  private String ja;

  // builder 开始
  public I18nNames() {
  }

  public I18nNames(Builder builder) {
    this.ch = builder.ch;
    this.en = builder.en;
    this.ja = builder.ja;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getCh() {
    return this.ch;
  }

  public void setCh(String ch) {
    this.ch = ch;
  }

  public String getEn() {
    return this.en;
  }

  public void setEn(String en) {
    this.en = en;
  }

  public String getJa() {
    return this.ja;
  }

  public void setJa(String ja) {
    this.ja = ja;
  }

  public static class Builder {

    private String ch;
    private String en;
    private String ja;

    public Builder ch(String ch) {
      this.ch = ch;
      return this;
    }

    public Builder en(String en) {
      this.en = en;
      return this;
    }

    public Builder ja(String ja) {
      this.ja = ja;
      return this;
    }


    public I18nNames build() {
      return new I18nNames(this);
    }
  }
}
