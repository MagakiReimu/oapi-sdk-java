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

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.sheets.v3.enums.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class Dimension {
    /**
     * 操作行还是列，取值：ROWS、COLUMNS
     * <p> 示例值：ROWS
     */
    @SerializedName("major_dimension")
    private String majorDimension;
    /**
     * 起始行或者列号
     * <p> 示例值：0
     */
    @SerializedName("start_index")
    private Integer startIndex;
    /**
     * 结束行或者列号
     * <p> 示例值：1
     */
    @SerializedName("end_index")
    private Integer endIndex;

    // builder 开始
    public Dimension() {
    }

    public Dimension(Builder builder) {
        /**
         * 操作行还是列，取值：ROWS、COLUMNS
         * <p> 示例值：ROWS
         */
        this.majorDimension = builder.majorDimension;
        /**
         * 起始行或者列号
         * <p> 示例值：0
         */
        this.startIndex = builder.startIndex;
        /**
         * 结束行或者列号
         * <p> 示例值：1
         */
        this.endIndex = builder.endIndex;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getMajorDimension() {
        return this.majorDimension;
    }

    public void setMajorDimension(String majorDimension) {
        this.majorDimension = majorDimension;
    }

    public Integer getStartIndex() {
        return this.startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getEndIndex() {
        return this.endIndex;
    }

    public void setEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
    }

    public static class Builder {
        /**
         * 操作行还是列，取值：ROWS、COLUMNS
         * <p> 示例值：ROWS
         */
        private String majorDimension;
        /**
         * 起始行或者列号
         * <p> 示例值：0
         */
        private Integer startIndex;
        /**
         * 结束行或者列号
         * <p> 示例值：1
         */
        private Integer endIndex;

        /**
         * 操作行还是列，取值：ROWS、COLUMNS
         * <p> 示例值：ROWS
         *
         * @param majorDimension
         * @return
         */
        public Builder majorDimension(String majorDimension) {
            this.majorDimension = majorDimension;
            return this;
        }


        /**
         * 起始行或者列号
         * <p> 示例值：0
         *
         * @param startIndex
         * @return
         */
        public Builder startIndex(Integer startIndex) {
            this.startIndex = startIndex;
            return this;
        }


        /**
         * 结束行或者列号
         * <p> 示例值：1
         *
         * @param endIndex
         * @return
         */
        public Builder endIndex(Integer endIndex) {
            this.endIndex = endIndex;
            return this;
        }


        public Dimension build() {
            return new Dimension(this);
        }
    }
}
