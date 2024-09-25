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

package com.lark.oapi.service.moments.v1.model;

import com.google.gson.annotations.SerializedName;

public class Category {
    /**
     * 板块的ID
     * <p> 示例值：6560906191909683220
     */
    @SerializedName("id")
    private String id;
    /**
     * 板块名
     * <p> 示例值：示例板块
     */
    @SerializedName("name")
    private String name;
    /**
     * 板块描述
     * <p> 示例值：一个有趣的板块描述
     */
    @SerializedName("description")
    private String description;
    /**
     * 板块创建时间
     * <p> 示例值：2022-05-23T00:00:00+08:00
     */
    @SerializedName("create_time")
    private String createTime;
    /**
     * 板块下帖子总数
     * <p> 示例值：5
     */
    @SerializedName("post_count")
    private Integer postCount;
    /**
     * 板块参与人数
     * <p> 示例值：10
     */
    @SerializedName("participant_count")
    private Integer participantCount;

    // builder 开始
    public Category() {
    }

    public Category(Builder builder) {
        /**
         * 板块的ID
         * <p> 示例值：6560906191909683220
         */
        this.id = builder.id;
        /**
         * 板块名
         * <p> 示例值：示例板块
         */
        this.name = builder.name;
        /**
         * 板块描述
         * <p> 示例值：一个有趣的板块描述
         */
        this.description = builder.description;
        /**
         * 板块创建时间
         * <p> 示例值：2022-05-23T00:00:00+08:00
         */
        this.createTime = builder.createTime;
        /**
         * 板块下帖子总数
         * <p> 示例值：5
         */
        this.postCount = builder.postCount;
        /**
         * 板块参与人数
         * <p> 示例值：10
         */
        this.participantCount = builder.participantCount;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getPostCount() {
        return this.postCount;
    }

    public void setPostCount(Integer postCount) {
        this.postCount = postCount;
    }

    public Integer getParticipantCount() {
        return this.participantCount;
    }

    public void setParticipantCount(Integer participantCount) {
        this.participantCount = participantCount;
    }

    public static class Builder {
        /**
         * 板块的ID
         * <p> 示例值：6560906191909683220
         */
        private String id;
        /**
         * 板块名
         * <p> 示例值：示例板块
         */
        private String name;
        /**
         * 板块描述
         * <p> 示例值：一个有趣的板块描述
         */
        private String description;
        /**
         * 板块创建时间
         * <p> 示例值：2022-05-23T00:00:00+08:00
         */
        private String createTime;
        /**
         * 板块下帖子总数
         * <p> 示例值：5
         */
        private Integer postCount;
        /**
         * 板块参与人数
         * <p> 示例值：10
         */
        private Integer participantCount;

        /**
         * 板块的ID
         * <p> 示例值：6560906191909683220
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 板块名
         * <p> 示例值：示例板块
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 板块描述
         * <p> 示例值：一个有趣的板块描述
         *
         * @param description
         * @return
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }


        /**
         * 板块创建时间
         * <p> 示例值：2022-05-23T00:00:00+08:00
         *
         * @param createTime
         * @return
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }


        /**
         * 板块下帖子总数
         * <p> 示例值：5
         *
         * @param postCount
         * @return
         */
        public Builder postCount(Integer postCount) {
            this.postCount = postCount;
            return this;
        }


        /**
         * 板块参与人数
         * <p> 示例值：10
         *
         * @param participantCount
         * @return
         */
        public Builder participantCount(Integer participantCount) {
            this.participantCount = participantCount;
            return this;
        }


        public Category build() {
            return new Category(this);
        }
    }
}
