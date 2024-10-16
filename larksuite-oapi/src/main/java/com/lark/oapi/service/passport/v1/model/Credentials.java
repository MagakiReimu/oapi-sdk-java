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

package com.lark.oapi.service.passport.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.passport.v1.enums.*;
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

public class Credentials {
    /**
     * 邮箱
     * <p> 示例值：q*****@qq.com
     */
    @SerializedName("email")
    private String email;
    /**
     * 手机号
     * <p> 示例值：186*****01
     */
    @SerializedName("mobile")
    private String mobile;
    /**
     * 用户id
     * <p> 示例值：
     */
    @SerializedName("user_id")
    private String userId;

    // builder 开始
    public Credentials() {
    }

    public Credentials(Builder builder) {
        /**
         * 邮箱
         * <p> 示例值：q*****@qq.com
         */
        this.email = builder.email;
        /**
         * 手机号
         * <p> 示例值：186*****01
         */
        this.mobile = builder.mobile;
        /**
         * 用户id
         * <p> 示例值：
         */
        this.userId = builder.userId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public static class Builder {
        /**
         * 邮箱
         * <p> 示例值：q*****@qq.com
         */
        private String email;
        /**
         * 手机号
         * <p> 示例值：186*****01
         */
        private String mobile;
        /**
         * 用户id
         * <p> 示例值：
         */
        private String userId;

        /**
         * 邮箱
         * <p> 示例值：q*****@qq.com
         *
         * @param email
         * @return
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }


        /**
         * 手机号
         * <p> 示例值：186*****01
         *
         * @param mobile
         * @return
         */
        public Builder mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }


        /**
         * 用户id
         * <p> 示例值：
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        public Credentials build() {
            return new Credentials(this);
        }
    }
}
