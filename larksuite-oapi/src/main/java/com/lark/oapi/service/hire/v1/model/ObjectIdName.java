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

import com.google.gson.annotations.SerializedName;

public class ObjectIdName {
    /**
     * 内推职位 ID
     * <p> 示例值：7410744543304468773
     */
    @SerializedName("id")
    private String id;
    /**
     * 内推职位名称
     * <p> 示例值：上海后端研发
     */
    @SerializedName("name")
    private String name;

    // builder 开始
    public ObjectIdName() {
    }

    public ObjectIdName(Builder builder) {
        /**
         * 内推职位 ID
         * <p> 示例值：7410744543304468773
         */
        this.id = builder.id;
        /**
         * 内推职位名称
         * <p> 示例值：上海后端研发
         */
        this.name = builder.name;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class Builder {
        /**
         * 内推职位 ID
         * <p> 示例值：7410744543304468773
         */
        private String id;
        /**
         * 内推职位名称
         * <p> 示例值：上海后端研发
         */
        private String name;

        /**
         * 内推职位 ID
         * <p> 示例值：7410744543304468773
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 内推职位名称
         * <p> 示例值：上海后端研发
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        public ObjectIdName build() {
            return new ObjectIdName(this);
        }
    }
}
