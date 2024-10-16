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

import com.lark.oapi.core.response.EmptyData;
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

public class MentionEntity {
    /**
     * 被@人在 content 中的偏移量
     * <p> 示例值：3
     */
    @SerializedName("offset")
    private Integer offset;
    /**
     * 被@人的 user id
     * <p> 示例值：on_94a1ee5551019f18cd73d9f111898cf2
     */
    @SerializedName("user_id")
    private String userId;

    // builder 开始
    public MentionEntity() {
    }

    public MentionEntity(Builder builder) {
        /**
         * 被@人在 content 中的偏移量
         * <p> 示例值：3
         */
        this.offset = builder.offset;
        /**
         * 被@人的 user id
         * <p> 示例值：on_94a1ee5551019f18cd73d9f111898cf2
         */
        this.userId = builder.userId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getOffset() {
        return this.offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public static class Builder {
        /**
         * 被@人在 content 中的偏移量
         * <p> 示例值：3
         */
        private Integer offset;
        /**
         * 被@人的 user id
         * <p> 示例值：on_94a1ee5551019f18cd73d9f111898cf2
         */
        private String userId;

        /**
         * 被@人在 content 中的偏移量
         * <p> 示例值：3
         *
         * @param offset
         * @return
         */
        public Builder offset(Integer offset) {
            this.offset = offset;
            return this;
        }


        /**
         * 被@人的 user id
         * <p> 示例值：on_94a1ee5551019f18cd73d9f111898cf2
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        public MentionEntity build() {
            return new MentionEntity(this);
        }
    }
}
