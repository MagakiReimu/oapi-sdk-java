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

public class OfferApplyFormInfo {
    /**
     * offer申请表 ID
     * <p> 示例值：23746823748
     */
    @SerializedName("id")
    private String id;
    /**
     * offer申请表名称
     * <p> 示例值：
     */
    @SerializedName("name")
    private I18n name;
    /**
     * schema 信息，用于描述申请表单结构的元数据定义，即对申请表内容的描述
     * <p> 示例值：
     */
    @SerializedName("schema")
    private OfferApplyFormSchema schema;

    // builder 开始
    public OfferApplyFormInfo() {
    }

    public OfferApplyFormInfo(Builder builder) {
        /**
         * offer申请表 ID
         * <p> 示例值：23746823748
         */
        this.id = builder.id;
        /**
         * offer申请表名称
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * schema 信息，用于描述申请表单结构的元数据定义，即对申请表内容的描述
         * <p> 示例值：
         */
        this.schema = builder.schema;
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

    public OfferApplyFormSchema getSchema() {
        return this.schema;
    }

    public void setSchema(OfferApplyFormSchema schema) {
        this.schema = schema;
    }

    public static class Builder {
        /**
         * offer申请表 ID
         * <p> 示例值：23746823748
         */
        private String id;
        /**
         * offer申请表名称
         * <p> 示例值：
         */
        private I18n name;
        /**
         * schema 信息，用于描述申请表单结构的元数据定义，即对申请表内容的描述
         * <p> 示例值：
         */
        private OfferApplyFormSchema schema;

        /**
         * offer申请表 ID
         * <p> 示例值：23746823748
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * offer申请表名称
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
         * schema 信息，用于描述申请表单结构的元数据定义，即对申请表内容的描述
         * <p> 示例值：
         *
         * @param schema
         * @return
         */
        public Builder schema(OfferApplyFormSchema schema) {
            this.schema = schema;
            return this;
        }


        public OfferApplyFormInfo build() {
            return new OfferApplyFormInfo(this);
        }
    }
}
