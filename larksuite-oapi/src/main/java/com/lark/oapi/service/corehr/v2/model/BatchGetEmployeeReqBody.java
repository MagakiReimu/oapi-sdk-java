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

public class BatchGetEmployeeReqBody {
    /**
     * 返回数据的字段列表，填写方式：为空时默认仅返回 ID
     * <p> 示例值：
     */
    @SerializedName("fields")
    private String[] fields;
    /**
     * 雇佣 ID 列表
     * <p> 示例值：
     */
    @SerializedName("employment_ids")
    private String[] employmentIds;
    /**
     * 个人信息 ID 列表，employment_ids参数有值时该参数不生效
     * <p> 示例值：
     */
    @SerializedName("person_ids")
    private String[] personIds;
    /**
     * 主工作邮箱列表
     * <p> 示例值：
     */
    @SerializedName("work_emails")
    private String[] workEmails;
    /**
     * username列表
     * <p> 示例值：
     */
    @SerializedName("user_names")
    private String[] userNames;

    // builder 开始
    public BatchGetEmployeeReqBody() {
    }

    public BatchGetEmployeeReqBody(Builder builder) {
        /**
         * 返回数据的字段列表，填写方式：为空时默认仅返回 ID
         * <p> 示例值：
         */
        this.fields = builder.fields;
        /**
         * 雇佣 ID 列表
         * <p> 示例值：
         */
        this.employmentIds = builder.employmentIds;
        /**
         * 个人信息 ID 列表，employment_ids参数有值时该参数不生效
         * <p> 示例值：
         */
        this.personIds = builder.personIds;
        /**
         * 主工作邮箱列表
         * <p> 示例值：
         */
        this.workEmails = builder.workEmails;
        /**
         * username列表
         * <p> 示例值：
         */
        this.userNames = builder.userNames;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String[] getFields() {
        return this.fields;
    }

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    public String[] getEmploymentIds() {
        return this.employmentIds;
    }

    public void setEmploymentIds(String[] employmentIds) {
        this.employmentIds = employmentIds;
    }

    public String[] getPersonIds() {
        return this.personIds;
    }

    public void setPersonIds(String[] personIds) {
        this.personIds = personIds;
    }

    public String[] getWorkEmails() {
        return this.workEmails;
    }

    public void setWorkEmails(String[] workEmails) {
        this.workEmails = workEmails;
    }

    public String[] getUserNames() {
        return this.userNames;
    }

    public void setUserNames(String[] userNames) {
        this.userNames = userNames;
    }

    public static class Builder {
        /**
         * 返回数据的字段列表，填写方式：为空时默认仅返回 ID
         * <p> 示例值：
         */
        private String[] fields;
        /**
         * 雇佣 ID 列表
         * <p> 示例值：
         */
        private String[] employmentIds;
        /**
         * 个人信息 ID 列表，employment_ids参数有值时该参数不生效
         * <p> 示例值：
         */
        private String[] personIds;
        /**
         * 主工作邮箱列表
         * <p> 示例值：
         */
        private String[] workEmails;
        /**
         * username列表
         * <p> 示例值：
         */
        private String[] userNames;

        /**
         * 返回数据的字段列表，填写方式：为空时默认仅返回 ID
         * <p> 示例值：
         *
         * @param fields
         * @return
         */
        public Builder fields(String[] fields) {
            this.fields = fields;
            return this;
        }


        /**
         * 雇佣 ID 列表
         * <p> 示例值：
         *
         * @param employmentIds
         * @return
         */
        public Builder employmentIds(String[] employmentIds) {
            this.employmentIds = employmentIds;
            return this;
        }


        /**
         * 个人信息 ID 列表，employment_ids参数有值时该参数不生效
         * <p> 示例值：
         *
         * @param personIds
         * @return
         */
        public Builder personIds(String[] personIds) {
            this.personIds = personIds;
            return this;
        }


        /**
         * 主工作邮箱列表
         * <p> 示例值：
         *
         * @param workEmails
         * @return
         */
        public Builder workEmails(String[] workEmails) {
            this.workEmails = workEmails;
            return this;
        }


        /**
         * username列表
         * <p> 示例值：
         *
         * @param userNames
         * @return
         */
        public Builder userNames(String[] userNames) {
            this.userNames = userNames;
            return this;
        }


        public BatchGetEmployeeReqBody build() {
            return new BatchGetEmployeeReqBody(this);
        }
    }
}
