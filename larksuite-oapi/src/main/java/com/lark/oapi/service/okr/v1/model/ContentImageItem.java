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

package com.lark.oapi.service.okr.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.okr.v1.enums.*;
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

public class ContentImageItem {
    /**
     * 图片 token，通过上传图片接口获取
     * <p> 示例值：boxcnOj88GDkmWGm2zsTyCBqoLb
     */
    @SerializedName("fileToken")
    private String fileToken;
    /**
     * 图片链接
     * <p> 示例值：https://bytedance.feishu.cn/drive/home/
     */
    @SerializedName("src")
    private String src;
    /**
     * 图片宽，单位px
     * <p> 示例值：458
     */
    @SerializedName("width")
    private Double width;
    /**
     * 图片高，单位px
     * <p> 示例值：372
     */
    @SerializedName("height")
    private Double height;

    // builder 开始
    public ContentImageItem() {
    }

    public ContentImageItem(Builder builder) {
        /**
         * 图片 token，通过上传图片接口获取
         * <p> 示例值：boxcnOj88GDkmWGm2zsTyCBqoLb
         */
        this.fileToken = builder.fileToken;
        /**
         * 图片链接
         * <p> 示例值：https://bytedance.feishu.cn/drive/home/
         */
        this.src = builder.src;
        /**
         * 图片宽，单位px
         * <p> 示例值：458
         */
        this.width = builder.width;
        /**
         * 图片高，单位px
         * <p> 示例值：372
         */
        this.height = builder.height;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFileToken() {
        return this.fileToken;
    }

    public void setFileToken(String fileToken) {
        this.fileToken = fileToken;
    }

    public String getSrc() {
        return this.src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public Double getWidth() {
        return this.width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return this.height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public static class Builder {
        /**
         * 图片 token，通过上传图片接口获取
         * <p> 示例值：boxcnOj88GDkmWGm2zsTyCBqoLb
         */
        private String fileToken;
        /**
         * 图片链接
         * <p> 示例值：https://bytedance.feishu.cn/drive/home/
         */
        private String src;
        /**
         * 图片宽，单位px
         * <p> 示例值：458
         */
        private Double width;
        /**
         * 图片高，单位px
         * <p> 示例值：372
         */
        private Double height;

        /**
         * 图片 token，通过上传图片接口获取
         * <p> 示例值：boxcnOj88GDkmWGm2zsTyCBqoLb
         *
         * @param fileToken
         * @return
         */
        public Builder fileToken(String fileToken) {
            this.fileToken = fileToken;
            return this;
        }


        /**
         * 图片链接
         * <p> 示例值：https://bytedance.feishu.cn/drive/home/
         *
         * @param src
         * @return
         */
        public Builder src(String src) {
            this.src = src;
            return this;
        }


        /**
         * 图片宽，单位px
         * <p> 示例值：458
         *
         * @param width
         * @return
         */
        public Builder width(Double width) {
            this.width = width;
            return this;
        }


        /**
         * 图片高，单位px
         * <p> 示例值：372
         *
         * @param height
         * @return
         */
        public Builder height(Double height) {
            this.height = height;
            return this;
        }


        public ContentImageItem build() {
            return new ContentImageItem(this);
        }
    }
}
