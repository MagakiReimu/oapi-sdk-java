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

public class AttachmentInfo {
    /**
     * 附件id
     * <p> 示例值：6949805467799537964
     */
    @SerializedName("id")
    private String id;
    /**
     * 附件的url
     * <p> 示例值：https://hire.feishu.cn/blob/xx/
     */
    @SerializedName("url")
    private String url;
    /**
     * 附件文件名
     * <p> 示例值：xx的简历.prd
     */
    @SerializedName("name")
    private String name;
    /**
     * 媒体类型/MIME
     * <p> 示例值：application/pdf
     */
    @SerializedName("mime")
    private String mime;
    /**
     * 附件创建时间（单位ms）
     * <p> 示例值：1618899376480
     */
    @SerializedName("create_time")
    private String createTime;

    // builder 开始
    public AttachmentInfo() {
    }

    public AttachmentInfo(Builder builder) {
        /**
         * 附件id
         * <p> 示例值：6949805467799537964
         */
        this.id = builder.id;
        /**
         * 附件的url
         * <p> 示例值：https://hire.feishu.cn/blob/xx/
         */
        this.url = builder.url;
        /**
         * 附件文件名
         * <p> 示例值：xx的简历.prd
         */
        this.name = builder.name;
        /**
         * 媒体类型/MIME
         * <p> 示例值：application/pdf
         */
        this.mime = builder.mime;
        /**
         * 附件创建时间（单位ms）
         * <p> 示例值：1618899376480
         */
        this.createTime = builder.createTime;
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

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMime() {
        return this.mime;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public static class Builder {
        /**
         * 附件id
         * <p> 示例值：6949805467799537964
         */
        private String id;
        /**
         * 附件的url
         * <p> 示例值：https://hire.feishu.cn/blob/xx/
         */
        private String url;
        /**
         * 附件文件名
         * <p> 示例值：xx的简历.prd
         */
        private String name;
        /**
         * 媒体类型/MIME
         * <p> 示例值：application/pdf
         */
        private String mime;
        /**
         * 附件创建时间（单位ms）
         * <p> 示例值：1618899376480
         */
        private String createTime;

        /**
         * 附件id
         * <p> 示例值：6949805467799537964
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 附件的url
         * <p> 示例值：https://hire.feishu.cn/blob/xx/
         *
         * @param url
         * @return
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }


        /**
         * 附件文件名
         * <p> 示例值：xx的简历.prd
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 媒体类型/MIME
         * <p> 示例值：application/pdf
         *
         * @param mime
         * @return
         */
        public Builder mime(String mime) {
            this.mime = mime;
            return this;
        }


        /**
         * 附件创建时间（单位ms）
         * <p> 示例值：1618899376480
         *
         * @param createTime
         * @return
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }


        public AttachmentInfo build() {
            return new AttachmentInfo(this);
        }
    }
}
