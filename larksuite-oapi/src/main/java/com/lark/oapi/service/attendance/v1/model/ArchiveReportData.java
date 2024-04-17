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

import com.google.gson.annotations.SerializedName;

public class ArchiveReportData {
    /**
     * 用户ID
     * <p> 示例值：1aaxxd
     */
    @SerializedName("member_id")
    private String memberId;
    /**
     * 考勤开始时间
     * <p> 示例值：2021-01-09
     */
    @SerializedName("start_time")
    private String startTime;
    /**
     * 考勤结束时间
     * <p> 示例值：2021-01-09
     */
    @SerializedName("end_time")
    private String endTime;
    /**
     * 字段结果(不超过200个)
     * <p> 示例值：
     */
    @SerializedName("field_datas")
    private ArchiveFieldData[] fieldDatas;

    // builder 开始
    public ArchiveReportData() {
    }

    public ArchiveReportData(Builder builder) {
        /**
         * 用户ID
         * <p> 示例值：1aaxxd
         */
        this.memberId = builder.memberId;
        /**
         * 考勤开始时间
         * <p> 示例值：2021-01-09
         */
        this.startTime = builder.startTime;
        /**
         * 考勤结束时间
         * <p> 示例值：2021-01-09
         */
        this.endTime = builder.endTime;
        /**
         * 字段结果(不超过200个)
         * <p> 示例值：
         */
        this.fieldDatas = builder.fieldDatas;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getMemberId() {
        return this.memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ArchiveFieldData[] getFieldDatas() {
        return this.fieldDatas;
    }

    public void setFieldDatas(ArchiveFieldData[] fieldDatas) {
        this.fieldDatas = fieldDatas;
    }

    public static class Builder {
        /**
         * 用户ID
         * <p> 示例值：1aaxxd
         */
        private String memberId;
        /**
         * 考勤开始时间
         * <p> 示例值：2021-01-09
         */
        private String startTime;
        /**
         * 考勤结束时间
         * <p> 示例值：2021-01-09
         */
        private String endTime;
        /**
         * 字段结果(不超过200个)
         * <p> 示例值：
         */
        private ArchiveFieldData[] fieldDatas;

        /**
         * 用户ID
         * <p> 示例值：1aaxxd
         *
         * @param memberId
         * @return
         */
        public Builder memberId(String memberId) {
            this.memberId = memberId;
            return this;
        }


        /**
         * 考勤开始时间
         * <p> 示例值：2021-01-09
         *
         * @param startTime
         * @return
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }


        /**
         * 考勤结束时间
         * <p> 示例值：2021-01-09
         *
         * @param endTime
         * @return
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }


        /**
         * 字段结果(不超过200个)
         * <p> 示例值：
         *
         * @param fieldDatas
         * @return
         */
        public Builder fieldDatas(ArchiveFieldData[] fieldDatas) {
            this.fieldDatas = fieldDatas;
            return this;
        }


        public ArchiveReportData build() {
            return new ArchiveReportData(this);
        }
    }
}
