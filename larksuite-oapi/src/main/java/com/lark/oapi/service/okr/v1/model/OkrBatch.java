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

package com.lark.oapi.service.okr.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.okr.v1.enums.*;
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

public class OkrBatch {
    /**
     * id
     * <p> 示例值：11123123123123
     */
    @SerializedName("id")
    private String id;
    /**
     * OKR的访问权限
     * <p> 示例值：0
     */
    @SerializedName("permission")
    private Integer permission;
    /**
     * period_id
     * <p> 示例值：11123123123123
     */
    @SerializedName("period_id")
    private String periodId;
    /**
     * 名称
     * <p> 示例值：My OKR
     */
    @SerializedName("name")
    private String name;
    /**
     * Objective列表
     * <p> 示例值：
     */
    @SerializedName("objective_list")
    private OkrObjective[] objectiveList;
    /**
     * OKR确认状态
     * <p> 示例值：0
     */
    @SerializedName("confirm_status")
    private Integer confirmStatus;

    // builder 开始
    public OkrBatch() {
    }

    public OkrBatch(Builder builder) {
        /**
         * id
         * <p> 示例值：11123123123123
         */
        this.id = builder.id;
        /**
         * OKR的访问权限
         * <p> 示例值：0
         */
        this.permission = builder.permission;
        /**
         * period_id
         * <p> 示例值：11123123123123
         */
        this.periodId = builder.periodId;
        /**
         * 名称
         * <p> 示例值：My OKR
         */
        this.name = builder.name;
        /**
         * Objective列表
         * <p> 示例值：
         */
        this.objectiveList = builder.objectiveList;
        /**
         * OKR确认状态
         * <p> 示例值：0
         */
        this.confirmStatus = builder.confirmStatus;
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

    public Integer getPermission() {
        return this.permission;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    public String getPeriodId() {
        return this.periodId;
    }

    public void setPeriodId(String periodId) {
        this.periodId = periodId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OkrObjective[] getObjectiveList() {
        return this.objectiveList;
    }

    public void setObjectiveList(OkrObjective[] objectiveList) {
        this.objectiveList = objectiveList;
    }

    public Integer getConfirmStatus() {
        return this.confirmStatus;
    }

    public void setConfirmStatus(Integer confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    public static class Builder {
        /**
         * id
         * <p> 示例值：11123123123123
         */
        private String id;
        /**
         * OKR的访问权限
         * <p> 示例值：0
         */
        private Integer permission;
        /**
         * period_id
         * <p> 示例值：11123123123123
         */
        private String periodId;
        /**
         * 名称
         * <p> 示例值：My OKR
         */
        private String name;
        /**
         * Objective列表
         * <p> 示例值：
         */
        private OkrObjective[] objectiveList;
        /**
         * OKR确认状态
         * <p> 示例值：0
         */
        private Integer confirmStatus;

        /**
         * id
         * <p> 示例值：11123123123123
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * OKR的访问权限
         * <p> 示例值：0
         *
         * @param permission
         * @return
         */
        public Builder permission(Integer permission) {
            this.permission = permission;
            return this;
        }

        /**
         * OKR的访问权限
         * <p> 示例值：0
         *
         * @param permission {@link com.lark.oapi.service.okr.v1.enums.OkrBatchPermissionEnum}
         * @return
         */
        public Builder permission(com.lark.oapi.service.okr.v1.enums.OkrBatchPermissionEnum permission) {
            this.permission = permission.getValue();
            return this;
        }


        /**
         * period_id
         * <p> 示例值：11123123123123
         *
         * @param periodId
         * @return
         */
        public Builder periodId(String periodId) {
            this.periodId = periodId;
            return this;
        }


        /**
         * 名称
         * <p> 示例值：My OKR
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * Objective列表
         * <p> 示例值：
         *
         * @param objectiveList
         * @return
         */
        public Builder objectiveList(OkrObjective[] objectiveList) {
            this.objectiveList = objectiveList;
            return this;
        }


        /**
         * OKR确认状态
         * <p> 示例值：0
         *
         * @param confirmStatus
         * @return
         */
        public Builder confirmStatus(Integer confirmStatus) {
            this.confirmStatus = confirmStatus;
            return this;
        }

        /**
         * OKR确认状态
         * <p> 示例值：0
         *
         * @param confirmStatus {@link com.lark.oapi.service.okr.v1.enums.OkrBatchConfirmStatusEnum}
         * @return
         */
        public Builder confirmStatus(com.lark.oapi.service.okr.v1.enums.OkrBatchConfirmStatusEnum confirmStatus) {
            this.confirmStatus = confirmStatus.getValue();
            return this;
        }


        public OkrBatch build() {
            return new OkrBatch(this);
        }
    }
}
