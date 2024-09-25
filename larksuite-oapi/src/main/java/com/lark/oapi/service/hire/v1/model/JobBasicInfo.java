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

public class JobBasicInfo {
    /**
     * 职位 ID
     * <p> 示例值：6956499586395523359
     */
    @SerializedName("id")
    private String id;
    /**
     * 职位名称
     * <p> 示例值：后端研发工程师
     */
    @SerializedName("name")
    private String name;
    /**
     * 职位编码
     * <p> 示例值：A75256
     */
    @SerializedName("code")
    private String code;

    // builder 开始
    public JobBasicInfo() {
    }

    public JobBasicInfo(Builder builder) {
        /**
         * 职位 ID
         * <p> 示例值：6956499586395523359
         */
        this.id = builder.id;
        /**
         * 职位名称
         * <p> 示例值：后端研发工程师
         */
        this.name = builder.name;
        /**
         * 职位编码
         * <p> 示例值：A75256
         */
        this.code = builder.code;
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

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static class Builder {
        /**
         * 职位 ID
         * <p> 示例值：6956499586395523359
         */
        private String id;
        /**
         * 职位名称
         * <p> 示例值：后端研发工程师
         */
        private String name;
        /**
         * 职位编码
         * <p> 示例值：A75256
         */
        private String code;

        /**
         * 职位 ID
         * <p> 示例值：6956499586395523359
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 职位名称
         * <p> 示例值：后端研发工程师
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 职位编码
         * <p> 示例值：A75256
         *
         * @param code
         * @return
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }


        public JobBasicInfo build() {
            return new JobBasicInfo(this);
        }
    }
}
