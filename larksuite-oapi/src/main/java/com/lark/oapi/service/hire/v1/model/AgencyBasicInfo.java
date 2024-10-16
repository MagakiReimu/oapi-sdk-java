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

import com.lark.oapi.core.response.EmptyData;
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

public class AgencyBasicInfo {
    /**
     * 猎头用户名
     * <p> 示例值：
     */
    @SerializedName("hunter_user_name")
    private I18n hunterUserName;
    /**
     * 猎头公司名
     * <p> 示例值：明天会更好猎头公司
     */
    @SerializedName("hunter_company_name")
    private String hunterCompanyName;

    // builder 开始
    public AgencyBasicInfo() {
    }

    public AgencyBasicInfo(Builder builder) {
        /**
         * 猎头用户名
         * <p> 示例值：
         */
        this.hunterUserName = builder.hunterUserName;
        /**
         * 猎头公司名
         * <p> 示例值：明天会更好猎头公司
         */
        this.hunterCompanyName = builder.hunterCompanyName;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public I18n getHunterUserName() {
        return this.hunterUserName;
    }

    public void setHunterUserName(I18n hunterUserName) {
        this.hunterUserName = hunterUserName;
    }

    public String getHunterCompanyName() {
        return this.hunterCompanyName;
    }

    public void setHunterCompanyName(String hunterCompanyName) {
        this.hunterCompanyName = hunterCompanyName;
    }

    public static class Builder {
        /**
         * 猎头用户名
         * <p> 示例值：
         */
        private I18n hunterUserName;
        /**
         * 猎头公司名
         * <p> 示例值：明天会更好猎头公司
         */
        private String hunterCompanyName;

        /**
         * 猎头用户名
         * <p> 示例值：
         *
         * @param hunterUserName
         * @return
         */
        public Builder hunterUserName(I18n hunterUserName) {
            this.hunterUserName = hunterUserName;
            return this;
        }


        /**
         * 猎头公司名
         * <p> 示例值：明天会更好猎头公司
         *
         * @param hunterCompanyName
         * @return
         */
        public Builder hunterCompanyName(String hunterCompanyName) {
            this.hunterCompanyName = hunterCompanyName;
            return this;
        }


        public AgencyBasicInfo build() {
            return new AgencyBasicInfo(this);
        }
    }
}
