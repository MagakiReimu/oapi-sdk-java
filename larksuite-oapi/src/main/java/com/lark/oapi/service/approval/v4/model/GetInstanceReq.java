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

package com.lark.oapi.service.approval.v4.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.approval.v4.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class GetInstanceReq {
    /**
     * 语言
     * <p> 示例值：zh-CN
     */
    @Query
    @SerializedName("locale")
    private String locale;
    /**
     * 发起审批用户id，仅自建应用可返回
     * <p> 示例值：f7cb567e
     */
    @Query
    @SerializedName("user_id")
    private String userId;
    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：user_id
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 审批实例 Code, 若在创建的时候传了uuid, 也可以通过传uuid获取
     * <p> 示例值：81D31358-93AF-92D6-7425-01A5D67C4E71
     */
    @Path
    @SerializedName("instance_id")
    private String instanceId;

    // builder 开始
    public GetInstanceReq() {
    }

    public GetInstanceReq(Builder builder) {
        /**
         * 语言
         * <p> 示例值：zh-CN
         */
        this.locale = builder.locale;
        /**
         * 发起审批用户id，仅自建应用可返回
         * <p> 示例值：f7cb567e
         */
        this.userId = builder.userId;
        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：user_id
         */
        this.userIdType = builder.userIdType;
        /**
         * 审批实例 Code, 若在创建的时候传了uuid, 也可以通过传uuid获取
         * <p> 示例值：81D31358-93AF-92D6-7425-01A5D67C4E71
         */
        this.instanceId = builder.instanceId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getLocale() {
        return this.locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public static class Builder {
        private String locale; // 语言
        private String userId; // 发起审批用户id，仅自建应用可返回
        private String userIdType; // 此次调用中使用的用户ID的类型
        private String instanceId; // 审批实例 Code, 若在创建的时候传了uuid, 也可以通过传uuid获取

        /**
         * 语言
         * <p> 示例值：zh-CN
         *
         * @param locale
         * @return
         */
        public Builder locale(String locale) {
            this.locale = locale;
            return this;
        }

        /**
         * 语言
         * <p> 示例值：zh-CN
         *
         * @param locale {@link com.lark.oapi.service.approval.v4.enums.GetInstanceLocaleEnum}
         * @return
         */
        public Builder locale(com.lark.oapi.service.approval.v4.enums.GetInstanceLocaleEnum locale) {
            this.locale = locale.getValue();
            return this;
        }

        /**
         * 发起审批用户id，仅自建应用可返回
         * <p> 示例值：f7cb567e
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：user_id
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
         * <p> 示例值：user_id
         *
         * @param userIdType {@link com.lark.oapi.service.approval.v4.enums.GetInstanceUserIdTypeEnum}
         * @return
         */
        public Builder userIdType(com.lark.oapi.service.approval.v4.enums.GetInstanceUserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }

        /**
         * 审批实例 Code, 若在创建的时候传了uuid, 也可以通过传uuid获取
         * <p> 示例值：81D31358-93AF-92D6-7425-01A5D67C4E71
         *
         * @param instanceId
         * @return
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }


        public GetInstanceReq build() {
            return new GetInstanceReq(this);
        }
    }
}
