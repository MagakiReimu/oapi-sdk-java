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

public class Vchat {
    /**
     * 视频会议类型
     * <p> 示例值：third_party
     */
    @SerializedName("vc_type")
    private String vcType;
    /**
     * 第三方视频会议icon类型；可以为空，为空展示默认icon。
     * <p> 示例值：vc
     */
    @SerializedName("icon_type")
    private String iconType;
    /**
     * 第三方视频会议文案，可以为空，为空展示默认文案
     * <p> 示例值：发起视频会议
     */
    @SerializedName("description")
    private String description;
    /**
     * 视频会议URL
     * <p> 示例值：https://example.com
     */
    @SerializedName("meeting_url")
    private String meetingUrl;
    /**
     * VC视频会议的会前设置
     * <p> 示例值：
     */
    @SerializedName("meeting_settings")
    private MeetingSettings meetingSettings;

    // builder 开始
    public Vchat() {
    }

    public Vchat(Builder builder) {
        /**
         * 视频会议类型
         * <p> 示例值：third_party
         */
        this.vcType = builder.vcType;
        /**
         * 第三方视频会议icon类型；可以为空，为空展示默认icon。
         * <p> 示例值：vc
         */
        this.iconType = builder.iconType;
        /**
         * 第三方视频会议文案，可以为空，为空展示默认文案
         * <p> 示例值：发起视频会议
         */
        this.description = builder.description;
        /**
         * 视频会议URL
         * <p> 示例值：https://example.com
         */
        this.meetingUrl = builder.meetingUrl;
        /**
         * VC视频会议的会前设置
         * <p> 示例值：
         */
        this.meetingSettings = builder.meetingSettings;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getVcType() {
        return this.vcType;
    }

    public void setVcType(String vcType) {
        this.vcType = vcType;
    }

    public String getIconType() {
        return this.iconType;
    }

    public void setIconType(String iconType) {
        this.iconType = iconType;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMeetingUrl() {
        return this.meetingUrl;
    }

    public void setMeetingUrl(String meetingUrl) {
        this.meetingUrl = meetingUrl;
    }

    public MeetingSettings getMeetingSettings() {
        return this.meetingSettings;
    }

    public void setMeetingSettings(MeetingSettings meetingSettings) {
        this.meetingSettings = meetingSettings;
    }

    public static class Builder {
        /**
         * 视频会议类型
         * <p> 示例值：third_party
         */
        private String vcType;
        /**
         * 第三方视频会议icon类型；可以为空，为空展示默认icon。
         * <p> 示例值：vc
         */
        private String iconType;
        /**
         * 第三方视频会议文案，可以为空，为空展示默认文案
         * <p> 示例值：发起视频会议
         */
        private String description;
        /**
         * 视频会议URL
         * <p> 示例值：https://example.com
         */
        private String meetingUrl;
        /**
         * VC视频会议的会前设置
         * <p> 示例值：
         */
        private MeetingSettings meetingSettings;

        /**
         * 视频会议类型
         * <p> 示例值：third_party
         *
         * @param vcType
         * @return
         */
        public Builder vcType(String vcType) {
            this.vcType = vcType;
            return this;
        }

        /**
         * 视频会议类型
         * <p> 示例值：third_party
         *
         * @param vcType {@link com.lark.oapi.service.calendar.v4.enums.VchatVcTypeEnum}
         * @return
         */
        public Builder vcType(com.lark.oapi.service.calendar.v4.enums.VchatVcTypeEnum vcType) {
            this.vcType = vcType.getValue();
            return this;
        }


        /**
         * 第三方视频会议icon类型；可以为空，为空展示默认icon。
         * <p> 示例值：vc
         *
         * @param iconType
         * @return
         */
        public Builder iconType(String iconType) {
            this.iconType = iconType;
            return this;
        }

        /**
         * 第三方视频会议icon类型；可以为空，为空展示默认icon。
         * <p> 示例值：vc
         *
         * @param iconType {@link com.lark.oapi.service.calendar.v4.enums.VchatIconTypeEnum}
         * @return
         */
        public Builder iconType(com.lark.oapi.service.calendar.v4.enums.VchatIconTypeEnum iconType) {
            this.iconType = iconType.getValue();
            return this;
        }


        /**
         * 第三方视频会议文案，可以为空，为空展示默认文案
         * <p> 示例值：发起视频会议
         *
         * @param description
         * @return
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }


        /**
         * 视频会议URL
         * <p> 示例值：https://example.com
         *
         * @param meetingUrl
         * @return
         */
        public Builder meetingUrl(String meetingUrl) {
            this.meetingUrl = meetingUrl;
            return this;
        }


        /**
         * VC视频会议的会前设置
         * <p> 示例值：
         *
         * @param meetingSettings
         * @return
         */
        public Builder meetingSettings(MeetingSettings meetingSettings) {
            this.meetingSettings = meetingSettings;
            return this;
        }


        public Vchat build() {
            return new Vchat(this);
        }
    }
}
