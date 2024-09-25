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

public class JobData {
    /**
     * 任职信息 ID
     * <p> 示例值：6890452208593372679
     */
    @SerializedName("job_data_id")
    private String jobDataId;
    /**
     * 任职记录版本 ID
     * <p> 示例值：6890452208593372697
     */
    @SerializedName("version_id")
    private String versionId;
    /**
     * 人员类型 ID，枚举值及详细信息可通过【查询单个人员类型】接口查询获得
     * <p> 示例值：6890452208593372679
     */
    @SerializedName("employee_type_id")
    private String employeeTypeId;
    /**
     * 工时制度 ID，枚举值及详细信息可通过【查询单个工时制度】接口查询获得
     * <p> 示例值：6890452208593372679
     */
    @SerializedName("working_hours_type_id")
    private String workingHoursTypeId;
    /**
     * 工作地点 ID，枚举值及详细信息可通过【查询单个地点】接口查询获得
     * <p> 示例值：6890452208593372679
     */
    @SerializedName("work_location_id")
    private String workLocationId;
    /**
     * 部门 ID，枚举值及详细信息可通过【查询单个部门】接口查询获得
     * <p> 示例值：6890452208593372679
     */
    @SerializedName("department_id")
    private String departmentId;
    /**
     * 岗位 ID，枚举值及详细信息可通过【查询单个岗位】接口查询获得
     * <p> 示例值：6890452208593372679
     */
    @SerializedName("position_id")
    private String positionId;
    /**
     * 职务 ID，枚举值及详细信息可通过【查询单个职务】接口查询获得
     * <p> 示例值：6890452208593372679
     */
    @SerializedName("job_id")
    private String jobId;
    /**
     * 职务级别 ID，枚举值及详细信息可通过【查询单个职务级别】接口查询获得
     * <p> 示例值：6890452208593372679
     */
    @SerializedName("job_level_id")
    private String jobLevelId;
    /**
     * 职等 ID
     * <p> 示例值：6890452208593372679
     */
    @SerializedName("job_grade_id")
    private String jobGradeId;
    /**
     * 职务序列 ID，枚举值及详细信息可通过【查询单个职务序列】接口查询获得
     * <p> 示例值：1245678
     */
    @SerializedName("job_family_id")
    private String jobFamilyId;
    /**
     * 试用期开始日期
     * <p> 示例值：2018-03-16T00:00:00
     */
    @SerializedName("probation_start_date")
    private String probationStartDate;
    /**
     * 试用期结束日期（实际结束日期）
     * <p> 示例值：2019-05-24T00:00:00
     */
    @SerializedName("probation_end_date")
    private String probationEndDate;
    /**
     * 是否为主任职
     * <p> 示例值：true
     */
    @SerializedName("primary_job_data")
    private Boolean primaryJobData;
    /**
     * 雇佣 ID
     * <p> 示例值：6893014062142064135
     */
    @SerializedName("employment_id")
    private String employmentId;
    /**
     * 生效时间
     * <p> 示例值：2020-05-01 00:00:00
     */
    @SerializedName("effective_time")
    private String effectiveTime;
    /**
     * 失效时间
     * <p> 示例值：2020-05-02 00:00:00
     */
    @SerializedName("expiration_time")
    private String expirationTime;
    /**
     * 任职原因，枚举值可通过文档【飞书人事枚举常量】任职原因（assignment_start_reason）枚举定义部分获得
     * <p> 示例值：onboarding
     */
    @SerializedName("assignment_start_reason")
    private Enum assignmentStartReason;
    /**
     * 预计试用期结束日期
     * <p> 示例值：2006-01-02
     */
    @SerializedName("probation_expected_end_date")
    private String probationExpectedEndDate;
    /**
     * 试用期结果，枚举值可通过文档【飞书人事枚举常量】试用期结果（probation_outcome）枚举定义部分获得
     * <p> 示例值：passed
     */
    @SerializedName("probation_outcome")
    private Enum probationOutcome;
    /**
     * 直属上级
     * <p> 示例值：
     */
    @SerializedName("direct_manager")
    private BasicJobData directManager;
    /**
     * 虚线上级
     * <p> 示例值：
     */
    @SerializedName("dotted_line_managers")
    private BasicJobData[] dottedLineManagers;
    /**
     * 第二实线主管
     * <p> 示例值：6890452208593372679
     */
    @SerializedName("second_direct_manager")
    private BasicJobData secondDirectManager;
    /**
     * 成本中心分摊信息
     * <p> 示例值：
     */
    @SerializedName("cost_center_rates")
    private JobDataCostCenter[] costCenterRates;
    /**
     * 排班类型
     * <p> 示例值：
     */
    @SerializedName("work_shift")
    private Enum workShift;
    /**
     * 薪资类型
     * <p> 示例值：
     */
    @SerializedName("compensation_type")
    private Enum compensationType;
    /**
     * 任职公司
     * <p> 示例值：6890452208593372680
     */
    @SerializedName("service_company")
    private String serviceCompany;
    /**
     * 创建时间
     * <p> 示例值：2020-05-02 00:00:00
     */
    @SerializedName("created_at")
    private String createdAt;

    // builder 开始
    public JobData() {
    }

    public JobData(Builder builder) {
        /**
         * 任职信息 ID
         * <p> 示例值：6890452208593372679
         */
        this.jobDataId = builder.jobDataId;
        /**
         * 任职记录版本 ID
         * <p> 示例值：6890452208593372697
         */
        this.versionId = builder.versionId;
        /**
         * 人员类型 ID，枚举值及详细信息可通过【查询单个人员类型】接口查询获得
         * <p> 示例值：6890452208593372679
         */
        this.employeeTypeId = builder.employeeTypeId;
        /**
         * 工时制度 ID，枚举值及详细信息可通过【查询单个工时制度】接口查询获得
         * <p> 示例值：6890452208593372679
         */
        this.workingHoursTypeId = builder.workingHoursTypeId;
        /**
         * 工作地点 ID，枚举值及详细信息可通过【查询单个地点】接口查询获得
         * <p> 示例值：6890452208593372679
         */
        this.workLocationId = builder.workLocationId;
        /**
         * 部门 ID，枚举值及详细信息可通过【查询单个部门】接口查询获得
         * <p> 示例值：6890452208593372679
         */
        this.departmentId = builder.departmentId;
        /**
         * 岗位 ID，枚举值及详细信息可通过【查询单个岗位】接口查询获得
         * <p> 示例值：6890452208593372679
         */
        this.positionId = builder.positionId;
        /**
         * 职务 ID，枚举值及详细信息可通过【查询单个职务】接口查询获得
         * <p> 示例值：6890452208593372679
         */
        this.jobId = builder.jobId;
        /**
         * 职务级别 ID，枚举值及详细信息可通过【查询单个职务级别】接口查询获得
         * <p> 示例值：6890452208593372679
         */
        this.jobLevelId = builder.jobLevelId;
        /**
         * 职等 ID
         * <p> 示例值：6890452208593372679
         */
        this.jobGradeId = builder.jobGradeId;
        /**
         * 职务序列 ID，枚举值及详细信息可通过【查询单个职务序列】接口查询获得
         * <p> 示例值：1245678
         */
        this.jobFamilyId = builder.jobFamilyId;
        /**
         * 试用期开始日期
         * <p> 示例值：2018-03-16T00:00:00
         */
        this.probationStartDate = builder.probationStartDate;
        /**
         * 试用期结束日期（实际结束日期）
         * <p> 示例值：2019-05-24T00:00:00
         */
        this.probationEndDate = builder.probationEndDate;
        /**
         * 是否为主任职
         * <p> 示例值：true
         */
        this.primaryJobData = builder.primaryJobData;
        /**
         * 雇佣 ID
         * <p> 示例值：6893014062142064135
         */
        this.employmentId = builder.employmentId;
        /**
         * 生效时间
         * <p> 示例值：2020-05-01 00:00:00
         */
        this.effectiveTime = builder.effectiveTime;
        /**
         * 失效时间
         * <p> 示例值：2020-05-02 00:00:00
         */
        this.expirationTime = builder.expirationTime;
        /**
         * 任职原因，枚举值可通过文档【飞书人事枚举常量】任职原因（assignment_start_reason）枚举定义部分获得
         * <p> 示例值：onboarding
         */
        this.assignmentStartReason = builder.assignmentStartReason;
        /**
         * 预计试用期结束日期
         * <p> 示例值：2006-01-02
         */
        this.probationExpectedEndDate = builder.probationExpectedEndDate;
        /**
         * 试用期结果，枚举值可通过文档【飞书人事枚举常量】试用期结果（probation_outcome）枚举定义部分获得
         * <p> 示例值：passed
         */
        this.probationOutcome = builder.probationOutcome;
        /**
         * 直属上级
         * <p> 示例值：
         */
        this.directManager = builder.directManager;
        /**
         * 虚线上级
         * <p> 示例值：
         */
        this.dottedLineManagers = builder.dottedLineManagers;
        /**
         * 第二实线主管
         * <p> 示例值：6890452208593372679
         */
        this.secondDirectManager = builder.secondDirectManager;
        /**
         * 成本中心分摊信息
         * <p> 示例值：
         */
        this.costCenterRates = builder.costCenterRates;
        /**
         * 排班类型
         * <p> 示例值：
         */
        this.workShift = builder.workShift;
        /**
         * 薪资类型
         * <p> 示例值：
         */
        this.compensationType = builder.compensationType;
        /**
         * 任职公司
         * <p> 示例值：6890452208593372680
         */
        this.serviceCompany = builder.serviceCompany;
        /**
         * 创建时间
         * <p> 示例值：2020-05-02 00:00:00
         */
        this.createdAt = builder.createdAt;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getJobDataId() {
        return this.jobDataId;
    }

    public void setJobDataId(String jobDataId) {
        this.jobDataId = jobDataId;
    }

    public String getVersionId() {
        return this.versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public String getEmployeeTypeId() {
        return this.employeeTypeId;
    }

    public void setEmployeeTypeId(String employeeTypeId) {
        this.employeeTypeId = employeeTypeId;
    }

    public String getWorkingHoursTypeId() {
        return this.workingHoursTypeId;
    }

    public void setWorkingHoursTypeId(String workingHoursTypeId) {
        this.workingHoursTypeId = workingHoursTypeId;
    }

    public String getWorkLocationId() {
        return this.workLocationId;
    }

    public void setWorkLocationId(String workLocationId) {
        this.workLocationId = workLocationId;
    }

    public String getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getPositionId() {
        return this.positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getJobId() {
        return this.jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobLevelId() {
        return this.jobLevelId;
    }

    public void setJobLevelId(String jobLevelId) {
        this.jobLevelId = jobLevelId;
    }

    public String getJobGradeId() {
        return this.jobGradeId;
    }

    public void setJobGradeId(String jobGradeId) {
        this.jobGradeId = jobGradeId;
    }

    public String getJobFamilyId() {
        return this.jobFamilyId;
    }

    public void setJobFamilyId(String jobFamilyId) {
        this.jobFamilyId = jobFamilyId;
    }

    public String getProbationStartDate() {
        return this.probationStartDate;
    }

    public void setProbationStartDate(String probationStartDate) {
        this.probationStartDate = probationStartDate;
    }

    public String getProbationEndDate() {
        return this.probationEndDate;
    }

    public void setProbationEndDate(String probationEndDate) {
        this.probationEndDate = probationEndDate;
    }

    public Boolean getPrimaryJobData() {
        return this.primaryJobData;
    }

    public void setPrimaryJobData(Boolean primaryJobData) {
        this.primaryJobData = primaryJobData;
    }

    public String getEmploymentId() {
        return this.employmentId;
    }

    public void setEmploymentId(String employmentId) {
        this.employmentId = employmentId;
    }

    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public String getExpirationTime() {
        return this.expirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    public Enum getAssignmentStartReason() {
        return this.assignmentStartReason;
    }

    public void setAssignmentStartReason(Enum assignmentStartReason) {
        this.assignmentStartReason = assignmentStartReason;
    }

    public String getProbationExpectedEndDate() {
        return this.probationExpectedEndDate;
    }

    public void setProbationExpectedEndDate(String probationExpectedEndDate) {
        this.probationExpectedEndDate = probationExpectedEndDate;
    }

    public Enum getProbationOutcome() {
        return this.probationOutcome;
    }

    public void setProbationOutcome(Enum probationOutcome) {
        this.probationOutcome = probationOutcome;
    }

    public BasicJobData getDirectManager() {
        return this.directManager;
    }

    public void setDirectManager(BasicJobData directManager) {
        this.directManager = directManager;
    }

    public BasicJobData[] getDottedLineManagers() {
        return this.dottedLineManagers;
    }

    public void setDottedLineManagers(BasicJobData[] dottedLineManagers) {
        this.dottedLineManagers = dottedLineManagers;
    }

    public BasicJobData getSecondDirectManager() {
        return this.secondDirectManager;
    }

    public void setSecondDirectManager(BasicJobData secondDirectManager) {
        this.secondDirectManager = secondDirectManager;
    }

    public JobDataCostCenter[] getCostCenterRates() {
        return this.costCenterRates;
    }

    public void setCostCenterRates(JobDataCostCenter[] costCenterRates) {
        this.costCenterRates = costCenterRates;
    }

    public Enum getWorkShift() {
        return this.workShift;
    }

    public void setWorkShift(Enum workShift) {
        this.workShift = workShift;
    }

    public Enum getCompensationType() {
        return this.compensationType;
    }

    public void setCompensationType(Enum compensationType) {
        this.compensationType = compensationType;
    }

    public String getServiceCompany() {
        return this.serviceCompany;
    }

    public void setServiceCompany(String serviceCompany) {
        this.serviceCompany = serviceCompany;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public static class Builder {
        /**
         * 任职信息 ID
         * <p> 示例值：6890452208593372679
         */
        private String jobDataId;
        /**
         * 任职记录版本 ID
         * <p> 示例值：6890452208593372697
         */
        private String versionId;
        /**
         * 人员类型 ID，枚举值及详细信息可通过【查询单个人员类型】接口查询获得
         * <p> 示例值：6890452208593372679
         */
        private String employeeTypeId;
        /**
         * 工时制度 ID，枚举值及详细信息可通过【查询单个工时制度】接口查询获得
         * <p> 示例值：6890452208593372679
         */
        private String workingHoursTypeId;
        /**
         * 工作地点 ID，枚举值及详细信息可通过【查询单个地点】接口查询获得
         * <p> 示例值：6890452208593372679
         */
        private String workLocationId;
        /**
         * 部门 ID，枚举值及详细信息可通过【查询单个部门】接口查询获得
         * <p> 示例值：6890452208593372679
         */
        private String departmentId;
        /**
         * 岗位 ID，枚举值及详细信息可通过【查询单个岗位】接口查询获得
         * <p> 示例值：6890452208593372679
         */
        private String positionId;
        /**
         * 职务 ID，枚举值及详细信息可通过【查询单个职务】接口查询获得
         * <p> 示例值：6890452208593372679
         */
        private String jobId;
        /**
         * 职务级别 ID，枚举值及详细信息可通过【查询单个职务级别】接口查询获得
         * <p> 示例值：6890452208593372679
         */
        private String jobLevelId;
        /**
         * 职等 ID
         * <p> 示例值：6890452208593372679
         */
        private String jobGradeId;
        /**
         * 职务序列 ID，枚举值及详细信息可通过【查询单个职务序列】接口查询获得
         * <p> 示例值：1245678
         */
        private String jobFamilyId;
        /**
         * 试用期开始日期
         * <p> 示例值：2018-03-16T00:00:00
         */
        private String probationStartDate;
        /**
         * 试用期结束日期（实际结束日期）
         * <p> 示例值：2019-05-24T00:00:00
         */
        private String probationEndDate;
        /**
         * 是否为主任职
         * <p> 示例值：true
         */
        private Boolean primaryJobData;
        /**
         * 雇佣 ID
         * <p> 示例值：6893014062142064135
         */
        private String employmentId;
        /**
         * 生效时间
         * <p> 示例值：2020-05-01 00:00:00
         */
        private String effectiveTime;
        /**
         * 失效时间
         * <p> 示例值：2020-05-02 00:00:00
         */
        private String expirationTime;
        /**
         * 任职原因，枚举值可通过文档【飞书人事枚举常量】任职原因（assignment_start_reason）枚举定义部分获得
         * <p> 示例值：onboarding
         */
        private Enum assignmentStartReason;
        /**
         * 预计试用期结束日期
         * <p> 示例值：2006-01-02
         */
        private String probationExpectedEndDate;
        /**
         * 试用期结果，枚举值可通过文档【飞书人事枚举常量】试用期结果（probation_outcome）枚举定义部分获得
         * <p> 示例值：passed
         */
        private Enum probationOutcome;
        /**
         * 直属上级
         * <p> 示例值：
         */
        private BasicJobData directManager;
        /**
         * 虚线上级
         * <p> 示例值：
         */
        private BasicJobData[] dottedLineManagers;
        /**
         * 第二实线主管
         * <p> 示例值：6890452208593372679
         */
        private BasicJobData secondDirectManager;
        /**
         * 成本中心分摊信息
         * <p> 示例值：
         */
        private JobDataCostCenter[] costCenterRates;
        /**
         * 排班类型
         * <p> 示例值：
         */
        private Enum workShift;
        /**
         * 薪资类型
         * <p> 示例值：
         */
        private Enum compensationType;
        /**
         * 任职公司
         * <p> 示例值：6890452208593372680
         */
        private String serviceCompany;
        /**
         * 创建时间
         * <p> 示例值：2020-05-02 00:00:00
         */
        private String createdAt;

        /**
         * 任职信息 ID
         * <p> 示例值：6890452208593372679
         *
         * @param jobDataId
         * @return
         */
        public Builder jobDataId(String jobDataId) {
            this.jobDataId = jobDataId;
            return this;
        }


        /**
         * 任职记录版本 ID
         * <p> 示例值：6890452208593372697
         *
         * @param versionId
         * @return
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }


        /**
         * 人员类型 ID，枚举值及详细信息可通过【查询单个人员类型】接口查询获得
         * <p> 示例值：6890452208593372679
         *
         * @param employeeTypeId
         * @return
         */
        public Builder employeeTypeId(String employeeTypeId) {
            this.employeeTypeId = employeeTypeId;
            return this;
        }


        /**
         * 工时制度 ID，枚举值及详细信息可通过【查询单个工时制度】接口查询获得
         * <p> 示例值：6890452208593372679
         *
         * @param workingHoursTypeId
         * @return
         */
        public Builder workingHoursTypeId(String workingHoursTypeId) {
            this.workingHoursTypeId = workingHoursTypeId;
            return this;
        }


        /**
         * 工作地点 ID，枚举值及详细信息可通过【查询单个地点】接口查询获得
         * <p> 示例值：6890452208593372679
         *
         * @param workLocationId
         * @return
         */
        public Builder workLocationId(String workLocationId) {
            this.workLocationId = workLocationId;
            return this;
        }


        /**
         * 部门 ID，枚举值及详细信息可通过【查询单个部门】接口查询获得
         * <p> 示例值：6890452208593372679
         *
         * @param departmentId
         * @return
         */
        public Builder departmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }


        /**
         * 岗位 ID，枚举值及详细信息可通过【查询单个岗位】接口查询获得
         * <p> 示例值：6890452208593372679
         *
         * @param positionId
         * @return
         */
        public Builder positionId(String positionId) {
            this.positionId = positionId;
            return this;
        }


        /**
         * 职务 ID，枚举值及详细信息可通过【查询单个职务】接口查询获得
         * <p> 示例值：6890452208593372679
         *
         * @param jobId
         * @return
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }


        /**
         * 职务级别 ID，枚举值及详细信息可通过【查询单个职务级别】接口查询获得
         * <p> 示例值：6890452208593372679
         *
         * @param jobLevelId
         * @return
         */
        public Builder jobLevelId(String jobLevelId) {
            this.jobLevelId = jobLevelId;
            return this;
        }


        /**
         * 职等 ID
         * <p> 示例值：6890452208593372679
         *
         * @param jobGradeId
         * @return
         */
        public Builder jobGradeId(String jobGradeId) {
            this.jobGradeId = jobGradeId;
            return this;
        }


        /**
         * 职务序列 ID，枚举值及详细信息可通过【查询单个职务序列】接口查询获得
         * <p> 示例值：1245678
         *
         * @param jobFamilyId
         * @return
         */
        public Builder jobFamilyId(String jobFamilyId) {
            this.jobFamilyId = jobFamilyId;
            return this;
        }


        /**
         * 试用期开始日期
         * <p> 示例值：2018-03-16T00:00:00
         *
         * @param probationStartDate
         * @return
         */
        public Builder probationStartDate(String probationStartDate) {
            this.probationStartDate = probationStartDate;
            return this;
        }


        /**
         * 试用期结束日期（实际结束日期）
         * <p> 示例值：2019-05-24T00:00:00
         *
         * @param probationEndDate
         * @return
         */
        public Builder probationEndDate(String probationEndDate) {
            this.probationEndDate = probationEndDate;
            return this;
        }


        /**
         * 是否为主任职
         * <p> 示例值：true
         *
         * @param primaryJobData
         * @return
         */
        public Builder primaryJobData(Boolean primaryJobData) {
            this.primaryJobData = primaryJobData;
            return this;
        }


        /**
         * 雇佣 ID
         * <p> 示例值：6893014062142064135
         *
         * @param employmentId
         * @return
         */
        public Builder employmentId(String employmentId) {
            this.employmentId = employmentId;
            return this;
        }


        /**
         * 生效时间
         * <p> 示例值：2020-05-01 00:00:00
         *
         * @param effectiveTime
         * @return
         */
        public Builder effectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }


        /**
         * 失效时间
         * <p> 示例值：2020-05-02 00:00:00
         *
         * @param expirationTime
         * @return
         */
        public Builder expirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }


        /**
         * 任职原因，枚举值可通过文档【飞书人事枚举常量】任职原因（assignment_start_reason）枚举定义部分获得
         * <p> 示例值：onboarding
         *
         * @param assignmentStartReason
         * @return
         */
        public Builder assignmentStartReason(Enum assignmentStartReason) {
            this.assignmentStartReason = assignmentStartReason;
            return this;
        }


        /**
         * 预计试用期结束日期
         * <p> 示例值：2006-01-02
         *
         * @param probationExpectedEndDate
         * @return
         */
        public Builder probationExpectedEndDate(String probationExpectedEndDate) {
            this.probationExpectedEndDate = probationExpectedEndDate;
            return this;
        }


        /**
         * 试用期结果，枚举值可通过文档【飞书人事枚举常量】试用期结果（probation_outcome）枚举定义部分获得
         * <p> 示例值：passed
         *
         * @param probationOutcome
         * @return
         */
        public Builder probationOutcome(Enum probationOutcome) {
            this.probationOutcome = probationOutcome;
            return this;
        }


        /**
         * 直属上级
         * <p> 示例值：
         *
         * @param directManager
         * @return
         */
        public Builder directManager(BasicJobData directManager) {
            this.directManager = directManager;
            return this;
        }


        /**
         * 虚线上级
         * <p> 示例值：
         *
         * @param dottedLineManagers
         * @return
         */
        public Builder dottedLineManagers(BasicJobData[] dottedLineManagers) {
            this.dottedLineManagers = dottedLineManagers;
            return this;
        }


        /**
         * 第二实线主管
         * <p> 示例值：6890452208593372679
         *
         * @param secondDirectManager
         * @return
         */
        public Builder secondDirectManager(BasicJobData secondDirectManager) {
            this.secondDirectManager = secondDirectManager;
            return this;
        }


        /**
         * 成本中心分摊信息
         * <p> 示例值：
         *
         * @param costCenterRates
         * @return
         */
        public Builder costCenterRates(JobDataCostCenter[] costCenterRates) {
            this.costCenterRates = costCenterRates;
            return this;
        }


        /**
         * 排班类型
         * <p> 示例值：
         *
         * @param workShift
         * @return
         */
        public Builder workShift(Enum workShift) {
            this.workShift = workShift;
            return this;
        }


        /**
         * 薪资类型
         * <p> 示例值：
         *
         * @param compensationType
         * @return
         */
        public Builder compensationType(Enum compensationType) {
            this.compensationType = compensationType;
            return this;
        }


        /**
         * 任职公司
         * <p> 示例值：6890452208593372680
         *
         * @param serviceCompany
         * @return
         */
        public Builder serviceCompany(String serviceCompany) {
            this.serviceCompany = serviceCompany;
            return this;
        }


        /**
         * 创建时间
         * <p> 示例值：2020-05-02 00:00:00
         *
         * @param createdAt
         * @return
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }


        public JobData build() {
            return new JobData(this);
        }
    }
}
