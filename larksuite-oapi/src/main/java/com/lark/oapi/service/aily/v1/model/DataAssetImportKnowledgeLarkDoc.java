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

package com.lark.oapi.service.aily.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.aily.v1.enums.*;
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

public class DataAssetImportKnowledgeLarkDoc {
    /**
     * 云文档类型
     * <p> 示例值：docx
     */
    @SerializedName("type")
    private String type;
    /**
     * 云文档标识
     * <p> 示例值：T8FAcuilgC1fdaxkt58vcp91xngh
     */
    @SerializedName("token")
    private String token;
    /**
     * 是否包含子文档，只有wiki类型的云文档支持
     * <p> 示例值：
     */
    @SerializedName("with_sub_docs")
    private Boolean withSubDocs;

    // builder 开始
    public DataAssetImportKnowledgeLarkDoc() {
    }

    public DataAssetImportKnowledgeLarkDoc(Builder builder) {
        /**
         * 云文档类型
         * <p> 示例值：docx
         */
        this.type = builder.type;
        /**
         * 云文档标识
         * <p> 示例值：T8FAcuilgC1fdaxkt58vcp91xngh
         */
        this.token = builder.token;
        /**
         * 是否包含子文档，只有wiki类型的云文档支持
         * <p> 示例值：
         */
        this.withSubDocs = builder.withSubDocs;
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

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Boolean getWithSubDocs() {
        return this.withSubDocs;
    }

    public void setWithSubDocs(Boolean withSubDocs) {
        this.withSubDocs = withSubDocs;
    }

    public static class Builder {
        /**
         * 云文档类型
         * <p> 示例值：docx
         */
        private String type;
        /**
         * 云文档标识
         * <p> 示例值：T8FAcuilgC1fdaxkt58vcp91xngh
         */
        private String token;
        /**
         * 是否包含子文档，只有wiki类型的云文档支持
         * <p> 示例值：
         */
        private Boolean withSubDocs;

        /**
         * 云文档类型
         * <p> 示例值：docx
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * 云文档类型
         * <p> 示例值：docx
         *
         * @param type {@link com.lark.oapi.service.aily.v1.enums.DataAssetImportKnowledgeLarkDocTypeEnum}
         * @return
         */
        public Builder type(com.lark.oapi.service.aily.v1.enums.DataAssetImportKnowledgeLarkDocTypeEnum type) {
            this.type = type.getValue();
            return this;
        }


        /**
         * 云文档标识
         * <p> 示例值：T8FAcuilgC1fdaxkt58vcp91xngh
         *
         * @param token
         * @return
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }


        /**
         * 是否包含子文档，只有wiki类型的云文档支持
         * <p> 示例值：
         *
         * @param withSubDocs
         * @return
         */
        public Builder withSubDocs(Boolean withSubDocs) {
            this.withSubDocs = withSubDocs;
            return this;
        }


        public DataAssetImportKnowledgeLarkDoc build() {
            return new DataAssetImportKnowledgeLarkDoc(this);
        }
    }
}
