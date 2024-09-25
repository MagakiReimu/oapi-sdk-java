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

public class QueryUserTaskReqBody {
    /**
     * employee_no 或 employee_id 列表，长度不超过 50
     * <p> 示例值：abd754f7
     */
    @SerializedName("user_ids")
    private String[] userIds;
    /**
     * 查询的起始工作日
     * <p> 示例值：20190817
     */
    @SerializedName("check_date_from")
    private Integer checkDateFrom;
    /**
     * 查询的结束工作日
     * <p> 示例值：20190820
     */
    @SerializedName("check_date_to")
    private Integer checkDateTo;
    /**
     * 是否需要加班班段打卡结果
     * <p> 示例值：true
     */
    @SerializedName("need_overtime_result")
    private Boolean needOvertimeResult;

    // builder 开始
    public QueryUserTaskReqBody() {
    }

    public QueryUserTaskReqBody(Builder builder) {
        /**
         * employee_no 或 employee_id 列表，长度不超过 50
         * <p> 示例值：abd754f7
         */
        this.userIds = builder.userIds;
        /**
         * 查询的起始工作日
         * <p> 示例值：20190817
         */
        this.checkDateFrom = builder.checkDateFrom;
        /**
         * 查询的结束工作日
         * <p> 示例值：20190820
         */
        this.checkDateTo = builder.checkDateTo;
        /**
         * 是否需要加班班段打卡结果
         * <p> 示例值：true
         */
        this.needOvertimeResult = builder.needOvertimeResult;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String[] getUserIds() {
        return this.userIds;
    }

    public void setUserIds(String[] userIds) {
        this.userIds = userIds;
    }

    public Integer getCheckDateFrom() {
        return this.checkDateFrom;
    }

    public void setCheckDateFrom(Integer checkDateFrom) {
        this.checkDateFrom = checkDateFrom;
    }

    public Integer getCheckDateTo() {
        return this.checkDateTo;
    }

    public void setCheckDateTo(Integer checkDateTo) {
        this.checkDateTo = checkDateTo;
    }

    public Boolean getNeedOvertimeResult() {
        return this.needOvertimeResult;
    }

    public void setNeedOvertimeResult(Boolean needOvertimeResult) {
        this.needOvertimeResult = needOvertimeResult;
    }

    public static class Builder {
        /**
         * employee_no 或 employee_id 列表，长度不超过 50
         * <p> 示例值：abd754f7
         */
        private String[] userIds;
        /**
         * 查询的起始工作日
         * <p> 示例值：20190817
         */
        private Integer checkDateFrom;
        /**
         * 查询的结束工作日
         * <p> 示例值：20190820
         */
        private Integer checkDateTo;
        /**
         * 是否需要加班班段打卡结果
         * <p> 示例值：true
         */
        private Boolean needOvertimeResult;

        /**
         * employee_no 或 employee_id 列表，长度不超过 50
         * <p> 示例值：abd754f7
         *
         * @param userIds
         * @return
         */
        public Builder userIds(String[] userIds) {
            this.userIds = userIds;
            return this;
        }


        /**
         * 查询的起始工作日
         * <p> 示例值：20190817
         *
         * @param checkDateFrom
         * @return
         */
        public Builder checkDateFrom(Integer checkDateFrom) {
            this.checkDateFrom = checkDateFrom;
            return this;
        }


        /**
         * 查询的结束工作日
         * <p> 示例值：20190820
         *
         * @param checkDateTo
         * @return
         */
        public Builder checkDateTo(Integer checkDateTo) {
            this.checkDateTo = checkDateTo;
            return this;
        }


        /**
         * 是否需要加班班段打卡结果
         * <p> 示例值：true
         *
         * @param needOvertimeResult
         * @return
         */
        public Builder needOvertimeResult(Boolean needOvertimeResult) {
            this.needOvertimeResult = needOvertimeResult;
            return this;
        }


        public QueryUserTaskReqBody build() {
            return new QueryUserTaskReqBody(this);
        }
    }
}
