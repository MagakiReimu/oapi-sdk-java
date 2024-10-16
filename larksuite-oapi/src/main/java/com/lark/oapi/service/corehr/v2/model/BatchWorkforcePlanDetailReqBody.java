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

public class BatchWorkforcePlanDetailReqBody {
    /**
     * 编制规划方案ID，ID及详细信息可通过获取编制规划方案列表接口查询获得。查询编制规划明细信息时，编制规划方案ID必填，是否为集中填报项目设置为false，不填写集中填报项目ID（是否填写不影响返回结果）
     * <p> 示例值：781234834512
     */
    @SerializedName("workforce_plan_id")
    private String workforcePlanId;
    /**
     * 是否为集中填报项目。如果租户未使用集中填报功能，将此参数置空即可。如果查询集中填报明细，将此参数设置为true。
     * <p> 示例值：false
     */
    @SerializedName("is_centralized_reporting_project")
    private Boolean isCentralizedReportingProject;
    /**
     * 编制规划集中填报项目ID，ID可通过访问集中填报页面，从URL中提取report_id参数。如果租户未使用集中填报功能，将此参数置空即可。查询集中填报信息时，集中填报项目ID必填，是否为集中填报项目设置为true，不填写编制规划方案ID（是否填写不影响返回结果）
     * <p> 示例值：7140964208476371111
     */
    @SerializedName("centralized_reporting_project_id")
    private String centralizedReportingProjectId;
    /**
     * 部门 ID 列表，枚举值及详细信息可通过查询单个部门接口查询获得
     * <p> 示例值：
     */
    @SerializedName("department_ids")
    private String[] departmentIds;
    /**
     * 人员类型 ID 列表，枚举值及详细信息可通过查询单个人员类型接口查询获得
     * <p> 示例值：
     */
    @SerializedName("employee_type_ids")
    private String[] employeeTypeIds;
    /**
     * 工作地点 ID 列表，枚举值及详细信息可通过查询单个地点接口查询获得
     * <p> 示例值：
     */
    @SerializedName("work_location_ids")
    private String[] workLocationIds;
    /**
     * 序列 ID 列表，枚举值及详细信息可通过查询单个序列接口查询获得
     * <p> 示例值：
     */
    @SerializedName("job_family_ids")
    private String[] jobFamilyIds;
    /**
     * 职级 ID 列表，枚举值及详细信息可通过查询单个职级接口查询获得
     * <p> 示例值：
     */
    @SerializedName("job_level_ids")
    private String[] jobLevelIds;
    /**
     * 职务 ID 列表，枚举值及详细信息可通过查询单个职务接口查询获得
     * <p> 示例值：
     */
    @SerializedName("job_ids")
    private String[] jobIds;
    /**
     * 成本中心 ID 列表，可以通过搜索成本中心信息接口获取对应的成本中心信息
     * <p> 示例值：
     */
    @SerializedName("cost_center_ids")
    private String[] costCenterIds;

    // builder 开始
    public BatchWorkforcePlanDetailReqBody() {
    }

    public BatchWorkforcePlanDetailReqBody(Builder builder) {
        /**
         * 编制规划方案ID，ID及详细信息可通过获取编制规划方案列表接口查询获得。查询编制规划明细信息时，编制规划方案ID必填，是否为集中填报项目设置为false，不填写集中填报项目ID（是否填写不影响返回结果）
         * <p> 示例值：781234834512
         */
        this.workforcePlanId = builder.workforcePlanId;
        /**
         * 是否为集中填报项目。如果租户未使用集中填报功能，将此参数置空即可。如果查询集中填报明细，将此参数设置为true。
         * <p> 示例值：false
         */
        this.isCentralizedReportingProject = builder.isCentralizedReportingProject;
        /**
         * 编制规划集中填报项目ID，ID可通过访问集中填报页面，从URL中提取report_id参数。如果租户未使用集中填报功能，将此参数置空即可。查询集中填报信息时，集中填报项目ID必填，是否为集中填报项目设置为true，不填写编制规划方案ID（是否填写不影响返回结果）
         * <p> 示例值：7140964208476371111
         */
        this.centralizedReportingProjectId = builder.centralizedReportingProjectId;
        /**
         * 部门 ID 列表，枚举值及详细信息可通过查询单个部门接口查询获得
         * <p> 示例值：
         */
        this.departmentIds = builder.departmentIds;
        /**
         * 人员类型 ID 列表，枚举值及详细信息可通过查询单个人员类型接口查询获得
         * <p> 示例值：
         */
        this.employeeTypeIds = builder.employeeTypeIds;
        /**
         * 工作地点 ID 列表，枚举值及详细信息可通过查询单个地点接口查询获得
         * <p> 示例值：
         */
        this.workLocationIds = builder.workLocationIds;
        /**
         * 序列 ID 列表，枚举值及详细信息可通过查询单个序列接口查询获得
         * <p> 示例值：
         */
        this.jobFamilyIds = builder.jobFamilyIds;
        /**
         * 职级 ID 列表，枚举值及详细信息可通过查询单个职级接口查询获得
         * <p> 示例值：
         */
        this.jobLevelIds = builder.jobLevelIds;
        /**
         * 职务 ID 列表，枚举值及详细信息可通过查询单个职务接口查询获得
         * <p> 示例值：
         */
        this.jobIds = builder.jobIds;
        /**
         * 成本中心 ID 列表，可以通过搜索成本中心信息接口获取对应的成本中心信息
         * <p> 示例值：
         */
        this.costCenterIds = builder.costCenterIds;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getWorkforcePlanId() {
        return this.workforcePlanId;
    }

    public void setWorkforcePlanId(String workforcePlanId) {
        this.workforcePlanId = workforcePlanId;
    }

    public Boolean getIsCentralizedReportingProject() {
        return this.isCentralizedReportingProject;
    }

    public void setIsCentralizedReportingProject(Boolean isCentralizedReportingProject) {
        this.isCentralizedReportingProject = isCentralizedReportingProject;
    }

    public String getCentralizedReportingProjectId() {
        return this.centralizedReportingProjectId;
    }

    public void setCentralizedReportingProjectId(String centralizedReportingProjectId) {
        this.centralizedReportingProjectId = centralizedReportingProjectId;
    }

    public String[] getDepartmentIds() {
        return this.departmentIds;
    }

    public void setDepartmentIds(String[] departmentIds) {
        this.departmentIds = departmentIds;
    }

    public String[] getEmployeeTypeIds() {
        return this.employeeTypeIds;
    }

    public void setEmployeeTypeIds(String[] employeeTypeIds) {
        this.employeeTypeIds = employeeTypeIds;
    }

    public String[] getWorkLocationIds() {
        return this.workLocationIds;
    }

    public void setWorkLocationIds(String[] workLocationIds) {
        this.workLocationIds = workLocationIds;
    }

    public String[] getJobFamilyIds() {
        return this.jobFamilyIds;
    }

    public void setJobFamilyIds(String[] jobFamilyIds) {
        this.jobFamilyIds = jobFamilyIds;
    }

    public String[] getJobLevelIds() {
        return this.jobLevelIds;
    }

    public void setJobLevelIds(String[] jobLevelIds) {
        this.jobLevelIds = jobLevelIds;
    }

    public String[] getJobIds() {
        return this.jobIds;
    }

    public void setJobIds(String[] jobIds) {
        this.jobIds = jobIds;
    }

    public String[] getCostCenterIds() {
        return this.costCenterIds;
    }

    public void setCostCenterIds(String[] costCenterIds) {
        this.costCenterIds = costCenterIds;
    }

    public static class Builder {
        /**
         * 编制规划方案ID，ID及详细信息可通过获取编制规划方案列表接口查询获得。查询编制规划明细信息时，编制规划方案ID必填，是否为集中填报项目设置为false，不填写集中填报项目ID（是否填写不影响返回结果）
         * <p> 示例值：781234834512
         */
        private String workforcePlanId;
        /**
         * 是否为集中填报项目。如果租户未使用集中填报功能，将此参数置空即可。如果查询集中填报明细，将此参数设置为true。
         * <p> 示例值：false
         */
        private Boolean isCentralizedReportingProject;
        /**
         * 编制规划集中填报项目ID，ID可通过访问集中填报页面，从URL中提取report_id参数。如果租户未使用集中填报功能，将此参数置空即可。查询集中填报信息时，集中填报项目ID必填，是否为集中填报项目设置为true，不填写编制规划方案ID（是否填写不影响返回结果）
         * <p> 示例值：7140964208476371111
         */
        private String centralizedReportingProjectId;
        /**
         * 部门 ID 列表，枚举值及详细信息可通过查询单个部门接口查询获得
         * <p> 示例值：
         */
        private String[] departmentIds;
        /**
         * 人员类型 ID 列表，枚举值及详细信息可通过查询单个人员类型接口查询获得
         * <p> 示例值：
         */
        private String[] employeeTypeIds;
        /**
         * 工作地点 ID 列表，枚举值及详细信息可通过查询单个地点接口查询获得
         * <p> 示例值：
         */
        private String[] workLocationIds;
        /**
         * 序列 ID 列表，枚举值及详细信息可通过查询单个序列接口查询获得
         * <p> 示例值：
         */
        private String[] jobFamilyIds;
        /**
         * 职级 ID 列表，枚举值及详细信息可通过查询单个职级接口查询获得
         * <p> 示例值：
         */
        private String[] jobLevelIds;
        /**
         * 职务 ID 列表，枚举值及详细信息可通过查询单个职务接口查询获得
         * <p> 示例值：
         */
        private String[] jobIds;
        /**
         * 成本中心 ID 列表，可以通过搜索成本中心信息接口获取对应的成本中心信息
         * <p> 示例值：
         */
        private String[] costCenterIds;

        /**
         * 编制规划方案ID，ID及详细信息可通过获取编制规划方案列表接口查询获得。查询编制规划明细信息时，编制规划方案ID必填，是否为集中填报项目设置为false，不填写集中填报项目ID（是否填写不影响返回结果）
         * <p> 示例值：781234834512
         *
         * @param workforcePlanId
         * @return
         */
        public Builder workforcePlanId(String workforcePlanId) {
            this.workforcePlanId = workforcePlanId;
            return this;
        }


        /**
         * 是否为集中填报项目。如果租户未使用集中填报功能，将此参数置空即可。如果查询集中填报明细，将此参数设置为true。
         * <p> 示例值：false
         *
         * @param isCentralizedReportingProject
         * @return
         */
        public Builder isCentralizedReportingProject(Boolean isCentralizedReportingProject) {
            this.isCentralizedReportingProject = isCentralizedReportingProject;
            return this;
        }


        /**
         * 编制规划集中填报项目ID，ID可通过访问集中填报页面，从URL中提取report_id参数。如果租户未使用集中填报功能，将此参数置空即可。查询集中填报信息时，集中填报项目ID必填，是否为集中填报项目设置为true，不填写编制规划方案ID（是否填写不影响返回结果）
         * <p> 示例值：7140964208476371111
         *
         * @param centralizedReportingProjectId
         * @return
         */
        public Builder centralizedReportingProjectId(String centralizedReportingProjectId) {
            this.centralizedReportingProjectId = centralizedReportingProjectId;
            return this;
        }


        /**
         * 部门 ID 列表，枚举值及详细信息可通过查询单个部门接口查询获得
         * <p> 示例值：
         *
         * @param departmentIds
         * @return
         */
        public Builder departmentIds(String[] departmentIds) {
            this.departmentIds = departmentIds;
            return this;
        }


        /**
         * 人员类型 ID 列表，枚举值及详细信息可通过查询单个人员类型接口查询获得
         * <p> 示例值：
         *
         * @param employeeTypeIds
         * @return
         */
        public Builder employeeTypeIds(String[] employeeTypeIds) {
            this.employeeTypeIds = employeeTypeIds;
            return this;
        }


        /**
         * 工作地点 ID 列表，枚举值及详细信息可通过查询单个地点接口查询获得
         * <p> 示例值：
         *
         * @param workLocationIds
         * @return
         */
        public Builder workLocationIds(String[] workLocationIds) {
            this.workLocationIds = workLocationIds;
            return this;
        }


        /**
         * 序列 ID 列表，枚举值及详细信息可通过查询单个序列接口查询获得
         * <p> 示例值：
         *
         * @param jobFamilyIds
         * @return
         */
        public Builder jobFamilyIds(String[] jobFamilyIds) {
            this.jobFamilyIds = jobFamilyIds;
            return this;
        }


        /**
         * 职级 ID 列表，枚举值及详细信息可通过查询单个职级接口查询获得
         * <p> 示例值：
         *
         * @param jobLevelIds
         * @return
         */
        public Builder jobLevelIds(String[] jobLevelIds) {
            this.jobLevelIds = jobLevelIds;
            return this;
        }


        /**
         * 职务 ID 列表，枚举值及详细信息可通过查询单个职务接口查询获得
         * <p> 示例值：
         *
         * @param jobIds
         * @return
         */
        public Builder jobIds(String[] jobIds) {
            this.jobIds = jobIds;
            return this;
        }


        /**
         * 成本中心 ID 列表，可以通过搜索成本中心信息接口获取对应的成本中心信息
         * <p> 示例值：
         *
         * @param costCenterIds
         * @return
         */
        public Builder costCenterIds(String[] costCenterIds) {
            this.costCenterIds = costCenterIds;
            return this;
        }


        public BatchWorkforcePlanDetailReqBody build() {
            return new BatchWorkforcePlanDetailReqBody(this);
        }
    }
}
