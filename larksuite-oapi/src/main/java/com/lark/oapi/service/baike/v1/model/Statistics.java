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

package com.lark.oapi.service.baike.v1.model;

import com.google.gson.annotations.SerializedName;

public class Statistics {
    /**
     * 累计点赞
     * <p> 示例值：55
     */
    @SerializedName("like_count")
    private Integer likeCount;
    /**
     * 当前词条版本收到的负反馈数量
     * <p> 示例值：3
     */
    @SerializedName("dislike_count")
    private Integer dislikeCount;

    // builder 开始
    public Statistics() {
    }

    public Statistics(Builder builder) {
        /**
         * 累计点赞
         * <p> 示例值：55
         */
        this.likeCount = builder.likeCount;
        /**
         * 当前词条版本收到的负反馈数量
         * <p> 示例值：3
         */
        this.dislikeCount = builder.dislikeCount;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getLikeCount() {
        return this.likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getDislikeCount() {
        return this.dislikeCount;
    }

    public void setDislikeCount(Integer dislikeCount) {
        this.dislikeCount = dislikeCount;
    }

    public static class Builder {
        /**
         * 累计点赞
         * <p> 示例值：55
         */
        private Integer likeCount;
        /**
         * 当前词条版本收到的负反馈数量
         * <p> 示例值：3
         */
        private Integer dislikeCount;

        /**
         * 累计点赞
         * <p> 示例值：55
         *
         * @param likeCount
         * @return
         */
        public Builder likeCount(Integer likeCount) {
            this.likeCount = likeCount;
            return this;
        }


        /**
         * 当前词条版本收到的负反馈数量
         * <p> 示例值：3
         *
         * @param dislikeCount
         * @return
         */
        public Builder dislikeCount(Integer dislikeCount) {
            this.dislikeCount = dislikeCount;
            return this;
        }


        public Statistics build() {
            return new Statistics(this);
        }
    }
}
