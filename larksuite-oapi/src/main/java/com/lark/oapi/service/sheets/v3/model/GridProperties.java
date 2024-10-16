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

package com.lark.oapi.service.sheets.v3.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.sheets.v3.enums.*;
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

public class GridProperties {
    /**
     * 冻结的行数量
     * <p> 示例值：0
     */
    @SerializedName("frozen_row_count")
    private Integer frozenRowCount;
    /**
     * 冻结的列数量
     * <p> 示例值：0
     */
    @SerializedName("frozen_column_count")
    private Integer frozenColumnCount;
    /**
     * 工作表的行数
     * <p> 示例值：200
     */
    @SerializedName("row_count")
    private Integer rowCount;
    /**
     * 工作表的列数量
     * <p> 示例值：20
     */
    @SerializedName("column_count")
    private Integer columnCount;

    // builder 开始
    public GridProperties() {
    }

    public GridProperties(Builder builder) {
        /**
         * 冻结的行数量
         * <p> 示例值：0
         */
        this.frozenRowCount = builder.frozenRowCount;
        /**
         * 冻结的列数量
         * <p> 示例值：0
         */
        this.frozenColumnCount = builder.frozenColumnCount;
        /**
         * 工作表的行数
         * <p> 示例值：200
         */
        this.rowCount = builder.rowCount;
        /**
         * 工作表的列数量
         * <p> 示例值：20
         */
        this.columnCount = builder.columnCount;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getFrozenRowCount() {
        return this.frozenRowCount;
    }

    public void setFrozenRowCount(Integer frozenRowCount) {
        this.frozenRowCount = frozenRowCount;
    }

    public Integer getFrozenColumnCount() {
        return this.frozenColumnCount;
    }

    public void setFrozenColumnCount(Integer frozenColumnCount) {
        this.frozenColumnCount = frozenColumnCount;
    }

    public Integer getRowCount() {
        return this.rowCount;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    public Integer getColumnCount() {
        return this.columnCount;
    }

    public void setColumnCount(Integer columnCount) {
        this.columnCount = columnCount;
    }

    public static class Builder {
        /**
         * 冻结的行数量
         * <p> 示例值：0
         */
        private Integer frozenRowCount;
        /**
         * 冻结的列数量
         * <p> 示例值：0
         */
        private Integer frozenColumnCount;
        /**
         * 工作表的行数
         * <p> 示例值：200
         */
        private Integer rowCount;
        /**
         * 工作表的列数量
         * <p> 示例值：20
         */
        private Integer columnCount;

        /**
         * 冻结的行数量
         * <p> 示例值：0
         *
         * @param frozenRowCount
         * @return
         */
        public Builder frozenRowCount(Integer frozenRowCount) {
            this.frozenRowCount = frozenRowCount;
            return this;
        }


        /**
         * 冻结的列数量
         * <p> 示例值：0
         *
         * @param frozenColumnCount
         * @return
         */
        public Builder frozenColumnCount(Integer frozenColumnCount) {
            this.frozenColumnCount = frozenColumnCount;
            return this;
        }


        /**
         * 工作表的行数
         * <p> 示例值：200
         *
         * @param rowCount
         * @return
         */
        public Builder rowCount(Integer rowCount) {
            this.rowCount = rowCount;
            return this;
        }


        /**
         * 工作表的列数量
         * <p> 示例值：20
         *
         * @param columnCount
         * @return
         */
        public Builder columnCount(Integer columnCount) {
            this.columnCount = columnCount;
            return this;
        }


        public GridProperties build() {
            return new GridProperties(this);
        }
    }
}
