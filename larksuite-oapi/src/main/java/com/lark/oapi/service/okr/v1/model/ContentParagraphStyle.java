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

package com.lark.oapi.service.okr.v1.model;

import com.google.gson.annotations.SerializedName;

public class ContentParagraphStyle {
    /**
     * 有序列表/无序列表/任务列表
     * <p> 示例值：
     */
    @SerializedName("list")
    private ContentList list;

    // builder 开始
    public ContentParagraphStyle() {
    }

    public ContentParagraphStyle(Builder builder) {
        /**
         * 有序列表/无序列表/任务列表
         * <p> 示例值：
         */
        this.list = builder.list;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public ContentList getList() {
        return this.list;
    }

    public void setList(ContentList list) {
        this.list = list;
    }

    public static class Builder {
        /**
         * 有序列表/无序列表/任务列表
         * <p> 示例值：
         */
        private ContentList list;

        /**
         * 有序列表/无序列表/任务列表
         * <p> 示例值：
         *
         * @param list
         * @return
         */
        public Builder list(ContentList list) {
            this.list = list;
            return this;
        }


        public ContentParagraphStyle build() {
            return new ContentParagraphStyle(this);
        }
    }
}
