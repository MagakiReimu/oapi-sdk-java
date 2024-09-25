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

package com.lark.oapi.service.document_ai.v1.model;

import com.google.gson.annotations.SerializedName;

public class DocChunkTableRow {
    /**
     * 表格解析单行数据
     * <p> 示例值：
     */
    @SerializedName("row_cells")
    private DocChunkTableCell[] rowCells;

    // builder 开始
    public DocChunkTableRow() {
    }

    public DocChunkTableRow(Builder builder) {
        /**
         * 表格解析单行数据
         * <p> 示例值：
         */
        this.rowCells = builder.rowCells;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public DocChunkTableCell[] getRowCells() {
        return this.rowCells;
    }

    public void setRowCells(DocChunkTableCell[] rowCells) {
        this.rowCells = rowCells;
    }

    public static class Builder {
        /**
         * 表格解析单行数据
         * <p> 示例值：
         */
        private DocChunkTableCell[] rowCells;

        /**
         * 表格解析单行数据
         * <p> 示例值：
         *
         * @param rowCells
         * @return
         */
        public Builder rowCells(DocChunkTableCell[] rowCells) {
            this.rowCells = rowCells;
            return this;
        }


        public DocChunkTableRow build() {
            return new DocChunkTableRow(this);
        }
    }
}
