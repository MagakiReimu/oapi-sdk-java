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

package com.lark.oapi.service.document_ai.v1.model;

import com.google.gson.annotations.SerializedName;

public class DepartmentId {
    /**
     * <p> 示例值：
     */
    @SerializedName("department_id")
    private String departmentId;
    /**
     * <p> 示例值：
     */
    @SerializedName("open_department_id")
    private String openDepartmentId;

    // builder 开始
    public DepartmentId() {
    }

    public DepartmentId(Builder builder) {
        /**
         *
         * <p> 示例值：
         */
        this.departmentId = builder.departmentId;
        /**
         *
         * <p> 示例值：
         */
        this.openDepartmentId = builder.openDepartmentId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getOpenDepartmentId() {
        return this.openDepartmentId;
    }

    public void setOpenDepartmentId(String openDepartmentId) {
        this.openDepartmentId = openDepartmentId;
    }

    public static class Builder {
        /**
         * <p> 示例值：
         */
        private String departmentId;
        /**
         * <p> 示例值：
         */
        private String openDepartmentId;

        /**
         * <p> 示例值：
         *
         * @param departmentId
         * @return
         */
        public Builder departmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }


        /**
         * <p> 示例值：
         *
         * @param openDepartmentId
         * @return
         */
        public Builder openDepartmentId(String openDepartmentId) {
            this.openDepartmentId = openDepartmentId;
            return this;
        }


        public DepartmentId build() {
            return new DepartmentId(this);
        }
    }
}
