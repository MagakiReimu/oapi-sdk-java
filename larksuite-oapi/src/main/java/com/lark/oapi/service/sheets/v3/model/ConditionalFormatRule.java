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

package com.lark.oapi.service.sheets.v3.model;

import com.google.gson.annotations.SerializedName;

public class ConditionalFormatRule {
    /**
     * 布尔类型条件格式
     * <p> 示例值：
     */
    @SerializedName("boolean_rule")
    private BooleanRuleCondition booleanRule;
    /**
     * 条件格式类型
     * <p> 示例值：BooleanRuleCondition
     */
    @SerializedName("type")
    private String type;

    // builder 开始
    public ConditionalFormatRule() {
    }

    public ConditionalFormatRule(Builder builder) {
        /**
         * 布尔类型条件格式
         * <p> 示例值：
         */
        this.booleanRule = builder.booleanRule;
        /**
         * 条件格式类型
         * <p> 示例值：BooleanRuleCondition
         */
        this.type = builder.type;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public BooleanRuleCondition getBooleanRule() {
        return this.booleanRule;
    }

    public void setBooleanRule(BooleanRuleCondition booleanRule) {
        this.booleanRule = booleanRule;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static class Builder {
        /**
         * 布尔类型条件格式
         * <p> 示例值：
         */
        private BooleanRuleCondition booleanRule;
        /**
         * 条件格式类型
         * <p> 示例值：BooleanRuleCondition
         */
        private String type;

        /**
         * 布尔类型条件格式
         * <p> 示例值：
         *
         * @param booleanRule
         * @return
         */
        public Builder booleanRule(BooleanRuleCondition booleanRule) {
            this.booleanRule = booleanRule;
            return this;
        }


        /**
         * 条件格式类型
         * <p> 示例值：BooleanRuleCondition
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * 条件格式类型
         * <p> 示例值：BooleanRuleCondition
         *
         * @param type {@link com.lark.oapi.service.sheets.v3.enums.ConditionalFormatRuleConditionalFormatRuleTypeEnum}
         * @return
         */
        public Builder type(com.lark.oapi.service.sheets.v3.enums.ConditionalFormatRuleConditionalFormatRuleTypeEnum type) {
            this.type = type.getValue();
            return this;
        }


        public ConditionalFormatRule build() {
            return new ConditionalFormatRule(this);
        }
    }
}
