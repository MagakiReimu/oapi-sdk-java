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

package com.lark.oapi.service.sheets.v3.model;

import com.google.gson.annotations.SerializedName;

public class AddSheet {

  /**
   * 工作表标题
   * <p> 示例值：abc
   */
  @SerializedName("title")
  private String title;
  /**
   * 工作表位置
   * <p> 示例值：0
   */
  @SerializedName("index")
  private Integer index;

  // builder 开始
  public AddSheet() {
  }

  public AddSheet(Builder builder) {
    /**
     * 工作表标题
     * <p> 示例值：abc
     */
    this.title = builder.title;
    /**
     * 工作表位置
     * <p> 示例值：0
     */
    this.index = builder.index;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getIndex() {
    return this.index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public static class Builder {

    /**
     * 工作表标题
     * <p> 示例值：abc
     */
    private String title;
    /**
     * 工作表位置
     * <p> 示例值：0
     */
    private Integer index;

    /**
     * 工作表标题
     * <p> 示例值：abc
     *
     * @param title
     * @return
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }


    /**
     * 工作表位置
     * <p> 示例值：0
     *
     * @param index
     * @return
     */
    public Builder index(Integer index) {
      this.index = index;
      return this;
    }


    public AddSheet build() {
      return new AddSheet(this);
    }
  }
}
