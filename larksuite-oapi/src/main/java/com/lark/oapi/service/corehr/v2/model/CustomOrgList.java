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

public class CustomOrgList {
    /**
     * 自定义组织名称
     * <p> 示例值：编制单元
     */
    @SerializedName("custom_org_name")
    private I18nV2 customOrgName;
    /**
     * 自定义组织ID
     * <p> 示例值：7293641346149138452
     */
    @SerializedName("custom_org_id")
    private String customOrgId;
    /**
     * 比例
     * <p> 示例值：42.98
     */
    @SerializedName("rate")
    private String rate;

    // builder 开始
    public CustomOrgList() {
    }

    public CustomOrgList(Builder builder) {
        /**
         * 自定义组织名称
         * <p> 示例值：编制单元
         */
        this.customOrgName = builder.customOrgName;
        /**
         * 自定义组织ID
         * <p> 示例值：7293641346149138452
         */
        this.customOrgId = builder.customOrgId;
        /**
         * 比例
         * <p> 示例值：42.98
         */
        this.rate = builder.rate;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public I18nV2 getCustomOrgName() {
        return this.customOrgName;
    }

    public void setCustomOrgName(I18nV2 customOrgName) {
        this.customOrgName = customOrgName;
    }

    public String getCustomOrgId() {
        return this.customOrgId;
    }

    public void setCustomOrgId(String customOrgId) {
        this.customOrgId = customOrgId;
    }

    public String getRate() {
        return this.rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public static class Builder {
        /**
         * 自定义组织名称
         * <p> 示例值：编制单元
         */
        private I18nV2 customOrgName;
        /**
         * 自定义组织ID
         * <p> 示例值：7293641346149138452
         */
        private String customOrgId;
        /**
         * 比例
         * <p> 示例值：42.98
         */
        private String rate;

        /**
         * 自定义组织名称
         * <p> 示例值：编制单元
         *
         * @param customOrgName
         * @return
         */
        public Builder customOrgName(I18nV2 customOrgName) {
            this.customOrgName = customOrgName;
            return this;
        }


        /**
         * 自定义组织ID
         * <p> 示例值：7293641346149138452
         *
         * @param customOrgId
         * @return
         */
        public Builder customOrgId(String customOrgId) {
            this.customOrgId = customOrgId;
            return this;
        }


        /**
         * 比例
         * <p> 示例值：42.98
         *
         * @param rate
         * @return
         */
        public Builder rate(String rate) {
            this.rate = rate;
            return this;
        }


        public CustomOrgList build() {
            return new CustomOrgList(this);
        }
    }
}
