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

package com.lark.oapi.service.vc.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.vc.v1.enums.*;
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

public class RoomStatus {
    /**
     * 是否启用会议室
     * <p> 示例值：true
     */
    @SerializedName("status")
    private Boolean status;
    /**
     * 会议室未来状态为启用或禁用
     * <p> 示例值：true
     */
    @SerializedName("schedule_status")
    private Boolean scheduleStatus;
    /**
     * 禁用开始时间（unix时间，单位sec）
     * <p> 示例值：1652356050
     */
    @SerializedName("disable_start_time")
    private String disableStartTime;
    /**
     * 禁用结束时间（unix时间，单位sec，数值0表示永久禁用）
     * <p> 示例值：1652442450
     */
    @SerializedName("disable_end_time")
    private String disableEndTime;
    /**
     * 禁用原因
     * <p> 示例值：测试占用
     */
    @SerializedName("disable_reason")
    private String disableReason;
    /**
     * 联系人列表，id类型由user_id_type参数决定
     * <p> 示例值：["ou_3ec3f6a28a0d08c45d895276e8e5e19b"]
     */
    @SerializedName("contact_ids")
    private String[] contactIds;
    /**
     * 是否在禁用时发送通知给预定了该会议室的员工
     * <p> 示例值：true
     */
    @SerializedName("disable_notice")
    private Boolean disableNotice;
    /**
     * 是否在恢复启用时发送通知给联系人
     * <p> 示例值：true
     */
    @SerializedName("resume_notice")
    private Boolean resumeNotice;

    // builder 开始
    public RoomStatus() {
    }

    public RoomStatus(Builder builder) {
        /**
         * 是否启用会议室
         * <p> 示例值：true
         */
        this.status = builder.status;
        /**
         * 会议室未来状态为启用或禁用
         * <p> 示例值：true
         */
        this.scheduleStatus = builder.scheduleStatus;
        /**
         * 禁用开始时间（unix时间，单位sec）
         * <p> 示例值：1652356050
         */
        this.disableStartTime = builder.disableStartTime;
        /**
         * 禁用结束时间（unix时间，单位sec，数值0表示永久禁用）
         * <p> 示例值：1652442450
         */
        this.disableEndTime = builder.disableEndTime;
        /**
         * 禁用原因
         * <p> 示例值：测试占用
         */
        this.disableReason = builder.disableReason;
        /**
         * 联系人列表，id类型由user_id_type参数决定
         * <p> 示例值：["ou_3ec3f6a28a0d08c45d895276e8e5e19b"]
         */
        this.contactIds = builder.contactIds;
        /**
         * 是否在禁用时发送通知给预定了该会议室的员工
         * <p> 示例值：true
         */
        this.disableNotice = builder.disableNotice;
        /**
         * 是否在恢复启用时发送通知给联系人
         * <p> 示例值：true
         */
        this.resumeNotice = builder.resumeNotice;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getScheduleStatus() {
        return this.scheduleStatus;
    }

    public void setScheduleStatus(Boolean scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }

    public String getDisableStartTime() {
        return this.disableStartTime;
    }

    public void setDisableStartTime(String disableStartTime) {
        this.disableStartTime = disableStartTime;
    }

    public String getDisableEndTime() {
        return this.disableEndTime;
    }

    public void setDisableEndTime(String disableEndTime) {
        this.disableEndTime = disableEndTime;
    }

    public String getDisableReason() {
        return this.disableReason;
    }

    public void setDisableReason(String disableReason) {
        this.disableReason = disableReason;
    }

    public String[] getContactIds() {
        return this.contactIds;
    }

    public void setContactIds(String[] contactIds) {
        this.contactIds = contactIds;
    }

    public Boolean getDisableNotice() {
        return this.disableNotice;
    }

    public void setDisableNotice(Boolean disableNotice) {
        this.disableNotice = disableNotice;
    }

    public Boolean getResumeNotice() {
        return this.resumeNotice;
    }

    public void setResumeNotice(Boolean resumeNotice) {
        this.resumeNotice = resumeNotice;
    }

    public static class Builder {
        /**
         * 是否启用会议室
         * <p> 示例值：true
         */
        private Boolean status;
        /**
         * 会议室未来状态为启用或禁用
         * <p> 示例值：true
         */
        private Boolean scheduleStatus;
        /**
         * 禁用开始时间（unix时间，单位sec）
         * <p> 示例值：1652356050
         */
        private String disableStartTime;
        /**
         * 禁用结束时间（unix时间，单位sec，数值0表示永久禁用）
         * <p> 示例值：1652442450
         */
        private String disableEndTime;
        /**
         * 禁用原因
         * <p> 示例值：测试占用
         */
        private String disableReason;
        /**
         * 联系人列表，id类型由user_id_type参数决定
         * <p> 示例值：["ou_3ec3f6a28a0d08c45d895276e8e5e19b"]
         */
        private String[] contactIds;
        /**
         * 是否在禁用时发送通知给预定了该会议室的员工
         * <p> 示例值：true
         */
        private Boolean disableNotice;
        /**
         * 是否在恢复启用时发送通知给联系人
         * <p> 示例值：true
         */
        private Boolean resumeNotice;

        /**
         * 是否启用会议室
         * <p> 示例值：true
         *
         * @param status
         * @return
         */
        public Builder status(Boolean status) {
            this.status = status;
            return this;
        }


        /**
         * 会议室未来状态为启用或禁用
         * <p> 示例值：true
         *
         * @param scheduleStatus
         * @return
         */
        public Builder scheduleStatus(Boolean scheduleStatus) {
            this.scheduleStatus = scheduleStatus;
            return this;
        }


        /**
         * 禁用开始时间（unix时间，单位sec）
         * <p> 示例值：1652356050
         *
         * @param disableStartTime
         * @return
         */
        public Builder disableStartTime(String disableStartTime) {
            this.disableStartTime = disableStartTime;
            return this;
        }


        /**
         * 禁用结束时间（unix时间，单位sec，数值0表示永久禁用）
         * <p> 示例值：1652442450
         *
         * @param disableEndTime
         * @return
         */
        public Builder disableEndTime(String disableEndTime) {
            this.disableEndTime = disableEndTime;
            return this;
        }


        /**
         * 禁用原因
         * <p> 示例值：测试占用
         *
         * @param disableReason
         * @return
         */
        public Builder disableReason(String disableReason) {
            this.disableReason = disableReason;
            return this;
        }


        /**
         * 联系人列表，id类型由user_id_type参数决定
         * <p> 示例值：["ou_3ec3f6a28a0d08c45d895276e8e5e19b"]
         *
         * @param contactIds
         * @return
         */
        public Builder contactIds(String[] contactIds) {
            this.contactIds = contactIds;
            return this;
        }


        /**
         * 是否在禁用时发送通知给预定了该会议室的员工
         * <p> 示例值：true
         *
         * @param disableNotice
         * @return
         */
        public Builder disableNotice(Boolean disableNotice) {
            this.disableNotice = disableNotice;
            return this;
        }


        /**
         * 是否在恢复启用时发送通知给联系人
         * <p> 示例值：true
         *
         * @param resumeNotice
         * @return
         */
        public Builder resumeNotice(Boolean resumeNotice) {
            this.resumeNotice = resumeNotice;
            return this;
        }


        public RoomStatus build() {
            return new RoomStatus(this);
        }
    }
}
