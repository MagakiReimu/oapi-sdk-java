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

package com.lark.oapi.service.corehr.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.corehr.v1.enums.*;
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

public class CpstBandWidth {
    /**
     * 上限
     * <p> 示例值：15000
     */
    @SerializedName("upper_limit")
    private String upperLimit;
    /**
     * 下限
     * <p> 示例值：10000
     */
    @SerializedName("lower_limit")
    private String lowerLimit;

    // builder 开始
    public CpstBandWidth() {
    }

    public CpstBandWidth(Builder builder) {
        /**
         * 上限
         * <p> 示例值：15000
         */
        this.upperLimit = builder.upperLimit;
        /**
         * 下限
         * <p> 示例值：10000
         */
        this.lowerLimit = builder.lowerLimit;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUpperLimit() {
        return this.upperLimit;
    }

    public void setUpperLimit(String upperLimit) {
        this.upperLimit = upperLimit;
    }

    public String getLowerLimit() {
        return this.lowerLimit;
    }

    public void setLowerLimit(String lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public static class Builder {
        /**
         * 上限
         * <p> 示例值：15000
         */
        private String upperLimit;
        /**
         * 下限
         * <p> 示例值：10000
         */
        private String lowerLimit;

        /**
         * 上限
         * <p> 示例值：15000
         *
         * @param upperLimit
         * @return
         */
        public Builder upperLimit(String upperLimit) {
            this.upperLimit = upperLimit;
            return this;
        }


        /**
         * 下限
         * <p> 示例值：10000
         *
         * @param lowerLimit
         * @return
         */
        public Builder lowerLimit(String lowerLimit) {
            this.lowerLimit = lowerLimit;
            return this;
        }


        public CpstBandWidth build() {
            return new CpstBandWidth(this);
        }
    }
}
