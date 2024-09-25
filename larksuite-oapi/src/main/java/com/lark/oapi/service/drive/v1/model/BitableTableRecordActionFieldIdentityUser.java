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

package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;

public class BitableTableRecordActionFieldIdentityUser {
    /**
     * 用户ID
     * <p> 示例值：
     */
    @SerializedName("user_id")
    private UserId userId;
    /**
     * 用户名称
     * <p> 示例值：
     */
    @SerializedName("name")
    private String name;
    /**
     * 用户英文名称
     * <p> 示例值：
     */
    @SerializedName("en_name")
    private String enName;
    /**
     * 用户头像URL
     * <p> 示例值：
     */
    @SerializedName("avatar_url")
    private String avatarUrl;

    // builder 开始
    public BitableTableRecordActionFieldIdentityUser() {
    }

    public BitableTableRecordActionFieldIdentityUser(Builder builder) {
        /**
         * 用户ID
         * <p> 示例值：
         */
        this.userId = builder.userId;
        /**
         * 用户名称
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 用户英文名称
         * <p> 示例值：
         */
        this.enName = builder.enName;
        /**
         * 用户头像URL
         * <p> 示例值：
         */
        this.avatarUrl = builder.avatarUrl;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public UserId getUserId() {
        return this.userId;
    }

    public void setUserId(UserId userId) {
        this.userId = userId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnName() {
        return this.enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public static class Builder {
        /**
         * 用户ID
         * <p> 示例值：
         */
        private UserId userId;
        /**
         * 用户名称
         * <p> 示例值：
         */
        private String name;
        /**
         * 用户英文名称
         * <p> 示例值：
         */
        private String enName;
        /**
         * 用户头像URL
         * <p> 示例值：
         */
        private String avatarUrl;

        /**
         * 用户ID
         * <p> 示例值：
         *
         * @param userId
         * @return
         */
        public Builder userId(UserId userId) {
            this.userId = userId;
            return this;
        }


        /**
         * 用户名称
         * <p> 示例值：
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 用户英文名称
         * <p> 示例值：
         *
         * @param enName
         * @return
         */
        public Builder enName(String enName) {
            this.enName = enName;
            return this;
        }


        /**
         * 用户头像URL
         * <p> 示例值：
         *
         * @param avatarUrl
         * @return
         */
        public Builder avatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }


        public BitableTableRecordActionFieldIdentityUser build() {
            return new BitableTableRecordActionFieldIdentityUser(this);
        }
    }
}
