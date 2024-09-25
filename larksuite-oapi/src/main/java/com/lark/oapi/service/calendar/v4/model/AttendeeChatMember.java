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

public class AttendeeChatMember {
    /**
     * 参与人RSVP状态
     * <p> 示例值：needs_action
     */
    @SerializedName("rsvp_status")
    private String rsvpStatus;
    /**
     * 参与人是否为「可选参加」
     * <p> 示例值：true
     */
    @SerializedName("is_optional")
    private Boolean isOptional;
    /**
     * 参与人名称
     * <p> 示例值：Group
     */
    @SerializedName("display_name")
    private String displayName;
    /**
     * 参与人是否为日程组织者
     * <p> 示例值：false
     */
    @SerializedName("is_organizer")
    private Boolean isOrganizer;
    /**
     * 参与人是否为外部参与人
     * <p> 示例值：false
     */
    @SerializedName("is_external")
    private Boolean isExternal;

    // builder 开始
    public AttendeeChatMember() {
    }

    public AttendeeChatMember(Builder builder) {
        /**
         * 参与人RSVP状态
         * <p> 示例值：needs_action
         */
        this.rsvpStatus = builder.rsvpStatus;
        /**
         * 参与人是否为「可选参加」
         * <p> 示例值：true
         */
        this.isOptional = builder.isOptional;
        /**
         * 参与人名称
         * <p> 示例值：Group
         */
        this.displayName = builder.displayName;
        /**
         * 参与人是否为日程组织者
         * <p> 示例值：false
         */
        this.isOrganizer = builder.isOrganizer;
        /**
         * 参与人是否为外部参与人
         * <p> 示例值：false
         */
        this.isExternal = builder.isExternal;
    }

    public static Builder newBuilder() {
        return new Builder();
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

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
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

    public static class Builder {
        /**
         * 参与人RSVP状态
         * <p> 示例值：needs_action
         */
        private String rsvpStatus;
        /**
         * 参与人是否为「可选参加」
         * <p> 示例值：true
         */
        private Boolean isOptional;
        /**
         * 参与人名称
         * <p> 示例值：Group
         */
        private String displayName;
        /**
         * 参与人是否为日程组织者
         * <p> 示例值：false
         */
        private Boolean isOrganizer;
        /**
         * 参与人是否为外部参与人
         * <p> 示例值：false
         */
        private Boolean isExternal;

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
         * @param rsvpStatus {@link com.lark.oapi.service.calendar.v4.enums.AttendeeChatMemberRsvpStatusEnum}
         * @return
         */
        public Builder rsvpStatus(com.lark.oapi.service.calendar.v4.enums.AttendeeChatMemberRsvpStatusEnum rsvpStatus) {
            this.rsvpStatus = rsvpStatus.getValue();
            return this;
        }


        /**
         * 参与人是否为「可选参加」
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
         * 参与人名称
         * <p> 示例值：Group
         *
         * @param displayName
         * @return
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }


        /**
         * 参与人是否为日程组织者
         * <p> 示例值：false
         *
         * @param isOrganizer
         * @return
         */
        public Builder isOrganizer(Boolean isOrganizer) {
            this.isOrganizer = isOrganizer;
            return this;
        }


        /**
         * 参与人是否为外部参与人
         * <p> 示例值：false
         *
         * @param isExternal
         * @return
         */
        public Builder isExternal(Boolean isExternal) {
            this.isExternal = isExternal;
            return this;
        }


        public AttendeeChatMember build() {
            return new AttendeeChatMember(this);
        }
    }
}
