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

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.corehr.v1.enums.*;
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

public class IdInfo {
    /**
     * 传入的 ID
     * <p> 示例值：7224321696097404460
     */
    @SerializedName("id")
    private String id;
    /**
     * 目标 ID 值
     * <p> 示例值：7224321696097404461
     */
    @SerializedName("target_id")
    private String targetId;

    // builder 开始
    public IdInfo() {
    }

    public IdInfo(Builder builder) {
        /**
         * 传入的 ID
         * <p> 示例值：7224321696097404460
         */
        this.id = builder.id;
        /**
         * 目标 ID 值
         * <p> 示例值：7224321696097404461
         */
        this.targetId = builder.targetId;
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

    public String getTargetId() {
        return this.targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public static class Builder {
        /**
         * 传入的 ID
         * <p> 示例值：7224321696097404460
         */
        private String id;
        /**
         * 目标 ID 值
         * <p> 示例值：7224321696097404461
         */
        private String targetId;

        /**
         * 传入的 ID
         * <p> 示例值：7224321696097404460
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 目标 ID 值
         * <p> 示例值：7224321696097404461
         *
         * @param targetId
         * @return
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            return this;
        }


        public IdInfo build() {
            return new IdInfo(this);
        }
    }
}
