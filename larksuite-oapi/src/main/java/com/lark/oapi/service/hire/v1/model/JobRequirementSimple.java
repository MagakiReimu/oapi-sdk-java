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

import com.lark.oapi.core.response.EmptyData;
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

public class JobRequirementSimple {
    /**
     * 招聘需求 ID
     * <p> 示例值：6949805467799537964
     */
    @SerializedName("id")
    private String id;
    /**
     * 招聘需求编号
     * <p> 示例值：xx1
     */
    @SerializedName("short_code")
    private String shortCode;
    /**
     * 需求名称
     * <p> 示例值：华中大区部门
     */
    @SerializedName("name")
    private String name;
    /**
     * 需求部门 ID
     * <p> 示例值：6833685612520950030
     */
    @SerializedName("department_id")
    private String departmentId;

    // builder 开始
    public JobRequirementSimple() {
    }

    public JobRequirementSimple(Builder builder) {
        /**
         * 招聘需求 ID
         * <p> 示例值：6949805467799537964
         */
        this.id = builder.id;
        /**
         * 招聘需求编号
         * <p> 示例值：xx1
         */
        this.shortCode = builder.shortCode;
        /**
         * 需求名称
         * <p> 示例值：华中大区部门
         */
        this.name = builder.name;
        /**
         * 需求部门 ID
         * <p> 示例值：6833685612520950030
         */
        this.departmentId = builder.departmentId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShortCode() {
        return this.shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public static class Builder {
        /**
         * 招聘需求 ID
         * <p> 示例值：6949805467799537964
         */
        private String id;
        /**
         * 招聘需求编号
         * <p> 示例值：xx1
         */
        private String shortCode;
        /**
         * 需求名称
         * <p> 示例值：华中大区部门
         */
        private String name;
        /**
         * 需求部门 ID
         * <p> 示例值：6833685612520950030
         */
        private String departmentId;

        /**
         * 招聘需求 ID
         * <p> 示例值：6949805467799537964
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 招聘需求编号
         * <p> 示例值：xx1
         *
         * @param shortCode
         * @return
         */
        public Builder shortCode(String shortCode) {
            this.shortCode = shortCode;
            return this;
        }


        /**
         * 需求名称
         * <p> 示例值：华中大区部门
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 需求部门 ID
         * <p> 示例值：6833685612520950030
         *
         * @param departmentId
         * @return
         */
        public Builder departmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }


        public JobRequirementSimple build() {
            return new JobRequirementSimple(this);
        }
    }
}
