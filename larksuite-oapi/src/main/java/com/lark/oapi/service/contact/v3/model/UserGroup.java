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

public class UserGroup {
    /**
     * 用户组的自定义ID
     * <p> 示例值：test
     */
    @SerializedName("user_group_id")
    private String userGroupId;
    /**
     * 用户组的名称
     * <p> 示例值：userGroupName
     */
    @SerializedName("name")
    private String name;
    /**
     * 用户组的类型
     * <p> 示例值：1
     */
    @SerializedName("type")
    private Integer type;
    /**
     * 成员数量
     * <p> 示例值：10
     */
    @SerializedName("member_count")
    private Integer memberCount;
    /**
     * 用户组状态
     * <p> 示例值：1
     */
    @SerializedName("status")
    private Integer status;

    // builder 开始
    public UserGroup() {
    }

    public UserGroup(Builder builder) {
        /**
         * 用户组的自定义ID
         * <p> 示例值：test
         */
        this.userGroupId = builder.userGroupId;
        /**
         * 用户组的名称
         * <p> 示例值：userGroupName
         */
        this.name = builder.name;
        /**
         * 用户组的类型
         * <p> 示例值：1
         */
        this.type = builder.type;
        /**
         * 成员数量
         * <p> 示例值：10
         */
        this.memberCount = builder.memberCount;
        /**
         * 用户组状态
         * <p> 示例值：1
         */
        this.status = builder.status;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserGroupId() {
        return this.userGroupId;
    }

    public void setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getMemberCount() {
        return this.memberCount;
    }

    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public static class Builder {
        /**
         * 用户组的自定义ID
         * <p> 示例值：test
         */
        private String userGroupId;
        /**
         * 用户组的名称
         * <p> 示例值：userGroupName
         */
        private String name;
        /**
         * 用户组的类型
         * <p> 示例值：1
         */
        private Integer type;
        /**
         * 成员数量
         * <p> 示例值：10
         */
        private Integer memberCount;
        /**
         * 用户组状态
         * <p> 示例值：1
         */
        private Integer status;

        /**
         * 用户组的自定义ID
         * <p> 示例值：test
         *
         * @param userGroupId
         * @return
         */
        public Builder userGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }


        /**
         * 用户组的名称
         * <p> 示例值：userGroupName
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 用户组的类型
         * <p> 示例值：1
         *
         * @param type
         * @return
         */
        public Builder type(Integer type) {
            this.type = type;
            return this;
        }

        /**
         * 用户组的类型
         * <p> 示例值：1
         *
         * @param type {@link com.lark.oapi.service.contact.v3.enums.UserGroupTypeEnum}
         * @return
         */
        public Builder type(com.lark.oapi.service.contact.v3.enums.UserGroupTypeEnum type) {
            this.type = type.getValue();
            return this;
        }


        /**
         * 成员数量
         * <p> 示例值：10
         *
         * @param memberCount
         * @return
         */
        public Builder memberCount(Integer memberCount) {
            this.memberCount = memberCount;
            return this;
        }


        /**
         * 用户组状态
         * <p> 示例值：1
         *
         * @param status
         * @return
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * 用户组状态
         * <p> 示例值：1
         *
         * @param status {@link com.lark.oapi.service.contact.v3.enums.UserGroupStatusEnum}
         * @return
         */
        public Builder status(com.lark.oapi.service.contact.v3.enums.UserGroupStatusEnum status) {
            this.status = status.getValue();
            return this;
        }


        public UserGroup build() {
            return new UserGroup(this);
        }
    }
}
