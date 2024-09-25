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

import com.google.gson.annotations.SerializedName;

public class AilyKnowledgeDatatable {
    /**
     * 数据表ID
     * <p> 示例值：object_x
     */
    @SerializedName("api_name")
    private String apiName;
    /**
     * 数据表标题
     * <p> 示例值：title
     */
    @SerializedName("title")
    private String title;

    // builder 开始
    public AilyKnowledgeDatatable() {
    }

    public AilyKnowledgeDatatable(Builder builder) {
        /**
         * 数据表ID
         * <p> 示例值：object_x
         */
        this.apiName = builder.apiName;
        /**
         * 数据表标题
         * <p> 示例值：title
         */
        this.title = builder.title;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getApiName() {
        return this.apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static class Builder {
        /**
         * 数据表ID
         * <p> 示例值：object_x
         */
        private String apiName;
        /**
         * 数据表标题
         * <p> 示例值：title
         */
        private String title;

        /**
         * 数据表ID
         * <p> 示例值：object_x
         *
         * @param apiName
         * @return
         */
        public Builder apiName(String apiName) {
            this.apiName = apiName;
            return this;
        }


        /**
         * 数据表标题
         * <p> 示例值：title
         *
         * @param title
         * @return
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }


        public AilyKnowledgeDatatable build() {
            return new AilyKnowledgeDatatable(this);
        }
    }
}
