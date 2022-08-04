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

package com.lark.oapi.service.baike.v1.model;

import com.google.gson.annotations.SerializedName;

public class MatchInfo {

  @SerializedName("entity_id")
  private String entityId;
  @SerializedName("type")
  private Integer type;

  // builder 开始
  public MatchInfo() {
  }

  public MatchInfo(Builder builder) {
    this.entityId = builder.entityId;
    this.type = builder.type;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getEntityId() {
    return this.entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public Integer getType() {
    return this.type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public static class Builder {

    private String entityId;
    private Integer type;

    public Builder entityId(String entityId) {
      this.entityId = entityId;
      return this;
    }

    public Builder type(Integer type) {
      this.type = type;
      return this;
    }

    public Builder type(com.lark.oapi.service.baike.v1.enums.TermTypeEnum type) {
      this.type = type.getValue();
      return this;
    }


    public MatchInfo build() {
      return new MatchInfo(this);
    }
  }
}
