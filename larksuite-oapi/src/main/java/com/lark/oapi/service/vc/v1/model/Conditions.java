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

import com.google.gson.annotations.SerializedName;

public class Conditions {
    /**
     * 自定义题目的key
     * <p> 示例值：167383928372636
     */
    @SerializedName("custom_key")
    private String customKey;
    /**
     * 自定义选项的key
     * <p> 示例值：
     */
    @SerializedName("option_keys")
    private String[] optionKeys;

    // builder 开始
    public Conditions() {
    }

    public Conditions(Builder builder) {
        /**
         * 自定义题目的key
         * <p> 示例值：167383928372636
         */
        this.customKey = builder.customKey;
        /**
         * 自定义选项的key
         * <p> 示例值：
         */
        this.optionKeys = builder.optionKeys;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getCustomKey() {
        return this.customKey;
    }

    public void setCustomKey(String customKey) {
        this.customKey = customKey;
    }

    public String[] getOptionKeys() {
        return this.optionKeys;
    }

    public void setOptionKeys(String[] optionKeys) {
        this.optionKeys = optionKeys;
    }

    public static class Builder {
        /**
         * 自定义题目的key
         * <p> 示例值：167383928372636
         */
        private String customKey;
        /**
         * 自定义选项的key
         * <p> 示例值：
         */
        private String[] optionKeys;

        /**
         * 自定义题目的key
         * <p> 示例值：167383928372636
         *
         * @param customKey
         * @return
         */
        public Builder customKey(String customKey) {
            this.customKey = customKey;
            return this;
        }


        /**
         * 自定义选项的key
         * <p> 示例值：
         *
         * @param optionKeys
         * @return
         */
        public Builder optionKeys(String[] optionKeys) {
            this.optionKeys = optionKeys;
            return this;
        }


        public Conditions build() {
            return new Conditions(this);
        }
    }
}
