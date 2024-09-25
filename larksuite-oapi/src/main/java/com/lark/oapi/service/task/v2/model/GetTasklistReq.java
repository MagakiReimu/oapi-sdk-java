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
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class GetTasklistReq {
    /**
     * 表示user的ID的类型，支持open_id, user_id, union_id
     * <p> 示例值：open_id
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 清单全局唯一GUID
     * <p> 示例值：d300a75f-c56a-4be9-80d1-e47653028ceb
     */
    @Path
    @SerializedName("tasklist_guid")
    private String tasklistGuid;

    // builder 开始
    public GetTasklistReq() {
    }

    public GetTasklistReq(Builder builder) {
        /**
         * 表示user的ID的类型，支持open_id, user_id, union_id
         * <p> 示例值：open_id
         */
        this.userIdType = builder.userIdType;
        /**
         * 清单全局唯一GUID
         * <p> 示例值：d300a75f-c56a-4be9-80d1-e47653028ceb
         */
        this.tasklistGuid = builder.tasklistGuid;
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

    public String getTasklistGuid() {
        return this.tasklistGuid;
    }

    public void setTasklistGuid(String tasklistGuid) {
        this.tasklistGuid = tasklistGuid;
    }

    public static class Builder {
        private String userIdType; // 表示user的ID的类型，支持open_id, user_id, union_id
        private String tasklistGuid; // 清单全局唯一GUID

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
         * 清单全局唯一GUID
         * <p> 示例值：d300a75f-c56a-4be9-80d1-e47653028ceb
         *
         * @param tasklistGuid
         * @return
         */
        public Builder tasklistGuid(String tasklistGuid) {
            this.tasklistGuid = tasklistGuid;
            return this;
        }

        public GetTasklistReq build() {
            return new GetTasklistReq(this);
        }
    }
}
