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

public class JobDetailCategory {
    /**
     * 职位序列 ID
     * <p> 示例值：6301
     */
    @SerializedName("id")
    private String id;
    /**
     * 职位序列名称
     * <p> 示例值：
     */
    @SerializedName("name")
    private I18n name;
    /**
     * 职位序列启用状态
     * <p> 示例值：1
     */
    @SerializedName("active_status")
    private Integer activeStatus;

    // builder 开始
    public JobDetailCategory() {
    }

    public JobDetailCategory(Builder builder) {
        /**
         * 职位序列 ID
         * <p> 示例值：6301
         */
        this.id = builder.id;
        /**
         * 职位序列名称
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 职位序列启用状态
         * <p> 示例值：1
         */
        this.activeStatus = builder.activeStatus;
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

    public I18n getName() {
        return this.name;
    }

    public void setName(I18n name) {
        this.name = name;
    }

    public Integer getActiveStatus() {
        return this.activeStatus;
    }

    public void setActiveStatus(Integer activeStatus) {
        this.activeStatus = activeStatus;
    }

    public static class Builder {
        /**
         * 职位序列 ID
         * <p> 示例值：6301
         */
        private String id;
        /**
         * 职位序列名称
         * <p> 示例值：
         */
        private I18n name;
        /**
         * 职位序列启用状态
         * <p> 示例值：1
         */
        private Integer activeStatus;

        /**
         * 职位序列 ID
         * <p> 示例值：6301
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 职位序列名称
         * <p> 示例值：
         *
         * @param name
         * @return
         */
        public Builder name(I18n name) {
            this.name = name;
            return this;
        }


        /**
         * 职位序列启用状态
         * <p> 示例值：1
         *
         * @param activeStatus
         * @return
         */
        public Builder activeStatus(Integer activeStatus) {
            this.activeStatus = activeStatus;
            return this;
        }


        public JobDetailCategory build() {
            return new JobDetailCategory(this);
        }
    }
}
