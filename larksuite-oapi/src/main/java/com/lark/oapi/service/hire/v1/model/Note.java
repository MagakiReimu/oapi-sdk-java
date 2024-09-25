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

package com.lark.oapi.service.hire.v1.model;

import com.google.gson.annotations.SerializedName;

public class Note {
    /**
     * 备注ID
     * <p> 示例值：6949805467799537964
     */
    @SerializedName("id")
    private String id;
    /**
     * 人才ID
     * <p> 示例值：6916472453069883661
     */
    @SerializedName("talent_id")
    private String talentId;
    /**
     * 投递ID
     * <p> 示例值：6891565253964859661
     */
    @SerializedName("application_id")
    private String applicationId;
    /**
     * 是否私密
     * <p> 示例值：false
     */
    @SerializedName("is_private")
    private Boolean isPrivate;
    /**
     * 创建时间
     * <p> 示例值：1618209327096
     */
    @SerializedName("create_time")
    private Integer createTime;
    /**
     * 更新时间
     * <p> 示例值：1618209327096
     */
    @SerializedName("modify_time")
    private Integer modifyTime;
    /**
     * 创建人ID
     * <p> 示例值：ou_f476cb099ac9227c9bae09ce46112579
     */
    @SerializedName("creator_id")
    private String creatorId;
    /**
     * 内容
     * <p> 示例值：测试
     */
    @SerializedName("content")
    private String content;
    /**
     * 备注私密属性（默认为公开）
     * <p> 示例值：1
     */
    @SerializedName("privacy")
    private Integer privacy;
    /**
     * 是否通知被@的用户
     * <p> 示例值：false
     */
    @SerializedName("notify_mentioned_user")
    private Boolean notifyMentionedUser;
    /**
     * 被@用户列表
     * <p> 示例值：
     */
    @SerializedName("mention_entity_list")
    private MentionEntity[] mentionEntityList;

    // builder 开始
    public Note() {
    }

    public Note(Builder builder) {
        /**
         * 备注ID
         * <p> 示例值：6949805467799537964
         */
        this.id = builder.id;
        /**
         * 人才ID
         * <p> 示例值：6916472453069883661
         */
        this.talentId = builder.talentId;
        /**
         * 投递ID
         * <p> 示例值：6891565253964859661
         */
        this.applicationId = builder.applicationId;
        /**
         * 是否私密
         * <p> 示例值：false
         */
        this.isPrivate = builder.isPrivate;
        /**
         * 创建时间
         * <p> 示例值：1618209327096
         */
        this.createTime = builder.createTime;
        /**
         * 更新时间
         * <p> 示例值：1618209327096
         */
        this.modifyTime = builder.modifyTime;
        /**
         * 创建人ID
         * <p> 示例值：ou_f476cb099ac9227c9bae09ce46112579
         */
        this.creatorId = builder.creatorId;
        /**
         * 内容
         * <p> 示例值：测试
         */
        this.content = builder.content;
        /**
         * 备注私密属性（默认为公开）
         * <p> 示例值：1
         */
        this.privacy = builder.privacy;
        /**
         * 是否通知被@的用户
         * <p> 示例值：false
         */
        this.notifyMentionedUser = builder.notifyMentionedUser;
        /**
         * 被@用户列表
         * <p> 示例值：
         */
        this.mentionEntityList = builder.mentionEntityList;
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

    public String getTalentId() {
        return this.talentId;
    }

    public void setTalentId(String talentId) {
        this.talentId = talentId;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public Boolean getIsPrivate() {
        return this.isPrivate;
    }

    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public Integer getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getModifyTime() {
        return this.modifyTime;
    }

    public void setModifyTime(Integer modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getCreatorId() {
        return this.creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getPrivacy() {
        return this.privacy;
    }

    public void setPrivacy(Integer privacy) {
        this.privacy = privacy;
    }

    public Boolean getNotifyMentionedUser() {
        return this.notifyMentionedUser;
    }

    public void setNotifyMentionedUser(Boolean notifyMentionedUser) {
        this.notifyMentionedUser = notifyMentionedUser;
    }

    public MentionEntity[] getMentionEntityList() {
        return this.mentionEntityList;
    }

    public void setMentionEntityList(MentionEntity[] mentionEntityList) {
        this.mentionEntityList = mentionEntityList;
    }

    public static class Builder {
        /**
         * 备注ID
         * <p> 示例值：6949805467799537964
         */
        private String id;
        /**
         * 人才ID
         * <p> 示例值：6916472453069883661
         */
        private String talentId;
        /**
         * 投递ID
         * <p> 示例值：6891565253964859661
         */
        private String applicationId;
        /**
         * 是否私密
         * <p> 示例值：false
         */
        private Boolean isPrivate;
        /**
         * 创建时间
         * <p> 示例值：1618209327096
         */
        private Integer createTime;
        /**
         * 更新时间
         * <p> 示例值：1618209327096
         */
        private Integer modifyTime;
        /**
         * 创建人ID
         * <p> 示例值：ou_f476cb099ac9227c9bae09ce46112579
         */
        private String creatorId;
        /**
         * 内容
         * <p> 示例值：测试
         */
        private String content;
        /**
         * 备注私密属性（默认为公开）
         * <p> 示例值：1
         */
        private Integer privacy;
        /**
         * 是否通知被@的用户
         * <p> 示例值：false
         */
        private Boolean notifyMentionedUser;
        /**
         * 被@用户列表
         * <p> 示例值：
         */
        private MentionEntity[] mentionEntityList;

        /**
         * 备注ID
         * <p> 示例值：6949805467799537964
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 人才ID
         * <p> 示例值：6916472453069883661
         *
         * @param talentId
         * @return
         */
        public Builder talentId(String talentId) {
            this.talentId = talentId;
            return this;
        }


        /**
         * 投递ID
         * <p> 示例值：6891565253964859661
         *
         * @param applicationId
         * @return
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }


        /**
         * 是否私密
         * <p> 示例值：false
         *
         * @param isPrivate
         * @return
         */
        public Builder isPrivate(Boolean isPrivate) {
            this.isPrivate = isPrivate;
            return this;
        }


        /**
         * 创建时间
         * <p> 示例值：1618209327096
         *
         * @param createTime
         * @return
         */
        public Builder createTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }


        /**
         * 更新时间
         * <p> 示例值：1618209327096
         *
         * @param modifyTime
         * @return
         */
        public Builder modifyTime(Integer modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }


        /**
         * 创建人ID
         * <p> 示例值：ou_f476cb099ac9227c9bae09ce46112579
         *
         * @param creatorId
         * @return
         */
        public Builder creatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }


        /**
         * 内容
         * <p> 示例值：测试
         *
         * @param content
         * @return
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }


        /**
         * 备注私密属性（默认为公开）
         * <p> 示例值：1
         *
         * @param privacy
         * @return
         */
        public Builder privacy(Integer privacy) {
            this.privacy = privacy;
            return this;
        }


        /**
         * 是否通知被@的用户
         * <p> 示例值：false
         *
         * @param notifyMentionedUser
         * @return
         */
        public Builder notifyMentionedUser(Boolean notifyMentionedUser) {
            this.notifyMentionedUser = notifyMentionedUser;
            return this;
        }


        /**
         * 被@用户列表
         * <p> 示例值：
         *
         * @param mentionEntityList
         * @return
         */
        public Builder mentionEntityList(MentionEntity[] mentionEntityList) {
            this.mentionEntityList = mentionEntityList;
            return this;
        }


        public Note build() {
            return new Note(this);
        }
    }
}
