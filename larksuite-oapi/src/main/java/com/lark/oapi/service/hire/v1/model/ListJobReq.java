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

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Query;

public class ListJobReq {
    /**
     * 最早更新时间，毫秒级时间戳
     * <p> 示例值：1618500278663
     */
    @Query
    @SerializedName("update_start_time")
    private String updateStartTime;
    /**
     * 最晚更新时间，毫秒级时间戳
     * <p> 示例值：1618500278663
     */
    @Query
    @SerializedName("update_end_time")
    private String updateEndTime;
    /**
     * 分页大小, 不能超过 20
     * <p> 示例值：10
     */
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    /**
     * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
     * <p> 示例值：eyJvZmZzZXQiOjEwLCJ0aW1lc3RhbXAiOjE2Mjc1NTUyMjM2NzIsImlkIjpudWxsfQ==
     */
    @Query
    @SerializedName("page_token")
    private String pageToken;
    /**
     * 用户 ID 类型
     * <p> 示例值：open_id
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 此次调用中使用的部门 ID 的类型
     * <p> 示例值：
     */
    @Query
    @SerializedName("department_id_type")
    private String departmentIdType;
    /**
     * 此次调用中使用的「职级 ID」的类型
     * <p> 示例值：
     */
    @Query
    @SerializedName("job_level_id_type")
    private String jobLevelIdType;
    /**
     * 此次调用中使用的「序列 ID」的类型
     * <p> 示例值：
     */
    @Query
    @SerializedName("job_family_id_type")
    private String jobFamilyIdType;

    // builder 开始
    public ListJobReq() {
    }

    public ListJobReq(Builder builder) {
        /**
         * 最早更新时间，毫秒级时间戳
         * <p> 示例值：1618500278663
         */
        this.updateStartTime = builder.updateStartTime;
        /**
         * 最晚更新时间，毫秒级时间戳
         * <p> 示例值：1618500278663
         */
        this.updateEndTime = builder.updateEndTime;
        /**
         * 分页大小, 不能超过 20
         * <p> 示例值：10
         */
        this.pageSize = builder.pageSize;
        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
         * <p> 示例值：eyJvZmZzZXQiOjEwLCJ0aW1lc3RhbXAiOjE2Mjc1NTUyMjM2NzIsImlkIjpudWxsfQ==
         */
        this.pageToken = builder.pageToken;
        /**
         * 用户 ID 类型
         * <p> 示例值：open_id
         */
        this.userIdType = builder.userIdType;
        /**
         * 此次调用中使用的部门 ID 的类型
         * <p> 示例值：
         */
        this.departmentIdType = builder.departmentIdType;
        /**
         * 此次调用中使用的「职级 ID」的类型
         * <p> 示例值：
         */
        this.jobLevelIdType = builder.jobLevelIdType;
        /**
         * 此次调用中使用的「序列 ID」的类型
         * <p> 示例值：
         */
        this.jobFamilyIdType = builder.jobFamilyIdType;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUpdateStartTime() {
        return this.updateStartTime;
    }

    public void setUpdateStartTime(String updateStartTime) {
        this.updateStartTime = updateStartTime;
    }

    public String getUpdateEndTime() {
        return this.updateEndTime;
    }

    public void setUpdateEndTime(String updateEndTime) {
        this.updateEndTime = updateEndTime;
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

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public String getDepartmentIdType() {
        return this.departmentIdType;
    }

    public void setDepartmentIdType(String departmentIdType) {
        this.departmentIdType = departmentIdType;
    }

    public String getJobLevelIdType() {
        return this.jobLevelIdType;
    }

    public void setJobLevelIdType(String jobLevelIdType) {
        this.jobLevelIdType = jobLevelIdType;
    }

    public String getJobFamilyIdType() {
        return this.jobFamilyIdType;
    }

    public void setJobFamilyIdType(String jobFamilyIdType) {
        this.jobFamilyIdType = jobFamilyIdType;
    }

    public static class Builder {
        private String updateStartTime; // 最早更新时间，毫秒级时间戳
        private String updateEndTime; // 最晚更新时间，毫秒级时间戳
        private Integer pageSize; // 分页大小, 不能超过 20
        private String pageToken; // 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
        private String userIdType; // 用户 ID 类型
        private String departmentIdType; // 此次调用中使用的部门 ID 的类型
        private String jobLevelIdType; // 此次调用中使用的「职级 ID」的类型
        private String jobFamilyIdType; // 此次调用中使用的「序列 ID」的类型


        /**
         * 最早更新时间，毫秒级时间戳
         * <p> 示例值：1618500278663
         *
         * @param updateStartTime
         * @return
         */
        public Builder updateStartTime(String updateStartTime) {
            this.updateStartTime = updateStartTime;
            return this;
        }


        /**
         * 最晚更新时间，毫秒级时间戳
         * <p> 示例值：1618500278663
         *
         * @param updateEndTime
         * @return
         */
        public Builder updateEndTime(String updateEndTime) {
            this.updateEndTime = updateEndTime;
            return this;
        }


        /**
         * 分页大小, 不能超过 20
         * <p> 示例值：10
         *
         * @param pageSize
         * @return
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }


        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
         * <p> 示例值：eyJvZmZzZXQiOjEwLCJ0aW1lc3RhbXAiOjE2Mjc1NTUyMjM2NzIsImlkIjpudWxsfQ==
         *
         * @param pageToken
         * @return
         */
        public Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }


        /**
         * 用户 ID 类型
         * <p> 示例值：open_id
         *
         * @param userIdType
         * @return
         */
        public Builder userIdType(String userIdType) {
            this.userIdType = userIdType;
            return this;
        }


        /**
         * 此次调用中使用的部门 ID 的类型
         * <p> 示例值：
         *
         * @param departmentIdType
         * @return
         */
        public Builder departmentIdType(String departmentIdType) {
            this.departmentIdType = departmentIdType;
            return this;
        }


        /**
         * 此次调用中使用的「职级 ID」的类型
         * <p> 示例值：
         *
         * @param jobLevelIdType
         * @return
         */
        public Builder jobLevelIdType(String jobLevelIdType) {
            this.jobLevelIdType = jobLevelIdType;
            return this;
        }


        /**
         * 此次调用中使用的「序列 ID」的类型
         * <p> 示例值：
         *
         * @param jobFamilyIdType
         * @return
         */
        public Builder jobFamilyIdType(String jobFamilyIdType) {
            this.jobFamilyIdType = jobFamilyIdType;
            return this;
        }

        public ListJobReq build() {
            return new ListJobReq(this);
        }
    }
}
