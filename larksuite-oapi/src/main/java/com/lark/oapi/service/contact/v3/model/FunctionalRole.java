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

package com.lark.oapi.service.contact.v3.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.contact.v3.enums.*;
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

public class FunctionalRole {
    /**
     * 角色内部ID
     * <p> 示例值：7vrj3vk70xk7v5r
     */
    @SerializedName("role_id")
    private String roleId;
    /**
     * 角色名称
     * <p> 示例值：测试角色
     */
    @SerializedName("role_name")
    private String roleName;

    // builder 开始
    public FunctionalRole() {
    }

    public FunctionalRole(Builder builder) {
        /**
         * 角色内部ID
         * <p> 示例值：7vrj3vk70xk7v5r
         */
        this.roleId = builder.roleId;
        /**
         * 角色名称
         * <p> 示例值：测试角色
         */
        this.roleName = builder.roleName;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getRoleId() {
        return this.roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public static class Builder {
        /**
         * 角色内部ID
         * <p> 示例值：7vrj3vk70xk7v5r
         */
        private String roleId;
        /**
         * 角色名称
         * <p> 示例值：测试角色
         */
        private String roleName;

        /**
         * 角色内部ID
         * <p> 示例值：7vrj3vk70xk7v5r
         *
         * @param roleId
         * @return
         */
        public Builder roleId(String roleId) {
            this.roleId = roleId;
            return this;
        }


        /**
         * 角色名称
         * <p> 示例值：测试角色
         *
         * @param roleName
         * @return
         */
        public Builder roleName(String roleName) {
            this.roleName = roleName;
            return this;
        }


        public FunctionalRole build() {
            return new FunctionalRole(this);
        }
    }
}
