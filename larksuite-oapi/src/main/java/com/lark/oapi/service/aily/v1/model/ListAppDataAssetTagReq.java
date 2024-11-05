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

package com.lark.oapi.service.aily.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.aily.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class ListAppDataAssetTagReq {
    /**
     * 分页参数：分页大小，默认：20，最大：100
     * <p> 示例值：
     */
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    /**
     * 分页参数：分页起始位置，为空表示首页
     * <p> 示例值：
     */
    @Query
    @SerializedName("page_token")
    private String pageToken;
    /**
     * 模糊匹配分类名称
     * <p> 示例值：电影
     */
    @Query
    @SerializedName("keyword")
    private String keyword;
    /**
     * 模糊匹配分类名称
     * <p> 示例值：
     */
    @Query
    @SerializedName("data_asset_tag_ids")
    private String[] dataAssetTagIds;
    /**
     * AppID
     * <p> 示例值：spring_5862e4fea8__c
     */
    @Path
    @SerializedName("app_id")
    private String appId;

    // builder 开始
    public ListAppDataAssetTagReq() {
    }

    public ListAppDataAssetTagReq(Builder builder) {
        /**
         * 分页参数：分页大小，默认：20，最大：100
         * <p> 示例值：
         */
        this.pageSize = builder.pageSize;
        /**
         * 分页参数：分页起始位置，为空表示首页
         * <p> 示例值：
         */
        this.pageToken = builder.pageToken;
        /**
         * 模糊匹配分类名称
         * <p> 示例值：电影
         */
        this.keyword = builder.keyword;
        /**
         * 模糊匹配分类名称
         * <p> 示例值：
         */
        this.dataAssetTagIds = builder.dataAssetTagIds;
        /**
         * AppID
         * <p> 示例值：spring_5862e4fea8__c
         */
        this.appId = builder.appId;
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

    public String getKeyword() {
        return this.keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String[] getDataAssetTagIds() {
        return this.dataAssetTagIds;
    }

    public void setDataAssetTagIds(String[] dataAssetTagIds) {
        this.dataAssetTagIds = dataAssetTagIds;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public static class Builder {
        private Integer pageSize; // 分页参数：分页大小，默认：20，最大：100
        private String pageToken; // 分页参数：分页起始位置，为空表示首页
        private String keyword; // 模糊匹配分类名称
        private String[] dataAssetTagIds; // 模糊匹配分类名称
        private String appId; // AppID

        /**
         * 分页参数：分页大小，默认：20，最大：100
         * <p> 示例值：
         *
         * @param pageSize
         * @return
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 分页参数：分页起始位置，为空表示首页
         * <p> 示例值：
         *
         * @param pageToken
         * @return
         */
        public Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }

        /**
         * 模糊匹配分类名称
         * <p> 示例值：电影
         *
         * @param keyword
         * @return
         */
        public Builder keyword(String keyword) {
            this.keyword = keyword;
            return this;
        }

        /**
         * 模糊匹配分类名称
         * <p> 示例值：
         *
         * @param dataAssetTagIds
         * @return
         */
        public Builder dataAssetTagIds(String[] dataAssetTagIds) {
            this.dataAssetTagIds = dataAssetTagIds;
            return this;
        }

        /**
         * AppID
         * <p> 示例值：spring_5862e4fea8__c
         *
         * @param appId
         * @return
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        public ListAppDataAssetTagReq build() {
            return new ListAppDataAssetTagReq(this);
        }
    }
}
