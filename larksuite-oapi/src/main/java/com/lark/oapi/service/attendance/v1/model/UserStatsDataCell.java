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

public class UserStatsDataCell {
    /**
     * 字段编号
     * <p> 示例值：50102
     */
    @SerializedName("code")
    private String code;
    /**
     * 数据值
     * <p> 示例值：无需打卡(-), 无需打卡(-)
     */
    @SerializedName("value")
    private String value;
    /**
     * 数据属性
     * <p> 示例值：
     */
    @SerializedName("features")
    private UserStatsDataFeature[] features;
    /**
     * 字段标题
     * <p> 示例值：姓名
     */
    @SerializedName("title")
    private String title;
    /**
     * 时长
     * <p> 示例值：
     */
    @SerializedName("duration_num")
    private UserStatsDataDuration durationNum;

    // builder 开始
    public UserStatsDataCell() {
    }

    public UserStatsDataCell(Builder builder) {
        /**
         * 字段编号
         * <p> 示例值：50102
         */
        this.code = builder.code;
        /**
         * 数据值
         * <p> 示例值：无需打卡(-), 无需打卡(-)
         */
        this.value = builder.value;
        /**
         * 数据属性
         * <p> 示例值：
         */
        this.features = builder.features;
        /**
         * 字段标题
         * <p> 示例值：姓名
         */
        this.title = builder.title;
        /**
         * 时长
         * <p> 示例值：
         */
        this.durationNum = builder.durationNum;
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

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public UserStatsDataFeature[] getFeatures() {
        return this.features;
    }

    public void setFeatures(UserStatsDataFeature[] features) {
        this.features = features;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UserStatsDataDuration getDurationNum() {
        return this.durationNum;
    }

    public void setDurationNum(UserStatsDataDuration durationNum) {
        this.durationNum = durationNum;
    }

    public static class Builder {
        /**
         * 字段编号
         * <p> 示例值：50102
         */
        private String code;
        /**
         * 数据值
         * <p> 示例值：无需打卡(-), 无需打卡(-)
         */
        private String value;
        /**
         * 数据属性
         * <p> 示例值：
         */
        private UserStatsDataFeature[] features;
        /**
         * 字段标题
         * <p> 示例值：姓名
         */
        private String title;
        /**
         * 时长
         * <p> 示例值：
         */
        private UserStatsDataDuration durationNum;

        /**
         * 字段编号
         * <p> 示例值：50102
         *
         * @param code
         * @return
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }


        /**
         * 数据值
         * <p> 示例值：无需打卡(-), 无需打卡(-)
         *
         * @param value
         * @return
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }


        /**
         * 数据属性
         * <p> 示例值：
         *
         * @param features
         * @return
         */
        public Builder features(UserStatsDataFeature[] features) {
            this.features = features;
            return this;
        }


        /**
         * 字段标题
         * <p> 示例值：姓名
         *
         * @param title
         * @return
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }


        /**
         * 时长
         * <p> 示例值：
         *
         * @param durationNum
         * @return
         */
        public Builder durationNum(UserStatsDataDuration durationNum) {
            this.durationNum = durationNum;
            return this;
        }


        public UserStatsDataCell build() {
            return new UserStatsDataCell(this);
        }
    }
}
