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

public class BitableTableFieldActionValuePropertyOption {
    /**
     * 选项名
     * <p> 示例值：option name
     */
    @SerializedName("name")
    private String name;
    /**
     * 选项ID
     * <p> 示例值：optabcef
     */
    @SerializedName("id")
    private String id;
    /**
     * 选项颜色
     * <p> 示例值：3
     */
    @SerializedName("color")
    private Integer color;

    // builder 开始
    public BitableTableFieldActionValuePropertyOption() {
    }

    public BitableTableFieldActionValuePropertyOption(Builder builder) {
        /**
         * 选项名
         * <p> 示例值：option name
         */
        this.name = builder.name;
        /**
         * 选项ID
         * <p> 示例值：optabcef
         */
        this.id = builder.id;
        /**
         * 选项颜色
         * <p> 示例值：3
         */
        this.color = builder.color;
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

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getColor() {
        return this.color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public static class Builder {
        /**
         * 选项名
         * <p> 示例值：option name
         */
        private String name;
        /**
         * 选项ID
         * <p> 示例值：optabcef
         */
        private String id;
        /**
         * 选项颜色
         * <p> 示例值：3
         */
        private Integer color;

        /**
         * 选项名
         * <p> 示例值：option name
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 选项ID
         * <p> 示例值：optabcef
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 选项颜色
         * <p> 示例值：3
         *
         * @param color
         * @return
         */
        public Builder color(Integer color) {
            this.color = color;
            return this;
        }


        public BitableTableFieldActionValuePropertyOption build() {
            return new BitableTableFieldActionValuePropertyOption(this);
        }
    }
}
