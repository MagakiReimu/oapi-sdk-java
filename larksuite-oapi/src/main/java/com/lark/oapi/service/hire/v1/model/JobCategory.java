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

import com.lark.oapi.core.response.EmptyData;
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

public class JobCategory {
    /**
     * 职位序列 ID
     * <p> 示例值：6301
     */
    @SerializedName("id")
    private String id;
    /**
     * 职位序列中文名称
     * <p> 示例值：序列-A
     */
    @SerializedName("zh_name")
    private String zhName;
    /**
     * 职位序列英文名称
     * <p> 示例值：category-A
     */
    @SerializedName("en_name")
    private String enName;
    /**
     * 职位序列启用状态
     * <p> 示例值：1
     */
    @SerializedName("active_status")
    private Integer activeStatus;

    // builder 开始
    public JobCategory() {
    }

    public JobCategory(Builder builder) {
        /**
         * 职位序列 ID
         * <p> 示例值：6301
         */
        this.id = builder.id;
        /**
         * 职位序列中文名称
         * <p> 示例值：序列-A
         */
        this.zhName = builder.zhName;
        /**
         * 职位序列英文名称
         * <p> 示例值：category-A
         */
        this.enName = builder.enName;
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

    public String getZhName() {
        return this.zhName;
    }

    public void setZhName(String zhName) {
        this.zhName = zhName;
    }

    public String getEnName() {
        return this.enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
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
         * 职位序列中文名称
         * <p> 示例值：序列-A
         */
        private String zhName;
        /**
         * 职位序列英文名称
         * <p> 示例值：category-A
         */
        private String enName;
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
         * 职位序列中文名称
         * <p> 示例值：序列-A
         *
         * @param zhName
         * @return
         */
        public Builder zhName(String zhName) {
            this.zhName = zhName;
            return this;
        }


        /**
         * 职位序列英文名称
         * <p> 示例值：category-A
         *
         * @param enName
         * @return
         */
        public Builder enName(String enName) {
            this.enName = enName;
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


        public JobCategory build() {
            return new JobCategory(this);
        }
    }
}
