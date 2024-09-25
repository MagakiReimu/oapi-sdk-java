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

package com.lark.oapi.service.security_and_compliance.v1.model;

import com.google.gson.annotations.SerializedName;

public class DlpExecuteEvidence {
    /**
     * 关键字
     * <p> 示例值：
     */
    @SerializedName("keyword_hits")
    private String[] keywordHits;
    /**
     * 正则表达式列表
     * <p> 示例值：
     */
    @SerializedName("regular_hits")
    private String[] regularHits;
    /**
     * 敏感信息类型列表
     * <p> 示例值：
     */
    @SerializedName("sensitive_hits")
    private String[] sensitiveHits;

    // builder 开始
    public DlpExecuteEvidence() {
    }

    public DlpExecuteEvidence(Builder builder) {
        /**
         * 关键字
         * <p> 示例值：
         */
        this.keywordHits = builder.keywordHits;
        /**
         * 正则表达式列表
         * <p> 示例值：
         */
        this.regularHits = builder.regularHits;
        /**
         * 敏感信息类型列表
         * <p> 示例值：
         */
        this.sensitiveHits = builder.sensitiveHits;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String[] getKeywordHits() {
        return this.keywordHits;
    }

    public void setKeywordHits(String[] keywordHits) {
        this.keywordHits = keywordHits;
    }

    public String[] getRegularHits() {
        return this.regularHits;
    }

    public void setRegularHits(String[] regularHits) {
        this.regularHits = regularHits;
    }

    public String[] getSensitiveHits() {
        return this.sensitiveHits;
    }

    public void setSensitiveHits(String[] sensitiveHits) {
        this.sensitiveHits = sensitiveHits;
    }

    public static class Builder {
        /**
         * 关键字
         * <p> 示例值：
         */
        private String[] keywordHits;
        /**
         * 正则表达式列表
         * <p> 示例值：
         */
        private String[] regularHits;
        /**
         * 敏感信息类型列表
         * <p> 示例值：
         */
        private String[] sensitiveHits;

        /**
         * 关键字
         * <p> 示例值：
         *
         * @param keywordHits
         * @return
         */
        public Builder keywordHits(String[] keywordHits) {
            this.keywordHits = keywordHits;
            return this;
        }


        /**
         * 正则表达式列表
         * <p> 示例值：
         *
         * @param regularHits
         * @return
         */
        public Builder regularHits(String[] regularHits) {
            this.regularHits = regularHits;
            return this;
        }


        /**
         * 敏感信息类型列表
         * <p> 示例值：
         *
         * @param sensitiveHits
         * @return
         */
        public Builder sensitiveHits(String[] sensitiveHits) {
            this.sensitiveHits = sensitiveHits;
            return this;
        }


        public DlpExecuteEvidence build() {
            return new DlpExecuteEvidence(this);
        }
    }
}
