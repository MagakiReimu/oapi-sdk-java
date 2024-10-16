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

package com.lark.oapi.service.mdm.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.mdm.v1.enums.*;
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

public class VendorAccount {
    /**
     * 交易方银行账户id,修改信息时当前的账户id均必填，新增的账户id不填
     * <p> 示例值：1453263653228318721
     */
    @SerializedName("id")
    private String id;
    /**
     * 账号
     * <p> 示例值：62448345986564434
     */
    @SerializedName("account")
    private String account;
    /**
     * 国际银行账号
     * <p> 示例值：46677
     */
    @SerializedName("iban")
    private String iban;
    /**
     * 账户名
     * <p> 示例值：上海xxx技术有限（上海）分公司
     */
    @SerializedName("account_name")
    private String accountName;
    /**
     * 银行内部Id
     * <p> 示例值：MDBK00061195
     */
    @SerializedName("bank_id")
    private String bankId;
    /**
     * 银联号
     * <p> 示例值：308290003732
     */
    @SerializedName("bank_code")
    private String bankCode;
    /**
     * 银行Swift编码
     * <p> 示例值：BOFAUS3NINQ
     */
    @SerializedName("swift_code")
    private String swiftCode;
    /**
     * 交易方siteCode
     * <p> 示例值：99999999
     */
    @SerializedName("vendor_site_code")
    private String vendorSiteCode;
    /**
     * 银行名称
     * <p> 示例值：xx银行股份有限公司苏州支行
     */
    @SerializedName("bank_name")
    private String bankName;
    /**
     * 银行简码
     * <p> 示例值：ZJTLCB
     */
    @SerializedName("bank_acronym")
    private String bankAcronym;
    /**
     * 国家
     * <p> 示例值：CN
     */
    @SerializedName("country")
    private String country;
    /**
     * 银行控制码
     * <p> 示例值：99999999
     */
    @SerializedName("bank_control_code")
    private String bankControlCode;
    /**
     * 扩展字段相关信息列表
     * <p> 示例值：
     */
    @SerializedName("extend_info")
    private ExtendField[] extendInfo;

    // builder 开始
    public VendorAccount() {
    }

    public VendorAccount(Builder builder) {
        /**
         * 交易方银行账户id,修改信息时当前的账户id均必填，新增的账户id不填
         * <p> 示例值：1453263653228318721
         */
        this.id = builder.id;
        /**
         * 账号
         * <p> 示例值：62448345986564434
         */
        this.account = builder.account;
        /**
         * 国际银行账号
         * <p> 示例值：46677
         */
        this.iban = builder.iban;
        /**
         * 账户名
         * <p> 示例值：上海xxx技术有限（上海）分公司
         */
        this.accountName = builder.accountName;
        /**
         * 银行内部Id
         * <p> 示例值：MDBK00061195
         */
        this.bankId = builder.bankId;
        /**
         * 银联号
         * <p> 示例值：308290003732
         */
        this.bankCode = builder.bankCode;
        /**
         * 银行Swift编码
         * <p> 示例值：BOFAUS3NINQ
         */
        this.swiftCode = builder.swiftCode;
        /**
         * 交易方siteCode
         * <p> 示例值：99999999
         */
        this.vendorSiteCode = builder.vendorSiteCode;
        /**
         * 银行名称
         * <p> 示例值：xx银行股份有限公司苏州支行
         */
        this.bankName = builder.bankName;
        /**
         * 银行简码
         * <p> 示例值：ZJTLCB
         */
        this.bankAcronym = builder.bankAcronym;
        /**
         * 国家
         * <p> 示例值：CN
         */
        this.country = builder.country;
        /**
         * 银行控制码
         * <p> 示例值：99999999
         */
        this.bankControlCode = builder.bankControlCode;
        /**
         * 扩展字段相关信息列表
         * <p> 示例值：
         */
        this.extendInfo = builder.extendInfo;
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

    public String getAccount() {
        return this.account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getIban() {
        return this.iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getBankId() {
        return this.bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getBankCode() {
        return this.bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getSwiftCode() {
        return this.swiftCode;
    }

    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }

    public String getVendorSiteCode() {
        return this.vendorSiteCode;
    }

    public void setVendorSiteCode(String vendorSiteCode) {
        this.vendorSiteCode = vendorSiteCode;
    }

    public String getBankName() {
        return this.bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAcronym() {
        return this.bankAcronym;
    }

    public void setBankAcronym(String bankAcronym) {
        this.bankAcronym = bankAcronym;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBankControlCode() {
        return this.bankControlCode;
    }

    public void setBankControlCode(String bankControlCode) {
        this.bankControlCode = bankControlCode;
    }

    public ExtendField[] getExtendInfo() {
        return this.extendInfo;
    }

    public void setExtendInfo(ExtendField[] extendInfo) {
        this.extendInfo = extendInfo;
    }

    public static class Builder {
        /**
         * 交易方银行账户id,修改信息时当前的账户id均必填，新增的账户id不填
         * <p> 示例值：1453263653228318721
         */
        private String id;
        /**
         * 账号
         * <p> 示例值：62448345986564434
         */
        private String account;
        /**
         * 国际银行账号
         * <p> 示例值：46677
         */
        private String iban;
        /**
         * 账户名
         * <p> 示例值：上海xxx技术有限（上海）分公司
         */
        private String accountName;
        /**
         * 银行内部Id
         * <p> 示例值：MDBK00061195
         */
        private String bankId;
        /**
         * 银联号
         * <p> 示例值：308290003732
         */
        private String bankCode;
        /**
         * 银行Swift编码
         * <p> 示例值：BOFAUS3NINQ
         */
        private String swiftCode;
        /**
         * 交易方siteCode
         * <p> 示例值：99999999
         */
        private String vendorSiteCode;
        /**
         * 银行名称
         * <p> 示例值：xx银行股份有限公司苏州支行
         */
        private String bankName;
        /**
         * 银行简码
         * <p> 示例值：ZJTLCB
         */
        private String bankAcronym;
        /**
         * 国家
         * <p> 示例值：CN
         */
        private String country;
        /**
         * 银行控制码
         * <p> 示例值：99999999
         */
        private String bankControlCode;
        /**
         * 扩展字段相关信息列表
         * <p> 示例值：
         */
        private ExtendField[] extendInfo;

        /**
         * 交易方银行账户id,修改信息时当前的账户id均必填，新增的账户id不填
         * <p> 示例值：1453263653228318721
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 账号
         * <p> 示例值：62448345986564434
         *
         * @param account
         * @return
         */
        public Builder account(String account) {
            this.account = account;
            return this;
        }


        /**
         * 国际银行账号
         * <p> 示例值：46677
         *
         * @param iban
         * @return
         */
        public Builder iban(String iban) {
            this.iban = iban;
            return this;
        }


        /**
         * 账户名
         * <p> 示例值：上海xxx技术有限（上海）分公司
         *
         * @param accountName
         * @return
         */
        public Builder accountName(String accountName) {
            this.accountName = accountName;
            return this;
        }


        /**
         * 银行内部Id
         * <p> 示例值：MDBK00061195
         *
         * @param bankId
         * @return
         */
        public Builder bankId(String bankId) {
            this.bankId = bankId;
            return this;
        }


        /**
         * 银联号
         * <p> 示例值：308290003732
         *
         * @param bankCode
         * @return
         */
        public Builder bankCode(String bankCode) {
            this.bankCode = bankCode;
            return this;
        }


        /**
         * 银行Swift编码
         * <p> 示例值：BOFAUS3NINQ
         *
         * @param swiftCode
         * @return
         */
        public Builder swiftCode(String swiftCode) {
            this.swiftCode = swiftCode;
            return this;
        }


        /**
         * 交易方siteCode
         * <p> 示例值：99999999
         *
         * @param vendorSiteCode
         * @return
         */
        public Builder vendorSiteCode(String vendorSiteCode) {
            this.vendorSiteCode = vendorSiteCode;
            return this;
        }


        /**
         * 银行名称
         * <p> 示例值：xx银行股份有限公司苏州支行
         *
         * @param bankName
         * @return
         */
        public Builder bankName(String bankName) {
            this.bankName = bankName;
            return this;
        }


        /**
         * 银行简码
         * <p> 示例值：ZJTLCB
         *
         * @param bankAcronym
         * @return
         */
        public Builder bankAcronym(String bankAcronym) {
            this.bankAcronym = bankAcronym;
            return this;
        }


        /**
         * 国家
         * <p> 示例值：CN
         *
         * @param country
         * @return
         */
        public Builder country(String country) {
            this.country = country;
            return this;
        }


        /**
         * 银行控制码
         * <p> 示例值：99999999
         *
         * @param bankControlCode
         * @return
         */
        public Builder bankControlCode(String bankControlCode) {
            this.bankControlCode = bankControlCode;
            return this;
        }


        /**
         * 扩展字段相关信息列表
         * <p> 示例值：
         *
         * @param extendInfo
         * @return
         */
        public Builder extendInfo(ExtendField[] extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }


        public VendorAccount build() {
            return new VendorAccount(this);
        }
    }
}
