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

public class Checkbox {
    /**
     * 数据校验ID
     * <p> 示例值：1
     */
    @SerializedName("data_validation_id")
    private Integer dataValidationId;
    /**
     * 复选框值
     * <p> 示例值：TRUE
     */
    @SerializedName("data_validiton_value")
    private String dataValiditonValue;

    // builder 开始
    public Checkbox() {
    }

    public Checkbox(Builder builder) {
        /**
         * 数据校验ID
         * <p> 示例值：1
         */
        this.dataValidationId = builder.dataValidationId;
        /**
         * 复选框值
         * <p> 示例值：TRUE
         */
        this.dataValiditonValue = builder.dataValiditonValue;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getDataValidationId() {
        return this.dataValidationId;
    }

    public void setDataValidationId(Integer dataValidationId) {
        this.dataValidationId = dataValidationId;
    }

    public String getDataValiditonValue() {
        return this.dataValiditonValue;
    }

    public void setDataValiditonValue(String dataValiditonValue) {
        this.dataValiditonValue = dataValiditonValue;
    }

    public static class Builder {
        /**
         * 数据校验ID
         * <p> 示例值：1
         */
        private Integer dataValidationId;
        /**
         * 复选框值
         * <p> 示例值：TRUE
         */
        private String dataValiditonValue;

        /**
         * 数据校验ID
         * <p> 示例值：1
         *
         * @param dataValidationId
         * @return
         */
        public Builder dataValidationId(Integer dataValidationId) {
            this.dataValidationId = dataValidationId;
            return this;
        }


        /**
         * 复选框值
         * <p> 示例值：TRUE
         *
         * @param dataValiditonValue
         * @return
         */
        public Builder dataValiditonValue(String dataValiditonValue) {
            this.dataValiditonValue = dataValiditonValue;
            return this;
        }


        public Checkbox build() {
            return new Checkbox(this);
        }
    }
}
