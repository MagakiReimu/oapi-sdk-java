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

public class SearchBasicInfoCurrencyReqBody {
    /**
     * 货币 ID 列表，可通过[批量查询薪资方案](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/plan/list)、[批量查询员工薪资档案](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/archive/query)等接口返回的 `currency_id` 字段获取
     * <p> 示例值：
     */
    @SerializedName("currency_id_list")
    private String[] currencyIdList;
    /**
     * 状态列表
     * <p> 示例值：
     */
    @SerializedName("status_list")
    private Integer[] statusList;

    // builder 开始
    public SearchBasicInfoCurrencyReqBody() {
    }

    public SearchBasicInfoCurrencyReqBody(Builder builder) {
        /**
         * 货币 ID 列表，可通过[批量查询薪资方案](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/plan/list)、[批量查询员工薪资档案](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/archive/query)等接口返回的 `currency_id` 字段获取
         * <p> 示例值：
         */
        this.currencyIdList = builder.currencyIdList;
        /**
         * 状态列表
         * <p> 示例值：
         */
        this.statusList = builder.statusList;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String[] getCurrencyIdList() {
        return this.currencyIdList;
    }

    public void setCurrencyIdList(String[] currencyIdList) {
        this.currencyIdList = currencyIdList;
    }

    public Integer[] getStatusList() {
        return this.statusList;
    }

    public void setStatusList(Integer[] statusList) {
        this.statusList = statusList;
    }

    public static class Builder {
        /**
         * 货币 ID 列表，可通过[批量查询薪资方案](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/plan/list)、[批量查询员工薪资档案](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/archive/query)等接口返回的 `currency_id` 字段获取
         * <p> 示例值：
         */
        private String[] currencyIdList;
        /**
         * 状态列表
         * <p> 示例值：
         */
        private Integer[] statusList;

        /**
         * 货币 ID 列表，可通过[批量查询薪资方案](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/plan/list)、[批量查询员工薪资档案](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/archive/query)等接口返回的 `currency_id` 字段获取
         * <p> 示例值：
         *
         * @param currencyIdList
         * @return
         */
        public Builder currencyIdList(String[] currencyIdList) {
            this.currencyIdList = currencyIdList;
            return this;
        }


        /**
         * 状态列表
         * <p> 示例值：
         *
         * @param statusList
         * @return
         */
        public Builder statusList(Integer[] statusList) {
            this.statusList = statusList;
            return this;
        }


        public SearchBasicInfoCurrencyReqBody build() {
            return new SearchBasicInfoCurrencyReqBody(this);
        }
    }
}
