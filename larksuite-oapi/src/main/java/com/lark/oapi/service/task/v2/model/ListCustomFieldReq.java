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
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class ListCustomFieldReq {
    /**
     * 分页大小
     * <p> 示例值：50
     */
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    /**
     * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
     * <p> 示例值：aWQ9NzEwMjMzMjMxMDE=
     */
    @Query
    @SerializedName("page_token")
    private String pageToken;
    /**
     * 用户ID格式，支持open_id, user_id, union_id
     * <p> 示例值：open_id
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 资源类型，如提供表示仅查询特定资源下的自定义字段。目前只支持tasklist。
     * <p> 示例值：tasklist
     */
    @Query
    @SerializedName("resource_type")
    private String resourceType;
    /**
     * 要查询自定义字段的归属resource_id
     * <p> 示例值：5ffbe0ca-6600-41e0-a634-2b38cbcf13b8
     */
    @Query
    @SerializedName("resource_id")
    private String resourceId;

    // builder 开始
    public ListCustomFieldReq() {
    }

    public ListCustomFieldReq(Builder builder) {
        /**
         * 分页大小
         * <p> 示例值：50
         */
        this.pageSize = builder.pageSize;
        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
         * <p> 示例值：aWQ9NzEwMjMzMjMxMDE=
         */
        this.pageToken = builder.pageToken;
        /**
         * 用户ID格式，支持open_id, user_id, union_id
         * <p> 示例值：open_id
         */
        this.userIdType = builder.userIdType;
        /**
         * 资源类型，如提供表示仅查询特定资源下的自定义字段。目前只支持tasklist。
         * <p> 示例值：tasklist
         */
        this.resourceType = builder.resourceType;
        /**
         * 要查询自定义字段的归属resource_id
         * <p> 示例值：5ffbe0ca-6600-41e0-a634-2b38cbcf13b8
         */
        this.resourceId = builder.resourceId;
    }

    public static Builder newBuilder() {
        return new Builder();
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

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public String getResourceType() {
        return this.resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceId() {
        return this.resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public static class Builder {
        private Integer pageSize; // 分页大小
        private String pageToken; // 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
        private String userIdType; // 用户ID格式，支持open_id, user_id, union_id
        private String resourceType; // 资源类型，如提供表示仅查询特定资源下的自定义字段。目前只支持tasklist。
        private String resourceId; // 要查询自定义字段的归属resource_id

        /**
         * 分页大小
         * <p> 示例值：50
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
         * <p> 示例值：aWQ9NzEwMjMzMjMxMDE=
         *
         * @param pageToken
         * @return
         */
        public Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }


        /**
         * 用户ID格式，支持open_id, user_id, union_id
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
         * 用户ID格式，支持open_id, user_id, union_id
         * <p> 示例值：open_id
         *
         * @param userIdType {@link com.lark.oapi.service.task.v2.enums.ListCustomFieldUserIdTypeEnum}
         * @return
         */
        public Builder userIdType(com.lark.oapi.service.task.v2.enums.ListCustomFieldUserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }


        /**
         * 资源类型，如提供表示仅查询特定资源下的自定义字段。目前只支持tasklist。
         * <p> 示例值：tasklist
         *
         * @param resourceType
         * @return
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }


        /**
         * 要查询自定义字段的归属resource_id
         * <p> 示例值：5ffbe0ca-6600-41e0-a634-2b38cbcf13b8
         *
         * @param resourceId
         * @return
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }


        public ListCustomFieldReq build() {
            return new ListCustomFieldReq(this);
        }
    }
}
