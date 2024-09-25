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

package com.lark.oapi.service.search.v2.model;

import com.google.gson.annotations.SerializedName;

public class SchemaPredefineEnumStruct {
    /**
     * 枚举值的标识。在多枚举值定义中保持唯一
     * <p> 示例值：p0
     */
    @SerializedName("name")
    private String name;
    /**
     * 枚举值展示文案
     * <p> 示例值：最高优先级
     */
    @SerializedName("text")
    private String text;

    // builder 开始
    public SchemaPredefineEnumStruct() {
    }

    public SchemaPredefineEnumStruct(Builder builder) {
        /**
         * 枚举值的标识。在多枚举值定义中保持唯一
         * <p> 示例值：p0
         */
        this.name = builder.name;
        /**
         * 枚举值展示文案
         * <p> 示例值：最高优先级
         */
        this.text = builder.text;
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

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public static class Builder {
        /**
         * 枚举值的标识。在多枚举值定义中保持唯一
         * <p> 示例值：p0
         */
        private String name;
        /**
         * 枚举值展示文案
         * <p> 示例值：最高优先级
         */
        private String text;

        /**
         * 枚举值的标识。在多枚举值定义中保持唯一
         * <p> 示例值：p0
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 枚举值展示文案
         * <p> 示例值：最高优先级
         *
         * @param text
         * @return
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }


        public SchemaPredefineEnumStruct build() {
            return new SchemaPredefineEnumStruct(this);
        }
    }
}
