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

package com.lark.oapi.service.application.v6.model;

import com.google.gson.annotations.SerializedName;

public class AppMessageTrendItem {

  @SerializedName("chat_type")
  private String chatType;
  @SerializedName("event_type")
  private String eventType;
  @SerializedName("message_type")
  private String messageType;
  @SerializedName("trend")
  private UsageTrendItem[] trend;

  // builder 开始
  public AppMessageTrendItem() {
  }

  public AppMessageTrendItem(Builder builder) {
    this.chatType = builder.chatType;
    this.eventType = builder.eventType;
    this.messageType = builder.messageType;
    this.trend = builder.trend;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getChatType() {
    return this.chatType;
  }

  public void setChatType(String chatType) {
    this.chatType = chatType;
  }

  public String getEventType() {
    return this.eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public String getMessageType() {
    return this.messageType;
  }

  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }

  public UsageTrendItem[] getTrend() {
    return this.trend;
  }

  public void setTrend(UsageTrendItem[] trend) {
    this.trend = trend;
  }

  public static class Builder {

    private String chatType;
    private String eventType;
    private String messageType;
    private UsageTrendItem[] trend;

    public Builder chatType(String chatType) {
      this.chatType = chatType;
      return this;
    }

    public Builder chatType(com.lark.oapi.service.application.v6.enums.ChatTypeEnum chatType) {
      this.chatType = chatType.getValue();
      return this;
    }

    public Builder eventType(String eventType) {
      this.eventType = eventType;
      return this;
    }

    public Builder eventType(com.lark.oapi.service.application.v6.enums.EventTypeEnum eventType) {
      this.eventType = eventType.getValue();
      return this;
    }

    public Builder messageType(String messageType) {
      this.messageType = messageType;
      return this;
    }

    public Builder messageType(
        com.lark.oapi.service.application.v6.enums.MessageTypeEnum messageType) {
      this.messageType = messageType.getValue();
      return this;
    }

    public Builder trend(UsageTrendItem[] trend) {
      this.trend = trend;
      return this;
    }


    public AppMessageTrendItem build() {
      return new AppMessageTrendItem(this);
    }
  }
}
