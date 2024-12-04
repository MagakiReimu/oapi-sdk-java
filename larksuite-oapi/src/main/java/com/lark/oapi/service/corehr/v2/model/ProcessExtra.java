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

public class ProcessExtra {
    /**
     * 操作人，当system_user为true时，可以不传值
     * <p> 示例值：7184703091806602796
     */
    @SerializedName("operator")
    private String operator;
    /**
     * 流程节点id，与approver_id二选一传入，都传以node_id为准
     * <p> 示例值：7414045453433439788
     */
    @SerializedName("node_id")
    private String nodeId;
    /**
     * 审批任务id，与node_id二选一传入，都传以node_id为准
     * <p> 示例值：7424452160928106028
     */
    @SerializedName("approver_id")
    private String approverId;
    /**
     * 加签方式
     * <p> 示例值：1
     */
    @SerializedName("extra_type")
    private Integer extraType;
    /**
     * 多人加签时的审批方式
     * <p> 示例值：1
     */
    @SerializedName("approval_type")
    private Integer approvalType;
    /**
     * 加签人员id列表
     * <p> 示例值：
     */
    @SerializedName("extra_user_ids")
    private String[] extraUserIds;
    /**
     * 备注
     * <p> 示例值：备注
     */
    @SerializedName("remark")
    private String remark;
    /**
     * true-以系统身份操作
     * <p> 示例值：true
     */
    @SerializedName("system_user")
    private Boolean systemUser;

    // builder 开始
    public ProcessExtra() {
    }

    public ProcessExtra(Builder builder) {
        /**
         * 操作人，当system_user为true时，可以不传值
         * <p> 示例值：7184703091806602796
         */
        this.operator = builder.operator;
        /**
         * 流程节点id，与approver_id二选一传入，都传以node_id为准
         * <p> 示例值：7414045453433439788
         */
        this.nodeId = builder.nodeId;
        /**
         * 审批任务id，与node_id二选一传入，都传以node_id为准
         * <p> 示例值：7424452160928106028
         */
        this.approverId = builder.approverId;
        /**
         * 加签方式
         * <p> 示例值：1
         */
        this.extraType = builder.extraType;
        /**
         * 多人加签时的审批方式
         * <p> 示例值：1
         */
        this.approvalType = builder.approvalType;
        /**
         * 加签人员id列表
         * <p> 示例值：
         */
        this.extraUserIds = builder.extraUserIds;
        /**
         * 备注
         * <p> 示例值：备注
         */
        this.remark = builder.remark;
        /**
         * true-以系统身份操作
         * <p> 示例值：true
         */
        this.systemUser = builder.systemUser;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getOperator() {
        return this.operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getNodeId() {
        return this.nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getApproverId() {
        return this.approverId;
    }

    public void setApproverId(String approverId) {
        this.approverId = approverId;
    }

    public Integer getExtraType() {
        return this.extraType;
    }

    public void setExtraType(Integer extraType) {
        this.extraType = extraType;
    }

    public Integer getApprovalType() {
        return this.approvalType;
    }

    public void setApprovalType(Integer approvalType) {
        this.approvalType = approvalType;
    }

    public String[] getExtraUserIds() {
        return this.extraUserIds;
    }

    public void setExtraUserIds(String[] extraUserIds) {
        this.extraUserIds = extraUserIds;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Boolean getSystemUser() {
        return this.systemUser;
    }

    public void setSystemUser(Boolean systemUser) {
        this.systemUser = systemUser;
    }

    public static class Builder {
        /**
         * 操作人，当system_user为true时，可以不传值
         * <p> 示例值：7184703091806602796
         */
        private String operator;
        /**
         * 流程节点id，与approver_id二选一传入，都传以node_id为准
         * <p> 示例值：7414045453433439788
         */
        private String nodeId;
        /**
         * 审批任务id，与node_id二选一传入，都传以node_id为准
         * <p> 示例值：7424452160928106028
         */
        private String approverId;
        /**
         * 加签方式
         * <p> 示例值：1
         */
        private Integer extraType;
        /**
         * 多人加签时的审批方式
         * <p> 示例值：1
         */
        private Integer approvalType;
        /**
         * 加签人员id列表
         * <p> 示例值：
         */
        private String[] extraUserIds;
        /**
         * 备注
         * <p> 示例值：备注
         */
        private String remark;
        /**
         * true-以系统身份操作
         * <p> 示例值：true
         */
        private Boolean systemUser;

        /**
         * 操作人，当system_user为true时，可以不传值
         * <p> 示例值：7184703091806602796
         *
         * @param operator
         * @return
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }


        /**
         * 流程节点id，与approver_id二选一传入，都传以node_id为准
         * <p> 示例值：7414045453433439788
         *
         * @param nodeId
         * @return
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }


        /**
         * 审批任务id，与node_id二选一传入，都传以node_id为准
         * <p> 示例值：7424452160928106028
         *
         * @param approverId
         * @return
         */
        public Builder approverId(String approverId) {
            this.approverId = approverId;
            return this;
        }


        /**
         * 加签方式
         * <p> 示例值：1
         *
         * @param extraType
         * @return
         */
        public Builder extraType(Integer extraType) {
            this.extraType = extraType;
            return this;
        }

        /**
         * 加签方式
         * <p> 示例值：1
         *
         * @param extraType {@link com.lark.oapi.service.corehr.v2.enums.ProcessExtraExtraTypeEnum}
         * @return
         */
        public Builder extraType(com.lark.oapi.service.corehr.v2.enums.ProcessExtraExtraTypeEnum extraType) {
            this.extraType = extraType.getValue();
            return this;
        }


        /**
         * 多人加签时的审批方式
         * <p> 示例值：1
         *
         * @param approvalType
         * @return
         */
        public Builder approvalType(Integer approvalType) {
            this.approvalType = approvalType;
            return this;
        }

        /**
         * 多人加签时的审批方式
         * <p> 示例值：1
         *
         * @param approvalType {@link com.lark.oapi.service.corehr.v2.enums.ProcessExtraApprovalTypeEnum}
         * @return
         */
        public Builder approvalType(com.lark.oapi.service.corehr.v2.enums.ProcessExtraApprovalTypeEnum approvalType) {
            this.approvalType = approvalType.getValue();
            return this;
        }


        /**
         * 加签人员id列表
         * <p> 示例值：
         *
         * @param extraUserIds
         * @return
         */
        public Builder extraUserIds(String[] extraUserIds) {
            this.extraUserIds = extraUserIds;
            return this;
        }


        /**
         * 备注
         * <p> 示例值：备注
         *
         * @param remark
         * @return
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }


        /**
         * true-以系统身份操作
         * <p> 示例值：true
         *
         * @param systemUser
         * @return
         */
        public Builder systemUser(Boolean systemUser) {
            this.systemUser = systemUser;
            return this;
        }


        public ProcessExtra build() {
            return new ProcessExtra(this);
        }
    }
}
