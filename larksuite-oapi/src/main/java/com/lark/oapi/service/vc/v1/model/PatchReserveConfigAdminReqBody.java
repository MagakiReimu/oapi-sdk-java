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

package com.lark.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;

public class PatchReserveConfigAdminReqBody {
    /**
     * 1代表层级，2代表会议室
     * <p> 示例值：2
     */
    @SerializedName("scope_type")
    private Integer scopeType;
    /**
     * 预定管理员或部门
     * <p> 示例值：
     */
    @SerializedName("reserve_admin_config")
    private ReserveAdminConfig reserveAdminConfig;

    // builder 开始
    public PatchReserveConfigAdminReqBody() {
    }

    public PatchReserveConfigAdminReqBody(Builder builder) {
        /**
         * 1代表层级，2代表会议室
         * <p> 示例值：2
         */
        this.scopeType = builder.scopeType;
        /**
         * 预定管理员或部门
         * <p> 示例值：
         */
        this.reserveAdminConfig = builder.reserveAdminConfig;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getScopeType() {
        return this.scopeType;
    }

    public void setScopeType(Integer scopeType) {
        this.scopeType = scopeType;
    }

    public ReserveAdminConfig getReserveAdminConfig() {
        return this.reserveAdminConfig;
    }

    public void setReserveAdminConfig(ReserveAdminConfig reserveAdminConfig) {
        this.reserveAdminConfig = reserveAdminConfig;
    }

    public static class Builder {
        /**
         * 1代表层级，2代表会议室
         * <p> 示例值：2
         */
        private Integer scopeType;
        /**
         * 预定管理员或部门
         * <p> 示例值：
         */
        private ReserveAdminConfig reserveAdminConfig;

        /**
         * 1代表层级，2代表会议室
         * <p> 示例值：2
         *
         * @param scopeType
         * @return
         */
        public Builder scopeType(Integer scopeType) {
            this.scopeType = scopeType;
            return this;
        }


        /**
         * 预定管理员或部门
         * <p> 示例值：
         *
         * @param reserveAdminConfig
         * @return
         */
        public Builder reserveAdminConfig(ReserveAdminConfig reserveAdminConfig) {
            this.reserveAdminConfig = reserveAdminConfig;
            return this;
        }


        public PatchReserveConfigAdminReqBody build() {
            return new PatchReserveConfigAdminReqBody(this);
        }
    }
}
