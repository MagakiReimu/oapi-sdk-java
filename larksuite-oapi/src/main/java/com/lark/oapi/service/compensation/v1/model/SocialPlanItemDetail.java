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

public class SocialPlanItemDetail {
    /**
     * 险种ID，详细信息可通过社保险种接口查询
     * <p> 示例值：123456
     */
    @SerializedName("item_id")
    private String itemId;
    /**
     * 险种名
     * <p> 示例值：
     */
    @SerializedName("item_name")
    private I18n itemName;
    /**
     * 险种缴纳配置
     * <p> 示例值：
     */
    @SerializedName("item_setting_of_person")
    private SocialPlanItemSetting itemSettingOfPerson;
    /**
     * 险种缴纳配置
     * <p> 示例值：
     */
    @SerializedName("item_setting_of_company")
    private SocialPlanItemSetting itemSettingOfCompany;
    /**
     * 缴纳频率
     * <p> 示例值：8.00
     */
    @SerializedName("payment_frequency")
    private String paymentFrequency;
    /**
     * 缴纳月份
     * <p> 示例值：
     */
    @SerializedName("payment_months")
    private Integer[] paymentMonths;

    // builder 开始
    public SocialPlanItemDetail() {
    }

    public SocialPlanItemDetail(Builder builder) {
        /**
         * 险种ID，详细信息可通过社保险种接口查询
         * <p> 示例值：123456
         */
        this.itemId = builder.itemId;
        /**
         * 险种名
         * <p> 示例值：
         */
        this.itemName = builder.itemName;
        /**
         * 险种缴纳配置
         * <p> 示例值：
         */
        this.itemSettingOfPerson = builder.itemSettingOfPerson;
        /**
         * 险种缴纳配置
         * <p> 示例值：
         */
        this.itemSettingOfCompany = builder.itemSettingOfCompany;
        /**
         * 缴纳频率
         * <p> 示例值：8.00
         */
        this.paymentFrequency = builder.paymentFrequency;
        /**
         * 缴纳月份
         * <p> 示例值：
         */
        this.paymentMonths = builder.paymentMonths;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public I18n getItemName() {
        return this.itemName;
    }

    public void setItemName(I18n itemName) {
        this.itemName = itemName;
    }

    public SocialPlanItemSetting getItemSettingOfPerson() {
        return this.itemSettingOfPerson;
    }

    public void setItemSettingOfPerson(SocialPlanItemSetting itemSettingOfPerson) {
        this.itemSettingOfPerson = itemSettingOfPerson;
    }

    public SocialPlanItemSetting getItemSettingOfCompany() {
        return this.itemSettingOfCompany;
    }

    public void setItemSettingOfCompany(SocialPlanItemSetting itemSettingOfCompany) {
        this.itemSettingOfCompany = itemSettingOfCompany;
    }

    public String getPaymentFrequency() {
        return this.paymentFrequency;
    }

    public void setPaymentFrequency(String paymentFrequency) {
        this.paymentFrequency = paymentFrequency;
    }

    public Integer[] getPaymentMonths() {
        return this.paymentMonths;
    }

    public void setPaymentMonths(Integer[] paymentMonths) {
        this.paymentMonths = paymentMonths;
    }

    public static class Builder {
        /**
         * 险种ID，详细信息可通过社保险种接口查询
         * <p> 示例值：123456
         */
        private String itemId;
        /**
         * 险种名
         * <p> 示例值：
         */
        private I18n itemName;
        /**
         * 险种缴纳配置
         * <p> 示例值：
         */
        private SocialPlanItemSetting itemSettingOfPerson;
        /**
         * 险种缴纳配置
         * <p> 示例值：
         */
        private SocialPlanItemSetting itemSettingOfCompany;
        /**
         * 缴纳频率
         * <p> 示例值：8.00
         */
        private String paymentFrequency;
        /**
         * 缴纳月份
         * <p> 示例值：
         */
        private Integer[] paymentMonths;

        /**
         * 险种ID，详细信息可通过社保险种接口查询
         * <p> 示例值：123456
         *
         * @param itemId
         * @return
         */
        public Builder itemId(String itemId) {
            this.itemId = itemId;
            return this;
        }


        /**
         * 险种名
         * <p> 示例值：
         *
         * @param itemName
         * @return
         */
        public Builder itemName(I18n itemName) {
            this.itemName = itemName;
            return this;
        }


        /**
         * 险种缴纳配置
         * <p> 示例值：
         *
         * @param itemSettingOfPerson
         * @return
         */
        public Builder itemSettingOfPerson(SocialPlanItemSetting itemSettingOfPerson) {
            this.itemSettingOfPerson = itemSettingOfPerson;
            return this;
        }


        /**
         * 险种缴纳配置
         * <p> 示例值：
         *
         * @param itemSettingOfCompany
         * @return
         */
        public Builder itemSettingOfCompany(SocialPlanItemSetting itemSettingOfCompany) {
            this.itemSettingOfCompany = itemSettingOfCompany;
            return this;
        }


        /**
         * 缴纳频率
         * <p> 示例值：8.00
         *
         * @param paymentFrequency
         * @return
         */
        public Builder paymentFrequency(String paymentFrequency) {
            this.paymentFrequency = paymentFrequency;
            return this;
        }

        /**
         * 缴纳频率
         * <p> 示例值：8.00
         *
         * @param paymentFrequency {@link com.lark.oapi.service.compensation.v1.enums.SocialPlanItemDetailPaymentFrequencyEnum}
         * @return
         */
        public Builder paymentFrequency(com.lark.oapi.service.compensation.v1.enums.SocialPlanItemDetailPaymentFrequencyEnum paymentFrequency) {
            this.paymentFrequency = paymentFrequency.getValue();
            return this;
        }


        /**
         * 缴纳月份
         * <p> 示例值：
         *
         * @param paymentMonths
         * @return
         */
        public Builder paymentMonths(Integer[] paymentMonths) {
            this.paymentMonths = paymentMonths;
            return this;
        }


        public SocialPlanItemDetail build() {
            return new SocialPlanItemDetail(this);
        }
    }
}
