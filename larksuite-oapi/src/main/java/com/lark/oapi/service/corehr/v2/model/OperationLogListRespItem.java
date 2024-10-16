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

public class OperationLogListRespItem {
    /**
     * 操作人ID
     * <p> 示例值：7373878233473271340
     */
    @SerializedName("operator_id")
    private String operatorId;
    /**
     * 操作时间
     * <p> 示例值：2024-01-01 12:12:12
     */
    @SerializedName("opt_time")
    private String optTime;
    /**
     * 操作记录
     * <p> 示例值：
     */
    @SerializedName("entities")
    private OperationLogEntity[] entities;

    // builder 开始
    public OperationLogListRespItem() {
    }

    public OperationLogListRespItem(Builder builder) {
        /**
         * 操作人ID
         * <p> 示例值：7373878233473271340
         */
        this.operatorId = builder.operatorId;
        /**
         * 操作时间
         * <p> 示例值：2024-01-01 12:12:12
         */
        this.optTime = builder.optTime;
        /**
         * 操作记录
         * <p> 示例值：
         */
        this.entities = builder.entities;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getOperatorId() {
        return this.operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getOptTime() {
        return this.optTime;
    }

    public void setOptTime(String optTime) {
        this.optTime = optTime;
    }

    public OperationLogEntity[] getEntities() {
        return this.entities;
    }

    public void setEntities(OperationLogEntity[] entities) {
        this.entities = entities;
    }

    public static class Builder {
        /**
         * 操作人ID
         * <p> 示例值：7373878233473271340
         */
        private String operatorId;
        /**
         * 操作时间
         * <p> 示例值：2024-01-01 12:12:12
         */
        private String optTime;
        /**
         * 操作记录
         * <p> 示例值：
         */
        private OperationLogEntity[] entities;

        /**
         * 操作人ID
         * <p> 示例值：7373878233473271340
         *
         * @param operatorId
         * @return
         */
        public Builder operatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }


        /**
         * 操作时间
         * <p> 示例值：2024-01-01 12:12:12
         *
         * @param optTime
         * @return
         */
        public Builder optTime(String optTime) {
            this.optTime = optTime;
            return this;
        }


        /**
         * 操作记录
         * <p> 示例值：
         *
         * @param entities
         * @return
         */
        public Builder entities(OperationLogEntity[] entities) {
            this.entities = entities;
            return this;
        }


        public OperationLogListRespItem build() {
            return new OperationLogListRespItem(this);
        }
    }
}
