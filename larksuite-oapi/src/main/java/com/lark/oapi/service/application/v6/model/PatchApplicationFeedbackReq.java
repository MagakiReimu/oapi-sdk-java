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
import com.lark.oapi.service.application.v6.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class PatchApplicationFeedbackReq {
    /**
     * <p> 示例值：open_id
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 反馈处理状态
     * <p> 示例值：1
     */
    @Query
    @SerializedName("status")
    private Integer status;
    /**
     * 反馈处理人员id，租户内用户的唯一标识， ID值与查询参数中的user_id_type 对应
     * <p> 示例值：ou_9565b69967831233761cc2f11b4c089f
     */
    @Query
    @SerializedName("operator_id")
    private String operatorId;
    /**
     * 目标应用 ID（本租户创建的所有应用）
     * <p> 示例值：cli_9f115af860f7901b
     */
    @Path
    @SerializedName("app_id")
    private String appId;
    /**
     * 应用反馈记录id
     * <p> 示例值：7057888018203574291
     */
    @Path
    @SerializedName("feedback_id")
    private String feedbackId;

    // builder 开始
    public PatchApplicationFeedbackReq() {
    }

    public PatchApplicationFeedbackReq(Builder builder) {
        /**
         *
         * <p> 示例值：open_id
         */
        this.userIdType = builder.userIdType;
        /**
         * 反馈处理状态
         * <p> 示例值：1
         */
        this.status = builder.status;
        /**
         * 反馈处理人员id，租户内用户的唯一标识， ID值与查询参数中的user_id_type 对应
         * <p> 示例值：ou_9565b69967831233761cc2f11b4c089f
         */
        this.operatorId = builder.operatorId;
        /**
         * 目标应用 ID（本租户创建的所有应用）
         * <p> 示例值：cli_9f115af860f7901b
         */
        this.appId = builder.appId;
        /**
         * 应用反馈记录id
         * <p> 示例值：7057888018203574291
         */
        this.feedbackId = builder.feedbackId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOperatorId() {
        return this.operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getFeedbackId() {
        return this.feedbackId;
    }

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
    }

    public static class Builder {
        private String userIdType; //
        private Integer status; // 反馈处理状态
        private String operatorId; // 反馈处理人员id，租户内用户的唯一标识， ID值与查询参数中的user_id_type 对应
        private String appId; // 目标应用 ID（本租户创建的所有应用）
        private String feedbackId; // 应用反馈记录id

        /**
         * <p> 示例值：open_id
         *
         * @param userIdType
         * @return
         */
        public Builder userIdType(String userIdType) {
            this.userIdType = userIdType;
            return this;
        }

        /**
         * <p> 示例值：open_id
         *
         * @param userIdType {@link com.lark.oapi.service.application.v6.enums.PatchApplicationFeedbackUserIdTypeEnum}
         * @return
         */
        public Builder userIdType(com.lark.oapi.service.application.v6.enums.PatchApplicationFeedbackUserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }

        /**
         * 反馈处理状态
         * <p> 示例值：1
         *
         * @param status
         * @return
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * 反馈处理状态
         * <p> 示例值：1
         *
         * @param status {@link com.lark.oapi.service.application.v6.enums.PatchApplicationFeedbackOpenMarkStatusEnum}
         * @return
         */
        public Builder status(com.lark.oapi.service.application.v6.enums.PatchApplicationFeedbackOpenMarkStatusEnum status) {
            this.status = status.getValue();
            return this;
        }

        /**
         * 反馈处理人员id，租户内用户的唯一标识， ID值与查询参数中的user_id_type 对应
         * <p> 示例值：ou_9565b69967831233761cc2f11b4c089f
         *
         * @param operatorId
         * @return
         */
        public Builder operatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }

        /**
         * 目标应用 ID（本租户创建的所有应用）
         * <p> 示例值：cli_9f115af860f7901b
         *
         * @param appId
         * @return
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }


        /**
         * 应用反馈记录id
         * <p> 示例值：7057888018203574291
         *
         * @param feedbackId
         * @return
         */
        public Builder feedbackId(String feedbackId) {
            this.feedbackId = feedbackId;
            return this;
        }

        public PatchApplicationFeedbackReq build() {
            return new PatchApplicationFeedbackReq(this);
        }
    }
}
