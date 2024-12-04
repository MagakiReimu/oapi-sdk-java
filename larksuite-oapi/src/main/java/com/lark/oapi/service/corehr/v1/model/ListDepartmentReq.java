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

public class ListDepartmentReq {
    /**
     * 页码标识，获取第一页传空，每次查询会返回下一页的page_token
     * <p> 示例值："6966234786251671053"
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
     * 部门ID列表
     * <p> 示例值：["6966234786251671053"]
     */
    @Query
    @SerializedName("department_id_list")
    private String[] departmentIdList;
    /**
     * 部门名称列表，需精确匹配
     * <p> 示例值：["校验部门"]
     */
    @Query
    @SerializedName("name_list")
    private String[] nameList;
    /**
     * 用户 ID 类型
     * <p> 示例值：people_corehr_id
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 此次调用中使用的部门 ID 类型
     * <p> 示例值：people_corehr_department_id
     */
    @Query
    @SerializedName("department_id_type")
    private String departmentIdType;

    // builder 开始
    public ListDepartmentReq() {
    }

    public ListDepartmentReq(Builder builder) {
        /**
         * 页码标识，获取第一页传空，每次查询会返回下一页的page_token
         * <p> 示例值："6966234786251671053"
         */
        this.pageToken = builder.pageToken;
        /**
         * 每页获取记录数量，最大100
         * <p> 示例值：100
         */
        this.pageSize = builder.pageSize;
        /**
         * 部门ID列表
         * <p> 示例值：["6966234786251671053"]
         */
        this.departmentIdList = builder.departmentIdList;
        /**
         * 部门名称列表，需精确匹配
         * <p> 示例值：["校验部门"]
         */
        this.nameList = builder.nameList;
        /**
         * 用户 ID 类型
         * <p> 示例值：people_corehr_id
         */
        this.userIdType = builder.userIdType;
        /**
         * 此次调用中使用的部门 ID 类型
         * <p> 示例值：people_corehr_department_id
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

    public String[] getDepartmentIdList() {
        return this.departmentIdList;
    }

    public void setDepartmentIdList(String[] departmentIdList) {
        this.departmentIdList = departmentIdList;
    }

    public String[] getNameList() {
        return this.nameList;
    }

    public void setNameList(String[] nameList) {
        this.nameList = nameList;
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
        private String[] departmentIdList; // 部门ID列表
        private String[] nameList; // 部门名称列表，需精确匹配
        private String userIdType; // 用户 ID 类型
        private String departmentIdType; // 此次调用中使用的部门 ID 类型

        /**
         * 页码标识，获取第一页传空，每次查询会返回下一页的page_token
         * <p> 示例值："6966234786251671053"
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
         * 部门ID列表
         * <p> 示例值：["6966234786251671053"]
         *
         * @param departmentIdList
         * @return
         */
        public Builder departmentIdList(String[] departmentIdList) {
            this.departmentIdList = departmentIdList;
            return this;
        }


        /**
         * 部门名称列表，需精确匹配
         * <p> 示例值：["校验部门"]
         *
         * @param nameList
         * @return
         */
        public Builder nameList(String[] nameList) {
            this.nameList = nameList;
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
         * @param userIdType {@link com.lark.oapi.service.corehr.v1.enums.ListDepartmentUserIdTypeEnum}
         * @return
         */
        public Builder userIdType(com.lark.oapi.service.corehr.v1.enums.ListDepartmentUserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
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
         * @param departmentIdType {@link com.lark.oapi.service.corehr.v1.enums.ListDepartmentDepartmentIdTypeEnum}
         * @return
         */
        public Builder departmentIdType(com.lark.oapi.service.corehr.v1.enums.ListDepartmentDepartmentIdTypeEnum departmentIdType) {
            this.departmentIdType = departmentIdType.getValue();
            return this;
        }


        public ListDepartmentReq build() {
            return new ListDepartmentReq(this);
        }
    }
}
