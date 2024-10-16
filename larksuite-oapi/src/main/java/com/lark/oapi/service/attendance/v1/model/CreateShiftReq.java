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

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.attendance.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class CreateShiftReq {
    /**
     * 用户 ID 的类型 不提供则用户相关字段无效
     * <p> 示例值：
     */
    @Query
    @SerializedName("employee_type")
    private String employeeType;
    @Body
    private Shift body;

    // builder 开始
    public CreateShiftReq() {
    }

    public CreateShiftReq(Builder builder) {
        /**
         * 用户 ID 的类型 不提供则用户相关字段无效
         * <p> 示例值：
         */
        this.employeeType = builder.employeeType;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getEmployeeType() {
        return this.employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public Shift getShift() {
        return this.body;
    }

    public void setShift(Shift body) {
        this.body = body;
    }

    public static class Builder {
        private String employeeType; // 用户 ID 的类型 不提供则用户相关字段无效
        private Shift body;

        /**
         * 用户 ID 的类型 不提供则用户相关字段无效
         * <p> 示例值：
         *
         * @param employeeType
         * @return
         */
        public Builder employeeType(String employeeType) {
            this.employeeType = employeeType;
            return this;
        }

        /**
         * 用户 ID 的类型 不提供则用户相关字段无效
         * <p> 示例值：
         *
         * @param employeeType {@link com.lark.oapi.service.attendance.v1.enums.CreateShiftEmployeeTypeEnum}
         * @return
         */
        public Builder employeeType(com.lark.oapi.service.attendance.v1.enums.CreateShiftEmployeeTypeEnum employeeType) {
            this.employeeType = employeeType.getValue();
            return this;
        }

        public Shift getShift() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder shift(Shift body) {
            this.body = body;
            return this;
        }

        public CreateShiftReq build() {
            return new CreateShiftReq(this);
        }
    }
}
