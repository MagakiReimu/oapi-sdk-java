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

import com.google.gson.annotations.SerializedName;

public class P2OffboardingStatusUpdatedV2Data {
    /**
     * 员工 ID
     * <p> 示例值：7072306364927985196
     */
    @SerializedName("employment_id")
    private String employmentId;
    /**
     * 员工的飞书用户 ID
     * <p> 示例值：
     */
    @SerializedName("target_user_id")
    private UserId targetUserId;
    /**
     * 离职记录 ID
     * <p> 示例值：7044427347159746085
     */
    @SerializedName("offboarding_id")
    private String offboardingId;
    /**
     * 离职发起后的审批流程实例 ID
     * <p> 示例值：7090409013925398060
     */
    @SerializedName("process_id")
    private String processId;
    /**
     * 离职状态
     * <p> 示例值：1
     */
    @SerializedName("status")
    private Integer status;

    public String getEmploymentId() {
        return this.employmentId;
    }

    public void setEmploymentId(String employmentId) {
        this.employmentId = employmentId;
    }

    public UserId getTargetUserId() {
        return this.targetUserId;
    }

    public void setTargetUserId(UserId targetUserId) {
        this.targetUserId = targetUserId;
    }

    public String getOffboardingId() {
        return this.offboardingId;
    }

    public void setOffboardingId(String offboardingId) {
        this.offboardingId = offboardingId;
    }

    public String getProcessId() {
        return this.processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
