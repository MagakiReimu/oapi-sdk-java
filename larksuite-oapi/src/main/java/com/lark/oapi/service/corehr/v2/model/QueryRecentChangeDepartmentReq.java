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
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class QueryRecentChangeDepartmentReq {
    /**
     * 分页大小，最大 2000
     * <p> 示例值：100
     */
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    /**
     * 页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
     * <p> 示例值：6891251722631890445
     */
    @Query
    @SerializedName("page_token")
    private String pageToken;
    /**
     * 查询的开始时间，格式 "yyyy-MM-dd"，不带时分秒，包含 start_date 传入的时间, 系统会以 start_date 的 00:00:00 查询。
     * <p> 示例值：2024-08-01
     */
    @Query
    @SerializedName("start_date")
    private String startDate;
    /**
     * 查询的结束时间，格式 "yyyy-MM-dd"，不带时分秒， 查询日期小于 end_data + 1 天的 00:00:00。
     * <p> 示例值：2024-08-01
     */
    @Query
    @SerializedName("end_date")
    private String endDate;
    /**
     * 此次调用中使用的部门 ID 类型
     * <p> 示例值：people_corehr_department_id
     */
    @Query
    @SerializedName("department_id_type")
    private String departmentIdType;

    // builder 开始
    public QueryRecentChangeDepartmentReq() {
    }

    public QueryRecentChangeDepartmentReq(Builder builder) {
        /**
         * 分页大小，最大 2000
         * <p> 示例值：100
         */
        this.pageSize = builder.pageSize;
        /**
         * 页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
         * <p> 示例值：6891251722631890445
         */
        this.pageToken = builder.pageToken;
        /**
         * 查询的开始时间，格式 "yyyy-MM-dd"，不带时分秒，包含 start_date 传入的时间, 系统会以 start_date 的 00:00:00 查询。
         * <p> 示例值：2024-08-01
         */
        this.startDate = builder.startDate;
        /**
         * 查询的结束时间，格式 "yyyy-MM-dd"，不带时分秒， 查询日期小于 end_data + 1 天的 00:00:00。
         * <p> 示例值：2024-08-01
         */
        this.endDate = builder.endDate;
        /**
         * 此次调用中使用的部门 ID 类型
         * <p> 示例值：people_corehr_department_id
         */
        this.departmentIdType = builder.departmentIdType;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getPageToken() {
        return this.pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDepartmentIdType() {
        return this.departmentIdType;
    }

    public void setDepartmentIdType(String departmentIdType) {
        this.departmentIdType = departmentIdType;
    }

    public static class Builder {
        private Integer pageSize; // 分页大小，最大 2000
        private String pageToken; // 页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
        private String startDate; // 查询的开始时间，格式 "yyyy-MM-dd"，不带时分秒，包含 start_date 传入的时间, 系统会以 start_date 的 00:00:00 查询。
        private String endDate; // 查询的结束时间，格式 "yyyy-MM-dd"，不带时分秒， 查询日期小于 end_data + 1 天的 00:00:00。
        private String departmentIdType; // 此次调用中使用的部门 ID 类型


        /**
         * 分页大小，最大 2000
         * <p> 示例值：100
         *
         * @param pageSize
         * @return
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }


        /**
         * 页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
         * <p> 示例值：6891251722631890445
         *
         * @param pageToken
         * @return
         */
        public Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }


        /**
         * 查询的开始时间，格式 "yyyy-MM-dd"，不带时分秒，包含 start_date 传入的时间, 系统会以 start_date 的 00:00:00 查询。
         * <p> 示例值：2024-08-01
         *
         * @param startDate
         * @return
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }


        /**
         * 查询的结束时间，格式 "yyyy-MM-dd"，不带时分秒， 查询日期小于 end_data + 1 天的 00:00:00。
         * <p> 示例值：2024-08-01
         *
         * @param endDate
         * @return
         */
        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }


        /**
         * 此次调用中使用的部门 ID 类型
         * <p> 示例值：people_corehr_department_id
         *
         * @param departmentIdType
         * @return
         */
        public Builder departmentIdType(String departmentIdType) {
            this.departmentIdType = departmentIdType;
            return this;
        }

        /**
         * 此次调用中使用的部门 ID 类型
         * <p> 示例值：people_corehr_department_id
         *
         * @param departmentIdType {@link com.lark.oapi.service.corehr.v2.enums.QueryRecentChangeDepartmentDepartmentIdTypeEnum}
         * @return
         */
        public Builder departmentIdType(com.lark.oapi.service.corehr.v2.enums.QueryRecentChangeDepartmentDepartmentIdTypeEnum departmentIdType) {
            this.departmentIdType = departmentIdType.getValue();
            return this;
        }

        public QueryRecentChangeDepartmentReq build() {
            return new QueryRecentChangeDepartmentReq(this);
        }
    }
}
