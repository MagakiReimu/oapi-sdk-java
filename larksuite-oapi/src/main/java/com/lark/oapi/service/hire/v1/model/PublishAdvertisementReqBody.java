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

public class PublishAdvertisementReqBody {
    /**
     * 职位渠道 ID，选择要发布的招聘官网，单次仅可发布 1 个渠道，1. 内推平台提供对应的 id = 3，2. 官网渠道的 ID 通过接口「获取官网列表」获取
     * <p> 示例值：6960663240925956631
     */
    @SerializedName("job_channel_id")
    private String jobChannelId;

    // builder 开始
    public PublishAdvertisementReqBody() {
    }

    public PublishAdvertisementReqBody(Builder builder) {
        /**
         * 职位渠道 ID，选择要发布的招聘官网，单次仅可发布 1 个渠道，1. 内推平台提供对应的 id = 3，2. 官网渠道的 ID 通过接口「获取官网列表」获取
         * <p> 示例值：6960663240925956631
         */
        this.jobChannelId = builder.jobChannelId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getJobChannelId() {
        return this.jobChannelId;
    }

    public void setJobChannelId(String jobChannelId) {
        this.jobChannelId = jobChannelId;
    }

    public static class Builder {
        /**
         * 职位渠道 ID，选择要发布的招聘官网，单次仅可发布 1 个渠道，1. 内推平台提供对应的 id = 3，2. 官网渠道的 ID 通过接口「获取官网列表」获取
         * <p> 示例值：6960663240925956631
         */
        private String jobChannelId;

        /**
         * 职位渠道 ID，选择要发布的招聘官网，单次仅可发布 1 个渠道，1. 内推平台提供对应的 id = 3，2. 官网渠道的 ID 通过接口「获取官网列表」获取
         * <p> 示例值：6960663240925956631
         *
         * @param jobChannelId
         * @return
         */
        public Builder jobChannelId(String jobChannelId) {
            this.jobChannelId = jobChannelId;
            return this;
        }


        public PublishAdvertisementReqBody build() {
            return new PublishAdvertisementReqBody(this);
        }
    }
}
