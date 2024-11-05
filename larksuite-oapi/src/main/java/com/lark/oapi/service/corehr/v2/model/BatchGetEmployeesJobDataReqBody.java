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

public class BatchGetEmployeesJobDataReqBody {
    /**
     * 员工雇佣 ID 列表
     * <p> 示例值：
     */
    @SerializedName("employment_ids")
    private String[] employmentIds;
    /**
     * 是否获取所有任职记录，true 为获取员工所有版本的任职记录，false 为仅获取当前生效的任职记录，默认为 false
     * <p> 示例值：false
     */
    @SerializedName("get_all_version")
    private Boolean getAllVersion;
    /**
     * 生效日期 - 搜索范围开始
     * <p> 示例值：2020-01-01
     */
    @SerializedName("effective_date_start")
    private String effectiveDateStart;
    /**
     * 生效日期 - 搜索范围结束
     * <p> 示例值：2020-01-01
     */
    @SerializedName("effective_date_end")
    private String effectiveDateEnd;
    /**
     * 查看数据日期，默认为今天
     * <p> 示例值：2020-01-01
     */
    @SerializedName("data_date")
    private String dataDate;
    /**
     * 是否仅查询主职;- true：仅返回 primary_job_data 为 true 的任职记录;- false：仅返回 primary_job_data 为 false 的任职记录;- 不传：返回全部
     * <p> 示例值：true
     */
    @SerializedName("primary_job_data")
    private Boolean primaryJobData;
    /**
     * 任职原因;- 可通过[【获取字段详情】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/custom_field/get_by_param)接口查询，查询参数如下：;  - object_api_name：job_data;  - custom_api_name：assignment_start_reason
     * <p> 示例值：
     */
    @SerializedName("assignment_start_reasons")
    private String[] assignmentStartReasons;

    // builder 开始
    public BatchGetEmployeesJobDataReqBody() {
    }

    public BatchGetEmployeesJobDataReqBody(Builder builder) {
        /**
         * 员工雇佣 ID 列表
         * <p> 示例值：
         */
        this.employmentIds = builder.employmentIds;
        /**
         * 是否获取所有任职记录，true 为获取员工所有版本的任职记录，false 为仅获取当前生效的任职记录，默认为 false
         * <p> 示例值：false
         */
        this.getAllVersion = builder.getAllVersion;
        /**
         * 生效日期 - 搜索范围开始
         * <p> 示例值：2020-01-01
         */
        this.effectiveDateStart = builder.effectiveDateStart;
        /**
         * 生效日期 - 搜索范围结束
         * <p> 示例值：2020-01-01
         */
        this.effectiveDateEnd = builder.effectiveDateEnd;
        /**
         * 查看数据日期，默认为今天
         * <p> 示例值：2020-01-01
         */
        this.dataDate = builder.dataDate;
        /**
         * 是否仅查询主职;- true：仅返回 primary_job_data 为 true 的任职记录;- false：仅返回 primary_job_data 为 false 的任职记录;- 不传：返回全部
         * <p> 示例值：true
         */
        this.primaryJobData = builder.primaryJobData;
        /**
         * 任职原因;- 可通过[【获取字段详情】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/custom_field/get_by_param)接口查询，查询参数如下：;  - object_api_name：job_data;  - custom_api_name：assignment_start_reason
         * <p> 示例值：
         */
        this.assignmentStartReasons = builder.assignmentStartReasons;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String[] getEmploymentIds() {
        return this.employmentIds;
    }

    public void setEmploymentIds(String[] employmentIds) {
        this.employmentIds = employmentIds;
    }

    public Boolean getGetAllVersion() {
        return this.getAllVersion;
    }

    public void setGetAllVersion(Boolean getAllVersion) {
        this.getAllVersion = getAllVersion;
    }

    public String getEffectiveDateStart() {
        return this.effectiveDateStart;
    }

    public void setEffectiveDateStart(String effectiveDateStart) {
        this.effectiveDateStart = effectiveDateStart;
    }

    public String getEffectiveDateEnd() {
        return this.effectiveDateEnd;
    }

    public void setEffectiveDateEnd(String effectiveDateEnd) {
        this.effectiveDateEnd = effectiveDateEnd;
    }

    public String getDataDate() {
        return this.dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate;
    }

    public Boolean getPrimaryJobData() {
        return this.primaryJobData;
    }

    public void setPrimaryJobData(Boolean primaryJobData) {
        this.primaryJobData = primaryJobData;
    }

    public String[] getAssignmentStartReasons() {
        return this.assignmentStartReasons;
    }

    public void setAssignmentStartReasons(String[] assignmentStartReasons) {
        this.assignmentStartReasons = assignmentStartReasons;
    }

    public static class Builder {
        /**
         * 员工雇佣 ID 列表
         * <p> 示例值：
         */
        private String[] employmentIds;
        /**
         * 是否获取所有任职记录，true 为获取员工所有版本的任职记录，false 为仅获取当前生效的任职记录，默认为 false
         * <p> 示例值：false
         */
        private Boolean getAllVersion;
        /**
         * 生效日期 - 搜索范围开始
         * <p> 示例值：2020-01-01
         */
        private String effectiveDateStart;
        /**
         * 生效日期 - 搜索范围结束
         * <p> 示例值：2020-01-01
         */
        private String effectiveDateEnd;
        /**
         * 查看数据日期，默认为今天
         * <p> 示例值：2020-01-01
         */
        private String dataDate;
        /**
         * 是否仅查询主职;- true：仅返回 primary_job_data 为 true 的任职记录;- false：仅返回 primary_job_data 为 false 的任职记录;- 不传：返回全部
         * <p> 示例值：true
         */
        private Boolean primaryJobData;
        /**
         * 任职原因;- 可通过[【获取字段详情】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/custom_field/get_by_param)接口查询，查询参数如下：;  - object_api_name：job_data;  - custom_api_name：assignment_start_reason
         * <p> 示例值：
         */
        private String[] assignmentStartReasons;

        /**
         * 员工雇佣 ID 列表
         * <p> 示例值：
         *
         * @param employmentIds
         * @return
         */
        public Builder employmentIds(String[] employmentIds) {
            this.employmentIds = employmentIds;
            return this;
        }


        /**
         * 是否获取所有任职记录，true 为获取员工所有版本的任职记录，false 为仅获取当前生效的任职记录，默认为 false
         * <p> 示例值：false
         *
         * @param getAllVersion
         * @return
         */
        public Builder getAllVersion(Boolean getAllVersion) {
            this.getAllVersion = getAllVersion;
            return this;
        }


        /**
         * 生效日期 - 搜索范围开始
         * <p> 示例值：2020-01-01
         *
         * @param effectiveDateStart
         * @return
         */
        public Builder effectiveDateStart(String effectiveDateStart) {
            this.effectiveDateStart = effectiveDateStart;
            return this;
        }


        /**
         * 生效日期 - 搜索范围结束
         * <p> 示例值：2020-01-01
         *
         * @param effectiveDateEnd
         * @return
         */
        public Builder effectiveDateEnd(String effectiveDateEnd) {
            this.effectiveDateEnd = effectiveDateEnd;
            return this;
        }


        /**
         * 查看数据日期，默认为今天
         * <p> 示例值：2020-01-01
         *
         * @param dataDate
         * @return
         */
        public Builder dataDate(String dataDate) {
            this.dataDate = dataDate;
            return this;
        }


        /**
         * 是否仅查询主职;- true：仅返回 primary_job_data 为 true 的任职记录;- false：仅返回 primary_job_data 为 false 的任职记录;- 不传：返回全部
         * <p> 示例值：true
         *
         * @param primaryJobData
         * @return
         */
        public Builder primaryJobData(Boolean primaryJobData) {
            this.primaryJobData = primaryJobData;
            return this;
        }


        /**
         * 任职原因;- 可通过[【获取字段详情】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/custom_field/get_by_param)接口查询，查询参数如下：;  - object_api_name：job_data;  - custom_api_name：assignment_start_reason
         * <p> 示例值：
         *
         * @param assignmentStartReasons
         * @return
         */
        public Builder assignmentStartReasons(String[] assignmentStartReasons) {
            this.assignmentStartReasons = assignmentStartReasons;
            return this;
        }


        public BatchGetEmployeesJobDataReqBody build() {
            return new BatchGetEmployeesJobDataReqBody(this);
        }
    }
}
