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
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class GetMinutesReq {
    /**
     * 面试ID
     * <p> 示例值：
     */
    @Query
    @SerializedName("interview_id")
    private String interviewId;
    /**
     * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该page_token获取查询结果
     * <p> 示例值：
     */
    @Query
    @SerializedName("page_token")
    private String pageToken;
    /**
     * 分页大小，表示本次请求获取的速记中的语句的最大数量
     * <p> 示例值：
     */
    @Query
    @SerializedName("page_size")
    private Integer pageSize;

    // builder 开始
    public GetMinutesReq() {
    }

    public GetMinutesReq(Builder builder) {
        /**
         * 面试ID
         * <p> 示例值：
         */
        this.interviewId = builder.interviewId;
        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该page_token获取查询结果
         * <p> 示例值：
         */
        this.pageToken = builder.pageToken;
        /**
         * 分页大小，表示本次请求获取的速记中的语句的最大数量
         * <p> 示例值：
         */
        this.pageSize = builder.pageSize;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getInterviewId() {
        return this.interviewId;
    }

    public void setInterviewId(String interviewId) {
        this.interviewId = interviewId;
    }

    public String getPageToken() {
        return this.pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public static class Builder {
        private String interviewId; // 面试ID
        private String pageToken; // 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该page_token获取查询结果
        private Integer pageSize; // 分页大小，表示本次请求获取的速记中的语句的最大数量


        /**
         * 面试ID
         * <p> 示例值：
         *
         * @param interviewId
         * @return
         */
        public Builder interviewId(String interviewId) {
            this.interviewId = interviewId;
            return this;
        }


        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该page_token获取查询结果
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
         * 分页大小，表示本次请求获取的速记中的语句的最大数量
         * <p> 示例值：
         *
         * @param pageSize
         * @return
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public GetMinutesReq build() {
            return new GetMinutesReq(this);
        }
    }
}
