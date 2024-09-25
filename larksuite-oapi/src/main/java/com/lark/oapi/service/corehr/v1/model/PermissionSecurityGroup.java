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

package com.lark.oapi.service.corehr.v1.model;

import com.google.gson.annotations.SerializedName;

public class PermissionSecurityGroup {
    /**
     * 管理维度
     * <p> 示例值：
     */
    @SerializedName("rule_dimension")
    private RuleDimension ruleDimension;
    /**
     * 管理类型
     * <p> 示例值：1
     */
    @SerializedName("rule_type")
    private Integer ruleType;
    /**
     * 规则
     * <p> 示例值：
     */
    @SerializedName("expression")
    private FilterExpression expression;

    // builder 开始
    public PermissionSecurityGroup() {
    }

    public PermissionSecurityGroup(Builder builder) {
        /**
         * 管理维度
         * <p> 示例值：
         */
        this.ruleDimension = builder.ruleDimension;
        /**
         * 管理类型
         * <p> 示例值：1
         */
        this.ruleType = builder.ruleType;
        /**
         * 规则
         * <p> 示例值：
         */
        this.expression = builder.expression;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public RuleDimension getRuleDimension() {
        return this.ruleDimension;
    }

    public void setRuleDimension(RuleDimension ruleDimension) {
        this.ruleDimension = ruleDimension;
    }

    public Integer getRuleType() {
        return this.ruleType;
    }

    public void setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
    }

    public FilterExpression getExpression() {
        return this.expression;
    }

    public void setExpression(FilterExpression expression) {
        this.expression = expression;
    }

    public static class Builder {
        /**
         * 管理维度
         * <p> 示例值：
         */
        private RuleDimension ruleDimension;
        /**
         * 管理类型
         * <p> 示例值：1
         */
        private Integer ruleType;
        /**
         * 规则
         * <p> 示例值：
         */
        private FilterExpression expression;

        /**
         * 管理维度
         * <p> 示例值：
         *
         * @param ruleDimension
         * @return
         */
        public Builder ruleDimension(RuleDimension ruleDimension) {
            this.ruleDimension = ruleDimension;
            return this;
        }


        /**
         * 管理类型
         * <p> 示例值：1
         *
         * @param ruleType
         * @return
         */
        public Builder ruleType(Integer ruleType) {
            this.ruleType = ruleType;
            return this;
        }


        /**
         * 规则
         * <p> 示例值：
         *
         * @param expression
         * @return
         */
        public Builder expression(FilterExpression expression) {
            this.expression = expression;
            return this;
        }


        public PermissionSecurityGroup build() {
            return new PermissionSecurityGroup(this);
        }
    }
}
