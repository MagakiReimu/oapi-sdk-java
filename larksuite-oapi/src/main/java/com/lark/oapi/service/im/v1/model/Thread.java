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

package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class Thread {
    /**
     * 话题ID
     * <p> 示例值：ot_70eb06e7b84dc71c03e009ad3c754680
     */
    @SerializedName("thread_id")
    private String threadId;
    /**
     * 话题所属的群聊ID
     * <p> 示例值：oc_5ad11d72b830411d72b836c20
     */
    @SerializedName("chat_id")
    private String chatId;
    /**
     * 话题更新时间
     * <p> 示例值：1609336806
     */
    @SerializedName("update_time")
    private String updateTime;

    // builder 开始
    public Thread() {
    }

    public Thread(Builder builder) {
        /**
         * 话题ID
         * <p> 示例值：ot_70eb06e7b84dc71c03e009ad3c754680
         */
        this.threadId = builder.threadId;
        /**
         * 话题所属的群聊ID
         * <p> 示例值：oc_5ad11d72b830411d72b836c20
         */
        this.chatId = builder.chatId;
        /**
         * 话题更新时间
         * <p> 示例值：1609336806
         */
        this.updateTime = builder.updateTime;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getThreadId() {
        return this.threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    public String getChatId() {
        return this.chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public static class Builder {
        /**
         * 话题ID
         * <p> 示例值：ot_70eb06e7b84dc71c03e009ad3c754680
         */
        private String threadId;
        /**
         * 话题所属的群聊ID
         * <p> 示例值：oc_5ad11d72b830411d72b836c20
         */
        private String chatId;
        /**
         * 话题更新时间
         * <p> 示例值：1609336806
         */
        private String updateTime;

        /**
         * 话题ID
         * <p> 示例值：ot_70eb06e7b84dc71c03e009ad3c754680
         *
         * @param threadId
         * @return
         */
        public Builder threadId(String threadId) {
            this.threadId = threadId;
            return this;
        }


        /**
         * 话题所属的群聊ID
         * <p> 示例值：oc_5ad11d72b830411d72b836c20
         *
         * @param chatId
         * @return
         */
        public Builder chatId(String chatId) {
            this.chatId = chatId;
            return this;
        }


        /**
         * 话题更新时间
         * <p> 示例值：1609336806
         *
         * @param updateTime
         * @return
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }


        public Thread build() {
            return new Thread(this);
        }
    }
}
