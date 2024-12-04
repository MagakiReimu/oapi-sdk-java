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

public class WorkforcePlanDetailV2 {
    /**
     * 编制规划明细 ID
     * <p> 示例值："123456"
     */
    @SerializedName("workforce_plan_detail_id")
    private String workforcePlanDetailId;
    /**
     * 维度信息
     * <p> 示例值：
     */
    @SerializedName("dimension_info_datas")
    private DimensionInfoData[] dimensionInfoDatas;
    /**
     * 编制规划值
     * <p> 示例值：10.00
     */
    @SerializedName("workforce_plan")
    private String workforcePlan;
    /**
     * 在职人数
     * <p> 示例值：10.00
     */
    @SerializedName("active_individuals")
    private String activeIndividuals;
    /**
     * 预增员数量
     * <p> 示例值：10.00
     */
    @SerializedName("individuals_to_be_added")
    private String individualsToBeAdded;
    /**
     * 预减员
     * <p> 示例值：10.00
     */
    @SerializedName("individuals_to_be_removed")
    private String individualsToBeRemoved;
    /**
     * 缺编数
     * <p> 示例值：10.00
     */
    @SerializedName("vacancy")
    private String vacancy;
    /**
     * 缺编数（含在途）
     * <p> 示例值：10.00
     */
    @SerializedName("vacancy_including_individuals_to_be_added_and_removed")
    private String vacancyIncludingIndividualsToBeAddedAndRemoved;
    /**
     * 满编率， 返回 0.5 表示满编率为 50%
     * <p> 示例值：0.5
     */
    @SerializedName("fulfillment_rate")
    private String fulfillmentRate;
    /**
     * 满编率（含在途）， 返回 0.5 表示满编率为 50%
     * <p> 示例值：0.5
     */
    @SerializedName("fulfillment_rate_including_individuals_to_be_added_and_removed")
    private String fulfillmentRateIncludingIndividualsToBeAddedAndRemoved;
    /**
     * 预估在职人数明细
     * <p> 示例值：
     */
    @SerializedName("estimated_active_individuals_details")
    private WorkforcePlanEaiDetail[] estimatedActiveIndividualsDetails;

    // builder 开始
    public WorkforcePlanDetailV2() {
    }

    public WorkforcePlanDetailV2(Builder builder) {
        /**
         * 编制规划明细 ID
         * <p> 示例值："123456"
         */
        this.workforcePlanDetailId = builder.workforcePlanDetailId;
        /**
         * 维度信息
         * <p> 示例值：
         */
        this.dimensionInfoDatas = builder.dimensionInfoDatas;
        /**
         * 编制规划值
         * <p> 示例值：10.00
         */
        this.workforcePlan = builder.workforcePlan;
        /**
         * 在职人数
         * <p> 示例值：10.00
         */
        this.activeIndividuals = builder.activeIndividuals;
        /**
         * 预增员数量
         * <p> 示例值：10.00
         */
        this.individualsToBeAdded = builder.individualsToBeAdded;
        /**
         * 预减员
         * <p> 示例值：10.00
         */
        this.individualsToBeRemoved = builder.individualsToBeRemoved;
        /**
         * 缺编数
         * <p> 示例值：10.00
         */
        this.vacancy = builder.vacancy;
        /**
         * 缺编数（含在途）
         * <p> 示例值：10.00
         */
        this.vacancyIncludingIndividualsToBeAddedAndRemoved = builder.vacancyIncludingIndividualsToBeAddedAndRemoved;
        /**
         * 满编率， 返回 0.5 表示满编率为 50%
         * <p> 示例值：0.5
         */
        this.fulfillmentRate = builder.fulfillmentRate;
        /**
         * 满编率（含在途）， 返回 0.5 表示满编率为 50%
         * <p> 示例值：0.5
         */
        this.fulfillmentRateIncludingIndividualsToBeAddedAndRemoved = builder.fulfillmentRateIncludingIndividualsToBeAddedAndRemoved;
        /**
         * 预估在职人数明细
         * <p> 示例值：
         */
        this.estimatedActiveIndividualsDetails = builder.estimatedActiveIndividualsDetails;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getWorkforcePlanDetailId() {
        return this.workforcePlanDetailId;
    }

    public void setWorkforcePlanDetailId(String workforcePlanDetailId) {
        this.workforcePlanDetailId = workforcePlanDetailId;
    }

    public DimensionInfoData[] getDimensionInfoDatas() {
        return this.dimensionInfoDatas;
    }

    public void setDimensionInfoDatas(DimensionInfoData[] dimensionInfoDatas) {
        this.dimensionInfoDatas = dimensionInfoDatas;
    }

    public String getWorkforcePlan() {
        return this.workforcePlan;
    }

    public void setWorkforcePlan(String workforcePlan) {
        this.workforcePlan = workforcePlan;
    }

    public String getActiveIndividuals() {
        return this.activeIndividuals;
    }

    public void setActiveIndividuals(String activeIndividuals) {
        this.activeIndividuals = activeIndividuals;
    }

    public String getIndividualsToBeAdded() {
        return this.individualsToBeAdded;
    }

    public void setIndividualsToBeAdded(String individualsToBeAdded) {
        this.individualsToBeAdded = individualsToBeAdded;
    }

    public String getIndividualsToBeRemoved() {
        return this.individualsToBeRemoved;
    }

    public void setIndividualsToBeRemoved(String individualsToBeRemoved) {
        this.individualsToBeRemoved = individualsToBeRemoved;
    }

    public String getVacancy() {
        return this.vacancy;
    }

    public void setVacancy(String vacancy) {
        this.vacancy = vacancy;
    }

    public String getVacancyIncludingIndividualsToBeAddedAndRemoved() {
        return this.vacancyIncludingIndividualsToBeAddedAndRemoved;
    }

    public void setVacancyIncludingIndividualsToBeAddedAndRemoved(String vacancyIncludingIndividualsToBeAddedAndRemoved) {
        this.vacancyIncludingIndividualsToBeAddedAndRemoved = vacancyIncludingIndividualsToBeAddedAndRemoved;
    }

    public String getFulfillmentRate() {
        return this.fulfillmentRate;
    }

    public void setFulfillmentRate(String fulfillmentRate) {
        this.fulfillmentRate = fulfillmentRate;
    }

    public String getFulfillmentRateIncludingIndividualsToBeAddedAndRemoved() {
        return this.fulfillmentRateIncludingIndividualsToBeAddedAndRemoved;
    }

    public void setFulfillmentRateIncludingIndividualsToBeAddedAndRemoved(String fulfillmentRateIncludingIndividualsToBeAddedAndRemoved) {
        this.fulfillmentRateIncludingIndividualsToBeAddedAndRemoved = fulfillmentRateIncludingIndividualsToBeAddedAndRemoved;
    }

    public WorkforcePlanEaiDetail[] getEstimatedActiveIndividualsDetails() {
        return this.estimatedActiveIndividualsDetails;
    }

    public void setEstimatedActiveIndividualsDetails(WorkforcePlanEaiDetail[] estimatedActiveIndividualsDetails) {
        this.estimatedActiveIndividualsDetails = estimatedActiveIndividualsDetails;
    }

    public static class Builder {
        /**
         * 编制规划明细 ID
         * <p> 示例值："123456"
         */
        private String workforcePlanDetailId;
        /**
         * 维度信息
         * <p> 示例值：
         */
        private DimensionInfoData[] dimensionInfoDatas;
        /**
         * 编制规划值
         * <p> 示例值：10.00
         */
        private String workforcePlan;
        /**
         * 在职人数
         * <p> 示例值：10.00
         */
        private String activeIndividuals;
        /**
         * 预增员数量
         * <p> 示例值：10.00
         */
        private String individualsToBeAdded;
        /**
         * 预减员
         * <p> 示例值：10.00
         */
        private String individualsToBeRemoved;
        /**
         * 缺编数
         * <p> 示例值：10.00
         */
        private String vacancy;
        /**
         * 缺编数（含在途）
         * <p> 示例值：10.00
         */
        private String vacancyIncludingIndividualsToBeAddedAndRemoved;
        /**
         * 满编率， 返回 0.5 表示满编率为 50%
         * <p> 示例值：0.5
         */
        private String fulfillmentRate;
        /**
         * 满编率（含在途）， 返回 0.5 表示满编率为 50%
         * <p> 示例值：0.5
         */
        private String fulfillmentRateIncludingIndividualsToBeAddedAndRemoved;
        /**
         * 预估在职人数明细
         * <p> 示例值：
         */
        private WorkforcePlanEaiDetail[] estimatedActiveIndividualsDetails;

        /**
         * 编制规划明细 ID
         * <p> 示例值："123456"
         *
         * @param workforcePlanDetailId
         * @return
         */
        public Builder workforcePlanDetailId(String workforcePlanDetailId) {
            this.workforcePlanDetailId = workforcePlanDetailId;
            return this;
        }


        /**
         * 维度信息
         * <p> 示例值：
         *
         * @param dimensionInfoDatas
         * @return
         */
        public Builder dimensionInfoDatas(DimensionInfoData[] dimensionInfoDatas) {
            this.dimensionInfoDatas = dimensionInfoDatas;
            return this;
        }


        /**
         * 编制规划值
         * <p> 示例值：10.00
         *
         * @param workforcePlan
         * @return
         */
        public Builder workforcePlan(String workforcePlan) {
            this.workforcePlan = workforcePlan;
            return this;
        }


        /**
         * 在职人数
         * <p> 示例值：10.00
         *
         * @param activeIndividuals
         * @return
         */
        public Builder activeIndividuals(String activeIndividuals) {
            this.activeIndividuals = activeIndividuals;
            return this;
        }


        /**
         * 预增员数量
         * <p> 示例值：10.00
         *
         * @param individualsToBeAdded
         * @return
         */
        public Builder individualsToBeAdded(String individualsToBeAdded) {
            this.individualsToBeAdded = individualsToBeAdded;
            return this;
        }


        /**
         * 预减员
         * <p> 示例值：10.00
         *
         * @param individualsToBeRemoved
         * @return
         */
        public Builder individualsToBeRemoved(String individualsToBeRemoved) {
            this.individualsToBeRemoved = individualsToBeRemoved;
            return this;
        }


        /**
         * 缺编数
         * <p> 示例值：10.00
         *
         * @param vacancy
         * @return
         */
        public Builder vacancy(String vacancy) {
            this.vacancy = vacancy;
            return this;
        }


        /**
         * 缺编数（含在途）
         * <p> 示例值：10.00
         *
         * @param vacancyIncludingIndividualsToBeAddedAndRemoved
         * @return
         */
        public Builder vacancyIncludingIndividualsToBeAddedAndRemoved(String vacancyIncludingIndividualsToBeAddedAndRemoved) {
            this.vacancyIncludingIndividualsToBeAddedAndRemoved = vacancyIncludingIndividualsToBeAddedAndRemoved;
            return this;
        }


        /**
         * 满编率， 返回 0.5 表示满编率为 50%
         * <p> 示例值：0.5
         *
         * @param fulfillmentRate
         * @return
         */
        public Builder fulfillmentRate(String fulfillmentRate) {
            this.fulfillmentRate = fulfillmentRate;
            return this;
        }


        /**
         * 满编率（含在途）， 返回 0.5 表示满编率为 50%
         * <p> 示例值：0.5
         *
         * @param fulfillmentRateIncludingIndividualsToBeAddedAndRemoved
         * @return
         */
        public Builder fulfillmentRateIncludingIndividualsToBeAddedAndRemoved(String fulfillmentRateIncludingIndividualsToBeAddedAndRemoved) {
            this.fulfillmentRateIncludingIndividualsToBeAddedAndRemoved = fulfillmentRateIncludingIndividualsToBeAddedAndRemoved;
            return this;
        }


        /**
         * 预估在职人数明细
         * <p> 示例值：
         *
         * @param estimatedActiveIndividualsDetails
         * @return
         */
        public Builder estimatedActiveIndividualsDetails(WorkforcePlanEaiDetail[] estimatedActiveIndividualsDetails) {
            this.estimatedActiveIndividualsDetails = estimatedActiveIndividualsDetails;
            return this;
        }


        public WorkforcePlanDetailV2 build() {
            return new WorkforcePlanDetailV2(this);
        }
    }
}
