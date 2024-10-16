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

public class ListPreHireReq {
    /**
     * 页码标识，获取第一页传空，每次查询会返回下一页的page_token
     * <p> 示例值：1231231987
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
     * 待入职ID列表
     * <p> 示例值：
     */
    @Query
    @SerializedName("pre_hire_ids")
    private String[] preHireIds;

    // builder 开始
    public ListPreHireReq() {
    }

    public ListPreHireReq(Builder builder) {
        /**
         * 页码标识，获取第一页传空，每次查询会返回下一页的page_token
         * <p> 示例值：1231231987
         */
        this.pageToken = builder.pageToken;
        /**
         * 每页获取记录数量，最大100
         * <p> 示例值：100
         */
        this.pageSize = builder.pageSize;
        /**
         * 待入职ID列表
         * <p> 示例值：
         */
        this.preHireIds = builder.preHireIds;
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

    public String[] getPreHireIds() {
        return this.preHireIds;
    }

    public void setPreHireIds(String[] preHireIds) {
        this.preHireIds = preHireIds;
    }

    public static class Builder {
        private String pageToken; // 页码标识，获取第一页传空，每次查询会返回下一页的page_token
        private String pageSize; // 每页获取记录数量，最大100
        private String[] preHireIds; // 待入职ID列表


        /**
         * 页码标识，获取第一页传空，每次查询会返回下一页的page_token
         * <p> 示例值：1231231987
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
         * 待入职ID列表
         * <p> 示例值：
         *
         * @param preHireIds
         * @return
         */
        public Builder preHireIds(String[] preHireIds) {
            this.preHireIds = preHireIds;
            return this;
        }

        public ListPreHireReq build() {
            return new ListPreHireReq(this);
        }
    }
}
