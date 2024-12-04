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

public class BatchQueryAgencyReqBody {
    /**
     * 猎头供应商 ID 列表，当传递此值，以此值为准，其余查询字段失效
     * <p> 示例值：
     */
    @SerializedName("agency_supplier_id_list")
    private String[] agencySupplierIdList;
    /**
     * 搜索关键字，可传入名称或邮箱
     * <p> 示例值：猎头
     */
    @SerializedName("keyword")
    private String keyword;
    /**
     * 筛选项，相同的 Key 仅可传一次
     * <p> 示例值：
     */
    @SerializedName("filter_list")
    private CommonFilter[] filterList;

    // builder 开始
    public BatchQueryAgencyReqBody() {
    }

    public BatchQueryAgencyReqBody(Builder builder) {
        /**
         * 猎头供应商 ID 列表，当传递此值，以此值为准，其余查询字段失效
         * <p> 示例值：
         */
        this.agencySupplierIdList = builder.agencySupplierIdList;
        /**
         * 搜索关键字，可传入名称或邮箱
         * <p> 示例值：猎头
         */
        this.keyword = builder.keyword;
        /**
         * 筛选项，相同的 Key 仅可传一次
         * <p> 示例值：
         */
        this.filterList = builder.filterList;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String[] getAgencySupplierIdList() {
        return this.agencySupplierIdList;
    }

    public void setAgencySupplierIdList(String[] agencySupplierIdList) {
        this.agencySupplierIdList = agencySupplierIdList;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public CommonFilter[] getFilterList() {
        return this.filterList;
    }

    public void setFilterList(CommonFilter[] filterList) {
        this.filterList = filterList;
    }

    public static class Builder {
        /**
         * 猎头供应商 ID 列表，当传递此值，以此值为准，其余查询字段失效
         * <p> 示例值：
         */
        private String[] agencySupplierIdList;
        /**
         * 搜索关键字，可传入名称或邮箱
         * <p> 示例值：猎头
         */
        private String keyword;
        /**
         * 筛选项，相同的 Key 仅可传一次
         * <p> 示例值：
         */
        private CommonFilter[] filterList;

        /**
         * 猎头供应商 ID 列表，当传递此值，以此值为准，其余查询字段失效
         * <p> 示例值：
         *
         * @param agencySupplierIdList
         * @return
         */
        public Builder agencySupplierIdList(String[] agencySupplierIdList) {
            this.agencySupplierIdList = agencySupplierIdList;
            return this;
        }


        /**
         * 搜索关键字，可传入名称或邮箱
         * <p> 示例值：猎头
         *
         * @param keyword
         * @return
         */
        public Builder keyword(String keyword) {
            this.keyword = keyword;
            return this;
        }


        /**
         * 筛选项，相同的 Key 仅可传一次
         * <p> 示例值：
         *
         * @param filterList
         * @return
         */
        public Builder filterList(CommonFilter[] filterList) {
            this.filterList = filterList;
            return this;
        }


        public BatchQueryAgencyReqBody build() {
            return new BatchQueryAgencyReqBody(this);
        }
    }
}
