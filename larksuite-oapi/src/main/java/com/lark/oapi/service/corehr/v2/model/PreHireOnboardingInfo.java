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

public class PreHireOnboardingInfo {
    /**
     * Offer id , 可以通过招聘【获取 Offer 列表】接口获取
     * <p> 示例值：7032210902531327521
     */
    @SerializedName("offer_id")
    private String offerId;
    /**
     * Offer hr 的 雇佣 ID
     * <p> 示例值：7032210902531327521
     */
    @SerializedName("offer_hr_id")
    private String offerHrId;
    /**
     * -| 入职方式，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可： - object_api_name = "pre_hire" - custom_api_name = "onboarding_method"
     * <p> 示例值：onsite
     */
    @SerializedName("entry_mode")
    private String entryMode;
    /**
     * 入职日期
     * <p> 示例值：2022-10-08
     */
    @SerializedName("onboarding_date")
    private String onboardingDate;
    /**
     * 招聘投递 ID ，详细信息可以通过招聘【获取投递信息】接口查询获得
     * <p> 示例值：7140946969586010376
     */
    @SerializedName("ats_application_id")
    private String atsApplicationId;
    /**
     * -| 招聘来源 ，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可： - object_api_name = "pre_hire" - custom_api_name = "recruitment_type"
     * <p> 示例值：recent_graduates
     */
    @SerializedName("recruitment_type")
    private String recruitmentType;
    /**
     * -| 入职地点id , 详细信息可通过【批量查询地点】接口获得
     * <p> 示例值：6977976687350924832
     */
    @SerializedName("onboarding_location_id")
    private String onboardingLocationId;
    /**
     * -| 需要公司办理签证
     * <p> 示例值：true
     */
    @SerializedName("company_sponsored_visa")
    private Boolean companySponsoredVisa;
    /**
     * -| 入职状态
     * <p> 示例值：
     */
    @SerializedName("onboarding_status")
    private String onboardingStatus;
    /**
     * 入职任务列表
     * <p> 示例值：
     */
    @SerializedName("onboarding_task_list")
    private OnboardingTask[] onboardingTaskList;
    /**
     * 入职地址
     * <p> 示例值：
     */
    @SerializedName("onboarding_address")
    private Address onboardingAddress;
    /**
     * 入职流程
     * <p> 示例值：
     */
    @SerializedName("flow_name")
    private I18n[] flowName;
    /**
     * 入职流程 ID
     * <p> 示例值：2342352325
     */
    @SerializedName("flow_id")
    private String flowId;
    /**
     * 签到时间
     * <p> 示例值：2023-09-01 13:21:12
     */
    @SerializedName("check_in_time")
    private String checkInTime;
    /**
     * -| 招聘来源 ，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可： - object_api_name = "pre_hire" - custom_api_name = "check_in_method"
     * <p> 示例值：
     */
    @SerializedName("check_in_method")
    private Enum checkInMethod;

    // builder 开始
    public PreHireOnboardingInfo() {
    }

    public PreHireOnboardingInfo(Builder builder) {
        /**
         * Offer id , 可以通过招聘【获取 Offer 列表】接口获取
         * <p> 示例值：7032210902531327521
         */
        this.offerId = builder.offerId;
        /**
         * Offer hr 的 雇佣 ID
         * <p> 示例值：7032210902531327521
         */
        this.offerHrId = builder.offerHrId;
        /**
         * -| 入职方式，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可： - object_api_name = "pre_hire" - custom_api_name = "onboarding_method"
         * <p> 示例值：onsite
         */
        this.entryMode = builder.entryMode;
        /**
         * 入职日期
         * <p> 示例值：2022-10-08
         */
        this.onboardingDate = builder.onboardingDate;
        /**
         * 招聘投递 ID ，详细信息可以通过招聘【获取投递信息】接口查询获得
         * <p> 示例值：7140946969586010376
         */
        this.atsApplicationId = builder.atsApplicationId;
        /**
         * -| 招聘来源 ，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可： - object_api_name = "pre_hire" - custom_api_name = "recruitment_type"
         * <p> 示例值：recent_graduates
         */
        this.recruitmentType = builder.recruitmentType;
        /**
         * -| 入职地点id , 详细信息可通过【批量查询地点】接口获得
         * <p> 示例值：6977976687350924832
         */
        this.onboardingLocationId = builder.onboardingLocationId;
        /**
         * -| 需要公司办理签证
         * <p> 示例值：true
         */
        this.companySponsoredVisa = builder.companySponsoredVisa;
        /**
         * -| 入职状态
         * <p> 示例值：
         */
        this.onboardingStatus = builder.onboardingStatus;
        /**
         * 入职任务列表
         * <p> 示例值：
         */
        this.onboardingTaskList = builder.onboardingTaskList;
        /**
         * 入职地址
         * <p> 示例值：
         */
        this.onboardingAddress = builder.onboardingAddress;
        /**
         * 入职流程
         * <p> 示例值：
         */
        this.flowName = builder.flowName;
        /**
         * 入职流程 ID
         * <p> 示例值：2342352325
         */
        this.flowId = builder.flowId;
        /**
         * 签到时间
         * <p> 示例值：2023-09-01 13:21:12
         */
        this.checkInTime = builder.checkInTime;
        /**
         * -| 招聘来源 ，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可： - object_api_name = "pre_hire" - custom_api_name = "check_in_method"
         * <p> 示例值：
         */
        this.checkInMethod = builder.checkInMethod;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getOfferId() {
        return this.offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getOfferHrId() {
        return this.offerHrId;
    }

    public void setOfferHrId(String offerHrId) {
        this.offerHrId = offerHrId;
    }

    public String getEntryMode() {
        return this.entryMode;
    }

    public void setEntryMode(String entryMode) {
        this.entryMode = entryMode;
    }

    public String getOnboardingDate() {
        return this.onboardingDate;
    }

    public void setOnboardingDate(String onboardingDate) {
        this.onboardingDate = onboardingDate;
    }

    public String getAtsApplicationId() {
        return this.atsApplicationId;
    }

    public void setAtsApplicationId(String atsApplicationId) {
        this.atsApplicationId = atsApplicationId;
    }

    public String getRecruitmentType() {
        return this.recruitmentType;
    }

    public void setRecruitmentType(String recruitmentType) {
        this.recruitmentType = recruitmentType;
    }

    public String getOnboardingLocationId() {
        return this.onboardingLocationId;
    }

    public void setOnboardingLocationId(String onboardingLocationId) {
        this.onboardingLocationId = onboardingLocationId;
    }

    public Boolean getCompanySponsoredVisa() {
        return this.companySponsoredVisa;
    }

    public void setCompanySponsoredVisa(Boolean companySponsoredVisa) {
        this.companySponsoredVisa = companySponsoredVisa;
    }

    public String getOnboardingStatus() {
        return this.onboardingStatus;
    }

    public void setOnboardingStatus(String onboardingStatus) {
        this.onboardingStatus = onboardingStatus;
    }

    public OnboardingTask[] getOnboardingTaskList() {
        return this.onboardingTaskList;
    }

    public void setOnboardingTaskList(OnboardingTask[] onboardingTaskList) {
        this.onboardingTaskList = onboardingTaskList;
    }

    public Address getOnboardingAddress() {
        return this.onboardingAddress;
    }

    public void setOnboardingAddress(Address onboardingAddress) {
        this.onboardingAddress = onboardingAddress;
    }

    public I18n[] getFlowName() {
        return this.flowName;
    }

    public void setFlowName(I18n[] flowName) {
        this.flowName = flowName;
    }

    public String getFlowId() {
        return this.flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public String getCheckInTime() {
        return this.checkInTime;
    }

    public void setCheckInTime(String checkInTime) {
        this.checkInTime = checkInTime;
    }

    public Enum getCheckInMethod() {
        return this.checkInMethod;
    }

    public void setCheckInMethod(Enum checkInMethod) {
        this.checkInMethod = checkInMethod;
    }

    public static class Builder {
        /**
         * Offer id , 可以通过招聘【获取 Offer 列表】接口获取
         * <p> 示例值：7032210902531327521
         */
        private String offerId;
        /**
         * Offer hr 的 雇佣 ID
         * <p> 示例值：7032210902531327521
         */
        private String offerHrId;
        /**
         * -| 入职方式，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可： - object_api_name = "pre_hire" - custom_api_name = "onboarding_method"
         * <p> 示例值：onsite
         */
        private String entryMode;
        /**
         * 入职日期
         * <p> 示例值：2022-10-08
         */
        private String onboardingDate;
        /**
         * 招聘投递 ID ，详细信息可以通过招聘【获取投递信息】接口查询获得
         * <p> 示例值：7140946969586010376
         */
        private String atsApplicationId;
        /**
         * -| 招聘来源 ，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可： - object_api_name = "pre_hire" - custom_api_name = "recruitment_type"
         * <p> 示例值：recent_graduates
         */
        private String recruitmentType;
        /**
         * -| 入职地点id , 详细信息可通过【批量查询地点】接口获得
         * <p> 示例值：6977976687350924832
         */
        private String onboardingLocationId;
        /**
         * -| 需要公司办理签证
         * <p> 示例值：true
         */
        private Boolean companySponsoredVisa;
        /**
         * -| 入职状态
         * <p> 示例值：
         */
        private String onboardingStatus;
        /**
         * 入职任务列表
         * <p> 示例值：
         */
        private OnboardingTask[] onboardingTaskList;
        /**
         * 入职地址
         * <p> 示例值：
         */
        private Address onboardingAddress;
        /**
         * 入职流程
         * <p> 示例值：
         */
        private I18n[] flowName;
        /**
         * 入职流程 ID
         * <p> 示例值：2342352325
         */
        private String flowId;
        /**
         * 签到时间
         * <p> 示例值：2023-09-01 13:21:12
         */
        private String checkInTime;
        /**
         * -| 招聘来源 ，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可： - object_api_name = "pre_hire" - custom_api_name = "check_in_method"
         * <p> 示例值：
         */
        private Enum checkInMethod;

        /**
         * Offer id , 可以通过招聘【获取 Offer 列表】接口获取
         * <p> 示例值：7032210902531327521
         *
         * @param offerId
         * @return
         */
        public Builder offerId(String offerId) {
            this.offerId = offerId;
            return this;
        }


        /**
         * Offer hr 的 雇佣 ID
         * <p> 示例值：7032210902531327521
         *
         * @param offerHrId
         * @return
         */
        public Builder offerHrId(String offerHrId) {
            this.offerHrId = offerHrId;
            return this;
        }


        /**
         * -| 入职方式，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可： - object_api_name = "pre_hire" - custom_api_name = "onboarding_method"
         * <p> 示例值：onsite
         *
         * @param entryMode
         * @return
         */
        public Builder entryMode(String entryMode) {
            this.entryMode = entryMode;
            return this;
        }


        /**
         * 入职日期
         * <p> 示例值：2022-10-08
         *
         * @param onboardingDate
         * @return
         */
        public Builder onboardingDate(String onboardingDate) {
            this.onboardingDate = onboardingDate;
            return this;
        }


        /**
         * 招聘投递 ID ，详细信息可以通过招聘【获取投递信息】接口查询获得
         * <p> 示例值：7140946969586010376
         *
         * @param atsApplicationId
         * @return
         */
        public Builder atsApplicationId(String atsApplicationId) {
            this.atsApplicationId = atsApplicationId;
            return this;
        }


        /**
         * -| 招聘来源 ，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可： - object_api_name = "pre_hire" - custom_api_name = "recruitment_type"
         * <p> 示例值：recent_graduates
         *
         * @param recruitmentType
         * @return
         */
        public Builder recruitmentType(String recruitmentType) {
            this.recruitmentType = recruitmentType;
            return this;
        }


        /**
         * -| 入职地点id , 详细信息可通过【批量查询地点】接口获得
         * <p> 示例值：6977976687350924832
         *
         * @param onboardingLocationId
         * @return
         */
        public Builder onboardingLocationId(String onboardingLocationId) {
            this.onboardingLocationId = onboardingLocationId;
            return this;
        }


        /**
         * -| 需要公司办理签证
         * <p> 示例值：true
         *
         * @param companySponsoredVisa
         * @return
         */
        public Builder companySponsoredVisa(Boolean companySponsoredVisa) {
            this.companySponsoredVisa = companySponsoredVisa;
            return this;
        }


        /**
         * -| 入职状态
         * <p> 示例值：
         *
         * @param onboardingStatus
         * @return
         */
        public Builder onboardingStatus(String onboardingStatus) {
            this.onboardingStatus = onboardingStatus;
            return this;
        }


        /**
         * 入职任务列表
         * <p> 示例值：
         *
         * @param onboardingTaskList
         * @return
         */
        public Builder onboardingTaskList(OnboardingTask[] onboardingTaskList) {
            this.onboardingTaskList = onboardingTaskList;
            return this;
        }


        /**
         * 入职地址
         * <p> 示例值：
         *
         * @param onboardingAddress
         * @return
         */
        public Builder onboardingAddress(Address onboardingAddress) {
            this.onboardingAddress = onboardingAddress;
            return this;
        }


        /**
         * 入职流程
         * <p> 示例值：
         *
         * @param flowName
         * @return
         */
        public Builder flowName(I18n[] flowName) {
            this.flowName = flowName;
            return this;
        }


        /**
         * 入职流程 ID
         * <p> 示例值：2342352325
         *
         * @param flowId
         * @return
         */
        public Builder flowId(String flowId) {
            this.flowId = flowId;
            return this;
        }


        /**
         * 签到时间
         * <p> 示例值：2023-09-01 13:21:12
         *
         * @param checkInTime
         * @return
         */
        public Builder checkInTime(String checkInTime) {
            this.checkInTime = checkInTime;
            return this;
        }


        /**
         * -| 招聘来源 ，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可： - object_api_name = "pre_hire" - custom_api_name = "check_in_method"
         * <p> 示例值：
         *
         * @param checkInMethod
         * @return
         */
        public Builder checkInMethod(Enum checkInMethod) {
            this.checkInMethod = checkInMethod;
            return this;
        }


        public PreHireOnboardingInfo build() {
            return new PreHireOnboardingInfo(this);
        }
    }
}
