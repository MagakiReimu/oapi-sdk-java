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

package com.lark.oapi.service.hire.v1.model;

import com.google.gson.annotations.SerializedName;

public class SiteResumeSns {
    /**
     * 社交网站类型
     * <p> 示例值：
     */
    @SerializedName("sns_type")
    private String snsType;
    /**
     * 链接
     * <p> 示例值：
     */
    @SerializedName("link")
    private String link;

    // builder 开始
    public SiteResumeSns() {
    }

    public SiteResumeSns(Builder builder) {
        /**
         * 社交网站类型
         * <p> 示例值：
         */
        this.snsType = builder.snsType;
        /**
         * 链接
         * <p> 示例值：
         */
        this.link = builder.link;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getSnsType() {
        return this.snsType;
    }

    public void setSnsType(String snsType) {
        this.snsType = snsType;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public static class Builder {
        /**
         * 社交网站类型
         * <p> 示例值：
         */
        private String snsType;
        /**
         * 链接
         * <p> 示例值：
         */
        private String link;

        /**
         * 社交网站类型
         * <p> 示例值：
         *
         * @param snsType
         * @return
         */
        public Builder snsType(String snsType) {
            this.snsType = snsType;
            return this;
        }


        /**
         * 链接
         * <p> 示例值：
         *
         * @param link
         * @return
         */
        public Builder link(String link) {
            this.link = link;
            return this;
        }


        public SiteResumeSns build() {
            return new SiteResumeSns(this);
        }
    }
}
