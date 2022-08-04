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

public class RemoveGroupMemberReqBody {

  @SerializedName("member_type")
  private String memberType;
  @SerializedName("member_id")
  private String memberId;
  @SerializedName("member_id_type")
  private String memberIdType;

  // builder 开始
  public RemoveGroupMemberReqBody() {
  }

  public RemoveGroupMemberReqBody(Builder builder) {
    this.memberType = builder.memberType;
    this.memberId = builder.memberId;
    this.memberIdType = builder.memberIdType;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getMemberType() {
    return this.memberType;
  }

  public void setMemberType(String memberType) {
    this.memberType = memberType;
  }

  public String getMemberId() {
    return this.memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public String getMemberIdType() {
    return this.memberIdType;
  }

  public void setMemberIdType(String memberIdType) {
    this.memberIdType = memberIdType;
  }

  public static class Builder {

    private String memberType;
    private String memberId;
    private String memberIdType;

    public Builder memberType(String memberType) {
      this.memberType = memberType;
      return this;
    }

    public Builder memberType(com.lark.oapi.service.contact.v3.enums.MemberTypeEnum memberType) {
      this.memberType = memberType.getValue();
      return this;
    }

    public Builder memberId(String memberId) {
      this.memberId = memberId;
      return this;
    }

    public Builder memberIdType(String memberIdType) {
      this.memberIdType = memberIdType;
      return this;
    }

    public Builder memberIdType(
        com.lark.oapi.service.contact.v3.enums.MemberIdTypeEnum memberIdType) {
      this.memberIdType = memberIdType.getValue();
      return this;
    }


    public RemoveGroupMemberReqBody build() {
      return new RemoveGroupMemberReqBody(this);
    }
  }
}
