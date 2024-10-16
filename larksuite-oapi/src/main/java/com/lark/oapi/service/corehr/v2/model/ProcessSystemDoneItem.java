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

public class ProcessSystemDoneItem {
    /**
     * 单据ID
     * <p> 示例值：7278949005675988535
     */
    @SerializedName("approver_id")
    private String approverId;
    /**
     * 单据类型
     * <p> 示例值：1
     */
    @SerializedName("type")
    private Integer type;
    /**
     * 单据状态
     * <p> 示例值：3
     */
    @SerializedName("status")
    private Integer status;
    /**
     * 单据地址
     * <p> 示例值：
     */
    @SerializedName("links")
    private ProcessLink links;
    /**
     * 操作人姓名
     * <p> 示例值：7124991993901827628
     */
    @SerializedName("operator_name")
    private DataengineI18n operatorName;
    /**
     * 节点名称
     * <p> 示例值：
     */
    @SerializedName("node_name")
    private DataengineI18n nodeName;
    /**
     * 创建时间，Unix毫秒时间戳
     * <p> 示例值：1694769814036
     */
    @SerializedName("create_time")
    private String createTime;
    /**
     * 完成时间，Unix毫秒时间戳
     * <p> 示例值：1694769814036
     */
    @SerializedName("complete_time")
    private String completeTime;
    /**
     * 节点定义ID（注：在回退场景，同一个节点会对应多个节点实例）
     * <p> 示例值：approval_d25b5eddfef
     */
    @SerializedName("node_definition_id")
    private String nodeDefinitionId;
    /**
     * 审批意见
     * <p> 示例值：审批意见
     */
    @SerializedName("approval_opinion")
    private String approvalOpinion;

    // builder 开始
    public ProcessSystemDoneItem() {
    }

    public ProcessSystemDoneItem(Builder builder) {
        /**
         * 单据ID
         * <p> 示例值：7278949005675988535
         */
        this.approverId = builder.approverId;
        /**
         * 单据类型
         * <p> 示例值：1
         */
        this.type = builder.type;
        /**
         * 单据状态
         * <p> 示例值：3
         */
        this.status = builder.status;
        /**
         * 单据地址
         * <p> 示例值：
         */
        this.links = builder.links;
        /**
         * 操作人姓名
         * <p> 示例值：7124991993901827628
         */
        this.operatorName = builder.operatorName;
        /**
         * 节点名称
         * <p> 示例值：
         */
        this.nodeName = builder.nodeName;
        /**
         * 创建时间，Unix毫秒时间戳
         * <p> 示例值：1694769814036
         */
        this.createTime = builder.createTime;
        /**
         * 完成时间，Unix毫秒时间戳
         * <p> 示例值：1694769814036
         */
        this.completeTime = builder.completeTime;
        /**
         * 节点定义ID（注：在回退场景，同一个节点会对应多个节点实例）
         * <p> 示例值：approval_d25b5eddfef
         */
        this.nodeDefinitionId = builder.nodeDefinitionId;
        /**
         * 审批意见
         * <p> 示例值：审批意见
         */
        this.approvalOpinion = builder.approvalOpinion;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getApproverId() {
        return this.approverId;
    }

    public void setApproverId(String approverId) {
        this.approverId = approverId;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ProcessLink getLinks() {
        return this.links;
    }

    public void setLinks(ProcessLink links) {
        this.links = links;
    }

    public DataengineI18n getOperatorName() {
        return this.operatorName;
    }

    public void setOperatorName(DataengineI18n operatorName) {
        this.operatorName = operatorName;
    }

    public DataengineI18n getNodeName() {
        return this.nodeName;
    }

    public void setNodeName(DataengineI18n nodeName) {
        this.nodeName = nodeName;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCompleteTime() {
        return this.completeTime;
    }

    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
    }

    public String getNodeDefinitionId() {
        return this.nodeDefinitionId;
    }

    public void setNodeDefinitionId(String nodeDefinitionId) {
        this.nodeDefinitionId = nodeDefinitionId;
    }

    public String getApprovalOpinion() {
        return this.approvalOpinion;
    }

    public void setApprovalOpinion(String approvalOpinion) {
        this.approvalOpinion = approvalOpinion;
    }

    public static class Builder {
        /**
         * 单据ID
         * <p> 示例值：7278949005675988535
         */
        private String approverId;
        /**
         * 单据类型
         * <p> 示例值：1
         */
        private Integer type;
        /**
         * 单据状态
         * <p> 示例值：3
         */
        private Integer status;
        /**
         * 单据地址
         * <p> 示例值：
         */
        private ProcessLink links;
        /**
         * 操作人姓名
         * <p> 示例值：7124991993901827628
         */
        private DataengineI18n operatorName;
        /**
         * 节点名称
         * <p> 示例值：
         */
        private DataengineI18n nodeName;
        /**
         * 创建时间，Unix毫秒时间戳
         * <p> 示例值：1694769814036
         */
        private String createTime;
        /**
         * 完成时间，Unix毫秒时间戳
         * <p> 示例值：1694769814036
         */
        private String completeTime;
        /**
         * 节点定义ID（注：在回退场景，同一个节点会对应多个节点实例）
         * <p> 示例值：approval_d25b5eddfef
         */
        private String nodeDefinitionId;
        /**
         * 审批意见
         * <p> 示例值：审批意见
         */
        private String approvalOpinion;

        /**
         * 单据ID
         * <p> 示例值：7278949005675988535
         *
         * @param approverId
         * @return
         */
        public Builder approverId(String approverId) {
            this.approverId = approverId;
            return this;
        }


        /**
         * 单据类型
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
         * 单据类型
         * <p> 示例值：1
         *
         * @param type {@link com.lark.oapi.service.corehr.v2.enums.ProcessSystemDoneItemApproverTypeEnum}
         * @return
         */
        public Builder type(com.lark.oapi.service.corehr.v2.enums.ProcessSystemDoneItemApproverTypeEnum type) {
            this.type = type.getValue();
            return this;
        }


        /**
         * 单据状态
         * <p> 示例值：3
         *
         * @param status
         * @return
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * 单据状态
         * <p> 示例值：3
         *
         * @param status {@link com.lark.oapi.service.corehr.v2.enums.ProcessSystemDoneItemApproverStatusEnum}
         * @return
         */
        public Builder status(com.lark.oapi.service.corehr.v2.enums.ProcessSystemDoneItemApproverStatusEnum status) {
            this.status = status.getValue();
            return this;
        }


        /**
         * 单据地址
         * <p> 示例值：
         *
         * @param links
         * @return
         */
        public Builder links(ProcessLink links) {
            this.links = links;
            return this;
        }


        /**
         * 操作人姓名
         * <p> 示例值：7124991993901827628
         *
         * @param operatorName
         * @return
         */
        public Builder operatorName(DataengineI18n operatorName) {
            this.operatorName = operatorName;
            return this;
        }


        /**
         * 节点名称
         * <p> 示例值：
         *
         * @param nodeName
         * @return
         */
        public Builder nodeName(DataengineI18n nodeName) {
            this.nodeName = nodeName;
            return this;
        }


        /**
         * 创建时间，Unix毫秒时间戳
         * <p> 示例值：1694769814036
         *
         * @param createTime
         * @return
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }


        /**
         * 完成时间，Unix毫秒时间戳
         * <p> 示例值：1694769814036
         *
         * @param completeTime
         * @return
         */
        public Builder completeTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }


        /**
         * 节点定义ID（注：在回退场景，同一个节点会对应多个节点实例）
         * <p> 示例值：approval_d25b5eddfef
         *
         * @param nodeDefinitionId
         * @return
         */
        public Builder nodeDefinitionId(String nodeDefinitionId) {
            this.nodeDefinitionId = nodeDefinitionId;
            return this;
        }


        /**
         * 审批意见
         * <p> 示例值：审批意见
         *
         * @param approvalOpinion
         * @return
         */
        public Builder approvalOpinion(String approvalOpinion) {
            this.approvalOpinion = approvalOpinion;
            return this;
        }


        public ProcessSystemDoneItem build() {
            return new ProcessSystemDoneItem(this);
        }
    }
}
