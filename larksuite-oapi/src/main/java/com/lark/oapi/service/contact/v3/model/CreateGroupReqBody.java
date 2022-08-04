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

public class CreateGroupReqBody {

  @SerializedName("group_id")
  private String groupId;
  @SerializedName("name")
  private String name;
  @SerializedName("description")
  private String description;
  @SerializedName("type")
  private Integer type;

  // builder 开始
  public CreateGroupReqBody() {
  }

  public CreateGroupReqBody(Builder builder) {
    this.groupId = builder.groupId;
    this.name = builder.name;
    this.description = builder.description;
    this.type = builder.type;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getGroupId() {
    return this.groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getType() {
    return this.type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public static class Builder {

    private String groupId;
    private String name;
    private String description;
    private Integer type;

    public Builder groupId(String groupId) {
      this.groupId = groupId;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder description(String description) {
      this.description = description;
      return this;
    }

    public Builder type(Integer type) {
      this.type = type;
      return this;
    }

    public Builder type(com.lark.oapi.service.contact.v3.enums.CreateGroupTypeEnum type) {
      this.type = type.getValue();
      return this;
    }


    public CreateGroupReqBody build() {
      return new CreateGroupReqBody(this);
    }
  }
}
