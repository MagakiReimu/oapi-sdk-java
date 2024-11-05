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

package com.lark.oapi.service.aily.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.aily.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class ListAppSkillReq {
    /**
     * 页面大小
     * <p> 示例值：
     */
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    /**
     * 分页偏移量
     * <p> 示例值：
     */
    @Query
    @SerializedName("page_token")
    private String pageToken;
    /**
     * 应用 ID
     * <p> 示例值：spring_xxx__c
     */
    @Path
    @SerializedName("app_id")
    private String appId;

    // builder 开始
    public ListAppSkillReq() {
    }

    public ListAppSkillReq(Builder builder) {
        /**
         * 页面大小
         * <p> 示例值：
         */
        this.pageSize = builder.pageSize;
        /**
         * 分页偏移量
         * <p> 示例值：
         */
        this.pageToken = builder.pageToken;
        /**
         * 应用 ID
         * <p> 示例值：spring_xxx__c
         */
        this.appId = builder.appId;
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

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public static class Builder {
        private Integer pageSize; // 页面大小
        private String pageToken; // 分页偏移量
        private String appId; // 应用 ID

        /**
         * 页面大小
         * <p> 示例值：
         *
         * @param pageSize
         * @return
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 分页偏移量
         * <p> 示例值：
         *
         * @param pageToken
         * @return
         */
        public Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }

        /**
         * 应用 ID
         * <p> 示例值：spring_xxx__c
         *
         * @param appId
         * @return
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        public ListAppSkillReq build() {
            return new ListAppSkillReq(this);
        }
    }
}
