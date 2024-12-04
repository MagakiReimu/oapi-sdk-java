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

public class DeleteFileReq {
    /**
     * 被删除文件的类型
     * <p> 示例值：file
     */
    @Query
    @SerializedName("type")
    private String type;
    /**
     * 需要删除的文件token
     * <p> 示例值：boxcnrHpsg1QDqXAAAyachabcef
     */
    @Path
    @SerializedName("file_token")
    private String fileToken;

    // builder 开始
    public DeleteFileReq() {
    }

    public DeleteFileReq(Builder builder) {
        /**
         * 被删除文件的类型
         * <p> 示例值：file
         */
        this.type = builder.type;
        /**
         * 需要删除的文件token
         * <p> 示例值：boxcnrHpsg1QDqXAAAyachabcef
         */
        this.fileToken = builder.fileToken;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFileToken() {
        return this.fileToken;
    }

    public void setFileToken(String fileToken) {
        this.fileToken = fileToken;
    }

    public static class Builder {
        private String type; // 被删除文件的类型
        private String fileToken; // 需要删除的文件token

        /**
         * 被删除文件的类型
         * <p> 示例值：file
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * 被删除文件的类型
         * <p> 示例值：file
         *
         * @param type {@link com.lark.oapi.service.drive.v1.enums.DeleteFileTypeEnum}
         * @return
         */
        public Builder type(com.lark.oapi.service.drive.v1.enums.DeleteFileTypeEnum type) {
            this.type = type.getValue();
            return this;
        }

        /**
         * 需要删除的文件token
         * <p> 示例值：boxcnrHpsg1QDqXAAAyachabcef
         *
         * @param fileToken
         * @return
         */
        public Builder fileToken(String fileToken) {
            this.fileToken = fileToken;
            return this;
        }


        public DeleteFileReq build() {
            return new DeleteFileReq(this);
        }
    }
}
