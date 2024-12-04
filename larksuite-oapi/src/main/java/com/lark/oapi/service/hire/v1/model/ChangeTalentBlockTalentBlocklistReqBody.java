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

import com.lark.oapi.core.response.EmptyData;
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

public class ChangeTalentBlockTalentBlocklistReqBody {
    /**
     * 人才 ID
     * <p> 示例值：6930815272790114325
     */
    @SerializedName("talent_id")
    private String talentId;
    /**
     * 操作类型
     * <p> 示例值：
     */
    @SerializedName("option")
    private Integer option;
    /**
     * 原因，当执行加入屏蔽名单操作时必填
     * <p> 示例值：人才作弊
     */
    @SerializedName("reason")
    private String reason;

    // builder 开始
    public ChangeTalentBlockTalentBlocklistReqBody() {
    }

    public ChangeTalentBlockTalentBlocklistReqBody(Builder builder) {
        /**
         * 人才 ID
         * <p> 示例值：6930815272790114325
         */
        this.talentId = builder.talentId;
        /**
         * 操作类型
         * <p> 示例值：
         */
        this.option = builder.option;
        /**
         * 原因，当执行加入屏蔽名单操作时必填
         * <p> 示例值：人才作弊
         */
        this.reason = builder.reason;
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

    public Integer getOption() {
        return this.option;
    }

    public void setOption(Integer option) {
        this.option = option;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public static class Builder {
        /**
         * 人才 ID
         * <p> 示例值：6930815272790114325
         */
        private String talentId;
        /**
         * 操作类型
         * <p> 示例值：
         */
        private Integer option;
        /**
         * 原因，当执行加入屏蔽名单操作时必填
         * <p> 示例值：人才作弊
         */
        private String reason;

        /**
         * 人才 ID
         * <p> 示例值：6930815272790114325
         *
         * @param talentId
         * @return
         */
        public Builder talentId(String talentId) {
            this.talentId = talentId;
            return this;
        }


        /**
         * 操作类型
         * <p> 示例值：
         *
         * @param option
         * @return
         */
        public Builder option(Integer option) {
            this.option = option;
            return this;
        }


        /**
         * 原因，当执行加入屏蔽名单操作时必填
         * <p> 示例值：人才作弊
         *
         * @param reason
         * @return
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }


        public ChangeTalentBlockTalentBlocklistReqBody build() {
            return new ChangeTalentBlockTalentBlocklistReqBody(this);
        }
    }
}
