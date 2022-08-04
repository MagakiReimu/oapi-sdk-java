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

public class UserStatsView {

  @SerializedName("view_id")
  private String viewId;
  @SerializedName("stats_type")
  private String statsType;
  @SerializedName("user_id")
  private String userId;
  @SerializedName("items")
  private Item[] items;

  // builder 开始
  public UserStatsView() {
  }

  public UserStatsView(Builder builder) {
    this.viewId = builder.viewId;
    this.statsType = builder.statsType;
    this.userId = builder.userId;
    this.items = builder.items;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getViewId() {
    return this.viewId;
  }

  public void setViewId(String viewId) {
    this.viewId = viewId;
  }

  public String getStatsType() {
    return this.statsType;
  }

  public void setStatsType(String statsType) {
    this.statsType = statsType;
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Item[] getItems() {
    return this.items;
  }

  public void setItems(Item[] items) {
    this.items = items;
  }

  public static class Builder {

    private String viewId;
    private String statsType;
    private String userId;
    private Item[] items;

    public Builder viewId(String viewId) {
      this.viewId = viewId;
      return this;
    }

    public Builder statsType(String statsType) {
      this.statsType = statsType;
      return this;
    }

    public Builder statsType(com.lark.oapi.service.attendance.v1.enums.StatsTypeEnum statsType) {
      this.statsType = statsType.getValue();
      return this;
    }

    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }

    public Builder items(Item[] items) {
      this.items = items;
      return this;
    }


    public UserStatsView build() {
      return new UserStatsView(this);
    }
  }
}
