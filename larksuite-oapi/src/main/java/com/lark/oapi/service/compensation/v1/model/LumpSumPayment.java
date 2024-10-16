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

public class LumpSumPayment {
    /**
     * 一次性支付记录id
     * <p> 示例值：7397033607132351532
     */
    @SerializedName("id")
    private String id;
    /**
     * 外部幂等id，由上游业务决定
     * <p> 示例值：7402510801304718380_7309316347007764012_7402523725868058156_1726070400000_10000
     */
    @SerializedName("unique_id")
    private String uniqueId;
    /**
     * 员工id，具体类型由入参中的 user_id_type 指定
     * <p> 示例值：7337149697626801708
     */
    @SerializedName("user_id")
    private String userId;
    /**
     * 总金额，字符串表达的数字
     * <p> 示例值：2000.00
     */
    @SerializedName("total_amount")
    private String totalAmount;
    /**
     * 绑定期，单位为月
     * <p> 示例值：2
     */
    @SerializedName("binding_period")
    private Integer bindingPeriod;
    /**
     * 币种id
     * <p> 示例值：6863329932261459464
     */
    @SerializedName("currency_id")
    private String currencyId;
    /**
     * 发放次数
     * <p> 示例值：3
     */
    @SerializedName("issuance_frequency")
    private Integer issuanceFrequency;
    /**
     * 授予日期
     * <p> 示例值：2024-08-01
     */
    @SerializedName("grant_date")
    private String grantDate;
    /**
     * 薪酬项id
     * <p> 示例值：7411039006180312620
     */
    @SerializedName("item_id")
    private String itemId;
    /**
     * 备注
     * <p> 示例值：备注
     */
    @SerializedName("remark")
    private String remark;
    /**
     * 发放规则描述文本
     * <p> 示例值：
     */
    @SerializedName("issuance_detail_text")
    private I18n issuanceDetailText;
    /**
     * 申请来源
     * <p> 示例值：1
     */
    @SerializedName("apply_source")
    private Integer applySource;
    /**
     * 创建时间
     * <p> 示例值：2024-08-01 12:34:56
     */
    @SerializedName("create_time")
    private String createTime;
    /**
     * 更新时间
     * <p> 示例值：2024-08-01 12:34:56
     */
    @SerializedName("modify_time")
    private String modifyTime;
    /**
     * 发放明细列表
     * <p> 示例值：
     */
    @SerializedName("details")
    private LumpSumPaymentDetail[] details;

    // builder 开始
    public LumpSumPayment() {
    }

    public LumpSumPayment(Builder builder) {
        /**
         * 一次性支付记录id
         * <p> 示例值：7397033607132351532
         */
        this.id = builder.id;
        /**
         * 外部幂等id，由上游业务决定
         * <p> 示例值：7402510801304718380_7309316347007764012_7402523725868058156_1726070400000_10000
         */
        this.uniqueId = builder.uniqueId;
        /**
         * 员工id，具体类型由入参中的 user_id_type 指定
         * <p> 示例值：7337149697626801708
         */
        this.userId = builder.userId;
        /**
         * 总金额，字符串表达的数字
         * <p> 示例值：2000.00
         */
        this.totalAmount = builder.totalAmount;
        /**
         * 绑定期，单位为月
         * <p> 示例值：2
         */
        this.bindingPeriod = builder.bindingPeriod;
        /**
         * 币种id
         * <p> 示例值：6863329932261459464
         */
        this.currencyId = builder.currencyId;
        /**
         * 发放次数
         * <p> 示例值：3
         */
        this.issuanceFrequency = builder.issuanceFrequency;
        /**
         * 授予日期
         * <p> 示例值：2024-08-01
         */
        this.grantDate = builder.grantDate;
        /**
         * 薪酬项id
         * <p> 示例值：7411039006180312620
         */
        this.itemId = builder.itemId;
        /**
         * 备注
         * <p> 示例值：备注
         */
        this.remark = builder.remark;
        /**
         * 发放规则描述文本
         * <p> 示例值：
         */
        this.issuanceDetailText = builder.issuanceDetailText;
        /**
         * 申请来源
         * <p> 示例值：1
         */
        this.applySource = builder.applySource;
        /**
         * 创建时间
         * <p> 示例值：2024-08-01 12:34:56
         */
        this.createTime = builder.createTime;
        /**
         * 更新时间
         * <p> 示例值：2024-08-01 12:34:56
         */
        this.modifyTime = builder.modifyTime;
        /**
         * 发放明细列表
         * <p> 示例值：
         */
        this.details = builder.details;
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

    public String getUniqueId() {
        return this.uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTotalAmount() {
        return this.totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getBindingPeriod() {
        return this.bindingPeriod;
    }

    public void setBindingPeriod(Integer bindingPeriod) {
        this.bindingPeriod = bindingPeriod;
    }

    public String getCurrencyId() {
        return this.currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public Integer getIssuanceFrequency() {
        return this.issuanceFrequency;
    }

    public void setIssuanceFrequency(Integer issuanceFrequency) {
        this.issuanceFrequency = issuanceFrequency;
    }

    public String getGrantDate() {
        return this.grantDate;
    }

    public void setGrantDate(String grantDate) {
        this.grantDate = grantDate;
    }

    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public I18n getIssuanceDetailText() {
        return this.issuanceDetailText;
    }

    public void setIssuanceDetailText(I18n issuanceDetailText) {
        this.issuanceDetailText = issuanceDetailText;
    }

    public Integer getApplySource() {
        return this.applySource;
    }

    public void setApplySource(Integer applySource) {
        this.applySource = applySource;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifyTime() {
        return this.modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public LumpSumPaymentDetail[] getDetails() {
        return this.details;
    }

    public void setDetails(LumpSumPaymentDetail[] details) {
        this.details = details;
    }

    public static class Builder {
        /**
         * 一次性支付记录id
         * <p> 示例值：7397033607132351532
         */
        private String id;
        /**
         * 外部幂等id，由上游业务决定
         * <p> 示例值：7402510801304718380_7309316347007764012_7402523725868058156_1726070400000_10000
         */
        private String uniqueId;
        /**
         * 员工id，具体类型由入参中的 user_id_type 指定
         * <p> 示例值：7337149697626801708
         */
        private String userId;
        /**
         * 总金额，字符串表达的数字
         * <p> 示例值：2000.00
         */
        private String totalAmount;
        /**
         * 绑定期，单位为月
         * <p> 示例值：2
         */
        private Integer bindingPeriod;
        /**
         * 币种id
         * <p> 示例值：6863329932261459464
         */
        private String currencyId;
        /**
         * 发放次数
         * <p> 示例值：3
         */
        private Integer issuanceFrequency;
        /**
         * 授予日期
         * <p> 示例值：2024-08-01
         */
        private String grantDate;
        /**
         * 薪酬项id
         * <p> 示例值：7411039006180312620
         */
        private String itemId;
        /**
         * 备注
         * <p> 示例值：备注
         */
        private String remark;
        /**
         * 发放规则描述文本
         * <p> 示例值：
         */
        private I18n issuanceDetailText;
        /**
         * 申请来源
         * <p> 示例值：1
         */
        private Integer applySource;
        /**
         * 创建时间
         * <p> 示例值：2024-08-01 12:34:56
         */
        private String createTime;
        /**
         * 更新时间
         * <p> 示例值：2024-08-01 12:34:56
         */
        private String modifyTime;
        /**
         * 发放明细列表
         * <p> 示例值：
         */
        private LumpSumPaymentDetail[] details;

        /**
         * 一次性支付记录id
         * <p> 示例值：7397033607132351532
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 外部幂等id，由上游业务决定
         * <p> 示例值：7402510801304718380_7309316347007764012_7402523725868058156_1726070400000_10000
         *
         * @param uniqueId
         * @return
         */
        public Builder uniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }


        /**
         * 员工id，具体类型由入参中的 user_id_type 指定
         * <p> 示例值：7337149697626801708
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        /**
         * 总金额，字符串表达的数字
         * <p> 示例值：2000.00
         *
         * @param totalAmount
         * @return
         */
        public Builder totalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }


        /**
         * 绑定期，单位为月
         * <p> 示例值：2
         *
         * @param bindingPeriod
         * @return
         */
        public Builder bindingPeriod(Integer bindingPeriod) {
            this.bindingPeriod = bindingPeriod;
            return this;
        }


        /**
         * 币种id
         * <p> 示例值：6863329932261459464
         *
         * @param currencyId
         * @return
         */
        public Builder currencyId(String currencyId) {
            this.currencyId = currencyId;
            return this;
        }


        /**
         * 发放次数
         * <p> 示例值：3
         *
         * @param issuanceFrequency
         * @return
         */
        public Builder issuanceFrequency(Integer issuanceFrequency) {
            this.issuanceFrequency = issuanceFrequency;
            return this;
        }


        /**
         * 授予日期
         * <p> 示例值：2024-08-01
         *
         * @param grantDate
         * @return
         */
        public Builder grantDate(String grantDate) {
            this.grantDate = grantDate;
            return this;
        }


        /**
         * 薪酬项id
         * <p> 示例值：7411039006180312620
         *
         * @param itemId
         * @return
         */
        public Builder itemId(String itemId) {
            this.itemId = itemId;
            return this;
        }


        /**
         * 备注
         * <p> 示例值：备注
         *
         * @param remark
         * @return
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }


        /**
         * 发放规则描述文本
         * <p> 示例值：
         *
         * @param issuanceDetailText
         * @return
         */
        public Builder issuanceDetailText(I18n issuanceDetailText) {
            this.issuanceDetailText = issuanceDetailText;
            return this;
        }


        /**
         * 申请来源
         * <p> 示例值：1
         *
         * @param applySource
         * @return
         */
        public Builder applySource(Integer applySource) {
            this.applySource = applySource;
            return this;
        }

        /**
         * 申请来源
         * <p> 示例值：1
         *
         * @param applySource {@link com.lark.oapi.service.compensation.v1.enums.LumpSumPaymentApplySourceEnum}
         * @return
         */
        public Builder applySource(com.lark.oapi.service.compensation.v1.enums.LumpSumPaymentApplySourceEnum applySource) {
            this.applySource = applySource.getValue();
            return this;
        }


        /**
         * 创建时间
         * <p> 示例值：2024-08-01 12:34:56
         *
         * @param createTime
         * @return
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }


        /**
         * 更新时间
         * <p> 示例值：2024-08-01 12:34:56
         *
         * @param modifyTime
         * @return
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }


        /**
         * 发放明细列表
         * <p> 示例值：
         *
         * @param details
         * @return
         */
        public Builder details(LumpSumPaymentDetail[] details) {
            this.details = details;
            return this;
        }


        public LumpSumPayment build() {
            return new LumpSumPayment(this);
        }
    }
}
