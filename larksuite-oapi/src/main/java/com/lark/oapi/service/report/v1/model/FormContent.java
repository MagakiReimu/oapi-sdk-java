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

package com.lark.oapi.service.report.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.report.v1.enums.*;
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

public class FormContent {
    /**
     * 表单字段ID
     * <p> 示例值：6968626905868156948
     */
    @SerializedName("field_id")
    private String fieldId;
    /**
     * 表单字段名称
     * <p> 示例值：表单测试
     */
    @SerializedName("field_name")
    private String fieldName;
    /**
     * 表单字段值
     * <p> 示例值：测试数据
     */
    @SerializedName("field_value")
    private String fieldValue;

    // builder 开始
    public FormContent() {
    }

    public FormContent(Builder builder) {
        /**
         * 表单字段ID
         * <p> 示例值：6968626905868156948
         */
        this.fieldId = builder.fieldId;
        /**
         * 表单字段名称
         * <p> 示例值：表单测试
         */
        this.fieldName = builder.fieldName;
        /**
         * 表单字段值
         * <p> 示例值：测试数据
         */
        this.fieldValue = builder.fieldValue;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFieldId() {
        return this.fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldValue() {
        return this.fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public static class Builder {
        /**
         * 表单字段ID
         * <p> 示例值：6968626905868156948
         */
        private String fieldId;
        /**
         * 表单字段名称
         * <p> 示例值：表单测试
         */
        private String fieldName;
        /**
         * 表单字段值
         * <p> 示例值：测试数据
         */
        private String fieldValue;

        /**
         * 表单字段ID
         * <p> 示例值：6968626905868156948
         *
         * @param fieldId
         * @return
         */
        public Builder fieldId(String fieldId) {
            this.fieldId = fieldId;
            return this;
        }


        /**
         * 表单字段名称
         * <p> 示例值：表单测试
         *
         * @param fieldName
         * @return
         */
        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }


        /**
         * 表单字段值
         * <p> 示例值：测试数据
         *
         * @param fieldValue
         * @return
         */
        public Builder fieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }


        public FormContent build() {
            return new FormContent(this);
        }
    }
}
