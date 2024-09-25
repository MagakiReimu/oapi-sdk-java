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

public class Reaction {
    /**
     * reaction 类型
     * <p> 示例值："OK"
     */
    @SerializedName("type")
    private String type;
    /**
     * reaction 所属用户ID
     * <p> 示例值："ou_xxxxx"
     */
    @SerializedName("user_id")
    private String userId;
    /**
     * reaction 所属实体ID
     * <p> 示例值："248381241"
     */
    @SerializedName("entity_id")
    private String entityId;
    /**
     * Reaction的ID
     * <p> 示例值："248381243"
     */
    @SerializedName("id")
    private String id;
    /**
     * reaction创建时间
     * <p> 示例值："2022-05-23T00:00:00+08:00"
     */
    @SerializedName("create_time")
    private String createTime;
    /**
     * 表情回复所属实体类型
     * <p> 示例值：1
     */
    @SerializedName("entity_type")
    private Integer entityType;
    /**
     * 表情回复人类型
     * <p> 示例值：1
     */
    @SerializedName("user_type")
    private Integer userType;

    // builder 开始
    public Reaction() {
    }

    public Reaction(Builder builder) {
        /**
         * reaction 类型
         * <p> 示例值："OK"
         */
        this.type = builder.type;
        /**
         * reaction 所属用户ID
         * <p> 示例值："ou_xxxxx"
         */
        this.userId = builder.userId;
        /**
         * reaction 所属实体ID
         * <p> 示例值："248381241"
         */
        this.entityId = builder.entityId;
        /**
         * Reaction的ID
         * <p> 示例值："248381243"
         */
        this.id = builder.id;
        /**
         * reaction创建时间
         * <p> 示例值："2022-05-23T00:00:00+08:00"
         */
        this.createTime = builder.createTime;
        /**
         * 表情回复所属实体类型
         * <p> 示例值：1
         */
        this.entityType = builder.entityType;
        /**
         * 表情回复人类型
         * <p> 示例值：1
         */
        this.userType = builder.userType;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEntityId() {
        return this.entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getEntityType() {
        return this.entityType;
    }

    public void setEntityType(Integer entityType) {
        this.entityType = entityType;
    }

    public Integer getUserType() {
        return this.userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public static class Builder {
        /**
         * reaction 类型
         * <p> 示例值："OK"
         */
        private String type;
        /**
         * reaction 所属用户ID
         * <p> 示例值："ou_xxxxx"
         */
        private String userId;
        /**
         * reaction 所属实体ID
         * <p> 示例值："248381241"
         */
        private String entityId;
        /**
         * Reaction的ID
         * <p> 示例值："248381243"
         */
        private String id;
        /**
         * reaction创建时间
         * <p> 示例值："2022-05-23T00:00:00+08:00"
         */
        private String createTime;
        /**
         * 表情回复所属实体类型
         * <p> 示例值：1
         */
        private Integer entityType;
        /**
         * 表情回复人类型
         * <p> 示例值：1
         */
        private Integer userType;

        /**
         * reaction 类型
         * <p> 示例值："OK"
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }


        /**
         * reaction 所属用户ID
         * <p> 示例值："ou_xxxxx"
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        /**
         * reaction 所属实体ID
         * <p> 示例值："248381241"
         *
         * @param entityId
         * @return
         */
        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }


        /**
         * Reaction的ID
         * <p> 示例值："248381243"
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * reaction创建时间
         * <p> 示例值："2022-05-23T00:00:00+08:00"
         *
         * @param createTime
         * @return
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }


        /**
         * 表情回复所属实体类型
         * <p> 示例值：1
         *
         * @param entityType
         * @return
         */
        public Builder entityType(Integer entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * 表情回复所属实体类型
         * <p> 示例值：1
         *
         * @param entityType {@link com.lark.oapi.service.moments.v1.enums.ReactionEntityTypeEnum}
         * @return
         */
        public Builder entityType(com.lark.oapi.service.moments.v1.enums.ReactionEntityTypeEnum entityType) {
            this.entityType = entityType.getValue();
            return this;
        }


        /**
         * 表情回复人类型
         * <p> 示例值：1
         *
         * @param userType
         * @return
         */
        public Builder userType(Integer userType) {
            this.userType = userType;
            return this;
        }

        /**
         * 表情回复人类型
         * <p> 示例值：1
         *
         * @param userType {@link com.lark.oapi.service.moments.v1.enums.ReactionUserTypeEnum}
         * @return
         */
        public Builder userType(com.lark.oapi.service.moments.v1.enums.ReactionUserTypeEnum userType) {
            this.userType = userType.getValue();
            return this;
        }


        public Reaction build() {
            return new Reaction(this);
        }
    }
}
