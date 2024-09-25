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

public class ContractPeriod {
    /**
     * 合同周期类型
     * <p> 示例值：1
     */
    @SerializedName("period_type")
    private Integer periodType;
    /**
     * 合同时长
     * <p> 示例值：3
     */
    @SerializedName("period")
    private Integer period;

    // builder 开始
    public ContractPeriod() {
    }

    public ContractPeriod(Builder builder) {
        /**
         * 合同周期类型
         * <p> 示例值：1
         */
        this.periodType = builder.periodType;
        /**
         * 合同时长
         * <p> 示例值：3
         */
        this.period = builder.period;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getPeriodType() {
        return this.periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public Integer getPeriod() {
        return this.period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public static class Builder {
        /**
         * 合同周期类型
         * <p> 示例值：1
         */
        private Integer periodType;
        /**
         * 合同时长
         * <p> 示例值：3
         */
        private Integer period;

        /**
         * 合同周期类型
         * <p> 示例值：1
         *
         * @param periodType
         * @return
         */
        public Builder periodType(Integer periodType) {
            this.periodType = periodType;
            return this;
        }


        /**
         * 合同时长
         * <p> 示例值：3
         *
         * @param period
         * @return
         */
        public Builder period(Integer period) {
            this.period = period;
            return this;
        }


        public ContractPeriod build() {
            return new ContractPeriod(this);
        }
    }
}
