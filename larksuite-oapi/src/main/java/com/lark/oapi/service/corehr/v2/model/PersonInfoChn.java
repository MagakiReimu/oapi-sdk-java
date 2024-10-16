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

public class PersonInfoChn {
    /**
     * 籍贯 ID
     * <p> 示例值：6863326262618752111
     */
    @SerializedName("native_region")
    private String nativeRegion;
    /**
     * -| 户口类型，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可： - custom_api_name：hukou_type - object_api_name：person_info_chn
     * <p> 示例值：
     */
    @SerializedName("hukou_type")
    private Enum hukouType;
    /**
     * 户口所在地
     * <p> 示例值：山东省平阴县
     */
    @SerializedName("hukou_location")
    private String hukouLocation;
    /**
     * 首次入境日期
     * <p> 示例值：2023-07-09
     */
    @SerializedName("first_entry_time")
    private String firstEntryTime;
    /**
     * 预计离境日期
     * <p> 示例值：2023-07-09
     */
    @SerializedName("leave_time")
    private String leaveTime;
    /**
     * 政治面貌，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可： - custom_api_name：political_affiliation - object_api_name：person_info_chn
     * <p> 示例值：
     */
    @SerializedName("political_affiliations")
    private Enum[] politicalAffiliations;

    // builder 开始
    public PersonInfoChn() {
    }

    public PersonInfoChn(Builder builder) {
        /**
         * 籍贯 ID
         * <p> 示例值：6863326262618752111
         */
        this.nativeRegion = builder.nativeRegion;
        /**
         * -| 户口类型，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可： - custom_api_name：hukou_type - object_api_name：person_info_chn
         * <p> 示例值：
         */
        this.hukouType = builder.hukouType;
        /**
         * 户口所在地
         * <p> 示例值：山东省平阴县
         */
        this.hukouLocation = builder.hukouLocation;
        /**
         * 首次入境日期
         * <p> 示例值：2023-07-09
         */
        this.firstEntryTime = builder.firstEntryTime;
        /**
         * 预计离境日期
         * <p> 示例值：2023-07-09
         */
        this.leaveTime = builder.leaveTime;
        /**
         * 政治面貌，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可： - custom_api_name：political_affiliation - object_api_name：person_info_chn
         * <p> 示例值：
         */
        this.politicalAffiliations = builder.politicalAffiliations;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getNativeRegion() {
        return this.nativeRegion;
    }

    public void setNativeRegion(String nativeRegion) {
        this.nativeRegion = nativeRegion;
    }

    public Enum getHukouType() {
        return this.hukouType;
    }

    public void setHukouType(Enum hukouType) {
        this.hukouType = hukouType;
    }

    public String getHukouLocation() {
        return this.hukouLocation;
    }

    public void setHukouLocation(String hukouLocation) {
        this.hukouLocation = hukouLocation;
    }

    public String getFirstEntryTime() {
        return this.firstEntryTime;
    }

    public void setFirstEntryTime(String firstEntryTime) {
        this.firstEntryTime = firstEntryTime;
    }

    public String getLeaveTime() {
        return this.leaveTime;
    }

    public void setLeaveTime(String leaveTime) {
        this.leaveTime = leaveTime;
    }

    public Enum[] getPoliticalAffiliations() {
        return this.politicalAffiliations;
    }

    public void setPoliticalAffiliations(Enum[] politicalAffiliations) {
        this.politicalAffiliations = politicalAffiliations;
    }

    public static class Builder {
        /**
         * 籍贯 ID
         * <p> 示例值：6863326262618752111
         */
        private String nativeRegion;
        /**
         * -| 户口类型，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可： - custom_api_name：hukou_type - object_api_name：person_info_chn
         * <p> 示例值：
         */
        private Enum hukouType;
        /**
         * 户口所在地
         * <p> 示例值：山东省平阴县
         */
        private String hukouLocation;
        /**
         * 首次入境日期
         * <p> 示例值：2023-07-09
         */
        private String firstEntryTime;
        /**
         * 预计离境日期
         * <p> 示例值：2023-07-09
         */
        private String leaveTime;
        /**
         * 政治面貌，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可： - custom_api_name：political_affiliation - object_api_name：person_info_chn
         * <p> 示例值：
         */
        private Enum[] politicalAffiliations;

        /**
         * 籍贯 ID
         * <p> 示例值：6863326262618752111
         *
         * @param nativeRegion
         * @return
         */
        public Builder nativeRegion(String nativeRegion) {
            this.nativeRegion = nativeRegion;
            return this;
        }


        /**
         * -| 户口类型，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可： - custom_api_name：hukou_type - object_api_name：person_info_chn
         * <p> 示例值：
         *
         * @param hukouType
         * @return
         */
        public Builder hukouType(Enum hukouType) {
            this.hukouType = hukouType;
            return this;
        }


        /**
         * 户口所在地
         * <p> 示例值：山东省平阴县
         *
         * @param hukouLocation
         * @return
         */
        public Builder hukouLocation(String hukouLocation) {
            this.hukouLocation = hukouLocation;
            return this;
        }


        /**
         * 首次入境日期
         * <p> 示例值：2023-07-09
         *
         * @param firstEntryTime
         * @return
         */
        public Builder firstEntryTime(String firstEntryTime) {
            this.firstEntryTime = firstEntryTime;
            return this;
        }


        /**
         * 预计离境日期
         * <p> 示例值：2023-07-09
         *
         * @param leaveTime
         * @return
         */
        public Builder leaveTime(String leaveTime) {
            this.leaveTime = leaveTime;
            return this;
        }


        /**
         * 政治面貌，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可： - custom_api_name：political_affiliation - object_api_name：person_info_chn
         * <p> 示例值：
         *
         * @param politicalAffiliations
         * @return
         */
        public Builder politicalAffiliations(Enum[] politicalAffiliations) {
            this.politicalAffiliations = politicalAffiliations;
            return this;
        }


        public PersonInfoChn build() {
            return new PersonInfoChn(this);
        }
    }
}
