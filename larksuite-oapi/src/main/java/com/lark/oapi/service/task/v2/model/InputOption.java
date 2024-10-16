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

package com.lark.oapi.service.task.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.task.v2.enums.*;
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

public class InputOption {
    /**
     * 选项名称
     * <p> 示例值：高优
     */
    @SerializedName("name")
    private String name;
    /**
     * 颜色索引值，支持0～54中的一个数字。如果不填写，则会随机选一个。
     * <p> 示例值：10
     */
    @SerializedName("color_index")
    private Integer colorIndex;
    /**
     * 要放到某个option之前的option_guid
     * <p> 示例值：2bd905f8-ef38-408b-aa1f-2b2ad33b2913
     */
    @SerializedName("insert_before")
    private String insertBefore;
    /**
     * 要放到某个option之后的option_guid
     * <p> 示例值：b13adf3c-cad6-4e02-8929-550c112b5633
     */
    @SerializedName("insert_after")
    private String insertAfter;
    /**
     * 是否隐藏
     * <p> 示例值：false
     */
    @SerializedName("is_hidden")
    private Boolean isHidden;

    // builder 开始
    public InputOption() {
    }

    public InputOption(Builder builder) {
        /**
         * 选项名称
         * <p> 示例值：高优
         */
        this.name = builder.name;
        /**
         * 颜色索引值，支持0～54中的一个数字。如果不填写，则会随机选一个。
         * <p> 示例值：10
         */
        this.colorIndex = builder.colorIndex;
        /**
         * 要放到某个option之前的option_guid
         * <p> 示例值：2bd905f8-ef38-408b-aa1f-2b2ad33b2913
         */
        this.insertBefore = builder.insertBefore;
        /**
         * 要放到某个option之后的option_guid
         * <p> 示例值：b13adf3c-cad6-4e02-8929-550c112b5633
         */
        this.insertAfter = builder.insertAfter;
        /**
         * 是否隐藏
         * <p> 示例值：false
         */
        this.isHidden = builder.isHidden;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getColorIndex() {
        return this.colorIndex;
    }

    public void setColorIndex(Integer colorIndex) {
        this.colorIndex = colorIndex;
    }

    public String getInsertBefore() {
        return this.insertBefore;
    }

    public void setInsertBefore(String insertBefore) {
        this.insertBefore = insertBefore;
    }

    public String getInsertAfter() {
        return this.insertAfter;
    }

    public void setInsertAfter(String insertAfter) {
        this.insertAfter = insertAfter;
    }

    public Boolean getIsHidden() {
        return this.isHidden;
    }

    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    public static class Builder {
        /**
         * 选项名称
         * <p> 示例值：高优
         */
        private String name;
        /**
         * 颜色索引值，支持0～54中的一个数字。如果不填写，则会随机选一个。
         * <p> 示例值：10
         */
        private Integer colorIndex;
        /**
         * 要放到某个option之前的option_guid
         * <p> 示例值：2bd905f8-ef38-408b-aa1f-2b2ad33b2913
         */
        private String insertBefore;
        /**
         * 要放到某个option之后的option_guid
         * <p> 示例值：b13adf3c-cad6-4e02-8929-550c112b5633
         */
        private String insertAfter;
        /**
         * 是否隐藏
         * <p> 示例值：false
         */
        private Boolean isHidden;

        /**
         * 选项名称
         * <p> 示例值：高优
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 颜色索引值，支持0～54中的一个数字。如果不填写，则会随机选一个。
         * <p> 示例值：10
         *
         * @param colorIndex
         * @return
         */
        public Builder colorIndex(Integer colorIndex) {
            this.colorIndex = colorIndex;
            return this;
        }


        /**
         * 要放到某个option之前的option_guid
         * <p> 示例值：2bd905f8-ef38-408b-aa1f-2b2ad33b2913
         *
         * @param insertBefore
         * @return
         */
        public Builder insertBefore(String insertBefore) {
            this.insertBefore = insertBefore;
            return this;
        }


        /**
         * 要放到某个option之后的option_guid
         * <p> 示例值：b13adf3c-cad6-4e02-8929-550c112b5633
         *
         * @param insertAfter
         * @return
         */
        public Builder insertAfter(String insertAfter) {
            this.insertAfter = insertAfter;
            return this;
        }


        /**
         * 是否隐藏
         * <p> 示例值：false
         *
         * @param isHidden
         * @return
         */
        public Builder isHidden(Boolean isHidden) {
            this.isHidden = isHidden;
            return this;
        }


        public InputOption build() {
            return new InputOption(this);
        }
    }
}
