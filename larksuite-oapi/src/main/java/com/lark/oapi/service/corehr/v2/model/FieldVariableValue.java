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

package com.lark.oapi.service.corehr.v2.model;

import com.google.gson.annotations.SerializedName;

public class FieldVariableValue {
    /**
     * 变量唯一标识
     * <p> 示例值：custom123
     */
    @SerializedName("variable_api_name")
    private String variableApiName;
    /**
     * 变量名称
     * <p> 示例值：日期
     */
    @SerializedName("variable_name")
    private FieldVariableValueI18n variableName;
    /**
     * 变量值
     * <p> 示例值：aa
     */
    @SerializedName("variable_value")
    private FieldVariableValueTo variableValue;
    /**
     * 在list_values和record_values中引用的变量
     * <p> 示例值：
     */
    @SerializedName("sub_values")
    private FieldVariableSubVlaue[] subValues;

    // builder 开始
    public FieldVariableValue() {
    }

    public FieldVariableValue(Builder builder) {
        /**
         * 变量唯一标识
         * <p> 示例值：custom123
         */
        this.variableApiName = builder.variableApiName;
        /**
         * 变量名称
         * <p> 示例值：日期
         */
        this.variableName = builder.variableName;
        /**
         * 变量值
         * <p> 示例值：aa
         */
        this.variableValue = builder.variableValue;
        /**
         * 在list_values和record_values中引用的变量
         * <p> 示例值：
         */
        this.subValues = builder.subValues;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getVariableApiName() {
        return this.variableApiName;
    }

    public void setVariableApiName(String variableApiName) {
        this.variableApiName = variableApiName;
    }

    public FieldVariableValueI18n getVariableName() {
        return this.variableName;
    }

    public void setVariableName(FieldVariableValueI18n variableName) {
        this.variableName = variableName;
    }

    public FieldVariableValueTo getVariableValue() {
        return this.variableValue;
    }

    public void setVariableValue(FieldVariableValueTo variableValue) {
        this.variableValue = variableValue;
    }

    public FieldVariableSubVlaue[] getSubValues() {
        return this.subValues;
    }

    public void setSubValues(FieldVariableSubVlaue[] subValues) {
        this.subValues = subValues;
    }

    public static class Builder {
        /**
         * 变量唯一标识
         * <p> 示例值：custom123
         */
        private String variableApiName;
        /**
         * 变量名称
         * <p> 示例值：日期
         */
        private FieldVariableValueI18n variableName;
        /**
         * 变量值
         * <p> 示例值：aa
         */
        private FieldVariableValueTo variableValue;
        /**
         * 在list_values和record_values中引用的变量
         * <p> 示例值：
         */
        private FieldVariableSubVlaue[] subValues;

        /**
         * 变量唯一标识
         * <p> 示例值：custom123
         *
         * @param variableApiName
         * @return
         */
        public Builder variableApiName(String variableApiName) {
            this.variableApiName = variableApiName;
            return this;
        }


        /**
         * 变量名称
         * <p> 示例值：日期
         *
         * @param variableName
         * @return
         */
        public Builder variableName(FieldVariableValueI18n variableName) {
            this.variableName = variableName;
            return this;
        }


        /**
         * 变量值
         * <p> 示例值：aa
         *
         * @param variableValue
         * @return
         */
        public Builder variableValue(FieldVariableValueTo variableValue) {
            this.variableValue = variableValue;
            return this;
        }


        /**
         * 在list_values和record_values中引用的变量
         * <p> 示例值：
         *
         * @param subValues
         * @return
         */
        public Builder subValues(FieldVariableSubVlaue[] subValues) {
            this.subValues = subValues;
            return this;
        }


        public FieldVariableValue build() {
            return new FieldVariableValue(this);
        }
    }
}
