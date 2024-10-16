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

public class GetUserFaceReq {
    /**
     * 裁剪图
     * <p> 示例值：true
     */
    @Query
    @SerializedName("is_cropped")
    private Boolean isCropped;
    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 用户 ID
     * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
     */
    @Path
    @SerializedName("user_id")
    private String userId;

    // builder 开始
    public GetUserFaceReq() {
    }

    public GetUserFaceReq(Builder builder) {
        /**
         * 裁剪图
         * <p> 示例值：true
         */
        this.isCropped = builder.isCropped;
        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         */
        this.userIdType = builder.userIdType;
        /**
         * 用户 ID
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         */
        this.userId = builder.userId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Boolean getIsCropped() {
        return this.isCropped;
    }

    public void setIsCropped(Boolean isCropped) {
        this.isCropped = isCropped;
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public static class Builder {
        private Boolean isCropped; // 裁剪图
        private String userIdType; // 此次调用中使用的用户ID的类型
        private String userId; // 用户 ID

        /**
         * 裁剪图
         * <p> 示例值：true
         *
         * @param isCropped
         * @return
         */
        public Builder isCropped(Boolean isCropped) {
            this.isCropped = isCropped;
            return this;
        }

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
         * @param userIdType {@link com.lark.oapi.service.acs.v1.enums.GetUserFaceUserIdTypeEnum}
         * @return
         */
        public Builder userIdType(com.lark.oapi.service.acs.v1.enums.GetUserFaceUserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }

        /**
         * 用户 ID
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public GetUserFaceReq build() {
            return new GetUserFaceReq(this);
        }
    }
}
