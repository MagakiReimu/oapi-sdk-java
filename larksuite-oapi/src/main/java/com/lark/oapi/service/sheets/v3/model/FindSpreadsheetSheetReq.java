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

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;

public class FindSpreadsheetSheetReq {
    /**
     * 表格的token，获取方式见[如何获取云文档资源相关 token](https://open.feishu.cn/document/ukTMukTMukTM/uczNzUjL3czM14yN3MTN)
     * <p> 示例值：shtcnmBA*****yGehy8
     */
    @Path
    @SerializedName("spreadsheet_token")
    private String spreadsheetToken;
    /**
     * 工作表的id，获取方式见[获取工作表](https://open.feishu.cn/document/ukTMukTMukTM/uUDN04SN0QjL1QDN/sheets-v3/spreadsheet-sheet/query)
     * <p> 示例值：0b**12
     */
    @Path
    @SerializedName("sheet_id")
    private String sheetId;
    @Body
    private Find body;

    // builder 开始
    public FindSpreadsheetSheetReq() {
    }

    public FindSpreadsheetSheetReq(Builder builder) {
        /**
         * 表格的token，获取方式见[如何获取云文档资源相关 token](https://open.feishu.cn/document/ukTMukTMukTM/uczNzUjL3czM14yN3MTN)
         * <p> 示例值：shtcnmBA*****yGehy8
         */
        this.spreadsheetToken = builder.spreadsheetToken;
        /**
         * 工作表的id，获取方式见[获取工作表](https://open.feishu.cn/document/ukTMukTMukTM/uUDN04SN0QjL1QDN/sheets-v3/spreadsheet-sheet/query)
         * <p> 示例值：0b**12
         */
        this.sheetId = builder.sheetId;
        this.body = builder.body;
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

    public Find getFind() {
        return this.body;
    }

    public void setFind(Find body) {
        this.body = body;
    }

    public static class Builder {

        private String spreadsheetToken; // 表格的token，获取方式见[如何获取云文档资源相关 token](https://open.feishu.cn/document/ukTMukTMukTM/uczNzUjL3czM14yN3MTN)
        private String sheetId; // 工作表的id，获取方式见[获取工作表](https://open.feishu.cn/document/ukTMukTMukTM/uUDN04SN0QjL1QDN/sheets-v3/spreadsheet-sheet/query)
        private Find body;

        /**
         * 表格的token，获取方式见[如何获取云文档资源相关 token](https://open.feishu.cn/document/ukTMukTMukTM/uczNzUjL3czM14yN3MTN)
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
         * 工作表的id，获取方式见[获取工作表](https://open.feishu.cn/document/ukTMukTMukTM/uUDN04SN0QjL1QDN/sheets-v3/spreadsheet-sheet/query)
         * <p> 示例值：0b**12
         *
         * @param sheetId
         * @return
         */
        public Builder sheetId(String sheetId) {
            this.sheetId = sheetId;
            return this;
        }

        public Find getFind() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder find(Find body) {
            this.body = body;
            return this;
        }

        public FindSpreadsheetSheetReq build() {
            return new FindSpreadsheetSheetReq(this);
        }
    }
}
