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

package com.lark.oapi.service.task.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.task.v2.enums.*;
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

public class PatchTasklistReqBody {
    /**
     * 要更新清单的数据
     * <p> 示例值：
     */
    @SerializedName("tasklist")
    private InputTasklist tasklist;
    /**
     * 要更新的字段名，只支持更新"owner", "name"两个字段
     * <p> 示例值：
     */
    @SerializedName("update_fields")
    private String[] updateFields;
    /**
     * 该字段表示如果更新了新的负责人，则将原负责人设为指定的协作人角色。仅在update_fields包含owner字段时生效。根据清单的角色设计方式，不允许提前为清单的负责人添加其他角色，但负责人更新后，原有负责人会无法访问该清单。该字段可以帮助避免原负责人彻底退出清单。
     * <p> 示例值：editor
     */
    @SerializedName("origin_owner_to_role")
    private String originOwnerToRole;

    // builder 开始
    public PatchTasklistReqBody() {
    }

    public PatchTasklistReqBody(Builder builder) {
        /**
         * 要更新清单的数据
         * <p> 示例值：
         */
        this.tasklist = builder.tasklist;
        /**
         * 要更新的字段名，只支持更新"owner", "name"两个字段
         * <p> 示例值：
         */
        this.updateFields = builder.updateFields;
        /**
         * 该字段表示如果更新了新的负责人，则将原负责人设为指定的协作人角色。仅在update_fields包含owner字段时生效。根据清单的角色设计方式，不允许提前为清单的负责人添加其他角色，但负责人更新后，原有负责人会无法访问该清单。该字段可以帮助避免原负责人彻底退出清单。
         * <p> 示例值：editor
         */
        this.originOwnerToRole = builder.originOwnerToRole;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public InputTasklist getTasklist() {
        return this.tasklist;
    }

    public void setTasklist(InputTasklist tasklist) {
        this.tasklist = tasklist;
    }

    public String[] getUpdateFields() {
        return this.updateFields;
    }

    public void setUpdateFields(String[] updateFields) {
        this.updateFields = updateFields;
    }

    public String getOriginOwnerToRole() {
        return this.originOwnerToRole;
    }

    public void setOriginOwnerToRole(String originOwnerToRole) {
        this.originOwnerToRole = originOwnerToRole;
    }

    public static class Builder {
        /**
         * 要更新清单的数据
         * <p> 示例值：
         */
        private InputTasklist tasklist;
        /**
         * 要更新的字段名，只支持更新"owner", "name"两个字段
         * <p> 示例值：
         */
        private String[] updateFields;
        /**
         * 该字段表示如果更新了新的负责人，则将原负责人设为指定的协作人角色。仅在update_fields包含owner字段时生效。根据清单的角色设计方式，不允许提前为清单的负责人添加其他角色，但负责人更新后，原有负责人会无法访问该清单。该字段可以帮助避免原负责人彻底退出清单。
         * <p> 示例值：editor
         */
        private String originOwnerToRole;

        /**
         * 要更新清单的数据
         * <p> 示例值：
         *
         * @param tasklist
         * @return
         */
        public Builder tasklist(InputTasklist tasklist) {
            this.tasklist = tasklist;
            return this;
        }


        /**
         * 要更新的字段名，只支持更新"owner", "name"两个字段
         * <p> 示例值：
         *
         * @param updateFields
         * @return
         */
        public Builder updateFields(String[] updateFields) {
            this.updateFields = updateFields;
            return this;
        }


        /**
         * 该字段表示如果更新了新的负责人，则将原负责人设为指定的协作人角色。仅在update_fields包含owner字段时生效。根据清单的角色设计方式，不允许提前为清单的负责人添加其他角色，但负责人更新后，原有负责人会无法访问该清单。该字段可以帮助避免原负责人彻底退出清单。
         * <p> 示例值：editor
         *
         * @param originOwnerToRole
         * @return
         */
        public Builder originOwnerToRole(String originOwnerToRole) {
            this.originOwnerToRole = originOwnerToRole;
            return this;
        }

        /**
         * 该字段表示如果更新了新的负责人，则将原负责人设为指定的协作人角色。仅在update_fields包含owner字段时生效。根据清单的角色设计方式，不允许提前为清单的负责人添加其他角色，但负责人更新后，原有负责人会无法访问该清单。该字段可以帮助避免原负责人彻底退出清单。
         * <p> 示例值：editor
         *
         * @param originOwnerToRole {@link com.lark.oapi.service.task.v2.enums.PatchTasklistOriginOwnerToRoleEnum}
         * @return
         */
        public Builder originOwnerToRole(com.lark.oapi.service.task.v2.enums.PatchTasklistOriginOwnerToRoleEnum originOwnerToRole) {
            this.originOwnerToRole = originOwnerToRole.getValue();
            return this;
        }


        public PatchTasklistReqBody build() {
            return new PatchTasklistReqBody(this);
        }
    }
}
