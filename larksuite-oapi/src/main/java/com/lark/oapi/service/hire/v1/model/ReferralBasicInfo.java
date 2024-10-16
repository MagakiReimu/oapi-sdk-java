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
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class ReferralBasicInfo {
    /**
     * 内推 ID
     * <p> 示例值：6956498101012220204
     */
    @SerializedName("id")
    private String id;
    /**
     * 投递 ID
     * <p> 示例值：7051498101012220201
     */
    @SerializedName("application_id")
    private String applicationId;
    /**
     * 内推类型
     * <p> 示例值：1
     */
    @SerializedName("referral_type")
    private Integer referralType;
    /**
     * 内推人信息
     * <p> 示例值：
     */
    @SerializedName("user_info")
    private BasicUserInfo userInfo;
    /**
     * 内推创建时间戳（单位：毫秒）
     * <p> 示例值：1619720918791
     */
    @SerializedName("create_time")
    private String createTime;
    /**
     * 内推方法
     * <p> 示例值：1
     */
    @SerializedName("referral_method")
    private Integer referralMethod;

    // builder 开始
    public ReferralBasicInfo() {
    }

    public ReferralBasicInfo(Builder builder) {
        /**
         * 内推 ID
         * <p> 示例值：6956498101012220204
         */
        this.id = builder.id;
        /**
         * 投递 ID
         * <p> 示例值：7051498101012220201
         */
        this.applicationId = builder.applicationId;
        /**
         * 内推类型
         * <p> 示例值：1
         */
        this.referralType = builder.referralType;
        /**
         * 内推人信息
         * <p> 示例值：
         */
        this.userInfo = builder.userInfo;
        /**
         * 内推创建时间戳（单位：毫秒）
         * <p> 示例值：1619720918791
         */
        this.createTime = builder.createTime;
        /**
         * 内推方法
         * <p> 示例值：1
         */
        this.referralMethod = builder.referralMethod;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public Integer getReferralType() {
        return this.referralType;
    }

    public void setReferralType(Integer referralType) {
        this.referralType = referralType;
    }

    public BasicUserInfo getUserInfo() {
        return this.userInfo;
    }

    public void setUserInfo(BasicUserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getReferralMethod() {
        return this.referralMethod;
    }

    public void setReferralMethod(Integer referralMethod) {
        this.referralMethod = referralMethod;
    }

    public static class Builder {
        /**
         * 内推 ID
         * <p> 示例值：6956498101012220204
         */
        private String id;
        /**
         * 投递 ID
         * <p> 示例值：7051498101012220201
         */
        private String applicationId;
        /**
         * 内推类型
         * <p> 示例值：1
         */
        private Integer referralType;
        /**
         * 内推人信息
         * <p> 示例值：
         */
        private BasicUserInfo userInfo;
        /**
         * 内推创建时间戳（单位：毫秒）
         * <p> 示例值：1619720918791
         */
        private String createTime;
        /**
         * 内推方法
         * <p> 示例值：1
         */
        private Integer referralMethod;

        /**
         * 内推 ID
         * <p> 示例值：6956498101012220204
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 投递 ID
         * <p> 示例值：7051498101012220201
         *
         * @param applicationId
         * @return
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }


        /**
         * 内推类型
         * <p> 示例值：1
         *
         * @param referralType
         * @return
         */
        public Builder referralType(Integer referralType) {
            this.referralType = referralType;
            return this;
        }


        /**
         * 内推人信息
         * <p> 示例值：
         *
         * @param userInfo
         * @return
         */
        public Builder userInfo(BasicUserInfo userInfo) {
            this.userInfo = userInfo;
            return this;
        }


        /**
         * 内推创建时间戳（单位：毫秒）
         * <p> 示例值：1619720918791
         *
         * @param createTime
         * @return
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }


        /**
         * 内推方法
         * <p> 示例值：1
         *
         * @param referralMethod
         * @return
         */
        public Builder referralMethod(Integer referralMethod) {
            this.referralMethod = referralMethod;
            return this;
        }


        public ReferralBasicInfo build() {
            return new ReferralBasicInfo(this);
        }
    }
}
