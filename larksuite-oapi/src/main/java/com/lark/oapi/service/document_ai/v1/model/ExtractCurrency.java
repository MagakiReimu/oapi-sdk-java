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

package com.lark.oapi.service.document_ai.v1.model;

import com.google.gson.annotations.SerializedName;

public class ExtractCurrency {
    /**
     * 币种名称
     * <p> 示例值：CNY
     */
    @SerializedName("currency_name")
    private String currencyName;
    /**
     * 币种符号
     * <p> 示例值：¥
     */
    @SerializedName("currency_text")
    private String currencyText;

    // builder 开始
    public ExtractCurrency() {
    }

    public ExtractCurrency(Builder builder) {
        /**
         * 币种名称
         * <p> 示例值：CNY
         */
        this.currencyName = builder.currencyName;
        /**
         * 币种符号
         * <p> 示例值：¥
         */
        this.currencyText = builder.currencyText;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getCurrencyName() {
        return this.currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencyText() {
        return this.currencyText;
    }

    public void setCurrencyText(String currencyText) {
        this.currencyText = currencyText;
    }

    public static class Builder {
        /**
         * 币种名称
         * <p> 示例值：CNY
         */
        private String currencyName;
        /**
         * 币种符号
         * <p> 示例值：¥
         */
        private String currencyText;

        /**
         * 币种名称
         * <p> 示例值：CNY
         *
         * @param currencyName
         * @return
         */
        public Builder currencyName(String currencyName) {
            this.currencyName = currencyName;
            return this;
        }


        /**
         * 币种符号
         * <p> 示例值：¥
         *
         * @param currencyText
         * @return
         */
        public Builder currencyText(String currencyText) {
            this.currencyText = currencyText;
            return this;
        }


        public ExtractCurrency build() {
            return new ExtractCurrency(this);
        }
    }
}
