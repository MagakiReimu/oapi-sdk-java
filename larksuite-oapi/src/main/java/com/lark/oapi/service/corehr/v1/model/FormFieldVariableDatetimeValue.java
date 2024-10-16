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

public class FormFieldVariableDatetimeValue {
    /**
     * 毫秒的时间戳
     * <p> 示例值：1670227428803
     */
    @SerializedName("value")
    private Integer value;
    /**
     * 时区
     * <p> 示例值：+08:00
     */
    @SerializedName("zone")
    private String zone;

    // builder 开始
    public FormFieldVariableDatetimeValue() {
    }

    public FormFieldVariableDatetimeValue(Builder builder) {
        /**
         * 毫秒的时间戳
         * <p> 示例值：1670227428803
         */
        this.value = builder.value;
        /**
         * 时区
         * <p> 示例值：+08:00
         */
        this.zone = builder.zone;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getValue() {
        return this.value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getZone() {
        return this.zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public static class Builder {
        /**
         * 毫秒的时间戳
         * <p> 示例值：1670227428803
         */
        private Integer value;
        /**
         * 时区
         * <p> 示例值：+08:00
         */
        private String zone;

        /**
         * 毫秒的时间戳
         * <p> 示例值：1670227428803
         *
         * @param value
         * @return
         */
        public Builder value(Integer value) {
            this.value = value;
            return this;
        }


        /**
         * 时区
         * <p> 示例值：+08:00
         *
         * @param zone
         * @return
         */
        public Builder zone(String zone) {
            this.zone = zone;
            return this;
        }


        public FormFieldVariableDatetimeValue build() {
            return new FormFieldVariableDatetimeValue(this);
        }
    }
}
