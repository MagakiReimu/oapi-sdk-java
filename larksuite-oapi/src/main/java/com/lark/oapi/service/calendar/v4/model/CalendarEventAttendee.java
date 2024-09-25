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

package com.lark.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;

public class CalendarEventAttendee {
    /**
     * 参与人类型
     * <p> 示例值：user
     */
    @SerializedName("type")
    private String type;
    /**
     * 参与人ID。参见[参与人ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/calendar-v4/calendar-event-attendee/introduction#4998889c)
     * <p> 示例值：user_xxxxxx
     */
    @SerializedName("attendee_id")
    private String attendeeId;
    /**
     * 参与人RSVP状态
     * <p> 示例值：needs_action
     */
    @SerializedName("rsvp_status")
    private String rsvpStatus;
    /**
     * 参与人是否为「可选参加」，无法编辑群参与人的此字段
     * <p> 示例值：true
     */
    @SerializedName("is_optional")
    private Boolean isOptional;
    /**
     * 参与人是否为日程组织者
     * <p> 示例值：true
     */
    @SerializedName("is_organizer")
    private Boolean isOrganizer;
    /**
     * 参与人是否为外部参与人；外部参与人不支持编辑
     * <p> 示例值：false
     */
    @SerializedName("is_external")
    private Boolean isExternal;
    /**
     * 参与人名称
     * <p> 示例值：Zhang San
     */
    @SerializedName("display_name")
    private String displayName;
    /**
     * 群中的群成员，当type为Chat时有效；群成员不支持编辑
     * <p> 示例值：
     */
    @SerializedName("chat_members")
    private AttendeeChatMember[] chatMembers;
    /**
     * 参与人的用户id，依赖于user_id_type返回对应的取值，当is_external为true时，此字段只会返回open_id或者union_id，参见[用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
     * <p> 示例值：ou_xxxxxxxx
     */
    @SerializedName("user_id")
    private String userId;
    /**
     * chat类型参与人的群组chat_id，参见[群ID 说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-id-description)
     * <p> 示例值：oc_xxxxxxxxx
     */
    @SerializedName("chat_id")
    private String chatId;
    /**
     * resource类型参与人的会议室room_id
     * <p> 示例值：omm_xxxxxxxx
     */
    @SerializedName("room_id")
    private String roomId;
    /**
     * third_party类型参与人的邮箱
     * <p> 示例值：wangwu@email.com
     */
    @SerializedName("third_party_email")
    private String thirdPartyEmail;
    /**
     * 如果日程是使用应用身份创建的，在添加会议室的时候，用来指定会议室的联系人，在会议室视图展示。参见[用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
     * <p> 示例值：ou_xxxxxxxx
     */
    @SerializedName("operate_id")
    private String operateId;
    /**
     * 会议室的个性化配置
     * <p> 示例值：
     */
    @SerializedName("resource_customization")
    private CalendarAttendeeResourceCustomization[] resourceCustomization;
    /**
     * 会议室审批原因
     * <p> 示例值：申请审批原因
     */
    @SerializedName("approval_reason")
    private String approvalReason;

    // builder 开始
    public CalendarEventAttendee() {
    }

    public CalendarEventAttendee(Builder builder) {
        /**
         * 参与人类型
         * <p> 示例值：user
         */
        this.type = builder.type;
        /**
         * 参与人ID。参见[参与人ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/calendar-v4/calendar-event-attendee/introduction#4998889c)
         * <p> 示例值：user_xxxxxx
         */
        this.attendeeId = builder.attendeeId;
        /**
         * 参与人RSVP状态
         * <p> 示例值：needs_action
         */
        this.rsvpStatus = builder.rsvpStatus;
        /**
         * 参与人是否为「可选参加」，无法编辑群参与人的此字段
         * <p> 示例值：true
         */
        this.isOptional = builder.isOptional;
        /**
         * 参与人是否为日程组织者
         * <p> 示例值：true
         */
        this.isOrganizer = builder.isOrganizer;
        /**
         * 参与人是否为外部参与人；外部参与人不支持编辑
         * <p> 示例值：false
         */
        this.isExternal = builder.isExternal;
        /**
         * 参与人名称
         * <p> 示例值：Zhang San
         */
        this.displayName = builder.displayName;
        /**
         * 群中的群成员，当type为Chat时有效；群成员不支持编辑
         * <p> 示例值：
         */
        this.chatMembers = builder.chatMembers;
        /**
         * 参与人的用户id，依赖于user_id_type返回对应的取值，当is_external为true时，此字段只会返回open_id或者union_id，参见[用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
         * <p> 示例值：ou_xxxxxxxx
         */
        this.userId = builder.userId;
        /**
         * chat类型参与人的群组chat_id，参见[群ID 说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-id-description)
         * <p> 示例值：oc_xxxxxxxxx
         */
        this.chatId = builder.chatId;
        /**
         * resource类型参与人的会议室room_id
         * <p> 示例值：omm_xxxxxxxx
         */
        this.roomId = builder.roomId;
        /**
         * third_party类型参与人的邮箱
         * <p> 示例值：wangwu@email.com
         */
        this.thirdPartyEmail = builder.thirdPartyEmail;
        /**
         * 如果日程是使用应用身份创建的，在添加会议室的时候，用来指定会议室的联系人，在会议室视图展示。参见[用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
         * <p> 示例值：ou_xxxxxxxx
         */
        this.operateId = builder.operateId;
        /**
         * 会议室的个性化配置
         * <p> 示例值：
         */
        this.resourceCustomization = builder.resourceCustomization;
        /**
         * 会议室审批原因
         * <p> 示例值：申请审批原因
         */
        this.approvalReason = builder.approvalReason;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAttendeeId() {
        return this.attendeeId;
    }

    public void setAttendeeId(String attendeeId) {
        this.attendeeId = attendeeId;
    }

    public String getRsvpStatus() {
        return this.rsvpStatus;
    }

    public void setRsvpStatus(String rsvpStatus) {
        this.rsvpStatus = rsvpStatus;
    }

    public Boolean getIsOptional() {
        return this.isOptional;
    }

    public void setIsOptional(Boolean isOptional) {
        this.isOptional = isOptional;
    }

    public Boolean getIsOrganizer() {
        return this.isOrganizer;
    }

    public void setIsOrganizer(Boolean isOrganizer) {
        this.isOrganizer = isOrganizer;
    }

    public Boolean getIsExternal() {
        return this.isExternal;
    }

    public void setIsExternal(Boolean isExternal) {
        this.isExternal = isExternal;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public AttendeeChatMember[] getChatMembers() {
        return this.chatMembers;
    }

    public void setChatMembers(AttendeeChatMember[] chatMembers) {
        this.chatMembers = chatMembers;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getChatId() {
        return this.chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getThirdPartyEmail() {
        return this.thirdPartyEmail;
    }

    public void setThirdPartyEmail(String thirdPartyEmail) {
        this.thirdPartyEmail = thirdPartyEmail;
    }

    public String getOperateId() {
        return this.operateId;
    }

    public void setOperateId(String operateId) {
        this.operateId = operateId;
    }

    public CalendarAttendeeResourceCustomization[] getResourceCustomization() {
        return this.resourceCustomization;
    }

    public void setResourceCustomization(CalendarAttendeeResourceCustomization[] resourceCustomization) {
        this.resourceCustomization = resourceCustomization;
    }

    public String getApprovalReason() {
        return this.approvalReason;
    }

    public void setApprovalReason(String approvalReason) {
        this.approvalReason = approvalReason;
    }

    public static class Builder {
        /**
         * 参与人类型
         * <p> 示例值：user
         */
        private String type;
        /**
         * 参与人ID。参见[参与人ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/calendar-v4/calendar-event-attendee/introduction#4998889c)
         * <p> 示例值：user_xxxxxx
         */
        private String attendeeId;
        /**
         * 参与人RSVP状态
         * <p> 示例值：needs_action
         */
        private String rsvpStatus;
        /**
         * 参与人是否为「可选参加」，无法编辑群参与人的此字段
         * <p> 示例值：true
         */
        private Boolean isOptional;
        /**
         * 参与人是否为日程组织者
         * <p> 示例值：true
         */
        private Boolean isOrganizer;
        /**
         * 参与人是否为外部参与人；外部参与人不支持编辑
         * <p> 示例值：false
         */
        private Boolean isExternal;
        /**
         * 参与人名称
         * <p> 示例值：Zhang San
         */
        private String displayName;
        /**
         * 群中的群成员，当type为Chat时有效；群成员不支持编辑
         * <p> 示例值：
         */
        private AttendeeChatMember[] chatMembers;
        /**
         * 参与人的用户id，依赖于user_id_type返回对应的取值，当is_external为true时，此字段只会返回open_id或者union_id，参见[用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
         * <p> 示例值：ou_xxxxxxxx
         */
        private String userId;
        /**
         * chat类型参与人的群组chat_id，参见[群ID 说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-id-description)
         * <p> 示例值：oc_xxxxxxxxx
         */
        private String chatId;
        /**
         * resource类型参与人的会议室room_id
         * <p> 示例值：omm_xxxxxxxx
         */
        private String roomId;
        /**
         * third_party类型参与人的邮箱
         * <p> 示例值：wangwu@email.com
         */
        private String thirdPartyEmail;
        /**
         * 如果日程是使用应用身份创建的，在添加会议室的时候，用来指定会议室的联系人，在会议室视图展示。参见[用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
         * <p> 示例值：ou_xxxxxxxx
         */
        private String operateId;
        /**
         * 会议室的个性化配置
         * <p> 示例值：
         */
        private CalendarAttendeeResourceCustomization[] resourceCustomization;
        /**
         * 会议室审批原因
         * <p> 示例值：申请审批原因
         */
        private String approvalReason;

        /**
         * 参与人类型
         * <p> 示例值：user
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * 参与人类型
         * <p> 示例值：user
         *
         * @param type {@link com.lark.oapi.service.calendar.v4.enums.CalendarEventAttendeeEventAttendeeTypeEnum}
         * @return
         */
        public Builder type(com.lark.oapi.service.calendar.v4.enums.CalendarEventAttendeeEventAttendeeTypeEnum type) {
            this.type = type.getValue();
            return this;
        }


        /**
         * 参与人ID。参见[参与人ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/calendar-v4/calendar-event-attendee/introduction#4998889c)
         * <p> 示例值：user_xxxxxx
         *
         * @param attendeeId
         * @return
         */
        public Builder attendeeId(String attendeeId) {
            this.attendeeId = attendeeId;
            return this;
        }


        /**
         * 参与人RSVP状态
         * <p> 示例值：needs_action
         *
         * @param rsvpStatus
         * @return
         */
        public Builder rsvpStatus(String rsvpStatus) {
            this.rsvpStatus = rsvpStatus;
            return this;
        }

        /**
         * 参与人RSVP状态
         * <p> 示例值：needs_action
         *
         * @param rsvpStatus {@link com.lark.oapi.service.calendar.v4.enums.CalendarEventAttendeeRsvpStatusEnum}
         * @return
         */
        public Builder rsvpStatus(com.lark.oapi.service.calendar.v4.enums.CalendarEventAttendeeRsvpStatusEnum rsvpStatus) {
            this.rsvpStatus = rsvpStatus.getValue();
            return this;
        }


        /**
         * 参与人是否为「可选参加」，无法编辑群参与人的此字段
         * <p> 示例值：true
         *
         * @param isOptional
         * @return
         */
        public Builder isOptional(Boolean isOptional) {
            this.isOptional = isOptional;
            return this;
        }


        /**
         * 参与人是否为日程组织者
         * <p> 示例值：true
         *
         * @param isOrganizer
         * @return
         */
        public Builder isOrganizer(Boolean isOrganizer) {
            this.isOrganizer = isOrganizer;
            return this;
        }


        /**
         * 参与人是否为外部参与人；外部参与人不支持编辑
         * <p> 示例值：false
         *
         * @param isExternal
         * @return
         */
        public Builder isExternal(Boolean isExternal) {
            this.isExternal = isExternal;
            return this;
        }


        /**
         * 参与人名称
         * <p> 示例值：Zhang San
         *
         * @param displayName
         * @return
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }


        /**
         * 群中的群成员，当type为Chat时有效；群成员不支持编辑
         * <p> 示例值：
         *
         * @param chatMembers
         * @return
         */
        public Builder chatMembers(AttendeeChatMember[] chatMembers) {
            this.chatMembers = chatMembers;
            return this;
        }


        /**
         * 参与人的用户id，依赖于user_id_type返回对应的取值，当is_external为true时，此字段只会返回open_id或者union_id，参见[用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
         * <p> 示例值：ou_xxxxxxxx
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        /**
         * chat类型参与人的群组chat_id，参见[群ID 说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-id-description)
         * <p> 示例值：oc_xxxxxxxxx
         *
         * @param chatId
         * @return
         */
        public Builder chatId(String chatId) {
            this.chatId = chatId;
            return this;
        }


        /**
         * resource类型参与人的会议室room_id
         * <p> 示例值：omm_xxxxxxxx
         *
         * @param roomId
         * @return
         */
        public Builder roomId(String roomId) {
            this.roomId = roomId;
            return this;
        }


        /**
         * third_party类型参与人的邮箱
         * <p> 示例值：wangwu@email.com
         *
         * @param thirdPartyEmail
         * @return
         */
        public Builder thirdPartyEmail(String thirdPartyEmail) {
            this.thirdPartyEmail = thirdPartyEmail;
            return this;
        }


        /**
         * 如果日程是使用应用身份创建的，在添加会议室的时候，用来指定会议室的联系人，在会议室视图展示。参见[用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
         * <p> 示例值：ou_xxxxxxxx
         *
         * @param operateId
         * @return
         */
        public Builder operateId(String operateId) {
            this.operateId = operateId;
            return this;
        }


        /**
         * 会议室的个性化配置
         * <p> 示例值：
         *
         * @param resourceCustomization
         * @return
         */
        public Builder resourceCustomization(CalendarAttendeeResourceCustomization[] resourceCustomization) {
            this.resourceCustomization = resourceCustomization;
            return this;
        }


        /**
         * 会议室审批原因
         * <p> 示例值：申请审批原因
         *
         * @param approvalReason
         * @return
         */
        public Builder approvalReason(String approvalReason) {
            this.approvalReason = approvalReason;
            return this;
        }


        public CalendarEventAttendee build() {
            return new CalendarEventAttendee(this);
        }
    }
}
