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

package com.lark.oapi.service.approval.v4.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.approval.v4.enums.*;
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

public class InstanceComment {
    /**
     * 评论 id
     * <p> 示例值：1234
     */
    @SerializedName("id")
    private String id;
    /**
     * 发表评论用户
     * <p> 示例值：f7cb567e
     */
    @SerializedName("user_id")
    private String userId;
    /**
     * 发表评论用户 open id
     * <p> 示例值：ou_123456
     */
    @SerializedName("open_id")
    private String openId;
    /**
     * 评论内容
     * <p> 示例值：ok
     */
    @SerializedName("comment")
    private String comment;
    /**
     * 1564590532967
     * <p> 示例值：评论时间
     */
    @SerializedName("create_time")
    private String createTime;
    /**
     * 评论附件
     * <p> 示例值：
     */
    @SerializedName("files")
    private File[] files;

    // builder 开始
    public InstanceComment() {
    }

    public InstanceComment(Builder builder) {
        /**
         * 评论 id
         * <p> 示例值：1234
         */
        this.id = builder.id;
        /**
         * 发表评论用户
         * <p> 示例值：f7cb567e
         */
        this.userId = builder.userId;
        /**
         * 发表评论用户 open id
         * <p> 示例值：ou_123456
         */
        this.openId = builder.openId;
        /**
         * 评论内容
         * <p> 示例值：ok
         */
        this.comment = builder.comment;
        /**
         * 1564590532967
         * <p> 示例值：评论时间
         */
        this.createTime = builder.createTime;
        /**
         * 评论附件
         * <p> 示例值：
         */
        this.files = builder.files;
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

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOpenId() {
        return this.openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public File[] getFiles() {
        return this.files;
    }

    public void setFiles(File[] files) {
        this.files = files;
    }

    public static class Builder {
        /**
         * 评论 id
         * <p> 示例值：1234
         */
        private String id;
        /**
         * 发表评论用户
         * <p> 示例值：f7cb567e
         */
        private String userId;
        /**
         * 发表评论用户 open id
         * <p> 示例值：ou_123456
         */
        private String openId;
        /**
         * 评论内容
         * <p> 示例值：ok
         */
        private String comment;
        /**
         * 1564590532967
         * <p> 示例值：评论时间
         */
        private String createTime;
        /**
         * 评论附件
         * <p> 示例值：
         */
        private File[] files;

        /**
         * 评论 id
         * <p> 示例值：1234
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 发表评论用户
         * <p> 示例值：f7cb567e
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        /**
         * 发表评论用户 open id
         * <p> 示例值：ou_123456
         *
         * @param openId
         * @return
         */
        public Builder openId(String openId) {
            this.openId = openId;
            return this;
        }


        /**
         * 评论内容
         * <p> 示例值：ok
         *
         * @param comment
         * @return
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }


        /**
         * 1564590532967
         * <p> 示例值：评论时间
         *
         * @param createTime
         * @return
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }


        /**
         * 评论附件
         * <p> 示例值：
         *
         * @param files
         * @return
         */
        public Builder files(File[] files) {
            this.files = files;
            return this;
        }


        public InstanceComment build() {
            return new InstanceComment(this);
        }
    }
}
