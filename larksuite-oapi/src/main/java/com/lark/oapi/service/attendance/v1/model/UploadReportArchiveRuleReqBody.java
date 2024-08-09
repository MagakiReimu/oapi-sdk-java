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

package com.lark.oapi.service.attendance.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.attendance.v1.enums.*;
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

public class UploadReportArchiveRuleReqBody {
    /**
     * 月份
     * <p> 示例值：202409
     */
    @SerializedName("month")
    private String month;
    /**
     * 操作者ID
     * <p> 示例值：ax11d
     */
    @SerializedName("operator_id")
    private String operatorId;
    /**
     * 归档报表内容(不超过50个)
     * <p> 示例值：
     */
    @SerializedName("archive_report_datas")
    private ArchiveReportData[] archiveReportDatas;
    /**
     * 归档规则id
     * <p> 示例值：1
     */
    @SerializedName("archive_rule_id")
    private String archiveRuleId;

    // builder 开始
    public UploadReportArchiveRuleReqBody() {
    }

    public UploadReportArchiveRuleReqBody(Builder builder) {
        /**
         * 月份
         * <p> 示例值：202409
         */
        this.month = builder.month;
        /**
         * 操作者ID
         * <p> 示例值：ax11d
         */
        this.operatorId = builder.operatorId;
        /**
         * 归档报表内容(不超过50个)
         * <p> 示例值：
         */
        this.archiveReportDatas = builder.archiveReportDatas;
        /**
         * 归档规则id
         * <p> 示例值：1
         */
        this.archiveRuleId = builder.archiveRuleId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getMonth() {
        return this.month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getOperatorId() {
        return this.operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public ArchiveReportData[] getArchiveReportDatas() {
        return this.archiveReportDatas;
    }

    public void setArchiveReportDatas(ArchiveReportData[] archiveReportDatas) {
        this.archiveReportDatas = archiveReportDatas;
    }

    public String getArchiveRuleId() {
        return this.archiveRuleId;
    }

    public void setArchiveRuleId(String archiveRuleId) {
        this.archiveRuleId = archiveRuleId;
    }

    public static class Builder {
        /**
         * 月份
         * <p> 示例值：202409
         */
        private String month;
        /**
         * 操作者ID
         * <p> 示例值：ax11d
         */
        private String operatorId;
        /**
         * 归档报表内容(不超过50个)
         * <p> 示例值：
         */
        private ArchiveReportData[] archiveReportDatas;
        /**
         * 归档规则id
         * <p> 示例值：1
         */
        private String archiveRuleId;

        /**
         * 月份
         * <p> 示例值：202409
         *
         * @param month
         * @return
         */
        public Builder month(String month) {
            this.month = month;
            return this;
        }


        /**
         * 操作者ID
         * <p> 示例值：ax11d
         *
         * @param operatorId
         * @return
         */
        public Builder operatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }


        /**
         * 归档报表内容(不超过50个)
         * <p> 示例值：
         *
         * @param archiveReportDatas
         * @return
         */
        public Builder archiveReportDatas(ArchiveReportData[] archiveReportDatas) {
            this.archiveReportDatas = archiveReportDatas;
            return this;
        }


        /**
         * 归档规则id
         * <p> 示例值：1
         *
         * @param archiveRuleId
         * @return
         */
        public Builder archiveRuleId(String archiveRuleId) {
            this.archiveRuleId = archiveRuleId;
            return this;
        }


        public UploadReportArchiveRuleReqBody build() {
            return new UploadReportArchiveRuleReqBody(this);
        }
    }
}
