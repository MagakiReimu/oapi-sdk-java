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

public class FindCondition {
    /**
     * 查找范围，参考 [名词解释 Range](https://open.feishu.cn/document/ukTMukTMukTM/uATMzUjLwEzM14CMxMTN/overview)
     * <p> 示例值：PNIfrm!A1:C5
     */
    @SerializedName("range")
    private String range;
    /**
     * 是否忽略大小写，默认为 false;- `true`：表示忽略字符串中字母大小写差异;- `false`：表示区分字符串中字母大小写
     * <p> 示例值：true
     */
    @SerializedName("match_case")
    private Boolean matchCase;
    /**
     * 是否完全匹配整个单元格，默认值为 false;- `true`：表示完全匹配单元格，比如 find 取值为 "hello"，则单元格中的内容必须为 "hello";- `false`：表示允许部分匹配单元格，比如 find 取值为 "hello"，则单元格中的内容包含 "hello" 即可
     * <p> 示例值：false
     */
    @SerializedName("match_entire_cell")
    private Boolean matchEntireCell;
    /**
     * 是否为正则匹配，默认值为 false;- `true`：表示使用正则匹配;- `false`：表示不使用正则匹配
     * <p> 示例值：false
     */
    @SerializedName("search_by_regex")
    private Boolean searchByRegex;
    /**
     * 是否仅搜索单元格公式，默认值为 false;- `true`：表示仅搜索单元格公式;- `false`：表示仅搜索单元格内容
     * <p> 示例值：false
     */
    @SerializedName("include_formulas")
    private Boolean includeFormulas;

    // builder 开始
    public FindCondition() {
    }

    public FindCondition(Builder builder) {
        /**
         * 查找范围，参考 [名词解释 Range](https://open.feishu.cn/document/ukTMukTMukTM/uATMzUjLwEzM14CMxMTN/overview)
         * <p> 示例值：PNIfrm!A1:C5
         */
        this.range = builder.range;
        /**
         * 是否忽略大小写，默认为 false;- `true`：表示忽略字符串中字母大小写差异;- `false`：表示区分字符串中字母大小写
         * <p> 示例值：true
         */
        this.matchCase = builder.matchCase;
        /**
         * 是否完全匹配整个单元格，默认值为 false;- `true`：表示完全匹配单元格，比如 find 取值为 "hello"，则单元格中的内容必须为 "hello";- `false`：表示允许部分匹配单元格，比如 find 取值为 "hello"，则单元格中的内容包含 "hello" 即可
         * <p> 示例值：false
         */
        this.matchEntireCell = builder.matchEntireCell;
        /**
         * 是否为正则匹配，默认值为 false;- `true`：表示使用正则匹配;- `false`：表示不使用正则匹配
         * <p> 示例值：false
         */
        this.searchByRegex = builder.searchByRegex;
        /**
         * 是否仅搜索单元格公式，默认值为 false;- `true`：表示仅搜索单元格公式;- `false`：表示仅搜索单元格内容
         * <p> 示例值：false
         */
        this.includeFormulas = builder.includeFormulas;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getRange() {
        return this.range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public Boolean getMatchCase() {
        return this.matchCase;
    }

    public void setMatchCase(Boolean matchCase) {
        this.matchCase = matchCase;
    }

    public Boolean getMatchEntireCell() {
        return this.matchEntireCell;
    }

    public void setMatchEntireCell(Boolean matchEntireCell) {
        this.matchEntireCell = matchEntireCell;
    }

    public Boolean getSearchByRegex() {
        return this.searchByRegex;
    }

    public void setSearchByRegex(Boolean searchByRegex) {
        this.searchByRegex = searchByRegex;
    }

    public Boolean getIncludeFormulas() {
        return this.includeFormulas;
    }

    public void setIncludeFormulas(Boolean includeFormulas) {
        this.includeFormulas = includeFormulas;
    }

    public static class Builder {
        /**
         * 查找范围，参考 [名词解释 Range](https://open.feishu.cn/document/ukTMukTMukTM/uATMzUjLwEzM14CMxMTN/overview)
         * <p> 示例值：PNIfrm!A1:C5
         */
        private String range;
        /**
         * 是否忽略大小写，默认为 false;- `true`：表示忽略字符串中字母大小写差异;- `false`：表示区分字符串中字母大小写
         * <p> 示例值：true
         */
        private Boolean matchCase;
        /**
         * 是否完全匹配整个单元格，默认值为 false;- `true`：表示完全匹配单元格，比如 find 取值为 "hello"，则单元格中的内容必须为 "hello";- `false`：表示允许部分匹配单元格，比如 find 取值为 "hello"，则单元格中的内容包含 "hello" 即可
         * <p> 示例值：false
         */
        private Boolean matchEntireCell;
        /**
         * 是否为正则匹配，默认值为 false;- `true`：表示使用正则匹配;- `false`：表示不使用正则匹配
         * <p> 示例值：false
         */
        private Boolean searchByRegex;
        /**
         * 是否仅搜索单元格公式，默认值为 false;- `true`：表示仅搜索单元格公式;- `false`：表示仅搜索单元格内容
         * <p> 示例值：false
         */
        private Boolean includeFormulas;

        /**
         * 查找范围，参考 [名词解释 Range](https://open.feishu.cn/document/ukTMukTMukTM/uATMzUjLwEzM14CMxMTN/overview)
         * <p> 示例值：PNIfrm!A1:C5
         *
         * @param range
         * @return
         */
        public Builder range(String range) {
            this.range = range;
            return this;
        }


        /**
         * 是否忽略大小写，默认为 false;- `true`：表示忽略字符串中字母大小写差异;- `false`：表示区分字符串中字母大小写
         * <p> 示例值：true
         *
         * @param matchCase
         * @return
         */
        public Builder matchCase(Boolean matchCase) {
            this.matchCase = matchCase;
            return this;
        }


        /**
         * 是否完全匹配整个单元格，默认值为 false;- `true`：表示完全匹配单元格，比如 find 取值为 "hello"，则单元格中的内容必须为 "hello";- `false`：表示允许部分匹配单元格，比如 find 取值为 "hello"，则单元格中的内容包含 "hello" 即可
         * <p> 示例值：false
         *
         * @param matchEntireCell
         * @return
         */
        public Builder matchEntireCell(Boolean matchEntireCell) {
            this.matchEntireCell = matchEntireCell;
            return this;
        }


        /**
         * 是否为正则匹配，默认值为 false;- `true`：表示使用正则匹配;- `false`：表示不使用正则匹配
         * <p> 示例值：false
         *
         * @param searchByRegex
         * @return
         */
        public Builder searchByRegex(Boolean searchByRegex) {
            this.searchByRegex = searchByRegex;
            return this;
        }


        /**
         * 是否仅搜索单元格公式，默认值为 false;- `true`：表示仅搜索单元格公式;- `false`：表示仅搜索单元格内容
         * <p> 示例值：false
         *
         * @param includeFormulas
         * @return
         */
        public Builder includeFormulas(Boolean includeFormulas) {
            this.includeFormulas = includeFormulas;
            return this;
        }


        public FindCondition build() {
            return new FindCondition(this);
        }
    }
}
