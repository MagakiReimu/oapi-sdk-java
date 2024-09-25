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

package com.lark.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;

public class UserLeave {
    /**
     * 审批实例 ID
     * <p> 示例值：6737202939523236113
     */
    @SerializedName("approval_id")
    private String approvalId;
    /**
     * 假期类型唯一 ID，代表一种假期类型，长度小于 14
     * <p> 示例值：6852582717813440527
     */
    @SerializedName("uniq_id")
    private String uniqId;
    /**
     * 假期时长单位
     * <p> 示例值：1
     */
    @SerializedName("unit")
    private Integer unit;
    /**
     * 假期时长（单位：秒），暂未开放提供，待后续提供
     * <p> 示例值：28800
     */
    @SerializedName("interval")
    private Integer interval;
    /**
     * 开始时间，时间格式为 yyyy-MM-dd HH:mm:ss
     * <p> 示例值：2021-01-04 09:00:00
     */
    @SerializedName("start_time")
    private String startTime;
    /**
     * 结束时间，时间格式为 yyyy-MM-dd HH:mm:ss
     * <p> 示例值：2021-01-04 19:00:00
     */
    @SerializedName("end_time")
    private String endTime;
    /**
     * 假期多语言展示，格式为 map，key 为 ["ch"、"en"、"ja"]，其中 ch 代表中文、en 代表英语、ja 代表日语
     * <p> 示例值：
     */
    @SerializedName("i18n_names")
    private I18nNames i18nNames;
    /**
     * 默认语言类型，由于飞书客户端支持中、英、日三种语言，当用户切换语言时，如果假期名称没有所对应的语言，会使用默认语言的名称
     * <p> 示例值：ch
     */
    @SerializedName("default_locale")
    private String defaultLocale;
    /**
     * 请假理由，必选字段
     * <p> 示例值：家里有事
     */
    @SerializedName("reason")
    private String reason;
    /**
     * 审批通过时间，时间格式为 yyyy-MM-dd HH:mm:ss
     * <p> 示例值：2021-01-04 12:00:00
     */
    @SerializedName("approve_pass_time")
    private String approvePassTime;
    /**
     * 审批申请时间，时间格式为 yyyy-MM-dd HH:mm:ss
     * <p> 示例值：2021-01-04 11:00:00
     */
    @SerializedName("approve_apply_time")
    private String approveApplyTime;
    /**
     * 唯一幂等键
     * <p> 示例值：1233432312
     */
    @SerializedName("idempotent_id")
    private String idempotentId;

    // builder 开始
    public UserLeave() {
    }

    public UserLeave(Builder builder) {
        /**
         * 审批实例 ID
         * <p> 示例值：6737202939523236113
         */
        this.approvalId = builder.approvalId;
        /**
         * 假期类型唯一 ID，代表一种假期类型，长度小于 14
         * <p> 示例值：6852582717813440527
         */
        this.uniqId = builder.uniqId;
        /**
         * 假期时长单位
         * <p> 示例值：1
         */
        this.unit = builder.unit;
        /**
         * 假期时长（单位：秒），暂未开放提供，待后续提供
         * <p> 示例值：28800
         */
        this.interval = builder.interval;
        /**
         * 开始时间，时间格式为 yyyy-MM-dd HH:mm:ss
         * <p> 示例值：2021-01-04 09:00:00
         */
        this.startTime = builder.startTime;
        /**
         * 结束时间，时间格式为 yyyy-MM-dd HH:mm:ss
         * <p> 示例值：2021-01-04 19:00:00
         */
        this.endTime = builder.endTime;
        /**
         * 假期多语言展示，格式为 map，key 为 ["ch"、"en"、"ja"]，其中 ch 代表中文、en 代表英语、ja 代表日语
         * <p> 示例值：
         */
        this.i18nNames = builder.i18nNames;
        /**
         * 默认语言类型，由于飞书客户端支持中、英、日三种语言，当用户切换语言时，如果假期名称没有所对应的语言，会使用默认语言的名称
         * <p> 示例值：ch
         */
        this.defaultLocale = builder.defaultLocale;
        /**
         * 请假理由，必选字段
         * <p> 示例值：家里有事
         */
        this.reason = builder.reason;
        /**
         * 审批通过时间，时间格式为 yyyy-MM-dd HH:mm:ss
         * <p> 示例值：2021-01-04 12:00:00
         */
        this.approvePassTime = builder.approvePassTime;
        /**
         * 审批申请时间，时间格式为 yyyy-MM-dd HH:mm:ss
         * <p> 示例值：2021-01-04 11:00:00
         */
        this.approveApplyTime = builder.approveApplyTime;
        /**
         * 唯一幂等键
         * <p> 示例值：1233432312
         */
        this.idempotentId = builder.idempotentId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getApprovalId() {
        return this.approvalId;
    }

    public void setApprovalId(String approvalId) {
        this.approvalId = approvalId;
    }

    public String getUniqId() {
        return this.uniqId;
    }

    public void setUniqId(String uniqId) {
        this.uniqId = uniqId;
    }

    public Integer getUnit() {
        return this.unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Integer getInterval() {
        return this.interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public I18nNames getI18nNames() {
        return this.i18nNames;
    }

    public void setI18nNames(I18nNames i18nNames) {
        this.i18nNames = i18nNames;
    }

    public String getDefaultLocale() {
        return this.defaultLocale;
    }

    public void setDefaultLocale(String defaultLocale) {
        this.defaultLocale = defaultLocale;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getApprovePassTime() {
        return this.approvePassTime;
    }

    public void setApprovePassTime(String approvePassTime) {
        this.approvePassTime = approvePassTime;
    }

    public String getApproveApplyTime() {
        return this.approveApplyTime;
    }

    public void setApproveApplyTime(String approveApplyTime) {
        this.approveApplyTime = approveApplyTime;
    }

    public String getIdempotentId() {
        return this.idempotentId;
    }

    public void setIdempotentId(String idempotentId) {
        this.idempotentId = idempotentId;
    }

    public static class Builder {
        /**
         * 审批实例 ID
         * <p> 示例值：6737202939523236113
         */
        private String approvalId;
        /**
         * 假期类型唯一 ID，代表一种假期类型，长度小于 14
         * <p> 示例值：6852582717813440527
         */
        private String uniqId;
        /**
         * 假期时长单位
         * <p> 示例值：1
         */
        private Integer unit;
        /**
         * 假期时长（单位：秒），暂未开放提供，待后续提供
         * <p> 示例值：28800
         */
        private Integer interval;
        /**
         * 开始时间，时间格式为 yyyy-MM-dd HH:mm:ss
         * <p> 示例值：2021-01-04 09:00:00
         */
        private String startTime;
        /**
         * 结束时间，时间格式为 yyyy-MM-dd HH:mm:ss
         * <p> 示例值：2021-01-04 19:00:00
         */
        private String endTime;
        /**
         * 假期多语言展示，格式为 map，key 为 ["ch"、"en"、"ja"]，其中 ch 代表中文、en 代表英语、ja 代表日语
         * <p> 示例值：
         */
        private I18nNames i18nNames;
        /**
         * 默认语言类型，由于飞书客户端支持中、英、日三种语言，当用户切换语言时，如果假期名称没有所对应的语言，会使用默认语言的名称
         * <p> 示例值：ch
         */
        private String defaultLocale;
        /**
         * 请假理由，必选字段
         * <p> 示例值：家里有事
         */
        private String reason;
        /**
         * 审批通过时间，时间格式为 yyyy-MM-dd HH:mm:ss
         * <p> 示例值：2021-01-04 12:00:00
         */
        private String approvePassTime;
        /**
         * 审批申请时间，时间格式为 yyyy-MM-dd HH:mm:ss
         * <p> 示例值：2021-01-04 11:00:00
         */
        private String approveApplyTime;
        /**
         * 唯一幂等键
         * <p> 示例值：1233432312
         */
        private String idempotentId;

        /**
         * 审批实例 ID
         * <p> 示例值：6737202939523236113
         *
         * @param approvalId
         * @return
         */
        public Builder approvalId(String approvalId) {
            this.approvalId = approvalId;
            return this;
        }


        /**
         * 假期类型唯一 ID，代表一种假期类型，长度小于 14
         * <p> 示例值：6852582717813440527
         *
         * @param uniqId
         * @return
         */
        public Builder uniqId(String uniqId) {
            this.uniqId = uniqId;
            return this;
        }


        /**
         * 假期时长单位
         * <p> 示例值：1
         *
         * @param unit
         * @return
         */
        public Builder unit(Integer unit) {
            this.unit = unit;
            return this;
        }

        /**
         * 假期时长单位
         * <p> 示例值：1
         *
         * @param unit {@link com.lark.oapi.service.attendance.v1.enums.UserLeaveUnitEnum}
         * @return
         */
        public Builder unit(com.lark.oapi.service.attendance.v1.enums.UserLeaveUnitEnum unit) {
            this.unit = unit.getValue();
            return this;
        }


        /**
         * 假期时长（单位：秒），暂未开放提供，待后续提供
         * <p> 示例值：28800
         *
         * @param interval
         * @return
         */
        public Builder interval(Integer interval) {
            this.interval = interval;
            return this;
        }


        /**
         * 开始时间，时间格式为 yyyy-MM-dd HH:mm:ss
         * <p> 示例值：2021-01-04 09:00:00
         *
         * @param startTime
         * @return
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }


        /**
         * 结束时间，时间格式为 yyyy-MM-dd HH:mm:ss
         * <p> 示例值：2021-01-04 19:00:00
         *
         * @param endTime
         * @return
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }


        /**
         * 假期多语言展示，格式为 map，key 为 ["ch"、"en"、"ja"]，其中 ch 代表中文、en 代表英语、ja 代表日语
         * <p> 示例值：
         *
         * @param i18nNames
         * @return
         */
        public Builder i18nNames(I18nNames i18nNames) {
            this.i18nNames = i18nNames;
            return this;
        }


        /**
         * 默认语言类型，由于飞书客户端支持中、英、日三种语言，当用户切换语言时，如果假期名称没有所对应的语言，会使用默认语言的名称
         * <p> 示例值：ch
         *
         * @param defaultLocale
         * @return
         */
        public Builder defaultLocale(String defaultLocale) {
            this.defaultLocale = defaultLocale;
            return this;
        }

        /**
         * 默认语言类型，由于飞书客户端支持中、英、日三种语言，当用户切换语言时，如果假期名称没有所对应的语言，会使用默认语言的名称
         * <p> 示例值：ch
         *
         * @param defaultLocale {@link com.lark.oapi.service.attendance.v1.enums.UserLeaveDefaultLocaleEnum}
         * @return
         */
        public Builder defaultLocale(com.lark.oapi.service.attendance.v1.enums.UserLeaveDefaultLocaleEnum defaultLocale) {
            this.defaultLocale = defaultLocale.getValue();
            return this;
        }


        /**
         * 请假理由，必选字段
         * <p> 示例值：家里有事
         *
         * @param reason
         * @return
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }


        /**
         * 审批通过时间，时间格式为 yyyy-MM-dd HH:mm:ss
         * <p> 示例值：2021-01-04 12:00:00
         *
         * @param approvePassTime
         * @return
         */
        public Builder approvePassTime(String approvePassTime) {
            this.approvePassTime = approvePassTime;
            return this;
        }


        /**
         * 审批申请时间，时间格式为 yyyy-MM-dd HH:mm:ss
         * <p> 示例值：2021-01-04 11:00:00
         *
         * @param approveApplyTime
         * @return
         */
        public Builder approveApplyTime(String approveApplyTime) {
            this.approveApplyTime = approveApplyTime;
            return this;
        }


        /**
         * 唯一幂等键
         * <p> 示例值：1233432312
         *
         * @param idempotentId
         * @return
         */
        public Builder idempotentId(String idempotentId) {
            this.idempotentId = idempotentId;
            return this;
        }


        public UserLeave build() {
            return new UserLeave(this);
        }
    }
}
