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

public class Employee {
    /**
     * 员工ID
     * <p> 示例值：7095600054216542508
     */
    @SerializedName("id")
    private String id;
    /**
     * 投递ID
     * <p> 示例值：7073372582620416300
     */
    @SerializedName("application_id")
    private String applicationId;
    /**
     * 入职状态
     * <p> 示例值：1
     */
    @SerializedName("onboard_status")
    private Integer onboardStatus;
    /**
     * 转正状态
     * <p> 示例值：1
     */
    @SerializedName("conversion_status")
    private Integer conversionStatus;
    /**
     * 实际入职时间
     * <p> 示例值：1637596800000
     */
    @SerializedName("onboard_time")
    private Integer onboardTime;
    /**
     * 预期转正时间
     * <p> 示例值：1637596800000
     */
    @SerializedName("expected_conversion_time")
    private Integer expectedConversionTime;
    /**
     * 实际转正时间
     * <p> 示例值：1637596800000
     */
    @SerializedName("actual_conversion_time")
    private Integer actualConversionTime;
    /**
     * 离职时间
     * <p> 示例值：1637596800000
     */
    @SerializedName("overboard_time")
    private Integer overboardTime;
    /**
     * 离职原因
     * <p> 示例值：职业发展考虑
     */
    @SerializedName("overboard_note")
    private String overboardNote;
    /**
     * 办公地点
     * <p> 示例值：CT_2
     */
    @SerializedName("onboard_city_code")
    private String onboardCityCode;
    /**
     * 入职部门
     * <p> 示例值：6966123381141866028
     */
    @SerializedName("department")
    private String department;
    /**
     * 直属上级
     * <p> 示例值：ou-xxx
     */
    @SerializedName("leader")
    private String leader;
    /**
     * 序列
     * <p> 示例值：6937934036379650311
     */
    @SerializedName("sequence")
    private String sequence;
    /**
     * 职级
     * <p> 示例值：7006234385490345986
     */
    @SerializedName("level")
    private String level;
    /**
     * 员工类型
     * <p> 示例值：1
     */
    @SerializedName("employee_type")
    private String employeeType;
    /**
     * 招聘需求ID
     * <p> 示例值：123123123213
     */
    @SerializedName("job_requirement_id")
    private String jobRequirementId;

    // builder 开始
    public Employee() {
    }

    public Employee(Builder builder) {
        /**
         * 员工ID
         * <p> 示例值：7095600054216542508
         */
        this.id = builder.id;
        /**
         * 投递ID
         * <p> 示例值：7073372582620416300
         */
        this.applicationId = builder.applicationId;
        /**
         * 入职状态
         * <p> 示例值：1
         */
        this.onboardStatus = builder.onboardStatus;
        /**
         * 转正状态
         * <p> 示例值：1
         */
        this.conversionStatus = builder.conversionStatus;
        /**
         * 实际入职时间
         * <p> 示例值：1637596800000
         */
        this.onboardTime = builder.onboardTime;
        /**
         * 预期转正时间
         * <p> 示例值：1637596800000
         */
        this.expectedConversionTime = builder.expectedConversionTime;
        /**
         * 实际转正时间
         * <p> 示例值：1637596800000
         */
        this.actualConversionTime = builder.actualConversionTime;
        /**
         * 离职时间
         * <p> 示例值：1637596800000
         */
        this.overboardTime = builder.overboardTime;
        /**
         * 离职原因
         * <p> 示例值：职业发展考虑
         */
        this.overboardNote = builder.overboardNote;
        /**
         * 办公地点
         * <p> 示例值：CT_2
         */
        this.onboardCityCode = builder.onboardCityCode;
        /**
         * 入职部门
         * <p> 示例值：6966123381141866028
         */
        this.department = builder.department;
        /**
         * 直属上级
         * <p> 示例值：ou-xxx
         */
        this.leader = builder.leader;
        /**
         * 序列
         * <p> 示例值：6937934036379650311
         */
        this.sequence = builder.sequence;
        /**
         * 职级
         * <p> 示例值：7006234385490345986
         */
        this.level = builder.level;
        /**
         * 员工类型
         * <p> 示例值：1
         */
        this.employeeType = builder.employeeType;
        /**
         * 招聘需求ID
         * <p> 示例值：123123123213
         */
        this.jobRequirementId = builder.jobRequirementId;
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

    public String getApplicationId() {
        return this.applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public Integer getOnboardStatus() {
        return this.onboardStatus;
    }

    public void setOnboardStatus(Integer onboardStatus) {
        this.onboardStatus = onboardStatus;
    }

    public Integer getConversionStatus() {
        return this.conversionStatus;
    }

    public void setConversionStatus(Integer conversionStatus) {
        this.conversionStatus = conversionStatus;
    }

    public Integer getOnboardTime() {
        return this.onboardTime;
    }

    public void setOnboardTime(Integer onboardTime) {
        this.onboardTime = onboardTime;
    }

    public Integer getExpectedConversionTime() {
        return this.expectedConversionTime;
    }

    public void setExpectedConversionTime(Integer expectedConversionTime) {
        this.expectedConversionTime = expectedConversionTime;
    }

    public Integer getActualConversionTime() {
        return this.actualConversionTime;
    }

    public void setActualConversionTime(Integer actualConversionTime) {
        this.actualConversionTime = actualConversionTime;
    }

    public Integer getOverboardTime() {
        return this.overboardTime;
    }

    public void setOverboardTime(Integer overboardTime) {
        this.overboardTime = overboardTime;
    }

    public String getOverboardNote() {
        return this.overboardNote;
    }

    public void setOverboardNote(String overboardNote) {
        this.overboardNote = overboardNote;
    }

    public String getOnboardCityCode() {
        return this.onboardCityCode;
    }

    public void setOnboardCityCode(String onboardCityCode) {
        this.onboardCityCode = onboardCityCode;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLeader() {
        return this.leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getSequence() {
        return this.sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getEmployeeType() {
        return this.employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public String getJobRequirementId() {
        return this.jobRequirementId;
    }

    public void setJobRequirementId(String jobRequirementId) {
        this.jobRequirementId = jobRequirementId;
    }

    public static class Builder {
        /**
         * 员工ID
         * <p> 示例值：7095600054216542508
         */
        private String id;
        /**
         * 投递ID
         * <p> 示例值：7073372582620416300
         */
        private String applicationId;
        /**
         * 入职状态
         * <p> 示例值：1
         */
        private Integer onboardStatus;
        /**
         * 转正状态
         * <p> 示例值：1
         */
        private Integer conversionStatus;
        /**
         * 实际入职时间
         * <p> 示例值：1637596800000
         */
        private Integer onboardTime;
        /**
         * 预期转正时间
         * <p> 示例值：1637596800000
         */
        private Integer expectedConversionTime;
        /**
         * 实际转正时间
         * <p> 示例值：1637596800000
         */
        private Integer actualConversionTime;
        /**
         * 离职时间
         * <p> 示例值：1637596800000
         */
        private Integer overboardTime;
        /**
         * 离职原因
         * <p> 示例值：职业发展考虑
         */
        private String overboardNote;
        /**
         * 办公地点
         * <p> 示例值：CT_2
         */
        private String onboardCityCode;
        /**
         * 入职部门
         * <p> 示例值：6966123381141866028
         */
        private String department;
        /**
         * 直属上级
         * <p> 示例值：ou-xxx
         */
        private String leader;
        /**
         * 序列
         * <p> 示例值：6937934036379650311
         */
        private String sequence;
        /**
         * 职级
         * <p> 示例值：7006234385490345986
         */
        private String level;
        /**
         * 员工类型
         * <p> 示例值：1
         */
        private String employeeType;
        /**
         * 招聘需求ID
         * <p> 示例值：123123123213
         */
        private String jobRequirementId;

        /**
         * 员工ID
         * <p> 示例值：7095600054216542508
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 投递ID
         * <p> 示例值：7073372582620416300
         *
         * @param applicationId
         * @return
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }


        /**
         * 入职状态
         * <p> 示例值：1
         *
         * @param onboardStatus
         * @return
         */
        public Builder onboardStatus(Integer onboardStatus) {
            this.onboardStatus = onboardStatus;
            return this;
        }


        /**
         * 转正状态
         * <p> 示例值：1
         *
         * @param conversionStatus
         * @return
         */
        public Builder conversionStatus(Integer conversionStatus) {
            this.conversionStatus = conversionStatus;
            return this;
        }


        /**
         * 实际入职时间
         * <p> 示例值：1637596800000
         *
         * @param onboardTime
         * @return
         */
        public Builder onboardTime(Integer onboardTime) {
            this.onboardTime = onboardTime;
            return this;
        }


        /**
         * 预期转正时间
         * <p> 示例值：1637596800000
         *
         * @param expectedConversionTime
         * @return
         */
        public Builder expectedConversionTime(Integer expectedConversionTime) {
            this.expectedConversionTime = expectedConversionTime;
            return this;
        }


        /**
         * 实际转正时间
         * <p> 示例值：1637596800000
         *
         * @param actualConversionTime
         * @return
         */
        public Builder actualConversionTime(Integer actualConversionTime) {
            this.actualConversionTime = actualConversionTime;
            return this;
        }


        /**
         * 离职时间
         * <p> 示例值：1637596800000
         *
         * @param overboardTime
         * @return
         */
        public Builder overboardTime(Integer overboardTime) {
            this.overboardTime = overboardTime;
            return this;
        }


        /**
         * 离职原因
         * <p> 示例值：职业发展考虑
         *
         * @param overboardNote
         * @return
         */
        public Builder overboardNote(String overboardNote) {
            this.overboardNote = overboardNote;
            return this;
        }


        /**
         * 办公地点
         * <p> 示例值：CT_2
         *
         * @param onboardCityCode
         * @return
         */
        public Builder onboardCityCode(String onboardCityCode) {
            this.onboardCityCode = onboardCityCode;
            return this;
        }


        /**
         * 入职部门
         * <p> 示例值：6966123381141866028
         *
         * @param department
         * @return
         */
        public Builder department(String department) {
            this.department = department;
            return this;
        }


        /**
         * 直属上级
         * <p> 示例值：ou-xxx
         *
         * @param leader
         * @return
         */
        public Builder leader(String leader) {
            this.leader = leader;
            return this;
        }


        /**
         * 序列
         * <p> 示例值：6937934036379650311
         *
         * @param sequence
         * @return
         */
        public Builder sequence(String sequence) {
            this.sequence = sequence;
            return this;
        }


        /**
         * 职级
         * <p> 示例值：7006234385490345986
         *
         * @param level
         * @return
         */
        public Builder level(String level) {
            this.level = level;
            return this;
        }


        /**
         * 员工类型
         * <p> 示例值：1
         *
         * @param employeeType
         * @return
         */
        public Builder employeeType(String employeeType) {
            this.employeeType = employeeType;
            return this;
        }


        /**
         * 招聘需求ID
         * <p> 示例值：123123123213
         *
         * @param jobRequirementId
         * @return
         */
        public Builder jobRequirementId(String jobRequirementId) {
            this.jobRequirementId = jobRequirementId;
            return this;
        }


        public Employee build() {
            return new Employee(this);
        }
    }
}
