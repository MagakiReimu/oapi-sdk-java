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

package com.lark.oapi.service.moments.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.moments.v1.enums.*;
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

public class ReactionSet {
    /**
     * 表情列表
     * <p> 示例值：
     */
    @SerializedName("reactions")
    private ReactionList[] reactions;
    /**
     * 全部表情计数
     * <p> 示例值：20
     */
    @SerializedName("total_count")
    private Integer totalCount;

    // builder 开始
    public ReactionSet() {
    }

    public ReactionSet(Builder builder) {
        /**
         * 表情列表
         * <p> 示例值：
         */
        this.reactions = builder.reactions;
        /**
         * 全部表情计数
         * <p> 示例值：20
         */
        this.totalCount = builder.totalCount;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public ReactionList[] getReactions() {
        return this.reactions;
    }

    public void setReactions(ReactionList[] reactions) {
        this.reactions = reactions;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class Builder {
        /**
         * 表情列表
         * <p> 示例值：
         */
        private ReactionList[] reactions;
        /**
         * 全部表情计数
         * <p> 示例值：20
         */
        private Integer totalCount;

        /**
         * 表情列表
         * <p> 示例值：
         *
         * @param reactions
         * @return
         */
        public Builder reactions(ReactionList[] reactions) {
            this.reactions = reactions;
            return this;
        }


        /**
         * 全部表情计数
         * <p> 示例值：20
         *
         * @param totalCount
         * @return
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }


        public ReactionSet build() {
            return new ReactionSet(this);
        }
    }
}
