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

import com.lark.oapi.core.response.EmptyData;
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

public class RewardCandidate {
    /**
     * 投递 ID
     * <p> 示例值：7169521778904221965
     */
    @SerializedName("application_id")
    private String applicationId;
    /**
     * 人才 ID
     * <p> 示例值：7169521778904221965
     */
    @SerializedName("talent_id")
    private String talentId;
    /**
     * 候选人名称
     * <p> 示例值：张三
     */
    @SerializedName("name")
    private String name;

    // builder 开始
    public RewardCandidate() {
    }

    public RewardCandidate(Builder builder) {
        /**
         * 投递 ID
         * <p> 示例值：7169521778904221965
         */
        this.applicationId = builder.applicationId;
        /**
         * 人才 ID
         * <p> 示例值：7169521778904221965
         */
        this.talentId = builder.talentId;
        /**
         * 候选人名称
         * <p> 示例值：张三
         */
        this.name = builder.name;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getTalentId() {
        return this.talentId;
    }

    public void setTalentId(String talentId) {
        this.talentId = talentId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class Builder {
        /**
         * 投递 ID
         * <p> 示例值：7169521778904221965
         */
        private String applicationId;
        /**
         * 人才 ID
         * <p> 示例值：7169521778904221965
         */
        private String talentId;
        /**
         * 候选人名称
         * <p> 示例值：张三
         */
        private String name;

        /**
         * 投递 ID
         * <p> 示例值：7169521778904221965
         *
         * @param applicationId
         * @return
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }


        /**
         * 人才 ID
         * <p> 示例值：7169521778904221965
         *
         * @param talentId
         * @return
         */
        public Builder talentId(String talentId) {
            this.talentId = talentId;
            return this;
        }


        /**
         * 候选人名称
         * <p> 示例值：张三
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        public RewardCandidate build() {
            return new RewardCandidate(this);
        }
    }
}
