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

public class QrCodeDimension {
    /**
     * 维度API name
     * <p> 示例值：company
     */
    @SerializedName("api_name")
    private String apiName;
    /**
     * 维度名称
     * <p> 示例值：
     */
    @SerializedName("display_name")
    private I18nV2 displayName;
    /**
     * 维度类型
     * <p> 示例值：1
     */
    @SerializedName("type")
    private Integer type;

    // builder 开始
    public QrCodeDimension() {
    }

    public QrCodeDimension(Builder builder) {
        /**
         * 维度API name
         * <p> 示例值：company
         */
        this.apiName = builder.apiName;
        /**
         * 维度名称
         * <p> 示例值：
         */
        this.displayName = builder.displayName;
        /**
         * 维度类型
         * <p> 示例值：1
         */
        this.type = builder.type;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getApiName() {
        return this.apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public I18nV2 getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(I18nV2 displayName) {
        this.displayName = displayName;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public static class Builder {
        /**
         * 维度API name
         * <p> 示例值：company
         */
        private String apiName;
        /**
         * 维度名称
         * <p> 示例值：
         */
        private I18nV2 displayName;
        /**
         * 维度类型
         * <p> 示例值：1
         */
        private Integer type;

        /**
         * 维度API name
         * <p> 示例值：company
         *
         * @param apiName
         * @return
         */
        public Builder apiName(String apiName) {
            this.apiName = apiName;
            return this;
        }


        /**
         * 维度名称
         * <p> 示例值：
         *
         * @param displayName
         * @return
         */
        public Builder displayName(I18nV2 displayName) {
            this.displayName = displayName;
            return this;
        }


        /**
         * 维度类型
         * <p> 示例值：1
         *
         * @param type
         * @return
         */
        public Builder type(Integer type) {
            this.type = type;
            return this;
        }

        /**
         * 维度类型
         * <p> 示例值：1
         *
         * @param type {@link com.lark.oapi.service.corehr.v2.enums.QrCodeDimensionTypeEnum}
         * @return
         */
        public Builder type(com.lark.oapi.service.corehr.v2.enums.QrCodeDimensionTypeEnum type) {
            this.type = type.getValue();
            return this;
        }


        public QrCodeDimension build() {
            return new QrCodeDimension(this);
        }
    }
}
