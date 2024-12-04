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
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class GetSpreadsheetSheetFilterViewConditionReq {
    /**
     * 表格 token
     * <p> 示例值：shtcnmBA*****yGehy8
     */
    @Path
    @SerializedName("spreadsheet_token")
    private String spreadsheetToken;
    /**
     * 子表 id
     * <p> 示例值：0b**12
     */
    @Path
    @SerializedName("sheet_id")
    private String sheetId;
    /**
     * 筛选视图 id
     * <p> 示例值：pH9hbVcCXA
     */
    @Path
    @SerializedName("filter_view_id")
    private String filterViewId;
    /**
     * 需要查询筛选条件的列字母号
     * <p> 示例值：E
     */
    @Path
    @SerializedName("condition_id")
    private String conditionId;

    // builder 开始
    public GetSpreadsheetSheetFilterViewConditionReq() {
    }

    public GetSpreadsheetSheetFilterViewConditionReq(Builder builder) {
        /**
         * 表格 token
         * <p> 示例值：shtcnmBA*****yGehy8
         */
        this.spreadsheetToken = builder.spreadsheetToken;
        /**
         * 子表 id
         * <p> 示例值：0b**12
         */
        this.sheetId = builder.sheetId;
        /**
         * 筛选视图 id
         * <p> 示例值：pH9hbVcCXA
         */
        this.filterViewId = builder.filterViewId;
        /**
         * 需要查询筛选条件的列字母号
         * <p> 示例值：E
         */
        this.conditionId = builder.conditionId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getSpreadsheetToken() {
        return this.spreadsheetToken;
    }

    public void setSpreadsheetToken(String spreadsheetToken) {
        this.spreadsheetToken = spreadsheetToken;
    }

    public String getSheetId() {
        return this.sheetId;
    }

    public void setSheetId(String sheetId) {
        this.sheetId = sheetId;
    }

    public String getFilterViewId() {
        return this.filterViewId;
    }

    public void setFilterViewId(String filterViewId) {
        this.filterViewId = filterViewId;
    }

    public String getConditionId() {
        return this.conditionId;
    }

    public void setConditionId(String conditionId) {
        this.conditionId = conditionId;
    }

    public static class Builder {

        private String spreadsheetToken; // 表格 token
        private String sheetId; // 子表 id
        private String filterViewId; // 筛选视图 id
        private String conditionId; // 需要查询筛选条件的列字母号

        /**
         * 表格 token
         * <p> 示例值：shtcnmBA*****yGehy8
         *
         * @param spreadsheetToken
         * @return
         */
        public Builder spreadsheetToken(String spreadsheetToken) {
            this.spreadsheetToken = spreadsheetToken;
            return this;
        }


        /**
         * 子表 id
         * <p> 示例值：0b**12
         *
         * @param sheetId
         * @return
         */
        public Builder sheetId(String sheetId) {
            this.sheetId = sheetId;
            return this;
        }


        /**
         * 筛选视图 id
         * <p> 示例值：pH9hbVcCXA
         *
         * @param filterViewId
         * @return
         */
        public Builder filterViewId(String filterViewId) {
            this.filterViewId = filterViewId;
            return this;
        }


        /**
         * 需要查询筛选条件的列字母号
         * <p> 示例值：E
         *
         * @param conditionId
         * @return
         */
        public Builder conditionId(String conditionId) {
            this.conditionId = conditionId;
            return this;
        }


        public GetSpreadsheetSheetFilterViewConditionReq build() {
            return new GetSpreadsheetSheetFilterViewConditionReq(this);
        }
    }
}
