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

package com.lark.oapi.service.hire.v1.model;

import com.google.gson.annotations.SerializedName;

public class ProtectAgencyReqBody {
    /**
     * 人才ID
     * <p> 示例值：6962051712422398239
     */
    @SerializedName("talent_id")
    private String talentId;
    /**
     * 供应商ID
     * <p> 示例值：6898173495386147079
     */
    @SerializedName("supplier_id")
    private String supplierId;
    /**
     * 猎头顾问ID
     * <p> 示例值：ou_f476cb099ac9227c9bae09ce46112579
     */
    @SerializedName("consultant_id")
    private String consultantId;
    /**
     * 保护期创建时间
     * <p> 示例值：1610695587000
     */
    @SerializedName("protect_create_time")
    private Integer protectCreateTime;
    /**
     * 保护期过期时间
     * <p> 示例值：1626333987000
     */
    @SerializedName("protect_expire_time")
    private Integer protectExpireTime;
    /**
     * 推荐语
     * <p> 示例值：此候选人非常优秀，建议录用。
     */
    @SerializedName("comment")
    private String comment;
    /**
     * 当前薪资
     * <p> 示例值：15k * 13
     */
    @SerializedName("current_salary")
    private String currentSalary;
    /**
     * 预期薪资
     * <p> 示例值：18k * 16
     */
    @SerializedName("expected_salary")
    private String expectedSalary;

    // builder 开始
    public ProtectAgencyReqBody() {
    }

    public ProtectAgencyReqBody(Builder builder) {
        /**
         * 人才ID
         * <p> 示例值：6962051712422398239
         */
        this.talentId = builder.talentId;
        /**
         * 供应商ID
         * <p> 示例值：6898173495386147079
         */
        this.supplierId = builder.supplierId;
        /**
         * 猎头顾问ID
         * <p> 示例值：ou_f476cb099ac9227c9bae09ce46112579
         */
        this.consultantId = builder.consultantId;
        /**
         * 保护期创建时间
         * <p> 示例值：1610695587000
         */
        this.protectCreateTime = builder.protectCreateTime;
        /**
         * 保护期过期时间
         * <p> 示例值：1626333987000
         */
        this.protectExpireTime = builder.protectExpireTime;
        /**
         * 推荐语
         * <p> 示例值：此候选人非常优秀，建议录用。
         */
        this.comment = builder.comment;
        /**
         * 当前薪资
         * <p> 示例值：15k * 13
         */
        this.currentSalary = builder.currentSalary;
        /**
         * 预期薪资
         * <p> 示例值：18k * 16
         */
        this.expectedSalary = builder.expectedSalary;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getTalentId() {
        return this.talentId;
    }

    public void setTalentId(String talentId) {
        this.talentId = talentId;
    }

    public String getSupplierId() {
        return this.supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getConsultantId() {
        return this.consultantId;
    }

    public void setConsultantId(String consultantId) {
        this.consultantId = consultantId;
    }

    public Integer getProtectCreateTime() {
        return this.protectCreateTime;
    }

    public void setProtectCreateTime(Integer protectCreateTime) {
        this.protectCreateTime = protectCreateTime;
    }

    public Integer getProtectExpireTime() {
        return this.protectExpireTime;
    }

    public void setProtectExpireTime(Integer protectExpireTime) {
        this.protectExpireTime = protectExpireTime;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCurrentSalary() {
        return this.currentSalary;
    }

    public void setCurrentSalary(String currentSalary) {
        this.currentSalary = currentSalary;
    }

    public String getExpectedSalary() {
        return this.expectedSalary;
    }

    public void setExpectedSalary(String expectedSalary) {
        this.expectedSalary = expectedSalary;
    }

    public static class Builder {
        /**
         * 人才ID
         * <p> 示例值：6962051712422398239
         */
        private String talentId;
        /**
         * 供应商ID
         * <p> 示例值：6898173495386147079
         */
        private String supplierId;
        /**
         * 猎头顾问ID
         * <p> 示例值：ou_f476cb099ac9227c9bae09ce46112579
         */
        private String consultantId;
        /**
         * 保护期创建时间
         * <p> 示例值：1610695587000
         */
        private Integer protectCreateTime;
        /**
         * 保护期过期时间
         * <p> 示例值：1626333987000
         */
        private Integer protectExpireTime;
        /**
         * 推荐语
         * <p> 示例值：此候选人非常优秀，建议录用。
         */
        private String comment;
        /**
         * 当前薪资
         * <p> 示例值：15k * 13
         */
        private String currentSalary;
        /**
         * 预期薪资
         * <p> 示例值：18k * 16
         */
        private String expectedSalary;

        /**
         * 人才ID
         * <p> 示例值：6962051712422398239
         *
         * @param talentId
         * @return
         */
        public Builder talentId(String talentId) {
            this.talentId = talentId;
            return this;
        }


        /**
         * 供应商ID
         * <p> 示例值：6898173495386147079
         *
         * @param supplierId
         * @return
         */
        public Builder supplierId(String supplierId) {
            this.supplierId = supplierId;
            return this;
        }


        /**
         * 猎头顾问ID
         * <p> 示例值：ou_f476cb099ac9227c9bae09ce46112579
         *
         * @param consultantId
         * @return
         */
        public Builder consultantId(String consultantId) {
            this.consultantId = consultantId;
            return this;
        }


        /**
         * 保护期创建时间
         * <p> 示例值：1610695587000
         *
         * @param protectCreateTime
         * @return
         */
        public Builder protectCreateTime(Integer protectCreateTime) {
            this.protectCreateTime = protectCreateTime;
            return this;
        }


        /**
         * 保护期过期时间
         * <p> 示例值：1626333987000
         *
         * @param protectExpireTime
         * @return
         */
        public Builder protectExpireTime(Integer protectExpireTime) {
            this.protectExpireTime = protectExpireTime;
            return this;
        }


        /**
         * 推荐语
         * <p> 示例值：此候选人非常优秀，建议录用。
         *
         * @param comment
         * @return
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }


        /**
         * 当前薪资
         * <p> 示例值：15k * 13
         *
         * @param currentSalary
         * @return
         */
        public Builder currentSalary(String currentSalary) {
            this.currentSalary = currentSalary;
            return this;
        }


        /**
         * 预期薪资
         * <p> 示例值：18k * 16
         *
         * @param expectedSalary
         * @return
         */
        public Builder expectedSalary(String expectedSalary) {
            this.expectedSalary = expectedSalary;
            return this;
        }


        public ProtectAgencyReqBody build() {
            return new ProtectAgencyReqBody(this);
        }
    }
}
