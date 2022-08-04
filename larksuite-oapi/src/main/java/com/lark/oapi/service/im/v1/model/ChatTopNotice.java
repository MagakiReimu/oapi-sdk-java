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

package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class ChatTopNotice {

  @SerializedName("action_type")
  private String actionType;
  @SerializedName("message_id")
  private String messageId;

  // builder 开始
  public ChatTopNotice() {
  }

  public ChatTopNotice(Builder builder) {
    this.actionType = builder.actionType;
    this.messageId = builder.messageId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getActionType() {
    return this.actionType;
  }

  public void setActionType(String actionType) {
    this.actionType = actionType;
  }

  public String getMessageId() {
    return this.messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public static class Builder {

    private String actionType;
    private String messageId;

    public Builder actionType(String actionType) {
      this.actionType = actionType;
      return this;
    }

    public Builder actionType(com.lark.oapi.service.im.v1.enums.ActionTypeEnum actionType) {
      this.actionType = actionType.getValue();
      return this;
    }

    public Builder messageId(String messageId) {
      this.messageId = messageId;
      return this;
    }


    public ChatTopNotice build() {
      return new ChatTopNotice(this);
    }
  }
}
