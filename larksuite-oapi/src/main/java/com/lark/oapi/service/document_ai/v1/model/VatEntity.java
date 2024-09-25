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

package com.lark.oapi.service.document_ai.v1.model;

import com.google.gson.annotations.SerializedName;

public class VatEntity {
    /**
     * 识别的实体类型
     * <p> 示例值：buyer_name
     */
    @SerializedName("type")
    private String type;
    /**
     * 识别出字段的文本信息
     * <p> 示例值：发呆公司
     */
    @SerializedName("value")
    private String value;

    // builder 开始
    public VatEntity() {
    }

    public VatEntity(Builder builder) {
        /**
         * 识别的实体类型
         * <p> 示例值：buyer_name
         */
        this.type = builder.type;
        /**
         * 识别出字段的文本信息
         * <p> 示例值：发呆公司
         */
        this.value = builder.value;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static class Builder {
        /**
         * 识别的实体类型
         * <p> 示例值：buyer_name
         */
        private String type;
        /**
         * 识别出字段的文本信息
         * <p> 示例值：发呆公司
         */
        private String value;

        /**
         * 识别的实体类型
         * <p> 示例值：buyer_name
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * 识别的实体类型
         * <p> 示例值：buyer_name
         *
         * @param type {@link com.lark.oapi.service.document_ai.v1.enums.VatEntityVatEntityTypeEnum}
         * @return
         */
        public Builder type(com.lark.oapi.service.document_ai.v1.enums.VatEntityVatEntityTypeEnum type) {
            this.type = type.getValue();
            return this;
        }


        /**
         * 识别出字段的文本信息
         * <p> 示例值：发呆公司
         *
         * @param value
         * @return
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }


        public VatEntity build() {
            return new VatEntity(this);
        }
    }
}
