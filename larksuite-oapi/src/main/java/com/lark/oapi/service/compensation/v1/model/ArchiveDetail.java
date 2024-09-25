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

package com.lark.oapi.service.compensation.v1.model;

import com.google.gson.annotations.SerializedName;

public class ArchiveDetail {
    /**
     * 员工ID
     * <p> 示例值：344325234123
     */
    @SerializedName("user_id")
    private String userId;
    /**
     * 档案ID
     * <p> 示例值：32141234412
     */
    @SerializedName("id")
    private String id;
    /**
     * 档案TID
     * <p> 示例值：141541351
     */
    @SerializedName("tid")
    private String tid;
    /**
     * 关联方案ID，详细信息可以通过[批量查询薪资方案](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/plan/list)接口查询获得
     * <p> 示例值：123412433
     */
    @SerializedName("plan_id")
    private String planId;
    /**
     * 关联方案TID，详细信息可以通过[批量查询薪资方案](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/plan/list)接口查询获得
     * <p> 示例值：213412343
     */
    @SerializedName("plan_tid")
    private String planTid;
    /**
     * 档案币种ID，详细信息可以通过[查询货币信息v2](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/corehr-v2/basic_info-currency/search)接口查询获得
     * <p> 示例值：324167823
     */
    @SerializedName("currency_id")
    private String currencyId;
    /**
     * 调薪原因ID，详细信息可以通过[批量查询定调薪原因](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/change_reason/list)接口查询获得
     * <p> 示例值：321414123
     */
    @SerializedName("change_reason_id")
    private String changeReasonId;
    /**
     * 调薪说明
     * <p> 示例值：长期表现优异，产出高，本次给出涨幅
     */
    @SerializedName("change_description")
    private String changeDescription;
    /**
     * 生效时间
     * <p> 示例值：2022-10-23
     */
    @SerializedName("effective_date")
    private String effectiveDate;
    /**
     * 薪级薪等ID
     * <p> 示例值：12342313
     */
    @SerializedName("salary_level_id")
    private String salaryLevelId;
    /**
     * 档案关联的薪资项
     * <p> 示例值：
     */
    @SerializedName("archive_items")
    private ArchiveItem[] archiveItems;
    /**
     * 档案关联的薪资指标
     * <p> 示例值：
     */
    @SerializedName("archive_indicators")
    private ArchiveIndicator[] archiveIndicators;

    // builder 开始
    public ArchiveDetail() {
    }

    public ArchiveDetail(Builder builder) {
        /**
         * 员工ID
         * <p> 示例值：344325234123
         */
        this.userId = builder.userId;
        /**
         * 档案ID
         * <p> 示例值：32141234412
         */
        this.id = builder.id;
        /**
         * 档案TID
         * <p> 示例值：141541351
         */
        this.tid = builder.tid;
        /**
         * 关联方案ID，详细信息可以通过[批量查询薪资方案](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/plan/list)接口查询获得
         * <p> 示例值：123412433
         */
        this.planId = builder.planId;
        /**
         * 关联方案TID，详细信息可以通过[批量查询薪资方案](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/plan/list)接口查询获得
         * <p> 示例值：213412343
         */
        this.planTid = builder.planTid;
        /**
         * 档案币种ID，详细信息可以通过[查询货币信息v2](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/corehr-v2/basic_info-currency/search)接口查询获得
         * <p> 示例值：324167823
         */
        this.currencyId = builder.currencyId;
        /**
         * 调薪原因ID，详细信息可以通过[批量查询定调薪原因](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/change_reason/list)接口查询获得
         * <p> 示例值：321414123
         */
        this.changeReasonId = builder.changeReasonId;
        /**
         * 调薪说明
         * <p> 示例值：长期表现优异，产出高，本次给出涨幅
         */
        this.changeDescription = builder.changeDescription;
        /**
         * 生效时间
         * <p> 示例值：2022-10-23
         */
        this.effectiveDate = builder.effectiveDate;
        /**
         * 薪级薪等ID
         * <p> 示例值：12342313
         */
        this.salaryLevelId = builder.salaryLevelId;
        /**
         * 档案关联的薪资项
         * <p> 示例值：
         */
        this.archiveItems = builder.archiveItems;
        /**
         * 档案关联的薪资指标
         * <p> 示例值：
         */
        this.archiveIndicators = builder.archiveIndicators;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTid() {
        return this.tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getPlanId() {
        return this.planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getPlanTid() {
        return this.planTid;
    }

    public void setPlanTid(String planTid) {
        this.planTid = planTid;
    }

    public String getCurrencyId() {
        return this.currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getChangeReasonId() {
        return this.changeReasonId;
    }

    public void setChangeReasonId(String changeReasonId) {
        this.changeReasonId = changeReasonId;
    }

    public String getChangeDescription() {
        return this.changeDescription;
    }

    public void setChangeDescription(String changeDescription) {
        this.changeDescription = changeDescription;
    }

    public String getEffectiveDate() {
        return this.effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getSalaryLevelId() {
        return this.salaryLevelId;
    }

    public void setSalaryLevelId(String salaryLevelId) {
        this.salaryLevelId = salaryLevelId;
    }

    public ArchiveItem[] getArchiveItems() {
        return this.archiveItems;
    }

    public void setArchiveItems(ArchiveItem[] archiveItems) {
        this.archiveItems = archiveItems;
    }

    public ArchiveIndicator[] getArchiveIndicators() {
        return this.archiveIndicators;
    }

    public void setArchiveIndicators(ArchiveIndicator[] archiveIndicators) {
        this.archiveIndicators = archiveIndicators;
    }

    public static class Builder {
        /**
         * 员工ID
         * <p> 示例值：344325234123
         */
        private String userId;
        /**
         * 档案ID
         * <p> 示例值：32141234412
         */
        private String id;
        /**
         * 档案TID
         * <p> 示例值：141541351
         */
        private String tid;
        /**
         * 关联方案ID，详细信息可以通过[批量查询薪资方案](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/plan/list)接口查询获得
         * <p> 示例值：123412433
         */
        private String planId;
        /**
         * 关联方案TID，详细信息可以通过[批量查询薪资方案](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/plan/list)接口查询获得
         * <p> 示例值：213412343
         */
        private String planTid;
        /**
         * 档案币种ID，详细信息可以通过[查询货币信息v2](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/corehr-v2/basic_info-currency/search)接口查询获得
         * <p> 示例值：324167823
         */
        private String currencyId;
        /**
         * 调薪原因ID，详细信息可以通过[批量查询定调薪原因](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/change_reason/list)接口查询获得
         * <p> 示例值：321414123
         */
        private String changeReasonId;
        /**
         * 调薪说明
         * <p> 示例值：长期表现优异，产出高，本次给出涨幅
         */
        private String changeDescription;
        /**
         * 生效时间
         * <p> 示例值：2022-10-23
         */
        private String effectiveDate;
        /**
         * 薪级薪等ID
         * <p> 示例值：12342313
         */
        private String salaryLevelId;
        /**
         * 档案关联的薪资项
         * <p> 示例值：
         */
        private ArchiveItem[] archiveItems;
        /**
         * 档案关联的薪资指标
         * <p> 示例值：
         */
        private ArchiveIndicator[] archiveIndicators;

        /**
         * 员工ID
         * <p> 示例值：344325234123
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        /**
         * 档案ID
         * <p> 示例值：32141234412
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 档案TID
         * <p> 示例值：141541351
         *
         * @param tid
         * @return
         */
        public Builder tid(String tid) {
            this.tid = tid;
            return this;
        }


        /**
         * 关联方案ID，详细信息可以通过[批量查询薪资方案](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/plan/list)接口查询获得
         * <p> 示例值：123412433
         *
         * @param planId
         * @return
         */
        public Builder planId(String planId) {
            this.planId = planId;
            return this;
        }


        /**
         * 关联方案TID，详细信息可以通过[批量查询薪资方案](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/plan/list)接口查询获得
         * <p> 示例值：213412343
         *
         * @param planTid
         * @return
         */
        public Builder planTid(String planTid) {
            this.planTid = planTid;
            return this;
        }


        /**
         * 档案币种ID，详细信息可以通过[查询货币信息v2](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/corehr-v2/basic_info-currency/search)接口查询获得
         * <p> 示例值：324167823
         *
         * @param currencyId
         * @return
         */
        public Builder currencyId(String currencyId) {
            this.currencyId = currencyId;
            return this;
        }


        /**
         * 调薪原因ID，详细信息可以通过[批量查询定调薪原因](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/change_reason/list)接口查询获得
         * <p> 示例值：321414123
         *
         * @param changeReasonId
         * @return
         */
        public Builder changeReasonId(String changeReasonId) {
            this.changeReasonId = changeReasonId;
            return this;
        }


        /**
         * 调薪说明
         * <p> 示例值：长期表现优异，产出高，本次给出涨幅
         *
         * @param changeDescription
         * @return
         */
        public Builder changeDescription(String changeDescription) {
            this.changeDescription = changeDescription;
            return this;
        }


        /**
         * 生效时间
         * <p> 示例值：2022-10-23
         *
         * @param effectiveDate
         * @return
         */
        public Builder effectiveDate(String effectiveDate) {
            this.effectiveDate = effectiveDate;
            return this;
        }


        /**
         * 薪级薪等ID
         * <p> 示例值：12342313
         *
         * @param salaryLevelId
         * @return
         */
        public Builder salaryLevelId(String salaryLevelId) {
            this.salaryLevelId = salaryLevelId;
            return this;
        }


        /**
         * 档案关联的薪资项
         * <p> 示例值：
         *
         * @param archiveItems
         * @return
         */
        public Builder archiveItems(ArchiveItem[] archiveItems) {
            this.archiveItems = archiveItems;
            return this;
        }


        /**
         * 档案关联的薪资指标
         * <p> 示例值：
         *
         * @param archiveIndicators
         * @return
         */
        public Builder archiveIndicators(ArchiveIndicator[] archiveIndicators) {
            this.archiveIndicators = archiveIndicators;
            return this;
        }


        public ArchiveDetail build() {
            return new ArchiveDetail(this);
        }
    }
}
