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

public class Job {
    /**
     * 实体在CoreHR内部的唯一键
     * <p> 示例值：4698040628992333549
     */
    @SerializedName("id")
    private String id;
    /**
     * 编码
     * <p> 示例值：JP422119
     */
    @SerializedName("code")
    private String code;
    /**
     * 名称
     * <p> 示例值：
     */
    @SerializedName("name")
    private I18n[] name;
    /**
     * 描述
     * <p> 示例值：
     */
    @SerializedName("description")
    private I18n[] description;
    /**
     * 启用
     * <p> 示例值：true
     */
    @SerializedName("active")
    private Boolean active;
    /**
     * 职务头衔
     * <p> 示例值：
     */
    @SerializedName("job_title")
    private I18n[] jobTitle;
    /**
     * 序列
     * <p> 示例值：
     */
    @SerializedName("job_family_id_list")
    private String[] jobFamilyIdList;
    /**
     * 职级
     * <p> 示例值：
     */
    @SerializedName("job_level_id_list")
    private String[] jobLevelIdList;
    /**
     * 工时制度，引用WorkingHoursType的ID
     * <p> 示例值：6890452208593372679
     */
    @SerializedName("working_hours_type_id")
    private String workingHoursTypeId;
    /**
     * 生效时间
     * <p> 示例值：2020-01-01 00:00:00
     */
    @SerializedName("effective_time")
    private String effectiveTime;
    /**
     * 失效时间
     * <p> 示例值：2021-01-01 00:00:00
     */
    @SerializedName("expiration_time")
    private String expirationTime;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("custom_fields")
    private ObjectFieldData[] customFields;

    // builder 开始
    public Job() {
    }

    public Job(Builder builder) {
        /**
         * 实体在CoreHR内部的唯一键
         * <p> 示例值：4698040628992333549
         */
        this.id = builder.id;
        /**
         * 编码
         * <p> 示例值：JP422119
         */
        this.code = builder.code;
        /**
         * 名称
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 描述
         * <p> 示例值：
         */
        this.description = builder.description;
        /**
         * 启用
         * <p> 示例值：true
         */
        this.active = builder.active;
        /**
         * 职务头衔
         * <p> 示例值：
         */
        this.jobTitle = builder.jobTitle;
        /**
         * 序列
         * <p> 示例值：
         */
        this.jobFamilyIdList = builder.jobFamilyIdList;
        /**
         * 职级
         * <p> 示例值：
         */
        this.jobLevelIdList = builder.jobLevelIdList;
        /**
         * 工时制度，引用WorkingHoursType的ID
         * <p> 示例值：6890452208593372679
         */
        this.workingHoursTypeId = builder.workingHoursTypeId;
        /**
         * 生效时间
         * <p> 示例值：2020-01-01 00:00:00
         */
        this.effectiveTime = builder.effectiveTime;
        /**
         * 失效时间
         * <p> 示例值：2021-01-01 00:00:00
         */
        this.expirationTime = builder.expirationTime;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        this.customFields = builder.customFields;
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

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public I18n[] getName() {
        return this.name;
    }

    public void setName(I18n[] name) {
        this.name = name;
    }

    public I18n[] getDescription() {
        return this.description;
    }

    public void setDescription(I18n[] description) {
        this.description = description;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public I18n[] getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(I18n[] jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String[] getJobFamilyIdList() {
        return this.jobFamilyIdList;
    }

    public void setJobFamilyIdList(String[] jobFamilyIdList) {
        this.jobFamilyIdList = jobFamilyIdList;
    }

    public String[] getJobLevelIdList() {
        return this.jobLevelIdList;
    }

    public void setJobLevelIdList(String[] jobLevelIdList) {
        this.jobLevelIdList = jobLevelIdList;
    }

    public String getWorkingHoursTypeId() {
        return this.workingHoursTypeId;
    }

    public void setWorkingHoursTypeId(String workingHoursTypeId) {
        this.workingHoursTypeId = workingHoursTypeId;
    }

    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public String getExpirationTime() {
        return this.expirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    public ObjectFieldData[] getCustomFields() {
        return this.customFields;
    }

    public void setCustomFields(ObjectFieldData[] customFields) {
        this.customFields = customFields;
    }

    public static class Builder {
        /**
         * 实体在CoreHR内部的唯一键
         * <p> 示例值：4698040628992333549
         */
        private String id;
        /**
         * 编码
         * <p> 示例值：JP422119
         */
        private String code;
        /**
         * 名称
         * <p> 示例值：
         */
        private I18n[] name;
        /**
         * 描述
         * <p> 示例值：
         */
        private I18n[] description;
        /**
         * 启用
         * <p> 示例值：true
         */
        private Boolean active;
        /**
         * 职务头衔
         * <p> 示例值：
         */
        private I18n[] jobTitle;
        /**
         * 序列
         * <p> 示例值：
         */
        private String[] jobFamilyIdList;
        /**
         * 职级
         * <p> 示例值：
         */
        private String[] jobLevelIdList;
        /**
         * 工时制度，引用WorkingHoursType的ID
         * <p> 示例值：6890452208593372679
         */
        private String workingHoursTypeId;
        /**
         * 生效时间
         * <p> 示例值：2020-01-01 00:00:00
         */
        private String effectiveTime;
        /**
         * 失效时间
         * <p> 示例值：2021-01-01 00:00:00
         */
        private String expirationTime;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private ObjectFieldData[] customFields;

        /**
         * 实体在CoreHR内部的唯一键
         * <p> 示例值：4698040628992333549
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 编码
         * <p> 示例值：JP422119
         *
         * @param code
         * @return
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }


        /**
         * 名称
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
         * 描述
         * <p> 示例值：
         *
         * @param description
         * @return
         */
        public Builder description(I18n[] description) {
            this.description = description;
            return this;
        }


        /**
         * 启用
         * <p> 示例值：true
         *
         * @param active
         * @return
         */
        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }


        /**
         * 职务头衔
         * <p> 示例值：
         *
         * @param jobTitle
         * @return
         */
        public Builder jobTitle(I18n[] jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }


        /**
         * 序列
         * <p> 示例值：
         *
         * @param jobFamilyIdList
         * @return
         */
        public Builder jobFamilyIdList(String[] jobFamilyIdList) {
            this.jobFamilyIdList = jobFamilyIdList;
            return this;
        }


        /**
         * 职级
         * <p> 示例值：
         *
         * @param jobLevelIdList
         * @return
         */
        public Builder jobLevelIdList(String[] jobLevelIdList) {
            this.jobLevelIdList = jobLevelIdList;
            return this;
        }


        /**
         * 工时制度，引用WorkingHoursType的ID
         * <p> 示例值：6890452208593372679
         *
         * @param workingHoursTypeId
         * @return
         */
        public Builder workingHoursTypeId(String workingHoursTypeId) {
            this.workingHoursTypeId = workingHoursTypeId;
            return this;
        }


        /**
         * 生效时间
         * <p> 示例值：2020-01-01 00:00:00
         *
         * @param effectiveTime
         * @return
         */
        public Builder effectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }


        /**
         * 失效时间
         * <p> 示例值：2021-01-01 00:00:00
         *
         * @param expirationTime
         * @return
         */
        public Builder expirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
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


        public Job build() {
            return new Job(this);
        }
    }
}
