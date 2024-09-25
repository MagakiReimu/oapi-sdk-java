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

public class EcoAccountCustomFieldData {
    /**
     * 自定义字段的标识，同一 scope 内须唯一
     * <p> 示例值：org_id
     */
    @SerializedName("key")
    private String key;
    /**
     * 自定义字段的名称，用户在添加账号表单看到的控件标题
     * <p> 示例值：
     */
    @SerializedName("name")
    private I18n name;
    /**
     * 是否必填
     * <p> 示例值：true
     */
    @SerializedName("is_required")
    private Boolean isRequired;
    /**
     * 自定义字段的描述，用户在添加账号表单看到的 place holder
     * <p> 示例值：
     */
    @SerializedName("description")
    private I18n description;

    // builder 开始
    public EcoAccountCustomFieldData() {
    }

    public EcoAccountCustomFieldData(Builder builder) {
        /**
         * 自定义字段的标识，同一 scope 内须唯一
         * <p> 示例值：org_id
         */
        this.key = builder.key;
        /**
         * 自定义字段的名称，用户在添加账号表单看到的控件标题
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 是否必填
         * <p> 示例值：true
         */
        this.isRequired = builder.isRequired;
        /**
         * 自定义字段的描述，用户在添加账号表单看到的 place holder
         * <p> 示例值：
         */
        this.description = builder.description;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public I18n getName() {
        return this.name;
    }

    public void setName(I18n name) {
        this.name = name;
    }

    public Boolean getIsRequired() {
        return this.isRequired;
    }

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    public I18n getDescription() {
        return this.description;
    }

    public void setDescription(I18n description) {
        this.description = description;
    }

    public static class Builder {
        /**
         * 自定义字段的标识，同一 scope 内须唯一
         * <p> 示例值：org_id
         */
        private String key;
        /**
         * 自定义字段的名称，用户在添加账号表单看到的控件标题
         * <p> 示例值：
         */
        private I18n name;
        /**
         * 是否必填
         * <p> 示例值：true
         */
        private Boolean isRequired;
        /**
         * 自定义字段的描述，用户在添加账号表单看到的 place holder
         * <p> 示例值：
         */
        private I18n description;

        /**
         * 自定义字段的标识，同一 scope 内须唯一
         * <p> 示例值：org_id
         *
         * @param key
         * @return
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }


        /**
         * 自定义字段的名称，用户在添加账号表单看到的控件标题
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
         * 是否必填
         * <p> 示例值：true
         *
         * @param isRequired
         * @return
         */
        public Builder isRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            return this;
        }


        /**
         * 自定义字段的描述，用户在添加账号表单看到的 place holder
         * <p> 示例值：
         *
         * @param description
         * @return
         */
        public Builder description(I18n description) {
            this.description = description;
            return this;
        }


        public EcoAccountCustomFieldData build() {
            return new EcoAccountCustomFieldData(this);
        }
    }
}
