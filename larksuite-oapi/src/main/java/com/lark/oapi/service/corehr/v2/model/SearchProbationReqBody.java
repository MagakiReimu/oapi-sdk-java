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

public class SearchProbationReqBody {
    /**
     * 雇佣 ID 列表
     * <p> 示例值：
     */
    @SerializedName("employment_ids")
    private String[] employmentIds;
    /**
     * 部门 ID 列表
     * <p> 示例值：
     */
    @SerializedName("department_ids")
    private String[] departmentIds;
    /**
     * 试用期开始日期 - 搜索范围开始，需要与搜索范围结束一同使用
     * <p> 示例值：2022-05-18
     */
    @SerializedName("probation_start_date_start")
    private String probationStartDateStart;
    /**
     * 试用期开始日期 - 搜索范围结束
     * <p> 示例值：2022-05-20
     */
    @SerializedName("probation_start_date_end")
    private String probationStartDateEnd;
    /**
     * 试用期预计结束日期 - 搜索范围开始，需要与搜索范围结束一同使用
     * <p> 示例值：2022-06-20
     */
    @SerializedName("probation_expected_end_date_start")
    private String probationExpectedEndDateStart;
    /**
     * 试用期预计结束日期 - 搜索范围结束
     * <p> 示例值：2022-07-20
     */
    @SerializedName("probation_expected_end_date_end")
    private String probationExpectedEndDateEnd;
    /**
     * 试用期实际结束日期 - 搜索范围开始，需要与搜索范围结束一同使用
     * <p> 示例值：2022-08-20
     */
    @SerializedName("actual_probation_end_date_start")
    private String actualProbationEndDateStart;
    /**
     * 试用期实际结束日期 - 搜索范围结束
     * <p> 示例值：2022-09-20
     */
    @SerializedName("actual_probation_end_date_end")
    private String actualProbationEndDateEnd;
    /**
     * 转正发起日期 - 搜索范围开始，需要与搜索范围结束一同使用
     * <p> 示例值：2022-10-20
     */
    @SerializedName("initiating_time_start")
    private String initiatingTimeStart;
    /**
     * 转正发起日期 - 搜索范围结束
     * <p> 示例值：2022-11-20
     */
    @SerializedName("initiating_time_end")
    private String initiatingTimeEnd;
    /**
     * 试用期状态
     * <p> 示例值：approved
     */
    @SerializedName("probation_status")
    private String probationStatus;
    /**
     * 试用期最终考核结果
     * <p> 示例值：approved
     */
    @SerializedName("final_assessment_result")
    private String finalAssessmentResult;
    /**
     * 试用期最终考核等级
     * <p> 示例值：grade_a
     */
    @SerializedName("final_assessment_grade")
    private String finalAssessmentGrade;

    // builder 开始
    public SearchProbationReqBody() {
    }

    public SearchProbationReqBody(Builder builder) {
        /**
         * 雇佣 ID 列表
         * <p> 示例值：
         */
        this.employmentIds = builder.employmentIds;
        /**
         * 部门 ID 列表
         * <p> 示例值：
         */
        this.departmentIds = builder.departmentIds;
        /**
         * 试用期开始日期 - 搜索范围开始，需要与搜索范围结束一同使用
         * <p> 示例值：2022-05-18
         */
        this.probationStartDateStart = builder.probationStartDateStart;
        /**
         * 试用期开始日期 - 搜索范围结束
         * <p> 示例值：2022-05-20
         */
        this.probationStartDateEnd = builder.probationStartDateEnd;
        /**
         * 试用期预计结束日期 - 搜索范围开始，需要与搜索范围结束一同使用
         * <p> 示例值：2022-06-20
         */
        this.probationExpectedEndDateStart = builder.probationExpectedEndDateStart;
        /**
         * 试用期预计结束日期 - 搜索范围结束
         * <p> 示例值：2022-07-20
         */
        this.probationExpectedEndDateEnd = builder.probationExpectedEndDateEnd;
        /**
         * 试用期实际结束日期 - 搜索范围开始，需要与搜索范围结束一同使用
         * <p> 示例值：2022-08-20
         */
        this.actualProbationEndDateStart = builder.actualProbationEndDateStart;
        /**
         * 试用期实际结束日期 - 搜索范围结束
         * <p> 示例值：2022-09-20
         */
        this.actualProbationEndDateEnd = builder.actualProbationEndDateEnd;
        /**
         * 转正发起日期 - 搜索范围开始，需要与搜索范围结束一同使用
         * <p> 示例值：2022-10-20
         */
        this.initiatingTimeStart = builder.initiatingTimeStart;
        /**
         * 转正发起日期 - 搜索范围结束
         * <p> 示例值：2022-11-20
         */
        this.initiatingTimeEnd = builder.initiatingTimeEnd;
        /**
         * 试用期状态
         * <p> 示例值：approved
         */
        this.probationStatus = builder.probationStatus;
        /**
         * 试用期最终考核结果
         * <p> 示例值：approved
         */
        this.finalAssessmentResult = builder.finalAssessmentResult;
        /**
         * 试用期最终考核等级
         * <p> 示例值：grade_a
         */
        this.finalAssessmentGrade = builder.finalAssessmentGrade;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String[] getEmploymentIds() {
        return this.employmentIds;
    }

    public void setEmploymentIds(String[] employmentIds) {
        this.employmentIds = employmentIds;
    }

    public String[] getDepartmentIds() {
        return this.departmentIds;
    }

    public void setDepartmentIds(String[] departmentIds) {
        this.departmentIds = departmentIds;
    }

    public String getProbationStartDateStart() {
        return this.probationStartDateStart;
    }

    public void setProbationStartDateStart(String probationStartDateStart) {
        this.probationStartDateStart = probationStartDateStart;
    }

    public String getProbationStartDateEnd() {
        return this.probationStartDateEnd;
    }

    public void setProbationStartDateEnd(String probationStartDateEnd) {
        this.probationStartDateEnd = probationStartDateEnd;
    }

    public String getProbationExpectedEndDateStart() {
        return this.probationExpectedEndDateStart;
    }

    public void setProbationExpectedEndDateStart(String probationExpectedEndDateStart) {
        this.probationExpectedEndDateStart = probationExpectedEndDateStart;
    }

    public String getProbationExpectedEndDateEnd() {
        return this.probationExpectedEndDateEnd;
    }

    public void setProbationExpectedEndDateEnd(String probationExpectedEndDateEnd) {
        this.probationExpectedEndDateEnd = probationExpectedEndDateEnd;
    }

    public String getActualProbationEndDateStart() {
        return this.actualProbationEndDateStart;
    }

    public void setActualProbationEndDateStart(String actualProbationEndDateStart) {
        this.actualProbationEndDateStart = actualProbationEndDateStart;
    }

    public String getActualProbationEndDateEnd() {
        return this.actualProbationEndDateEnd;
    }

    public void setActualProbationEndDateEnd(String actualProbationEndDateEnd) {
        this.actualProbationEndDateEnd = actualProbationEndDateEnd;
    }

    public String getInitiatingTimeStart() {
        return this.initiatingTimeStart;
    }

    public void setInitiatingTimeStart(String initiatingTimeStart) {
        this.initiatingTimeStart = initiatingTimeStart;
    }

    public String getInitiatingTimeEnd() {
        return this.initiatingTimeEnd;
    }

    public void setInitiatingTimeEnd(String initiatingTimeEnd) {
        this.initiatingTimeEnd = initiatingTimeEnd;
    }

    public String getProbationStatus() {
        return this.probationStatus;
    }

    public void setProbationStatus(String probationStatus) {
        this.probationStatus = probationStatus;
    }

    public String getFinalAssessmentResult() {
        return this.finalAssessmentResult;
    }

    public void setFinalAssessmentResult(String finalAssessmentResult) {
        this.finalAssessmentResult = finalAssessmentResult;
    }

    public String getFinalAssessmentGrade() {
        return this.finalAssessmentGrade;
    }

    public void setFinalAssessmentGrade(String finalAssessmentGrade) {
        this.finalAssessmentGrade = finalAssessmentGrade;
    }

    public static class Builder {
        /**
         * 雇佣 ID 列表
         * <p> 示例值：
         */
        private String[] employmentIds;
        /**
         * 部门 ID 列表
         * <p> 示例值：
         */
        private String[] departmentIds;
        /**
         * 试用期开始日期 - 搜索范围开始，需要与搜索范围结束一同使用
         * <p> 示例值：2022-05-18
         */
        private String probationStartDateStart;
        /**
         * 试用期开始日期 - 搜索范围结束
         * <p> 示例值：2022-05-20
         */
        private String probationStartDateEnd;
        /**
         * 试用期预计结束日期 - 搜索范围开始，需要与搜索范围结束一同使用
         * <p> 示例值：2022-06-20
         */
        private String probationExpectedEndDateStart;
        /**
         * 试用期预计结束日期 - 搜索范围结束
         * <p> 示例值：2022-07-20
         */
        private String probationExpectedEndDateEnd;
        /**
         * 试用期实际结束日期 - 搜索范围开始，需要与搜索范围结束一同使用
         * <p> 示例值：2022-08-20
         */
        private String actualProbationEndDateStart;
        /**
         * 试用期实际结束日期 - 搜索范围结束
         * <p> 示例值：2022-09-20
         */
        private String actualProbationEndDateEnd;
        /**
         * 转正发起日期 - 搜索范围开始，需要与搜索范围结束一同使用
         * <p> 示例值：2022-10-20
         */
        private String initiatingTimeStart;
        /**
         * 转正发起日期 - 搜索范围结束
         * <p> 示例值：2022-11-20
         */
        private String initiatingTimeEnd;
        /**
         * 试用期状态
         * <p> 示例值：approved
         */
        private String probationStatus;
        /**
         * 试用期最终考核结果
         * <p> 示例值：approved
         */
        private String finalAssessmentResult;
        /**
         * 试用期最终考核等级
         * <p> 示例值：grade_a
         */
        private String finalAssessmentGrade;

        /**
         * 雇佣 ID 列表
         * <p> 示例值：
         *
         * @param employmentIds
         * @return
         */
        public Builder employmentIds(String[] employmentIds) {
            this.employmentIds = employmentIds;
            return this;
        }


        /**
         * 部门 ID 列表
         * <p> 示例值：
         *
         * @param departmentIds
         * @return
         */
        public Builder departmentIds(String[] departmentIds) {
            this.departmentIds = departmentIds;
            return this;
        }


        /**
         * 试用期开始日期 - 搜索范围开始，需要与搜索范围结束一同使用
         * <p> 示例值：2022-05-18
         *
         * @param probationStartDateStart
         * @return
         */
        public Builder probationStartDateStart(String probationStartDateStart) {
            this.probationStartDateStart = probationStartDateStart;
            return this;
        }


        /**
         * 试用期开始日期 - 搜索范围结束
         * <p> 示例值：2022-05-20
         *
         * @param probationStartDateEnd
         * @return
         */
        public Builder probationStartDateEnd(String probationStartDateEnd) {
            this.probationStartDateEnd = probationStartDateEnd;
            return this;
        }


        /**
         * 试用期预计结束日期 - 搜索范围开始，需要与搜索范围结束一同使用
         * <p> 示例值：2022-06-20
         *
         * @param probationExpectedEndDateStart
         * @return
         */
        public Builder probationExpectedEndDateStart(String probationExpectedEndDateStart) {
            this.probationExpectedEndDateStart = probationExpectedEndDateStart;
            return this;
        }


        /**
         * 试用期预计结束日期 - 搜索范围结束
         * <p> 示例值：2022-07-20
         *
         * @param probationExpectedEndDateEnd
         * @return
         */
        public Builder probationExpectedEndDateEnd(String probationExpectedEndDateEnd) {
            this.probationExpectedEndDateEnd = probationExpectedEndDateEnd;
            return this;
        }


        /**
         * 试用期实际结束日期 - 搜索范围开始，需要与搜索范围结束一同使用
         * <p> 示例值：2022-08-20
         *
         * @param actualProbationEndDateStart
         * @return
         */
        public Builder actualProbationEndDateStart(String actualProbationEndDateStart) {
            this.actualProbationEndDateStart = actualProbationEndDateStart;
            return this;
        }


        /**
         * 试用期实际结束日期 - 搜索范围结束
         * <p> 示例值：2022-09-20
         *
         * @param actualProbationEndDateEnd
         * @return
         */
        public Builder actualProbationEndDateEnd(String actualProbationEndDateEnd) {
            this.actualProbationEndDateEnd = actualProbationEndDateEnd;
            return this;
        }


        /**
         * 转正发起日期 - 搜索范围开始，需要与搜索范围结束一同使用
         * <p> 示例值：2022-10-20
         *
         * @param initiatingTimeStart
         * @return
         */
        public Builder initiatingTimeStart(String initiatingTimeStart) {
            this.initiatingTimeStart = initiatingTimeStart;
            return this;
        }


        /**
         * 转正发起日期 - 搜索范围结束
         * <p> 示例值：2022-11-20
         *
         * @param initiatingTimeEnd
         * @return
         */
        public Builder initiatingTimeEnd(String initiatingTimeEnd) {
            this.initiatingTimeEnd = initiatingTimeEnd;
            return this;
        }


        /**
         * 试用期状态
         * <p> 示例值：approved
         *
         * @param probationStatus
         * @return
         */
        public Builder probationStatus(String probationStatus) {
            this.probationStatus = probationStatus;
            return this;
        }

        /**
         * 试用期状态
         * <p> 示例值：approved
         *
         * @param probationStatus {@link com.lark.oapi.service.corehr.v2.enums.SearchProbationProbationStatusEnum}
         * @return
         */
        public Builder probationStatus(com.lark.oapi.service.corehr.v2.enums.SearchProbationProbationStatusEnum probationStatus) {
            this.probationStatus = probationStatus.getValue();
            return this;
        }


        /**
         * 试用期最终考核结果
         * <p> 示例值：approved
         *
         * @param finalAssessmentResult
         * @return
         */
        public Builder finalAssessmentResult(String finalAssessmentResult) {
            this.finalAssessmentResult = finalAssessmentResult;
            return this;
        }

        /**
         * 试用期最终考核结果
         * <p> 示例值：approved
         *
         * @param finalAssessmentResult {@link com.lark.oapi.service.corehr.v2.enums.SearchProbationFinalAssessmentResultEnum}
         * @return
         */
        public Builder finalAssessmentResult(com.lark.oapi.service.corehr.v2.enums.SearchProbationFinalAssessmentResultEnum finalAssessmentResult) {
            this.finalAssessmentResult = finalAssessmentResult.getValue();
            return this;
        }


        /**
         * 试用期最终考核等级
         * <p> 示例值：grade_a
         *
         * @param finalAssessmentGrade
         * @return
         */
        public Builder finalAssessmentGrade(String finalAssessmentGrade) {
            this.finalAssessmentGrade = finalAssessmentGrade;
            return this;
        }


        public SearchProbationReqBody build() {
            return new SearchProbationReqBody(this);
        }
    }
}
