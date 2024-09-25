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

package com.lark.oapi.service.approval.v4.model;

import com.google.gson.annotations.SerializedName;

public class Count {
    /**
     * 总数，大于等于 1000 个项目时将返回 999
     * <p> 示例值：123
     */
    @SerializedName("total")
    private Integer total;
    /**
     * 还有更多，当大于等于 1000 时将返回 true
     * <p> 示例值：false
     */
    @SerializedName("has_more")
    private Boolean hasMore;

    // builder 开始
    public Count() {
    }

    public Count(Builder builder) {
        /**
         * 总数，大于等于 1000 个项目时将返回 999
         * <p> 示例值：123
         */
        this.total = builder.total;
        /**
         * 还有更多，当大于等于 1000 时将返回 true
         * <p> 示例值：false
         */
        this.hasMore = builder.hasMore;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getTotal() {
        return this.total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Boolean getHasMore() {
        return this.hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public static class Builder {
        /**
         * 总数，大于等于 1000 个项目时将返回 999
         * <p> 示例值：123
         */
        private Integer total;
        /**
         * 还有更多，当大于等于 1000 时将返回 true
         * <p> 示例值：false
         */
        private Boolean hasMore;

        /**
         * 总数，大于等于 1000 个项目时将返回 999
         * <p> 示例值：123
         *
         * @param total
         * @return
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }


        /**
         * 还有更多，当大于等于 1000 时将返回 true
         * <p> 示例值：false
         *
         * @param hasMore
         * @return
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }


        public Count build() {
            return new Count(this);
        }
    }
}
