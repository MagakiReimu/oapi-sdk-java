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
import com.lark.oapi.core.annotation.Path;

public class CreateCalendarEventMeetingMinuteReq {
    /**
     * 日历ID
     * <p> 示例值：feishu.cn_HF9U2MbibE8PPpjro6xjqa@group.calendar.feishu.cn
     */
    @Path
    @SerializedName("calendar_id")
    private String calendarId;
    /**
     * 日程ID
     * <p> 示例值：75d28f9b-e35c-4230-8a83-4a661497db54_0
     */
    @Path
    @SerializedName("event_id")
    private String eventId;

    // builder 开始
    public CreateCalendarEventMeetingMinuteReq() {
    }

    public CreateCalendarEventMeetingMinuteReq(Builder builder) {
        /**
         * 日历ID
         * <p> 示例值：feishu.cn_HF9U2MbibE8PPpjro6xjqa@group.calendar.feishu.cn
         */
        this.calendarId = builder.calendarId;
        /**
         * 日程ID
         * <p> 示例值：75d28f9b-e35c-4230-8a83-4a661497db54_0
         */
        this.eventId = builder.eventId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getCalendarId() {
        return this.calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    public String getEventId() {
        return this.eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public static class Builder {

        private String calendarId; // 日历ID
        private String eventId; // 日程ID

        /**
         * 日历ID
         * <p> 示例值：feishu.cn_HF9U2MbibE8PPpjro6xjqa@group.calendar.feishu.cn
         *
         * @param calendarId
         * @return
         */
        public Builder calendarId(String calendarId) {
            this.calendarId = calendarId;
            return this;
        }


        /**
         * 日程ID
         * <p> 示例值：75d28f9b-e35c-4230-8a83-4a661497db54_0
         *
         * @param eventId
         * @return
         */
        public Builder eventId(String eventId) {
            this.eventId = eventId;
            return this;
        }

        public CreateCalendarEventMeetingMinuteReq build() {
            return new CreateCalendarEventMeetingMinuteReq(this);
        }
    }
}
