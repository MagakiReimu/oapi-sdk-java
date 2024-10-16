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

import com.lark.oapi.core.response.EmptyData;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class EmployeeOverboardInfo {
    /**
     * 实际离职日期
     * <p> 示例值：1637596800000
     */
    @SerializedName("actual_overboard_time")
    private Integer actualOverboardTime;
    /**
     * 离职原因
     * <p> 示例值：职业发展考虑
     */
    @SerializedName("overboard_note")
    private String overboardNote;

    // builder 开始
    public EmployeeOverboardInfo() {
    }

    public EmployeeOverboardInfo(Builder builder) {
        /**
         * 实际离职日期
         * <p> 示例值：1637596800000
         */
        this.actualOverboardTime = builder.actualOverboardTime;
        /**
         * 离职原因
         * <p> 示例值：职业发展考虑
         */
        this.overboardNote = builder.overboardNote;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getActualOverboardTime() {
        return this.actualOverboardTime;
    }

    public void setActualOverboardTime(Integer actualOverboardTime) {
        this.actualOverboardTime = actualOverboardTime;
    }

    public String getOverboardNote() {
        return this.overboardNote;
    }

    public void setOverboardNote(String overboardNote) {
        this.overboardNote = overboardNote;
    }

    public static class Builder {
        /**
         * 实际离职日期
         * <p> 示例值：1637596800000
         */
        private Integer actualOverboardTime;
        /**
         * 离职原因
         * <p> 示例值：职业发展考虑
         */
        private String overboardNote;

        /**
         * 实际离职日期
         * <p> 示例值：1637596800000
         *
         * @param actualOverboardTime
         * @return
         */
        public Builder actualOverboardTime(Integer actualOverboardTime) {
            this.actualOverboardTime = actualOverboardTime;
            return this;
        }


        /**
         * 离职原因
         * <p> 示例值：职业发展考虑
         *
         * @param overboardNote
         * @return
         */
        public Builder overboardNote(String overboardNote) {
            this.overboardNote = overboardNote;
            return this;
        }


        public EmployeeOverboardInfo build() {
            return new EmployeeOverboardInfo(this);
        }
    }
}
