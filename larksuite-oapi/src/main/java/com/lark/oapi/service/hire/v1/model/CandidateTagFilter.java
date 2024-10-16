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

public class CandidateTagFilter {
    /**
     * 标签匹配方式
     * <p> 示例值：1
     */
    @SerializedName("match_type")
    private Integer matchType;
    /**
     * 标签 ID 列表
     * <p> 示例值：
     */
    @SerializedName("candidate_tag_id")
    private String[] candidateTagId;

    // builder 开始
    public CandidateTagFilter() {
    }

    public CandidateTagFilter(Builder builder) {
        /**
         * 标签匹配方式
         * <p> 示例值：1
         */
        this.matchType = builder.matchType;
        /**
         * 标签 ID 列表
         * <p> 示例值：
         */
        this.candidateTagId = builder.candidateTagId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getMatchType() {
        return this.matchType;
    }

    public void setMatchType(Integer matchType) {
        this.matchType = matchType;
    }

    public String[] getCandidateTagId() {
        return this.candidateTagId;
    }

    public void setCandidateTagId(String[] candidateTagId) {
        this.candidateTagId = candidateTagId;
    }

    public static class Builder {
        /**
         * 标签匹配方式
         * <p> 示例值：1
         */
        private Integer matchType;
        /**
         * 标签 ID 列表
         * <p> 示例值：
         */
        private String[] candidateTagId;

        /**
         * 标签匹配方式
         * <p> 示例值：1
         *
         * @param matchType
         * @return
         */
        public Builder matchType(Integer matchType) {
            this.matchType = matchType;
            return this;
        }


        /**
         * 标签 ID 列表
         * <p> 示例值：
         *
         * @param candidateTagId
         * @return
         */
        public Builder candidateTagId(String[] candidateTagId) {
            this.candidateTagId = candidateTagId;
            return this;
        }


        public CandidateTagFilter build() {
            return new CandidateTagFilter(this);
        }
    }
}
