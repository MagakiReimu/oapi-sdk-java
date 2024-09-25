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

public class ProfileSettingWorkExperience {
    /**
     * 公司 / 组织
     * <p> 示例值：
     */
    @SerializedName("company_organization")
    private ProfileSettingI18n companyOrganization;
    /**
     * 部门
     * <p> 示例值：
     */
    @SerializedName("department")
    private ProfileSettingI18n department;
    /**
     * 开始日期
     * <p> 示例值：2020-01-01
     */
    @SerializedName("start_date")
    private String startDate;
    /**
     * 结束日期
     * <p> 示例值：2020-02-01
     */
    @SerializedName("end_date")
    private String endDate;
    /**
     * 岗位
     * <p> 示例值：
     */
    @SerializedName("job")
    private ProfileSettingI18n job;
    /**
     * 工作描述
     * <p> 示例值：
     */
    @SerializedName("description")
    private ProfileSettingI18n description;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("custom_fields")
    private ProfileSettingCustomField[] customFields;

    // builder 开始
    public ProfileSettingWorkExperience() {
    }

    public ProfileSettingWorkExperience(Builder builder) {
        /**
         * 公司 / 组织
         * <p> 示例值：
         */
        this.companyOrganization = builder.companyOrganization;
        /**
         * 部门
         * <p> 示例值：
         */
        this.department = builder.department;
        /**
         * 开始日期
         * <p> 示例值：2020-01-01
         */
        this.startDate = builder.startDate;
        /**
         * 结束日期
         * <p> 示例值：2020-02-01
         */
        this.endDate = builder.endDate;
        /**
         * 岗位
         * <p> 示例值：
         */
        this.job = builder.job;
        /**
         * 工作描述
         * <p> 示例值：
         */
        this.description = builder.description;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        this.customFields = builder.customFields;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public ProfileSettingI18n getCompanyOrganization() {
        return this.companyOrganization;
    }

    public void setCompanyOrganization(ProfileSettingI18n companyOrganization) {
        this.companyOrganization = companyOrganization;
    }

    public ProfileSettingI18n getDepartment() {
        return this.department;
    }

    public void setDepartment(ProfileSettingI18n department) {
        this.department = department;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public ProfileSettingI18n getJob() {
        return this.job;
    }

    public void setJob(ProfileSettingI18n job) {
        this.job = job;
    }

    public ProfileSettingI18n getDescription() {
        return this.description;
    }

    public void setDescription(ProfileSettingI18n description) {
        this.description = description;
    }

    public ProfileSettingCustomField[] getCustomFields() {
        return this.customFields;
    }

    public void setCustomFields(ProfileSettingCustomField[] customFields) {
        this.customFields = customFields;
    }

    public static class Builder {
        /**
         * 公司 / 组织
         * <p> 示例值：
         */
        private ProfileSettingI18n companyOrganization;
        /**
         * 部门
         * <p> 示例值：
         */
        private ProfileSettingI18n department;
        /**
         * 开始日期
         * <p> 示例值：2020-01-01
         */
        private String startDate;
        /**
         * 结束日期
         * <p> 示例值：2020-02-01
         */
        private String endDate;
        /**
         * 岗位
         * <p> 示例值：
         */
        private ProfileSettingI18n job;
        /**
         * 工作描述
         * <p> 示例值：
         */
        private ProfileSettingI18n description;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private ProfileSettingCustomField[] customFields;

        /**
         * 公司 / 组织
         * <p> 示例值：
         *
         * @param companyOrganization
         * @return
         */
        public Builder companyOrganization(ProfileSettingI18n companyOrganization) {
            this.companyOrganization = companyOrganization;
            return this;
        }


        /**
         * 部门
         * <p> 示例值：
         *
         * @param department
         * @return
         */
        public Builder department(ProfileSettingI18n department) {
            this.department = department;
            return this;
        }


        /**
         * 开始日期
         * <p> 示例值：2020-01-01
         *
         * @param startDate
         * @return
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }


        /**
         * 结束日期
         * <p> 示例值：2020-02-01
         *
         * @param endDate
         * @return
         */
        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }


        /**
         * 岗位
         * <p> 示例值：
         *
         * @param job
         * @return
         */
        public Builder job(ProfileSettingI18n job) {
            this.job = job;
            return this;
        }


        /**
         * 工作描述
         * <p> 示例值：
         *
         * @param description
         * @return
         */
        public Builder description(ProfileSettingI18n description) {
            this.description = description;
            return this;
        }


        /**
         * 自定义字段
         * <p> 示例值：
         *
         * @param customFields
         * @return
         */
        public Builder customFields(ProfileSettingCustomField[] customFields) {
            this.customFields = customFields;
            return this;
        }


        public ProfileSettingWorkExperience build() {
            return new ProfileSettingWorkExperience(this);
        }
    }
}
