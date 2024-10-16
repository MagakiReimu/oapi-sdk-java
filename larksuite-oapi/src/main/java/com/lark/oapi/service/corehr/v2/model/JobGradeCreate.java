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

package com.lark.oapi.service.corehr.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.corehr.v2.enums.*;
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

public class JobGradeCreate {
    /**
     * 职等数值
     * <p> 示例值：9999
     */
    @SerializedName("grade_order")
    private Integer gradeOrder;
    /**
     * 编码
     * <p> 示例值：A01234
     */
    @SerializedName("code")
    private String code;
    /**
     * 名称
     * <p> 示例值：
     */
    @SerializedName("names")
    private I18n[] names;
    /**
     * 描述
     * <p> 示例值：
     */
    @SerializedName("descriptions")
    private I18n[] descriptions;

    // builder 开始
    public JobGradeCreate() {
    }

    public JobGradeCreate(Builder builder) {
        /**
         * 职等数值
         * <p> 示例值：9999
         */
        this.gradeOrder = builder.gradeOrder;
        /**
         * 编码
         * <p> 示例值：A01234
         */
        this.code = builder.code;
        /**
         * 名称
         * <p> 示例值：
         */
        this.names = builder.names;
        /**
         * 描述
         * <p> 示例值：
         */
        this.descriptions = builder.descriptions;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getGradeOrder() {
        return this.gradeOrder;
    }

    public void setGradeOrder(Integer gradeOrder) {
        this.gradeOrder = gradeOrder;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public I18n[] getNames() {
        return this.names;
    }

    public void setNames(I18n[] names) {
        this.names = names;
    }

    public I18n[] getDescriptions() {
        return this.descriptions;
    }

    public void setDescriptions(I18n[] descriptions) {
        this.descriptions = descriptions;
    }

    public static class Builder {
        /**
         * 职等数值
         * <p> 示例值：9999
         */
        private Integer gradeOrder;
        /**
         * 编码
         * <p> 示例值：A01234
         */
        private String code;
        /**
         * 名称
         * <p> 示例值：
         */
        private I18n[] names;
        /**
         * 描述
         * <p> 示例值：
         */
        private I18n[] descriptions;

        /**
         * 职等数值
         * <p> 示例值：9999
         *
         * @param gradeOrder
         * @return
         */
        public Builder gradeOrder(Integer gradeOrder) {
            this.gradeOrder = gradeOrder;
            return this;
        }


        /**
         * 编码
         * <p> 示例值：A01234
         *
         * @param code
         * @return
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }


        /**
         * 名称
         * <p> 示例值：
         *
         * @param names
         * @return
         */
        public Builder names(I18n[] names) {
            this.names = names;
            return this;
        }


        /**
         * 描述
         * <p> 示例值：
         *
         * @param descriptions
         * @return
         */
        public Builder descriptions(I18n[] descriptions) {
            this.descriptions = descriptions;
            return this;
        }


        public JobGradeCreate build() {
            return new JobGradeCreate(this);
        }
    }
}
