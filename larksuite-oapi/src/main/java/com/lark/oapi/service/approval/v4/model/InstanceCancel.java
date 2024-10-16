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

package com.lark.oapi.service.approval.v4.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.approval.v4.enums.*;
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

public class InstanceCancel {
    /**
     * 审批定义Code
     * <p> 示例值：7C468A54-8745-2245-9675-08B7C63E7A85
     */
    @SerializedName("approval_code")
    private String approvalCode;
    /**
     * 审批实例Code
     * <p> 示例值：81D31358-93AF-92D6-7425-01A5D67C4E71
     */
    @SerializedName("instance_code")
    private String instanceCode;
    /**
     * 操作用户, 根据user_id_type填写
     * <p> 示例值：f7cb567e
     */
    @SerializedName("user_id")
    private String userId;

    // builder 开始
    public InstanceCancel() {
    }

    public InstanceCancel(Builder builder) {
        /**
         * 审批定义Code
         * <p> 示例值：7C468A54-8745-2245-9675-08B7C63E7A85
         */
        this.approvalCode = builder.approvalCode;
        /**
         * 审批实例Code
         * <p> 示例值：81D31358-93AF-92D6-7425-01A5D67C4E71
         */
        this.instanceCode = builder.instanceCode;
        /**
         * 操作用户, 根据user_id_type填写
         * <p> 示例值：f7cb567e
         */
        this.userId = builder.userId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getApprovalCode() {
        return this.approvalCode;
    }

    public void setApprovalCode(String approvalCode) {
        this.approvalCode = approvalCode;
    }

    public String getInstanceCode() {
        return this.instanceCode;
    }

    public void setInstanceCode(String instanceCode) {
        this.instanceCode = instanceCode;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public static class Builder {
        /**
         * 审批定义Code
         * <p> 示例值：7C468A54-8745-2245-9675-08B7C63E7A85
         */
        private String approvalCode;
        /**
         * 审批实例Code
         * <p> 示例值：81D31358-93AF-92D6-7425-01A5D67C4E71
         */
        private String instanceCode;
        /**
         * 操作用户, 根据user_id_type填写
         * <p> 示例值：f7cb567e
         */
        private String userId;

        /**
         * 审批定义Code
         * <p> 示例值：7C468A54-8745-2245-9675-08B7C63E7A85
         *
         * @param approvalCode
         * @return
         */
        public Builder approvalCode(String approvalCode) {
            this.approvalCode = approvalCode;
            return this;
        }


        /**
         * 审批实例Code
         * <p> 示例值：81D31358-93AF-92D6-7425-01A5D67C4E71
         *
         * @param instanceCode
         * @return
         */
        public Builder instanceCode(String instanceCode) {
            this.instanceCode = instanceCode;
            return this;
        }


        /**
         * 操作用户, 根据user_id_type填写
         * <p> 示例值：f7cb567e
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        public InstanceCancel build() {
            return new InstanceCancel(this);
        }
    }
}
