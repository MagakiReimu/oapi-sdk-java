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

public class ScoreDimensionConfig {
    /**
     * 分数维度类型
     * <p> 示例值：1
     */
    @SerializedName("score_dimension_type")
    private Integer scoreDimensionType;
    /**
     * 分数下限
     * <p> 示例值：1
     */
    @SerializedName("lower_limit_score")
    private Integer lowerLimitScore;
    /**
     * 分数上限
     * <p> 示例值：100
     */
    @SerializedName("upper_limit_score")
    private Integer upperLimitScore;

    // builder 开始
    public ScoreDimensionConfig() {
    }

    public ScoreDimensionConfig(Builder builder) {
        /**
         * 分数维度类型
         * <p> 示例值：1
         */
        this.scoreDimensionType = builder.scoreDimensionType;
        /**
         * 分数下限
         * <p> 示例值：1
         */
        this.lowerLimitScore = builder.lowerLimitScore;
        /**
         * 分数上限
         * <p> 示例值：100
         */
        this.upperLimitScore = builder.upperLimitScore;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getScoreDimensionType() {
        return this.scoreDimensionType;
    }

    public void setScoreDimensionType(Integer scoreDimensionType) {
        this.scoreDimensionType = scoreDimensionType;
    }

    public Integer getLowerLimitScore() {
        return this.lowerLimitScore;
    }

    public void setLowerLimitScore(Integer lowerLimitScore) {
        this.lowerLimitScore = lowerLimitScore;
    }

    public Integer getUpperLimitScore() {
        return this.upperLimitScore;
    }

    public void setUpperLimitScore(Integer upperLimitScore) {
        this.upperLimitScore = upperLimitScore;
    }

    public static class Builder {
        /**
         * 分数维度类型
         * <p> 示例值：1
         */
        private Integer scoreDimensionType;
        /**
         * 分数下限
         * <p> 示例值：1
         */
        private Integer lowerLimitScore;
        /**
         * 分数上限
         * <p> 示例值：100
         */
        private Integer upperLimitScore;

        /**
         * 分数维度类型
         * <p> 示例值：1
         *
         * @param scoreDimensionType
         * @return
         */
        public Builder scoreDimensionType(Integer scoreDimensionType) {
            this.scoreDimensionType = scoreDimensionType;
            return this;
        }


        /**
         * 分数下限
         * <p> 示例值：1
         *
         * @param lowerLimitScore
         * @return
         */
        public Builder lowerLimitScore(Integer lowerLimitScore) {
            this.lowerLimitScore = lowerLimitScore;
            return this;
        }


        /**
         * 分数上限
         * <p> 示例值：100
         *
         * @param upperLimitScore
         * @return
         */
        public Builder upperLimitScore(Integer upperLimitScore) {
            this.upperLimitScore = upperLimitScore;
            return this;
        }


        public ScoreDimensionConfig build() {
            return new ScoreDimensionConfig(this);
        }
    }
}
