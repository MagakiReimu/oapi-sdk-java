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

import com.google.gson.annotations.SerializedName;

public class BusinessManagementScope {
    /**
     * 实体
     * <p> 示例值：
     */
    @SerializedName("entity")
    private EntityInfo entity;
    /**
     * 权限分组
     * <p> 示例值：
     */
    @SerializedName("permission_groups")
    private PermissionGroupInfo[] permissionGroups;

    // builder 开始
    public BusinessManagementScope() {
    }

    public BusinessManagementScope(Builder builder) {
        /**
         * 实体
         * <p> 示例值：
         */
        this.entity = builder.entity;
        /**
         * 权限分组
         * <p> 示例值：
         */
        this.permissionGroups = builder.permissionGroups;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public EntityInfo getEntity() {
        return this.entity;
    }

    public void setEntity(EntityInfo entity) {
        this.entity = entity;
    }

    public PermissionGroupInfo[] getPermissionGroups() {
        return this.permissionGroups;
    }

    public void setPermissionGroups(PermissionGroupInfo[] permissionGroups) {
        this.permissionGroups = permissionGroups;
    }

    public static class Builder {
        /**
         * 实体
         * <p> 示例值：
         */
        private EntityInfo entity;
        /**
         * 权限分组
         * <p> 示例值：
         */
        private PermissionGroupInfo[] permissionGroups;

        /**
         * 实体
         * <p> 示例值：
         *
         * @param entity
         * @return
         */
        public Builder entity(EntityInfo entity) {
            this.entity = entity;
            return this;
        }


        /**
         * 权限分组
         * <p> 示例值：
         *
         * @param permissionGroups
         * @return
         */
        public Builder permissionGroups(PermissionGroupInfo[] permissionGroups) {
            this.permissionGroups = permissionGroups;
            return this;
        }


        public BusinessManagementScope build() {
            return new BusinessManagementScope(this);
        }
    }
}
