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

public class TenantThirdPartyEncryptionApp {
    /**
     * 加密服务提供商的名字
     * <p> 示例值：卫士通
     */
    @SerializedName("vendor_name")
    private String vendorName;
    /**
     * 服务状态
     * <p> 示例值：1
     */
    @SerializedName("status")
    private Integer status;
    /**
     * 服务开始时间（Unix秒级时间戳）
     * <p> 示例值：1653473995
     */
    @SerializedName("service_start_time")
    private String serviceStartTime;
    /**
     * 服务结束时间（Unix秒级时间戳）
     * <p> 示例值：1684944000
     */
    @SerializedName("service_end_time")
    private String serviceEndTime;
    /**
     * 服务商SDK需要的特化的SDK配置，status=1时必填
     * <p> 示例值：
     */
    @SerializedName("config")
    private String config;

    // builder 开始
    public TenantThirdPartyEncryptionApp() {
    }

    public TenantThirdPartyEncryptionApp(Builder builder) {
        /**
         * 加密服务提供商的名字
         * <p> 示例值：卫士通
         */
        this.vendorName = builder.vendorName;
        /**
         * 服务状态
         * <p> 示例值：1
         */
        this.status = builder.status;
        /**
         * 服务开始时间（Unix秒级时间戳）
         * <p> 示例值：1653473995
         */
        this.serviceStartTime = builder.serviceStartTime;
        /**
         * 服务结束时间（Unix秒级时间戳）
         * <p> 示例值：1684944000
         */
        this.serviceEndTime = builder.serviceEndTime;
        /**
         * 服务商SDK需要的特化的SDK配置，status=1时必填
         * <p> 示例值：
         */
        this.config = builder.config;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getVendorName() {
        return this.vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getServiceStartTime() {
        return this.serviceStartTime;
    }

    public void setServiceStartTime(String serviceStartTime) {
        this.serviceStartTime = serviceStartTime;
    }

    public String getServiceEndTime() {
        return this.serviceEndTime;
    }

    public void setServiceEndTime(String serviceEndTime) {
        this.serviceEndTime = serviceEndTime;
    }

    public String getConfig() {
        return this.config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public static class Builder {
        /**
         * 加密服务提供商的名字
         * <p> 示例值：卫士通
         */
        private String vendorName;
        /**
         * 服务状态
         * <p> 示例值：1
         */
        private Integer status;
        /**
         * 服务开始时间（Unix秒级时间戳）
         * <p> 示例值：1653473995
         */
        private String serviceStartTime;
        /**
         * 服务结束时间（Unix秒级时间戳）
         * <p> 示例值：1684944000
         */
        private String serviceEndTime;
        /**
         * 服务商SDK需要的特化的SDK配置，status=1时必填
         * <p> 示例值：
         */
        private String config;

        /**
         * 加密服务提供商的名字
         * <p> 示例值：卫士通
         *
         * @param vendorName
         * @return
         */
        public Builder vendorName(String vendorName) {
            this.vendorName = vendorName;
            return this;
        }


        /**
         * 服务状态
         * <p> 示例值：1
         *
         * @param status
         * @return
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * 服务状态
         * <p> 示例值：1
         *
         * @param status {@link com.lark.oapi.service.security_and_compliance.v1.enums.TenantThirdPartyEncryptionAppStatusEnum}
         * @return
         */
        public Builder status(com.lark.oapi.service.security_and_compliance.v1.enums.TenantThirdPartyEncryptionAppStatusEnum status) {
            this.status = status.getValue();
            return this;
        }


        /**
         * 服务开始时间（Unix秒级时间戳）
         * <p> 示例值：1653473995
         *
         * @param serviceStartTime
         * @return
         */
        public Builder serviceStartTime(String serviceStartTime) {
            this.serviceStartTime = serviceStartTime;
            return this;
        }


        /**
         * 服务结束时间（Unix秒级时间戳）
         * <p> 示例值：1684944000
         *
         * @param serviceEndTime
         * @return
         */
        public Builder serviceEndTime(String serviceEndTime) {
            this.serviceEndTime = serviceEndTime;
            return this;
        }


        /**
         * 服务商SDK需要的特化的SDK配置，status=1时必填
         * <p> 示例值：
         *
         * @param config
         * @return
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }


        public TenantThirdPartyEncryptionApp build() {
            return new TenantThirdPartyEncryptionApp(this);
        }
    }
}
