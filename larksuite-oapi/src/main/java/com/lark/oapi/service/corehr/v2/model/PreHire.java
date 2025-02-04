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
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class PreHire {
    /**
     * 个人信息
     * <p> 示例值：
     */
    @SerializedName("person_info")
    private PersonInfo personInfo;
    /**
     * 工作信息
     * <p> 示例值：
     */
    @SerializedName("employment_info")
    private PreHireEmploymentInfo employmentInfo;
    /**
     * 入职信息
     * <p> 示例值：
     */
    @SerializedName("onboarding_info")
    private PreHireOnboardingInfo onboardingInfo;
    /**
     * 试用期信息
     * <p> 示例值：
     */
    @SerializedName("probation_info")
    private PreHireProbationInfo probationInfo;
    /**
     * 合同信息
     * <p> 示例值：
     */
    @SerializedName("contract_info")
    private PreHireContractInfo contractInfo;
    /**
     * 待入职 id
     * <p> 示例值：7032210902531327521
     */
    @SerializedName("pre_hire_id")
    private String preHireId;

    // builder 开始
    public PreHire() {
    }

    public PreHire(Builder builder) {
        /**
         * 个人信息
         * <p> 示例值：
         */
        this.personInfo = builder.personInfo;
        /**
         * 工作信息
         * <p> 示例值：
         */
        this.employmentInfo = builder.employmentInfo;
        /**
         * 入职信息
         * <p> 示例值：
         */
        this.onboardingInfo = builder.onboardingInfo;
        /**
         * 试用期信息
         * <p> 示例值：
         */
        this.probationInfo = builder.probationInfo;
        /**
         * 合同信息
         * <p> 示例值：
         */
        this.contractInfo = builder.contractInfo;
        /**
         * 待入职 id
         * <p> 示例值：7032210902531327521
         */
        this.preHireId = builder.preHireId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public PersonInfo getPersonInfo() {
        return this.personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }

    public PreHireEmploymentInfo getEmploymentInfo() {
        return this.employmentInfo;
    }

    public void setEmploymentInfo(PreHireEmploymentInfo employmentInfo) {
        this.employmentInfo = employmentInfo;
    }

    public PreHireOnboardingInfo getOnboardingInfo() {
        return this.onboardingInfo;
    }

    public void setOnboardingInfo(PreHireOnboardingInfo onboardingInfo) {
        this.onboardingInfo = onboardingInfo;
    }

    public PreHireProbationInfo getProbationInfo() {
        return this.probationInfo;
    }

    public void setProbationInfo(PreHireProbationInfo probationInfo) {
        this.probationInfo = probationInfo;
    }

    public PreHireContractInfo getContractInfo() {
        return this.contractInfo;
    }

    public void setContractInfo(PreHireContractInfo contractInfo) {
        this.contractInfo = contractInfo;
    }

    public String getPreHireId() {
        return this.preHireId;
    }

    public void setPreHireId(String preHireId) {
        this.preHireId = preHireId;
    }

    public static class Builder {
        /**
         * 个人信息
         * <p> 示例值：
         */
        private PersonInfo personInfo;
        /**
         * 工作信息
         * <p> 示例值：
         */
        private PreHireEmploymentInfo employmentInfo;
        /**
         * 入职信息
         * <p> 示例值：
         */
        private PreHireOnboardingInfo onboardingInfo;
        /**
         * 试用期信息
         * <p> 示例值：
         */
        private PreHireProbationInfo probationInfo;
        /**
         * 合同信息
         * <p> 示例值：
         */
        private PreHireContractInfo contractInfo;
        /**
         * 待入职 id
         * <p> 示例值：7032210902531327521
         */
        private String preHireId;

        /**
         * 个人信息
         * <p> 示例值：
         *
         * @param personInfo
         * @return
         */
        public Builder personInfo(PersonInfo personInfo) {
            this.personInfo = personInfo;
            return this;
        }


        /**
         * 工作信息
         * <p> 示例值：
         *
         * @param employmentInfo
         * @return
         */
        public Builder employmentInfo(PreHireEmploymentInfo employmentInfo) {
            this.employmentInfo = employmentInfo;
            return this;
        }


        /**
         * 入职信息
         * <p> 示例值：
         *
         * @param onboardingInfo
         * @return
         */
        public Builder onboardingInfo(PreHireOnboardingInfo onboardingInfo) {
            this.onboardingInfo = onboardingInfo;
            return this;
        }


        /**
         * 试用期信息
         * <p> 示例值：
         *
         * @param probationInfo
         * @return
         */
        public Builder probationInfo(PreHireProbationInfo probationInfo) {
            this.probationInfo = probationInfo;
            return this;
        }


        /**
         * 合同信息
         * <p> 示例值：
         *
         * @param contractInfo
         * @return
         */
        public Builder contractInfo(PreHireContractInfo contractInfo) {
            this.contractInfo = contractInfo;
            return this;
        }


        /**
         * 待入职 id
         * <p> 示例值：7032210902531327521
         *
         * @param preHireId
         * @return
         */
        public Builder preHireId(String preHireId) {
            this.preHireId = preHireId;
            return this;
        }


        public PreHire build() {
            return new PreHire(this);
        }
    }
}
