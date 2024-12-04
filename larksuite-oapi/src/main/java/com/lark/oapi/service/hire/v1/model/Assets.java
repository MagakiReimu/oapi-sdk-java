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

public class Assets {
    /**
     * 已确认的奖励
     * <p> 示例值：
     */
    @SerializedName("confirmed_bonus")
    private BonusAmount confirmedBonus;
    /**
     * 已发放的奖励
     * <p> 示例值：
     */
    @SerializedName("paid_bonus")
    private BonusAmount paidBonus;

    // builder 开始
    public Assets() {
    }

    public Assets(Builder builder) {
        /**
         * 已确认的奖励
         * <p> 示例值：
         */
        this.confirmedBonus = builder.confirmedBonus;
        /**
         * 已发放的奖励
         * <p> 示例值：
         */
        this.paidBonus = builder.paidBonus;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public BonusAmount getConfirmedBonus() {
        return this.confirmedBonus;
    }

    public void setConfirmedBonus(BonusAmount confirmedBonus) {
        this.confirmedBonus = confirmedBonus;
    }

    public BonusAmount getPaidBonus() {
        return this.paidBonus;
    }

    public void setPaidBonus(BonusAmount paidBonus) {
        this.paidBonus = paidBonus;
    }

    public static class Builder {
        /**
         * 已确认的奖励
         * <p> 示例值：
         */
        private BonusAmount confirmedBonus;
        /**
         * 已发放的奖励
         * <p> 示例值：
         */
        private BonusAmount paidBonus;

        /**
         * 已确认的奖励
         * <p> 示例值：
         *
         * @param confirmedBonus
         * @return
         */
        public Builder confirmedBonus(BonusAmount confirmedBonus) {
            this.confirmedBonus = confirmedBonus;
            return this;
        }


        /**
         * 已发放的奖励
         * <p> 示例值：
         *
         * @param paidBonus
         * @return
         */
        public Builder paidBonus(BonusAmount paidBonus) {
            this.paidBonus = paidBonus;
            return this;
        }


        public Assets build() {
            return new Assets(this);
        }
    }
}
