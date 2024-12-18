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

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.corehr.v2.enums.*;
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

public class DepartmentChange {
    /**
     * 部门调整记录 ID
     * <p> 示例值：6991776076699549697
     */
    @SerializedName("department_change_id")
    private String departmentChangeId;
    /**
     * 部门 ID
     * <p> 示例值：6966236933198579208
     */
    @SerializedName("department_id")
    private String departmentId;
    /**
     * 调整部门 ID ，调整审批未生效前会返回格式为 td_xxx 的临时 ID
     * <p> 示例值：6966236933198579208
     */
    @SerializedName("draft_department_id")
    private String draftDepartmentId;
    /**
     * 调整类型
     * <p> 示例值：Create
     */
    @SerializedName("department_change_type")
    private String departmentChangeType;
    /**
     * 调整状态
     * <p> 示例值：0
     */
    @SerializedName("department_change_status")
    private Integer departmentChangeStatus;
    /**
     * 调整详细信息
     * <p> 示例值：
     */
    @SerializedName("reorganization_info")
    private ReorganizationInfo reorganizationInfo;

    // builder 开始
    public DepartmentChange() {
    }

    public DepartmentChange(Builder builder) {
        /**
         * 部门调整记录 ID
         * <p> 示例值：6991776076699549697
         */
        this.departmentChangeId = builder.departmentChangeId;
        /**
         * 部门 ID
         * <p> 示例值：6966236933198579208
         */
        this.departmentId = builder.departmentId;
        /**
         * 调整部门 ID ，调整审批未生效前会返回格式为 td_xxx 的临时 ID
         * <p> 示例值：6966236933198579208
         */
        this.draftDepartmentId = builder.draftDepartmentId;
        /**
         * 调整类型
         * <p> 示例值：Create
         */
        this.departmentChangeType = builder.departmentChangeType;
        /**
         * 调整状态
         * <p> 示例值：0
         */
        this.departmentChangeStatus = builder.departmentChangeStatus;
        /**
         * 调整详细信息
         * <p> 示例值：
         */
        this.reorganizationInfo = builder.reorganizationInfo;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getDepartmentChangeId() {
        return this.departmentChangeId;
    }

    public void setDepartmentChangeId(String departmentChangeId) {
        this.departmentChangeId = departmentChangeId;
    }

    public String getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDraftDepartmentId() {
        return this.draftDepartmentId;
    }

    public void setDraftDepartmentId(String draftDepartmentId) {
        this.draftDepartmentId = draftDepartmentId;
    }

    public String getDepartmentChangeType() {
        return this.departmentChangeType;
    }

    public void setDepartmentChangeType(String departmentChangeType) {
        this.departmentChangeType = departmentChangeType;
    }

    public Integer getDepartmentChangeStatus() {
        return this.departmentChangeStatus;
    }

    public void setDepartmentChangeStatus(Integer departmentChangeStatus) {
        this.departmentChangeStatus = departmentChangeStatus;
    }

    public ReorganizationInfo getReorganizationInfo() {
        return this.reorganizationInfo;
    }

    public void setReorganizationInfo(ReorganizationInfo reorganizationInfo) {
        this.reorganizationInfo = reorganizationInfo;
    }

    public static class Builder {
        /**
         * 部门调整记录 ID
         * <p> 示例值：6991776076699549697
         */
        private String departmentChangeId;
        /**
         * 部门 ID
         * <p> 示例值：6966236933198579208
         */
        private String departmentId;
        /**
         * 调整部门 ID ，调整审批未生效前会返回格式为 td_xxx 的临时 ID
         * <p> 示例值：6966236933198579208
         */
        private String draftDepartmentId;
        /**
         * 调整类型
         * <p> 示例值：Create
         */
        private String departmentChangeType;
        /**
         * 调整状态
         * <p> 示例值：0
         */
        private Integer departmentChangeStatus;
        /**
         * 调整详细信息
         * <p> 示例值：
         */
        private ReorganizationInfo reorganizationInfo;

        /**
         * 部门调整记录 ID
         * <p> 示例值：6991776076699549697
         *
         * @param departmentChangeId
         * @return
         */
        public Builder departmentChangeId(String departmentChangeId) {
            this.departmentChangeId = departmentChangeId;
            return this;
        }


        /**
         * 部门 ID
         * <p> 示例值：6966236933198579208
         *
         * @param departmentId
         * @return
         */
        public Builder departmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }


        /**
         * 调整部门 ID ，调整审批未生效前会返回格式为 td_xxx 的临时 ID
         * <p> 示例值：6966236933198579208
         *
         * @param draftDepartmentId
         * @return
         */
        public Builder draftDepartmentId(String draftDepartmentId) {
            this.draftDepartmentId = draftDepartmentId;
            return this;
        }


        /**
         * 调整类型
         * <p> 示例值：Create
         *
         * @param departmentChangeType
         * @return
         */
        public Builder departmentChangeType(String departmentChangeType) {
            this.departmentChangeType = departmentChangeType;
            return this;
        }

        /**
         * 调整类型
         * <p> 示例值：Create
         *
         * @param departmentChangeType {@link com.lark.oapi.service.corehr.v2.enums.DepartmentChangeDepartmentChangeTypeEnum}
         * @return
         */
        public Builder departmentChangeType(com.lark.oapi.service.corehr.v2.enums.DepartmentChangeDepartmentChangeTypeEnum departmentChangeType) {
            this.departmentChangeType = departmentChangeType.getValue();
            return this;
        }


        /**
         * 调整状态
         * <p> 示例值：0
         *
         * @param departmentChangeStatus
         * @return
         */
        public Builder departmentChangeStatus(Integer departmentChangeStatus) {
            this.departmentChangeStatus = departmentChangeStatus;
            return this;
        }

        /**
         * 调整状态
         * <p> 示例值：0
         *
         * @param departmentChangeStatus {@link com.lark.oapi.service.corehr.v2.enums.DepartmentChangeDepartmentChangeStatusEnum}
         * @return
         */
        public Builder departmentChangeStatus(com.lark.oapi.service.corehr.v2.enums.DepartmentChangeDepartmentChangeStatusEnum departmentChangeStatus) {
            this.departmentChangeStatus = departmentChangeStatus.getValue();
            return this;
        }


        /**
         * 调整详细信息
         * <p> 示例值：
         *
         * @param reorganizationInfo
         * @return
         */
        public Builder reorganizationInfo(ReorganizationInfo reorganizationInfo) {
            this.reorganizationInfo = reorganizationInfo;
            return this;
        }


        public DepartmentChange build() {
            return new DepartmentChange(this);
        }
    }
}
