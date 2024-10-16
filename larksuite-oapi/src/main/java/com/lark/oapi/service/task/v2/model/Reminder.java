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

package com.lark.oapi.service.task.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.task.v2.enums.*;
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

public class Reminder {
    /**
     * 提醒时间设置的 ID
     * <p> 示例值：10
     */
    @SerializedName("id")
    private String id;
    /**
     * 相对于截止时间的提醒时间分钟数。例如30表示截止时间前30分钟提醒；0表示截止时提醒。
     * <p> 示例值：30
     */
    @SerializedName("relative_fire_minute")
    private Integer relativeFireMinute;

    // builder 开始
    public Reminder() {
    }

    public Reminder(Builder builder) {
        /**
         * 提醒时间设置的 ID
         * <p> 示例值：10
         */
        this.id = builder.id;
        /**
         * 相对于截止时间的提醒时间分钟数。例如30表示截止时间前30分钟提醒；0表示截止时提醒。
         * <p> 示例值：30
         */
        this.relativeFireMinute = builder.relativeFireMinute;
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

    public Integer getRelativeFireMinute() {
        return this.relativeFireMinute;
    }

    public void setRelativeFireMinute(Integer relativeFireMinute) {
        this.relativeFireMinute = relativeFireMinute;
    }

    public static class Builder {
        /**
         * 提醒时间设置的 ID
         * <p> 示例值：10
         */
        private String id;
        /**
         * 相对于截止时间的提醒时间分钟数。例如30表示截止时间前30分钟提醒；0表示截止时提醒。
         * <p> 示例值：30
         */
        private Integer relativeFireMinute;

        /**
         * 提醒时间设置的 ID
         * <p> 示例值：10
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 相对于截止时间的提醒时间分钟数。例如30表示截止时间前30分钟提醒；0表示截止时提醒。
         * <p> 示例值：30
         *
         * @param relativeFireMinute
         * @return
         */
        public Builder relativeFireMinute(Integer relativeFireMinute) {
            this.relativeFireMinute = relativeFireMinute;
            return this;
        }


        public Reminder build() {
            return new Reminder(this);
        }
    }
}
