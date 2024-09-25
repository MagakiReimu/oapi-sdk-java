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

import com.google.gson.annotations.SerializedName;

public class PostStatistics {
    /**
     * 分享次数
     * <p> 示例值：1
     */
    @SerializedName("share_count")
    private Integer shareCount;

    // builder 开始
    public PostStatistics() {
    }

    public PostStatistics(Builder builder) {
        /**
         * 分享次数
         * <p> 示例值：1
         */
        this.shareCount = builder.shareCount;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getShareCount() {
        return this.shareCount;
    }

    public void setShareCount(Integer shareCount) {
        this.shareCount = shareCount;
    }

    public static class Builder {
        /**
         * 分享次数
         * <p> 示例值：1
         */
        private Integer shareCount;

        /**
         * 分享次数
         * <p> 示例值：1
         *
         * @param shareCount
         * @return
         */
        public Builder shareCount(Integer shareCount) {
            this.shareCount = shareCount;
            return this;
        }


        public PostStatistics build() {
            return new PostStatistics(this);
        }
    }
}
