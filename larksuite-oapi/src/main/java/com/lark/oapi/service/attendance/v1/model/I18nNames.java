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

import com.google.gson.annotations.SerializedName;

public class I18nNames {
    /**
     * 中文描述
     * <p> 示例值：中文描述
     */
    @SerializedName("ch")
    private String ch;
    /**
     * 英语描述
     * <p> 示例值：English description
     */
    @SerializedName("en")
    private String en;
    /**
     * 日语描述
     * <p> 示例值：日本語の説明
     */
    @SerializedName("ja")
    private String ja;

    // builder 开始
    public I18nNames() {
    }

    public I18nNames(Builder builder) {
        /**
         * 中文描述
         * <p> 示例值：中文描述
         */
        this.ch = builder.ch;
        /**
         * 英语描述
         * <p> 示例值：English description
         */
        this.en = builder.en;
        /**
         * 日语描述
         * <p> 示例值：日本語の説明
         */
        this.ja = builder.ja;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getCh() {
        return this.ch;
    }

    public void setCh(String ch) {
        this.ch = ch;
    }

    public String getEn() {
        return this.en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getJa() {
        return this.ja;
    }

    public void setJa(String ja) {
        this.ja = ja;
    }

    public static class Builder {
        /**
         * 中文描述
         * <p> 示例值：中文描述
         */
        private String ch;
        /**
         * 英语描述
         * <p> 示例值：English description
         */
        private String en;
        /**
         * 日语描述
         * <p> 示例值：日本語の説明
         */
        private String ja;

        /**
         * 中文描述
         * <p> 示例值：中文描述
         *
         * @param ch
         * @return
         */
        public Builder ch(String ch) {
            this.ch = ch;
            return this;
        }


        /**
         * 英语描述
         * <p> 示例值：English description
         *
         * @param en
         * @return
         */
        public Builder en(String en) {
            this.en = en;
            return this;
        }


        /**
         * 日语描述
         * <p> 示例值：日本語の説明
         *
         * @param ja
         * @return
         */
        public Builder ja(String ja) {
            this.ja = ja;
            return this;
        }


        public I18nNames build() {
            return new I18nNames(this);
        }
    }
}
