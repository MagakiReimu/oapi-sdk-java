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
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class GetByTalentInterviewReq {
    /**
     * 人才 ID
     * <p> 示例值：6949805467799537964
     */
    @Query
    @SerializedName("talent_id")
    private String talentId;
    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 此次调用中使用的「职级 ID」的类型
     * <p> 示例值：
     */
    @Query
    @SerializedName("job_level_id_type")
    private String jobLevelIdType;

    // builder 开始
    public GetByTalentInterviewReq() {
    }

    public GetByTalentInterviewReq(Builder builder) {
        /**
         * 人才 ID
         * <p> 示例值：6949805467799537964
         */
        this.talentId = builder.talentId;
        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         */
        this.userIdType = builder.userIdType;
        /**
         * 此次调用中使用的「职级 ID」的类型
         * <p> 示例值：
         */
        this.jobLevelIdType = builder.jobLevelIdType;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getTalentId() {
        return this.talentId;
    }

    public void setTalentId(String talentId) {
        this.talentId = talentId;
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public String getJobLevelIdType() {
        return this.jobLevelIdType;
    }

    public void setJobLevelIdType(String jobLevelIdType) {
        this.jobLevelIdType = jobLevelIdType;
    }

    public static class Builder {
        private String talentId; // 人才 ID
        private String userIdType; // 此次调用中使用的用户ID的类型
        private String jobLevelIdType; // 此次调用中使用的「职级 ID」的类型

        /**
         * 人才 ID
         * <p> 示例值：6949805467799537964
         *
         * @param talentId
         * @return
         */
        public Builder talentId(String talentId) {
            this.talentId = talentId;
            return this;
        }


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
         * 此次调用中使用的「职级 ID」的类型
         * <p> 示例值：
         *
         * @param jobLevelIdType
         * @return
         */
        public Builder jobLevelIdType(String jobLevelIdType) {
            this.jobLevelIdType = jobLevelIdType;
            return this;
        }


        public GetByTalentInterviewReq build() {
            return new GetByTalentInterviewReq(this);
        }
    }
}
