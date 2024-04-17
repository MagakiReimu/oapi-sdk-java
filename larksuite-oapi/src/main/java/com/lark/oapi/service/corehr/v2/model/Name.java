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

package com.lark.oapi.service.corehr.v2.model;

import com.google.gson.annotations.SerializedName;

public class Name {
    /**
     * 全名
     * <p> 示例值：李一一
     */
    @SerializedName("full_name")
    private String fullName;
    /**
     * 名
     * <p> 示例值：一
     */
    @SerializedName("first_name")
    private String firstName;
    /**
     * 中间名
     * <p> 示例值：一
     */
    @SerializedName("middle_name")
    private String middleName;
    /**
     * 姓
     * <p> 示例值：李
     */
    @SerializedName("name_primary")
    private String namePrimary;
    /**
     * 名 - 本地文字
     * <p> 示例值：一
     */
    @SerializedName("local_first_name")
    private String localFirstName;
    /**
     * 本地中间名
     * <p> 示例值：一
     */
    @SerializedName("local_middle_name")
    private String localMiddleName;
    /**
     * 姓 - 本地文字
     * <p> 示例值：李
     */
    @SerializedName("local_primary")
    private String localPrimary;
    /**
     * 国家 / 地区
     * <p> 示例值：6862995757234914824
     */
    @SerializedName("country_region_id")
    private String countryRegionId;
    /**
     * 本地文字的自定义姓名
     * <p> 示例值：李一一
     */
    @SerializedName("custom_local_name")
    private String customLocalName;
    /**
     * 西方文字的自定义姓名
     * <p> 示例值：YiyiLi
     */
    @SerializedName("custom_western_name")
    private String customWesternName;

    // builder 开始
    public Name() {
    }

    public Name(Builder builder) {
        /**
         * 全名
         * <p> 示例值：李一一
         */
        this.fullName = builder.fullName;
        /**
         * 名
         * <p> 示例值：一
         */
        this.firstName = builder.firstName;
        /**
         * 中间名
         * <p> 示例值：一
         */
        this.middleName = builder.middleName;
        /**
         * 姓
         * <p> 示例值：李
         */
        this.namePrimary = builder.namePrimary;
        /**
         * 名 - 本地文字
         * <p> 示例值：一
         */
        this.localFirstName = builder.localFirstName;
        /**
         * 本地中间名
         * <p> 示例值：一
         */
        this.localMiddleName = builder.localMiddleName;
        /**
         * 姓 - 本地文字
         * <p> 示例值：李
         */
        this.localPrimary = builder.localPrimary;
        /**
         * 国家 / 地区
         * <p> 示例值：6862995757234914824
         */
        this.countryRegionId = builder.countryRegionId;
        /**
         * 本地文字的自定义姓名
         * <p> 示例值：李一一
         */
        this.customLocalName = builder.customLocalName;
        /**
         * 西方文字的自定义姓名
         * <p> 示例值：YiyiLi
         */
        this.customWesternName = builder.customWesternName;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getNamePrimary() {
        return this.namePrimary;
    }

    public void setNamePrimary(String namePrimary) {
        this.namePrimary = namePrimary;
    }

    public String getLocalFirstName() {
        return this.localFirstName;
    }

    public void setLocalFirstName(String localFirstName) {
        this.localFirstName = localFirstName;
    }

    public String getLocalMiddleName() {
        return this.localMiddleName;
    }

    public void setLocalMiddleName(String localMiddleName) {
        this.localMiddleName = localMiddleName;
    }

    public String getLocalPrimary() {
        return this.localPrimary;
    }

    public void setLocalPrimary(String localPrimary) {
        this.localPrimary = localPrimary;
    }

    public String getCountryRegionId() {
        return this.countryRegionId;
    }

    public void setCountryRegionId(String countryRegionId) {
        this.countryRegionId = countryRegionId;
    }

    public String getCustomLocalName() {
        return this.customLocalName;
    }

    public void setCustomLocalName(String customLocalName) {
        this.customLocalName = customLocalName;
    }

    public String getCustomWesternName() {
        return this.customWesternName;
    }

    public void setCustomWesternName(String customWesternName) {
        this.customWesternName = customWesternName;
    }

    public static class Builder {
        /**
         * 全名
         * <p> 示例值：李一一
         */
        private String fullName;
        /**
         * 名
         * <p> 示例值：一
         */
        private String firstName;
        /**
         * 中间名
         * <p> 示例值：一
         */
        private String middleName;
        /**
         * 姓
         * <p> 示例值：李
         */
        private String namePrimary;
        /**
         * 名 - 本地文字
         * <p> 示例值：一
         */
        private String localFirstName;
        /**
         * 本地中间名
         * <p> 示例值：一
         */
        private String localMiddleName;
        /**
         * 姓 - 本地文字
         * <p> 示例值：李
         */
        private String localPrimary;
        /**
         * 国家 / 地区
         * <p> 示例值：6862995757234914824
         */
        private String countryRegionId;
        /**
         * 本地文字的自定义姓名
         * <p> 示例值：李一一
         */
        private String customLocalName;
        /**
         * 西方文字的自定义姓名
         * <p> 示例值：YiyiLi
         */
        private String customWesternName;

        /**
         * 全名
         * <p> 示例值：李一一
         *
         * @param fullName
         * @return
         */
        public Builder fullName(String fullName) {
            this.fullName = fullName;
            return this;
        }


        /**
         * 名
         * <p> 示例值：一
         *
         * @param firstName
         * @return
         */
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }


        /**
         * 中间名
         * <p> 示例值：一
         *
         * @param middleName
         * @return
         */
        public Builder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }


        /**
         * 姓
         * <p> 示例值：李
         *
         * @param namePrimary
         * @return
         */
        public Builder namePrimary(String namePrimary) {
            this.namePrimary = namePrimary;
            return this;
        }


        /**
         * 名 - 本地文字
         * <p> 示例值：一
         *
         * @param localFirstName
         * @return
         */
        public Builder localFirstName(String localFirstName) {
            this.localFirstName = localFirstName;
            return this;
        }


        /**
         * 本地中间名
         * <p> 示例值：一
         *
         * @param localMiddleName
         * @return
         */
        public Builder localMiddleName(String localMiddleName) {
            this.localMiddleName = localMiddleName;
            return this;
        }


        /**
         * 姓 - 本地文字
         * <p> 示例值：李
         *
         * @param localPrimary
         * @return
         */
        public Builder localPrimary(String localPrimary) {
            this.localPrimary = localPrimary;
            return this;
        }


        /**
         * 国家 / 地区
         * <p> 示例值：6862995757234914824
         *
         * @param countryRegionId
         * @return
         */
        public Builder countryRegionId(String countryRegionId) {
            this.countryRegionId = countryRegionId;
            return this;
        }


        /**
         * 本地文字的自定义姓名
         * <p> 示例值：李一一
         *
         * @param customLocalName
         * @return
         */
        public Builder customLocalName(String customLocalName) {
            this.customLocalName = customLocalName;
            return this;
        }


        /**
         * 西方文字的自定义姓名
         * <p> 示例值：YiyiLi
         *
         * @param customWesternName
         * @return
         */
        public Builder customWesternName(String customWesternName) {
            this.customWesternName = customWesternName;
            return this;
        }


        public Name build() {
            return new Name(this);
        }
    }
}
