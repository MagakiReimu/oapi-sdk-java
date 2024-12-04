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

package com.lark.oapi.service.drive.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.drive.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class SubscribeFileReq {
    /**
     * 文档类型
     * <p> 示例值：doc
     */
    @Query
    @SerializedName("file_type")
    private String fileType;
    /**
     * 事件类型
     * <p> 示例值：file.created_in_folder_v1
     */
    @Query
    @SerializedName("event_type")
    private String eventType;
    /**
     * 文档token
     * <p> 示例值：doccnxxxxxxxxxxxxxxxxxxxxxx
     */
    @Path
    @SerializedName("file_token")
    private String fileToken;

    // builder 开始
    public SubscribeFileReq() {
    }

    public SubscribeFileReq(Builder builder) {
        /**
         * 文档类型
         * <p> 示例值：doc
         */
        this.fileType = builder.fileType;
        /**
         * 事件类型
         * <p> 示例值：file.created_in_folder_v1
         */
        this.eventType = builder.eventType;
        /**
         * 文档token
         * <p> 示例值：doccnxxxxxxxxxxxxxxxxxxxxxx
         */
        this.fileToken = builder.fileToken;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFileType() {
        return this.fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getEventType() {
        return this.eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getFileToken() {
        return this.fileToken;
    }

    public void setFileToken(String fileToken) {
        this.fileToken = fileToken;
    }

    public static class Builder {
        private String fileType; // 文档类型
        private String eventType; // 事件类型
        private String fileToken; // 文档token

        /**
         * 文档类型
         * <p> 示例值：doc
         *
         * @param fileType
         * @return
         */
        public Builder fileType(String fileType) {
            this.fileType = fileType;
            return this;
        }

        /**
         * 文档类型
         * <p> 示例值：doc
         *
         * @param fileType {@link com.lark.oapi.service.drive.v1.enums.SubscribeFileFileTypeEnum}
         * @return
         */
        public Builder fileType(com.lark.oapi.service.drive.v1.enums.SubscribeFileFileTypeEnum fileType) {
            this.fileType = fileType.getValue();
            return this;
        }

        /**
         * 事件类型
         * <p> 示例值：file.created_in_folder_v1
         *
         * @param eventType
         * @return
         */
        public Builder eventType(String eventType) {
            this.eventType = eventType;
            return this;
        }

        /**
         * 文档token
         * <p> 示例值：doccnxxxxxxxxxxxxxxxxxxxxxx
         *
         * @param fileToken
         * @return
         */
        public Builder fileToken(String fileToken) {
            this.fileToken = fileToken;
            return this;
        }


        public SubscribeFileReq build() {
            return new SubscribeFileReq(this);
        }
    }
}
