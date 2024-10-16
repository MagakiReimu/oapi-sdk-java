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

public class SubmitProbationReqBody {
    /**
     * 试用期人员的雇佣 ID
     * <p> 示例值：7140964208476371111
     */
    @SerializedName("employment_id")
    private String employmentId;
    /**
     * 转正方式
     * <p> 示例值：1
     */
    @SerializedName("conversion_mode")
    private Integer conversionMode;
    /**
     * 实际结束日期，如果为空则默认填入试用期预计结束日期，填入日期需满足：试用期开始时间 <= 实际结束日期 <= 试用期预计结束日期
     * <p> 示例值：2022-05-20
     */
    @SerializedName("actual_probation_end_date")
    private String actualProbationEndDate;
    /**
     * 发起方
     * <p> 示例值：system
     */
    @SerializedName("submission_type")
    private String submissionType;
    /**
     * 发起人 ID，当发起方为 HR 时填写，为其他发起方时该字段会自动计算
     * <p> 示例值：7140964208476371111
     */
    @SerializedName("initiator_id")
    private String initiatorId;
    /**
     * 备注，当为直接转正时必填
     * <p> 示例值：符合预期
     */
    @SerializedName("notes")
    private String notes;
    /**
     * 员工自评
     * <p> 示例值：符合预期
     */
    @SerializedName("self_review")
    private String selfReview;
    /**
     * 自定义字段（试用期中如果有附件自定义字段，当前不支持使用「上传文件」接口写入）
     * <p> 示例值：
     */
    @SerializedName("custom_fields")
    private CustomFieldData[] customFields;

    // builder 开始
    public SubmitProbationReqBody() {
    }

    public SubmitProbationReqBody(Builder builder) {
        /**
         * 试用期人员的雇佣 ID
         * <p> 示例值：7140964208476371111
         */
        this.employmentId = builder.employmentId;
        /**
         * 转正方式
         * <p> 示例值：1
         */
        this.conversionMode = builder.conversionMode;
        /**
         * 实际结束日期，如果为空则默认填入试用期预计结束日期，填入日期需满足：试用期开始时间 <= 实际结束日期 <= 试用期预计结束日期
         * <p> 示例值：2022-05-20
         */
        this.actualProbationEndDate = builder.actualProbationEndDate;
        /**
         * 发起方
         * <p> 示例值：system
         */
        this.submissionType = builder.submissionType;
        /**
         * 发起人 ID，当发起方为 HR 时填写，为其他发起方时该字段会自动计算
         * <p> 示例值：7140964208476371111
         */
        this.initiatorId = builder.initiatorId;
        /**
         * 备注，当为直接转正时必填
         * <p> 示例值：符合预期
         */
        this.notes = builder.notes;
        /**
         * 员工自评
         * <p> 示例值：符合预期
         */
        this.selfReview = builder.selfReview;
        /**
         * 自定义字段（试用期中如果有附件自定义字段，当前不支持使用「上传文件」接口写入）
         * <p> 示例值：
         */
        this.customFields = builder.customFields;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getEmploymentId() {
        return this.employmentId;
    }

    public void setEmploymentId(String employmentId) {
        this.employmentId = employmentId;
    }

    public Integer getConversionMode() {
        return this.conversionMode;
    }

    public void setConversionMode(Integer conversionMode) {
        this.conversionMode = conversionMode;
    }

    public String getActualProbationEndDate() {
        return this.actualProbationEndDate;
    }

    public void setActualProbationEndDate(String actualProbationEndDate) {
        this.actualProbationEndDate = actualProbationEndDate;
    }

    public String getSubmissionType() {
        return this.submissionType;
    }

    public void setSubmissionType(String submissionType) {
        this.submissionType = submissionType;
    }

    public String getInitiatorId() {
        return this.initiatorId;
    }

    public void setInitiatorId(String initiatorId) {
        this.initiatorId = initiatorId;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getSelfReview() {
        return this.selfReview;
    }

    public void setSelfReview(String selfReview) {
        this.selfReview = selfReview;
    }

    public CustomFieldData[] getCustomFields() {
        return this.customFields;
    }

    public void setCustomFields(CustomFieldData[] customFields) {
        this.customFields = customFields;
    }

    public static class Builder {
        /**
         * 试用期人员的雇佣 ID
         * <p> 示例值：7140964208476371111
         */
        private String employmentId;
        /**
         * 转正方式
         * <p> 示例值：1
         */
        private Integer conversionMode;
        /**
         * 实际结束日期，如果为空则默认填入试用期预计结束日期，填入日期需满足：试用期开始时间 <= 实际结束日期 <= 试用期预计结束日期
         * <p> 示例值：2022-05-20
         */
        private String actualProbationEndDate;
        /**
         * 发起方
         * <p> 示例值：system
         */
        private String submissionType;
        /**
         * 发起人 ID，当发起方为 HR 时填写，为其他发起方时该字段会自动计算
         * <p> 示例值：7140964208476371111
         */
        private String initiatorId;
        /**
         * 备注，当为直接转正时必填
         * <p> 示例值：符合预期
         */
        private String notes;
        /**
         * 员工自评
         * <p> 示例值：符合预期
         */
        private String selfReview;
        /**
         * 自定义字段（试用期中如果有附件自定义字段，当前不支持使用「上传文件」接口写入）
         * <p> 示例值：
         */
        private CustomFieldData[] customFields;

        /**
         * 试用期人员的雇佣 ID
         * <p> 示例值：7140964208476371111
         *
         * @param employmentId
         * @return
         */
        public Builder employmentId(String employmentId) {
            this.employmentId = employmentId;
            return this;
        }


        /**
         * 转正方式
         * <p> 示例值：1
         *
         * @param conversionMode
         * @return
         */
        public Builder conversionMode(Integer conversionMode) {
            this.conversionMode = conversionMode;
            return this;
        }

        /**
         * 实际结束日期，如果为空则默认填入试用期预计结束日期，填入日期需满足：试用期开始时间 <= 实际结束日期 <= 试用期预计结束日期
         * <p> 示例值：2022-05-20
         *
         * @param actualProbationEndDate
         * @return
         */
        public Builder actualProbationEndDate(String actualProbationEndDate) {
            this.actualProbationEndDate = actualProbationEndDate;
            return this;
        }


        /**
         * 发起方
         * <p> 示例值：system
         *
         * @param submissionType
         * @return
         */
        public Builder submissionType(String submissionType) {
            this.submissionType = submissionType;
            return this;
        }

        /**
         * 发起方
         * <p> 示例值：system
         *
         * @param submissionType {@link com.lark.oapi.service.corehr.v2.enums.SubmitProbationSubmissionTypeEnum}
         * @return
         */
        public Builder submissionType(com.lark.oapi.service.corehr.v2.enums.SubmitProbationSubmissionTypeEnum submissionType) {
            this.submissionType = submissionType.getValue();
            return this;
        }


        /**
         * 发起人 ID，当发起方为 HR 时填写，为其他发起方时该字段会自动计算
         * <p> 示例值：7140964208476371111
         *
         * @param initiatorId
         * @return
         */
        public Builder initiatorId(String initiatorId) {
            this.initiatorId = initiatorId;
            return this;
        }


        /**
         * 备注，当为直接转正时必填
         * <p> 示例值：符合预期
         *
         * @param notes
         * @return
         */
        public Builder notes(String notes) {
            this.notes = notes;
            return this;
        }


        /**
         * 员工自评
         * <p> 示例值：符合预期
         *
         * @param selfReview
         * @return
         */
        public Builder selfReview(String selfReview) {
            this.selfReview = selfReview;
            return this;
        }


        /**
         * 自定义字段（试用期中如果有附件自定义字段，当前不支持使用「上传文件」接口写入）
         * <p> 示例值：
         *
         * @param customFields
         * @return
         */
        public Builder customFields(CustomFieldData[] customFields) {
            this.customFields = customFields;
            return this;
        }


        public SubmitProbationReqBody build() {
            return new SubmitProbationReqBody(this);
        }
    }
}
