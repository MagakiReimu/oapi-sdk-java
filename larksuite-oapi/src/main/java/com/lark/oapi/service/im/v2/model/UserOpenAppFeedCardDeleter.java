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

package com.lark.oapi.service.im.v2.model;

import com.google.gson.annotations.SerializedName;

public class UserOpenAppFeedCardDeleter {
    /**
     * 业务 ID
     * <p> 示例值：ed381d34-49ac-4876-8d9e-23447acb587e
     */
    @SerializedName("biz_id")
    private String bizId;
    /**
     * 用户 ID
     * <p> 示例值：
     */
    @SerializedName("user_id")
    private String userId;

    // builder 开始
    public UserOpenAppFeedCardDeleter() {
    }

    public UserOpenAppFeedCardDeleter(Builder builder) {
        /**
         * 业务 ID
         * <p> 示例值：ed381d34-49ac-4876-8d9e-23447acb587e
         */
        this.bizId = builder.bizId;
        /**
         * 用户 ID
         * <p> 示例值：
         */
        this.userId = builder.userId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getBizId() {
        return this.bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public static class Builder {
        /**
         * 业务 ID
         * <p> 示例值：ed381d34-49ac-4876-8d9e-23447acb587e
         */
        private String bizId;
        /**
         * 用户 ID
         * <p> 示例值：
         */
        private String userId;

        /**
         * 业务 ID
         * <p> 示例值：ed381d34-49ac-4876-8d9e-23447acb587e
         *
         * @param bizId
         * @return
         */
        public Builder bizId(String bizId) {
            this.bizId = bizId;
            return this;
        }


        /**
         * 用户 ID
         * <p> 示例值：
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        public UserOpenAppFeedCardDeleter build() {
            return new UserOpenAppFeedCardDeleter(this);
        }
    }
}
