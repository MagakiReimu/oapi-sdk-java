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

package com.lark.oapi.service.docx.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.docx.v1.enums.*;
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

public class TableMergeInfo {
    /**
     * 从当前行索引起被合并的连续行数
     * <p> 示例值：2
     */
    @SerializedName("row_span")
    private Integer rowSpan;
    /**
     * 从当前列索引起被合并的连续列数
     * <p> 示例值：2
     */
    @SerializedName("col_span")
    private Integer colSpan;

    // builder 开始
    public TableMergeInfo() {
    }

    public TableMergeInfo(Builder builder) {
        /**
         * 从当前行索引起被合并的连续行数
         * <p> 示例值：2
         */
        this.rowSpan = builder.rowSpan;
        /**
         * 从当前列索引起被合并的连续列数
         * <p> 示例值：2
         */
        this.colSpan = builder.colSpan;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getRowSpan() {
        return this.rowSpan;
    }

    public void setRowSpan(Integer rowSpan) {
        this.rowSpan = rowSpan;
    }

    public Integer getColSpan() {
        return this.colSpan;
    }

    public void setColSpan(Integer colSpan) {
        this.colSpan = colSpan;
    }

    public static class Builder {
        /**
         * 从当前行索引起被合并的连续行数
         * <p> 示例值：2
         */
        private Integer rowSpan;
        /**
         * 从当前列索引起被合并的连续列数
         * <p> 示例值：2
         */
        private Integer colSpan;

        /**
         * 从当前行索引起被合并的连续行数
         * <p> 示例值：2
         *
         * @param rowSpan
         * @return
         */
        public Builder rowSpan(Integer rowSpan) {
            this.rowSpan = rowSpan;
            return this;
        }


        /**
         * 从当前列索引起被合并的连续列数
         * <p> 示例值：2
         *
         * @param colSpan
         * @return
         */
        public Builder colSpan(Integer colSpan) {
            this.colSpan = colSpan;
            return this;
        }


        public TableMergeInfo build() {
            return new TableMergeInfo(this);
        }
    }
}
