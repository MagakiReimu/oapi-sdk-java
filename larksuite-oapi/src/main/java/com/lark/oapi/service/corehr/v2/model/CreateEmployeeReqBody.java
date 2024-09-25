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

import com.google.gson.annotations.SerializedName;

public class CreateEmployeeReqBody {
    /**
     * 个人信息
     * <p> 示例值：
     */
    @SerializedName("personal_info")
    private ProfileSettingPersonalInfo personalInfo;
    /**
     * 工作信息
     * <p> 示例值：
     */
    @SerializedName("employment_info")
    private ProfileSettingEmploymentInfo employmentInfo;
    /**
     * 履历信息
     * <p> 示例值：
     */
    @SerializedName("career")
    private ProfileSettingCareer career;
    /**
     * 资料附件
     * <p> 示例值：
     */
    @SerializedName("data_attachment")
    private ProfileSettingDataAttachment dataAttachment;

    // builder 开始
    public CreateEmployeeReqBody() {
    }

    public CreateEmployeeReqBody(Builder builder) {
        /**
         * 个人信息
         * <p> 示例值：
         */
        this.personalInfo = builder.personalInfo;
        /**
         * 工作信息
         * <p> 示例值：
         */
        this.employmentInfo = builder.employmentInfo;
        /**
         * 履历信息
         * <p> 示例值：
         */
        this.career = builder.career;
        /**
         * 资料附件
         * <p> 示例值：
         */
        this.dataAttachment = builder.dataAttachment;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public ProfileSettingPersonalInfo getPersonalInfo() {
        return this.personalInfo;
    }

    public void setPersonalInfo(ProfileSettingPersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public ProfileSettingEmploymentInfo getEmploymentInfo() {
        return this.employmentInfo;
    }

    public void setEmploymentInfo(ProfileSettingEmploymentInfo employmentInfo) {
        this.employmentInfo = employmentInfo;
    }

    public ProfileSettingCareer getCareer() {
        return this.career;
    }

    public void setCareer(ProfileSettingCareer career) {
        this.career = career;
    }

    public ProfileSettingDataAttachment getDataAttachment() {
        return this.dataAttachment;
    }

    public void setDataAttachment(ProfileSettingDataAttachment dataAttachment) {
        this.dataAttachment = dataAttachment;
    }

    public static class Builder {
        /**
         * 个人信息
         * <p> 示例值：
         */
        private ProfileSettingPersonalInfo personalInfo;
        /**
         * 工作信息
         * <p> 示例值：
         */
        private ProfileSettingEmploymentInfo employmentInfo;
        /**
         * 履历信息
         * <p> 示例值：
         */
        private ProfileSettingCareer career;
        /**
         * 资料附件
         * <p> 示例值：
         */
        private ProfileSettingDataAttachment dataAttachment;

        /**
         * 个人信息
         * <p> 示例值：
         *
         * @param personalInfo
         * @return
         */
        public Builder personalInfo(ProfileSettingPersonalInfo personalInfo) {
            this.personalInfo = personalInfo;
            return this;
        }


        /**
         * 工作信息
         * <p> 示例值：
         *
         * @param employmentInfo
         * @return
         */
        public Builder employmentInfo(ProfileSettingEmploymentInfo employmentInfo) {
            this.employmentInfo = employmentInfo;
            return this;
        }


        /**
         * 履历信息
         * <p> 示例值：
         *
         * @param career
         * @return
         */
        public Builder career(ProfileSettingCareer career) {
            this.career = career;
            return this;
        }


        /**
         * 资料附件
         * <p> 示例值：
         *
         * @param dataAttachment
         * @return
         */
        public Builder dataAttachment(ProfileSettingDataAttachment dataAttachment) {
            this.dataAttachment = dataAttachment;
            return this;
        }


        public CreateEmployeeReqBody build() {
            return new CreateEmployeeReqBody(this);
        }
    }
}
