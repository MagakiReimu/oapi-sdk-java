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

public class OpenapiLog {
    /**
     * openapi日志唯一标识
     * <p> 示例值：10000
     */
    @SerializedName("id")
    private String id;
    /**
     * 飞书开放平台定义的API
     * <p> 示例值：POST/open-apis/demo/v1/example
     */
    @SerializedName("api_key")
    private String apiKey;
    /**
     * 日志产生的时间，以秒为单位的时间戳
     * <p> 示例值：1610613336
     */
    @SerializedName("event_time")
    private Integer eventTime;
    /**
     * 在开发者后台——凭证与基础信息页面查看的app_id（cli_xxxxx）
     * <p> 示例值：cli_xxx
     */
    @SerializedName("app_id")
    private String appId;
    /**
     * 发起调用api的ip地址
     * <p> 示例值：192.123.12.1或fdbd:ff1:ce00:135:c7e:d128:5028:6546
     */
    @SerializedName("ip")
    private String ip;
    /**
     * openapi调用日志详情
     * <p> 示例值：
     */
    @SerializedName("log_detail")
    private OpenapiLogDetail logDetail;

    // builder 开始
    public OpenapiLog() {
    }

    public OpenapiLog(Builder builder) {
        /**
         * openapi日志唯一标识
         * <p> 示例值：10000
         */
        this.id = builder.id;
        /**
         * 飞书开放平台定义的API
         * <p> 示例值：POST/open-apis/demo/v1/example
         */
        this.apiKey = builder.apiKey;
        /**
         * 日志产生的时间，以秒为单位的时间戳
         * <p> 示例值：1610613336
         */
        this.eventTime = builder.eventTime;
        /**
         * 在开发者后台——凭证与基础信息页面查看的app_id（cli_xxxxx）
         * <p> 示例值：cli_xxx
         */
        this.appId = builder.appId;
        /**
         * 发起调用api的ip地址
         * <p> 示例值：192.123.12.1或fdbd:ff1:ce00:135:c7e:d128:5028:6546
         */
        this.ip = builder.ip;
        /**
         * openapi调用日志详情
         * <p> 示例值：
         */
        this.logDetail = builder.logDetail;
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

    public String getApiKey() {
        return this.apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public Integer getEventTime() {
        return this.eventTime;
    }

    public void setEventTime(Integer eventTime) {
        this.eventTime = eventTime;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public OpenapiLogDetail getLogDetail() {
        return this.logDetail;
    }

    public void setLogDetail(OpenapiLogDetail logDetail) {
        this.logDetail = logDetail;
    }

    public static class Builder {
        /**
         * openapi日志唯一标识
         * <p> 示例值：10000
         */
        private String id;
        /**
         * 飞书开放平台定义的API
         * <p> 示例值：POST/open-apis/demo/v1/example
         */
        private String apiKey;
        /**
         * 日志产生的时间，以秒为单位的时间戳
         * <p> 示例值：1610613336
         */
        private Integer eventTime;
        /**
         * 在开发者后台——凭证与基础信息页面查看的app_id（cli_xxxxx）
         * <p> 示例值：cli_xxx
         */
        private String appId;
        /**
         * 发起调用api的ip地址
         * <p> 示例值：192.123.12.1或fdbd:ff1:ce00:135:c7e:d128:5028:6546
         */
        private String ip;
        /**
         * openapi调用日志详情
         * <p> 示例值：
         */
        private OpenapiLogDetail logDetail;

        /**
         * openapi日志唯一标识
         * <p> 示例值：10000
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 飞书开放平台定义的API
         * <p> 示例值：POST/open-apis/demo/v1/example
         *
         * @param apiKey
         * @return
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }


        /**
         * 日志产生的时间，以秒为单位的时间戳
         * <p> 示例值：1610613336
         *
         * @param eventTime
         * @return
         */
        public Builder eventTime(Integer eventTime) {
            this.eventTime = eventTime;
            return this;
        }


        /**
         * 在开发者后台——凭证与基础信息页面查看的app_id（cli_xxxxx）
         * <p> 示例值：cli_xxx
         *
         * @param appId
         * @return
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }


        /**
         * 发起调用api的ip地址
         * <p> 示例值：192.123.12.1或fdbd:ff1:ce00:135:c7e:d128:5028:6546
         *
         * @param ip
         * @return
         */
        public Builder ip(String ip) {
            this.ip = ip;
            return this;
        }


        /**
         * openapi调用日志详情
         * <p> 示例值：
         *
         * @param logDetail
         * @return
         */
        public Builder logDetail(OpenapiLogDetail logDetail) {
            this.logDetail = logDetail;
            return this;
        }


        public OpenapiLog build() {
            return new OpenapiLog(this);
        }
    }
}
