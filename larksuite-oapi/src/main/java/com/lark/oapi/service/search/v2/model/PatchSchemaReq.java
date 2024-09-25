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

package com.lark.oapi.service.search.v2.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;

public class PatchSchemaReq {
    /**
     * 用户自定义数据范式的唯一标识
     * <p> 示例值：custom_schema_id
     */
    @Path
    @SerializedName("schema_id")
    private String schemaId;
    @Body
    private PatchSchemaReqBody body;

    // builder 开始
    public PatchSchemaReq() {
    }

    public PatchSchemaReq(Builder builder) {
        /**
         * 用户自定义数据范式的唯一标识
         * <p> 示例值：custom_schema_id
         */
        this.schemaId = builder.schemaId;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getSchemaId() {
        return this.schemaId;
    }

    public void setSchemaId(String schemaId) {
        this.schemaId = schemaId;
    }

    public PatchSchemaReqBody getPatchSchemaReqBody() {
        return this.body;
    }

    public void setPatchSchemaReqBody(PatchSchemaReqBody body) {
        this.body = body;
    }

    public static class Builder {

        private String schemaId; // 用户自定义数据范式的唯一标识
        private PatchSchemaReqBody body;

        /**
         * 用户自定义数据范式的唯一标识
         * <p> 示例值：custom_schema_id
         *
         * @param schemaId
         * @return
         */
        public Builder schemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }

        public PatchSchemaReqBody getPatchSchemaReqBody() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder patchSchemaReqBody(PatchSchemaReqBody body) {
            this.body = body;
            return this;
        }

        public PatchSchemaReq build() {
            return new PatchSchemaReq(this);
        }
    }
}
