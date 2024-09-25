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

package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;

public class BitableTableFieldAction {
    /**
     * 操作类型
     * <p> 示例值：field_edited
     */
    @SerializedName("action")
    private String action;
    /**
     * 字段 ID
     * <p> 示例值：fldmj5qNii
     */
    @SerializedName("field_id")
    private String fieldId;
    /**
     * 操作前的字段值
     * <p> 示例值：
     */
    @SerializedName("before_value")
    private BitableTableFieldActionValue beforeValue;
    /**
     * 操作后的字段值
     * <p> 示例值：
     */
    @SerializedName("after_value")
    private BitableTableFieldActionValue afterValue;

    // builder 开始
    public BitableTableFieldAction() {
    }

    public BitableTableFieldAction(Builder builder) {
        /**
         * 操作类型
         * <p> 示例值：field_edited
         */
        this.action = builder.action;
        /**
         * 字段 ID
         * <p> 示例值：fldmj5qNii
         */
        this.fieldId = builder.fieldId;
        /**
         * 操作前的字段值
         * <p> 示例值：
         */
        this.beforeValue = builder.beforeValue;
        /**
         * 操作后的字段值
         * <p> 示例值：
         */
        this.afterValue = builder.afterValue;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getFieldId() {
        return this.fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    public BitableTableFieldActionValue getBeforeValue() {
        return this.beforeValue;
    }

    public void setBeforeValue(BitableTableFieldActionValue beforeValue) {
        this.beforeValue = beforeValue;
    }

    public BitableTableFieldActionValue getAfterValue() {
        return this.afterValue;
    }

    public void setAfterValue(BitableTableFieldActionValue afterValue) {
        this.afterValue = afterValue;
    }

    public static class Builder {
        /**
         * 操作类型
         * <p> 示例值：field_edited
         */
        private String action;
        /**
         * 字段 ID
         * <p> 示例值：fldmj5qNii
         */
        private String fieldId;
        /**
         * 操作前的字段值
         * <p> 示例值：
         */
        private BitableTableFieldActionValue beforeValue;
        /**
         * 操作后的字段值
         * <p> 示例值：
         */
        private BitableTableFieldActionValue afterValue;

        /**
         * 操作类型
         * <p> 示例值：field_edited
         *
         * @param action
         * @return
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }


        /**
         * 字段 ID
         * <p> 示例值：fldmj5qNii
         *
         * @param fieldId
         * @return
         */
        public Builder fieldId(String fieldId) {
            this.fieldId = fieldId;
            return this;
        }


        /**
         * 操作前的字段值
         * <p> 示例值：
         *
         * @param beforeValue
         * @return
         */
        public Builder beforeValue(BitableTableFieldActionValue beforeValue) {
            this.beforeValue = beforeValue;
            return this;
        }


        /**
         * 操作后的字段值
         * <p> 示例值：
         *
         * @param afterValue
         * @return
         */
        public Builder afterValue(BitableTableFieldActionValue afterValue) {
            this.afterValue = afterValue;
            return this;
        }


        public BitableTableFieldAction build() {
            return new BitableTableFieldAction(this);
        }
    }
}
