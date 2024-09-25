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

package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;

public class FileBlockChangeInfo {
    /**
     * 子block token
     * <p> 示例值：doxcnxxxxxxxxxxxxxxxx
     */
    @SerializedName("block_token")
    private String blockToken;
    /**
     * 子block文档类型
     * <p> 示例值：docx
     */
    @SerializedName("block_token_type")
    private String blockTokenType;
    /**
     * 起点版本和终点版本
     * <p> 示例值：
     */
    @SerializedName("rev_ranges")
    private Integer[] revRanges;

    // builder 开始
    public FileBlockChangeInfo() {
    }

    public FileBlockChangeInfo(Builder builder) {
        /**
         * 子block token
         * <p> 示例值：doxcnxxxxxxxxxxxxxxxx
         */
        this.blockToken = builder.blockToken;
        /**
         * 子block文档类型
         * <p> 示例值：docx
         */
        this.blockTokenType = builder.blockTokenType;
        /**
         * 起点版本和终点版本
         * <p> 示例值：
         */
        this.revRanges = builder.revRanges;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getBlockToken() {
        return this.blockToken;
    }

    public void setBlockToken(String blockToken) {
        this.blockToken = blockToken;
    }

    public String getBlockTokenType() {
        return this.blockTokenType;
    }

    public void setBlockTokenType(String blockTokenType) {
        this.blockTokenType = blockTokenType;
    }

    public Integer[] getRevRanges() {
        return this.revRanges;
    }

    public void setRevRanges(Integer[] revRanges) {
        this.revRanges = revRanges;
    }

    public static class Builder {
        /**
         * 子block token
         * <p> 示例值：doxcnxxxxxxxxxxxxxxxx
         */
        private String blockToken;
        /**
         * 子block文档类型
         * <p> 示例值：docx
         */
        private String blockTokenType;
        /**
         * 起点版本和终点版本
         * <p> 示例值：
         */
        private Integer[] revRanges;

        /**
         * 子block token
         * <p> 示例值：doxcnxxxxxxxxxxxxxxxx
         *
         * @param blockToken
         * @return
         */
        public Builder blockToken(String blockToken) {
            this.blockToken = blockToken;
            return this;
        }


        /**
         * 子block文档类型
         * <p> 示例值：docx
         *
         * @param blockTokenType
         * @return
         */
        public Builder blockTokenType(String blockTokenType) {
            this.blockTokenType = blockTokenType;
            return this;
        }


        /**
         * 起点版本和终点版本
         * <p> 示例值：
         *
         * @param revRanges
         * @return
         */
        public Builder revRanges(Integer[] revRanges) {
            this.revRanges = revRanges;
            return this;
        }


        public FileBlockChangeInfo build() {
            return new FileBlockChangeInfo(this);
        }
    }
}
