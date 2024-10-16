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

package com.lark.oapi.service.corehr.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.corehr.v2.enums.*;
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

public class Enum {
    /**
     * 枚举值
     * <p> 示例值：phone_type
     */
    @SerializedName("enum_name")
    private String enumName;
    /**
     * 枚举多语展示
     * <p> 示例值：
     */
    @SerializedName("display")
    private I18n[] display;

    // builder 开始
    public Enum() {
    }

    public Enum(Builder builder) {
        /**
         * 枚举值
         * <p> 示例值：phone_type
         */
        this.enumName = builder.enumName;
        /**
         * 枚举多语展示
         * <p> 示例值：
         */
        this.display = builder.display;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getEnumName() {
        return this.enumName;
    }

    public void setEnumName(String enumName) {
        this.enumName = enumName;
    }

    public I18n[] getDisplay() {
        return this.display;
    }

    public void setDisplay(I18n[] display) {
        this.display = display;
    }

    public static class Builder {
        /**
         * 枚举值
         * <p> 示例值：phone_type
         */
        private String enumName;
        /**
         * 枚举多语展示
         * <p> 示例值：
         */
        private I18n[] display;

        /**
         * 枚举值
         * <p> 示例值：phone_type
         *
         * @param enumName
         * @return
         */
        public Builder enumName(String enumName) {
            this.enumName = enumName;
            return this;
        }


        /**
         * 枚举多语展示
         * <p> 示例值：
         *
         * @param display
         * @return
         */
        public Builder display(I18n[] display) {
            this.display = display;
            return this;
        }


        public Enum build() {
            return new Enum(this);
        }
    }
}
