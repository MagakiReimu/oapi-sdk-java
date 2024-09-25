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

package com.lark.oapi.service.compensation.v1.model;

import com.google.gson.annotations.SerializedName;

public class SocialPlanItemSetting {
    /**
     * 基数下限，浮点数，保留二位小数
     * <p> 示例值：1000.00
     */
    @SerializedName("lower_limit")
    private String lowerLimit;
    /**
     * 基数上限，浮点数，保留二位小数
     * <p> 示例值：2000.00
     */
    @SerializedName("upper_limit")
    private String upperLimit;
    /**
     * 缴纳比例，浮点数，默认填充到二位小数，支持输入到四位，单位为 %
     * <p> 示例值：8.00
     */
    @SerializedName("payment_ratio")
    private String paymentRatio;
    /**
     * 缴纳金舍入规则。rounding: 四舍五入; round_up: 向上舍入; round_down: 向下舍入
     * <p> 示例值：8.00
     */
    @SerializedName("payment_rounding_rule")
    private String paymentRoundingRule;
    /**
     * 缴纳金小数位数，0-6之间选择
     * <p> 示例值：2
     */
    @SerializedName("payment_decimals")
    private Integer paymentDecimals;
    /**
     * 附加固定金额，浮点数，保留二位小数
     * <p> 示例值：200.00
     */
    @SerializedName("fixed_payment")
    private String fixedPayment;

    // builder 开始
    public SocialPlanItemSetting() {
    }

    public SocialPlanItemSetting(Builder builder) {
        /**
         * 基数下限，浮点数，保留二位小数
         * <p> 示例值：1000.00
         */
        this.lowerLimit = builder.lowerLimit;
        /**
         * 基数上限，浮点数，保留二位小数
         * <p> 示例值：2000.00
         */
        this.upperLimit = builder.upperLimit;
        /**
         * 缴纳比例，浮点数，默认填充到二位小数，支持输入到四位，单位为 %
         * <p> 示例值：8.00
         */
        this.paymentRatio = builder.paymentRatio;
        /**
         * 缴纳金舍入规则。rounding: 四舍五入; round_up: 向上舍入; round_down: 向下舍入
         * <p> 示例值：8.00
         */
        this.paymentRoundingRule = builder.paymentRoundingRule;
        /**
         * 缴纳金小数位数，0-6之间选择
         * <p> 示例值：2
         */
        this.paymentDecimals = builder.paymentDecimals;
        /**
         * 附加固定金额，浮点数，保留二位小数
         * <p> 示例值：200.00
         */
        this.fixedPayment = builder.fixedPayment;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getLowerLimit() {
        return this.lowerLimit;
    }

    public void setLowerLimit(String lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public String getUpperLimit() {
        return this.upperLimit;
    }

    public void setUpperLimit(String upperLimit) {
        this.upperLimit = upperLimit;
    }

    public String getPaymentRatio() {
        return this.paymentRatio;
    }

    public void setPaymentRatio(String paymentRatio) {
        this.paymentRatio = paymentRatio;
    }

    public String getPaymentRoundingRule() {
        return this.paymentRoundingRule;
    }

    public void setPaymentRoundingRule(String paymentRoundingRule) {
        this.paymentRoundingRule = paymentRoundingRule;
    }

    public Integer getPaymentDecimals() {
        return this.paymentDecimals;
    }

    public void setPaymentDecimals(Integer paymentDecimals) {
        this.paymentDecimals = paymentDecimals;
    }

    public String getFixedPayment() {
        return this.fixedPayment;
    }

    public void setFixedPayment(String fixedPayment) {
        this.fixedPayment = fixedPayment;
    }

    public static class Builder {
        /**
         * 基数下限，浮点数，保留二位小数
         * <p> 示例值：1000.00
         */
        private String lowerLimit;
        /**
         * 基数上限，浮点数，保留二位小数
         * <p> 示例值：2000.00
         */
        private String upperLimit;
        /**
         * 缴纳比例，浮点数，默认填充到二位小数，支持输入到四位，单位为 %
         * <p> 示例值：8.00
         */
        private String paymentRatio;
        /**
         * 缴纳金舍入规则。rounding: 四舍五入; round_up: 向上舍入; round_down: 向下舍入
         * <p> 示例值：8.00
         */
        private String paymentRoundingRule;
        /**
         * 缴纳金小数位数，0-6之间选择
         * <p> 示例值：2
         */
        private Integer paymentDecimals;
        /**
         * 附加固定金额，浮点数，保留二位小数
         * <p> 示例值：200.00
         */
        private String fixedPayment;

        /**
         * 基数下限，浮点数，保留二位小数
         * <p> 示例值：1000.00
         *
         * @param lowerLimit
         * @return
         */
        public Builder lowerLimit(String lowerLimit) {
            this.lowerLimit = lowerLimit;
            return this;
        }


        /**
         * 基数上限，浮点数，保留二位小数
         * <p> 示例值：2000.00
         *
         * @param upperLimit
         * @return
         */
        public Builder upperLimit(String upperLimit) {
            this.upperLimit = upperLimit;
            return this;
        }


        /**
         * 缴纳比例，浮点数，默认填充到二位小数，支持输入到四位，单位为 %
         * <p> 示例值：8.00
         *
         * @param paymentRatio
         * @return
         */
        public Builder paymentRatio(String paymentRatio) {
            this.paymentRatio = paymentRatio;
            return this;
        }


        /**
         * 缴纳金舍入规则。rounding: 四舍五入; round_up: 向上舍入; round_down: 向下舍入
         * <p> 示例值：8.00
         *
         * @param paymentRoundingRule
         * @return
         */
        public Builder paymentRoundingRule(String paymentRoundingRule) {
            this.paymentRoundingRule = paymentRoundingRule;
            return this;
        }

        /**
         * 缴纳金舍入规则。rounding: 四舍五入; round_up: 向上舍入; round_down: 向下舍入
         * <p> 示例值：8.00
         *
         * @param paymentRoundingRule {@link com.lark.oapi.service.compensation.v1.enums.SocialPlanItemSettingPaymentRoundingRuleEnum}
         * @return
         */
        public Builder paymentRoundingRule(com.lark.oapi.service.compensation.v1.enums.SocialPlanItemSettingPaymentRoundingRuleEnum paymentRoundingRule) {
            this.paymentRoundingRule = paymentRoundingRule.getValue();
            return this;
        }


        /**
         * 缴纳金小数位数，0-6之间选择
         * <p> 示例值：2
         *
         * @param paymentDecimals
         * @return
         */
        public Builder paymentDecimals(Integer paymentDecimals) {
            this.paymentDecimals = paymentDecimals;
            return this;
        }


        /**
         * 附加固定金额，浮点数，保留二位小数
         * <p> 示例值：200.00
         *
         * @param fixedPayment
         * @return
         */
        public Builder fixedPayment(String fixedPayment) {
            this.fixedPayment = fixedPayment;
            return this;
        }


        public SocialPlanItemSetting build() {
            return new SocialPlanItemSetting(this);
        }
    }
}
