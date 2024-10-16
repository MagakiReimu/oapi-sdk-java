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
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class QueryTimelineDepartmentReqBody {
    /**
     * 部门 ID 列表
     * <p> 示例值：
     */
    @SerializedName("department_ids")
    private String[] departmentIds;
    /**
     * 生效日期
     * <p> 示例值：2020-01-01
     */
    @SerializedName("effective_date")
    private String effectiveDate;
    /**
     * 返回数据的字段列表，可选["department_name", "code", "active", "parent_department_id", "manager", "description", "effective_date"]
     * <p> 示例值：
     */
    @SerializedName("fields")
    private String[] fields;

    // builder 开始
    public QueryTimelineDepartmentReqBody() {
    }

    public QueryTimelineDepartmentReqBody(Builder builder) {
        /**
         * 部门 ID 列表
         * <p> 示例值：
         */
        this.departmentIds = builder.departmentIds;
        /**
         * 生效日期
         * <p> 示例值：2020-01-01
         */
        this.effectiveDate = builder.effectiveDate;
        /**
         * 返回数据的字段列表，可选["department_name", "code", "active", "parent_department_id", "manager", "description", "effective_date"]
         * <p> 示例值：
         */
        this.fields = builder.fields;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String[] getDepartmentIds() {
        return this.departmentIds;
    }

    public void setDepartmentIds(String[] departmentIds) {
        this.departmentIds = departmentIds;
    }

    public String getEffectiveDate() {
        return this.effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String[] getFields() {
        return this.fields;
    }

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    public static class Builder {
        /**
         * 部门 ID 列表
         * <p> 示例值：
         */
        private String[] departmentIds;
        /**
         * 生效日期
         * <p> 示例值：2020-01-01
         */
        private String effectiveDate;
        /**
         * 返回数据的字段列表，可选["department_name", "code", "active", "parent_department_id", "manager", "description", "effective_date"]
         * <p> 示例值：
         */
        private String[] fields;

        /**
         * 部门 ID 列表
         * <p> 示例值：
         *
         * @param departmentIds
         * @return
         */
        public Builder departmentIds(String[] departmentIds) {
            this.departmentIds = departmentIds;
            return this;
        }


        /**
         * 生效日期
         * <p> 示例值：2020-01-01
         *
         * @param effectiveDate
         * @return
         */
        public Builder effectiveDate(String effectiveDate) {
            this.effectiveDate = effectiveDate;
            return this;
        }


        /**
         * 返回数据的字段列表，可选["department_name", "code", "active", "parent_department_id", "manager", "description", "effective_date"]
         * <p> 示例值：
         *
         * @param fields
         * @return
         */
        public Builder fields(String[] fields) {
            this.fields = fields;
            return this;
        }


        public QueryTimelineDepartmentReqBody build() {
            return new QueryTimelineDepartmentReqBody(this);
        }
    }
}
