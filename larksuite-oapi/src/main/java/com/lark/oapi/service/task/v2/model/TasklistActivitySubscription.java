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

package com.lark.oapi.service.task.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.task.v2.enums.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class TasklistActivitySubscription {
    /**
     * 订阅guid
     * <p> 示例值：d19e3a2a-edc0-4e4e-b7cc-950e162b53ae
     */
    @SerializedName("guid")
    private String guid;
    /**
     * 订阅名称
     * <p> 示例值：Roadmap订阅
     */
    @SerializedName("name")
    private String name;
    /**
     * 订阅者
     * <p> 示例值：
     */
    @SerializedName("subscribers")
    private Member[] subscribers;
    /**
     * 要订阅的清单动态类型
     * <p> 示例值：
     */
    @SerializedName("include_keys")
    private Integer[] includeKeys;
    /**
     * 该订阅是否为停用
     * <p> 示例值：false
     */
    @SerializedName("disabled")
    private Boolean disabled;

    // builder 开始
    public TasklistActivitySubscription() {
    }

    public TasklistActivitySubscription(Builder builder) {
        /**
         * 订阅guid
         * <p> 示例值：d19e3a2a-edc0-4e4e-b7cc-950e162b53ae
         */
        this.guid = builder.guid;
        /**
         * 订阅名称
         * <p> 示例值：Roadmap订阅
         */
        this.name = builder.name;
        /**
         * 订阅者
         * <p> 示例值：
         */
        this.subscribers = builder.subscribers;
        /**
         * 要订阅的清单动态类型
         * <p> 示例值：
         */
        this.includeKeys = builder.includeKeys;
        /**
         * 该订阅是否为停用
         * <p> 示例值：false
         */
        this.disabled = builder.disabled;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getGuid() {
        return this.guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Member[] getSubscribers() {
        return this.subscribers;
    }

    public void setSubscribers(Member[] subscribers) {
        this.subscribers = subscribers;
    }

    public Integer[] getIncludeKeys() {
        return this.includeKeys;
    }

    public void setIncludeKeys(Integer[] includeKeys) {
        this.includeKeys = includeKeys;
    }

    public Boolean getDisabled() {
        return this.disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public static class Builder {
        /**
         * 订阅guid
         * <p> 示例值：d19e3a2a-edc0-4e4e-b7cc-950e162b53ae
         */
        private String guid;
        /**
         * 订阅名称
         * <p> 示例值：Roadmap订阅
         */
        private String name;
        /**
         * 订阅者
         * <p> 示例值：
         */
        private Member[] subscribers;
        /**
         * 要订阅的清单动态类型
         * <p> 示例值：
         */
        private Integer[] includeKeys;
        /**
         * 该订阅是否为停用
         * <p> 示例值：false
         */
        private Boolean disabled;

        /**
         * 订阅guid
         * <p> 示例值：d19e3a2a-edc0-4e4e-b7cc-950e162b53ae
         *
         * @param guid
         * @return
         */
        public Builder guid(String guid) {
            this.guid = guid;
            return this;
        }


        /**
         * 订阅名称
         * <p> 示例值：Roadmap订阅
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 订阅者
         * <p> 示例值：
         *
         * @param subscribers
         * @return
         */
        public Builder subscribers(Member[] subscribers) {
            this.subscribers = subscribers;
            return this;
        }


        /**
         * 要订阅的清单动态类型
         * <p> 示例值：
         *
         * @param includeKeys
         * @return
         */
        public Builder includeKeys(Integer[] includeKeys) {
            this.includeKeys = includeKeys;
            return this;
        }


        /**
         * 该订阅是否为停用
         * <p> 示例值：false
         *
         * @param disabled
         * @return
         */
        public Builder disabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }


        public TasklistActivitySubscription build() {
            return new TasklistActivitySubscription(this);
        }
    }
}
