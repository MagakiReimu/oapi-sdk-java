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

package com.lark.oapi.service.corehr.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.corehr.v2.enums.*;
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

public class FieldVariableValueToObject {
    /**
     * wukong的对象唯一标识
     * <p> 示例值：6863326263210149383
     */
    @SerializedName("wk_id")
    private String wkId;
    /**
     * wukong的元数据唯一标识
     * <p> 示例值：country_region_subdivision
     */
    @SerializedName("wk_api_name")
    private String wkApiName;

    // builder 开始
    public FieldVariableValueToObject() {
    }

    public FieldVariableValueToObject(Builder builder) {
        /**
         * wukong的对象唯一标识
         * <p> 示例值：6863326263210149383
         */
        this.wkId = builder.wkId;
        /**
         * wukong的元数据唯一标识
         * <p> 示例值：country_region_subdivision
         */
        this.wkApiName = builder.wkApiName;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getWkId() {
        return this.wkId;
    }

    public void setWkId(String wkId) {
        this.wkId = wkId;
    }

    public String getWkApiName() {
        return this.wkApiName;
    }

    public void setWkApiName(String wkApiName) {
        this.wkApiName = wkApiName;
    }

    public static class Builder {
        /**
         * wukong的对象唯一标识
         * <p> 示例值：6863326263210149383
         */
        private String wkId;
        /**
         * wukong的元数据唯一标识
         * <p> 示例值：country_region_subdivision
         */
        private String wkApiName;

        /**
         * wukong的对象唯一标识
         * <p> 示例值：6863326263210149383
         *
         * @param wkId
         * @return
         */
        public Builder wkId(String wkId) {
            this.wkId = wkId;
            return this;
        }


        /**
         * wukong的元数据唯一标识
         * <p> 示例值：country_region_subdivision
         *
         * @param wkApiName
         * @return
         */
        public Builder wkApiName(String wkApiName) {
            this.wkApiName = wkApiName;
            return this;
        }


        public FieldVariableValueToObject build() {
            return new FieldVariableValueToObject(this);
        }
    }
}
