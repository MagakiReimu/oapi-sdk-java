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

public class MeetingSecuritySetting {
    /**
     * 安全级别
     * <p> 示例值：1
     */
    @SerializedName("security_level")
    private Integer securityLevel;
    /**
     * 允许入会的群组ID列表
     * <p> 示例值：
     */
    @SerializedName("group_ids")
    private String[] groupIds;
    /**
     * 允许入会的用户ID列表
     * <p> 示例值：
     */
    @SerializedName("user_ids")
    private UserId[] userIds;
    /**
     * 允许入会的会议室ID列表
     * <p> 示例值：
     */
    @SerializedName("room_ids")
    private String[] roomIds;
    /**
     * 是否设置了仅指定联系人和群组可参会
     * <p> 示例值：true
     */
    @SerializedName("has_set_security_contacts_and_group")
    private Boolean hasSetSecurityContactsAndGroup;

    // builder 开始
    public MeetingSecuritySetting() {
    }

    public MeetingSecuritySetting(Builder builder) {
        /**
         * 安全级别
         * <p> 示例值：1
         */
        this.securityLevel = builder.securityLevel;
        /**
         * 允许入会的群组ID列表
         * <p> 示例值：
         */
        this.groupIds = builder.groupIds;
        /**
         * 允许入会的用户ID列表
         * <p> 示例值：
         */
        this.userIds = builder.userIds;
        /**
         * 允许入会的会议室ID列表
         * <p> 示例值：
         */
        this.roomIds = builder.roomIds;
        /**
         * 是否设置了仅指定联系人和群组可参会
         * <p> 示例值：true
         */
        this.hasSetSecurityContactsAndGroup = builder.hasSetSecurityContactsAndGroup;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getSecurityLevel() {
        return this.securityLevel;
    }

    public void setSecurityLevel(Integer securityLevel) {
        this.securityLevel = securityLevel;
    }

    public String[] getGroupIds() {
        return this.groupIds;
    }

    public void setGroupIds(String[] groupIds) {
        this.groupIds = groupIds;
    }

    public UserId[] getUserIds() {
        return this.userIds;
    }

    public void setUserIds(UserId[] userIds) {
        this.userIds = userIds;
    }

    public String[] getRoomIds() {
        return this.roomIds;
    }

    public void setRoomIds(String[] roomIds) {
        this.roomIds = roomIds;
    }

    public Boolean getHasSetSecurityContactsAndGroup() {
        return this.hasSetSecurityContactsAndGroup;
    }

    public void setHasSetSecurityContactsAndGroup(Boolean hasSetSecurityContactsAndGroup) {
        this.hasSetSecurityContactsAndGroup = hasSetSecurityContactsAndGroup;
    }

    public static class Builder {
        /**
         * 安全级别
         * <p> 示例值：1
         */
        private Integer securityLevel;
        /**
         * 允许入会的群组ID列表
         * <p> 示例值：
         */
        private String[] groupIds;
        /**
         * 允许入会的用户ID列表
         * <p> 示例值：
         */
        private UserId[] userIds;
        /**
         * 允许入会的会议室ID列表
         * <p> 示例值：
         */
        private String[] roomIds;
        /**
         * 是否设置了仅指定联系人和群组可参会
         * <p> 示例值：true
         */
        private Boolean hasSetSecurityContactsAndGroup;

        /**
         * 安全级别
         * <p> 示例值：1
         *
         * @param securityLevel
         * @return
         */
        public Builder securityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }

        /**
         * 安全级别
         * <p> 示例值：1
         *
         * @param securityLevel {@link com.lark.oapi.service.vc.v1.enums.MeetingSecuritySettingSecurityLevelEnum}
         * @return
         */
        public Builder securityLevel(com.lark.oapi.service.vc.v1.enums.MeetingSecuritySettingSecurityLevelEnum securityLevel) {
            this.securityLevel = securityLevel.getValue();
            return this;
        }


        /**
         * 允许入会的群组ID列表
         * <p> 示例值：
         *
         * @param groupIds
         * @return
         */
        public Builder groupIds(String[] groupIds) {
            this.groupIds = groupIds;
            return this;
        }


        /**
         * 允许入会的用户ID列表
         * <p> 示例值：
         *
         * @param userIds
         * @return
         */
        public Builder userIds(UserId[] userIds) {
            this.userIds = userIds;
            return this;
        }


        /**
         * 允许入会的会议室ID列表
         * <p> 示例值：
         *
         * @param roomIds
         * @return
         */
        public Builder roomIds(String[] roomIds) {
            this.roomIds = roomIds;
            return this;
        }


        /**
         * 是否设置了仅指定联系人和群组可参会
         * <p> 示例值：true
         *
         * @param hasSetSecurityContactsAndGroup
         * @return
         */
        public Builder hasSetSecurityContactsAndGroup(Boolean hasSetSecurityContactsAndGroup) {
            this.hasSetSecurityContactsAndGroup = hasSetSecurityContactsAndGroup;
            return this;
        }


        public MeetingSecuritySetting build() {
            return new MeetingSecuritySetting(this);
        }
    }
}
