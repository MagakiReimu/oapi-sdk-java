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

public class TalentCustomizedAttachment {
    /**
     * 附件 ID
     * <p> 示例值：7140517838785481004
     */
    @SerializedName("file_id")
    private String fileId;
    /**
     * 附件名称
     * <p> 示例值：1.13测试1的面试记录.pdf
     */
    @SerializedName("name")
    private String name;
    /**
     * 附件类型
     * <p> 示例值：application/pdf
     */
    @SerializedName("content_type")
    private String contentType;
    /**
     * 附件大小
     * <p> 示例值：16615
     */
    @SerializedName("file_size")
    private Integer fileSize;

    // builder 开始
    public TalentCustomizedAttachment() {
    }

    public TalentCustomizedAttachment(Builder builder) {
        /**
         * 附件 ID
         * <p> 示例值：7140517838785481004
         */
        this.fileId = builder.fileId;
        /**
         * 附件名称
         * <p> 示例值：1.13测试1的面试记录.pdf
         */
        this.name = builder.name;
        /**
         * 附件类型
         * <p> 示例值：application/pdf
         */
        this.contentType = builder.contentType;
        /**
         * 附件大小
         * <p> 示例值：16615
         */
        this.fileSize = builder.fileSize;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFileId() {
        return this.fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContentType() {
        return this.contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Integer getFileSize() {
        return this.fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public static class Builder {
        /**
         * 附件 ID
         * <p> 示例值：7140517838785481004
         */
        private String fileId;
        /**
         * 附件名称
         * <p> 示例值：1.13测试1的面试记录.pdf
         */
        private String name;
        /**
         * 附件类型
         * <p> 示例值：application/pdf
         */
        private String contentType;
        /**
         * 附件大小
         * <p> 示例值：16615
         */
        private Integer fileSize;

        /**
         * 附件 ID
         * <p> 示例值：7140517838785481004
         *
         * @param fileId
         * @return
         */
        public Builder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }


        /**
         * 附件名称
         * <p> 示例值：1.13测试1的面试记录.pdf
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 附件类型
         * <p> 示例值：application/pdf
         *
         * @param contentType
         * @return
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }


        /**
         * 附件大小
         * <p> 示例值：16615
         *
         * @param fileSize
         * @return
         */
        public Builder fileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }


        public TalentCustomizedAttachment build() {
            return new TalentCustomizedAttachment(this);
        }
    }
}
