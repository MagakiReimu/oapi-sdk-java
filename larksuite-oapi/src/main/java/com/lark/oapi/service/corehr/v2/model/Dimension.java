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

public class Dimension {
    /**
     * 维度的名称
     * <p> 示例值：
     */
    @SerializedName("name")
    private I18n[] name;
    /**
     * 维度的 api name
     * <p> 示例值：department
     */
    @SerializedName("api_name")
    private String apiName;
    /**
     * 维度的字段类型。enum 代表字段为枚举类型，lookup 代表字段为 lookup 类型，bool 代表字段为布尔类型
     * <p> 示例值：enum
     */
    @SerializedName("field_type")
    private String fieldType;
    /**
     * 维度是否为必填
     * <p> 示例值：true
     */
    @SerializedName("required")
    private Boolean required;
    /**
     * 枚举类型的维度对应的枚举值列表
     * <p> 示例值：
     */
    @SerializedName("enum_value")
    private Enum[] enumValue;

    // builder 开始
    public Dimension() {
    }

    public Dimension(Builder builder) {
        /**
         * 维度的名称
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 维度的 api name
         * <p> 示例值：department
         */
        this.apiName = builder.apiName;
        /**
         * 维度的字段类型。enum 代表字段为枚举类型，lookup 代表字段为 lookup 类型，bool 代表字段为布尔类型
         * <p> 示例值：enum
         */
        this.fieldType = builder.fieldType;
        /**
         * 维度是否为必填
         * <p> 示例值：true
         */
        this.required = builder.required;
        /**
         * 枚举类型的维度对应的枚举值列表
         * <p> 示例值：
         */
        this.enumValue = builder.enumValue;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public I18n[] getName() {
        return this.name;
    }

    public void setName(I18n[] name) {
        this.name = name;
    }

    public String getApiName() {
        return this.apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getFieldType() {
        return this.fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public Boolean getRequired() {
        return this.required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public Enum[] getEnumValue() {
        return this.enumValue;
    }

    public void setEnumValue(Enum[] enumValue) {
        this.enumValue = enumValue;
    }

    public static class Builder {
        /**
         * 维度的名称
         * <p> 示例值：
         */
        private I18n[] name;
        /**
         * 维度的 api name
         * <p> 示例值：department
         */
        private String apiName;
        /**
         * 维度的字段类型。enum 代表字段为枚举类型，lookup 代表字段为 lookup 类型，bool 代表字段为布尔类型
         * <p> 示例值：enum
         */
        private String fieldType;
        /**
         * 维度是否为必填
         * <p> 示例值：true
         */
        private Boolean required;
        /**
         * 枚举类型的维度对应的枚举值列表
         * <p> 示例值：
         */
        private Enum[] enumValue;

        /**
         * 维度的名称
         * <p> 示例值：
         *
         * @param name
         * @return
         */
        public Builder name(I18n[] name) {
            this.name = name;
            return this;
        }


        /**
         * 维度的 api name
         * <p> 示例值：department
         *
         * @param apiName
         * @return
         */
        public Builder apiName(String apiName) {
            this.apiName = apiName;
            return this;
        }


        /**
         * 维度的字段类型。enum 代表字段为枚举类型，lookup 代表字段为 lookup 类型，bool 代表字段为布尔类型
         * <p> 示例值：enum
         *
         * @param fieldType
         * @return
         */
        public Builder fieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }


        /**
         * 维度是否为必填
         * <p> 示例值：true
         *
         * @param required
         * @return
         */
        public Builder required(Boolean required) {
            this.required = required;
            return this;
        }


        /**
         * 枚举类型的维度对应的枚举值列表
         * <p> 示例值：
         *
         * @param enumValue
         * @return
         */
        public Builder enumValue(Enum[] enumValue) {
            this.enumValue = enumValue;
            return this;
        }


        public Dimension build() {
            return new Dimension(this);
        }
    }
}
