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

package com.lark.oapi.service.bitable.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.bitable.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class ListAppWorkflowReq {
    /**
     * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该page_token 获取查询结果
     * <p> 示例值：
     */
    @Query
    @SerializedName("page_token")
    private String pageToken;
    /**
     * 分页大小
     * <p> 示例值：
     */
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    /**
     * bitable app token
     * <p> 示例值：appbcbWCzen6D8dezhoCH2RpMAh
     */
    @Path
    @SerializedName("app_token")
    private String appToken;

    // builder 开始
    public ListAppWorkflowReq() {
    }

    public ListAppWorkflowReq(Builder builder) {
        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该page_token 获取查询结果
         * <p> 示例值：
         */
        this.pageToken = builder.pageToken;
        /**
         * 分页大小
         * <p> 示例值：
         */
        this.pageSize = builder.pageSize;
        /**
         * bitable app token
         * <p> 示例值：appbcbWCzen6D8dezhoCH2RpMAh
         */
        this.appToken = builder.appToken;
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

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getAppToken() {
        return this.appToken;
    }

    public void setAppToken(String appToken) {
        this.appToken = appToken;
    }

    public static class Builder {
        private String pageToken; // 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该page_token 获取查询结果
        private Integer pageSize; // 分页大小
        private String appToken; // bitable app token

        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该page_token 获取查询结果
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
         * 分页大小
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
         * bitable app token
         * <p> 示例值：appbcbWCzen6D8dezhoCH2RpMAh
         *
         * @param appToken
         * @return
         */
        public Builder appToken(String appToken) {
            this.appToken = appToken;
            return this;
        }


        public ListAppWorkflowReq build() {
            return new ListAppWorkflowReq(this);
        }
    }
}
