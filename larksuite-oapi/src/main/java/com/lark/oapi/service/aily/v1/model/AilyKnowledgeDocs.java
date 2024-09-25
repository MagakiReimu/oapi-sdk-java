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

package com.lark.oapi.service.aily.v1.model;

import com.google.gson.annotations.SerializedName;

public class AilyKnowledgeDocs {
    /**
     * 标题
     * <p> 示例值：title
     */
    @SerializedName("title")
    private String title;
    /**
     * 飞书云文档类型
     * <p> 示例值：docx
     */
    @SerializedName("type")
    private String type;
    /**
     * 飞书云文档标识
     * <p> 示例值：NWicfaD1Rlp2utdR0zycOabcdef
     */
    @SerializedName("token")
    private String token;
    /**
     * 链接
     * <p> 示例值：https://feishu.cn/docx/NWicfaD1Rlp2utdR0zycOabcdef
     */
    @SerializedName("url")
    private String url;

    // builder 开始
    public AilyKnowledgeDocs() {
    }

    public AilyKnowledgeDocs(Builder builder) {
        /**
         * 标题
         * <p> 示例值：title
         */
        this.title = builder.title;
        /**
         * 飞书云文档类型
         * <p> 示例值：docx
         */
        this.type = builder.type;
        /**
         * 飞书云文档标识
         * <p> 示例值：NWicfaD1Rlp2utdR0zycOabcdef
         */
        this.token = builder.token;
        /**
         * 链接
         * <p> 示例值：https://feishu.cn/docx/NWicfaD1Rlp2utdR0zycOabcdef
         */
        this.url = builder.url;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static class Builder {
        /**
         * 标题
         * <p> 示例值：title
         */
        private String title;
        /**
         * 飞书云文档类型
         * <p> 示例值：docx
         */
        private String type;
        /**
         * 飞书云文档标识
         * <p> 示例值：NWicfaD1Rlp2utdR0zycOabcdef
         */
        private String token;
        /**
         * 链接
         * <p> 示例值：https://feishu.cn/docx/NWicfaD1Rlp2utdR0zycOabcdef
         */
        private String url;

        /**
         * 标题
         * <p> 示例值：title
         *
         * @param title
         * @return
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }


        /**
         * 飞书云文档类型
         * <p> 示例值：docx
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * 飞书云文档类型
         * <p> 示例值：docx
         *
         * @param type {@link com.lark.oapi.service.aily.v1.enums.AilyKnowledgeDocsTypeEnum}
         * @return
         */
        public Builder type(com.lark.oapi.service.aily.v1.enums.AilyKnowledgeDocsTypeEnum type) {
            this.type = type.getValue();
            return this;
        }


        /**
         * 飞书云文档标识
         * <p> 示例值：NWicfaD1Rlp2utdR0zycOabcdef
         *
         * @param token
         * @return
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }


        /**
         * 链接
         * <p> 示例值：https://feishu.cn/docx/NWicfaD1Rlp2utdR0zycOabcdef
         *
         * @param url
         * @return
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }


        public AilyKnowledgeDocs build() {
            return new AilyKnowledgeDocs(this);
        }
    }
}
