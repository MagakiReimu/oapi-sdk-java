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

public class TaskSummary {
    /**
     * 任务GUID
     * <p> 示例值：e297ddff-06ca-4166-b917-4ce57cd3a7a0
     */
    @SerializedName("guid")
    private String guid;
    /**
     * 任务的标题
     * <p> 示例值：年终总结
     */
    @SerializedName("summary")
    private String summary;
    /**
     * 任务完成的时间戳(ms)，为0表示未完成
     * <p> 示例值：1675742789470
     */
    @SerializedName("completed_at")
    private String completedAt;
    /**
     * 任务开始时间
     * <p> 示例值：
     */
    @SerializedName("start")
    private Start start;
    /**
     * 任务截止时间
     * <p> 示例值：
     */
    @SerializedName("due")
    private Due due;
    /**
     * 任务成员列表
     * <p> 示例值：
     */
    @SerializedName("members")
    private Member[] members;
    /**
     * 子任务的个数
     * <p> 示例值：1
     */
    @SerializedName("subtask_count")
    private Integer subtaskCount;

    // builder 开始
    public TaskSummary() {
    }

    public TaskSummary(Builder builder) {
        /**
         * 任务GUID
         * <p> 示例值：e297ddff-06ca-4166-b917-4ce57cd3a7a0
         */
        this.guid = builder.guid;
        /**
         * 任务的标题
         * <p> 示例值：年终总结
         */
        this.summary = builder.summary;
        /**
         * 任务完成的时间戳(ms)，为0表示未完成
         * <p> 示例值：1675742789470
         */
        this.completedAt = builder.completedAt;
        /**
         * 任务开始时间
         * <p> 示例值：
         */
        this.start = builder.start;
        /**
         * 任务截止时间
         * <p> 示例值：
         */
        this.due = builder.due;
        /**
         * 任务成员列表
         * <p> 示例值：
         */
        this.members = builder.members;
        /**
         * 子任务的个数
         * <p> 示例值：1
         */
        this.subtaskCount = builder.subtaskCount;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getGuid() {
        return this.guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCompletedAt() {
        return this.completedAt;
    }

    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }

    public Start getStart() {
        return this.start;
    }

    public void setStart(Start start) {
        this.start = start;
    }

    public Due getDue() {
        return this.due;
    }

    public void setDue(Due due) {
        this.due = due;
    }

    public Member[] getMembers() {
        return this.members;
    }

    public void setMembers(Member[] members) {
        this.members = members;
    }

    public Integer getSubtaskCount() {
        return this.subtaskCount;
    }

    public void setSubtaskCount(Integer subtaskCount) {
        this.subtaskCount = subtaskCount;
    }

    public static class Builder {
        /**
         * 任务GUID
         * <p> 示例值：e297ddff-06ca-4166-b917-4ce57cd3a7a0
         */
        private String guid;
        /**
         * 任务的标题
         * <p> 示例值：年终总结
         */
        private String summary;
        /**
         * 任务完成的时间戳(ms)，为0表示未完成
         * <p> 示例值：1675742789470
         */
        private String completedAt;
        /**
         * 任务开始时间
         * <p> 示例值：
         */
        private Start start;
        /**
         * 任务截止时间
         * <p> 示例值：
         */
        private Due due;
        /**
         * 任务成员列表
         * <p> 示例值：
         */
        private Member[] members;
        /**
         * 子任务的个数
         * <p> 示例值：1
         */
        private Integer subtaskCount;

        /**
         * 任务GUID
         * <p> 示例值：e297ddff-06ca-4166-b917-4ce57cd3a7a0
         *
         * @param guid
         * @return
         */
        public Builder guid(String guid) {
            this.guid = guid;
            return this;
        }


        /**
         * 任务的标题
         * <p> 示例值：年终总结
         *
         * @param summary
         * @return
         */
        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }


        /**
         * 任务完成的时间戳(ms)，为0表示未完成
         * <p> 示例值：1675742789470
         *
         * @param completedAt
         * @return
         */
        public Builder completedAt(String completedAt) {
            this.completedAt = completedAt;
            return this;
        }


        /**
         * 任务开始时间
         * <p> 示例值：
         *
         * @param start
         * @return
         */
        public Builder start(Start start) {
            this.start = start;
            return this;
        }


        /**
         * 任务截止时间
         * <p> 示例值：
         *
         * @param due
         * @return
         */
        public Builder due(Due due) {
            this.due = due;
            return this;
        }


        /**
         * 任务成员列表
         * <p> 示例值：
         *
         * @param members
         * @return
         */
        public Builder members(Member[] members) {
            this.members = members;
            return this;
        }


        /**
         * 子任务的个数
         * <p> 示例值：1
         *
         * @param subtaskCount
         * @return
         */
        public Builder subtaskCount(Integer subtaskCount) {
            this.subtaskCount = subtaskCount;
            return this;
        }


        public TaskSummary build() {
            return new TaskSummary(this);
        }
    }
}
