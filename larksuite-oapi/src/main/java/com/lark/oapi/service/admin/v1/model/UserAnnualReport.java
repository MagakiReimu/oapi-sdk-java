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

package com.lark.oapi.service.admin.v1.model;

import com.google.gson.annotations.SerializedName;

public class UserAnnualReport {
    /**
     * 2021用户年度报告
     * <p> 示例值：
     */
    @SerializedName("year_2021")
    private UserReport2021 year2021;
    /**
     * 2022用户年度报告
     * <p> 示例值：
     */
    @SerializedName("year_2022")
    private UserReport2022 year2022;
    /**
     * 2023用户年度报告
     * <p> 示例值：
     */
    @SerializedName("year_2023")
    private UserReport2023 year2023;

    // builder 开始
    public UserAnnualReport() {
    }

    public UserAnnualReport(Builder builder) {
        /**
         * 2021用户年度报告
         * <p> 示例值：
         */
        this.year2021 = builder.year2021;
        /**
         * 2022用户年度报告
         * <p> 示例值：
         */
        this.year2022 = builder.year2022;
        /**
         * 2023用户年度报告
         * <p> 示例值：
         */
        this.year2023 = builder.year2023;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public UserReport2021 getYear2021() {
        return this.year2021;
    }

    public void setYear2021(UserReport2021 year2021) {
        this.year2021 = year2021;
    }

    public UserReport2022 getYear2022() {
        return this.year2022;
    }

    public void setYear2022(UserReport2022 year2022) {
        this.year2022 = year2022;
    }

    public UserReport2023 getYear2023() {
        return this.year2023;
    }

    public void setYear2023(UserReport2023 year2023) {
        this.year2023 = year2023;
    }

    public static class Builder {
        /**
         * 2021用户年度报告
         * <p> 示例值：
         */
        private UserReport2021 year2021;
        /**
         * 2022用户年度报告
         * <p> 示例值：
         */
        private UserReport2022 year2022;
        /**
         * 2023用户年度报告
         * <p> 示例值：
         */
        private UserReport2023 year2023;

        /**
         * 2021用户年度报告
         * <p> 示例值：
         *
         * @param year2021
         * @return
         */
        public Builder year2021(UserReport2021 year2021) {
            this.year2021 = year2021;
            return this;
        }


        /**
         * 2022用户年度报告
         * <p> 示例值：
         *
         * @param year2022
         * @return
         */
        public Builder year2022(UserReport2022 year2022) {
            this.year2022 = year2022;
            return this;
        }


        /**
         * 2023用户年度报告
         * <p> 示例值：
         *
         * @param year2023
         * @return
         */
        public Builder year2023(UserReport2023 year2023) {
            this.year2023 = year2023;
            return this;
        }


        public UserAnnualReport build() {
            return new UserAnnualReport(this);
        }
    }
}
