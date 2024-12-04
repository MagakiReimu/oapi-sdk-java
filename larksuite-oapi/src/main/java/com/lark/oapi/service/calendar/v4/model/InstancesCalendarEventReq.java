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

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.calendar.v4.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class InstancesCalendarEventReq {
    /**
     * 日程实例开始Unix时间戳，单位为秒,日程的end_time的下限（不包含）
     * <p> 示例值：1631777271
     */
    @Query
    @SerializedName("start_time")
    private String startTime;
    /**
     * 日程实例结束Unix时间戳，单位为秒,日程的start_time上限（不包含）
     * <p> 示例值：1631777271
     */
    @Query
    @SerializedName("end_time")
    private String endTime;
    /**
     * 分页大小
     * <p> 示例值：
     */
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    /**
     * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
     * <p> 示例值：
     */
    @Query
    @SerializedName("page_token")
    private String pageToken;
    /**
     * 日历资源ID
     * <p> 示例值：feishu.cn_HF9U2MbibE8PPpjro6xjqa@group.calendar.feishu.cn
     */
    @Path
    @SerializedName("calendar_id")
    private String calendarId;
    /**
     * 日程资源ID
     * <p> 示例值：75d28f9b-e35c-4230-8a83-4a661497db54_0
     */
    @Path
    @SerializedName("event_id")
    private String eventId;

    // builder 开始
    public InstancesCalendarEventReq() {
    }

    public InstancesCalendarEventReq(Builder builder) {
        /**
         * 日程实例开始Unix时间戳，单位为秒,日程的end_time的下限（不包含）
         * <p> 示例值：1631777271
         */
        this.startTime = builder.startTime;
        /**
         * 日程实例结束Unix时间戳，单位为秒,日程的start_time上限（不包含）
         * <p> 示例值：1631777271
         */
        this.endTime = builder.endTime;
        /**
         * 分页大小
         * <p> 示例值：
         */
        this.pageSize = builder.pageSize;
        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
         * <p> 示例值：
         */
        this.pageToken = builder.pageToken;
        /**
         * 日历资源ID
         * <p> 示例值：feishu.cn_HF9U2MbibE8PPpjro6xjqa@group.calendar.feishu.cn
         */
        this.calendarId = builder.calendarId;
        /**
         * 日程资源ID
         * <p> 示例值：75d28f9b-e35c-4230-8a83-4a661497db54_0
         */
        this.eventId = builder.eventId;
    }

    public static Builder newBuilder() {
        return new Builder();
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

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getPageToken() {
        return this.pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
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
        private String startTime; // 日程实例开始Unix时间戳，单位为秒,日程的end_time的下限（不包含）
        private String endTime; // 日程实例结束Unix时间戳，单位为秒,日程的start_time上限（不包含）
        private Integer pageSize; // 分页大小
        private String pageToken; // 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
        private String calendarId; // 日历资源ID
        private String eventId; // 日程资源ID

        /**
         * 日程实例开始Unix时间戳，单位为秒,日程的end_time的下限（不包含）
         * <p> 示例值：1631777271
         *
         * @param startTime
         * @return
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * 日程实例结束Unix时间戳，单位为秒,日程的start_time上限（不包含）
         * <p> 示例值：1631777271
         *
         * @param endTime
         * @return
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * 分页大小
         * <p> 示例值：
         *
         * @param pageSize
         * @return
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
         * <p> 示例值：
         *
         * @param pageToken
         * @return
         */
        public Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }

        /**
         * 日历资源ID
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
         * 日程资源ID
         * <p> 示例值：75d28f9b-e35c-4230-8a83-4a661497db54_0
         *
         * @param eventId
         * @return
         */
        public Builder eventId(String eventId) {
            this.eventId = eventId;
            return this;
        }


        public InstancesCalendarEventReq build() {
            return new InstancesCalendarEventReq(this);
        }
    }
}
