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
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class CopyFileReqBody {
    /**
     * 被复制文件的新名称
     * <p> 示例值：test.txt
     */
    @SerializedName("name")
    private String name;
    /**
     * 被复制文件的类型，如果该值为空或者与文件实际类型不匹配，接口会返回失败。
     * <p> 示例值：doc
     */
    @SerializedName("type")
    private String type;
    /**
     * 文件被复制到的目标文件夹token
     * <p> 示例值：fldbcO1UuPz8VwnpPx5a92abcef
     */
    @SerializedName("folder_token")
    private String folderToken;
    /**
     * 用户自定义请求附加参数，用于实现特殊的复制语义
     * <p> 示例值：
     */
    @SerializedName("extra")
    private Property[] extra;

    // builder 开始
    public CopyFileReqBody() {
    }

    public CopyFileReqBody(Builder builder) {
        /**
         * 被复制文件的新名称
         * <p> 示例值：test.txt
         */
        this.name = builder.name;
        /**
         * 被复制文件的类型，如果该值为空或者与文件实际类型不匹配，接口会返回失败。
         * <p> 示例值：doc
         */
        this.type = builder.type;
        /**
         * 文件被复制到的目标文件夹token
         * <p> 示例值：fldbcO1UuPz8VwnpPx5a92abcef
         */
        this.folderToken = builder.folderToken;
        /**
         * 用户自定义请求附加参数，用于实现特殊的复制语义
         * <p> 示例值：
         */
        this.extra = builder.extra;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFolderToken() {
        return this.folderToken;
    }

    public void setFolderToken(String folderToken) {
        this.folderToken = folderToken;
    }

    public Property[] getExtra() {
        return this.extra;
    }

    public void setExtra(Property[] extra) {
        this.extra = extra;
    }

    public static class Builder {
        /**
         * 被复制文件的新名称
         * <p> 示例值：test.txt
         */
        private String name;
        /**
         * 被复制文件的类型，如果该值为空或者与文件实际类型不匹配，接口会返回失败。
         * <p> 示例值：doc
         */
        private String type;
        /**
         * 文件被复制到的目标文件夹token
         * <p> 示例值：fldbcO1UuPz8VwnpPx5a92abcef
         */
        private String folderToken;
        /**
         * 用户自定义请求附加参数，用于实现特殊的复制语义
         * <p> 示例值：
         */
        private Property[] extra;

        /**
         * 被复制文件的新名称
         * <p> 示例值：test.txt
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 被复制文件的类型，如果该值为空或者与文件实际类型不匹配，接口会返回失败。
         * <p> 示例值：doc
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * 被复制文件的类型，如果该值为空或者与文件实际类型不匹配，接口会返回失败。
         * <p> 示例值：doc
         *
         * @param type {@link com.lark.oapi.service.drive.v1.enums.CopyFileTypeEnum}
         * @return
         */
        public Builder type(com.lark.oapi.service.drive.v1.enums.CopyFileTypeEnum type) {
            this.type = type.getValue();
            return this;
        }


        /**
         * 文件被复制到的目标文件夹token
         * <p> 示例值：fldbcO1UuPz8VwnpPx5a92abcef
         *
         * @param folderToken
         * @return
         */
        public Builder folderToken(String folderToken) {
            this.folderToken = folderToken;
            return this;
        }


        /**
         * 用户自定义请求附加参数，用于实现特殊的复制语义
         * <p> 示例值：
         *
         * @param extra
         * @return
         */
        public Builder extra(Property[] extra) {
            this.extra = extra;
            return this;
        }


        public CopyFileReqBody build() {
            return new CopyFileReqBody(this);
        }
    }
}
