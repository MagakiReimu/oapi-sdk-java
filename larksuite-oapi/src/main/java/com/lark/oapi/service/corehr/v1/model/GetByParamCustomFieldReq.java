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

package com.lark.oapi.service.corehr.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Query;

public class GetByParamCustomFieldReq {
    /**
     * 所属对象 apiname
     * <p> 示例值：offboarding_info
     */
    @Query
    @SerializedName("object_api_name")
    private String objectApiName;
    /**
     * 自定义字段 apiname
     * <p> 示例值：custom_field_33
     */
    @Query
    @SerializedName("custom_api_name")
    private String customApiName;

    // builder 开始
    public GetByParamCustomFieldReq() {
    }

    public GetByParamCustomFieldReq(Builder builder) {
        /**
         * 所属对象 apiname
         * <p> 示例值：offboarding_info
         */
        this.objectApiName = builder.objectApiName;
        /**
         * 自定义字段 apiname
         * <p> 示例值：custom_field_33
         */
        this.customApiName = builder.customApiName;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getObjectApiName() {
        return this.objectApiName;
    }

    public void setObjectApiName(String objectApiName) {
        this.objectApiName = objectApiName;
    }

    public String getCustomApiName() {
        return this.customApiName;
    }

    public void setCustomApiName(String customApiName) {
        this.customApiName = customApiName;
    }

    public static class Builder {
        private String objectApiName; // 所属对象 apiname
        private String customApiName; // 自定义字段 apiname


        /**
         * 所属对象 apiname
         * <p> 示例值：offboarding_info
         *
         * @param objectApiName
         * @return
         */
        public Builder objectApiName(String objectApiName) {
            this.objectApiName = objectApiName;
            return this;
        }


        /**
         * 自定义字段 apiname
         * <p> 示例值：custom_field_33
         *
         * @param customApiName
         * @return
         */
        public Builder customApiName(String customApiName) {
            this.customApiName = customApiName;
            return this;
        }

        public GetByParamCustomFieldReq build() {
            return new GetByParamCustomFieldReq(this);
        }
    }
}
