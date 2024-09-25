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

import com.google.gson.annotations.SerializedName;

public class MeetingEventMeeting {
    /**
     * 会议ID（视频会议的唯一标识，视频会议开始后才会产生）
     * <p> 示例值：6911188411934433028
     */
    @SerializedName("id")
    private String id;
    /**
     * 会议主题
     * <p> 示例值：my meeting
     */
    @SerializedName("topic")
    private String topic;
    /**
     * 9位会议号（飞书用户可通过输入9位会议号快捷入会）
     * <p> 示例值：235812466
     */
    @SerializedName("meeting_no")
    private String meetingNo;
    /**
     * 会议创建源
     * <p> 示例值：1
     */
    @SerializedName("meeting_source")
    private Integer meetingSource;
    /**
     * 会议开始时间（unix时间，单位sec）
     * <p> 示例值：1608883322
     */
    @SerializedName("start_time")
    private String startTime;
    /**
     * 会议结束时间（unix时间，单位sec）
     * <p> 示例值：1608883899
     */
    @SerializedName("end_time")
    private String endTime;
    /**
     * 会议主持人
     * <p> 示例值：
     */
    @SerializedName("host_user")
    private MeetingEventUser hostUser;
    /**
     * 会议拥有者
     * <p> 示例值：
     */
    @SerializedName("owner")
    private MeetingEventUser owner;
    /**
     * 日程实体的唯一标志
     * <p> 示例值：efa67a98-06a8-4df5-8559-746c8f4477ef_0
     */
    @SerializedName("calendar_event_id")
    private String calendarEventId;
    /**
     * 会议子类型
     * <p> 示例值：1
     */
    @SerializedName("meeting_sub_type")
    private Integer meetingSubType;
    /**
     * 会议安全设置
     * <p> 示例值：
     */
    @SerializedName("security_setting")
    private MeetingSecuritySetting securitySetting;
    /**
     * 研讨会相关设置
     * <p> 示例值：
     */
    @SerializedName("webinar_setting")
    private MeetingWebinarSetting webinarSetting;

    // builder 开始
    public MeetingEventMeeting() {
    }

    public MeetingEventMeeting(Builder builder) {
        /**
         * 会议ID（视频会议的唯一标识，视频会议开始后才会产生）
         * <p> 示例值：6911188411934433028
         */
        this.id = builder.id;
        /**
         * 会议主题
         * <p> 示例值：my meeting
         */
        this.topic = builder.topic;
        /**
         * 9位会议号（飞书用户可通过输入9位会议号快捷入会）
         * <p> 示例值：235812466
         */
        this.meetingNo = builder.meetingNo;
        /**
         * 会议创建源
         * <p> 示例值：1
         */
        this.meetingSource = builder.meetingSource;
        /**
         * 会议开始时间（unix时间，单位sec）
         * <p> 示例值：1608883322
         */
        this.startTime = builder.startTime;
        /**
         * 会议结束时间（unix时间，单位sec）
         * <p> 示例值：1608883899
         */
        this.endTime = builder.endTime;
        /**
         * 会议主持人
         * <p> 示例值：
         */
        this.hostUser = builder.hostUser;
        /**
         * 会议拥有者
         * <p> 示例值：
         */
        this.owner = builder.owner;
        /**
         * 日程实体的唯一标志
         * <p> 示例值：efa67a98-06a8-4df5-8559-746c8f4477ef_0
         */
        this.calendarEventId = builder.calendarEventId;
        /**
         * 会议子类型
         * <p> 示例值：1
         */
        this.meetingSubType = builder.meetingSubType;
        /**
         * 会议安全设置
         * <p> 示例值：
         */
        this.securitySetting = builder.securitySetting;
        /**
         * 研讨会相关设置
         * <p> 示例值：
         */
        this.webinarSetting = builder.webinarSetting;
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

    public String getTopic() {
        return this.topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getMeetingNo() {
        return this.meetingNo;
    }

    public void setMeetingNo(String meetingNo) {
        this.meetingNo = meetingNo;
    }

    public Integer getMeetingSource() {
        return this.meetingSource;
    }

    public void setMeetingSource(Integer meetingSource) {
        this.meetingSource = meetingSource;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public MeetingEventUser getHostUser() {
        return this.hostUser;
    }

    public void setHostUser(MeetingEventUser hostUser) {
        this.hostUser = hostUser;
    }

    public MeetingEventUser getOwner() {
        return this.owner;
    }

    public void setOwner(MeetingEventUser owner) {
        this.owner = owner;
    }

    public String getCalendarEventId() {
        return this.calendarEventId;
    }

    public void setCalendarEventId(String calendarEventId) {
        this.calendarEventId = calendarEventId;
    }

    public Integer getMeetingSubType() {
        return this.meetingSubType;
    }

    public void setMeetingSubType(Integer meetingSubType) {
        this.meetingSubType = meetingSubType;
    }

    public MeetingSecuritySetting getSecuritySetting() {
        return this.securitySetting;
    }

    public void setSecuritySetting(MeetingSecuritySetting securitySetting) {
        this.securitySetting = securitySetting;
    }

    public MeetingWebinarSetting getWebinarSetting() {
        return this.webinarSetting;
    }

    public void setWebinarSetting(MeetingWebinarSetting webinarSetting) {
        this.webinarSetting = webinarSetting;
    }

    public static class Builder {
        /**
         * 会议ID（视频会议的唯一标识，视频会议开始后才会产生）
         * <p> 示例值：6911188411934433028
         */
        private String id;
        /**
         * 会议主题
         * <p> 示例值：my meeting
         */
        private String topic;
        /**
         * 9位会议号（飞书用户可通过输入9位会议号快捷入会）
         * <p> 示例值：235812466
         */
        private String meetingNo;
        /**
         * 会议创建源
         * <p> 示例值：1
         */
        private Integer meetingSource;
        /**
         * 会议开始时间（unix时间，单位sec）
         * <p> 示例值：1608883322
         */
        private String startTime;
        /**
         * 会议结束时间（unix时间，单位sec）
         * <p> 示例值：1608883899
         */
        private String endTime;
        /**
         * 会议主持人
         * <p> 示例值：
         */
        private MeetingEventUser hostUser;
        /**
         * 会议拥有者
         * <p> 示例值：
         */
        private MeetingEventUser owner;
        /**
         * 日程实体的唯一标志
         * <p> 示例值：efa67a98-06a8-4df5-8559-746c8f4477ef_0
         */
        private String calendarEventId;
        /**
         * 会议子类型
         * <p> 示例值：1
         */
        private Integer meetingSubType;
        /**
         * 会议安全设置
         * <p> 示例值：
         */
        private MeetingSecuritySetting securitySetting;
        /**
         * 研讨会相关设置
         * <p> 示例值：
         */
        private MeetingWebinarSetting webinarSetting;

        /**
         * 会议ID（视频会议的唯一标识，视频会议开始后才会产生）
         * <p> 示例值：6911188411934433028
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 会议主题
         * <p> 示例值：my meeting
         *
         * @param topic
         * @return
         */
        public Builder topic(String topic) {
            this.topic = topic;
            return this;
        }


        /**
         * 9位会议号（飞书用户可通过输入9位会议号快捷入会）
         * <p> 示例值：235812466
         *
         * @param meetingNo
         * @return
         */
        public Builder meetingNo(String meetingNo) {
            this.meetingNo = meetingNo;
            return this;
        }


        /**
         * 会议创建源
         * <p> 示例值：1
         *
         * @param meetingSource
         * @return
         */
        public Builder meetingSource(Integer meetingSource) {
            this.meetingSource = meetingSource;
            return this;
        }

        /**
         * 会议创建源
         * <p> 示例值：1
         *
         * @param meetingSource {@link com.lark.oapi.service.vc.v1.enums.MeetingEventMeetingMeetingSourceEnum}
         * @return
         */
        public Builder meetingSource(com.lark.oapi.service.vc.v1.enums.MeetingEventMeetingMeetingSourceEnum meetingSource) {
            this.meetingSource = meetingSource.getValue();
            return this;
        }


        /**
         * 会议开始时间（unix时间，单位sec）
         * <p> 示例值：1608883322
         *
         * @param startTime
         * @return
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }


        /**
         * 会议结束时间（unix时间，单位sec）
         * <p> 示例值：1608883899
         *
         * @param endTime
         * @return
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }


        /**
         * 会议主持人
         * <p> 示例值：
         *
         * @param hostUser
         * @return
         */
        public Builder hostUser(MeetingEventUser hostUser) {
            this.hostUser = hostUser;
            return this;
        }


        /**
         * 会议拥有者
         * <p> 示例值：
         *
         * @param owner
         * @return
         */
        public Builder owner(MeetingEventUser owner) {
            this.owner = owner;
            return this;
        }


        /**
         * 日程实体的唯一标志
         * <p> 示例值：efa67a98-06a8-4df5-8559-746c8f4477ef_0
         *
         * @param calendarEventId
         * @return
         */
        public Builder calendarEventId(String calendarEventId) {
            this.calendarEventId = calendarEventId;
            return this;
        }


        /**
         * 会议子类型
         * <p> 示例值：1
         *
         * @param meetingSubType
         * @return
         */
        public Builder meetingSubType(Integer meetingSubType) {
            this.meetingSubType = meetingSubType;
            return this;
        }

        /**
         * 会议子类型
         * <p> 示例值：1
         *
         * @param meetingSubType {@link com.lark.oapi.service.vc.v1.enums.MeetingEventMeetingMeetingSubTypeEnum}
         * @return
         */
        public Builder meetingSubType(com.lark.oapi.service.vc.v1.enums.MeetingEventMeetingMeetingSubTypeEnum meetingSubType) {
            this.meetingSubType = meetingSubType.getValue();
            return this;
        }


        /**
         * 会议安全设置
         * <p> 示例值：
         *
         * @param securitySetting
         * @return
         */
        public Builder securitySetting(MeetingSecuritySetting securitySetting) {
            this.securitySetting = securitySetting;
            return this;
        }


        /**
         * 研讨会相关设置
         * <p> 示例值：
         *
         * @param webinarSetting
         * @return
         */
        public Builder webinarSetting(MeetingWebinarSetting webinarSetting) {
            this.webinarSetting = webinarSetting;
            return this;
        }


        public MeetingEventMeeting build() {
            return new MeetingEventMeeting(this);
        }
    }
}
