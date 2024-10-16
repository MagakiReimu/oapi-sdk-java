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

public class CheckFailedAccountInfo {
    /**
     * 账户ID
     * <p> 示例值：6930815272790114324
     */
    @SerializedName("account_id")
    private String accountId;
    /**
     * 招聘系统内的提取金额
     * <p> 示例值：
     */
    @SerializedName("total_withdraw_reward_info")
    private BonusAmount totalWithdrawRewardInfo;
    /**
     * 商城实际充值金额
     * <p> 示例值：
     */
    @SerializedName("total_recharge_reward_info")
    private BonusAmount totalRechargeRewardInfo;

    // builder 开始
    public CheckFailedAccountInfo() {
    }

    public CheckFailedAccountInfo(Builder builder) {
        /**
         * 账户ID
         * <p> 示例值：6930815272790114324
         */
        this.accountId = builder.accountId;
        /**
         * 招聘系统内的提取金额
         * <p> 示例值：
         */
        this.totalWithdrawRewardInfo = builder.totalWithdrawRewardInfo;
        /**
         * 商城实际充值金额
         * <p> 示例值：
         */
        this.totalRechargeRewardInfo = builder.totalRechargeRewardInfo;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getAccountId() {
        return this.accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public BonusAmount getTotalWithdrawRewardInfo() {
        return this.totalWithdrawRewardInfo;
    }

    public void setTotalWithdrawRewardInfo(BonusAmount totalWithdrawRewardInfo) {
        this.totalWithdrawRewardInfo = totalWithdrawRewardInfo;
    }

    public BonusAmount getTotalRechargeRewardInfo() {
        return this.totalRechargeRewardInfo;
    }

    public void setTotalRechargeRewardInfo(BonusAmount totalRechargeRewardInfo) {
        this.totalRechargeRewardInfo = totalRechargeRewardInfo;
    }

    public static class Builder {
        /**
         * 账户ID
         * <p> 示例值：6930815272790114324
         */
        private String accountId;
        /**
         * 招聘系统内的提取金额
         * <p> 示例值：
         */
        private BonusAmount totalWithdrawRewardInfo;
        /**
         * 商城实际充值金额
         * <p> 示例值：
         */
        private BonusAmount totalRechargeRewardInfo;

        /**
         * 账户ID
         * <p> 示例值：6930815272790114324
         *
         * @param accountId
         * @return
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }


        /**
         * 招聘系统内的提取金额
         * <p> 示例值：
         *
         * @param totalWithdrawRewardInfo
         * @return
         */
        public Builder totalWithdrawRewardInfo(BonusAmount totalWithdrawRewardInfo) {
            this.totalWithdrawRewardInfo = totalWithdrawRewardInfo;
            return this;
        }


        /**
         * 商城实际充值金额
         * <p> 示例值：
         *
         * @param totalRechargeRewardInfo
         * @return
         */
        public Builder totalRechargeRewardInfo(BonusAmount totalRechargeRewardInfo) {
            this.totalRechargeRewardInfo = totalRechargeRewardInfo;
            return this;
        }


        public CheckFailedAccountInfo build() {
            return new CheckFailedAccountInfo(this);
        }
    }
}
