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

package com.lark.oapi.service.im.v2.model;

import com.google.gson.annotations.SerializedName;

public class OpenAppFeedLink {
    /**
     * 链接
     * <p> 示例值：https://www.feishu.cn/
     */
    @SerializedName("link")
    private String link;

    // builder 开始
    public OpenAppFeedLink() {
    }

    public OpenAppFeedLink(Builder builder) {
        /**
         * 链接
         * <p> 示例值：https://www.feishu.cn/
         */
        this.link = builder.link;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public static class Builder {
        /**
         * 链接
         * <p> 示例值：https://www.feishu.cn/
         */
        private String link;

        /**
         * 链接
         * <p> 示例值：https://www.feishu.cn/
         *
         * @param link
         * @return
         */
        public Builder link(String link) {
            this.link = link;
            return this;
        }


        public OpenAppFeedLink build() {
            return new OpenAppFeedLink(this);
        }
    }
}
