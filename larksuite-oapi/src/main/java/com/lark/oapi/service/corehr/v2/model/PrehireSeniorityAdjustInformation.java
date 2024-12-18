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

public class PrehireSeniorityAdjustInformation {
    /**
     * 调整值;- 精确度：两位小数;- 单位：年;- 自动计算逻辑：如果这个值为空，司龄调整的开始日期和结束日期均不为空，会自动计算出调整值
     * <p> 示例值：0.5
     */
    @SerializedName("seniority_adjustment")
    private Double seniorityAdjustment;
    /**
     * 调整类型;- 可通过[【获取字段详情】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/custom_field/get_by_param)接口查询，查询参数如下：;  - object_api_name：seniority_adjust_information;  - custom_api_name：seniority_adjustment_type
     * <p> 示例值：增加
     */
    @SerializedName("seniority_adjustment_type")
    private String seniorityAdjustmentType;
    /**
     * 司龄调整原因
     * <p> 示例值：工厂停产需要减去半年工龄
     */
    @SerializedName("reasons_for_seniority_adjustment")
    private String reasonsForSeniorityAdjustment;
    /**
     * 开始日期;- 格式： yyyy-mm-dd
     * <p> 示例值：2024-05-19
     */
    @SerializedName("start_date")
    private String startDate;
    /**
     * 结束日期;- 格式： yyyy-mm-dd
     * <p> 示例值：2024-11-18
     */
    @SerializedName("end_date")
    private String endDate;

    // builder 开始
    public PrehireSeniorityAdjustInformation() {
    }

    public PrehireSeniorityAdjustInformation(Builder builder) {
        /**
         * 调整值;- 精确度：两位小数;- 单位：年;- 自动计算逻辑：如果这个值为空，司龄调整的开始日期和结束日期均不为空，会自动计算出调整值
         * <p> 示例值：0.5
         */
        this.seniorityAdjustment = builder.seniorityAdjustment;
        /**
         * 调整类型;- 可通过[【获取字段详情】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/custom_field/get_by_param)接口查询，查询参数如下：;  - object_api_name：seniority_adjust_information;  - custom_api_name：seniority_adjustment_type
         * <p> 示例值：增加
         */
        this.seniorityAdjustmentType = builder.seniorityAdjustmentType;
        /**
         * 司龄调整原因
         * <p> 示例值：工厂停产需要减去半年工龄
         */
        this.reasonsForSeniorityAdjustment = builder.reasonsForSeniorityAdjustment;
        /**
         * 开始日期;- 格式： yyyy-mm-dd
         * <p> 示例值：2024-05-19
         */
        this.startDate = builder.startDate;
        /**
         * 结束日期;- 格式： yyyy-mm-dd
         * <p> 示例值：2024-11-18
         */
        this.endDate = builder.endDate;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Double getSeniorityAdjustment() {
        return this.seniorityAdjustment;
    }

    public void setSeniorityAdjustment(Double seniorityAdjustment) {
        this.seniorityAdjustment = seniorityAdjustment;
    }

    public String getSeniorityAdjustmentType() {
        return this.seniorityAdjustmentType;
    }

    public void setSeniorityAdjustmentType(String seniorityAdjustmentType) {
        this.seniorityAdjustmentType = seniorityAdjustmentType;
    }

    public String getReasonsForSeniorityAdjustment() {
        return this.reasonsForSeniorityAdjustment;
    }

    public void setReasonsForSeniorityAdjustment(String reasonsForSeniorityAdjustment) {
        this.reasonsForSeniorityAdjustment = reasonsForSeniorityAdjustment;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public static class Builder {
        /**
         * 调整值;- 精确度：两位小数;- 单位：年;- 自动计算逻辑：如果这个值为空，司龄调整的开始日期和结束日期均不为空，会自动计算出调整值
         * <p> 示例值：0.5
         */
        private Double seniorityAdjustment;
        /**
         * 调整类型;- 可通过[【获取字段详情】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/custom_field/get_by_param)接口查询，查询参数如下：;  - object_api_name：seniority_adjust_information;  - custom_api_name：seniority_adjustment_type
         * <p> 示例值：增加
         */
        private String seniorityAdjustmentType;
        /**
         * 司龄调整原因
         * <p> 示例值：工厂停产需要减去半年工龄
         */
        private String reasonsForSeniorityAdjustment;
        /**
         * 开始日期;- 格式： yyyy-mm-dd
         * <p> 示例值：2024-05-19
         */
        private String startDate;
        /**
         * 结束日期;- 格式： yyyy-mm-dd
         * <p> 示例值：2024-11-18
         */
        private String endDate;

        /**
         * 调整值;- 精确度：两位小数;- 单位：年;- 自动计算逻辑：如果这个值为空，司龄调整的开始日期和结束日期均不为空，会自动计算出调整值
         * <p> 示例值：0.5
         *
         * @param seniorityAdjustment
         * @return
         */
        public Builder seniorityAdjustment(Double seniorityAdjustment) {
            this.seniorityAdjustment = seniorityAdjustment;
            return this;
        }


        /**
         * 调整类型;- 可通过[【获取字段详情】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/custom_field/get_by_param)接口查询，查询参数如下：;  - object_api_name：seniority_adjust_information;  - custom_api_name：seniority_adjustment_type
         * <p> 示例值：增加
         *
         * @param seniorityAdjustmentType
         * @return
         */
        public Builder seniorityAdjustmentType(String seniorityAdjustmentType) {
            this.seniorityAdjustmentType = seniorityAdjustmentType;
            return this;
        }

        /**
         * 调整类型;- 可通过[【获取字段详情】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/custom_field/get_by_param)接口查询，查询参数如下：;  - object_api_name：seniority_adjust_information;  - custom_api_name：seniority_adjustment_type
         * <p> 示例值：增加
         *
         * @param seniorityAdjustmentType {@link com.lark.oapi.service.corehr.v2.enums.PrehireSeniorityAdjustInformationSeniorityAdjustmentTypeEnum}
         * @return
         */
        public Builder seniorityAdjustmentType(com.lark.oapi.service.corehr.v2.enums.PrehireSeniorityAdjustInformationSeniorityAdjustmentTypeEnum seniorityAdjustmentType) {
            this.seniorityAdjustmentType = seniorityAdjustmentType.getValue();
            return this;
        }


        /**
         * 司龄调整原因
         * <p> 示例值：工厂停产需要减去半年工龄
         *
         * @param reasonsForSeniorityAdjustment
         * @return
         */
        public Builder reasonsForSeniorityAdjustment(String reasonsForSeniorityAdjustment) {
            this.reasonsForSeniorityAdjustment = reasonsForSeniorityAdjustment;
            return this;
        }


        /**
         * 开始日期;- 格式： yyyy-mm-dd
         * <p> 示例值：2024-05-19
         *
         * @param startDate
         * @return
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }


        /**
         * 结束日期;- 格式： yyyy-mm-dd
         * <p> 示例值：2024-11-18
         *
         * @param endDate
         * @return
         */
        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }


        public PrehireSeniorityAdjustInformation build() {
            return new PrehireSeniorityAdjustInformation(this);
        }
    }
}
