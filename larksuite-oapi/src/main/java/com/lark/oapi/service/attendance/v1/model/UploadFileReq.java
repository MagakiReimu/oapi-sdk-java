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

package com.lark.oapi.service.attendance.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.attendance.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class UploadFileReq {
    /**
     * 带后缀的文件名
     * <p> 示例值：人脸照片.jpg
     */
    @Query
    @SerializedName("file_name")
    private String fileName;
    @Body
    private UploadFileReqBody body;

    // builder 开始
    public UploadFileReq() {
    }

    public UploadFileReq(Builder builder) {
        /**
         * 带后缀的文件名
         * <p> 示例值：人脸照片.jpg
         */
        this.fileName = builder.fileName;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public UploadFileReqBody getUploadFileReqBody() {
        return this.body;
    }

    public void setUploadFileReqBody(UploadFileReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String fileName; // 带后缀的文件名
        private UploadFileReqBody body;

        /**
         * 带后缀的文件名
         * <p> 示例值：人脸照片.jpg
         *
         * @param fileName
         * @return
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        public UploadFileReqBody getUploadFileReqBody() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder uploadFileReqBody(UploadFileReqBody body) {
            this.body = body;
            return this;
        }

        public UploadFileReq build() {
            return new UploadFileReq(this);
        }
    }
}
