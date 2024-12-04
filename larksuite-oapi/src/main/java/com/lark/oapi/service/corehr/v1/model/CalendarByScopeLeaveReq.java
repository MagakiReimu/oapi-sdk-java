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

package com.lark.oapi.service.corehr.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.corehr.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class CalendarByScopeLeaveReq {
    /**
     * 用户所属部门的ID列表
     * <p> 示例值："6722331851580982798"
     */
    @Query
    @SerializedName("wk_department_id")
    private String wkDepartmentId;
    /**
     * 国家/地区 ID
     * <p> 示例值："6722331851580982798"
     */
    @Query
    @SerializedName("wk_country_region_id")
    private String wkCountryRegionId;
    /**
     * 人员类型
     * <p> 示例值："6722331851580982798"
     */
    @Query
    @SerializedName("wk_employee_type_id")
    private String wkEmployeeTypeId;
    /**
     * 工作地点
     * <p> 示例值："6722331851580982798"
     */
    @Query
    @SerializedName("wk_work_location_id")
    private String wkWorkLocationId;
    /**
     * 工时制度
     * <p> 示例值："11344254"
     */
    @Query
    @SerializedName("wk_working_hours_type_id")
    private String wkWorkingHoursTypeId;
    /**
     * 职务序列
     * <p> 示例值："12345"
     */
    @Query
    @SerializedName("wk_job_family_id")
    private String wkJobFamilyId;
    /**
     * 公司 ID
     * <p> 示例值："24465434"
     */
    @Query
    @SerializedName("wk_company_id")
    private String wkCompanyId;

    // builder 开始
    public CalendarByScopeLeaveReq() {
    }

    public CalendarByScopeLeaveReq(Builder builder) {
        /**
         * 用户所属部门的ID列表
         * <p> 示例值："6722331851580982798"
         */
        this.wkDepartmentId = builder.wkDepartmentId;
        /**
         * 国家/地区 ID
         * <p> 示例值："6722331851580982798"
         */
        this.wkCountryRegionId = builder.wkCountryRegionId;
        /**
         * 人员类型
         * <p> 示例值："6722331851580982798"
         */
        this.wkEmployeeTypeId = builder.wkEmployeeTypeId;
        /**
         * 工作地点
         * <p> 示例值："6722331851580982798"
         */
        this.wkWorkLocationId = builder.wkWorkLocationId;
        /**
         * 工时制度
         * <p> 示例值："11344254"
         */
        this.wkWorkingHoursTypeId = builder.wkWorkingHoursTypeId;
        /**
         * 职务序列
         * <p> 示例值："12345"
         */
        this.wkJobFamilyId = builder.wkJobFamilyId;
        /**
         * 公司 ID
         * <p> 示例值："24465434"
         */
        this.wkCompanyId = builder.wkCompanyId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getWkDepartmentId() {
        return this.wkDepartmentId;
    }

    public void setWkDepartmentId(String wkDepartmentId) {
        this.wkDepartmentId = wkDepartmentId;
    }

    public String getWkCountryRegionId() {
        return this.wkCountryRegionId;
    }

    public void setWkCountryRegionId(String wkCountryRegionId) {
        this.wkCountryRegionId = wkCountryRegionId;
    }

    public String getWkEmployeeTypeId() {
        return this.wkEmployeeTypeId;
    }

    public void setWkEmployeeTypeId(String wkEmployeeTypeId) {
        this.wkEmployeeTypeId = wkEmployeeTypeId;
    }

    public String getWkWorkLocationId() {
        return this.wkWorkLocationId;
    }

    public void setWkWorkLocationId(String wkWorkLocationId) {
        this.wkWorkLocationId = wkWorkLocationId;
    }

    public String getWkWorkingHoursTypeId() {
        return this.wkWorkingHoursTypeId;
    }

    public void setWkWorkingHoursTypeId(String wkWorkingHoursTypeId) {
        this.wkWorkingHoursTypeId = wkWorkingHoursTypeId;
    }

    public String getWkJobFamilyId() {
        return this.wkJobFamilyId;
    }

    public void setWkJobFamilyId(String wkJobFamilyId) {
        this.wkJobFamilyId = wkJobFamilyId;
    }

    public String getWkCompanyId() {
        return this.wkCompanyId;
    }

    public void setWkCompanyId(String wkCompanyId) {
        this.wkCompanyId = wkCompanyId;
    }

    public static class Builder {
        private String wkDepartmentId; // 用户所属部门的ID列表
        private String wkCountryRegionId; // 国家/地区 ID
        private String wkEmployeeTypeId; // 人员类型
        private String wkWorkLocationId; // 工作地点
        private String wkWorkingHoursTypeId; // 工时制度
        private String wkJobFamilyId; // 职务序列
        private String wkCompanyId; // 公司 ID

        /**
         * 用户所属部门的ID列表
         * <p> 示例值："6722331851580982798"
         *
         * @param wkDepartmentId
         * @return
         */
        public Builder wkDepartmentId(String wkDepartmentId) {
            this.wkDepartmentId = wkDepartmentId;
            return this;
        }


        /**
         * 国家/地区 ID
         * <p> 示例值："6722331851580982798"
         *
         * @param wkCountryRegionId
         * @return
         */
        public Builder wkCountryRegionId(String wkCountryRegionId) {
            this.wkCountryRegionId = wkCountryRegionId;
            return this;
        }


        /**
         * 人员类型
         * <p> 示例值："6722331851580982798"
         *
         * @param wkEmployeeTypeId
         * @return
         */
        public Builder wkEmployeeTypeId(String wkEmployeeTypeId) {
            this.wkEmployeeTypeId = wkEmployeeTypeId;
            return this;
        }


        /**
         * 工作地点
         * <p> 示例值："6722331851580982798"
         *
         * @param wkWorkLocationId
         * @return
         */
        public Builder wkWorkLocationId(String wkWorkLocationId) {
            this.wkWorkLocationId = wkWorkLocationId;
            return this;
        }


        /**
         * 工时制度
         * <p> 示例值："11344254"
         *
         * @param wkWorkingHoursTypeId
         * @return
         */
        public Builder wkWorkingHoursTypeId(String wkWorkingHoursTypeId) {
            this.wkWorkingHoursTypeId = wkWorkingHoursTypeId;
            return this;
        }


        /**
         * 职务序列
         * <p> 示例值："12345"
         *
         * @param wkJobFamilyId
         * @return
         */
        public Builder wkJobFamilyId(String wkJobFamilyId) {
            this.wkJobFamilyId = wkJobFamilyId;
            return this;
        }


        /**
         * 公司 ID
         * <p> 示例值："24465434"
         *
         * @param wkCompanyId
         * @return
         */
        public Builder wkCompanyId(String wkCompanyId) {
            this.wkCompanyId = wkCompanyId;
            return this;
        }


        public CalendarByScopeLeaveReq build() {
            return new CalendarByScopeLeaveReq(this);
        }
    }
}
