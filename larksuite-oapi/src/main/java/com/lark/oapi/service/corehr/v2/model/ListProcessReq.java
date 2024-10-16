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

package com.lark.oapi.service.corehr.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.corehr.v2.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class ListProcessReq {
    /**
     * 任务查询结束时间 (unix毫秒时间戳)，闭区间，开始时间和结束时间跨度不能超过31天
     * <p> 示例值：1547654251506
     */
    @Query
    @SerializedName("modify_time_to")
    private String modifyTimeTo;
    /**
     * 查询状态列表
     * <p> 示例值：
     */
    @Query
    @SerializedName("statuses")
    private Integer[] statuses;
    /**
     * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
     * <p> 示例值：7278949005675988535
     */
    @Query
    @SerializedName("page_token")
    private String pageToken;
    /**
     * 分页大小
     * <p> 示例值：100
     */
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    /**
     * 查询开始时间（unix毫秒时间戳），闭区间，开始时间和结束时间跨度不能超过31天
     * <p> 示例值：1547654251506
     */
    @Query
    @SerializedName("modify_time_from")
    private String modifyTimeFrom;
    /**
     * 流程定义ID
     * <p> 示例值：people_6961286846093788680_7081951411982077732
     */
    @Query
    @SerializedName("flow_definition_id")
    private String flowDefinitionId;

    // builder 开始
    public ListProcessReq() {
    }

    public ListProcessReq(Builder builder) {
        /**
         * 任务查询结束时间 (unix毫秒时间戳)，闭区间，开始时间和结束时间跨度不能超过31天
         * <p> 示例值：1547654251506
         */
        this.modifyTimeTo = builder.modifyTimeTo;
        /**
         * 查询状态列表
         * <p> 示例值：
         */
        this.statuses = builder.statuses;
        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
         * <p> 示例值：7278949005675988535
         */
        this.pageToken = builder.pageToken;
        /**
         * 分页大小
         * <p> 示例值：100
         */
        this.pageSize = builder.pageSize;
        /**
         * 查询开始时间（unix毫秒时间戳），闭区间，开始时间和结束时间跨度不能超过31天
         * <p> 示例值：1547654251506
         */
        this.modifyTimeFrom = builder.modifyTimeFrom;
        /**
         * 流程定义ID
         * <p> 示例值：people_6961286846093788680_7081951411982077732
         */
        this.flowDefinitionId = builder.flowDefinitionId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getModifyTimeTo() {
        return this.modifyTimeTo;
    }

    public void setModifyTimeTo(String modifyTimeTo) {
        this.modifyTimeTo = modifyTimeTo;
    }

    public Integer[] getStatuses() {
        return this.statuses;
    }

    public void setStatuses(Integer[] statuses) {
        this.statuses = statuses;
    }

    public String getPageToken() {
        return this.pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getModifyTimeFrom() {
        return this.modifyTimeFrom;
    }

    public void setModifyTimeFrom(String modifyTimeFrom) {
        this.modifyTimeFrom = modifyTimeFrom;
    }

    public String getFlowDefinitionId() {
        return this.flowDefinitionId;
    }

    public void setFlowDefinitionId(String flowDefinitionId) {
        this.flowDefinitionId = flowDefinitionId;
    }

    public static class Builder {
        private String modifyTimeTo; // 任务查询结束时间 (unix毫秒时间戳)，闭区间，开始时间和结束时间跨度不能超过31天
        private Integer[] statuses; // 查询状态列表
        private String pageToken; // 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
        private Integer pageSize; // 分页大小
        private String modifyTimeFrom; // 查询开始时间（unix毫秒时间戳），闭区间，开始时间和结束时间跨度不能超过31天
        private String flowDefinitionId; // 流程定义ID


        /**
         * 任务查询结束时间 (unix毫秒时间戳)，闭区间，开始时间和结束时间跨度不能超过31天
         * <p> 示例值：1547654251506
         *
         * @param modifyTimeTo
         * @return
         */
        public Builder modifyTimeTo(String modifyTimeTo) {
            this.modifyTimeTo = modifyTimeTo;
            return this;
        }


        /**
         * 查询状态列表
         * <p> 示例值：
         *
         * @param statuses
         * @return
         */
        public Builder statuses(Integer[] statuses) {
            this.statuses = statuses;
            return this;
        }


        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
         * <p> 示例值：7278949005675988535
         *
         * @param pageToken
         * @return
         */
        public Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }


        /**
         * 分页大小
         * <p> 示例值：100
         *
         * @param pageSize
         * @return
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }


        /**
         * 查询开始时间（unix毫秒时间戳），闭区间，开始时间和结束时间跨度不能超过31天
         * <p> 示例值：1547654251506
         *
         * @param modifyTimeFrom
         * @return
         */
        public Builder modifyTimeFrom(String modifyTimeFrom) {
            this.modifyTimeFrom = modifyTimeFrom;
            return this;
        }


        /**
         * 流程定义ID
         * <p> 示例值：people_6961286846093788680_7081951411982077732
         *
         * @param flowDefinitionId
         * @return
         */
        public Builder flowDefinitionId(String flowDefinitionId) {
            this.flowDefinitionId = flowDefinitionId;
            return this;
        }

        public ListProcessReq build() {
            return new ListProcessReq(this);
        }
    }
}
