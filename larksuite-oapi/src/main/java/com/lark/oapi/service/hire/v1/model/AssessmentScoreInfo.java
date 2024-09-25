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

import com.google.gson.annotations.SerializedName;

public class AssessmentScoreInfo {
    /**
     * 计分方式
     * <p> 示例值：1
     */
    @SerializedName("calculate_type")
    private Integer calculateType;
    /**
     * 分数(精确到小数点后两位)
     * <p> 示例值：
     */
    @SerializedName("score")
    private Double score;
    /**
     * 满分
     * <p> 示例值：100
     */
    @SerializedName("full_score")
    private Integer fullScore;

    // builder 开始
    public AssessmentScoreInfo() {
    }

    public AssessmentScoreInfo(Builder builder) {
        /**
         * 计分方式
         * <p> 示例值：1
         */
        this.calculateType = builder.calculateType;
        /**
         * 分数(精确到小数点后两位)
         * <p> 示例值：
         */
        this.score = builder.score;
        /**
         * 满分
         * <p> 示例值：100
         */
        this.fullScore = builder.fullScore;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getCalculateType() {
        return this.calculateType;
    }

    public void setCalculateType(Integer calculateType) {
        this.calculateType = calculateType;
    }

    public Double getScore() {
        return this.score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getFullScore() {
        return this.fullScore;
    }

    public void setFullScore(Integer fullScore) {
        this.fullScore = fullScore;
    }

    public static class Builder {
        /**
         * 计分方式
         * <p> 示例值：1
         */
        private Integer calculateType;
        /**
         * 分数(精确到小数点后两位)
         * <p> 示例值：
         */
        private Double score;
        /**
         * 满分
         * <p> 示例值：100
         */
        private Integer fullScore;

        /**
         * 计分方式
         * <p> 示例值：1
         *
         * @param calculateType
         * @return
         */
        public Builder calculateType(Integer calculateType) {
            this.calculateType = calculateType;
            return this;
        }


        /**
         * 分数(精确到小数点后两位)
         * <p> 示例值：
         *
         * @param score
         * @return
         */
        public Builder score(Double score) {
            this.score = score;
            return this;
        }


        /**
         * 满分
         * <p> 示例值：100
         *
         * @param fullScore
         * @return
         */
        public Builder fullScore(Integer fullScore) {
            this.fullScore = fullScore;
            return this;
        }


        public AssessmentScoreInfo build() {
            return new AssessmentScoreInfo(this);
        }
    }
}
