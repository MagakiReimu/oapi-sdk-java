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

public class SeniorityAdjustInformation {
    /**
     * 分组 ID
     * <p> 示例值：123
     */
    @SerializedName("id")
    private String id;
    /**
     * 调整类型;- 可通过[【获取字段详情】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/custom_field/get_by_param)接口查询，查询参数如下：;  - object_api_name：seniority_adjust_information;  - custom_api_name：seniority_adjustment_type
     * <p> 示例值：
     */
    @SerializedName("seniority_adjustment_type")
    private Enum seniorityAdjustmentType;
    /**
     * 开始日期;- 格式： yyyy-mm-dd
     * <p> 示例值：2024-01-01
     */
    @SerializedName("start_date")
    private String startDate;
    /**
     * 结束日期;- 格式： yyyy-mm-dd
     * <p> 示例值：2024-01-02
     */
    @SerializedName("end_date")
    private String endDate;
    /**
     * 调整原因
     * <p> 示例值：example
     */
    @SerializedName("reasons_for_seniority_adjustment")
    private String reasonsForSeniorityAdjustment;
    /**
     * 调整值;- 精确度：两位小数;- 单位：年
     * <p> 示例值：1.01
     */
    @SerializedName("seniority_adjustment")
    private Double seniorityAdjustment;
    /**
     * 自定义字段;- 具体支持的对象请参考[【自定义字段说明】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/custom-fields-guide)
     * <p> 示例值：
     */
    @SerializedName("custom_fields")
    private CustomFieldData[] customFields;

    // builder 开始
    public SeniorityAdjustInformation() {
    }

    public SeniorityAdjustInformation(Builder builder) {
        /**
         * 分组 ID
         * <p> 示例值：123
         */
        this.id = builder.id;
        /**
         * 调整类型;- 可通过[【获取字段详情】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/custom_field/get_by_param)接口查询，查询参数如下：;  - object_api_name：seniority_adjust_information;  - custom_api_name：seniority_adjustment_type
         * <p> 示例值：
         */
        this.seniorityAdjustmentType = builder.seniorityAdjustmentType;
        /**
         * 开始日期;- 格式： yyyy-mm-dd
         * <p> 示例值：2024-01-01
         */
        this.startDate = builder.startDate;
        /**
         * 结束日期;- 格式： yyyy-mm-dd
         * <p> 示例值：2024-01-02
         */
        this.endDate = builder.endDate;
        /**
         * 调整原因
         * <p> 示例值：example
         */
        this.reasonsForSeniorityAdjustment = builder.reasonsForSeniorityAdjustment;
        /**
         * 调整值;- 精确度：两位小数;- 单位：年
         * <p> 示例值：1.01
         */
        this.seniorityAdjustment = builder.seniorityAdjustment;
        /**
         * 自定义字段;- 具体支持的对象请参考[【自定义字段说明】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/custom-fields-guide)
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

    public Enum getSeniorityAdjustmentType() {
        return this.seniorityAdjustmentType;
    }

    public void setSeniorityAdjustmentType(Enum seniorityAdjustmentType) {
        this.seniorityAdjustmentType = seniorityAdjustmentType;
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

    public String getReasonsForSeniorityAdjustment() {
        return this.reasonsForSeniorityAdjustment;
    }

    public void setReasonsForSeniorityAdjustment(String reasonsForSeniorityAdjustment) {
        this.reasonsForSeniorityAdjustment = reasonsForSeniorityAdjustment;
    }

    public Double getSeniorityAdjustment() {
        return this.seniorityAdjustment;
    }

    public void setSeniorityAdjustment(Double seniorityAdjustment) {
        this.seniorityAdjustment = seniorityAdjustment;
    }

    public CustomFieldData[] getCustomFields() {
        return this.customFields;
    }

    public void setCustomFields(CustomFieldData[] customFields) {
        this.customFields = customFields;
    }

    public static class Builder {
        /**
         * 分组 ID
         * <p> 示例值：123
         */
        private String id;
        /**
         * 调整类型;- 可通过[【获取字段详情】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/custom_field/get_by_param)接口查询，查询参数如下：;  - object_api_name：seniority_adjust_information;  - custom_api_name：seniority_adjustment_type
         * <p> 示例值：
         */
        private Enum seniorityAdjustmentType;
        /**
         * 开始日期;- 格式： yyyy-mm-dd
         * <p> 示例值：2024-01-01
         */
        private String startDate;
        /**
         * 结束日期;- 格式： yyyy-mm-dd
         * <p> 示例值：2024-01-02
         */
        private String endDate;
        /**
         * 调整原因
         * <p> 示例值：example
         */
        private String reasonsForSeniorityAdjustment;
        /**
         * 调整值;- 精确度：两位小数;- 单位：年
         * <p> 示例值：1.01
         */
        private Double seniorityAdjustment;
        /**
         * 自定义字段;- 具体支持的对象请参考[【自定义字段说明】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/custom-fields-guide)
         * <p> 示例值：
         */
        private CustomFieldData[] customFields;

        /**
         * 分组 ID
         * <p> 示例值：123
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 调整类型;- 可通过[【获取字段详情】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/custom_field/get_by_param)接口查询，查询参数如下：;  - object_api_name：seniority_adjust_information;  - custom_api_name：seniority_adjustment_type
         * <p> 示例值：
         *
         * @param seniorityAdjustmentType
         * @return
         */
        public Builder seniorityAdjustmentType(Enum seniorityAdjustmentType) {
            this.seniorityAdjustmentType = seniorityAdjustmentType;
            return this;
        }


        /**
         * 开始日期;- 格式： yyyy-mm-dd
         * <p> 示例值：2024-01-01
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
         * <p> 示例值：2024-01-02
         *
         * @param endDate
         * @return
         */
        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }


        /**
         * 调整原因
         * <p> 示例值：example
         *
         * @param reasonsForSeniorityAdjustment
         * @return
         */
        public Builder reasonsForSeniorityAdjustment(String reasonsForSeniorityAdjustment) {
            this.reasonsForSeniorityAdjustment = reasonsForSeniorityAdjustment;
            return this;
        }


        /**
         * 调整值;- 精确度：两位小数;- 单位：年
         * <p> 示例值：1.01
         *
         * @param seniorityAdjustment
         * @return
         */
        public Builder seniorityAdjustment(Double seniorityAdjustment) {
            this.seniorityAdjustment = seniorityAdjustment;
            return this;
        }


        /**
         * 自定义字段;- 具体支持的对象请参考[【自定义字段说明】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/custom-fields-guide)
         * <p> 示例值：
         *
         * @param customFields
         * @return
         */
        public Builder customFields(CustomFieldData[] customFields) {
            this.customFields = customFields;
            return this;
        }


        public SeniorityAdjustInformation build() {
            return new SeniorityAdjustInformation(this);
        }
    }
}
