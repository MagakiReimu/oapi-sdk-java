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
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class CreateCalendarAclReq {

  @Query
  @SerializedName("user_id_type")
  private String userIdType;
  @Path
  @SerializedName("calendar_id")
  private String calendarId;
  @Body
  private CalendarAcl body;

  // builder 开始
  public CreateCalendarAclReq() {
  }

  public CreateCalendarAclReq(Builder builder) {
    this.userIdType = builder.userIdType;
    this.calendarId = builder.calendarId;
    this.body = builder.body;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getUserIdType() {
    return this.userIdType;
  }

  public void setUserIdType(String userIdType) {
    this.userIdType = userIdType;
  }

  public String getCalendarId() {
    return this.calendarId;
  }

  public void setCalendarId(String calendarId) {
    this.calendarId = calendarId;
  }

  public CalendarAcl getCalendarAcl() {
    return this.body;
  }

  public void setCalendarAcl(CalendarAcl body) {
    this.body = body;
  }

  public static class Builder {

    private String userIdType;
    private String calendarId;
    private CalendarAcl body;

    public Builder userIdType(String userIdType) {
      this.userIdType = userIdType;
      return this;
    }

    public Builder userIdType(com.lark.oapi.service.calendar.v4.enums.UserIdTypeEnum userIdType) {
      this.userIdType = userIdType.getValue();
      return this;
    }

    public Builder calendarId(String calendarId) {
      this.calendarId = calendarId;
      return this;
    }

    public CalendarAcl getCalendarAcl() {
      return this.body;
    }

    public Builder calendarAcl(CalendarAcl body) {
      this.body = body;
      return this;
    }

    public CreateCalendarAclReq build() {
      return new CreateCalendarAclReq(this);
    }
  }
}
