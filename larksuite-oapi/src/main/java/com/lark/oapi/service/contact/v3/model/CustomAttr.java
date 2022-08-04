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

package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;

public class CustomAttr {

  @SerializedName("id")
  private String id;
  @SerializedName("type")
  private String type;
  @SerializedName("options")
  private CustomAttrOptions options;
  @SerializedName("i18n_name")
  private I18nContent[] i18nName;

  // builder 开始
  public CustomAttr() {
  }

  public CustomAttr(Builder builder) {
    this.id = builder.id;
    this.type = builder.type;
    this.options = builder.options;
    this.i18nName = builder.i18nName;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CustomAttrOptions getOptions() {
    return this.options;
  }

  public void setOptions(CustomAttrOptions options) {
    this.options = options;
  }

  public I18nContent[] getI18nName() {
    return this.i18nName;
  }

  public void setI18nName(I18nContent[] i18nName) {
    this.i18nName = i18nName;
  }

  public static class Builder {

    private String id;
    private String type;
    private CustomAttrOptions options;
    private I18nContent[] i18nName;

    public Builder id(String id) {
      this.id = id;
      return this;
    }

    public Builder type(String type) {
      this.type = type;
      return this;
    }

    public Builder options(CustomAttrOptions options) {
      this.options = options;
      return this;
    }

    public Builder i18nName(I18nContent[] i18nName) {
      this.i18nName = i18nName;
      return this;
    }


    public CustomAttr build() {
      return new CustomAttr(this);
    }
  }
}
