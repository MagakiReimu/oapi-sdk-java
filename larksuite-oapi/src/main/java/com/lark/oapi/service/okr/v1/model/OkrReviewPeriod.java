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

package com.lark.oapi.service.okr.v1.model;

import com.google.gson.annotations.SerializedName;

public class OkrReviewPeriod {
    /**
     * 周期ID
     * <p> 示例值：6951461264858777132
     */
    @SerializedName("period_id")
    private String periodId;
    /**
     * 复盘文档
     * <p> 示例值：
     */
    @SerializedName("cycle_review_list")
    private OkrReviewPeriodUrl[] cycleReviewList;
    /**
     * 进展报告
     * <p> 示例值：
     */
    @SerializedName("progress_report_list")
    private OkrReviewPeriodUrl[] progressReportList;

    // builder 开始
    public OkrReviewPeriod() {
    }

    public OkrReviewPeriod(Builder builder) {
        /**
         * 周期ID
         * <p> 示例值：6951461264858777132
         */
        this.periodId = builder.periodId;
        /**
         * 复盘文档
         * <p> 示例值：
         */
        this.cycleReviewList = builder.cycleReviewList;
        /**
         * 进展报告
         * <p> 示例值：
         */
        this.progressReportList = builder.progressReportList;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getPeriodId() {
        return this.periodId;
    }

    public void setPeriodId(String periodId) {
        this.periodId = periodId;
    }

    public OkrReviewPeriodUrl[] getCycleReviewList() {
        return this.cycleReviewList;
    }

    public void setCycleReviewList(OkrReviewPeriodUrl[] cycleReviewList) {
        this.cycleReviewList = cycleReviewList;
    }

    public OkrReviewPeriodUrl[] getProgressReportList() {
        return this.progressReportList;
    }

    public void setProgressReportList(OkrReviewPeriodUrl[] progressReportList) {
        this.progressReportList = progressReportList;
    }

    public static class Builder {
        /**
         * 周期ID
         * <p> 示例值：6951461264858777132
         */
        private String periodId;
        /**
         * 复盘文档
         * <p> 示例值：
         */
        private OkrReviewPeriodUrl[] cycleReviewList;
        /**
         * 进展报告
         * <p> 示例值：
         */
        private OkrReviewPeriodUrl[] progressReportList;

        /**
         * 周期ID
         * <p> 示例值：6951461264858777132
         *
         * @param periodId
         * @return
         */
        public Builder periodId(String periodId) {
            this.periodId = periodId;
            return this;
        }


        /**
         * 复盘文档
         * <p> 示例值：
         *
         * @param cycleReviewList
         * @return
         */
        public Builder cycleReviewList(OkrReviewPeriodUrl[] cycleReviewList) {
            this.cycleReviewList = cycleReviewList;
            return this;
        }


        /**
         * 进展报告
         * <p> 示例值：
         *
         * @param progressReportList
         * @return
         */
        public Builder progressReportList(OkrReviewPeriodUrl[] progressReportList) {
            this.progressReportList = progressReportList;
            return this;
        }


        public OkrReviewPeriod build() {
            return new OkrReviewPeriod(this);
        }
    }
}
