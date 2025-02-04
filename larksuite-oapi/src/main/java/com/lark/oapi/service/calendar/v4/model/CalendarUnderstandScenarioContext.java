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
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class CalendarUnderstandScenarioContext {
    /**
     * 会话所处的业务场景
     * <p> 示例值：IM
     */
    @SerializedName("scenario")
    private String scenario;
    /**
     * 会话所处的业务模式
     * <p> 示例值：1
     */
    @SerializedName("work_mode")
    private Integer workMode;
    /**
     * 透传数据
     * <p> 示例值：
     */
    @SerializedName("extra")
    private CalendarUnderstandExtra extra;
    /**
     * 系统信息
     * <p> 示例值：
     */
    @SerializedName("system_info")
    private SystemInfo systemInfo;

    // builder 开始
    public CalendarUnderstandScenarioContext() {
    }

    public CalendarUnderstandScenarioContext(Builder builder) {
        /**
         * 会话所处的业务场景
         * <p> 示例值：IM
         */
        this.scenario = builder.scenario;
        /**
         * 会话所处的业务模式
         * <p> 示例值：1
         */
        this.workMode = builder.workMode;
        /**
         * 透传数据
         * <p> 示例值：
         */
        this.extra = builder.extra;
        /**
         * 系统信息
         * <p> 示例值：
         */
        this.systemInfo = builder.systemInfo;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getScenario() {
        return this.scenario;
    }

    public void setScenario(String scenario) {
        this.scenario = scenario;
    }

    public Integer getWorkMode() {
        return this.workMode;
    }

    public void setWorkMode(Integer workMode) {
        this.workMode = workMode;
    }

    public CalendarUnderstandExtra getExtra() {
        return this.extra;
    }

    public void setExtra(CalendarUnderstandExtra extra) {
        this.extra = extra;
    }

    public SystemInfo getSystemInfo() {
        return this.systemInfo;
    }

    public void setSystemInfo(SystemInfo systemInfo) {
        this.systemInfo = systemInfo;
    }

    public static class Builder {
        /**
         * 会话所处的业务场景
         * <p> 示例值：IM
         */
        private String scenario;
        /**
         * 会话所处的业务模式
         * <p> 示例值：1
         */
        private Integer workMode;
        /**
         * 透传数据
         * <p> 示例值：
         */
        private CalendarUnderstandExtra extra;
        /**
         * 系统信息
         * <p> 示例值：
         */
        private SystemInfo systemInfo;

        /**
         * 会话所处的业务场景
         * <p> 示例值：IM
         *
         * @param scenario
         * @return
         */
        public Builder scenario(String scenario) {
            this.scenario = scenario;
            return this;
        }


        /**
         * 会话所处的业务模式
         * <p> 示例值：1
         *
         * @param workMode
         * @return
         */
        public Builder workMode(Integer workMode) {
            this.workMode = workMode;
            return this;
        }


        /**
         * 透传数据
         * <p> 示例值：
         *
         * @param extra
         * @return
         */
        public Builder extra(CalendarUnderstandExtra extra) {
            this.extra = extra;
            return this;
        }


        /**
         * 系统信息
         * <p> 示例值：
         *
         * @param systemInfo
         * @return
         */
        public Builder systemInfo(SystemInfo systemInfo) {
            this.systemInfo = systemInfo;
            return this;
        }


        public CalendarUnderstandScenarioContext build() {
            return new CalendarUnderstandScenarioContext(this);
        }
    }
}
