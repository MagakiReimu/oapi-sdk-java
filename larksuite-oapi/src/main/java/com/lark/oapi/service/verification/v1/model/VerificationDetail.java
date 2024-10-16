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

package com.lark.oapi.service.verification.v1.model;

import com.lark.oapi.core.response.EmptyData;
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

public class VerificationDetail {
    /**
     * 认证类型
     * <p> 示例值：
     */
    @SerializedName("verification_type")
    private Integer verificationType;
    /**
     * 认证方式
     * <p> 示例值：
     */
    @SerializedName("verification_source")
    private Integer verificationSource;
    /**
     * 工商名称
     * <p> 示例值：未来有限公司
     */
    @SerializedName("org_name")
    private String orgName;
    /**
     * 统一工商信用代码
     * <p> 示例值：xxxx
     */
    @SerializedName("usci")
    private String usci;
    /**
     * 企业类型
     * <p> 示例值：
     */
    @SerializedName("org_type")
    private Integer orgType;
    /**
     * 法人姓名
     * <p> 示例值：张三
     */
    @SerializedName("legal_person_name")
    private String legalPersonName;
    /**
     * 企业经营许可证
     * <p> 示例值：https://xxx
     */
    @SerializedName("enterprise_license")
    private String enterpriseLicense;
    /**
     * 认证公函
     * <p> 示例值：https://xxx
     */
    @SerializedName("verification_letter")
    private String verificationLetter;

    // builder 开始
    public VerificationDetail() {
    }

    public VerificationDetail(Builder builder) {
        /**
         * 认证类型
         * <p> 示例值：
         */
        this.verificationType = builder.verificationType;
        /**
         * 认证方式
         * <p> 示例值：
         */
        this.verificationSource = builder.verificationSource;
        /**
         * 工商名称
         * <p> 示例值：未来有限公司
         */
        this.orgName = builder.orgName;
        /**
         * 统一工商信用代码
         * <p> 示例值：xxxx
         */
        this.usci = builder.usci;
        /**
         * 企业类型
         * <p> 示例值：
         */
        this.orgType = builder.orgType;
        /**
         * 法人姓名
         * <p> 示例值：张三
         */
        this.legalPersonName = builder.legalPersonName;
        /**
         * 企业经营许可证
         * <p> 示例值：https://xxx
         */
        this.enterpriseLicense = builder.enterpriseLicense;
        /**
         * 认证公函
         * <p> 示例值：https://xxx
         */
        this.verificationLetter = builder.verificationLetter;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getVerificationType() {
        return this.verificationType;
    }

    public void setVerificationType(Integer verificationType) {
        this.verificationType = verificationType;
    }

    public Integer getVerificationSource() {
        return this.verificationSource;
    }

    public void setVerificationSource(Integer verificationSource) {
        this.verificationSource = verificationSource;
    }

    public String getOrgName() {
        return this.orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getUsci() {
        return this.usci;
    }

    public void setUsci(String usci) {
        this.usci = usci;
    }

    public Integer getOrgType() {
        return this.orgType;
    }

    public void setOrgType(Integer orgType) {
        this.orgType = orgType;
    }

    public String getLegalPersonName() {
        return this.legalPersonName;
    }

    public void setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
    }

    public String getEnterpriseLicense() {
        return this.enterpriseLicense;
    }

    public void setEnterpriseLicense(String enterpriseLicense) {
        this.enterpriseLicense = enterpriseLicense;
    }

    public String getVerificationLetter() {
        return this.verificationLetter;
    }

    public void setVerificationLetter(String verificationLetter) {
        this.verificationLetter = verificationLetter;
    }

    public static class Builder {
        /**
         * 认证类型
         * <p> 示例值：
         */
        private Integer verificationType;
        /**
         * 认证方式
         * <p> 示例值：
         */
        private Integer verificationSource;
        /**
         * 工商名称
         * <p> 示例值：未来有限公司
         */
        private String orgName;
        /**
         * 统一工商信用代码
         * <p> 示例值：xxxx
         */
        private String usci;
        /**
         * 企业类型
         * <p> 示例值：
         */
        private Integer orgType;
        /**
         * 法人姓名
         * <p> 示例值：张三
         */
        private String legalPersonName;
        /**
         * 企业经营许可证
         * <p> 示例值：https://xxx
         */
        private String enterpriseLicense;
        /**
         * 认证公函
         * <p> 示例值：https://xxx
         */
        private String verificationLetter;

        /**
         * 认证类型
         * <p> 示例值：
         *
         * @param verificationType
         * @return
         */
        public Builder verificationType(Integer verificationType) {
            this.verificationType = verificationType;
            return this;
        }


        /**
         * 认证方式
         * <p> 示例值：
         *
         * @param verificationSource
         * @return
         */
        public Builder verificationSource(Integer verificationSource) {
            this.verificationSource = verificationSource;
            return this;
        }


        /**
         * 工商名称
         * <p> 示例值：未来有限公司
         *
         * @param orgName
         * @return
         */
        public Builder orgName(String orgName) {
            this.orgName = orgName;
            return this;
        }


        /**
         * 统一工商信用代码
         * <p> 示例值：xxxx
         *
         * @param usci
         * @return
         */
        public Builder usci(String usci) {
            this.usci = usci;
            return this;
        }


        /**
         * 企业类型
         * <p> 示例值：
         *
         * @param orgType
         * @return
         */
        public Builder orgType(Integer orgType) {
            this.orgType = orgType;
            return this;
        }


        /**
         * 法人姓名
         * <p> 示例值：张三
         *
         * @param legalPersonName
         * @return
         */
        public Builder legalPersonName(String legalPersonName) {
            this.legalPersonName = legalPersonName;
            return this;
        }


        /**
         * 企业经营许可证
         * <p> 示例值：https://xxx
         *
         * @param enterpriseLicense
         * @return
         */
        public Builder enterpriseLicense(String enterpriseLicense) {
            this.enterpriseLicense = enterpriseLicense;
            return this;
        }


        /**
         * 认证公函
         * <p> 示例值：https://xxx
         *
         * @param verificationLetter
         * @return
         */
        public Builder verificationLetter(String verificationLetter) {
            this.verificationLetter = verificationLetter;
            return this;
        }


        public VerificationDetail build() {
            return new VerificationDetail(this);
        }
    }
}
