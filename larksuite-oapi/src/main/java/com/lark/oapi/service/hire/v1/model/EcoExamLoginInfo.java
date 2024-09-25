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

public class EcoExamLoginInfo {
    /**
     * 笔试链接
     * <p> 示例值：https://xxxx/xxxx/xxxx
     */
    @SerializedName("exam_url")
    private String examUrl;
    /**
     * 用户名
     * <p> 示例值：waxsdfbhg
     */
    @SerializedName("username")
    private String username;
    /**
     * 密码
     * <p> 示例值：xxxxxx
     */
    @SerializedName("password")
    private String password;

    // builder 开始
    public EcoExamLoginInfo() {
    }

    public EcoExamLoginInfo(Builder builder) {
        /**
         * 笔试链接
         * <p> 示例值：https://xxxx/xxxx/xxxx
         */
        this.examUrl = builder.examUrl;
        /**
         * 用户名
         * <p> 示例值：waxsdfbhg
         */
        this.username = builder.username;
        /**
         * 密码
         * <p> 示例值：xxxxxx
         */
        this.password = builder.password;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getExamUrl() {
        return this.examUrl;
    }

    public void setExamUrl(String examUrl) {
        this.examUrl = examUrl;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static class Builder {
        /**
         * 笔试链接
         * <p> 示例值：https://xxxx/xxxx/xxxx
         */
        private String examUrl;
        /**
         * 用户名
         * <p> 示例值：waxsdfbhg
         */
        private String username;
        /**
         * 密码
         * <p> 示例值：xxxxxx
         */
        private String password;

        /**
         * 笔试链接
         * <p> 示例值：https://xxxx/xxxx/xxxx
         *
         * @param examUrl
         * @return
         */
        public Builder examUrl(String examUrl) {
            this.examUrl = examUrl;
            return this;
        }


        /**
         * 用户名
         * <p> 示例值：waxsdfbhg
         *
         * @param username
         * @return
         */
        public Builder username(String username) {
            this.username = username;
            return this;
        }


        /**
         * 密码
         * <p> 示例值：xxxxxx
         *
         * @param password
         * @return
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }


        public EcoExamLoginInfo build() {
            return new EcoExamLoginInfo(this);
        }
    }
}
