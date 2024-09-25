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

package com.lark.oapi.service.hire.v1.model;

import com.google.gson.annotations.SerializedName;

public class InterviewExtendV2 {
    /**
     * 面试 ID
     * <p> 示例值：6949805467799537964
     */
    @SerializedName("id")
    private String id;
    /**
     * 面试开始时间（ms）
     * <p> 示例值：1618899376474
     */
    @SerializedName("begin_time")
    private String beginTime;
    /**
     * 面试结束时间（ms）
     * <p> 示例值：1618999376474
     */
    @SerializedName("end_time")
    private String endTime;
    /**
     * 面试轮次（从0开始计数）
     * <p> 示例值：0
     */
    @SerializedName("round")
    private Integer round;
    /**
     * 面试记录信息
     * <p> 示例值：
     */
    @SerializedName("interview_record_list")
    private InterviewRecordV2[] interviewRecordList;
    /**
     * 面试评价提交时间
     * <p> 示例值：1659318415000
     */
    @SerializedName("feedback_submit_time")
    private String feedbackSubmitTime;
    /**
     * 面试关联的投递阶段
     * <p> 示例值：634324253532232
     */
    @SerializedName("stage_id")
    private String stageId;
    /**
     * 投递 ID
     * <p> 示例值：634324253532232
     */
    @SerializedName("application_id")
    private String applicationId;
    /**
     * 阶段信息
     * <p> 示例值：
     */
    @SerializedName("stage")
    private IdNameObject stage;
    /**
     * 创建人
     * <p> 示例值：
     */
    @SerializedName("creator")
    private IdNameObject creator;
    /**
     * 创建时间戳（单位：毫秒）
     * <p> 示例值：1618999376474
     */
    @SerializedName("create_time")
    private String createTime;
    /**
     * 更新时间戳（单位：毫秒）
     * <p> 示例值：1618999376474
     */
    @SerializedName("update_time")
    private String updateTime;
    /**
     * 面试状态
     * <p> 示例值：2
     */
    @SerializedName("interview_round_summary")
    private Integer interviewRoundSummary;
    /**
     * 面试安排 ID
     * <p> 示例值：1111111
     */
    @SerializedName("interview_arrangement_id")
    private String interviewArrangementId;
    /**
     * 面试类型
     * <p> 示例值：1
     */
    @SerializedName("interview_type")
    private Integer interviewType;
    /**
     * 候选人时区
     * <p> 示例值：
     */
    @SerializedName("talent_time_zone")
    private CodeNameObject talentTimeZone;
    /**
     * 面试联系人
     * <p> 示例值：
     */
    @SerializedName("contact_user")
    private IdNameObject contactUser;
    /**
     * 面试联系人电话
     * <p> 示例值：13333333333
     */
    @SerializedName("contact_mobile")
    private String contactMobile;
    /**
     * 备注
     * <p> 示例值：test
     */
    @SerializedName("remark")
    private String remark;
    /**
     * 面试地点
     * <p> 示例值：
     */
    @SerializedName("address")
    private BaseAddressV2 address;
    /**
     * 视频面试工具
     * <p> 示例值：1
     */
    @SerializedName("video_type")
    private Integer videoType;
    /**
     * 当安排类型为集中面试时，此值表示集中面试的安排状态
     * <p> 示例值：1
     */
    @SerializedName("arrangement_status")
    private Integer arrangementStatus;
    /**
     * 安排类型
     * <p> 示例值：1
     */
    @SerializedName("arrangement_type")
    private Integer arrangementType;
    /**
     * 安排方式（是否使用自助约面）
     * <p> 示例值：1
     */
    @SerializedName("arrangement_appointment_kind")
    private Integer arrangementAppointmentKind;
    /**
     * 面试会议室
     * <p> 示例值：
     */
    @SerializedName("meeting_room_list")
    private InterviewMeetingRoom[] meetingRoomList;
    /**
     * 面试轮次类型
     * <p> 示例值：
     */
    @SerializedName("interview_round_type")
    private IdNameObject interviewRoundType;

    // builder 开始
    public InterviewExtendV2() {
    }

    public InterviewExtendV2(Builder builder) {
        /**
         * 面试 ID
         * <p> 示例值：6949805467799537964
         */
        this.id = builder.id;
        /**
         * 面试开始时间（ms）
         * <p> 示例值：1618899376474
         */
        this.beginTime = builder.beginTime;
        /**
         * 面试结束时间（ms）
         * <p> 示例值：1618999376474
         */
        this.endTime = builder.endTime;
        /**
         * 面试轮次（从0开始计数）
         * <p> 示例值：0
         */
        this.round = builder.round;
        /**
         * 面试记录信息
         * <p> 示例值：
         */
        this.interviewRecordList = builder.interviewRecordList;
        /**
         * 面试评价提交时间
         * <p> 示例值：1659318415000
         */
        this.feedbackSubmitTime = builder.feedbackSubmitTime;
        /**
         * 面试关联的投递阶段
         * <p> 示例值：634324253532232
         */
        this.stageId = builder.stageId;
        /**
         * 投递 ID
         * <p> 示例值：634324253532232
         */
        this.applicationId = builder.applicationId;
        /**
         * 阶段信息
         * <p> 示例值：
         */
        this.stage = builder.stage;
        /**
         * 创建人
         * <p> 示例值：
         */
        this.creator = builder.creator;
        /**
         * 创建时间戳（单位：毫秒）
         * <p> 示例值：1618999376474
         */
        this.createTime = builder.createTime;
        /**
         * 更新时间戳（单位：毫秒）
         * <p> 示例值：1618999376474
         */
        this.updateTime = builder.updateTime;
        /**
         * 面试状态
         * <p> 示例值：2
         */
        this.interviewRoundSummary = builder.interviewRoundSummary;
        /**
         * 面试安排 ID
         * <p> 示例值：1111111
         */
        this.interviewArrangementId = builder.interviewArrangementId;
        /**
         * 面试类型
         * <p> 示例值：1
         */
        this.interviewType = builder.interviewType;
        /**
         * 候选人时区
         * <p> 示例值：
         */
        this.talentTimeZone = builder.talentTimeZone;
        /**
         * 面试联系人
         * <p> 示例值：
         */
        this.contactUser = builder.contactUser;
        /**
         * 面试联系人电话
         * <p> 示例值：13333333333
         */
        this.contactMobile = builder.contactMobile;
        /**
         * 备注
         * <p> 示例值：test
         */
        this.remark = builder.remark;
        /**
         * 面试地点
         * <p> 示例值：
         */
        this.address = builder.address;
        /**
         * 视频面试工具
         * <p> 示例值：1
         */
        this.videoType = builder.videoType;
        /**
         * 当安排类型为集中面试时，此值表示集中面试的安排状态
         * <p> 示例值：1
         */
        this.arrangementStatus = builder.arrangementStatus;
        /**
         * 安排类型
         * <p> 示例值：1
         */
        this.arrangementType = builder.arrangementType;
        /**
         * 安排方式（是否使用自助约面）
         * <p> 示例值：1
         */
        this.arrangementAppointmentKind = builder.arrangementAppointmentKind;
        /**
         * 面试会议室
         * <p> 示例值：
         */
        this.meetingRoomList = builder.meetingRoomList;
        /**
         * 面试轮次类型
         * <p> 示例值：
         */
        this.interviewRoundType = builder.interviewRoundType;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBeginTime() {
        return this.beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getRound() {
        return this.round;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

    public InterviewRecordV2[] getInterviewRecordList() {
        return this.interviewRecordList;
    }

    public void setInterviewRecordList(InterviewRecordV2[] interviewRecordList) {
        this.interviewRecordList = interviewRecordList;
    }

    public String getFeedbackSubmitTime() {
        return this.feedbackSubmitTime;
    }

    public void setFeedbackSubmitTime(String feedbackSubmitTime) {
        this.feedbackSubmitTime = feedbackSubmitTime;
    }

    public String getStageId() {
        return this.stageId;
    }

    public void setStageId(String stageId) {
        this.stageId = stageId;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public IdNameObject getStage() {
        return this.stage;
    }

    public void setStage(IdNameObject stage) {
        this.stage = stage;
    }

    public IdNameObject getCreator() {
        return this.creator;
    }

    public void setCreator(IdNameObject creator) {
        this.creator = creator;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getInterviewRoundSummary() {
        return this.interviewRoundSummary;
    }

    public void setInterviewRoundSummary(Integer interviewRoundSummary) {
        this.interviewRoundSummary = interviewRoundSummary;
    }

    public String getInterviewArrangementId() {
        return this.interviewArrangementId;
    }

    public void setInterviewArrangementId(String interviewArrangementId) {
        this.interviewArrangementId = interviewArrangementId;
    }

    public Integer getInterviewType() {
        return this.interviewType;
    }

    public void setInterviewType(Integer interviewType) {
        this.interviewType = interviewType;
    }

    public CodeNameObject getTalentTimeZone() {
        return this.talentTimeZone;
    }

    public void setTalentTimeZone(CodeNameObject talentTimeZone) {
        this.talentTimeZone = talentTimeZone;
    }

    public IdNameObject getContactUser() {
        return this.contactUser;
    }

    public void setContactUser(IdNameObject contactUser) {
        this.contactUser = contactUser;
    }

    public String getContactMobile() {
        return this.contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BaseAddressV2 getAddress() {
        return this.address;
    }

    public void setAddress(BaseAddressV2 address) {
        this.address = address;
    }

    public Integer getVideoType() {
        return this.videoType;
    }

    public void setVideoType(Integer videoType) {
        this.videoType = videoType;
    }

    public Integer getArrangementStatus() {
        return this.arrangementStatus;
    }

    public void setArrangementStatus(Integer arrangementStatus) {
        this.arrangementStatus = arrangementStatus;
    }

    public Integer getArrangementType() {
        return this.arrangementType;
    }

    public void setArrangementType(Integer arrangementType) {
        this.arrangementType = arrangementType;
    }

    public Integer getArrangementAppointmentKind() {
        return this.arrangementAppointmentKind;
    }

    public void setArrangementAppointmentKind(Integer arrangementAppointmentKind) {
        this.arrangementAppointmentKind = arrangementAppointmentKind;
    }

    public InterviewMeetingRoom[] getMeetingRoomList() {
        return this.meetingRoomList;
    }

    public void setMeetingRoomList(InterviewMeetingRoom[] meetingRoomList) {
        this.meetingRoomList = meetingRoomList;
    }

    public IdNameObject getInterviewRoundType() {
        return this.interviewRoundType;
    }

    public void setInterviewRoundType(IdNameObject interviewRoundType) {
        this.interviewRoundType = interviewRoundType;
    }

    public static class Builder {
        /**
         * 面试 ID
         * <p> 示例值：6949805467799537964
         */
        private String id;
        /**
         * 面试开始时间（ms）
         * <p> 示例值：1618899376474
         */
        private String beginTime;
        /**
         * 面试结束时间（ms）
         * <p> 示例值：1618999376474
         */
        private String endTime;
        /**
         * 面试轮次（从0开始计数）
         * <p> 示例值：0
         */
        private Integer round;
        /**
         * 面试记录信息
         * <p> 示例值：
         */
        private InterviewRecordV2[] interviewRecordList;
        /**
         * 面试评价提交时间
         * <p> 示例值：1659318415000
         */
        private String feedbackSubmitTime;
        /**
         * 面试关联的投递阶段
         * <p> 示例值：634324253532232
         */
        private String stageId;
        /**
         * 投递 ID
         * <p> 示例值：634324253532232
         */
        private String applicationId;
        /**
         * 阶段信息
         * <p> 示例值：
         */
        private IdNameObject stage;
        /**
         * 创建人
         * <p> 示例值：
         */
        private IdNameObject creator;
        /**
         * 创建时间戳（单位：毫秒）
         * <p> 示例值：1618999376474
         */
        private String createTime;
        /**
         * 更新时间戳（单位：毫秒）
         * <p> 示例值：1618999376474
         */
        private String updateTime;
        /**
         * 面试状态
         * <p> 示例值：2
         */
        private Integer interviewRoundSummary;
        /**
         * 面试安排 ID
         * <p> 示例值：1111111
         */
        private String interviewArrangementId;
        /**
         * 面试类型
         * <p> 示例值：1
         */
        private Integer interviewType;
        /**
         * 候选人时区
         * <p> 示例值：
         */
        private CodeNameObject talentTimeZone;
        /**
         * 面试联系人
         * <p> 示例值：
         */
        private IdNameObject contactUser;
        /**
         * 面试联系人电话
         * <p> 示例值：13333333333
         */
        private String contactMobile;
        /**
         * 备注
         * <p> 示例值：test
         */
        private String remark;
        /**
         * 面试地点
         * <p> 示例值：
         */
        private BaseAddressV2 address;
        /**
         * 视频面试工具
         * <p> 示例值：1
         */
        private Integer videoType;
        /**
         * 当安排类型为集中面试时，此值表示集中面试的安排状态
         * <p> 示例值：1
         */
        private Integer arrangementStatus;
        /**
         * 安排类型
         * <p> 示例值：1
         */
        private Integer arrangementType;
        /**
         * 安排方式（是否使用自助约面）
         * <p> 示例值：1
         */
        private Integer arrangementAppointmentKind;
        /**
         * 面试会议室
         * <p> 示例值：
         */
        private InterviewMeetingRoom[] meetingRoomList;
        /**
         * 面试轮次类型
         * <p> 示例值：
         */
        private IdNameObject interviewRoundType;

        /**
         * 面试 ID
         * <p> 示例值：6949805467799537964
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 面试开始时间（ms）
         * <p> 示例值：1618899376474
         *
         * @param beginTime
         * @return
         */
        public Builder beginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }


        /**
         * 面试结束时间（ms）
         * <p> 示例值：1618999376474
         *
         * @param endTime
         * @return
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }


        /**
         * 面试轮次（从0开始计数）
         * <p> 示例值：0
         *
         * @param round
         * @return
         */
        public Builder round(Integer round) {
            this.round = round;
            return this;
        }


        /**
         * 面试记录信息
         * <p> 示例值：
         *
         * @param interviewRecordList
         * @return
         */
        public Builder interviewRecordList(InterviewRecordV2[] interviewRecordList) {
            this.interviewRecordList = interviewRecordList;
            return this;
        }


        /**
         * 面试评价提交时间
         * <p> 示例值：1659318415000
         *
         * @param feedbackSubmitTime
         * @return
         */
        public Builder feedbackSubmitTime(String feedbackSubmitTime) {
            this.feedbackSubmitTime = feedbackSubmitTime;
            return this;
        }


        /**
         * 面试关联的投递阶段
         * <p> 示例值：634324253532232
         *
         * @param stageId
         * @return
         */
        public Builder stageId(String stageId) {
            this.stageId = stageId;
            return this;
        }


        /**
         * 投递 ID
         * <p> 示例值：634324253532232
         *
         * @param applicationId
         * @return
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }


        /**
         * 阶段信息
         * <p> 示例值：
         *
         * @param stage
         * @return
         */
        public Builder stage(IdNameObject stage) {
            this.stage = stage;
            return this;
        }


        /**
         * 创建人
         * <p> 示例值：
         *
         * @param creator
         * @return
         */
        public Builder creator(IdNameObject creator) {
            this.creator = creator;
            return this;
        }


        /**
         * 创建时间戳（单位：毫秒）
         * <p> 示例值：1618999376474
         *
         * @param createTime
         * @return
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }


        /**
         * 更新时间戳（单位：毫秒）
         * <p> 示例值：1618999376474
         *
         * @param updateTime
         * @return
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }


        /**
         * 面试状态
         * <p> 示例值：2
         *
         * @param interviewRoundSummary
         * @return
         */
        public Builder interviewRoundSummary(Integer interviewRoundSummary) {
            this.interviewRoundSummary = interviewRoundSummary;
            return this;
        }


        /**
         * 面试安排 ID
         * <p> 示例值：1111111
         *
         * @param interviewArrangementId
         * @return
         */
        public Builder interviewArrangementId(String interviewArrangementId) {
            this.interviewArrangementId = interviewArrangementId;
            return this;
        }


        /**
         * 面试类型
         * <p> 示例值：1
         *
         * @param interviewType
         * @return
         */
        public Builder interviewType(Integer interviewType) {
            this.interviewType = interviewType;
            return this;
        }


        /**
         * 候选人时区
         * <p> 示例值：
         *
         * @param talentTimeZone
         * @return
         */
        public Builder talentTimeZone(CodeNameObject talentTimeZone) {
            this.talentTimeZone = talentTimeZone;
            return this;
        }


        /**
         * 面试联系人
         * <p> 示例值：
         *
         * @param contactUser
         * @return
         */
        public Builder contactUser(IdNameObject contactUser) {
            this.contactUser = contactUser;
            return this;
        }


        /**
         * 面试联系人电话
         * <p> 示例值：13333333333
         *
         * @param contactMobile
         * @return
         */
        public Builder contactMobile(String contactMobile) {
            this.contactMobile = contactMobile;
            return this;
        }


        /**
         * 备注
         * <p> 示例值：test
         *
         * @param remark
         * @return
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }


        /**
         * 面试地点
         * <p> 示例值：
         *
         * @param address
         * @return
         */
        public Builder address(BaseAddressV2 address) {
            this.address = address;
            return this;
        }


        /**
         * 视频面试工具
         * <p> 示例值：1
         *
         * @param videoType
         * @return
         */
        public Builder videoType(Integer videoType) {
            this.videoType = videoType;
            return this;
        }


        /**
         * 当安排类型为集中面试时，此值表示集中面试的安排状态
         * <p> 示例值：1
         *
         * @param arrangementStatus
         * @return
         */
        public Builder arrangementStatus(Integer arrangementStatus) {
            this.arrangementStatus = arrangementStatus;
            return this;
        }


        /**
         * 安排类型
         * <p> 示例值：1
         *
         * @param arrangementType
         * @return
         */
        public Builder arrangementType(Integer arrangementType) {
            this.arrangementType = arrangementType;
            return this;
        }


        /**
         * 安排方式（是否使用自助约面）
         * <p> 示例值：1
         *
         * @param arrangementAppointmentKind
         * @return
         */
        public Builder arrangementAppointmentKind(Integer arrangementAppointmentKind) {
            this.arrangementAppointmentKind = arrangementAppointmentKind;
            return this;
        }


        /**
         * 面试会议室
         * <p> 示例值：
         *
         * @param meetingRoomList
         * @return
         */
        public Builder meetingRoomList(InterviewMeetingRoom[] meetingRoomList) {
            this.meetingRoomList = meetingRoomList;
            return this;
        }


        /**
         * 面试轮次类型
         * <p> 示例值：
         *
         * @param interviewRoundType
         * @return
         */
        public Builder interviewRoundType(IdNameObject interviewRoundType) {
            this.interviewRoundType = interviewRoundType;
            return this;
        }


        public InterviewExtendV2 build() {
            return new InterviewExtendV2(this);
        }
    }
}
