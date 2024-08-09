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

public class ApplicationDetailInfo {
    /**
     * 投递基本信息
     * <p> 示例值：
     */
    @SerializedName("basic_info")
    private ApplicationDetailBasicInfo basicInfo;
    /**
     * 投递职位信息
     * <p> 示例值：
     */
    @SerializedName("job")
    private JobBasicInfo job;
    /**
     * 投递人才信息
     * <p> 示例值：
     */
    @SerializedName("talent")
    private TalentBasicInfoV2 talent;
    /**
     * 投递评估信息
     * <p> 示例值：
     */
    @SerializedName("evaluations")
    private Evaluation[] evaluations;
    /**
     * 投递面试信息
     * <p> 示例值：
     */
    @SerializedName("interview_aggregation")
    private InterviewAggregation interviewAggregation;
    /**
     * 投递 Offer 信息
     * <p> 示例值：
     */
    @SerializedName("offer")
    private OfferInfoV2 offer;
    /**
     * 投递员工入转离信息
     * <p> 示例值：
     */
    @SerializedName("employee")
    private EmployeeV2 employee;
    /**
     * 投递猎头推荐信息
     * <p> 示例值：
     */
    @SerializedName("agency")
    private AgencyInfo agency;
    /**
     * 投递官网信息
     * <p> 示例值：
     */
    @SerializedName("portal")
    private ApplicationDetailPortalInfo portal;
    /**
     * 投递内推信息
     * <p> 示例值：
     */
    @SerializedName("referral")
    private ReferralInfoV2 referral;

    // builder 开始
    public ApplicationDetailInfo() {
    }

    public ApplicationDetailInfo(Builder builder) {
        /**
         * 投递基本信息
         * <p> 示例值：
         */
        this.basicInfo = builder.basicInfo;
        /**
         * 投递职位信息
         * <p> 示例值：
         */
        this.job = builder.job;
        /**
         * 投递人才信息
         * <p> 示例值：
         */
        this.talent = builder.talent;
        /**
         * 投递评估信息
         * <p> 示例值：
         */
        this.evaluations = builder.evaluations;
        /**
         * 投递面试信息
         * <p> 示例值：
         */
        this.interviewAggregation = builder.interviewAggregation;
        /**
         * 投递 Offer 信息
         * <p> 示例值：
         */
        this.offer = builder.offer;
        /**
         * 投递员工入转离信息
         * <p> 示例值：
         */
        this.employee = builder.employee;
        /**
         * 投递猎头推荐信息
         * <p> 示例值：
         */
        this.agency = builder.agency;
        /**
         * 投递官网信息
         * <p> 示例值：
         */
        this.portal = builder.portal;
        /**
         * 投递内推信息
         * <p> 示例值：
         */
        this.referral = builder.referral;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public ApplicationDetailBasicInfo getBasicInfo() {
        return this.basicInfo;
    }

    public void setBasicInfo(ApplicationDetailBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }

    public JobBasicInfo getJob() {
        return this.job;
    }

    public void setJob(JobBasicInfo job) {
        this.job = job;
    }

    public TalentBasicInfoV2 getTalent() {
        return this.talent;
    }

    public void setTalent(TalentBasicInfoV2 talent) {
        this.talent = talent;
    }

    public Evaluation[] getEvaluations() {
        return this.evaluations;
    }

    public void setEvaluations(Evaluation[] evaluations) {
        this.evaluations = evaluations;
    }

    public InterviewAggregation getInterviewAggregation() {
        return this.interviewAggregation;
    }

    public void setInterviewAggregation(InterviewAggregation interviewAggregation) {
        this.interviewAggregation = interviewAggregation;
    }

    public OfferInfoV2 getOffer() {
        return this.offer;
    }

    public void setOffer(OfferInfoV2 offer) {
        this.offer = offer;
    }

    public EmployeeV2 getEmployee() {
        return this.employee;
    }

    public void setEmployee(EmployeeV2 employee) {
        this.employee = employee;
    }

    public AgencyInfo getAgency() {
        return this.agency;
    }

    public void setAgency(AgencyInfo agency) {
        this.agency = agency;
    }

    public ApplicationDetailPortalInfo getPortal() {
        return this.portal;
    }

    public void setPortal(ApplicationDetailPortalInfo portal) {
        this.portal = portal;
    }

    public ReferralInfoV2 getReferral() {
        return this.referral;
    }

    public void setReferral(ReferralInfoV2 referral) {
        this.referral = referral;
    }

    public static class Builder {
        /**
         * 投递基本信息
         * <p> 示例值：
         */
        private ApplicationDetailBasicInfo basicInfo;
        /**
         * 投递职位信息
         * <p> 示例值：
         */
        private JobBasicInfo job;
        /**
         * 投递人才信息
         * <p> 示例值：
         */
        private TalentBasicInfoV2 talent;
        /**
         * 投递评估信息
         * <p> 示例值：
         */
        private Evaluation[] evaluations;
        /**
         * 投递面试信息
         * <p> 示例值：
         */
        private InterviewAggregation interviewAggregation;
        /**
         * 投递 Offer 信息
         * <p> 示例值：
         */
        private OfferInfoV2 offer;
        /**
         * 投递员工入转离信息
         * <p> 示例值：
         */
        private EmployeeV2 employee;
        /**
         * 投递猎头推荐信息
         * <p> 示例值：
         */
        private AgencyInfo agency;
        /**
         * 投递官网信息
         * <p> 示例值：
         */
        private ApplicationDetailPortalInfo portal;
        /**
         * 投递内推信息
         * <p> 示例值：
         */
        private ReferralInfoV2 referral;

        /**
         * 投递基本信息
         * <p> 示例值：
         *
         * @param basicInfo
         * @return
         */
        public Builder basicInfo(ApplicationDetailBasicInfo basicInfo) {
            this.basicInfo = basicInfo;
            return this;
        }


        /**
         * 投递职位信息
         * <p> 示例值：
         *
         * @param job
         * @return
         */
        public Builder job(JobBasicInfo job) {
            this.job = job;
            return this;
        }


        /**
         * 投递人才信息
         * <p> 示例值：
         *
         * @param talent
         * @return
         */
        public Builder talent(TalentBasicInfoV2 talent) {
            this.talent = talent;
            return this;
        }


        /**
         * 投递评估信息
         * <p> 示例值：
         *
         * @param evaluations
         * @return
         */
        public Builder evaluations(Evaluation[] evaluations) {
            this.evaluations = evaluations;
            return this;
        }


        /**
         * 投递面试信息
         * <p> 示例值：
         *
         * @param interviewAggregation
         * @return
         */
        public Builder interviewAggregation(InterviewAggregation interviewAggregation) {
            this.interviewAggregation = interviewAggregation;
            return this;
        }


        /**
         * 投递 Offer 信息
         * <p> 示例值：
         *
         * @param offer
         * @return
         */
        public Builder offer(OfferInfoV2 offer) {
            this.offer = offer;
            return this;
        }


        /**
         * 投递员工入转离信息
         * <p> 示例值：
         *
         * @param employee
         * @return
         */
        public Builder employee(EmployeeV2 employee) {
            this.employee = employee;
            return this;
        }


        /**
         * 投递猎头推荐信息
         * <p> 示例值：
         *
         * @param agency
         * @return
         */
        public Builder agency(AgencyInfo agency) {
            this.agency = agency;
            return this;
        }


        /**
         * 投递官网信息
         * <p> 示例值：
         *
         * @param portal
         * @return
         */
        public Builder portal(ApplicationDetailPortalInfo portal) {
            this.portal = portal;
            return this;
        }


        /**
         * 投递内推信息
         * <p> 示例值：
         *
         * @param referral
         * @return
         */
        public Builder referral(ReferralInfoV2 referral) {
            this.referral = referral;
            return this;
        }


        public ApplicationDetailInfo build() {
            return new ApplicationDetailInfo(this);
        }
    }
}
