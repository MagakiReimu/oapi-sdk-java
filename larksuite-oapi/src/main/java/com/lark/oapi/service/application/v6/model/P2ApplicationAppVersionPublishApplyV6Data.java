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

package com.lark.oapi.service.application.v6.model;

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

public class P2ApplicationAppVersionPublishApplyV6Data {
    /**
     * 用户 ID
     * <p> 示例值：
     */
    @SerializedName("operator_id")
    private UserId operatorId;
    /**
     * 当前线上版本信息
     * <p> 示例值：
     */
    @SerializedName("online_version")
    private ApplicationAppVersionEvent onlineVersion;
    /**
     * 当前在审核的应用版本
     * <p> 示例值：
     */
    @SerializedName("under_audit_version")
    private ApplicationAppVersionEvent underAuditVersion;
    /**
     * 应用状态
     * <p> 示例值：1
     */
    @SerializedName("app_status")
    private Integer appStatus;

    public UserId getOperatorId() {
        return this.operatorId;
    }

    public void setOperatorId(UserId operatorId) {
        this.operatorId = operatorId;
    }

    public ApplicationAppVersionEvent getOnlineVersion() {
        return this.onlineVersion;
    }

    public void setOnlineVersion(ApplicationAppVersionEvent onlineVersion) {
        this.onlineVersion = onlineVersion;
    }

    public ApplicationAppVersionEvent getUnderAuditVersion() {
        return this.underAuditVersion;
    }

    public void setUnderAuditVersion(ApplicationAppVersionEvent underAuditVersion) {
        this.underAuditVersion = underAuditVersion;
    }

    public Integer getAppStatus() {
        return this.appStatus;
    }

    public void setAppStatus(Integer appStatus) {
        this.appStatus = appStatus;
    }

}
