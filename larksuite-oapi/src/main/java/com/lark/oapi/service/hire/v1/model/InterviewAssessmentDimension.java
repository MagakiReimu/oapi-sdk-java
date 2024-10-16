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

package com.lark.oapi.service.hire.v1.model;

import com.lark.oapi.core.response.EmptyData;
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

public class InterviewAssessmentDimension {
    /**
     * 题目 ID
     * <p> 示例值：6949805467799537964
     */
    @SerializedName("id")
    private String id;
    /**
     * 题目名称
     * <p> 示例值：
     */
    @SerializedName("name")
    private I18n name;
    /**
     * 题目描述
     * <p> 示例值：
     */
    @SerializedName("description")
    private I18n description;
    /**
     * 是否启用
     * <p> 示例值：true
     */
    @SerializedName("enabled")
    private Boolean enabled;
    /**
     * 题目排序
     * <p> 示例值：1
     */
    @SerializedName("seq")
    private Integer seq;
    /**
     * 是否必填
     * <p> 示例值：true
     */
    @SerializedName("required")
    private Boolean required;
    /**
     * 题目类型
     * <p> 示例值：1
     */
    @SerializedName("dimension_type")
    private Integer dimensionType;
    /**
     * 选项信息，仅当题目类型为单选题、多选题时有值
     * <p> 示例值：
     */
    @SerializedName("args")
    private InterviewAssessmentDimensionArgs args;

    // builder 开始
    public InterviewAssessmentDimension() {
    }

    public InterviewAssessmentDimension(Builder builder) {
        /**
         * 题目 ID
         * <p> 示例值：6949805467799537964
         */
        this.id = builder.id;
        /**
         * 题目名称
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 题目描述
         * <p> 示例值：
         */
        this.description = builder.description;
        /**
         * 是否启用
         * <p> 示例值：true
         */
        this.enabled = builder.enabled;
        /**
         * 题目排序
         * <p> 示例值：1
         */
        this.seq = builder.seq;
        /**
         * 是否必填
         * <p> 示例值：true
         */
        this.required = builder.required;
        /**
         * 题目类型
         * <p> 示例值：1
         */
        this.dimensionType = builder.dimensionType;
        /**
         * 选项信息，仅当题目类型为单选题、多选题时有值
         * <p> 示例值：
         */
        this.args = builder.args;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public I18n getName() {
        return this.name;
    }

    public void setName(I18n name) {
        this.name = name;
    }

    public I18n getDescription() {
        return this.description;
    }

    public void setDescription(I18n description) {
        this.description = description;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getSeq() {
        return this.seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Boolean getRequired() {
        return this.required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public Integer getDimensionType() {
        return this.dimensionType;
    }

    public void setDimensionType(Integer dimensionType) {
        this.dimensionType = dimensionType;
    }

    public InterviewAssessmentDimensionArgs getArgs() {
        return this.args;
    }

    public void setArgs(InterviewAssessmentDimensionArgs args) {
        this.args = args;
    }

    public static class Builder {
        /**
         * 题目 ID
         * <p> 示例值：6949805467799537964
         */
        private String id;
        /**
         * 题目名称
         * <p> 示例值：
         */
        private I18n name;
        /**
         * 题目描述
         * <p> 示例值：
         */
        private I18n description;
        /**
         * 是否启用
         * <p> 示例值：true
         */
        private Boolean enabled;
        /**
         * 题目排序
         * <p> 示例值：1
         */
        private Integer seq;
        /**
         * 是否必填
         * <p> 示例值：true
         */
        private Boolean required;
        /**
         * 题目类型
         * <p> 示例值：1
         */
        private Integer dimensionType;
        /**
         * 选项信息，仅当题目类型为单选题、多选题时有值
         * <p> 示例值：
         */
        private InterviewAssessmentDimensionArgs args;

        /**
         * 题目 ID
         * <p> 示例值：6949805467799537964
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 题目名称
         * <p> 示例值：
         *
         * @param name
         * @return
         */
        public Builder name(I18n name) {
            this.name = name;
            return this;
        }


        /**
         * 题目描述
         * <p> 示例值：
         *
         * @param description
         * @return
         */
        public Builder description(I18n description) {
            this.description = description;
            return this;
        }


        /**
         * 是否启用
         * <p> 示例值：true
         *
         * @param enabled
         * @return
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }


        /**
         * 题目排序
         * <p> 示例值：1
         *
         * @param seq
         * @return
         */
        public Builder seq(Integer seq) {
            this.seq = seq;
            return this;
        }


        /**
         * 是否必填
         * <p> 示例值：true
         *
         * @param required
         * @return
         */
        public Builder required(Boolean required) {
            this.required = required;
            return this;
        }


        /**
         * 题目类型
         * <p> 示例值：1
         *
         * @param dimensionType
         * @return
         */
        public Builder dimensionType(Integer dimensionType) {
            this.dimensionType = dimensionType;
            return this;
        }


        /**
         * 选项信息，仅当题目类型为单选题、多选题时有值
         * <p> 示例值：
         *
         * @param args
         * @return
         */
        public Builder args(InterviewAssessmentDimensionArgs args) {
            this.args = args;
            return this;
        }


        public InterviewAssessmentDimension build() {
            return new InterviewAssessmentDimension(this);
        }
    }
}
