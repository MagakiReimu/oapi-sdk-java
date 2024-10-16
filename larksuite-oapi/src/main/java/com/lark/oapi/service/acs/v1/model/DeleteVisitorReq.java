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

package com.lark.oapi.service.acs.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.acs.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class DeleteVisitorReq {
    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 访客id
     * <p> 示例值：6939433228970082566
     */
    @Path
    @SerializedName("visitor_id")
    private String visitorId;

    // builder 开始
    public DeleteVisitorReq() {
    }

    public DeleteVisitorReq(Builder builder) {
        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         */
        this.userIdType = builder.userIdType;
        /**
         * 访客id
         * <p> 示例值：6939433228970082566
         */
        this.visitorId = builder.visitorId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public String getVisitorId() {
        return this.visitorId;
    }

    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }

    public static class Builder {
        private String userIdType; // 此次调用中使用的用户ID的类型
        private String visitorId; // 访客id

        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         *
         * @param userIdType
         * @return
         */
        public Builder userIdType(String userIdType) {
            this.userIdType = userIdType;
            return this;
        }

        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         *
         * @param userIdType {@link com.lark.oapi.service.acs.v1.enums.DeleteVisitorUserIdTypeEnum}
         * @return
         */
        public Builder userIdType(com.lark.oapi.service.acs.v1.enums.DeleteVisitorUserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }

        /**
         * 访客id
         * <p> 示例值：6939433228970082566
         *
         * @param visitorId
         * @return
         */
        public Builder visitorId(String visitorId) {
            this.visitorId = visitorId;
            return this;
        }

        public DeleteVisitorReq build() {
            return new DeleteVisitorReq(this);
        }
    }
}
