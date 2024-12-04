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

package com.lark.oapi.service.task.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.task.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class DeleteTaskCollaboratorReq {
    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 任务 ID
     * <p> 示例值：83912691-2e43-47fc-94a4-d512e03984fa
     */
    @Path
    @SerializedName("task_id")
    private String taskId;
    /**
     * 任务执行者 ID（Open ID或User ID，由user_id_type指定）
     * <p> 示例值：ou_99e1a581b36ecc4862cbfbce123f346a
     */
    @Path
    @SerializedName("collaborator_id")
    private String collaboratorId;

    // builder 开始
    public DeleteTaskCollaboratorReq() {
    }
    public DeleteTaskCollaboratorReq(Builder builder) {
        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         */
        this.userIdType = builder.userIdType;
        /**
         * 任务 ID
         * <p> 示例值：83912691-2e43-47fc-94a4-d512e03984fa
         */
        this.taskId = builder.taskId;
        /**
         * 任务执行者 ID（Open ID或User ID，由user_id_type指定）
         * <p> 示例值：ou_99e1a581b36ecc4862cbfbce123f346a
         */
        this.collaboratorId = builder.collaboratorId;
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

    public String getTaskId() {
        return this.taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getCollaboratorId() {
        return this.collaboratorId;
    }

    public void setCollaboratorId(String collaboratorId) {
        this.collaboratorId = collaboratorId;
    }

    public static class Builder {
        private String userIdType; // 此次调用中使用的用户ID的类型
        private String taskId; // 任务 ID
        private String collaboratorId; // 任务执行者 ID（Open ID或User ID，由user_id_type指定）

        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         *
         * @param userIdType
         * @return
         */
        public Builder userIdType(String userIdType) {
            this.userIdType = userIdType;
            return this;
        }

        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         *
         * @param userIdType {@link com.lark.oapi.service.task.v1.enums.DeleteTaskCollaboratorUserIdTypeEnum}
         * @return
         */
        public Builder userIdType(com.lark.oapi.service.task.v1.enums.DeleteTaskCollaboratorUserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }

        /**
         * 任务 ID
         * <p> 示例值：83912691-2e43-47fc-94a4-d512e03984fa
         *
         * @param taskId
         * @return
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }


        /**
         * 任务执行者 ID（Open ID或User ID，由user_id_type指定）
         * <p> 示例值：ou_99e1a581b36ecc4862cbfbce123f346a
         *
         * @param collaboratorId
         * @return
         */
        public Builder collaboratorId(String collaboratorId) {
            this.collaboratorId = collaboratorId;
            return this;
        }


        public DeleteTaskCollaboratorReq build() {
            return new DeleteTaskCollaboratorReq(this);
        }
    }
}
