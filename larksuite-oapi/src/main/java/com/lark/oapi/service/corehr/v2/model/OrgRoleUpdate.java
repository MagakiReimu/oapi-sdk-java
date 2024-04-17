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

public class OrgRoleUpdate {
    /**
     * 唯一标识
     * <p> 示例值：hrbp
     */
    @SerializedName("api_name")
    private String apiName;
    /**
     * 授权员工列表
     * <p> 示例值：
     */
    @SerializedName("employment_ids")
    private String[] employmentIds;

    // builder 开始
    public OrgRoleUpdate() {
    }

    public OrgRoleUpdate(Builder builder) {
        /**
         * 唯一标识
         * <p> 示例值：hrbp
         */
        this.apiName = builder.apiName;
        /**
         * 授权员工列表
         * <p> 示例值：
         */
        this.employmentIds = builder.employmentIds;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getApiName() {
        return this.apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String[] getEmploymentIds() {
        return this.employmentIds;
    }

    public void setEmploymentIds(String[] employmentIds) {
        this.employmentIds = employmentIds;
    }

    public static class Builder {
        /**
         * 唯一标识
         * <p> 示例值：hrbp
         */
        private String apiName;
        /**
         * 授权员工列表
         * <p> 示例值：
         */
        private String[] employmentIds;

        /**
         * 唯一标识
         * <p> 示例值：hrbp
         *
         * @param apiName
         * @return
         */
        public Builder apiName(String apiName) {
            this.apiName = apiName;
            return this;
        }


        /**
         * 授权员工列表
         * <p> 示例值：
         *
         * @param employmentIds
         * @return
         */
        public Builder employmentIds(String[] employmentIds) {
            this.employmentIds = employmentIds;
            return this;
        }


        public OrgRoleUpdate build() {
            return new OrgRoleUpdate(this);
        }
    }
}
