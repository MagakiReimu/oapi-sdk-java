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

package com.lark.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;

public class CustomizationOption {

  @SerializedName("option_key")
  private String optionKey;
  @SerializedName("others_content")
  private String othersContent;

  // builder 开始
  public CustomizationOption() {
  }

  public CustomizationOption(Builder builder) {
    this.optionKey = builder.optionKey;
    this.othersContent = builder.othersContent;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getOptionKey() {
    return this.optionKey;
  }

  public void setOptionKey(String optionKey) {
    this.optionKey = optionKey;
  }

  public String getOthersContent() {
    return this.othersContent;
  }

  public void setOthersContent(String othersContent) {
    this.othersContent = othersContent;
  }

  public static class Builder {

    private String optionKey;
    private String othersContent;

    public Builder optionKey(String optionKey) {
      this.optionKey = optionKey;
      return this;
    }

    public Builder othersContent(String othersContent) {
      this.othersContent = othersContent;
      return this;
    }


    public CustomizationOption build() {
      return new CustomizationOption(this);
    }
  }
}
