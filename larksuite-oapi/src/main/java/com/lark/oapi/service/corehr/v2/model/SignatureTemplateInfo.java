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

public class SignatureTemplateInfo {
    /**
     * 电子签模板id
     * <p> 示例值：12313
     */
    @SerializedName("id")
    private String id;
    /**
     * 简略信息
     * <p> 示例值：
     */
    @SerializedName("brief_info")
    private SignatureTemplateBriefInfo briefInfo;
    /**
     * 模板内容信息
     * <p> 示例值：
     */
    @SerializedName("content_info")
    private SignatureTemplateContentInfo contentInfo;

    // builder 开始
    public SignatureTemplateInfo() {
    }

    public SignatureTemplateInfo(Builder builder) {
        /**
         * 电子签模板id
         * <p> 示例值：12313
         */
        this.id = builder.id;
        /**
         * 简略信息
         * <p> 示例值：
         */
        this.briefInfo = builder.briefInfo;
        /**
         * 模板内容信息
         * <p> 示例值：
         */
        this.contentInfo = builder.contentInfo;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SignatureTemplateBriefInfo getBriefInfo() {
        return this.briefInfo;
    }

    public void setBriefInfo(SignatureTemplateBriefInfo briefInfo) {
        this.briefInfo = briefInfo;
    }

    public SignatureTemplateContentInfo getContentInfo() {
        return this.contentInfo;
    }

    public void setContentInfo(SignatureTemplateContentInfo contentInfo) {
        this.contentInfo = contentInfo;
    }

    public static class Builder {
        /**
         * 电子签模板id
         * <p> 示例值：12313
         */
        private String id;
        /**
         * 简略信息
         * <p> 示例值：
         */
        private SignatureTemplateBriefInfo briefInfo;
        /**
         * 模板内容信息
         * <p> 示例值：
         */
        private SignatureTemplateContentInfo contentInfo;

        /**
         * 电子签模板id
         * <p> 示例值：12313
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 简略信息
         * <p> 示例值：
         *
         * @param briefInfo
         * @return
         */
        public Builder briefInfo(SignatureTemplateBriefInfo briefInfo) {
            this.briefInfo = briefInfo;
            return this;
        }


        /**
         * 模板内容信息
         * <p> 示例值：
         *
         * @param contentInfo
         * @return
         */
        public Builder contentInfo(SignatureTemplateContentInfo contentInfo) {
            this.contentInfo = contentInfo;
            return this;
        }


        public SignatureTemplateInfo build() {
            return new SignatureTemplateInfo(this);
        }
    }
}
