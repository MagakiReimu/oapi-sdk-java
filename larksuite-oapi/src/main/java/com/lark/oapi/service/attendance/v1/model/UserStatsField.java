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

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.attendance.v1.enums.*;
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

public class UserStatsField {
    /**
     * 统计类型
     * <p> 示例值：
     */
    @SerializedName("stats_type")
    private String statsType;
    /**
     * 用户 ID
     * <p> 示例值：
     */
    @SerializedName("user_id")
    private String userId;
    /**
     * 字段列表
     * <p> 示例值：
     */
    @SerializedName("fields")
    private Field[] fields;

    // builder 开始
    public UserStatsField() {
    }

    public UserStatsField(Builder builder) {
        /**
         * 统计类型
         * <p> 示例值：
         */
        this.statsType = builder.statsType;
        /**
         * 用户 ID
         * <p> 示例值：
         */
        this.userId = builder.userId;
        /**
         * 字段列表
         * <p> 示例值：
         */
        this.fields = builder.fields;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getStatsType() {
        return this.statsType;
    }

    public void setStatsType(String statsType) {
        this.statsType = statsType;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Field[] getFields() {
        return this.fields;
    }

    public void setFields(Field[] fields) {
        this.fields = fields;
    }

    public static class Builder {
        /**
         * 统计类型
         * <p> 示例值：
         */
        private String statsType;
        /**
         * 用户 ID
         * <p> 示例值：
         */
        private String userId;
        /**
         * 字段列表
         * <p> 示例值：
         */
        private Field[] fields;

        /**
         * 统计类型
         * <p> 示例值：
         *
         * @param statsType
         * @return
         */
        public Builder statsType(String statsType) {
            this.statsType = statsType;
            return this;
        }

        /**
         * 统计类型
         * <p> 示例值：
         *
         * @param statsType {@link com.lark.oapi.service.attendance.v1.enums.UserStatsFieldStatsTypeEnum}
         * @return
         */
        public Builder statsType(com.lark.oapi.service.attendance.v1.enums.UserStatsFieldStatsTypeEnum statsType) {
            this.statsType = statsType.getValue();
            return this;
        }


        /**
         * 用户 ID
         * <p> 示例值：
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        /**
         * 字段列表
         * <p> 示例值：
         *
         * @param fields
         * @return
         */
        public Builder fields(Field[] fields) {
            this.fields = fields;
            return this;
        }


        public UserStatsField build() {
            return new UserStatsField(this);
        }
    }
}
