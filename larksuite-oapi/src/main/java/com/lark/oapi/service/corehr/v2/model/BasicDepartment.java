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

public class BasicDepartment {
    /**
     * 部门 ID;- 类型与 department_id_type 一致，转换失败时返回空值;- 请使用 id_v2
     * <p> 示例值：4719456877659520852
     */
    @SerializedName("id")
    private String id;
    /**
     * 部门 ID;- 类型与 department_id_type 一致，转换失败时返回空值
     * <p> 示例值：4719456877659520852
     */
    @SerializedName("id_v2")
    private String idV2;
    /**
     * 部门名称
     * <p> 示例值：
     */
    @SerializedName("department_name")
    private I18n[] departmentName;

    // builder 开始
    public BasicDepartment() {
    }

    public BasicDepartment(Builder builder) {
        /**
         * 部门 ID;- 类型与 department_id_type 一致，转换失败时返回空值;- 请使用 id_v2
         * <p> 示例值：4719456877659520852
         */
        this.id = builder.id;
        /**
         * 部门 ID;- 类型与 department_id_type 一致，转换失败时返回空值
         * <p> 示例值：4719456877659520852
         */
        this.idV2 = builder.idV2;
        /**
         * 部门名称
         * <p> 示例值：
         */
        this.departmentName = builder.departmentName;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdV2() {
        return this.idV2;
    }

    public void setIdV2(String idV2) {
        this.idV2 = idV2;
    }

    public I18n[] getDepartmentName() {
        return this.departmentName;
    }

    public void setDepartmentName(I18n[] departmentName) {
        this.departmentName = departmentName;
    }

    public static class Builder {
        /**
         * 部门 ID;- 类型与 department_id_type 一致，转换失败时返回空值;- 请使用 id_v2
         * <p> 示例值：4719456877659520852
         */
        private String id;
        /**
         * 部门 ID;- 类型与 department_id_type 一致，转换失败时返回空值
         * <p> 示例值：4719456877659520852
         */
        private String idV2;
        /**
         * 部门名称
         * <p> 示例值：
         */
        private I18n[] departmentName;

        /**
         * 部门 ID;- 类型与 department_id_type 一致，转换失败时返回空值;- 请使用 id_v2
         * <p> 示例值：4719456877659520852
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 部门 ID;- 类型与 department_id_type 一致，转换失败时返回空值
         * <p> 示例值：4719456877659520852
         *
         * @param idV2
         * @return
         */
        public Builder idV2(String idV2) {
            this.idV2 = idV2;
            return this;
        }


        /**
         * 部门名称
         * <p> 示例值：
         *
         * @param departmentName
         * @return
         */
        public Builder departmentName(I18n[] departmentName) {
            this.departmentName = departmentName;
            return this;
        }


        public BasicDepartment build() {
            return new BasicDepartment(this);
        }
    }
}
