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

package com.lark.oapi.service.corehr.v1.model;

import com.google.gson.annotations.SerializedName;

public class WorkCalendarDetail {
    /**
     * 工作日历ID
     * <p> 示例值：123456
     */
    @SerializedName("calendar_id")
    private String calendarId;
    /**
     * 工作日历名称
     * <p> 示例值：
     */
    @SerializedName("calendar_name")
    private WkCalendarI18n calendarName;
    /**
     * 工作日历是否启用
     * <p> 示例值：true
     */
    @SerializedName("enable")
    private Boolean enable;

    // builder 开始
    public WorkCalendarDetail() {
    }

    public WorkCalendarDetail(Builder builder) {
        /**
         * 工作日历ID
         * <p> 示例值：123456
         */
        this.calendarId = builder.calendarId;
        /**
         * 工作日历名称
         * <p> 示例值：
         */
        this.calendarName = builder.calendarName;
        /**
         * 工作日历是否启用
         * <p> 示例值：true
         */
        this.enable = builder.enable;
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

    public WkCalendarI18n getCalendarName() {
        return this.calendarName;
    }

    public void setCalendarName(WkCalendarI18n calendarName) {
        this.calendarName = calendarName;
    }

    public Boolean getEnable() {
        return this.enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public static class Builder {
        /**
         * 工作日历ID
         * <p> 示例值：123456
         */
        private String calendarId;
        /**
         * 工作日历名称
         * <p> 示例值：
         */
        private WkCalendarI18n calendarName;
        /**
         * 工作日历是否启用
         * <p> 示例值：true
         */
        private Boolean enable;

        /**
         * 工作日历ID
         * <p> 示例值：123456
         *
         * @param calendarId
         * @return
         */
        public Builder calendarId(String calendarId) {
            this.calendarId = calendarId;
            return this;
        }


        /**
         * 工作日历名称
         * <p> 示例值：
         *
         * @param calendarName
         * @return
         */
        public Builder calendarName(WkCalendarI18n calendarName) {
            this.calendarName = calendarName;
            return this;
        }


        /**
         * 工作日历是否启用
         * <p> 示例值：true
         *
         * @param enable
         * @return
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }


        public WorkCalendarDetail build() {
            return new WorkCalendarDetail(this);
        }
    }
}
