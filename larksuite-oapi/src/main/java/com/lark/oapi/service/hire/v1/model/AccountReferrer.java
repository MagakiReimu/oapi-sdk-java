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

public class AccountReferrer {
    /**
     * 内推人 ID
     * <p> 示例值：7413952589321914668
     */
    @SerializedName("id")
    private String id;
    /**
     * 内推人名称
     * <p> 示例值：
     */
    @SerializedName("name")
    private I18n name;
    /**
     * 用户邮箱
     * <p> 示例值：27188272xxxx1.com
     */
    @SerializedName("email")
    private String email;
    /**
     * 用户手机
     * <p> 示例值：1879087xxx8
     */
    @SerializedName("mobile")
    private String mobile;

    // builder 开始
    public AccountReferrer() {
    }

    public AccountReferrer(Builder builder) {
        /**
         * 内推人 ID
         * <p> 示例值：7413952589321914668
         */
        this.id = builder.id;
        /**
         * 内推人名称
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 用户邮箱
         * <p> 示例值：27188272xxxx1.com
         */
        this.email = builder.email;
        /**
         * 用户手机
         * <p> 示例值：1879087xxx8
         */
        this.mobile = builder.mobile;
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

    public I18n getName() {
        return this.name;
    }

    public void setName(I18n name) {
        this.name = name;
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

    public static class Builder {
        /**
         * 内推人 ID
         * <p> 示例值：7413952589321914668
         */
        private String id;
        /**
         * 内推人名称
         * <p> 示例值：
         */
        private I18n name;
        /**
         * 用户邮箱
         * <p> 示例值：27188272xxxx1.com
         */
        private String email;
        /**
         * 用户手机
         * <p> 示例值：1879087xxx8
         */
        private String mobile;

        /**
         * 内推人 ID
         * <p> 示例值：7413952589321914668
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 内推人名称
         * <p> 示例值：
         *
         * @param name
         * @return
         */
        public Builder name(I18n name) {
            this.name = name;
            return this;
        }


        /**
         * 用户邮箱
         * <p> 示例值：27188272xxxx1.com
         *
         * @param email
         * @return
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }


        /**
         * 用户手机
         * <p> 示例值：1879087xxx8
         *
         * @param mobile
         * @return
         */
        public Builder mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }


        public AccountReferrer build() {
            return new AccountReferrer(this);
        }
    }
}
