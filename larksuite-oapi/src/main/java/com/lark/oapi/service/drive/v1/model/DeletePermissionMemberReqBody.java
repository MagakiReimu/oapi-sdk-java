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

public class DeletePermissionMemberReqBody {
    /**
     * 协作者类型
     * <p> 示例值：user
     */
    @SerializedName("type")
    private String type;
    /**
     * 协作者的权限角色类型
     * <p> 示例值：container
     */
    @SerializedName("perm_type")
    private String permType;

    // builder 开始
    public DeletePermissionMemberReqBody() {
    }

    public DeletePermissionMemberReqBody(Builder builder) {
        /**
         * 协作者类型
         * <p> 示例值：user
         */
        this.type = builder.type;
        /**
         * 协作者的权限角色类型
         * <p> 示例值：container
         */
        this.permType = builder.permType;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPermType() {
        return this.permType;
    }

    public void setPermType(String permType) {
        this.permType = permType;
    }

    public static class Builder {
        /**
         * 协作者类型
         * <p> 示例值：user
         */
        private String type;
        /**
         * 协作者的权限角色类型
         * <p> 示例值：container
         */
        private String permType;

        /**
         * 协作者类型
         * <p> 示例值：user
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * 协作者类型
         * <p> 示例值：user
         *
         * @param type {@link com.lark.oapi.service.drive.v1.enums.DeletePermissionMemberTypeEnum}
         * @return
         */
        public Builder type(com.lark.oapi.service.drive.v1.enums.DeletePermissionMemberTypeEnum type) {
            this.type = type.getValue();
            return this;
        }


        /**
         * 协作者的权限角色类型
         * <p> 示例值：container
         *
         * @param permType
         * @return
         */
        public Builder permType(String permType) {
            this.permType = permType;
            return this;
        }

        /**
         * 协作者的权限角色类型
         * <p> 示例值：container
         *
         * @param permType {@link com.lark.oapi.service.drive.v1.enums.DeletePermissionMemberPermTypeEnum}
         * @return
         */
        public Builder permType(com.lark.oapi.service.drive.v1.enums.DeletePermissionMemberPermTypeEnum permType) {
            this.permType = permType.getValue();
            return this;
        }


        public DeletePermissionMemberReqBody build() {
            return new DeletePermissionMemberReqBody(this);
        }
    }
}
