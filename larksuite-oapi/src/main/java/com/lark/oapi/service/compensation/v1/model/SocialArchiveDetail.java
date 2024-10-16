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

package com.lark.oapi.service.compensation.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.compensation.v1.enums.*;
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

public class SocialArchiveDetail {
    /**
     * 调整说明
     * <p> 示例值：
     */
    @SerializedName("description")
    private I18n description;
    /**
     * 类型。social_insurance: 社保; provident_fund: 公积金
     * <p> 示例值：
     */
    @SerializedName("insurance_type")
    private String insuranceType;
    /**
     * 参保状态，非「参保」状态下，基数、险种数据等为空
     * <p> 示例值：contribution
     */
    @SerializedName("insurance_status")
    private String insuranceStatus;
    /**
     * 档案时间轴对象ID，仅参保档案对象会包含
     * <p> 示例值：123456
     */
    @SerializedName("id")
    private String id;
    /**
     * 档案时间轴对象版本ID，仅参保档案对象会包含
     * <p> 示例值：123456
     */
    @SerializedName("tid")
    private String tid;
    /**
     * 参保方案ID，详细信息可通过「查询参保方案」接口获取
     * <p> 示例值：123456
     */
    @SerializedName("plan_id")
    private String planId;
    /**
     * 参保方案版本ID
     * <p> 示例值：123456
     */
    @SerializedName("plan_tid")
    private String planTid;
    /**
     * 参保城市ID，可通过获取地点信息接口查询详细信息
     * <p> 示例值：123456
     */
    @SerializedName("location_id")
    private String locationId;
    /**
     * 社保缴纳主体ID，可通过获取公司主体接口查询详细信息
     * <p> 示例值：223456
     */
    @SerializedName("company_id")
    private String companyId;
    /**
     * 社保账户类型
     * <p> 示例值：123456
     */
    @SerializedName("account_type")
    private String accountType;
    /**
     * 社保账号
     * <p> 示例值：ac123456
     */
    @SerializedName("insurance_account")
    private String insuranceAccount;
    /**
     * 申报缴纳基数
     * <p> 示例值：1000.10
     */
    @SerializedName("base_salary")
    private String baseSalary;
    /**
     * 险种数据详情
     * <p> 示例值：
     */
    @SerializedName("insurance_details")
    private SocialArchiveItem[] insuranceDetails;
    /**
     * 档案生效时间，HHHH-MM-DD
     * <p> 示例值：2024-01-01
     */
    @SerializedName("effective_date")
    private String effectiveDate;

    // builder 开始
    public SocialArchiveDetail() {
    }

    public SocialArchiveDetail(Builder builder) {
        /**
         * 调整说明
         * <p> 示例值：
         */
        this.description = builder.description;
        /**
         * 类型。social_insurance: 社保; provident_fund: 公积金
         * <p> 示例值：
         */
        this.insuranceType = builder.insuranceType;
        /**
         * 参保状态，非「参保」状态下，基数、险种数据等为空
         * <p> 示例值：contribution
         */
        this.insuranceStatus = builder.insuranceStatus;
        /**
         * 档案时间轴对象ID，仅参保档案对象会包含
         * <p> 示例值：123456
         */
        this.id = builder.id;
        /**
         * 档案时间轴对象版本ID，仅参保档案对象会包含
         * <p> 示例值：123456
         */
        this.tid = builder.tid;
        /**
         * 参保方案ID，详细信息可通过「查询参保方案」接口获取
         * <p> 示例值：123456
         */
        this.planId = builder.planId;
        /**
         * 参保方案版本ID
         * <p> 示例值：123456
         */
        this.planTid = builder.planTid;
        /**
         * 参保城市ID，可通过获取地点信息接口查询详细信息
         * <p> 示例值：123456
         */
        this.locationId = builder.locationId;
        /**
         * 社保缴纳主体ID，可通过获取公司主体接口查询详细信息
         * <p> 示例值：223456
         */
        this.companyId = builder.companyId;
        /**
         * 社保账户类型
         * <p> 示例值：123456
         */
        this.accountType = builder.accountType;
        /**
         * 社保账号
         * <p> 示例值：ac123456
         */
        this.insuranceAccount = builder.insuranceAccount;
        /**
         * 申报缴纳基数
         * <p> 示例值：1000.10
         */
        this.baseSalary = builder.baseSalary;
        /**
         * 险种数据详情
         * <p> 示例值：
         */
        this.insuranceDetails = builder.insuranceDetails;
        /**
         * 档案生效时间，HHHH-MM-DD
         * <p> 示例值：2024-01-01
         */
        this.effectiveDate = builder.effectiveDate;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public I18n getDescription() {
        return this.description;
    }

    public void setDescription(I18n description) {
        this.description = description;
    }

    public String getInsuranceType() {
        return this.insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getInsuranceStatus() {
        return this.insuranceStatus;
    }

    public void setInsuranceStatus(String insuranceStatus) {
        this.insuranceStatus = insuranceStatus;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTid() {
        return this.tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getPlanId() {
        return this.planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getPlanTid() {
        return this.planTid;
    }

    public void setPlanTid(String planTid) {
        this.planTid = planTid;
    }

    public String getLocationId() {
        return this.locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getInsuranceAccount() {
        return this.insuranceAccount;
    }

    public void setInsuranceAccount(String insuranceAccount) {
        this.insuranceAccount = insuranceAccount;
    }

    public String getBaseSalary() {
        return this.baseSalary;
    }

    public void setBaseSalary(String baseSalary) {
        this.baseSalary = baseSalary;
    }

    public SocialArchiveItem[] getInsuranceDetails() {
        return this.insuranceDetails;
    }

    public void setInsuranceDetails(SocialArchiveItem[] insuranceDetails) {
        this.insuranceDetails = insuranceDetails;
    }

    public String getEffectiveDate() {
        return this.effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public static class Builder {
        /**
         * 调整说明
         * <p> 示例值：
         */
        private I18n description;
        /**
         * 类型。social_insurance: 社保; provident_fund: 公积金
         * <p> 示例值：
         */
        private String insuranceType;
        /**
         * 参保状态，非「参保」状态下，基数、险种数据等为空
         * <p> 示例值：contribution
         */
        private String insuranceStatus;
        /**
         * 档案时间轴对象ID，仅参保档案对象会包含
         * <p> 示例值：123456
         */
        private String id;
        /**
         * 档案时间轴对象版本ID，仅参保档案对象会包含
         * <p> 示例值：123456
         */
        private String tid;
        /**
         * 参保方案ID，详细信息可通过「查询参保方案」接口获取
         * <p> 示例值：123456
         */
        private String planId;
        /**
         * 参保方案版本ID
         * <p> 示例值：123456
         */
        private String planTid;
        /**
         * 参保城市ID，可通过获取地点信息接口查询详细信息
         * <p> 示例值：123456
         */
        private String locationId;
        /**
         * 社保缴纳主体ID，可通过获取公司主体接口查询详细信息
         * <p> 示例值：223456
         */
        private String companyId;
        /**
         * 社保账户类型
         * <p> 示例值：123456
         */
        private String accountType;
        /**
         * 社保账号
         * <p> 示例值：ac123456
         */
        private String insuranceAccount;
        /**
         * 申报缴纳基数
         * <p> 示例值：1000.10
         */
        private String baseSalary;
        /**
         * 险种数据详情
         * <p> 示例值：
         */
        private SocialArchiveItem[] insuranceDetails;
        /**
         * 档案生效时间，HHHH-MM-DD
         * <p> 示例值：2024-01-01
         */
        private String effectiveDate;

        /**
         * 调整说明
         * <p> 示例值：
         *
         * @param description
         * @return
         */
        public Builder description(I18n description) {
            this.description = description;
            return this;
        }


        /**
         * 类型。social_insurance: 社保; provident_fund: 公积金
         * <p> 示例值：
         *
         * @param insuranceType
         * @return
         */
        public Builder insuranceType(String insuranceType) {
            this.insuranceType = insuranceType;
            return this;
        }

        /**
         * 类型。social_insurance: 社保; provident_fund: 公积金
         * <p> 示例值：
         *
         * @param insuranceType {@link com.lark.oapi.service.compensation.v1.enums.SocialArchiveDetailInsuranceTypeEnum}
         * @return
         */
        public Builder insuranceType(com.lark.oapi.service.compensation.v1.enums.SocialArchiveDetailInsuranceTypeEnum insuranceType) {
            this.insuranceType = insuranceType.getValue();
            return this;
        }


        /**
         * 参保状态，非「参保」状态下，基数、险种数据等为空
         * <p> 示例值：contribution
         *
         * @param insuranceStatus
         * @return
         */
        public Builder insuranceStatus(String insuranceStatus) {
            this.insuranceStatus = insuranceStatus;
            return this;
        }

        /**
         * 参保状态，非「参保」状态下，基数、险种数据等为空
         * <p> 示例值：contribution
         *
         * @param insuranceStatus {@link com.lark.oapi.service.compensation.v1.enums.SocialArchiveDetailInsuranceStatusEnum}
         * @return
         */
        public Builder insuranceStatus(com.lark.oapi.service.compensation.v1.enums.SocialArchiveDetailInsuranceStatusEnum insuranceStatus) {
            this.insuranceStatus = insuranceStatus.getValue();
            return this;
        }


        /**
         * 档案时间轴对象ID，仅参保档案对象会包含
         * <p> 示例值：123456
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 档案时间轴对象版本ID，仅参保档案对象会包含
         * <p> 示例值：123456
         *
         * @param tid
         * @return
         */
        public Builder tid(String tid) {
            this.tid = tid;
            return this;
        }


        /**
         * 参保方案ID，详细信息可通过「查询参保方案」接口获取
         * <p> 示例值：123456
         *
         * @param planId
         * @return
         */
        public Builder planId(String planId) {
            this.planId = planId;
            return this;
        }


        /**
         * 参保方案版本ID
         * <p> 示例值：123456
         *
         * @param planTid
         * @return
         */
        public Builder planTid(String planTid) {
            this.planTid = planTid;
            return this;
        }


        /**
         * 参保城市ID，可通过获取地点信息接口查询详细信息
         * <p> 示例值：123456
         *
         * @param locationId
         * @return
         */
        public Builder locationId(String locationId) {
            this.locationId = locationId;
            return this;
        }


        /**
         * 社保缴纳主体ID，可通过获取公司主体接口查询详细信息
         * <p> 示例值：223456
         *
         * @param companyId
         * @return
         */
        public Builder companyId(String companyId) {
            this.companyId = companyId;
            return this;
        }


        /**
         * 社保账户类型
         * <p> 示例值：123456
         *
         * @param accountType
         * @return
         */
        public Builder accountType(String accountType) {
            this.accountType = accountType;
            return this;
        }


        /**
         * 社保账号
         * <p> 示例值：ac123456
         *
         * @param insuranceAccount
         * @return
         */
        public Builder insuranceAccount(String insuranceAccount) {
            this.insuranceAccount = insuranceAccount;
            return this;
        }


        /**
         * 申报缴纳基数
         * <p> 示例值：1000.10
         *
         * @param baseSalary
         * @return
         */
        public Builder baseSalary(String baseSalary) {
            this.baseSalary = baseSalary;
            return this;
        }


        /**
         * 险种数据详情
         * <p> 示例值：
         *
         * @param insuranceDetails
         * @return
         */
        public Builder insuranceDetails(SocialArchiveItem[] insuranceDetails) {
            this.insuranceDetails = insuranceDetails;
            return this;
        }


        /**
         * 档案生效时间，HHHH-MM-DD
         * <p> 示例值：2024-01-01
         *
         * @param effectiveDate
         * @return
         */
        public Builder effectiveDate(String effectiveDate) {
            this.effectiveDate = effectiveDate;
            return this;
        }


        public SocialArchiveDetail build() {
            return new SocialArchiveDetail(this);
        }
    }
}
