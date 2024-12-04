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

package com.lark.oapi.service.vc.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.vc.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class GetTopUserReportReq {
    /**
     * 开始时间（unix时间，单位sec）
     * <p> 示例值：1608888867
     */
    @Query
    @SerializedName("start_time")
    private String startTime;
    /**
     * 结束时间（unix时间，单位sec）
     * <p> 示例值：1608889966
     */
    @Query
    @SerializedName("end_time")
    private String endTime;
    /**
     * 取前多少位
     * <p> 示例值：10
     */
    @Query
    @SerializedName("limit")
    private Integer limit;
    /**
     * 排序依据（降序）
     * <p> 示例值：1
     */
    @Query
    @SerializedName("order_by")
    private Integer orderBy;
    /**
     * 数据驻留地
     * <p> 示例值：0
     */
    @Query
    @SerializedName("unit")
    private Integer unit;
    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;

    // builder 开始
    public GetTopUserReportReq() {
    }

    public GetTopUserReportReq(Builder builder) {
        /**
         * 开始时间（unix时间，单位sec）
         * <p> 示例值：1608888867
         */
        this.startTime = builder.startTime;
        /**
         * 结束时间（unix时间，单位sec）
         * <p> 示例值：1608889966
         */
        this.endTime = builder.endTime;
        /**
         * 取前多少位
         * <p> 示例值：10
         */
        this.limit = builder.limit;
        /**
         * 排序依据（降序）
         * <p> 示例值：1
         */
        this.orderBy = builder.orderBy;
        /**
         * 数据驻留地
         * <p> 示例值：0
         */
        this.unit = builder.unit;
        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         */
        this.userIdType = builder.userIdType;
    }

    public static Builder newBuilder() {
        return new Builder();
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

    public Integer getLimit() {
        return this.limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOrderBy() {
        return this.orderBy;
    }

    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }

    public Integer getUnit() {
        return this.unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public static class Builder {
        private String startTime; // 开始时间（unix时间，单位sec）
        private String endTime; // 结束时间（unix时间，单位sec）
        private Integer limit; // 取前多少位
        private Integer orderBy; // 排序依据（降序）
        private Integer unit; // 数据驻留地
        private String userIdType; // 此次调用中使用的用户ID的类型

        /**
         * 开始时间（unix时间，单位sec）
         * <p> 示例值：1608888867
         *
         * @param startTime
         * @return
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }


        /**
         * 结束时间（unix时间，单位sec）
         * <p> 示例值：1608889966
         *
         * @param endTime
         * @return
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }


        /**
         * 取前多少位
         * <p> 示例值：10
         *
         * @param limit
         * @return
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }


        /**
         * 排序依据（降序）
         * <p> 示例值：1
         *
         * @param orderBy
         * @return
         */
        public Builder orderBy(Integer orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        /**
         * 排序依据（降序）
         * <p> 示例值：1
         *
         * @param orderBy {@link com.lark.oapi.service.vc.v1.enums.GetTopUserReportTopUserOrderByEnum}
         * @return
         */
        public Builder orderBy(com.lark.oapi.service.vc.v1.enums.GetTopUserReportTopUserOrderByEnum orderBy) {
            this.orderBy = orderBy.getValue();
            return this;
        }


        /**
         * 数据驻留地
         * <p> 示例值：0
         *
         * @param unit
         * @return
         */
        public Builder unit(Integer unit) {
            this.unit = unit;
            return this;
        }

        /**
         * 数据驻留地
         * <p> 示例值：0
         *
         * @param unit {@link com.lark.oapi.service.vc.v1.enums.GetTopUserReportUnitTypeEnum}
         * @return
         */
        public Builder unit(com.lark.oapi.service.vc.v1.enums.GetTopUserReportUnitTypeEnum unit) {
            this.unit = unit.getValue();
            return this;
        }


        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         *
         * @param userIdType
         * @return
         */
        public Builder userIdType(String userIdType) {
            this.userIdType = userIdType;
            return this;
        }

        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         *
         * @param userIdType {@link com.lark.oapi.service.vc.v1.enums.GetTopUserReportUserIdTypeEnum}
         * @return
         */
        public Builder userIdType(com.lark.oapi.service.vc.v1.enums.GetTopUserReportUserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }


        public GetTopUserReportReq build() {
            return new GetTopUserReportReq(this);
        }
    }
}
