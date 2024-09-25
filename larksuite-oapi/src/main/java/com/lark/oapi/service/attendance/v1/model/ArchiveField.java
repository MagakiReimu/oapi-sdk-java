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

package com.lark.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;

public class ArchiveField {
    /**
     * 字段编号
     * <p> 示例值：1
     */
    @SerializedName("code")
    private String code;
    /**
     * 字段名称
     * <p> 示例值：工号
     */
    @SerializedName("title")
    private String title;
    /**
     * 一级表头名字
     * <p> 示例值：
     */
    @SerializedName("upper_titles")
    private String[] upperTitles;

    // builder 开始
    public ArchiveField() {
    }

    public ArchiveField(Builder builder) {
        /**
         * 字段编号
         * <p> 示例值：1
         */
        this.code = builder.code;
        /**
         * 字段名称
         * <p> 示例值：工号
         */
        this.title = builder.title;
        /**
         * 一级表头名字
         * <p> 示例值：
         */
        this.upperTitles = builder.upperTitles;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getUpperTitles() {
        return this.upperTitles;
    }

    public void setUpperTitles(String[] upperTitles) {
        this.upperTitles = upperTitles;
    }

    public static class Builder {
        /**
         * 字段编号
         * <p> 示例值：1
         */
        private String code;
        /**
         * 字段名称
         * <p> 示例值：工号
         */
        private String title;
        /**
         * 一级表头名字
         * <p> 示例值：
         */
        private String[] upperTitles;

        /**
         * 字段编号
         * <p> 示例值：1
         *
         * @param code
         * @return
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }


        /**
         * 字段名称
         * <p> 示例值：工号
         *
         * @param title
         * @return
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }


        /**
         * 一级表头名字
         * <p> 示例值：
         *
         * @param upperTitles
         * @return
         */
        public Builder upperTitles(String[] upperTitles) {
            this.upperTitles = upperTitles;
            return this;
        }


        public ArchiveField build() {
            return new ArchiveField(this);
        }
    }
}
