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

public class OfferBasicInfoV2 {
    /**
     * Offer ID
     * <p> 示例值：7056641315456469292
     */
    @SerializedName("id")
    private String id;
    /**
     * Offer 类型
     * <p> 示例值：1
     */
    @SerializedName("offer_type")
    private Integer offerType;
    /**
     * Offer 状态
     * <p> 示例值：10
     */
    @SerializedName("offer_status")
    private Integer offerStatus;
    /**
     * 直属上级
     * <p> 示例值：
     */
    @SerializedName("leader")
    private BasicUserInfo leader;
    /**
     * 人员类型
     * <p> 示例值：
     */
    @SerializedName("employee_type")
    private IdNameObject employeeType;
    /**
     * 部门
     * <p> 示例值：
     */
    @SerializedName("department")
    private BasicDepartmentInfo department;
    /**
     * 序列
     * <p> 示例值：
     */
    @SerializedName("sequence")
    private IdNameObject sequence;
    /**
     * 级别
     * <p> 示例值：
     */
    @SerializedName("level")
    private IdNameObject level;
    /**
     * 公司主体
     * <p> 示例值：
     */
    @SerializedName("company_main_body")
    private IdNameObject companyMainBody;
    /**
     * 招聘需求 ID
     * <p> 示例值：7018398769038182700
     */
    @SerializedName("job_requirement_id")
    private String jobRequirementId;
    /**
     * 试用期（单位：月）
     * <p> 示例值：3
     */
    @SerializedName("probation_month")
    private Integer probationMonth;
    /**
     * 合同期（年/月）
     * <p> 示例值：
     */
    @SerializedName("contract_period")
    private ContractPeriodInfo contractPeriod;
    /**
     * 入职日期
     * <p> 示例值：2023-01-01
     */
    @SerializedName("onboard_date")
    private String onboardDate;
    /**
     * Offer 负责人
     * <p> 示例值：
     */
    @SerializedName("owner")
    private BasicUserInfo owner;
    /**
     * 入职地址
     * <p> 示例值：
     */
    @SerializedName("onboard_address")
    private BaseAddressV2 onboardAddress;
    /**
     * 工作地址
     * <p> 示例值：
     */
    @SerializedName("work_address")
    private BaseAddressV2 workAddress;
    /**
     * Offer 备注
     * <p> 示例值：这个 Offer 需要加急审批
     */
    @SerializedName("remark")
    private String remark;
    /**
     * 附件列表
     * <p> 示例值：
     */
    @SerializedName("attachment_list")
    private OfferAttachmentInfo[] attachmentList;
    /**
     * Offer 自定义字段数据
     * <p> 示例值：
     */
    @SerializedName("customize_info_list")
    private ApplicationOfferCustomValue[] customizeInfoList;
    /**
     * Offer 创建时间戳（单位：毫秒）
     * <p> 示例值：1619719298000
     */
    @SerializedName("create_time")
    private String createTime;

    // builder 开始
    public OfferBasicInfoV2() {
    }

    public OfferBasicInfoV2(Builder builder) {
        /**
         * Offer ID
         * <p> 示例值：7056641315456469292
         */
        this.id = builder.id;
        /**
         * Offer 类型
         * <p> 示例值：1
         */
        this.offerType = builder.offerType;
        /**
         * Offer 状态
         * <p> 示例值：10
         */
        this.offerStatus = builder.offerStatus;
        /**
         * 直属上级
         * <p> 示例值：
         */
        this.leader = builder.leader;
        /**
         * 人员类型
         * <p> 示例值：
         */
        this.employeeType = builder.employeeType;
        /**
         * 部门
         * <p> 示例值：
         */
        this.department = builder.department;
        /**
         * 序列
         * <p> 示例值：
         */
        this.sequence = builder.sequence;
        /**
         * 级别
         * <p> 示例值：
         */
        this.level = builder.level;
        /**
         * 公司主体
         * <p> 示例值：
         */
        this.companyMainBody = builder.companyMainBody;
        /**
         * 招聘需求 ID
         * <p> 示例值：7018398769038182700
         */
        this.jobRequirementId = builder.jobRequirementId;
        /**
         * 试用期（单位：月）
         * <p> 示例值：3
         */
        this.probationMonth = builder.probationMonth;
        /**
         * 合同期（年/月）
         * <p> 示例值：
         */
        this.contractPeriod = builder.contractPeriod;
        /**
         * 入职日期
         * <p> 示例值：2023-01-01
         */
        this.onboardDate = builder.onboardDate;
        /**
         * Offer 负责人
         * <p> 示例值：
         */
        this.owner = builder.owner;
        /**
         * 入职地址
         * <p> 示例值：
         */
        this.onboardAddress = builder.onboardAddress;
        /**
         * 工作地址
         * <p> 示例值：
         */
        this.workAddress = builder.workAddress;
        /**
         * Offer 备注
         * <p> 示例值：这个 Offer 需要加急审批
         */
        this.remark = builder.remark;
        /**
         * 附件列表
         * <p> 示例值：
         */
        this.attachmentList = builder.attachmentList;
        /**
         * Offer 自定义字段数据
         * <p> 示例值：
         */
        this.customizeInfoList = builder.customizeInfoList;
        /**
         * Offer 创建时间戳（单位：毫秒）
         * <p> 示例值：1619719298000
         */
        this.createTime = builder.createTime;
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

    public Integer getOfferType() {
        return this.offerType;
    }

    public void setOfferType(Integer offerType) {
        this.offerType = offerType;
    }

    public Integer getOfferStatus() {
        return this.offerStatus;
    }

    public void setOfferStatus(Integer offerStatus) {
        this.offerStatus = offerStatus;
    }

    public BasicUserInfo getLeader() {
        return this.leader;
    }

    public void setLeader(BasicUserInfo leader) {
        this.leader = leader;
    }

    public IdNameObject getEmployeeType() {
        return this.employeeType;
    }

    public void setEmployeeType(IdNameObject employeeType) {
        this.employeeType = employeeType;
    }

    public BasicDepartmentInfo getDepartment() {
        return this.department;
    }

    public void setDepartment(BasicDepartmentInfo department) {
        this.department = department;
    }

    public IdNameObject getSequence() {
        return this.sequence;
    }

    public void setSequence(IdNameObject sequence) {
        this.sequence = sequence;
    }

    public IdNameObject getLevel() {
        return this.level;
    }

    public void setLevel(IdNameObject level) {
        this.level = level;
    }

    public IdNameObject getCompanyMainBody() {
        return this.companyMainBody;
    }

    public void setCompanyMainBody(IdNameObject companyMainBody) {
        this.companyMainBody = companyMainBody;
    }

    public String getJobRequirementId() {
        return this.jobRequirementId;
    }

    public void setJobRequirementId(String jobRequirementId) {
        this.jobRequirementId = jobRequirementId;
    }

    public Integer getProbationMonth() {
        return this.probationMonth;
    }

    public void setProbationMonth(Integer probationMonth) {
        this.probationMonth = probationMonth;
    }

    public ContractPeriodInfo getContractPeriod() {
        return this.contractPeriod;
    }

    public void setContractPeriod(ContractPeriodInfo contractPeriod) {
        this.contractPeriod = contractPeriod;
    }

    public String getOnboardDate() {
        return this.onboardDate;
    }

    public void setOnboardDate(String onboardDate) {
        this.onboardDate = onboardDate;
    }

    public BasicUserInfo getOwner() {
        return this.owner;
    }

    public void setOwner(BasicUserInfo owner) {
        this.owner = owner;
    }

    public BaseAddressV2 getOnboardAddress() {
        return this.onboardAddress;
    }

    public void setOnboardAddress(BaseAddressV2 onboardAddress) {
        this.onboardAddress = onboardAddress;
    }

    public BaseAddressV2 getWorkAddress() {
        return this.workAddress;
    }

    public void setWorkAddress(BaseAddressV2 workAddress) {
        this.workAddress = workAddress;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public OfferAttachmentInfo[] getAttachmentList() {
        return this.attachmentList;
    }

    public void setAttachmentList(OfferAttachmentInfo[] attachmentList) {
        this.attachmentList = attachmentList;
    }

    public ApplicationOfferCustomValue[] getCustomizeInfoList() {
        return this.customizeInfoList;
    }

    public void setCustomizeInfoList(ApplicationOfferCustomValue[] customizeInfoList) {
        this.customizeInfoList = customizeInfoList;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public static class Builder {
        /**
         * Offer ID
         * <p> 示例值：7056641315456469292
         */
        private String id;
        /**
         * Offer 类型
         * <p> 示例值：1
         */
        private Integer offerType;
        /**
         * Offer 状态
         * <p> 示例值：10
         */
        private Integer offerStatus;
        /**
         * 直属上级
         * <p> 示例值：
         */
        private BasicUserInfo leader;
        /**
         * 人员类型
         * <p> 示例值：
         */
        private IdNameObject employeeType;
        /**
         * 部门
         * <p> 示例值：
         */
        private BasicDepartmentInfo department;
        /**
         * 序列
         * <p> 示例值：
         */
        private IdNameObject sequence;
        /**
         * 级别
         * <p> 示例值：
         */
        private IdNameObject level;
        /**
         * 公司主体
         * <p> 示例值：
         */
        private IdNameObject companyMainBody;
        /**
         * 招聘需求 ID
         * <p> 示例值：7018398769038182700
         */
        private String jobRequirementId;
        /**
         * 试用期（单位：月）
         * <p> 示例值：3
         */
        private Integer probationMonth;
        /**
         * 合同期（年/月）
         * <p> 示例值：
         */
        private ContractPeriodInfo contractPeriod;
        /**
         * 入职日期
         * <p> 示例值：2023-01-01
         */
        private String onboardDate;
        /**
         * Offer 负责人
         * <p> 示例值：
         */
        private BasicUserInfo owner;
        /**
         * 入职地址
         * <p> 示例值：
         */
        private BaseAddressV2 onboardAddress;
        /**
         * 工作地址
         * <p> 示例值：
         */
        private BaseAddressV2 workAddress;
        /**
         * Offer 备注
         * <p> 示例值：这个 Offer 需要加急审批
         */
        private String remark;
        /**
         * 附件列表
         * <p> 示例值：
         */
        private OfferAttachmentInfo[] attachmentList;
        /**
         * Offer 自定义字段数据
         * <p> 示例值：
         */
        private ApplicationOfferCustomValue[] customizeInfoList;
        /**
         * Offer 创建时间戳（单位：毫秒）
         * <p> 示例值：1619719298000
         */
        private String createTime;

        /**
         * Offer ID
         * <p> 示例值：7056641315456469292
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * Offer 类型
         * <p> 示例值：1
         *
         * @param offerType
         * @return
         */
        public Builder offerType(Integer offerType) {
            this.offerType = offerType;
            return this;
        }


        /**
         * Offer 状态
         * <p> 示例值：10
         *
         * @param offerStatus
         * @return
         */
        public Builder offerStatus(Integer offerStatus) {
            this.offerStatus = offerStatus;
            return this;
        }


        /**
         * 直属上级
         * <p> 示例值：
         *
         * @param leader
         * @return
         */
        public Builder leader(BasicUserInfo leader) {
            this.leader = leader;
            return this;
        }


        /**
         * 人员类型
         * <p> 示例值：
         *
         * @param employeeType
         * @return
         */
        public Builder employeeType(IdNameObject employeeType) {
            this.employeeType = employeeType;
            return this;
        }


        /**
         * 部门
         * <p> 示例值：
         *
         * @param department
         * @return
         */
        public Builder department(BasicDepartmentInfo department) {
            this.department = department;
            return this;
        }


        /**
         * 序列
         * <p> 示例值：
         *
         * @param sequence
         * @return
         */
        public Builder sequence(IdNameObject sequence) {
            this.sequence = sequence;
            return this;
        }


        /**
         * 级别
         * <p> 示例值：
         *
         * @param level
         * @return
         */
        public Builder level(IdNameObject level) {
            this.level = level;
            return this;
        }


        /**
         * 公司主体
         * <p> 示例值：
         *
         * @param companyMainBody
         * @return
         */
        public Builder companyMainBody(IdNameObject companyMainBody) {
            this.companyMainBody = companyMainBody;
            return this;
        }


        /**
         * 招聘需求 ID
         * <p> 示例值：7018398769038182700
         *
         * @param jobRequirementId
         * @return
         */
        public Builder jobRequirementId(String jobRequirementId) {
            this.jobRequirementId = jobRequirementId;
            return this;
        }


        /**
         * 试用期（单位：月）
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
         * 入职日期
         * <p> 示例值：2023-01-01
         *
         * @param onboardDate
         * @return
         */
        public Builder onboardDate(String onboardDate) {
            this.onboardDate = onboardDate;
            return this;
        }


        /**
         * Offer 负责人
         * <p> 示例值：
         *
         * @param owner
         * @return
         */
        public Builder owner(BasicUserInfo owner) {
            this.owner = owner;
            return this;
        }


        /**
         * 入职地址
         * <p> 示例值：
         *
         * @param onboardAddress
         * @return
         */
        public Builder onboardAddress(BaseAddressV2 onboardAddress) {
            this.onboardAddress = onboardAddress;
            return this;
        }


        /**
         * 工作地址
         * <p> 示例值：
         *
         * @param workAddress
         * @return
         */
        public Builder workAddress(BaseAddressV2 workAddress) {
            this.workAddress = workAddress;
            return this;
        }


        /**
         * Offer 备注
         * <p> 示例值：这个 Offer 需要加急审批
         *
         * @param remark
         * @return
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }


        /**
         * 附件列表
         * <p> 示例值：
         *
         * @param attachmentList
         * @return
         */
        public Builder attachmentList(OfferAttachmentInfo[] attachmentList) {
            this.attachmentList = attachmentList;
            return this;
        }


        /**
         * Offer 自定义字段数据
         * <p> 示例值：
         *
         * @param customizeInfoList
         * @return
         */
        public Builder customizeInfoList(ApplicationOfferCustomValue[] customizeInfoList) {
            this.customizeInfoList = customizeInfoList;
            return this;
        }


        /**
         * Offer 创建时间戳（单位：毫秒）
         * <p> 示例值：1619719298000
         *
         * @param createTime
         * @return
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }


        public OfferBasicInfoV2 build() {
            return new OfferBasicInfoV2(this);
        }
    }
}
