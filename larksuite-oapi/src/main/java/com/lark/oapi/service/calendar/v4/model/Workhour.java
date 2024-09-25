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

package com.lark.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;

public class Workhour {
    /**
     * 工作日，定义每周的星期几为工作日.枚举值 0-6 代表 周日-周六
     * <p> 示例值：1
     */
    @SerializedName("day_of_week")
    private Integer dayOfWeek;
    /**
     * 工作时间的开始时间，单位为分钟，取值 0 - 1440
     * <p> 示例值：480
     */
    @SerializedName("start_time")
    private Integer startTime;
    /**
     * 工作时间的结束时间，单位为分钟，取值 start_time - 1440
     * <p> 示例值：1020
     */
    @SerializedName("end_time")
    private Integer endTime;

    // builder 开始
    public Workhour() {
    }

    public Workhour(Builder builder) {
        /**
         * 工作日，定义每周的星期几为工作日.枚举值 0-6 代表 周日-周六
         * <p> 示例值：1
         */
        this.dayOfWeek = builder.dayOfWeek;
        /**
         * 工作时间的开始时间，单位为分钟，取值 0 - 1440
         * <p> 示例值：480
         */
        this.startTime = builder.startTime;
        /**
         * 工作时间的结束时间，单位为分钟，取值 start_time - 1440
         * <p> 示例值：1020
         */
        this.endTime = builder.endTime;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getDayOfWeek() {
        return this.dayOfWeek;
    }

    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Integer getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public static class Builder {
        /**
         * 工作日，定义每周的星期几为工作日.枚举值 0-6 代表 周日-周六
         * <p> 示例值：1
         */
        private Integer dayOfWeek;
        /**
         * 工作时间的开始时间，单位为分钟，取值 0 - 1440
         * <p> 示例值：480
         */
        private Integer startTime;
        /**
         * 工作时间的结束时间，单位为分钟，取值 start_time - 1440
         * <p> 示例值：1020
         */
        private Integer endTime;

        /**
         * 工作日，定义每周的星期几为工作日.枚举值 0-6 代表 周日-周六
         * <p> 示例值：1
         *
         * @param dayOfWeek
         * @return
         */
        public Builder dayOfWeek(Integer dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }


        /**
         * 工作时间的开始时间，单位为分钟，取值 0 - 1440
         * <p> 示例值：480
         *
         * @param startTime
         * @return
         */
        public Builder startTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }


        /**
         * 工作时间的结束时间，单位为分钟，取值 start_time - 1440
         * <p> 示例值：1020
         *
         * @param endTime
         * @return
         */
        public Builder endTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }


        public Workhour build() {
            return new Workhour(this);
        }
    }
}
