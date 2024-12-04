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

public class P2ApprovalGroupsUpdatedV2Data {
    /**
     * 组织架构调整审批组 ID
     * <p> 示例值：6991776076699549697
     */
    @SerializedName("approval_group_id")
    private String approvalGroupId;
    /**
     * 组织架构调整流程 ID
     * <p> 示例值：6991776076699549697
     */
    @SerializedName("process_id")
    private String processId;
    /**
     * 组织架构调整流程状态
     * <p> 示例值：1
     */
    @SerializedName("approval_group_status")
    private Integer approvalGroupStatus;
    /**
     * 调整主题
     * <p> 示例值：测试组织架构调整
     */
    @SerializedName("topic")
    private String topic;
    /**
     * 调整原因
     * <p> 示例值：测试
     */
    @SerializedName("adjust_reason")
    private String adjustReason;
    /**
     * 生效日期
     * <p> 示例值：2022-03-01
     */
    @SerializedName("effective_date")
    private String effectiveDate;
    /**
     * 发起人
     * <p> 示例值：6974641477444060708
     */
    @SerializedName("created_by")
    private String createdBy;
    /**
     * 组织架构调整任务 ID
     * <p> 示例值：6991776076699549697
     */
    @SerializedName("draft_id")
    private String draftId;
    /**
     * 组织架构调整任务状态
     * <p> 示例值：1
     */
    @SerializedName("draft_status")
    private Integer draftStatus;

    public String getApprovalGroupId() {
        return this.approvalGroupId;
    }

    public void setApprovalGroupId(String approvalGroupId) {
        this.approvalGroupId = approvalGroupId;
    }

    public String getProcessId() {
        return this.processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public Integer getApprovalGroupStatus() {
        return this.approvalGroupStatus;
    }

    public void setApprovalGroupStatus(Integer approvalGroupStatus) {
        this.approvalGroupStatus = approvalGroupStatus;
    }

    public String getTopic() {
        return this.topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getAdjustReason() {
        return this.adjustReason;
    }

    public void setAdjustReason(String adjustReason) {
        this.adjustReason = adjustReason;
    }

    public String getEffectiveDate() {
        return this.effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getDraftId() {
        return this.draftId;
    }

    public void setDraftId(String draftId) {
        this.draftId = draftId;
    }

    public Integer getDraftStatus() {
        return this.draftStatus;
    }

    public void setDraftStatus(Integer draftStatus) {
        this.draftStatus = draftStatus;
    }

}
