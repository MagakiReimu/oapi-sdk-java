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

package com.lark.oapi.service.security_and_compliance.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.security_and_compliance.v1.enums.*;
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

public class OpenapiLogDetail {
    /**
     * http请求路径
     * <p> 示例值：/open-apis/demo/v1/example
     */
    @SerializedName("path")
    private String path;
    /**
     * http请求方法
     * <p> 示例值：POST
     */
    @SerializedName("method")
    private String method;
    /**
     * http查询参数
     * <p> 示例值：{}
     */
    @SerializedName("query_param")
    private String queryParam;
    /**
     * http请求体
     * <p> 示例值：{\"param1\": \"val1\", \"param2\": \"val2\"}
     */
    @SerializedName("payload")
    private String payload;
    /**
     * http状态码
     * <p> 示例值：0
     */
    @SerializedName("status_code")
    private Integer statusCode;
    /**
     * http响应体，仅返回code，msg，error信息等
     * <p> 示例值：{\"code\": 0, \"msg\": \"ok\"}
     */
    @SerializedName("response")
    private String response;

    // builder 开始
    public OpenapiLogDetail() {
    }

    public OpenapiLogDetail(Builder builder) {
        /**
         * http请求路径
         * <p> 示例值：/open-apis/demo/v1/example
         */
        this.path = builder.path;
        /**
         * http请求方法
         * <p> 示例值：POST
         */
        this.method = builder.method;
        /**
         * http查询参数
         * <p> 示例值：{}
         */
        this.queryParam = builder.queryParam;
        /**
         * http请求体
         * <p> 示例值：{\"param1\": \"val1\", \"param2\": \"val2\"}
         */
        this.payload = builder.payload;
        /**
         * http状态码
         * <p> 示例值：0
         */
        this.statusCode = builder.statusCode;
        /**
         * http响应体，仅返回code，msg，error信息等
         * <p> 示例值：{\"code\": 0, \"msg\": \"ok\"}
         */
        this.response = builder.response;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getMethod() {
        return this.method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getQueryParam() {
        return this.queryParam;
    }

    public void setQueryParam(String queryParam) {
        this.queryParam = queryParam;
    }

    public String getPayload() {
        return this.payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public Integer getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getResponse() {
        return this.response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public static class Builder {
        /**
         * http请求路径
         * <p> 示例值：/open-apis/demo/v1/example
         */
        private String path;
        /**
         * http请求方法
         * <p> 示例值：POST
         */
        private String method;
        /**
         * http查询参数
         * <p> 示例值：{}
         */
        private String queryParam;
        /**
         * http请求体
         * <p> 示例值：{\"param1\": \"val1\", \"param2\": \"val2\"}
         */
        private String payload;
        /**
         * http状态码
         * <p> 示例值：0
         */
        private Integer statusCode;
        /**
         * http响应体，仅返回code，msg，error信息等
         * <p> 示例值：{\"code\": 0, \"msg\": \"ok\"}
         */
        private String response;

        /**
         * http请求路径
         * <p> 示例值：/open-apis/demo/v1/example
         *
         * @param path
         * @return
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }


        /**
         * http请求方法
         * <p> 示例值：POST
         *
         * @param method
         * @return
         */
        public Builder method(String method) {
            this.method = method;
            return this;
        }


        /**
         * http查询参数
         * <p> 示例值：{}
         *
         * @param queryParam
         * @return
         */
        public Builder queryParam(String queryParam) {
            this.queryParam = queryParam;
            return this;
        }


        /**
         * http请求体
         * <p> 示例值：{\"param1\": \"val1\", \"param2\": \"val2\"}
         *
         * @param payload
         * @return
         */
        public Builder payload(String payload) {
            this.payload = payload;
            return this;
        }


        /**
         * http状态码
         * <p> 示例值：0
         *
         * @param statusCode
         * @return
         */
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }


        /**
         * http响应体，仅返回code，msg，error信息等
         * <p> 示例值：{\"code\": 0, \"msg\": \"ok\"}
         *
         * @param response
         * @return
         */
        public Builder response(String response) {
            this.response = response;
            return this;
        }


        public OpenapiLogDetail build() {
            return new OpenapiLogDetail(this);
        }
    }
}
