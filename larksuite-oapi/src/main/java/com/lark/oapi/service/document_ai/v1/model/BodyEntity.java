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

package com.lark.oapi.service.document_ai.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.document_ai.v1.enums.*;
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

public class BodyEntity {
    /**
     * 地址
     * <p> 示例值：北京市海淀区紫金数码园4号楼
     */
    @SerializedName("address")
    private String address;
    /**
     * 联系人
     * <p> 示例值：张三
     */
    @SerializedName("contacts")
    private String contacts;
    /**
     * 邮箱
     * <p> 示例值：zhangsan.1111@bytedance.com
     */
    @SerializedName("email")
    private String email;
    /**
     * 电话
     * <p> 示例值：13600000000
     */
    @SerializedName("phone")
    private String phone;
    /**
     * ID
     * <p> 示例值：310XXXXXXXXXXXXXXX
     */
    @SerializedName("id_number")
    private String idNumber;
    /**
     * 法人代表
     * <p> 示例值：张三
     */
    @SerializedName("legal_representative")
    private String legalRepresentative;
    /**
     * 当事人
     * <p> 示例值：北京字节跳动网络技术有限公司
     */
    @SerializedName("party")
    private String party;

    // builder 开始
    public BodyEntity() {
    }

    public BodyEntity(Builder builder) {
        /**
         * 地址
         * <p> 示例值：北京市海淀区紫金数码园4号楼
         */
        this.address = builder.address;
        /**
         * 联系人
         * <p> 示例值：张三
         */
        this.contacts = builder.contacts;
        /**
         * 邮箱
         * <p> 示例值：zhangsan.1111@bytedance.com
         */
        this.email = builder.email;
        /**
         * 电话
         * <p> 示例值：13600000000
         */
        this.phone = builder.phone;
        /**
         * ID
         * <p> 示例值：310XXXXXXXXXXXXXXX
         */
        this.idNumber = builder.idNumber;
        /**
         * 法人代表
         * <p> 示例值：张三
         */
        this.legalRepresentative = builder.legalRepresentative;
        /**
         * 当事人
         * <p> 示例值：北京字节跳动网络技术有限公司
         */
        this.party = builder.party;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContacts() {
        return this.contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdNumber() {
        return this.idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getLegalRepresentative() {
        return this.legalRepresentative;
    }

    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }

    public String getParty() {
        return this.party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public static class Builder {
        /**
         * 地址
         * <p> 示例值：北京市海淀区紫金数码园4号楼
         */
        private String address;
        /**
         * 联系人
         * <p> 示例值：张三
         */
        private String contacts;
        /**
         * 邮箱
         * <p> 示例值：zhangsan.1111@bytedance.com
         */
        private String email;
        /**
         * 电话
         * <p> 示例值：13600000000
         */
        private String phone;
        /**
         * ID
         * <p> 示例值：310XXXXXXXXXXXXXXX
         */
        private String idNumber;
        /**
         * 法人代表
         * <p> 示例值：张三
         */
        private String legalRepresentative;
        /**
         * 当事人
         * <p> 示例值：北京字节跳动网络技术有限公司
         */
        private String party;

        /**
         * 地址
         * <p> 示例值：北京市海淀区紫金数码园4号楼
         *
         * @param address
         * @return
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }


        /**
         * 联系人
         * <p> 示例值：张三
         *
         * @param contacts
         * @return
         */
        public Builder contacts(String contacts) {
            this.contacts = contacts;
            return this;
        }


        /**
         * 邮箱
         * <p> 示例值：zhangsan.1111@bytedance.com
         *
         * @param email
         * @return
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }


        /**
         * 电话
         * <p> 示例值：13600000000
         *
         * @param phone
         * @return
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }


        /**
         * ID
         * <p> 示例值：310XXXXXXXXXXXXXXX
         *
         * @param idNumber
         * @return
         */
        public Builder idNumber(String idNumber) {
            this.idNumber = idNumber;
            return this;
        }


        /**
         * 法人代表
         * <p> 示例值：张三
         *
         * @param legalRepresentative
         * @return
         */
        public Builder legalRepresentative(String legalRepresentative) {
            this.legalRepresentative = legalRepresentative;
            return this;
        }


        /**
         * 当事人
         * <p> 示例值：北京字节跳动网络技术有限公司
         *
         * @param party
         * @return
         */
        public Builder party(String party) {
            this.party = party;
            return this;
        }


        public BodyEntity build() {
            return new BodyEntity(this);
        }
    }
}
