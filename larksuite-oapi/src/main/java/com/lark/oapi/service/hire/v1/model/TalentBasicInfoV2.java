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

public class TalentBasicInfoV2 {
    /**
     * 人才 ID
     * <p> 示例值：6956499586395523359
     */
    @SerializedName("id")
    private String id;
    /**
     * 人才名字
     * <p> 示例值：小明
     */
    @SerializedName("name")
    private String name;
    /**
     * 人才手机国家区号
     * <p> 示例值：+86
     */
    @SerializedName("mobile_code")
    private String mobileCode;
    /**
     * 人才手机号
     * <p> 示例值：13563350751
     */
    @SerializedName("mobile_number")
    private String mobileNumber;
    /**
     * 人才邮箱
     * <p> 示例值：xxx@bytedance.com
     */
    @SerializedName("email")
    private String email;

    // builder 开始
    public TalentBasicInfoV2() {
    }

    public TalentBasicInfoV2(Builder builder) {
        /**
         * 人才 ID
         * <p> 示例值：6956499586395523359
         */
        this.id = builder.id;
        /**
         * 人才名字
         * <p> 示例值：小明
         */
        this.name = builder.name;
        /**
         * 人才手机国家区号
         * <p> 示例值：+86
         */
        this.mobileCode = builder.mobileCode;
        /**
         * 人才手机号
         * <p> 示例值：13563350751
         */
        this.mobileNumber = builder.mobileNumber;
        /**
         * 人才邮箱
         * <p> 示例值：xxx@bytedance.com
         */
        this.email = builder.email;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileCode() {
        return this.mobileCode;
    }

    public void setMobileCode(String mobileCode) {
        this.mobileCode = mobileCode;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static class Builder {
        /**
         * 人才 ID
         * <p> 示例值：6956499586395523359
         */
        private String id;
        /**
         * 人才名字
         * <p> 示例值：小明
         */
        private String name;
        /**
         * 人才手机国家区号
         * <p> 示例值：+86
         */
        private String mobileCode;
        /**
         * 人才手机号
         * <p> 示例值：13563350751
         */
        private String mobileNumber;
        /**
         * 人才邮箱
         * <p> 示例值：xxx@bytedance.com
         */
        private String email;

        /**
         * 人才 ID
         * <p> 示例值：6956499586395523359
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 人才名字
         * <p> 示例值：小明
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 人才手机国家区号
         * <p> 示例值：+86
         *
         * @param mobileCode
         * @return
         */
        public Builder mobileCode(String mobileCode) {
            this.mobileCode = mobileCode;
            return this;
        }


        /**
         * 人才手机号
         * <p> 示例值：13563350751
         *
         * @param mobileNumber
         * @return
         */
        public Builder mobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }


        /**
         * 人才邮箱
         * <p> 示例值：xxx@bytedance.com
         *
         * @param email
         * @return
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }


        public TalentBasicInfoV2 build() {
            return new TalentBasicInfoV2(this);
        }
    }
}
