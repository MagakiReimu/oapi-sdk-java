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

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.corehr.v2.enums.*;
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

public class BankBranch {
    /**
     * 支行 ID
     * <p> 示例值：MDBK00061194
     */
    @SerializedName("bank_branch_id")
    private String bankBranchId;
    /**
     * 金融分支机构名称（支行全称）
     * <p> 示例值：
     */
    @SerializedName("name")
    private I18n[] name;
    /**
     * 支行名称
     * <p> 示例值：
     */
    @SerializedName("bank_branch_name")
    private I18n[] bankBranchName;
    /**
     * 所属银行 ID，可通过[查询银行信息](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/corehr-v2/basic_info-bank/search)接口查询
     * <p> 示例值：MDBH00000080
     */
    @SerializedName("bank_id")
    private String bankId;
    /**
     * 金融分支机构编码（联行号）
     * <p> 示例值：308100005019
     */
    @SerializedName("code")
    private String code;
    /**
     * SWIFT 银行代码（ISO 9362）
     * <p> 示例值：CMBCCNBS201
     */
    @SerializedName("swift_code")
    private String swiftCode;
    /**
     * 状态
     * <p> 示例值：1
     */
    @SerializedName("status")
    private Integer status;
    /**
     * Bank Branch Code（特定国家地区汇款使用的编码，如美国银行的 ABA Number、澳大利亚银行的 BSB Code、英国银行的 Sort Code）
     * <p> 示例值：B04
     */
    @SerializedName("bank_branch_code")
    private String bankBranchCode;
    /**
     * 注册地址
     * <p> 示例值：北京市朝阳区
     */
    @SerializedName("register_place")
    private String registerPlace;
    /**
     * 银行地址
     * <p> 示例值：北京市朝阳区
     */
    @SerializedName("bank_address")
    private String bankAddress;
    /**
     * 创建时间
     * <p> 示例值：2020-01-01 00:00:00
     */
    @SerializedName("create_time")
    private String createTime;
    /**
     * 更新时间
     * <p> 示例值：2024-01-01 00:00:00
     */
    @SerializedName("update_time")
    private String updateTime;

    // builder 开始
    public BankBranch() {
    }

    public BankBranch(Builder builder) {
        /**
         * 支行 ID
         * <p> 示例值：MDBK00061194
         */
        this.bankBranchId = builder.bankBranchId;
        /**
         * 金融分支机构名称（支行全称）
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 支行名称
         * <p> 示例值：
         */
        this.bankBranchName = builder.bankBranchName;
        /**
         * 所属银行 ID，可通过[查询银行信息](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/corehr-v2/basic_info-bank/search)接口查询
         * <p> 示例值：MDBH00000080
         */
        this.bankId = builder.bankId;
        /**
         * 金融分支机构编码（联行号）
         * <p> 示例值：308100005019
         */
        this.code = builder.code;
        /**
         * SWIFT 银行代码（ISO 9362）
         * <p> 示例值：CMBCCNBS201
         */
        this.swiftCode = builder.swiftCode;
        /**
         * 状态
         * <p> 示例值：1
         */
        this.status = builder.status;
        /**
         * Bank Branch Code（特定国家地区汇款使用的编码，如美国银行的 ABA Number、澳大利亚银行的 BSB Code、英国银行的 Sort Code）
         * <p> 示例值：B04
         */
        this.bankBranchCode = builder.bankBranchCode;
        /**
         * 注册地址
         * <p> 示例值：北京市朝阳区
         */
        this.registerPlace = builder.registerPlace;
        /**
         * 银行地址
         * <p> 示例值：北京市朝阳区
         */
        this.bankAddress = builder.bankAddress;
        /**
         * 创建时间
         * <p> 示例值：2020-01-01 00:00:00
         */
        this.createTime = builder.createTime;
        /**
         * 更新时间
         * <p> 示例值：2024-01-01 00:00:00
         */
        this.updateTime = builder.updateTime;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getBankBranchId() {
        return this.bankBranchId;
    }

    public void setBankBranchId(String bankBranchId) {
        this.bankBranchId = bankBranchId;
    }

    public I18n[] getName() {
        return this.name;
    }

    public void setName(I18n[] name) {
        this.name = name;
    }

    public I18n[] getBankBranchName() {
        return this.bankBranchName;
    }

    public void setBankBranchName(I18n[] bankBranchName) {
        this.bankBranchName = bankBranchName;
    }

    public String getBankId() {
        return this.bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSwiftCode() {
        return this.swiftCode;
    }

    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getBankBranchCode() {
        return this.bankBranchCode;
    }

    public void setBankBranchCode(String bankBranchCode) {
        this.bankBranchCode = bankBranchCode;
    }

    public String getRegisterPlace() {
        return this.registerPlace;
    }

    public void setRegisterPlace(String registerPlace) {
        this.registerPlace = registerPlace;
    }

    public String getBankAddress() {
        return this.bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public static class Builder {
        /**
         * 支行 ID
         * <p> 示例值：MDBK00061194
         */
        private String bankBranchId;
        /**
         * 金融分支机构名称（支行全称）
         * <p> 示例值：
         */
        private I18n[] name;
        /**
         * 支行名称
         * <p> 示例值：
         */
        private I18n[] bankBranchName;
        /**
         * 所属银行 ID，可通过[查询银行信息](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/corehr-v2/basic_info-bank/search)接口查询
         * <p> 示例值：MDBH00000080
         */
        private String bankId;
        /**
         * 金融分支机构编码（联行号）
         * <p> 示例值：308100005019
         */
        private String code;
        /**
         * SWIFT 银行代码（ISO 9362）
         * <p> 示例值：CMBCCNBS201
         */
        private String swiftCode;
        /**
         * 状态
         * <p> 示例值：1
         */
        private Integer status;
        /**
         * Bank Branch Code（特定国家地区汇款使用的编码，如美国银行的 ABA Number、澳大利亚银行的 BSB Code、英国银行的 Sort Code）
         * <p> 示例值：B04
         */
        private String bankBranchCode;
        /**
         * 注册地址
         * <p> 示例值：北京市朝阳区
         */
        private String registerPlace;
        /**
         * 银行地址
         * <p> 示例值：北京市朝阳区
         */
        private String bankAddress;
        /**
         * 创建时间
         * <p> 示例值：2020-01-01 00:00:00
         */
        private String createTime;
        /**
         * 更新时间
         * <p> 示例值：2024-01-01 00:00:00
         */
        private String updateTime;

        /**
         * 支行 ID
         * <p> 示例值：MDBK00061194
         *
         * @param bankBranchId
         * @return
         */
        public Builder bankBranchId(String bankBranchId) {
            this.bankBranchId = bankBranchId;
            return this;
        }


        /**
         * 金融分支机构名称（支行全称）
         * <p> 示例值：
         *
         * @param name
         * @return
         */
        public Builder name(I18n[] name) {
            this.name = name;
            return this;
        }


        /**
         * 支行名称
         * <p> 示例值：
         *
         * @param bankBranchName
         * @return
         */
        public Builder bankBranchName(I18n[] bankBranchName) {
            this.bankBranchName = bankBranchName;
            return this;
        }


        /**
         * 所属银行 ID，可通过[查询银行信息](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/corehr-v2/basic_info-bank/search)接口查询
         * <p> 示例值：MDBH00000080
         *
         * @param bankId
         * @return
         */
        public Builder bankId(String bankId) {
            this.bankId = bankId;
            return this;
        }


        /**
         * 金融分支机构编码（联行号）
         * <p> 示例值：308100005019
         *
         * @param code
         * @return
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }


        /**
         * SWIFT 银行代码（ISO 9362）
         * <p> 示例值：CMBCCNBS201
         *
         * @param swiftCode
         * @return
         */
        public Builder swiftCode(String swiftCode) {
            this.swiftCode = swiftCode;
            return this;
        }


        /**
         * 状态
         * <p> 示例值：1
         *
         * @param status
         * @return
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * 状态
         * <p> 示例值：1
         *
         * @param status {@link com.lark.oapi.service.corehr.v2.enums.BankBranchBasicDataObjStatusEnum}
         * @return
         */
        public Builder status(com.lark.oapi.service.corehr.v2.enums.BankBranchBasicDataObjStatusEnum status) {
            this.status = status.getValue();
            return this;
        }


        /**
         * Bank Branch Code（特定国家地区汇款使用的编码，如美国银行的 ABA Number、澳大利亚银行的 BSB Code、英国银行的 Sort Code）
         * <p> 示例值：B04
         *
         * @param bankBranchCode
         * @return
         */
        public Builder bankBranchCode(String bankBranchCode) {
            this.bankBranchCode = bankBranchCode;
            return this;
        }


        /**
         * 注册地址
         * <p> 示例值：北京市朝阳区
         *
         * @param registerPlace
         * @return
         */
        public Builder registerPlace(String registerPlace) {
            this.registerPlace = registerPlace;
            return this;
        }


        /**
         * 银行地址
         * <p> 示例值：北京市朝阳区
         *
         * @param bankAddress
         * @return
         */
        public Builder bankAddress(String bankAddress) {
            this.bankAddress = bankAddress;
            return this;
        }


        /**
         * 创建时间
         * <p> 示例值：2020-01-01 00:00:00
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
         * <p> 示例值：2024-01-01 00:00:00
         *
         * @param updateTime
         * @return
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }


        public BankBranch build() {
            return new BankBranch(this);
        }
    }
}
