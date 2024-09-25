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

import com.google.gson.annotations.SerializedName;

public class SocialInsurance {
    /**
     * 险种唯一ID
     * <p> 示例值：i12345
     */
    @SerializedName("id")
    private String id;
    /**
     * 险种名称
     * <p> 示例值：
     */
    @SerializedName("name")
    private I18n name;
    /**
     * 险种类型. social_insurance: 社保; provident_fund: 公积金
     * <p> 示例值：true
     */
    @SerializedName("insurance_type")
    private String insuranceType;
    /**
     * 启用状态
     * <p> 示例值：
     */
    @SerializedName("active")
    private Boolean active;
    /**
     * 是否为系统预置险种。养老保险、医疗保险、失业保险、工伤保险、生育保险、住房公积金为系统预置险种。
     * <p> 示例值：
     */
    @SerializedName("is_system")
    private Boolean isSystem;

    // builder 开始
    public SocialInsurance() {
    }

    public SocialInsurance(Builder builder) {
        /**
         * 险种唯一ID
         * <p> 示例值：i12345
         */
        this.id = builder.id;
        /**
         * 险种名称
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 险种类型. social_insurance: 社保; provident_fund: 公积金
         * <p> 示例值：true
         */
        this.insuranceType = builder.insuranceType;
        /**
         * 启用状态
         * <p> 示例值：
         */
        this.active = builder.active;
        /**
         * 是否为系统预置险种。养老保险、医疗保险、失业保险、工伤保险、生育保险、住房公积金为系统预置险种。
         * <p> 示例值：
         */
        this.isSystem = builder.isSystem;
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

    public I18n getName() {
        return this.name;
    }

    public void setName(I18n name) {
        this.name = name;
    }

    public String getInsuranceType() {
        return this.insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getIsSystem() {
        return this.isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    public static class Builder {
        /**
         * 险种唯一ID
         * <p> 示例值：i12345
         */
        private String id;
        /**
         * 险种名称
         * <p> 示例值：
         */
        private I18n name;
        /**
         * 险种类型. social_insurance: 社保; provident_fund: 公积金
         * <p> 示例值：true
         */
        private String insuranceType;
        /**
         * 启用状态
         * <p> 示例值：
         */
        private Boolean active;
        /**
         * 是否为系统预置险种。养老保险、医疗保险、失业保险、工伤保险、生育保险、住房公积金为系统预置险种。
         * <p> 示例值：
         */
        private Boolean isSystem;

        /**
         * 险种唯一ID
         * <p> 示例值：i12345
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 险种名称
         * <p> 示例值：
         *
         * @param name
         * @return
         */
        public Builder name(I18n name) {
            this.name = name;
            return this;
        }


        /**
         * 险种类型. social_insurance: 社保; provident_fund: 公积金
         * <p> 示例值：true
         *
         * @param insuranceType
         * @return
         */
        public Builder insuranceType(String insuranceType) {
            this.insuranceType = insuranceType;
            return this;
        }

        /**
         * 险种类型. social_insurance: 社保; provident_fund: 公积金
         * <p> 示例值：true
         *
         * @param insuranceType {@link com.lark.oapi.service.compensation.v1.enums.SocialInsuranceInsuranceTypeEnum}
         * @return
         */
        public Builder insuranceType(com.lark.oapi.service.compensation.v1.enums.SocialInsuranceInsuranceTypeEnum insuranceType) {
            this.insuranceType = insuranceType.getValue();
            return this;
        }


        /**
         * 启用状态
         * <p> 示例值：
         *
         * @param active
         * @return
         */
        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }


        /**
         * 是否为系统预置险种。养老保险、医疗保险、失业保险、工伤保险、生育保险、住房公积金为系统预置险种。
         * <p> 示例值：
         *
         * @param isSystem
         * @return
         */
        public Builder isSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            return this;
        }


        public SocialInsurance build() {
            return new SocialInsurance(this);
        }
    }
}
