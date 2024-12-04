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

public class OfferBasicInfo {
    /**
     * 部门 ID
     * <p> 示例值：od-6b394871807047c7023ebfc1ff37cd3a
     */
    @SerializedName("department_id")
    private String departmentId;
    /**
     * 直属上级 ID
     * <p> 示例值：ou_ce613028fe74745421f5dc320bb9c709
     */
    @SerializedName("leader_user_id")
    private String leaderUserId;
    /**
     * 职务 ID
     * <p> 示例值：123
     */
    @SerializedName("employment_job_id")
    private String employmentJobId;
    /**
     * 人员类型 ID
     * <p> 示例值：2
     */
    @SerializedName("employee_type_id")
    private String employeeTypeId;
    /**
     * 职位序列 ID
     * <p> 示例值：6807407987381831949
     */
    @SerializedName("job_family_id")
    private String jobFamilyId;
    /**
     * 职位级别 ID
     * <p> 示例值：6807407987381881101
     */
    @SerializedName("job_level_id")
    private String jobLevelId;
    /**
     * 试用期
     * <p> 示例值：3
     */
    @SerializedName("probation_month")
    private Integer probationMonth;
    /**
     * 合同期
     * <p> 示例值：3
     */
    @SerializedName("contract_year")
    private Integer contractYear;
    /**
     * 合同期（年/月）
     * <p> 示例值：
     */
    @SerializedName("contract_period")
    private ContractPeriodInfo contractPeriod;
    /**
     * 预计入职日期
     * <p> 示例值：{"date":"2022-04-07"}
     */
    @SerializedName("expected_onboard_date")
    private String expectedOnboardDate;
    /**
     * 入职地点 ID
     * <p> 示例值：6897079709306259719
     */
    @SerializedName("onboard_address_id")
    private String onboardAddressId;
    /**
     * 办公地点 ID
     * <p> 示例值：6897079709306259719
     */
    @SerializedName("work_address_id")
    private String workAddressId;
    /**
     * Offer负责人 ID
     * <p> 示例值：ou_ce613028fe74745421f5dc320bb9c709
     */
    @SerializedName("owner_user_id")
    private String ownerUserId;
    /**
     * Offer 推荐语
     * <p> 示例值：十分优秀，推荐入职
     */
    @SerializedName("recommended_words")
    private String recommendedWords;
    /**
     * 招聘需求 ID
     * <p> 示例值：2342352224
     */
    @SerializedName("job_requirement_id")
    private String jobRequirementId;
    /**
     * 招聘流程类型 ID
     * <p> 示例值：2
     */
    @SerializedName("job_process_type_id")
    private Integer jobProcessTypeId;
    /**
     * 附件ID列表
     * <p> 示例值：["7081582717280831752"]
     */
    @SerializedName("attachment_id_list")
    private String[] attachmentIdList;
    /**
     * 附件描述
     * <p> 示例值：张三的简历
     */
    @SerializedName("attachment_description")
    private String attachmentDescription;
    /**
     * Offer操作人 ID
     * <p> 示例值：ou_ce613028fe74745421f5dc320bb9c709
     */
    @SerializedName("operator_user_id")
    private String operatorUserId;
    /**
     * 岗位 ID
     * <p> 示例值：6897079709306259719
     */
    @SerializedName("position_id")
    private String positionId;
    /**
     * 入职职位
     * <p> 示例值：测试职位
     */
    @SerializedName("job_offered")
    private String jobOffered;

    // builder 开始
    public OfferBasicInfo() {
    }

    public OfferBasicInfo(Builder builder) {
        /**
         * 部门 ID
         * <p> 示例值：od-6b394871807047c7023ebfc1ff37cd3a
         */
        this.departmentId = builder.departmentId;
        /**
         * 直属上级 ID
         * <p> 示例值：ou_ce613028fe74745421f5dc320bb9c709
         */
        this.leaderUserId = builder.leaderUserId;
        /**
         * 职务 ID
         * <p> 示例值：123
         */
        this.employmentJobId = builder.employmentJobId;
        /**
         * 人员类型 ID
         * <p> 示例值：2
         */
        this.employeeTypeId = builder.employeeTypeId;
        /**
         * 职位序列 ID
         * <p> 示例值：6807407987381831949
         */
        this.jobFamilyId = builder.jobFamilyId;
        /**
         * 职位级别 ID
         * <p> 示例值：6807407987381881101
         */
        this.jobLevelId = builder.jobLevelId;
        /**
         * 试用期
         * <p> 示例值：3
         */
        this.probationMonth = builder.probationMonth;
        /**
         * 合同期
         * <p> 示例值：3
         */
        this.contractYear = builder.contractYear;
        /**
         * 合同期（年/月）
         * <p> 示例值：
         */
        this.contractPeriod = builder.contractPeriod;
        /**
         * 预计入职日期
         * <p> 示例值：{"date":"2022-04-07"}
         */
        this.expectedOnboardDate = builder.expectedOnboardDate;
        /**
         * 入职地点 ID
         * <p> 示例值：6897079709306259719
         */
        this.onboardAddressId = builder.onboardAddressId;
        /**
         * 办公地点 ID
         * <p> 示例值：6897079709306259719
         */
        this.workAddressId = builder.workAddressId;
        /**
         * Offer负责人 ID
         * <p> 示例值：ou_ce613028fe74745421f5dc320bb9c709
         */
        this.ownerUserId = builder.ownerUserId;
        /**
         * Offer 推荐语
         * <p> 示例值：十分优秀，推荐入职
         */
        this.recommendedWords = builder.recommendedWords;
        /**
         * 招聘需求 ID
         * <p> 示例值：2342352224
         */
        this.jobRequirementId = builder.jobRequirementId;
        /**
         * 招聘流程类型 ID
         * <p> 示例值：2
         */
        this.jobProcessTypeId = builder.jobProcessTypeId;
        /**
         * 附件ID列表
         * <p> 示例值：["7081582717280831752"]
         */
        this.attachmentIdList = builder.attachmentIdList;
        /**
         * 附件描述
         * <p> 示例值：张三的简历
         */
        this.attachmentDescription = builder.attachmentDescription;
        /**
         * Offer操作人 ID
         * <p> 示例值：ou_ce613028fe74745421f5dc320bb9c709
         */
        this.operatorUserId = builder.operatorUserId;
        /**
         * 岗位 ID
         * <p> 示例值：6897079709306259719
         */
        this.positionId = builder.positionId;
        /**
         * 入职职位
         * <p> 示例值：测试职位
         */
        this.jobOffered = builder.jobOffered;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getLeaderUserId() {
        return this.leaderUserId;
    }

    public void setLeaderUserId(String leaderUserId) {
        this.leaderUserId = leaderUserId;
    }

    public String getEmploymentJobId() {
        return this.employmentJobId;
    }

    public void setEmploymentJobId(String employmentJobId) {
        this.employmentJobId = employmentJobId;
    }

    public String getEmployeeTypeId() {
        return this.employeeTypeId;
    }

    public void setEmployeeTypeId(String employeeTypeId) {
        this.employeeTypeId = employeeTypeId;
    }

    public String getJobFamilyId() {
        return this.jobFamilyId;
    }

    public void setJobFamilyId(String jobFamilyId) {
        this.jobFamilyId = jobFamilyId;
    }

    public String getJobLevelId() {
        return this.jobLevelId;
    }

    public void setJobLevelId(String jobLevelId) {
        this.jobLevelId = jobLevelId;
    }

    public Integer getProbationMonth() {
        return this.probationMonth;
    }

    public void setProbationMonth(Integer probationMonth) {
        this.probationMonth = probationMonth;
    }

    public Integer getContractYear() {
        return this.contractYear;
    }

    public void setContractYear(Integer contractYear) {
        this.contractYear = contractYear;
    }

    public ContractPeriodInfo getContractPeriod() {
        return this.contractPeriod;
    }

    public void setContractPeriod(ContractPeriodInfo contractPeriod) {
        this.contractPeriod = contractPeriod;
    }

    public String getExpectedOnboardDate() {
        return this.expectedOnboardDate;
    }

    public void setExpectedOnboardDate(String expectedOnboardDate) {
        this.expectedOnboardDate = expectedOnboardDate;
    }

    public String getOnboardAddressId() {
        return this.onboardAddressId;
    }

    public void setOnboardAddressId(String onboardAddressId) {
        this.onboardAddressId = onboardAddressId;
    }

    public String getWorkAddressId() {
        return this.workAddressId;
    }

    public void setWorkAddressId(String workAddressId) {
        this.workAddressId = workAddressId;
    }

    public String getOwnerUserId() {
        return this.ownerUserId;
    }

    public void setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public String getRecommendedWords() {
        return this.recommendedWords;
    }

    public void setRecommendedWords(String recommendedWords) {
        this.recommendedWords = recommendedWords;
    }

    public String getJobRequirementId() {
        return this.jobRequirementId;
    }

    public void setJobRequirementId(String jobRequirementId) {
        this.jobRequirementId = jobRequirementId;
    }

    public Integer getJobProcessTypeId() {
        return this.jobProcessTypeId;
    }

    public void setJobProcessTypeId(Integer jobProcessTypeId) {
        this.jobProcessTypeId = jobProcessTypeId;
    }

    public String[] getAttachmentIdList() {
        return this.attachmentIdList;
    }

    public void setAttachmentIdList(String[] attachmentIdList) {
        this.attachmentIdList = attachmentIdList;
    }

    public String getAttachmentDescription() {
        return this.attachmentDescription;
    }

    public void setAttachmentDescription(String attachmentDescription) {
        this.attachmentDescription = attachmentDescription;
    }

    public String getOperatorUserId() {
        return this.operatorUserId;
    }

    public void setOperatorUserId(String operatorUserId) {
        this.operatorUserId = operatorUserId;
    }

    public String getPositionId() {
        return this.positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getJobOffered() {
        return this.jobOffered;
    }

    public void setJobOffered(String jobOffered) {
        this.jobOffered = jobOffered;
    }

    public static class Builder {
        /**
         * 部门 ID
         * <p> 示例值：od-6b394871807047c7023ebfc1ff37cd3a
         */
        private String departmentId;
        /**
         * 直属上级 ID
         * <p> 示例值：ou_ce613028fe74745421f5dc320bb9c709
         */
        private String leaderUserId;
        /**
         * 职务 ID
         * <p> 示例值：123
         */
        private String employmentJobId;
        /**
         * 人员类型 ID
         * <p> 示例值：2
         */
        private String employeeTypeId;
        /**
         * 职位序列 ID
         * <p> 示例值：6807407987381831949
         */
        private String jobFamilyId;
        /**
         * 职位级别 ID
         * <p> 示例值：6807407987381881101
         */
        private String jobLevelId;
        /**
         * 试用期
         * <p> 示例值：3
         */
        private Integer probationMonth;
        /**
         * 合同期
         * <p> 示例值：3
         */
        private Integer contractYear;
        /**
         * 合同期（年/月）
         * <p> 示例值：
         */
        private ContractPeriodInfo contractPeriod;
        /**
         * 预计入职日期
         * <p> 示例值：{"date":"2022-04-07"}
         */
        private String expectedOnboardDate;
        /**
         * 入职地点 ID
         * <p> 示例值：6897079709306259719
         */
        private String onboardAddressId;
        /**
         * 办公地点 ID
         * <p> 示例值：6897079709306259719
         */
        private String workAddressId;
        /**
         * Offer负责人 ID
         * <p> 示例值：ou_ce613028fe74745421f5dc320bb9c709
         */
        private String ownerUserId;
        /**
         * Offer 推荐语
         * <p> 示例值：十分优秀，推荐入职
         */
        private String recommendedWords;
        /**
         * 招聘需求 ID
         * <p> 示例值：2342352224
         */
        private String jobRequirementId;
        /**
         * 招聘流程类型 ID
         * <p> 示例值：2
         */
        private Integer jobProcessTypeId;
        /**
         * 附件ID列表
         * <p> 示例值：["7081582717280831752"]
         */
        private String[] attachmentIdList;
        /**
         * 附件描述
         * <p> 示例值：张三的简历
         */
        private String attachmentDescription;
        /**
         * Offer操作人 ID
         * <p> 示例值：ou_ce613028fe74745421f5dc320bb9c709
         */
        private String operatorUserId;
        /**
         * 岗位 ID
         * <p> 示例值：6897079709306259719
         */
        private String positionId;
        /**
         * 入职职位
         * <p> 示例值：测试职位
         */
        private String jobOffered;

        /**
         * 部门 ID
         * <p> 示例值：od-6b394871807047c7023ebfc1ff37cd3a
         *
         * @param departmentId
         * @return
         */
        public Builder departmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }


        /**
         * 直属上级 ID
         * <p> 示例值：ou_ce613028fe74745421f5dc320bb9c709
         *
         * @param leaderUserId
         * @return
         */
        public Builder leaderUserId(String leaderUserId) {
            this.leaderUserId = leaderUserId;
            return this;
        }


        /**
         * 职务 ID
         * <p> 示例值：123
         *
         * @param employmentJobId
         * @return
         */
        public Builder employmentJobId(String employmentJobId) {
            this.employmentJobId = employmentJobId;
            return this;
        }


        /**
         * 人员类型 ID
         * <p> 示例值：2
         *
         * @param employeeTypeId
         * @return
         */
        public Builder employeeTypeId(String employeeTypeId) {
            this.employeeTypeId = employeeTypeId;
            return this;
        }


        /**
         * 职位序列 ID
         * <p> 示例值：6807407987381831949
         *
         * @param jobFamilyId
         * @return
         */
        public Builder jobFamilyId(String jobFamilyId) {
            this.jobFamilyId = jobFamilyId;
            return this;
        }


        /**
         * 职位级别 ID
         * <p> 示例值：6807407987381881101
         *
         * @param jobLevelId
         * @return
         */
        public Builder jobLevelId(String jobLevelId) {
            this.jobLevelId = jobLevelId;
            return this;
        }


        /**
         * 试用期
         * <p> 示例值：3
         *
         * @param probationMonth
         * @return
         */
        public Builder probationMonth(Integer probationMonth) {
            this.probationMonth = probationMonth;
            return this;
        }


        /**
         * 合同期
         * <p> 示例值：3
         *
         * @param contractYear
         * @return
         */
        public Builder contractYear(Integer contractYear) {
            this.contractYear = contractYear;
            return this;
        }


        /**
         * 合同期（年/月）
         * <p> 示例值：
         *
         * @param contractPeriod
         * @return
         */
        public Builder contractPeriod(ContractPeriodInfo contractPeriod) {
            this.contractPeriod = contractPeriod;
            return this;
        }


        /**
         * 预计入职日期
         * <p> 示例值：{"date":"2022-04-07"}
         *
         * @param expectedOnboardDate
         * @return
         */
        public Builder expectedOnboardDate(String expectedOnboardDate) {
            this.expectedOnboardDate = expectedOnboardDate;
            return this;
        }


        /**
         * 入职地点 ID
         * <p> 示例值：6897079709306259719
         *
         * @param onboardAddressId
         * @return
         */
        public Builder onboardAddressId(String onboardAddressId) {
            this.onboardAddressId = onboardAddressId;
            return this;
        }


        /**
         * 办公地点 ID
         * <p> 示例值：6897079709306259719
         *
         * @param workAddressId
         * @return
         */
        public Builder workAddressId(String workAddressId) {
            this.workAddressId = workAddressId;
            return this;
        }


        /**
         * Offer负责人 ID
         * <p> 示例值：ou_ce613028fe74745421f5dc320bb9c709
         *
         * @param ownerUserId
         * @return
         */
        public Builder ownerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }


        /**
         * Offer 推荐语
         * <p> 示例值：十分优秀，推荐入职
         *
         * @param recommendedWords
         * @return
         */
        public Builder recommendedWords(String recommendedWords) {
            this.recommendedWords = recommendedWords;
            return this;
        }


        /**
         * 招聘需求 ID
         * <p> 示例值：2342352224
         *
         * @param jobRequirementId
         * @return
         */
        public Builder jobRequirementId(String jobRequirementId) {
            this.jobRequirementId = jobRequirementId;
            return this;
        }


        /**
         * 招聘流程类型 ID
         * <p> 示例值：2
         *
         * @param jobProcessTypeId
         * @return
         */
        public Builder jobProcessTypeId(Integer jobProcessTypeId) {
            this.jobProcessTypeId = jobProcessTypeId;
            return this;
        }


        /**
         * 附件ID列表
         * <p> 示例值：["7081582717280831752"]
         *
         * @param attachmentIdList
         * @return
         */
        public Builder attachmentIdList(String[] attachmentIdList) {
            this.attachmentIdList = attachmentIdList;
            return this;
        }


        /**
         * 附件描述
         * <p> 示例值：张三的简历
         *
         * @param attachmentDescription
         * @return
         */
        public Builder attachmentDescription(String attachmentDescription) {
            this.attachmentDescription = attachmentDescription;
            return this;
        }


        /**
         * Offer操作人 ID
         * <p> 示例值：ou_ce613028fe74745421f5dc320bb9c709
         *
         * @param operatorUserId
         * @return
         */
        public Builder operatorUserId(String operatorUserId) {
            this.operatorUserId = operatorUserId;
            return this;
        }


        /**
         * 岗位 ID
         * <p> 示例值：6897079709306259719
         *
         * @param positionId
         * @return
         */
        public Builder positionId(String positionId) {
            this.positionId = positionId;
            return this;
        }


        /**
         * 入职职位
         * <p> 示例值：测试职位
         *
         * @param jobOffered
         * @return
         */
        public Builder jobOffered(String jobOffered) {
            this.jobOffered = jobOffered;
            return this;
        }


        public OfferBasicInfo build() {
            return new OfferBasicInfo(this);
        }
    }
}
