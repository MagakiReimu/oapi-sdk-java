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

package com.lark.oapi.service.vc.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.vc.v1.enums.*;
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

public class Options {
    /**
     * 选项文本名称/其他选项的对应文本
     * <p> 示例值：选项1
     */
    @SerializedName("text")
    private String text;
    /**
     * 选项的自定义key
     * <p> 示例值：23213812938
     */
    @SerializedName("key")
    private String key;
    /**
     * 区分是否为其他选项
     * <p> 示例值：false
     */
    @SerializedName("is_other")
    private Boolean isOther;

    // builder 开始
    public Options() {
    }

    public Options(Builder builder) {
        /**
         * 选项文本名称/其他选项的对应文本
         * <p> 示例值：选项1
         */
        this.text = builder.text;
        /**
         * 选项的自定义key
         * <p> 示例值：23213812938
         */
        this.key = builder.key;
        /**
         * 区分是否为其他选项
         * <p> 示例值：false
         */
        this.isOther = builder.isOther;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Boolean getIsOther() {
        return this.isOther;
    }

    public void setIsOther(Boolean isOther) {
        this.isOther = isOther;
    }

    public static class Builder {
        /**
         * 选项文本名称/其他选项的对应文本
         * <p> 示例值：选项1
         */
        private String text;
        /**
         * 选项的自定义key
         * <p> 示例值：23213812938
         */
        private String key;
        /**
         * 区分是否为其他选项
         * <p> 示例值：false
         */
        private Boolean isOther;

        /**
         * 选项文本名称/其他选项的对应文本
         * <p> 示例值：选项1
         *
         * @param text
         * @return
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }


        /**
         * 选项的自定义key
         * <p> 示例值：23213812938
         *
         * @param key
         * @return
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }


        /**
         * 区分是否为其他选项
         * <p> 示例值：false
         *
         * @param isOther
         * @return
         */
        public Builder isOther(Boolean isOther) {
            this.isOther = isOther;
            return this;
        }


        public Options build() {
            return new Options(this);
        }
    }
}
