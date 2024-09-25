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

import com.google.gson.annotations.SerializedName;

public class BasicInfoUpdate {
    /**
     * 姓名,该值是一个list，会全量更新
     * <p> 示例值：
     */
    @SerializedName("names")
    private NameForUpdate[] names;
    /**
     * 电话,该值是一个list，会全量更新
     * <p> 示例值：
     */
    @SerializedName("phones")
    private PhoneForUpdate[] phones;
    /**
     * 邮箱,该值是一个list，会全量更新
     * <p> 示例值：
     */
    @SerializedName("emails")
    private EmailForUpdate[] emails;
    /**
     * 国籍
     * <p> 示例值：6862995757234914824
     */
    @SerializedName("nationality_v2_id")
    private String nationalityV2Id;
    /**
     * 其他国籍
     * <p> 示例值：[6862995757234914824]
     */
    @SerializedName("additional_nationality_id_list")
    private String[] additionalNationalityIdList;
    /**
     * 纳税身份信息,该值是一个list，会全量更新
     * <p> 示例值：
     */
    @SerializedName("resident_tax_list")
    private ResidentTaxForUpdate[] residentTaxList;
    /**
     * 出生国家/地区
     * <p> 示例值：6862995757234914824
     */
    @SerializedName("born_country_region")
    private String bornCountryRegion;
    /**
     * 是否残疾
     * <p> 示例值：true
     */
    @SerializedName("is_disabled")
    private Boolean isDisabled;
    /**
     * 残疾证号
     * <p> 示例值：6862995757234914824
     */
    @SerializedName("disable_card_number")
    private String disableCardNumber;
    /**
     * 是否孤老
     * <p> 示例值：true
     */
    @SerializedName("is_old_alone")
    private Boolean isOldAlone;
    /**
     * 是否烈属
     * <p> 示例值：true
     */
    @SerializedName("is_martyr_family")
    private Boolean isMartyrFamily;
    /**
     * 烈属证号
     * <p> 示例值：6862995757234914824
     */
    @SerializedName("martyr_card_number")
    private String martyrCardNumber;
    /**
     * 家庭成员
     * <p> 示例值：
     */
    @SerializedName("dependent_list")
    private DependentForUpdate[] dependentList;
    /**
     * 宗教信仰
     * <p> 示例值：6862995757234914824
     */
    @SerializedName("religion")
    private String religion;
    /**
     * 银行账号
     * <p> 示例值：
     */
    @SerializedName("bank_account_list")
    private BankAccountForUpdate[] bankAccountList;
    /**
     * 证件账号
     * <p> 示例值：
     */
    @SerializedName("national_id_list")
    private NationalIdForUpdate[] nationalIdList;
    /**
     * 个人资料
     * <p> 示例值：
     */
    @SerializedName("personal_profile_list")
    private PersonalProfileForUpdate[] personalProfileList;
    /**
     * 紧急联系人
     * <p> 示例值：
     */
    @SerializedName("emergency_contact_list")
    private EmergencyContactForUpdate[] emergencyContactList;
    /**
     * 联系地址
     * <p> 示例值：
     */
    @SerializedName("address_list")
    private AddressForUpdate[] addressList;
    /**
     * 婚姻状况
     * <p> 示例值：6862995757234914824
     */
    @SerializedName("marital_status")
    private String maritalStatus;
    /**
     * 民族 / 种族
     * <p> 示例值：6862995757234914824
     */
    @SerializedName("ethnicity_race")
    private String ethnicityRace;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("custom_fields")
    private ObjectFieldData[] customFields;
    /**
     * 籍贯
     * <p> 示例值：6862995757234914824
     */
    @SerializedName("native_region")
    private String nativeRegion;
    /**
     * 户口类型
     * <p> 示例值：6862995757234914824
     */
    @SerializedName("hukou_type")
    private String hukouType;
    /**
     * 户口所在地
     * <p> 示例值：6862995757234914824
     */
    @SerializedName("hukou_location")
    private String hukouLocation;

    // builder 开始
    public BasicInfoUpdate() {
    }

    public BasicInfoUpdate(Builder builder) {
        /**
         * 姓名,该值是一个list，会全量更新
         * <p> 示例值：
         */
        this.names = builder.names;
        /**
         * 电话,该值是一个list，会全量更新
         * <p> 示例值：
         */
        this.phones = builder.phones;
        /**
         * 邮箱,该值是一个list，会全量更新
         * <p> 示例值：
         */
        this.emails = builder.emails;
        /**
         * 国籍
         * <p> 示例值：6862995757234914824
         */
        this.nationalityV2Id = builder.nationalityV2Id;
        /**
         * 其他国籍
         * <p> 示例值：[6862995757234914824]
         */
        this.additionalNationalityIdList = builder.additionalNationalityIdList;
        /**
         * 纳税身份信息,该值是一个list，会全量更新
         * <p> 示例值：
         */
        this.residentTaxList = builder.residentTaxList;
        /**
         * 出生国家/地区
         * <p> 示例值：6862995757234914824
         */
        this.bornCountryRegion = builder.bornCountryRegion;
        /**
         * 是否残疾
         * <p> 示例值：true
         */
        this.isDisabled = builder.isDisabled;
        /**
         * 残疾证号
         * <p> 示例值：6862995757234914824
         */
        this.disableCardNumber = builder.disableCardNumber;
        /**
         * 是否孤老
         * <p> 示例值：true
         */
        this.isOldAlone = builder.isOldAlone;
        /**
         * 是否烈属
         * <p> 示例值：true
         */
        this.isMartyrFamily = builder.isMartyrFamily;
        /**
         * 烈属证号
         * <p> 示例值：6862995757234914824
         */
        this.martyrCardNumber = builder.martyrCardNumber;
        /**
         * 家庭成员
         * <p> 示例值：
         */
        this.dependentList = builder.dependentList;
        /**
         * 宗教信仰
         * <p> 示例值：6862995757234914824
         */
        this.religion = builder.religion;
        /**
         * 银行账号
         * <p> 示例值：
         */
        this.bankAccountList = builder.bankAccountList;
        /**
         * 证件账号
         * <p> 示例值：
         */
        this.nationalIdList = builder.nationalIdList;
        /**
         * 个人资料
         * <p> 示例值：
         */
        this.personalProfileList = builder.personalProfileList;
        /**
         * 紧急联系人
         * <p> 示例值：
         */
        this.emergencyContactList = builder.emergencyContactList;
        /**
         * 联系地址
         * <p> 示例值：
         */
        this.addressList = builder.addressList;
        /**
         * 婚姻状况
         * <p> 示例值：6862995757234914824
         */
        this.maritalStatus = builder.maritalStatus;
        /**
         * 民族 / 种族
         * <p> 示例值：6862995757234914824
         */
        this.ethnicityRace = builder.ethnicityRace;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        this.customFields = builder.customFields;
        /**
         * 籍贯
         * <p> 示例值：6862995757234914824
         */
        this.nativeRegion = builder.nativeRegion;
        /**
         * 户口类型
         * <p> 示例值：6862995757234914824
         */
        this.hukouType = builder.hukouType;
        /**
         * 户口所在地
         * <p> 示例值：6862995757234914824
         */
        this.hukouLocation = builder.hukouLocation;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public NameForUpdate[] getNames() {
        return this.names;
    }

    public void setNames(NameForUpdate[] names) {
        this.names = names;
    }

    public PhoneForUpdate[] getPhones() {
        return this.phones;
    }

    public void setPhones(PhoneForUpdate[] phones) {
        this.phones = phones;
    }

    public EmailForUpdate[] getEmails() {
        return this.emails;
    }

    public void setEmails(EmailForUpdate[] emails) {
        this.emails = emails;
    }

    public String getNationalityV2Id() {
        return this.nationalityV2Id;
    }

    public void setNationalityV2Id(String nationalityV2Id) {
        this.nationalityV2Id = nationalityV2Id;
    }

    public String[] getAdditionalNationalityIdList() {
        return this.additionalNationalityIdList;
    }

    public void setAdditionalNationalityIdList(String[] additionalNationalityIdList) {
        this.additionalNationalityIdList = additionalNationalityIdList;
    }

    public ResidentTaxForUpdate[] getResidentTaxList() {
        return this.residentTaxList;
    }

    public void setResidentTaxList(ResidentTaxForUpdate[] residentTaxList) {
        this.residentTaxList = residentTaxList;
    }

    public String getBornCountryRegion() {
        return this.bornCountryRegion;
    }

    public void setBornCountryRegion(String bornCountryRegion) {
        this.bornCountryRegion = bornCountryRegion;
    }

    public Boolean getIsDisabled() {
        return this.isDisabled;
    }

    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    public String getDisableCardNumber() {
        return this.disableCardNumber;
    }

    public void setDisableCardNumber(String disableCardNumber) {
        this.disableCardNumber = disableCardNumber;
    }

    public Boolean getIsOldAlone() {
        return this.isOldAlone;
    }

    public void setIsOldAlone(Boolean isOldAlone) {
        this.isOldAlone = isOldAlone;
    }

    public Boolean getIsMartyrFamily() {
        return this.isMartyrFamily;
    }

    public void setIsMartyrFamily(Boolean isMartyrFamily) {
        this.isMartyrFamily = isMartyrFamily;
    }

    public String getMartyrCardNumber() {
        return this.martyrCardNumber;
    }

    public void setMartyrCardNumber(String martyrCardNumber) {
        this.martyrCardNumber = martyrCardNumber;
    }

    public DependentForUpdate[] getDependentList() {
        return this.dependentList;
    }

    public void setDependentList(DependentForUpdate[] dependentList) {
        this.dependentList = dependentList;
    }

    public String getReligion() {
        return this.religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public BankAccountForUpdate[] getBankAccountList() {
        return this.bankAccountList;
    }

    public void setBankAccountList(BankAccountForUpdate[] bankAccountList) {
        this.bankAccountList = bankAccountList;
    }

    public NationalIdForUpdate[] getNationalIdList() {
        return this.nationalIdList;
    }

    public void setNationalIdList(NationalIdForUpdate[] nationalIdList) {
        this.nationalIdList = nationalIdList;
    }

    public PersonalProfileForUpdate[] getPersonalProfileList() {
        return this.personalProfileList;
    }

    public void setPersonalProfileList(PersonalProfileForUpdate[] personalProfileList) {
        this.personalProfileList = personalProfileList;
    }

    public EmergencyContactForUpdate[] getEmergencyContactList() {
        return this.emergencyContactList;
    }

    public void setEmergencyContactList(EmergencyContactForUpdate[] emergencyContactList) {
        this.emergencyContactList = emergencyContactList;
    }

    public AddressForUpdate[] getAddressList() {
        return this.addressList;
    }

    public void setAddressList(AddressForUpdate[] addressList) {
        this.addressList = addressList;
    }

    public String getMaritalStatus() {
        return this.maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getEthnicityRace() {
        return this.ethnicityRace;
    }

    public void setEthnicityRace(String ethnicityRace) {
        this.ethnicityRace = ethnicityRace;
    }

    public ObjectFieldData[] getCustomFields() {
        return this.customFields;
    }

    public void setCustomFields(ObjectFieldData[] customFields) {
        this.customFields = customFields;
    }

    public String getNativeRegion() {
        return this.nativeRegion;
    }

    public void setNativeRegion(String nativeRegion) {
        this.nativeRegion = nativeRegion;
    }

    public String getHukouType() {
        return this.hukouType;
    }

    public void setHukouType(String hukouType) {
        this.hukouType = hukouType;
    }

    public String getHukouLocation() {
        return this.hukouLocation;
    }

    public void setHukouLocation(String hukouLocation) {
        this.hukouLocation = hukouLocation;
    }

    public static class Builder {
        /**
         * 姓名,该值是一个list，会全量更新
         * <p> 示例值：
         */
        private NameForUpdate[] names;
        /**
         * 电话,该值是一个list，会全量更新
         * <p> 示例值：
         */
        private PhoneForUpdate[] phones;
        /**
         * 邮箱,该值是一个list，会全量更新
         * <p> 示例值：
         */
        private EmailForUpdate[] emails;
        /**
         * 国籍
         * <p> 示例值：6862995757234914824
         */
        private String nationalityV2Id;
        /**
         * 其他国籍
         * <p> 示例值：[6862995757234914824]
         */
        private String[] additionalNationalityIdList;
        /**
         * 纳税身份信息,该值是一个list，会全量更新
         * <p> 示例值：
         */
        private ResidentTaxForUpdate[] residentTaxList;
        /**
         * 出生国家/地区
         * <p> 示例值：6862995757234914824
         */
        private String bornCountryRegion;
        /**
         * 是否残疾
         * <p> 示例值：true
         */
        private Boolean isDisabled;
        /**
         * 残疾证号
         * <p> 示例值：6862995757234914824
         */
        private String disableCardNumber;
        /**
         * 是否孤老
         * <p> 示例值：true
         */
        private Boolean isOldAlone;
        /**
         * 是否烈属
         * <p> 示例值：true
         */
        private Boolean isMartyrFamily;
        /**
         * 烈属证号
         * <p> 示例值：6862995757234914824
         */
        private String martyrCardNumber;
        /**
         * 家庭成员
         * <p> 示例值：
         */
        private DependentForUpdate[] dependentList;
        /**
         * 宗教信仰
         * <p> 示例值：6862995757234914824
         */
        private String religion;
        /**
         * 银行账号
         * <p> 示例值：
         */
        private BankAccountForUpdate[] bankAccountList;
        /**
         * 证件账号
         * <p> 示例值：
         */
        private NationalIdForUpdate[] nationalIdList;
        /**
         * 个人资料
         * <p> 示例值：
         */
        private PersonalProfileForUpdate[] personalProfileList;
        /**
         * 紧急联系人
         * <p> 示例值：
         */
        private EmergencyContactForUpdate[] emergencyContactList;
        /**
         * 联系地址
         * <p> 示例值：
         */
        private AddressForUpdate[] addressList;
        /**
         * 婚姻状况
         * <p> 示例值：6862995757234914824
         */
        private String maritalStatus;
        /**
         * 民族 / 种族
         * <p> 示例值：6862995757234914824
         */
        private String ethnicityRace;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private ObjectFieldData[] customFields;
        /**
         * 籍贯
         * <p> 示例值：6862995757234914824
         */
        private String nativeRegion;
        /**
         * 户口类型
         * <p> 示例值：6862995757234914824
         */
        private String hukouType;
        /**
         * 户口所在地
         * <p> 示例值：6862995757234914824
         */
        private String hukouLocation;

        /**
         * 姓名,该值是一个list，会全量更新
         * <p> 示例值：
         *
         * @param names
         * @return
         */
        public Builder names(NameForUpdate[] names) {
            this.names = names;
            return this;
        }


        /**
         * 电话,该值是一个list，会全量更新
         * <p> 示例值：
         *
         * @param phones
         * @return
         */
        public Builder phones(PhoneForUpdate[] phones) {
            this.phones = phones;
            return this;
        }


        /**
         * 邮箱,该值是一个list，会全量更新
         * <p> 示例值：
         *
         * @param emails
         * @return
         */
        public Builder emails(EmailForUpdate[] emails) {
            this.emails = emails;
            return this;
        }


        /**
         * 国籍
         * <p> 示例值：6862995757234914824
         *
         * @param nationalityV2Id
         * @return
         */
        public Builder nationalityV2Id(String nationalityV2Id) {
            this.nationalityV2Id = nationalityV2Id;
            return this;
        }


        /**
         * 其他国籍
         * <p> 示例值：[6862995757234914824]
         *
         * @param additionalNationalityIdList
         * @return
         */
        public Builder additionalNationalityIdList(String[] additionalNationalityIdList) {
            this.additionalNationalityIdList = additionalNationalityIdList;
            return this;
        }


        /**
         * 纳税身份信息,该值是一个list，会全量更新
         * <p> 示例值：
         *
         * @param residentTaxList
         * @return
         */
        public Builder residentTaxList(ResidentTaxForUpdate[] residentTaxList) {
            this.residentTaxList = residentTaxList;
            return this;
        }


        /**
         * 出生国家/地区
         * <p> 示例值：6862995757234914824
         *
         * @param bornCountryRegion
         * @return
         */
        public Builder bornCountryRegion(String bornCountryRegion) {
            this.bornCountryRegion = bornCountryRegion;
            return this;
        }


        /**
         * 是否残疾
         * <p> 示例值：true
         *
         * @param isDisabled
         * @return
         */
        public Builder isDisabled(Boolean isDisabled) {
            this.isDisabled = isDisabled;
            return this;
        }


        /**
         * 残疾证号
         * <p> 示例值：6862995757234914824
         *
         * @param disableCardNumber
         * @return
         */
        public Builder disableCardNumber(String disableCardNumber) {
            this.disableCardNumber = disableCardNumber;
            return this;
        }


        /**
         * 是否孤老
         * <p> 示例值：true
         *
         * @param isOldAlone
         * @return
         */
        public Builder isOldAlone(Boolean isOldAlone) {
            this.isOldAlone = isOldAlone;
            return this;
        }


        /**
         * 是否烈属
         * <p> 示例值：true
         *
         * @param isMartyrFamily
         * @return
         */
        public Builder isMartyrFamily(Boolean isMartyrFamily) {
            this.isMartyrFamily = isMartyrFamily;
            return this;
        }


        /**
         * 烈属证号
         * <p> 示例值：6862995757234914824
         *
         * @param martyrCardNumber
         * @return
         */
        public Builder martyrCardNumber(String martyrCardNumber) {
            this.martyrCardNumber = martyrCardNumber;
            return this;
        }


        /**
         * 家庭成员
         * <p> 示例值：
         *
         * @param dependentList
         * @return
         */
        public Builder dependentList(DependentForUpdate[] dependentList) {
            this.dependentList = dependentList;
            return this;
        }


        /**
         * 宗教信仰
         * <p> 示例值：6862995757234914824
         *
         * @param religion
         * @return
         */
        public Builder religion(String religion) {
            this.religion = religion;
            return this;
        }


        /**
         * 银行账号
         * <p> 示例值：
         *
         * @param bankAccountList
         * @return
         */
        public Builder bankAccountList(BankAccountForUpdate[] bankAccountList) {
            this.bankAccountList = bankAccountList;
            return this;
        }


        /**
         * 证件账号
         * <p> 示例值：
         *
         * @param nationalIdList
         * @return
         */
        public Builder nationalIdList(NationalIdForUpdate[] nationalIdList) {
            this.nationalIdList = nationalIdList;
            return this;
        }


        /**
         * 个人资料
         * <p> 示例值：
         *
         * @param personalProfileList
         * @return
         */
        public Builder personalProfileList(PersonalProfileForUpdate[] personalProfileList) {
            this.personalProfileList = personalProfileList;
            return this;
        }


        /**
         * 紧急联系人
         * <p> 示例值：
         *
         * @param emergencyContactList
         * @return
         */
        public Builder emergencyContactList(EmergencyContactForUpdate[] emergencyContactList) {
            this.emergencyContactList = emergencyContactList;
            return this;
        }


        /**
         * 联系地址
         * <p> 示例值：
         *
         * @param addressList
         * @return
         */
        public Builder addressList(AddressForUpdate[] addressList) {
            this.addressList = addressList;
            return this;
        }


        /**
         * 婚姻状况
         * <p> 示例值：6862995757234914824
         *
         * @param maritalStatus
         * @return
         */
        public Builder maritalStatus(String maritalStatus) {
            this.maritalStatus = maritalStatus;
            return this;
        }


        /**
         * 民族 / 种族
         * <p> 示例值：6862995757234914824
         *
         * @param ethnicityRace
         * @return
         */
        public Builder ethnicityRace(String ethnicityRace) {
            this.ethnicityRace = ethnicityRace;
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


        /**
         * 籍贯
         * <p> 示例值：6862995757234914824
         *
         * @param nativeRegion
         * @return
         */
        public Builder nativeRegion(String nativeRegion) {
            this.nativeRegion = nativeRegion;
            return this;
        }


        /**
         * 户口类型
         * <p> 示例值：6862995757234914824
         *
         * @param hukouType
         * @return
         */
        public Builder hukouType(String hukouType) {
            this.hukouType = hukouType;
            return this;
        }


        /**
         * 户口所在地
         * <p> 示例值：6862995757234914824
         *
         * @param hukouLocation
         * @return
         */
        public Builder hukouLocation(String hukouLocation) {
            this.hukouLocation = hukouLocation;
            return this;
        }


        public BasicInfoUpdate build() {
            return new BasicInfoUpdate(this);
        }
    }
}
