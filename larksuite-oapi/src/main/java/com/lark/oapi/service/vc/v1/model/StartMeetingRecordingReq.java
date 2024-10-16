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
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class StartMeetingRecordingReq {
    /**
     * 会议ID（视频会议的唯一标识，视频会议开始后才会产生）
     * <p> 示例值：6911188411932033028
     */
    @Path
    @SerializedName("meeting_id")
    private String meetingId;
    @Body
    private StartMeetingRecordingReqBody body;

    // builder 开始
    public StartMeetingRecordingReq() {
    }

    public StartMeetingRecordingReq(Builder builder) {
        /**
         * 会议ID（视频会议的唯一标识，视频会议开始后才会产生）
         * <p> 示例值：6911188411932033028
         */
        this.meetingId = builder.meetingId;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getMeetingId() {
        return this.meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public StartMeetingRecordingReqBody getStartMeetingRecordingReqBody() {
        return this.body;
    }

    public void setStartMeetingRecordingReqBody(StartMeetingRecordingReqBody body) {
        this.body = body;
    }

    public static class Builder {

        private String meetingId; // 会议ID（视频会议的唯一标识，视频会议开始后才会产生）
        private StartMeetingRecordingReqBody body;

        /**
         * 会议ID（视频会议的唯一标识，视频会议开始后才会产生）
         * <p> 示例值：6911188411932033028
         *
         * @param meetingId
         * @return
         */
        public Builder meetingId(String meetingId) {
            this.meetingId = meetingId;
            return this;
        }

        public StartMeetingRecordingReqBody getStartMeetingRecordingReqBody() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder startMeetingRecordingReqBody(StartMeetingRecordingReqBody body) {
            this.body = body;
            return this;
        }

        public StartMeetingRecordingReq build() {
            return new StartMeetingRecordingReq(this);
        }
    }
}
