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

package com.lark.oapi.service.drive.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.drive.v1.enums.*;
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

public class FileChangeInfo {
    /**
     * 变更开始时间
     * <p> 示例值：1687748146
     */
    @SerializedName("start_time")
    private Integer startTime;
    /**
     * 版本变更明细
     * <p> 示例值：
     */
    @SerializedName("changes")
    private FileBlockChangeInfo[] changes;

    // builder 开始
    public FileChangeInfo() {
    }

    public FileChangeInfo(Builder builder) {
        /**
         * 变更开始时间
         * <p> 示例值：1687748146
         */
        this.startTime = builder.startTime;
        /**
         * 版本变更明细
         * <p> 示例值：
         */
        this.changes = builder.changes;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public FileBlockChangeInfo[] getChanges() {
        return this.changes;
    }

    public void setChanges(FileBlockChangeInfo[] changes) {
        this.changes = changes;
    }

    public static class Builder {
        /**
         * 变更开始时间
         * <p> 示例值：1687748146
         */
        private Integer startTime;
        /**
         * 版本变更明细
         * <p> 示例值：
         */
        private FileBlockChangeInfo[] changes;

        /**
         * 变更开始时间
         * <p> 示例值：1687748146
         *
         * @param startTime
         * @return
         */
        public Builder startTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }


        /**
         * 版本变更明细
         * <p> 示例值：
         *
         * @param changes
         * @return
         */
        public Builder changes(FileBlockChangeInfo[] changes) {
            this.changes = changes;
            return this;
        }


        public FileChangeInfo build() {
            return new FileChangeInfo(this);
        }
    }
}
