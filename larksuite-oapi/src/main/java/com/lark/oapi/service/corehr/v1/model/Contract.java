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
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class Contract {
    /**
     * 合同ID
     * <p> 示例值：6919737965274990093
     */
    @SerializedName("id")
    private String id;
    /**
     * 合同开始日期
     * <p> 示例值：2050-01-01 00:00:00
     */
    @SerializedName("effective_time")
    private String effectiveTime;
    /**
     * 实际结束日期
     * <p> 示例值：9999-12-31 23:59:59
     */
    @SerializedName("expiration_time")
    private String expirationTime;
    /**
     * 雇员 ID，枚举值及详细信息可通过【批量查询雇佣信息】接口查询获得
     * <p> 示例值：6893013238632416776
     */
    @SerializedName("employment_id")
    private String employmentId;
    /**
     * 合同类型，枚举值可通过文档[【飞书人事枚举常量】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/feishu-people-enum-constant)合同类型（contract_type）枚举定义部分获得
     * <p> 示例值：
     */
    @SerializedName("contract_type")
    private Enum contractType;
    /**
     * 甲方, 引用Company的ID，枚举值及详细信息可通过【批量查询公司】接口查询获得
     * <p> 示例值：6892686614112241165
     */
    @SerializedName("first_party_company_id")
    private String firstPartyCompanyId;
    /**
     * Person ID，枚举值及详细信息可通过【批量查询个人信息】接口查询获得
     * <p> 示例值：151515151
     */
    @SerializedName("person_id")
    private String personId;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("custom_fields")
    private ObjectFieldData[] customFields;
    /**
     * 期限类型，枚举值可通过文档[【飞书人事枚举常量】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/feishu-people-enum-constant)合同期限类型（duration_type）枚举定义部分获得
     * <p> 示例值：fixed_term
     */
    @SerializedName("duration_type")
    private Enum durationType;
    /**
     * 合同结束日期
     * <p> 示例值：2006-01-02
     */
    @SerializedName("contract_end_date")
    private String contractEndDate;
    /**
     * 合同编号
     * <p> 示例值：6919737965274990093
     */
    @SerializedName("contract_number")
    private String contractNumber;
    /**
     * 签订类型，枚举值可通过文档[【飞书人事枚举常量】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/feishu-people-enum-constant)签订类型（signing_type）枚举定义部分获得
     * <p> 示例值：
     */
    @SerializedName("signing_type")
    private Enum signingType;
    /**
     * 合同协议状态，枚举值可通过文档【飞书人事枚举常量】合同协议状态（contract_status）枚举定义部分获得
     * <p> 示例值：
     */
    @SerializedName("contract_status")
    private Enum contractStatus;
    /**
     * 续签状态，枚举值可通过文档【飞书人事枚举常量】续签状态（renewal_status）枚举定义部分获得
     * <p> 示例值：
     */
    @SerializedName("renewal_status")
    private Enum renewalStatus;
    /**
     * 第几次签署
     * <p> 示例值：1
     */
    @SerializedName("signing_times")
    private Integer signingTimes;

    // builder 开始
    public Contract() {
    }

    public Contract(Builder builder) {
        /**
         * 合同ID
         * <p> 示例值：6919737965274990093
         */
        this.id = builder.id;
        /**
         * 合同开始日期
         * <p> 示例值：2050-01-01 00:00:00
         */
        this.effectiveTime = builder.effectiveTime;
        /**
         * 实际结束日期
         * <p> 示例值：9999-12-31 23:59:59
         */
        this.expirationTime = builder.expirationTime;
        /**
         * 雇员 ID，枚举值及详细信息可通过【批量查询雇佣信息】接口查询获得
         * <p> 示例值：6893013238632416776
         */
        this.employmentId = builder.employmentId;
        /**
         * 合同类型，枚举值可通过文档[【飞书人事枚举常量】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/feishu-people-enum-constant)合同类型（contract_type）枚举定义部分获得
         * <p> 示例值：
         */
        this.contractType = builder.contractType;
        /**
         * 甲方, 引用Company的ID，枚举值及详细信息可通过【批量查询公司】接口查询获得
         * <p> 示例值：6892686614112241165
         */
        this.firstPartyCompanyId = builder.firstPartyCompanyId;
        /**
         * Person ID，枚举值及详细信息可通过【批量查询个人信息】接口查询获得
         * <p> 示例值：151515151
         */
        this.personId = builder.personId;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        this.customFields = builder.customFields;
        /**
         * 期限类型，枚举值可通过文档[【飞书人事枚举常量】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/feishu-people-enum-constant)合同期限类型（duration_type）枚举定义部分获得
         * <p> 示例值：fixed_term
         */
        this.durationType = builder.durationType;
        /**
         * 合同结束日期
         * <p> 示例值：2006-01-02
         */
        this.contractEndDate = builder.contractEndDate;
        /**
         * 合同编号
         * <p> 示例值：6919737965274990093
         */
        this.contractNumber = builder.contractNumber;
        /**
         * 签订类型，枚举值可通过文档[【飞书人事枚举常量】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/feishu-people-enum-constant)签订类型（signing_type）枚举定义部分获得
         * <p> 示例值：
         */
        this.signingType = builder.signingType;
        /**
         * 合同协议状态，枚举值可通过文档【飞书人事枚举常量】合同协议状态（contract_status）枚举定义部分获得
         * <p> 示例值：
         */
        this.contractStatus = builder.contractStatus;
        /**
         * 续签状态，枚举值可通过文档【飞书人事枚举常量】续签状态（renewal_status）枚举定义部分获得
         * <p> 示例值：
         */
        this.renewalStatus = builder.renewalStatus;
        /**
         * 第几次签署
         * <p> 示例值：1
         */
        this.signingTimes = builder.signingTimes;
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

    public String getEmploymentId() {
        return this.employmentId;
    }

    public void setEmploymentId(String employmentId) {
        this.employmentId = employmentId;
    }

    public Enum getContractType() {
        return this.contractType;
    }

    public void setContractType(Enum contractType) {
        this.contractType = contractType;
    }

    public String getFirstPartyCompanyId() {
        return this.firstPartyCompanyId;
    }

    public void setFirstPartyCompanyId(String firstPartyCompanyId) {
        this.firstPartyCompanyId = firstPartyCompanyId;
    }

    public String getPersonId() {
        return this.personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public ObjectFieldData[] getCustomFields() {
        return this.customFields;
    }

    public void setCustomFields(ObjectFieldData[] customFields) {
        this.customFields = customFields;
    }

    public Enum getDurationType() {
        return this.durationType;
    }

    public void setDurationType(Enum durationType) {
        this.durationType = durationType;
    }

    public String getContractEndDate() {
        return this.contractEndDate;
    }

    public void setContractEndDate(String contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public String getContractNumber() {
        return this.contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public Enum getSigningType() {
        return this.signingType;
    }

    public void setSigningType(Enum signingType) {
        this.signingType = signingType;
    }

    public Enum getContractStatus() {
        return this.contractStatus;
    }

    public void setContractStatus(Enum contractStatus) {
        this.contractStatus = contractStatus;
    }

    public Enum getRenewalStatus() {
        return this.renewalStatus;
    }

    public void setRenewalStatus(Enum renewalStatus) {
        this.renewalStatus = renewalStatus;
    }

    public Integer getSigningTimes() {
        return this.signingTimes;
    }

    public void setSigningTimes(Integer signingTimes) {
        this.signingTimes = signingTimes;
    }

    public static class Builder {
        /**
         * 合同ID
         * <p> 示例值：6919737965274990093
         */
        private String id;
        /**
         * 合同开始日期
         * <p> 示例值：2050-01-01 00:00:00
         */
        private String effectiveTime;
        /**
         * 实际结束日期
         * <p> 示例值：9999-12-31 23:59:59
         */
        private String expirationTime;
        /**
         * 雇员 ID，枚举值及详细信息可通过【批量查询雇佣信息】接口查询获得
         * <p> 示例值：6893013238632416776
         */
        private String employmentId;
        /**
         * 合同类型，枚举值可通过文档[【飞书人事枚举常量】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/feishu-people-enum-constant)合同类型（contract_type）枚举定义部分获得
         * <p> 示例值：
         */
        private Enum contractType;
        /**
         * 甲方, 引用Company的ID，枚举值及详细信息可通过【批量查询公司】接口查询获得
         * <p> 示例值：6892686614112241165
         */
        private String firstPartyCompanyId;
        /**
         * Person ID，枚举值及详细信息可通过【批量查询个人信息】接口查询获得
         * <p> 示例值：151515151
         */
        private String personId;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private ObjectFieldData[] customFields;
        /**
         * 期限类型，枚举值可通过文档[【飞书人事枚举常量】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/feishu-people-enum-constant)合同期限类型（duration_type）枚举定义部分获得
         * <p> 示例值：fixed_term
         */
        private Enum durationType;
        /**
         * 合同结束日期
         * <p> 示例值：2006-01-02
         */
        private String contractEndDate;
        /**
         * 合同编号
         * <p> 示例值：6919737965274990093
         */
        private String contractNumber;
        /**
         * 签订类型，枚举值可通过文档[【飞书人事枚举常量】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/feishu-people-enum-constant)签订类型（signing_type）枚举定义部分获得
         * <p> 示例值：
         */
        private Enum signingType;
        /**
         * 合同协议状态，枚举值可通过文档【飞书人事枚举常量】合同协议状态（contract_status）枚举定义部分获得
         * <p> 示例值：
         */
        private Enum contractStatus;
        /**
         * 续签状态，枚举值可通过文档【飞书人事枚举常量】续签状态（renewal_status）枚举定义部分获得
         * <p> 示例值：
         */
        private Enum renewalStatus;
        /**
         * 第几次签署
         * <p> 示例值：1
         */
        private Integer signingTimes;

        /**
         * 合同ID
         * <p> 示例值：6919737965274990093
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 合同开始日期
         * <p> 示例值：2050-01-01 00:00:00
         *
         * @param effectiveTime
         * @return
         */
        public Builder effectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }


        /**
         * 实际结束日期
         * <p> 示例值：9999-12-31 23:59:59
         *
         * @param expirationTime
         * @return
         */
        public Builder expirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }


        /**
         * 雇员 ID，枚举值及详细信息可通过【批量查询雇佣信息】接口查询获得
         * <p> 示例值：6893013238632416776
         *
         * @param employmentId
         * @return
         */
        public Builder employmentId(String employmentId) {
            this.employmentId = employmentId;
            return this;
        }


        /**
         * 合同类型，枚举值可通过文档[【飞书人事枚举常量】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/feishu-people-enum-constant)合同类型（contract_type）枚举定义部分获得
         * <p> 示例值：
         *
         * @param contractType
         * @return
         */
        public Builder contractType(Enum contractType) {
            this.contractType = contractType;
            return this;
        }


        /**
         * 甲方, 引用Company的ID，枚举值及详细信息可通过【批量查询公司】接口查询获得
         * <p> 示例值：6892686614112241165
         *
         * @param firstPartyCompanyId
         * @return
         */
        public Builder firstPartyCompanyId(String firstPartyCompanyId) {
            this.firstPartyCompanyId = firstPartyCompanyId;
            return this;
        }


        /**
         * Person ID，枚举值及详细信息可通过【批量查询个人信息】接口查询获得
         * <p> 示例值：151515151
         *
         * @param personId
         * @return
         */
        public Builder personId(String personId) {
            this.personId = personId;
            return this;
        }


        /**
         * 自定义字段
         * <p> 示例值：
         *
         * @param customFields
         * @return
         */
        public Builder customFields(ObjectFieldData[] customFields) {
            this.customFields = customFields;
            return this;
        }


        /**
         * 期限类型，枚举值可通过文档[【飞书人事枚举常量】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/feishu-people-enum-constant)合同期限类型（duration_type）枚举定义部分获得
         * <p> 示例值：fixed_term
         *
         * @param durationType
         * @return
         */
        public Builder durationType(Enum durationType) {
            this.durationType = durationType;
            return this;
        }


        /**
         * 合同结束日期
         * <p> 示例值：2006-01-02
         *
         * @param contractEndDate
         * @return
         */
        public Builder contractEndDate(String contractEndDate) {
            this.contractEndDate = contractEndDate;
            return this;
        }


        /**
         * 合同编号
         * <p> 示例值：6919737965274990093
         *
         * @param contractNumber
         * @return
         */
        public Builder contractNumber(String contractNumber) {
            this.contractNumber = contractNumber;
            return this;
        }


        /**
         * 签订类型，枚举值可通过文档[【飞书人事枚举常量】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/feishu-people-enum-constant)签订类型（signing_type）枚举定义部分获得
         * <p> 示例值：
         *
         * @param signingType
         * @return
         */
        public Builder signingType(Enum signingType) {
            this.signingType = signingType;
            return this;
        }


        /**
         * 合同协议状态，枚举值可通过文档【飞书人事枚举常量】合同协议状态（contract_status）枚举定义部分获得
         * <p> 示例值：
         *
         * @param contractStatus
         * @return
         */
        public Builder contractStatus(Enum contractStatus) {
            this.contractStatus = contractStatus;
            return this;
        }


        /**
         * 续签状态，枚举值可通过文档【飞书人事枚举常量】续签状态（renewal_status）枚举定义部分获得
         * <p> 示例值：
         *
         * @param renewalStatus
         * @return
         */
        public Builder renewalStatus(Enum renewalStatus) {
            this.renewalStatus = renewalStatus;
            return this;
        }


        /**
         * 第几次签署
         * <p> 示例值：1
         *
         * @param signingTimes
         * @return
         */
        public Builder signingTimes(Integer signingTimes) {
            this.signingTimes = signingTimes;
            return this;
        }


        public Contract build() {
            return new Contract(this);
        }
    }
}
