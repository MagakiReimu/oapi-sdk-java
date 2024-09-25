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

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class AddTasklistTaskReq {
    /**
     * 表示user的ID的类型，支持open_id, user_id, union_id
     * <p> 示例值：open_id
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 要添加到清单的任务的全局唯一ID
     * <p> 示例值：d300a75f-c56a-4be9-80d1-e47653028ceb
     */
    @Path
    @SerializedName("task_guid")
    private String taskGuid;
    @Body
    private AddTasklistTaskReqBody body;

    // builder 开始
    public AddTasklistTaskReq() {
    }

    public AddTasklistTaskReq(Builder builder) {
        /**
         * 表示user的ID的类型，支持open_id, user_id, union_id
         * <p> 示例值：open_id
         */
        this.userIdType = builder.userIdType;
        /**
         * 要添加到清单的任务的全局唯一ID
         * <p> 示例值：d300a75f-c56a-4be9-80d1-e47653028ceb
         */
        this.taskGuid = builder.taskGuid;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public String getTaskGuid() {
        return this.taskGuid;
    }

    public void setTaskGuid(String taskGuid) {
        this.taskGuid = taskGuid;
    }

    public AddTasklistTaskReqBody getAddTasklistTaskReqBody() {
        return this.body;
    }

    public void setAddTasklistTaskReqBody(AddTasklistTaskReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String userIdType; // 表示user的ID的类型，支持open_id, user_id, union_id
        private String taskGuid; // 要添加到清单的任务的全局唯一ID
        private AddTasklistTaskReqBody body;

        /**
         * 表示user的ID的类型，支持open_id, user_id, union_id
         * <p> 示例值：open_id
         *
         * @param userIdType
         * @return
         */
        public Builder userIdType(String userIdType) {
            this.userIdType = userIdType;
            return this;
        }

        /**
         * 要添加到清单的任务的全局唯一ID
         * <p> 示例值：d300a75f-c56a-4be9-80d1-e47653028ceb
         *
         * @param taskGuid
         * @return
         */
        public Builder taskGuid(String taskGuid) {
            this.taskGuid = taskGuid;
            return this;
        }

        public AddTasklistTaskReqBody getAddTasklistTaskReqBody() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder addTasklistTaskReqBody(AddTasklistTaskReqBody body) {
            this.body = body;
            return this;
        }

        public AddTasklistTaskReq build() {
            return new AddTasklistTaskReq(this);
        }
    }
}
