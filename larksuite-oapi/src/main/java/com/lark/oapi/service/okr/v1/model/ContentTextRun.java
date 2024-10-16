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

public class ContentTextRun {
    /**
     * 具体的文本内容
     * <p> 示例值：周报内容
     */
    @SerializedName("text")
    private String text;
    /**
     * 文本内容的样式，支持 BIUS、颜色等
     * <p> 示例值：
     */
    @SerializedName("style")
    private ContentTextStyle style;

    // builder 开始
    public ContentTextRun() {
    }

    public ContentTextRun(Builder builder) {
        /**
         * 具体的文本内容
         * <p> 示例值：周报内容
         */
        this.text = builder.text;
        /**
         * 文本内容的样式，支持 BIUS、颜色等
         * <p> 示例值：
         */
        this.style = builder.style;
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

    public ContentTextStyle getStyle() {
        return this.style;
    }

    public void setStyle(ContentTextStyle style) {
        this.style = style;
    }

    public static class Builder {
        /**
         * 具体的文本内容
         * <p> 示例值：周报内容
         */
        private String text;
        /**
         * 文本内容的样式，支持 BIUS、颜色等
         * <p> 示例值：
         */
        private ContentTextStyle style;

        /**
         * 具体的文本内容
         * <p> 示例值：周报内容
         *
         * @param text
         * @return
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }


        /**
         * 文本内容的样式，支持 BIUS、颜色等
         * <p> 示例值：
         *
         * @param style
         * @return
         */
        public Builder style(ContentTextStyle style) {
            this.style = style;
            return this;
        }


        public ContentTextRun build() {
            return new ContentTextRun(this);
        }
    }
}
