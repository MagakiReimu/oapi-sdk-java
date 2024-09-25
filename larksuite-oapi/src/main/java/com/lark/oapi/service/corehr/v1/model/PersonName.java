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

import com.google.gson.annotations.SerializedName;

public class PersonName {
    /**
     * 姓 - 本地文字
     * <p> 示例值：黄
     */
    @SerializedName("local_primary")
    private String localPrimary;
    /**
     * 名 - 本地文字
     * <p> 示例值：四
     */
    @SerializedName("local_first_name")
    private String localFirstName;
    /**
     * 国家 / 地区
     * <p> 示例值：6862995757234914824
     */
    @SerializedName("country_region_id")
    private String countryRegionId;
    /**
     * 姓名类型，枚举值可通过文档[【飞书人事枚举常量】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/feishu-people-enum-constant)姓名类型（name_type）枚举定义部分获得
     * <p> 示例值：
     */
    @SerializedName("name_type")
    private Enum nameType;
    /**
     * 名 - 第二本地文字
     * <p> 示例值：五
     */
    @SerializedName("local_first_name_2")
    private String localFirstName2;
    /**
     * 姓 - 第二本地文字
     * <p> 示例值：王
     */
    @SerializedName("local_primary_2")
    private String localPrimary2;
    /**
     * 补充姓名类型，比如emergency_contact_name（紧急联系人姓名）
     * <p> 示例值：
     */
    @SerializedName("additional_name_type")
    private Enum additionalNameType;
    /**
     * 名
     * <p> 示例值：帅
     */
    @SerializedName("first_name")
    private String firstName;
    /**
     * 全名
     * <p> 示例值：王大帅
     */
    @SerializedName("full_name")
    private String fullName;
    /**
     * 姓氏称谓
     * <p> 示例值：王
     */
    @SerializedName("hereditary")
    private String hereditary;
    /**
     * 自定义姓名（未传入时，姓名将默认根据所属国家 / 地区规则对相关姓、名字段拼接）
     * <p> 示例值：王大帅
     */
    @SerializedName("custom_name")
    private String customName;
    /**
     * 本地文字的自定义姓名（未传入时，本地文字的姓名将默认根据所属国家 / 地区规则对本地文字的相关姓、名字段拼接）
     * <p> 示例值：王大帅
     */
    @SerializedName("custom_local_name")
    private String customLocalName;
    /**
     * 中间名
     * <p> 示例值：大
     */
    @SerializedName("middle_name")
    private String middleName;
    /**
     * 姓
     * <p> 示例值：王
     */
    @SerializedName("name_primary")
    private String namePrimary;
    /**
     * 第二姓氏
     * <p> 示例值：王
     */
    @SerializedName("secondary")
    private String secondary;
    /**
     * 尊称
     * <p> 示例值：刘梓新
     */
    @SerializedName("social")
    private Enum social;
    /**
     * 婚后姓氏
     * <p> 示例值：王
     */
    @SerializedName("tertiary")
    private String tertiary;
    /**
     * 头衔，比如;;Mr.;;Miss.;;Mrs.;;Prof.;;Dr.
     * <p> 示例值：王
     */
    @SerializedName("title")
    private Enum title;
    /**
     * 本地中间名
     * <p> 示例值：大
     */
    @SerializedName("local_middle_name")
    private String localMiddleName;
    /**
     * 第二姓氏 - 本地文字
     * <p> 示例值：王
     */
    @SerializedName("local_secondary")
    private String localSecondary;
    /**
     * 展示姓名（本地和西方文字）
     * <p> 示例值：王大帅
     */
    @SerializedName("display_name_local_and_western_script")
    private String displayNameLocalAndWesternScript;
    /**
     * 展示姓名（本地文字）
     * <p> 示例值：王大帅
     */
    @SerializedName("display_name_local_script")
    private String displayNameLocalScript;
    /**
     * 展示姓名（西方文字）
     * <p> 示例值：王大帅
     */
    @SerializedName("display_name_western_script")
    private String displayNameWesternScript;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("custom_fields")
    private ObjectFieldData[] customFields;

    // builder 开始
    public PersonName() {
    }

    public PersonName(Builder builder) {
        /**
         * 姓 - 本地文字
         * <p> 示例值：黄
         */
        this.localPrimary = builder.localPrimary;
        /**
         * 名 - 本地文字
         * <p> 示例值：四
         */
        this.localFirstName = builder.localFirstName;
        /**
         * 国家 / 地区
         * <p> 示例值：6862995757234914824
         */
        this.countryRegionId = builder.countryRegionId;
        /**
         * 姓名类型，枚举值可通过文档[【飞书人事枚举常量】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/feishu-people-enum-constant)姓名类型（name_type）枚举定义部分获得
         * <p> 示例值：
         */
        this.nameType = builder.nameType;
        /**
         * 名 - 第二本地文字
         * <p> 示例值：五
         */
        this.localFirstName2 = builder.localFirstName2;
        /**
         * 姓 - 第二本地文字
         * <p> 示例值：王
         */
        this.localPrimary2 = builder.localPrimary2;
        /**
         * 补充姓名类型，比如emergency_contact_name（紧急联系人姓名）
         * <p> 示例值：
         */
        this.additionalNameType = builder.additionalNameType;
        /**
         * 名
         * <p> 示例值：帅
         */
        this.firstName = builder.firstName;
        /**
         * 全名
         * <p> 示例值：王大帅
         */
        this.fullName = builder.fullName;
        /**
         * 姓氏称谓
         * <p> 示例值：王
         */
        this.hereditary = builder.hereditary;
        /**
         * 自定义姓名（未传入时，姓名将默认根据所属国家 / 地区规则对相关姓、名字段拼接）
         * <p> 示例值：王大帅
         */
        this.customName = builder.customName;
        /**
         * 本地文字的自定义姓名（未传入时，本地文字的姓名将默认根据所属国家 / 地区规则对本地文字的相关姓、名字段拼接）
         * <p> 示例值：王大帅
         */
        this.customLocalName = builder.customLocalName;
        /**
         * 中间名
         * <p> 示例值：大
         */
        this.middleName = builder.middleName;
        /**
         * 姓
         * <p> 示例值：王
         */
        this.namePrimary = builder.namePrimary;
        /**
         * 第二姓氏
         * <p> 示例值：王
         */
        this.secondary = builder.secondary;
        /**
         * 尊称
         * <p> 示例值：刘梓新
         */
        this.social = builder.social;
        /**
         * 婚后姓氏
         * <p> 示例值：王
         */
        this.tertiary = builder.tertiary;
        /**
         * 头衔，比如;;Mr.;;Miss.;;Mrs.;;Prof.;;Dr.
         * <p> 示例值：王
         */
        this.title = builder.title;
        /**
         * 本地中间名
         * <p> 示例值：大
         */
        this.localMiddleName = builder.localMiddleName;
        /**
         * 第二姓氏 - 本地文字
         * <p> 示例值：王
         */
        this.localSecondary = builder.localSecondary;
        /**
         * 展示姓名（本地和西方文字）
         * <p> 示例值：王大帅
         */
        this.displayNameLocalAndWesternScript = builder.displayNameLocalAndWesternScript;
        /**
         * 展示姓名（本地文字）
         * <p> 示例值：王大帅
         */
        this.displayNameLocalScript = builder.displayNameLocalScript;
        /**
         * 展示姓名（西方文字）
         * <p> 示例值：王大帅
         */
        this.displayNameWesternScript = builder.displayNameWesternScript;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        this.customFields = builder.customFields;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getLocalPrimary() {
        return this.localPrimary;
    }

    public void setLocalPrimary(String localPrimary) {
        this.localPrimary = localPrimary;
    }

    public String getLocalFirstName() {
        return this.localFirstName;
    }

    public void setLocalFirstName(String localFirstName) {
        this.localFirstName = localFirstName;
    }

    public String getCountryRegionId() {
        return this.countryRegionId;
    }

    public void setCountryRegionId(String countryRegionId) {
        this.countryRegionId = countryRegionId;
    }

    public Enum getNameType() {
        return this.nameType;
    }

    public void setNameType(Enum nameType) {
        this.nameType = nameType;
    }

    public String getLocalFirstName2() {
        return this.localFirstName2;
    }

    public void setLocalFirstName2(String localFirstName2) {
        this.localFirstName2 = localFirstName2;
    }

    public String getLocalPrimary2() {
        return this.localPrimary2;
    }

    public void setLocalPrimary2(String localPrimary2) {
        this.localPrimary2 = localPrimary2;
    }

    public Enum getAdditionalNameType() {
        return this.additionalNameType;
    }

    public void setAdditionalNameType(Enum additionalNameType) {
        this.additionalNameType = additionalNameType;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getHereditary() {
        return this.hereditary;
    }

    public void setHereditary(String hereditary) {
        this.hereditary = hereditary;
    }

    public String getCustomName() {
        return this.customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    public String getCustomLocalName() {
        return this.customLocalName;
    }

    public void setCustomLocalName(String customLocalName) {
        this.customLocalName = customLocalName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getNamePrimary() {
        return this.namePrimary;
    }

    public void setNamePrimary(String namePrimary) {
        this.namePrimary = namePrimary;
    }

    public String getSecondary() {
        return this.secondary;
    }

    public void setSecondary(String secondary) {
        this.secondary = secondary;
    }

    public Enum getSocial() {
        return this.social;
    }

    public void setSocial(Enum social) {
        this.social = social;
    }

    public String getTertiary() {
        return this.tertiary;
    }

    public void setTertiary(String tertiary) {
        this.tertiary = tertiary;
    }

    public Enum getTitle() {
        return this.title;
    }

    public void setTitle(Enum title) {
        this.title = title;
    }

    public String getLocalMiddleName() {
        return this.localMiddleName;
    }

    public void setLocalMiddleName(String localMiddleName) {
        this.localMiddleName = localMiddleName;
    }

    public String getLocalSecondary() {
        return this.localSecondary;
    }

    public void setLocalSecondary(String localSecondary) {
        this.localSecondary = localSecondary;
    }

    public String getDisplayNameLocalAndWesternScript() {
        return this.displayNameLocalAndWesternScript;
    }

    public void setDisplayNameLocalAndWesternScript(String displayNameLocalAndWesternScript) {
        this.displayNameLocalAndWesternScript = displayNameLocalAndWesternScript;
    }

    public String getDisplayNameLocalScript() {
        return this.displayNameLocalScript;
    }

    public void setDisplayNameLocalScript(String displayNameLocalScript) {
        this.displayNameLocalScript = displayNameLocalScript;
    }

    public String getDisplayNameWesternScript() {
        return this.displayNameWesternScript;
    }

    public void setDisplayNameWesternScript(String displayNameWesternScript) {
        this.displayNameWesternScript = displayNameWesternScript;
    }

    public ObjectFieldData[] getCustomFields() {
        return this.customFields;
    }

    public void setCustomFields(ObjectFieldData[] customFields) {
        this.customFields = customFields;
    }

    public static class Builder {
        /**
         * 姓 - 本地文字
         * <p> 示例值：黄
         */
        private String localPrimary;
        /**
         * 名 - 本地文字
         * <p> 示例值：四
         */
        private String localFirstName;
        /**
         * 国家 / 地区
         * <p> 示例值：6862995757234914824
         */
        private String countryRegionId;
        /**
         * 姓名类型，枚举值可通过文档[【飞书人事枚举常量】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/feishu-people-enum-constant)姓名类型（name_type）枚举定义部分获得
         * <p> 示例值：
         */
        private Enum nameType;
        /**
         * 名 - 第二本地文字
         * <p> 示例值：五
         */
        private String localFirstName2;
        /**
         * 姓 - 第二本地文字
         * <p> 示例值：王
         */
        private String localPrimary2;
        /**
         * 补充姓名类型，比如emergency_contact_name（紧急联系人姓名）
         * <p> 示例值：
         */
        private Enum additionalNameType;
        /**
         * 名
         * <p> 示例值：帅
         */
        private String firstName;
        /**
         * 全名
         * <p> 示例值：王大帅
         */
        private String fullName;
        /**
         * 姓氏称谓
         * <p> 示例值：王
         */
        private String hereditary;
        /**
         * 自定义姓名（未传入时，姓名将默认根据所属国家 / 地区规则对相关姓、名字段拼接）
         * <p> 示例值：王大帅
         */
        private String customName;
        /**
         * 本地文字的自定义姓名（未传入时，本地文字的姓名将默认根据所属国家 / 地区规则对本地文字的相关姓、名字段拼接）
         * <p> 示例值：王大帅
         */
        private String customLocalName;
        /**
         * 中间名
         * <p> 示例值：大
         */
        private String middleName;
        /**
         * 姓
         * <p> 示例值：王
         */
        private String namePrimary;
        /**
         * 第二姓氏
         * <p> 示例值：王
         */
        private String secondary;
        /**
         * 尊称
         * <p> 示例值：刘梓新
         */
        private Enum social;
        /**
         * 婚后姓氏
         * <p> 示例值：王
         */
        private String tertiary;
        /**
         * 头衔，比如;;Mr.;;Miss.;;Mrs.;;Prof.;;Dr.
         * <p> 示例值：王
         */
        private Enum title;
        /**
         * 本地中间名
         * <p> 示例值：大
         */
        private String localMiddleName;
        /**
         * 第二姓氏 - 本地文字
         * <p> 示例值：王
         */
        private String localSecondary;
        /**
         * 展示姓名（本地和西方文字）
         * <p> 示例值：王大帅
         */
        private String displayNameLocalAndWesternScript;
        /**
         * 展示姓名（本地文字）
         * <p> 示例值：王大帅
         */
        private String displayNameLocalScript;
        /**
         * 展示姓名（西方文字）
         * <p> 示例值：王大帅
         */
        private String displayNameWesternScript;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private ObjectFieldData[] customFields;

        /**
         * 姓 - 本地文字
         * <p> 示例值：黄
         *
         * @param localPrimary
         * @return
         */
        public Builder localPrimary(String localPrimary) {
            this.localPrimary = localPrimary;
            return this;
        }


        /**
         * 名 - 本地文字
         * <p> 示例值：四
         *
         * @param localFirstName
         * @return
         */
        public Builder localFirstName(String localFirstName) {
            this.localFirstName = localFirstName;
            return this;
        }


        /**
         * 国家 / 地区
         * <p> 示例值：6862995757234914824
         *
         * @param countryRegionId
         * @return
         */
        public Builder countryRegionId(String countryRegionId) {
            this.countryRegionId = countryRegionId;
            return this;
        }


        /**
         * 姓名类型，枚举值可通过文档[【飞书人事枚举常量】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/feishu-people-enum-constant)姓名类型（name_type）枚举定义部分获得
         * <p> 示例值：
         *
         * @param nameType
         * @return
         */
        public Builder nameType(Enum nameType) {
            this.nameType = nameType;
            return this;
        }


        /**
         * 名 - 第二本地文字
         * <p> 示例值：五
         *
         * @param localFirstName2
         * @return
         */
        public Builder localFirstName2(String localFirstName2) {
            this.localFirstName2 = localFirstName2;
            return this;
        }


        /**
         * 姓 - 第二本地文字
         * <p> 示例值：王
         *
         * @param localPrimary2
         * @return
         */
        public Builder localPrimary2(String localPrimary2) {
            this.localPrimary2 = localPrimary2;
            return this;
        }


        /**
         * 补充姓名类型，比如emergency_contact_name（紧急联系人姓名）
         * <p> 示例值：
         *
         * @param additionalNameType
         * @return
         */
        public Builder additionalNameType(Enum additionalNameType) {
            this.additionalNameType = additionalNameType;
            return this;
        }


        /**
         * 名
         * <p> 示例值：帅
         *
         * @param firstName
         * @return
         */
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }


        /**
         * 全名
         * <p> 示例值：王大帅
         *
         * @param fullName
         * @return
         */
        public Builder fullName(String fullName) {
            this.fullName = fullName;
            return this;
        }


        /**
         * 姓氏称谓
         * <p> 示例值：王
         *
         * @param hereditary
         * @return
         */
        public Builder hereditary(String hereditary) {
            this.hereditary = hereditary;
            return this;
        }


        /**
         * 自定义姓名（未传入时，姓名将默认根据所属国家 / 地区规则对相关姓、名字段拼接）
         * <p> 示例值：王大帅
         *
         * @param customName
         * @return
         */
        public Builder customName(String customName) {
            this.customName = customName;
            return this;
        }


        /**
         * 本地文字的自定义姓名（未传入时，本地文字的姓名将默认根据所属国家 / 地区规则对本地文字的相关姓、名字段拼接）
         * <p> 示例值：王大帅
         *
         * @param customLocalName
         * @return
         */
        public Builder customLocalName(String customLocalName) {
            this.customLocalName = customLocalName;
            return this;
        }


        /**
         * 中间名
         * <p> 示例值：大
         *
         * @param middleName
         * @return
         */
        public Builder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }


        /**
         * 姓
         * <p> 示例值：王
         *
         * @param namePrimary
         * @return
         */
        public Builder namePrimary(String namePrimary) {
            this.namePrimary = namePrimary;
            return this;
        }


        /**
         * 第二姓氏
         * <p> 示例值：王
         *
         * @param secondary
         * @return
         */
        public Builder secondary(String secondary) {
            this.secondary = secondary;
            return this;
        }


        /**
         * 尊称
         * <p> 示例值：刘梓新
         *
         * @param social
         * @return
         */
        public Builder social(Enum social) {
            this.social = social;
            return this;
        }


        /**
         * 婚后姓氏
         * <p> 示例值：王
         *
         * @param tertiary
         * @return
         */
        public Builder tertiary(String tertiary) {
            this.tertiary = tertiary;
            return this;
        }


        /**
         * 头衔，比如;;Mr.;;Miss.;;Mrs.;;Prof.;;Dr.
         * <p> 示例值：王
         *
         * @param title
         * @return
         */
        public Builder title(Enum title) {
            this.title = title;
            return this;
        }


        /**
         * 本地中间名
         * <p> 示例值：大
         *
         * @param localMiddleName
         * @return
         */
        public Builder localMiddleName(String localMiddleName) {
            this.localMiddleName = localMiddleName;
            return this;
        }


        /**
         * 第二姓氏 - 本地文字
         * <p> 示例值：王
         *
         * @param localSecondary
         * @return
         */
        public Builder localSecondary(String localSecondary) {
            this.localSecondary = localSecondary;
            return this;
        }


        /**
         * 展示姓名（本地和西方文字）
         * <p> 示例值：王大帅
         *
         * @param displayNameLocalAndWesternScript
         * @return
         */
        public Builder displayNameLocalAndWesternScript(String displayNameLocalAndWesternScript) {
            this.displayNameLocalAndWesternScript = displayNameLocalAndWesternScript;
            return this;
        }


        /**
         * 展示姓名（本地文字）
         * <p> 示例值：王大帅
         *
         * @param displayNameLocalScript
         * @return
         */
        public Builder displayNameLocalScript(String displayNameLocalScript) {
            this.displayNameLocalScript = displayNameLocalScript;
            return this;
        }


        /**
         * 展示姓名（西方文字）
         * <p> 示例值：王大帅
         *
         * @param displayNameWesternScript
         * @return
         */
        public Builder displayNameWesternScript(String displayNameWesternScript) {
            this.displayNameWesternScript = displayNameWesternScript;
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


        public PersonName build() {
            return new PersonName(this);
        }
    }
}
