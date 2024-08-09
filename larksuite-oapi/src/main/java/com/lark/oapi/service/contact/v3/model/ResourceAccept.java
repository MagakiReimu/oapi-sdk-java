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

package com.lark.oapi.service.contact.v3.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.contact.v3.enums.*;
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

public class ResourceAccept {
    /**
     * 资源处理类型
     * <p> 示例值：
     */
    @SerializedName("processing_type")
    private String processingType;
    /**
     * 转移资源时，资源接收者
     * <p> 示例值：
     */
    @SerializedName("acceptor_user_id")
    private String acceptorUserId;

    // builder 开始
    public ResourceAccept() {
    }

    public ResourceAccept(Builder builder) {
        /**
         * 资源处理类型
         * <p> 示例值：
         */
        this.processingType = builder.processingType;
        /**
         * 转移资源时，资源接收者
         * <p> 示例值：
         */
        this.acceptorUserId = builder.acceptorUserId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getProcessingType() {
        return this.processingType;
    }

    public void setProcessingType(String processingType) {
        this.processingType = processingType;
    }

    public String getAcceptorUserId() {
        return this.acceptorUserId;
    }

    public void setAcceptorUserId(String acceptorUserId) {
        this.acceptorUserId = acceptorUserId;
    }

    public static class Builder {
        /**
         * 资源处理类型
         * <p> 示例值：
         */
        private String processingType;
        /**
         * 转移资源时，资源接收者
         * <p> 示例值：
         */
        private String acceptorUserId;

        /**
         * 资源处理类型
         * <p> 示例值：
         *
         * @param processingType
         * @return
         */
        public Builder processingType(String processingType) {
            this.processingType = processingType;
            return this;
        }

        /**
         * 资源处理类型
         * <p> 示例值：
         *
         * @param processingType {@link com.lark.oapi.service.contact.v3.enums.ResourceAcceptResourceProcessingTypeEnum}
         * @return
         */
        public Builder processingType(com.lark.oapi.service.contact.v3.enums.ResourceAcceptResourceProcessingTypeEnum processingType) {
            this.processingType = processingType.getValue();
            return this;
        }


        /**
         * 转移资源时，资源接收者
         * <p> 示例值：
         *
         * @param acceptorUserId
         * @return
         */
        public Builder acceptorUserId(String acceptorUserId) {
            this.acceptorUserId = acceptorUserId;
            return this;
        }


        public ResourceAccept build() {
            return new ResourceAccept(this);
        }
    }
}
