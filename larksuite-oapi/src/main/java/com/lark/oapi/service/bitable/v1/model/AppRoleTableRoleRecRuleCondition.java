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

public class AppRoleTableRoleRecRuleCondition {

  @SerializedName("field_name")
  private String fieldName;
  @SerializedName("operator")
  private String operator;
  @SerializedName("value")
  private String[] value;
  @SerializedName("field_type")
  private Integer fieldType;

  // builder 开始
  public AppRoleTableRoleRecRuleCondition() {
  }

  public AppRoleTableRoleRecRuleCondition(Builder builder) {
    this.fieldName = builder.fieldName;
    this.operator = builder.operator;
    this.value = builder.value;
    this.fieldType = builder.fieldType;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getFieldName() {
    return this.fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public String getOperator() {
    return this.operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public String[] getValue() {
    return this.value;
  }

  public void setValue(String[] value) {
    this.value = value;
  }

  public Integer getFieldType() {
    return this.fieldType;
  }

  public void setFieldType(Integer fieldType) {
    this.fieldType = fieldType;
  }

  public static class Builder {

    private String fieldName;
    private String operator;
    private String[] value;
    private Integer fieldType;

    public Builder fieldName(String fieldName) {
      this.fieldName = fieldName;
      return this;
    }

    public Builder operator(String operator) {
      this.operator = operator;
      return this;
    }

    public Builder operator(com.lark.oapi.service.bitable.v1.enums.OperatorEnum operator) {
      this.operator = operator.getValue();
      return this;
    }

    public Builder value(String[] value) {
      this.value = value;
      return this;
    }

    public Builder fieldType(Integer fieldType) {
      this.fieldType = fieldType;
      return this;
    }


    public AppRoleTableRoleRecRuleCondition build() {
      return new AppRoleTableRoleRecRuleCondition(this);
    }
  }
}
