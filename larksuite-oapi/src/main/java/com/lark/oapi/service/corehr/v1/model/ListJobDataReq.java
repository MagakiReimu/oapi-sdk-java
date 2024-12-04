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

package com.lark.oapi.service.corehr.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.corehr.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class ListJobDataReq {
    /**
     * 页码标识，获取第一页传空，每次查询会返回下一页的page_token
     * <p> 示例值：6994718879515739656
     */
    @Query
    @SerializedName("page_token")
    private String pageToken;
    /**
     * 每页获取记录数量，最大100
     * <p> 示例值：100
     */
    @Query
    @SerializedName("page_size")
    private String pageSize;
    /**
     * 雇佣 ID
     * <p> 示例值：7072306364927985196
     */
    @Query
    @SerializedName("employment_id")
    private String employmentId;
    /**
     * 任职信息 ID 列表，最大 100 个（不传则默认查询全部任职信息）
     * <p> 示例值：["6919733291281024526", "6919733291281024527"]
     */
    @Query
    @SerializedName("job_data_id_list")
    private String[] jobDataIdList;
    /**
     * 部门 ID
     * <p> 示例值：6887868781834536462
     */
    @Query
    @SerializedName("department_id")
    private String departmentId;
    /**
     * 职务 ID
     * <p> 示例值：6893014062142064135
     */
    @Query
    @SerializedName("job_id")
    private String jobId;
    /**
     * 是否获取所有任职记录，true 为获取员工所有版本的任职记录，false 为仅获取当前生效的任职记录，默认为 false
     * <p> 示例值：false
     */
    @Query
    @SerializedName("get_all_version")
    private Boolean getAllVersion;
    /**
     * 用户 ID 类型
     * <p> 示例值：people_corehr_id
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 此次调用中使用的部门 ID 类型
     * <p> 示例值：open_department_id
     */
    @Query
    @SerializedName("department_id_type")
    private String departmentIdType;

    // builder 开始
    public ListJobDataReq() {
    }

    public ListJobDataReq(Builder builder) {
        /**
         * 页码标识，获取第一页传空，每次查询会返回下一页的page_token
         * <p> 示例值：6994718879515739656
         */
        this.pageToken = builder.pageToken;
        /**
         * 每页获取记录数量，最大100
         * <p> 示例值：100
         */
        this.pageSize = builder.pageSize;
        /**
         * 雇佣 ID
         * <p> 示例值：7072306364927985196
         */
        this.employmentId = builder.employmentId;
        /**
         * 任职信息 ID 列表，最大 100 个（不传则默认查询全部任职信息）
         * <p> 示例值：["6919733291281024526", "6919733291281024527"]
         */
        this.jobDataIdList = builder.jobDataIdList;
        /**
         * 部门 ID
         * <p> 示例值：6887868781834536462
         */
        this.departmentId = builder.departmentId;
        /**
         * 职务 ID
         * <p> 示例值：6893014062142064135
         */
        this.jobId = builder.jobId;
        /**
         * 是否获取所有任职记录，true 为获取员工所有版本的任职记录，false 为仅获取当前生效的任职记录，默认为 false
         * <p> 示例值：false
         */
        this.getAllVersion = builder.getAllVersion;
        /**
         * 用户 ID 类型
         * <p> 示例值：people_corehr_id
         */
        this.userIdType = builder.userIdType;
        /**
         * 此次调用中使用的部门 ID 类型
         * <p> 示例值：open_department_id
         */
        this.departmentIdType = builder.departmentIdType;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getPageToken() {
        return this.pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    public String getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getEmploymentId() {
        return this.employmentId;
    }

    public void setEmploymentId(String employmentId) {
        this.employmentId = employmentId;
    }

    public String[] getJobDataIdList() {
        return this.jobDataIdList;
    }

    public void setJobDataIdList(String[] jobDataIdList) {
        this.jobDataIdList = jobDataIdList;
    }

    public String getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getJobId() {
        return this.jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Boolean getGetAllVersion() {
        return this.getAllVersion;
    }

    public void setGetAllVersion(Boolean getAllVersion) {
        this.getAllVersion = getAllVersion;
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

    public static class Builder {
        private String pageToken; // 页码标识，获取第一页传空，每次查询会返回下一页的page_token
        private String pageSize; // 每页获取记录数量，最大100
        private String employmentId; // 雇佣 ID
        private String[] jobDataIdList; // 任职信息 ID 列表，最大 100 个（不传则默认查询全部任职信息）
        private String departmentId; // 部门 ID
        private String jobId; // 职务 ID
        private Boolean getAllVersion; // 是否获取所有任职记录，true 为获取员工所有版本的任职记录，false 为仅获取当前生效的任职记录，默认为 false
        private String userIdType; // 用户 ID 类型
        private String departmentIdType; // 此次调用中使用的部门 ID 类型

        /**
         * 页码标识，获取第一页传空，每次查询会返回下一页的page_token
         * <p> 示例值：6994718879515739656
         *
         * @param pageToken
         * @return
         */
        public Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }


        /**
         * 每页获取记录数量，最大100
         * <p> 示例值：100
         *
         * @param pageSize
         * @return
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }


        /**
         * 雇佣 ID
         * <p> 示例值：7072306364927985196
         *
         * @param employmentId
         * @return
         */
        public Builder employmentId(String employmentId) {
            this.employmentId = employmentId;
            return this;
        }


        /**
         * 任职信息 ID 列表，最大 100 个（不传则默认查询全部任职信息）
         * <p> 示例值：["6919733291281024526", "6919733291281024527"]
         *
         * @param jobDataIdList
         * @return
         */
        public Builder jobDataIdList(String[] jobDataIdList) {
            this.jobDataIdList = jobDataIdList;
            return this;
        }


        /**
         * 部门 ID
         * <p> 示例值：6887868781834536462
         *
         * @param departmentId
         * @return
         */
        public Builder departmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }


        /**
         * 职务 ID
         * <p> 示例值：6893014062142064135
         *
         * @param jobId
         * @return
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }


        /**
         * 是否获取所有任职记录，true 为获取员工所有版本的任职记录，false 为仅获取当前生效的任职记录，默认为 false
         * <p> 示例值：false
         *
         * @param getAllVersion
         * @return
         */
        public Builder getAllVersion(Boolean getAllVersion) {
            this.getAllVersion = getAllVersion;
            return this;
        }


        /**
         * 用户 ID 类型
         * <p> 示例值：people_corehr_id
         *
         * @param userIdType
         * @return
         */
        public Builder userIdType(String userIdType) {
            this.userIdType = userIdType;
            return this;
        }

        /**
         * 用户 ID 类型
         * <p> 示例值：people_corehr_id
         *
         * @param userIdType {@link com.lark.oapi.service.corehr.v1.enums.ListJobDataUserIdTypeEnum}
         * @return
         */
        public Builder userIdType(com.lark.oapi.service.corehr.v1.enums.ListJobDataUserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }


        /**
         * 此次调用中使用的部门 ID 类型
         * <p> 示例值：open_department_id
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
         * <p> 示例值：open_department_id
         *
         * @param departmentIdType {@link com.lark.oapi.service.corehr.v1.enums.ListJobDataDepartmentIdTypeEnum}
         * @return
         */
        public Builder departmentIdType(com.lark.oapi.service.corehr.v1.enums.ListJobDataDepartmentIdTypeEnum departmentIdType) {
            this.departmentIdType = departmentIdType.getValue();
            return this;
        }


        public ListJobDataReq build() {
            return new ListJobDataReq(this);
        }
    }
}
