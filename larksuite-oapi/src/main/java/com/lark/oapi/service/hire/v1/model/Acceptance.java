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

public class Acceptance {
    /**
     * 操作类型
     * <p> 示例值：1
     */
    @SerializedName("operator_type")
    private Integer operatorType;
    /**
     * offer 接受或拒绝的结果
     * <p> 示例值：1
     */
    @SerializedName("conclusion")
    private Integer conclusion;
    /**
     * 备注，如果是拒绝，则展示拒绝原因
     * <p> 示例值：Abort
     */
    @SerializedName("memo")
    private String memo;
    /**
     * 操作的字符串毫秒时间戳
     * <p> 示例值：1718959426734
     */
    @SerializedName("operate_time")
    private String operateTime;

    // builder 开始
    public Acceptance() {
    }

    public Acceptance(Builder builder) {
        /**
         * 操作类型
         * <p> 示例值：1
         */
        this.operatorType = builder.operatorType;
        /**
         * offer 接受或拒绝的结果
         * <p> 示例值：1
         */
        this.conclusion = builder.conclusion;
        /**
         * 备注，如果是拒绝，则展示拒绝原因
         * <p> 示例值：Abort
         */
        this.memo = builder.memo;
        /**
         * 操作的字符串毫秒时间戳
         * <p> 示例值：1718959426734
         */
        this.operateTime = builder.operateTime;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getOperatorType() {
        return this.operatorType;
    }

    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    public Integer getConclusion() {
        return this.conclusion;
    }

    public void setConclusion(Integer conclusion) {
        this.conclusion = conclusion;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getOperateTime() {
        return this.operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    public static class Builder {
        /**
         * 操作类型
         * <p> 示例值：1
         */
        private Integer operatorType;
        /**
         * offer 接受或拒绝的结果
         * <p> 示例值：1
         */
        private Integer conclusion;
        /**
         * 备注，如果是拒绝，则展示拒绝原因
         * <p> 示例值：Abort
         */
        private String memo;
        /**
         * 操作的字符串毫秒时间戳
         * <p> 示例值：1718959426734
         */
        private String operateTime;

        /**
         * 操作类型
         * <p> 示例值：1
         *
         * @param operatorType
         * @return
         */
        public Builder operatorType(Integer operatorType) {
            this.operatorType = operatorType;
            return this;
        }


        /**
         * offer 接受或拒绝的结果
         * <p> 示例值：1
         *
         * @param conclusion
         * @return
         */
        public Builder conclusion(Integer conclusion) {
            this.conclusion = conclusion;
            return this;
        }


        /**
         * 备注，如果是拒绝，则展示拒绝原因
         * <p> 示例值：Abort
         *
         * @param memo
         * @return
         */
        public Builder memo(String memo) {
            this.memo = memo;
            return this;
        }


        /**
         * 操作的字符串毫秒时间戳
         * <p> 示例值：1718959426734
         *
         * @param operateTime
         * @return
         */
        public Builder operateTime(String operateTime) {
            this.operateTime = operateTime;
            return this;
        }


        public Acceptance build() {
            return new Acceptance(this);
        }
    }
}
