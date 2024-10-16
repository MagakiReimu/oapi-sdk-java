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

package com.lark.oapi.service.corehr.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.corehr.v1.enums.*;
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

public class JobChange {
    /**
     * 异动记录 id
     * <p> 示例值：6991776076699549697
     */
    @SerializedName("job_change_id")
    private String jobChangeId;
    /**
     * 雇员 id
     * <p> 示例值：ou_a294793e8fa21529f2a60e3e9de45520
     */
    @SerializedName("employment_id")
    private String employmentId;
    /**
     * 异动状态
     * <p> 示例值：4
     */
    @SerializedName("status")
    private String status;
    /**
     * 异动类型唯一标识
     * <p> 示例值：direct_leader_change
     */
    @SerializedName("transfer_type_unique_identifier")
    private String transferTypeUniqueIdentifier;
    /**
     * 异动原因唯一标识
     * <p> 示例值：involuntary_transfer
     */
    @SerializedName("transfer_reason_unique_identifier")
    private String transferReasonUniqueIdentifier;
    /**
     * 异动发起后审批流程 id
     * <p> 示例值：6991776078461142564
     */
    @SerializedName("process_id")
    private String processId;
    /**
     * 异动生效日期
     * <p> 示例值：2022-03-01
     */
    @SerializedName("effective_date")
    private String effectiveDate;
    /**
     * 创建时间
     * <p> 示例值：1627899724000
     */
    @SerializedName("created_time")
    private String createdTime;
    /**
     * 更新时间
     * <p> 示例值：1647434443000
     */
    @SerializedName("updated_time")
    private String updatedTime;
    /**
     * 异动详细信息
     * <p> 示例值：
     */
    @SerializedName("transfer_info")
    private TransferInfo transferInfo;

    // builder 开始
    public JobChange() {
    }

    public JobChange(Builder builder) {
        /**
         * 异动记录 id
         * <p> 示例值：6991776076699549697
         */
        this.jobChangeId = builder.jobChangeId;
        /**
         * 雇员 id
         * <p> 示例值：ou_a294793e8fa21529f2a60e3e9de45520
         */
        this.employmentId = builder.employmentId;
        /**
         * 异动状态
         * <p> 示例值：4
         */
        this.status = builder.status;
        /**
         * 异动类型唯一标识
         * <p> 示例值：direct_leader_change
         */
        this.transferTypeUniqueIdentifier = builder.transferTypeUniqueIdentifier;
        /**
         * 异动原因唯一标识
         * <p> 示例值：involuntary_transfer
         */
        this.transferReasonUniqueIdentifier = builder.transferReasonUniqueIdentifier;
        /**
         * 异动发起后审批流程 id
         * <p> 示例值：6991776078461142564
         */
        this.processId = builder.processId;
        /**
         * 异动生效日期
         * <p> 示例值：2022-03-01
         */
        this.effectiveDate = builder.effectiveDate;
        /**
         * 创建时间
         * <p> 示例值：1627899724000
         */
        this.createdTime = builder.createdTime;
        /**
         * 更新时间
         * <p> 示例值：1647434443000
         */
        this.updatedTime = builder.updatedTime;
        /**
         * 异动详细信息
         * <p> 示例值：
         */
        this.transferInfo = builder.transferInfo;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getJobChangeId() {
        return this.jobChangeId;
    }

    public void setJobChangeId(String jobChangeId) {
        this.jobChangeId = jobChangeId;
    }

    public String getEmploymentId() {
        return this.employmentId;
    }

    public void setEmploymentId(String employmentId) {
        this.employmentId = employmentId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTransferTypeUniqueIdentifier() {
        return this.transferTypeUniqueIdentifier;
    }

    public void setTransferTypeUniqueIdentifier(String transferTypeUniqueIdentifier) {
        this.transferTypeUniqueIdentifier = transferTypeUniqueIdentifier;
    }

    public String getTransferReasonUniqueIdentifier() {
        return this.transferReasonUniqueIdentifier;
    }

    public void setTransferReasonUniqueIdentifier(String transferReasonUniqueIdentifier) {
        this.transferReasonUniqueIdentifier = transferReasonUniqueIdentifier;
    }

    public String getProcessId() {
        return this.processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getEffectiveDate() {
        return this.effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedTime() {
        return this.updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public TransferInfo getTransferInfo() {
        return this.transferInfo;
    }

    public void setTransferInfo(TransferInfo transferInfo) {
        this.transferInfo = transferInfo;
    }

    public static class Builder {
        /**
         * 异动记录 id
         * <p> 示例值：6991776076699549697
         */
        private String jobChangeId;
        /**
         * 雇员 id
         * <p> 示例值：ou_a294793e8fa21529f2a60e3e9de45520
         */
        private String employmentId;
        /**
         * 异动状态
         * <p> 示例值：4
         */
        private String status;
        /**
         * 异动类型唯一标识
         * <p> 示例值：direct_leader_change
         */
        private String transferTypeUniqueIdentifier;
        /**
         * 异动原因唯一标识
         * <p> 示例值：involuntary_transfer
         */
        private String transferReasonUniqueIdentifier;
        /**
         * 异动发起后审批流程 id
         * <p> 示例值：6991776078461142564
         */
        private String processId;
        /**
         * 异动生效日期
         * <p> 示例值：2022-03-01
         */
        private String effectiveDate;
        /**
         * 创建时间
         * <p> 示例值：1627899724000
         */
        private String createdTime;
        /**
         * 更新时间
         * <p> 示例值：1647434443000
         */
        private String updatedTime;
        /**
         * 异动详细信息
         * <p> 示例值：
         */
        private TransferInfo transferInfo;

        /**
         * 异动记录 id
         * <p> 示例值：6991776076699549697
         *
         * @param jobChangeId
         * @return
         */
        public Builder jobChangeId(String jobChangeId) {
            this.jobChangeId = jobChangeId;
            return this;
        }


        /**
         * 雇员 id
         * <p> 示例值：ou_a294793e8fa21529f2a60e3e9de45520
         *
         * @param employmentId
         * @return
         */
        public Builder employmentId(String employmentId) {
            this.employmentId = employmentId;
            return this;
        }


        /**
         * 异动状态
         * <p> 示例值：4
         *
         * @param status
         * @return
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * 异动状态
         * <p> 示例值：4
         *
         * @param status {@link com.lark.oapi.service.corehr.v1.enums.JobChangeStatusEnum}
         * @return
         */
        public Builder status(com.lark.oapi.service.corehr.v1.enums.JobChangeStatusEnum status) {
            this.status = status.getValue();
            return this;
        }


        /**
         * 异动类型唯一标识
         * <p> 示例值：direct_leader_change
         *
         * @param transferTypeUniqueIdentifier
         * @return
         */
        public Builder transferTypeUniqueIdentifier(String transferTypeUniqueIdentifier) {
            this.transferTypeUniqueIdentifier = transferTypeUniqueIdentifier;
            return this;
        }


        /**
         * 异动原因唯一标识
         * <p> 示例值：involuntary_transfer
         *
         * @param transferReasonUniqueIdentifier
         * @return
         */
        public Builder transferReasonUniqueIdentifier(String transferReasonUniqueIdentifier) {
            this.transferReasonUniqueIdentifier = transferReasonUniqueIdentifier;
            return this;
        }


        /**
         * 异动发起后审批流程 id
         * <p> 示例值：6991776078461142564
         *
         * @param processId
         * @return
         */
        public Builder processId(String processId) {
            this.processId = processId;
            return this;
        }


        /**
         * 异动生效日期
         * <p> 示例值：2022-03-01
         *
         * @param effectiveDate
         * @return
         */
        public Builder effectiveDate(String effectiveDate) {
            this.effectiveDate = effectiveDate;
            return this;
        }


        /**
         * 创建时间
         * <p> 示例值：1627899724000
         *
         * @param createdTime
         * @return
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }


        /**
         * 更新时间
         * <p> 示例值：1647434443000
         *
         * @param updatedTime
         * @return
         */
        public Builder updatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }


        /**
         * 异动详细信息
         * <p> 示例值：
         *
         * @param transferInfo
         * @return
         */
        public Builder transferInfo(TransferInfo transferInfo) {
            this.transferInfo = transferInfo;
            return this;
        }


        public JobChange build() {
            return new JobChange(this);
        }
    }
}
