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

import com.google.gson.annotations.SerializedName;

public class BpmDataengineI18n {
    /**
     * （注json key是zh-CN，不是zh_cn）i18n类型字段，中文值
     * <p> 示例值：北京
     */
    @SerializedName("zh_cn")
    private String zhCn;
    /**
     * （注json key是en-US，不是en_us）i18n类型字段，英文值
     * <p> 示例值：Beijing
     */
    @SerializedName("en_us")
    private String enUs;

    // builder 开始
    public BpmDataengineI18n() {
    }

    public BpmDataengineI18n(Builder builder) {
        /**
         * （注json key是zh-CN，不是zh_cn）i18n类型字段，中文值
         * <p> 示例值：北京
         */
        this.zhCn = builder.zhCn;
        /**
         * （注json key是en-US，不是en_us）i18n类型字段，英文值
         * <p> 示例值：Beijing
         */
        this.enUs = builder.enUs;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getZhCn() {
        return this.zhCn;
    }

    public void setZhCn(String zhCn) {
        this.zhCn = zhCn;
    }

    public String getEnUs() {
        return this.enUs;
    }

    public void setEnUs(String enUs) {
        this.enUs = enUs;
    }

    public static class Builder {
        /**
         * （注json key是zh-CN，不是zh_cn）i18n类型字段，中文值
         * <p> 示例值：北京
         */
        private String zhCn;
        /**
         * （注json key是en-US，不是en_us）i18n类型字段，英文值
         * <p> 示例值：Beijing
         */
        private String enUs;

        /**
         * （注json key是zh-CN，不是zh_cn）i18n类型字段，中文值
         * <p> 示例值：北京
         *
         * @param zhCn
         * @return
         */
        public Builder zhCn(String zhCn) {
            this.zhCn = zhCn;
            return this;
        }


        /**
         * （注json key是en-US，不是en_us）i18n类型字段，英文值
         * <p> 示例值：Beijing
         *
         * @param enUs
         * @return
         */
        public Builder enUs(String enUs) {
            this.enUs = enUs;
            return this;
        }


        public BpmDataengineI18n build() {
            return new BpmDataengineI18n(this);
        }
    }
}
