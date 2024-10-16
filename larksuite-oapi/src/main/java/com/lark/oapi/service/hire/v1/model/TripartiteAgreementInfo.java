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

public class TripartiteAgreementInfo {
    /**
     * 三方协议 ID
     * <p> 示例值：6930815272790114324
     */
    @SerializedName("id")
    private String id;
    /**
     * 投递ID
     * <p> 示例值：6930815272790114325
     */
    @SerializedName("application_id")
    private String applicationId;
    /**
     * 三方协议状态
     * <p> 示例值：1
     */
    @SerializedName("state")
    private Integer state;
    /**
     * 三方协议创建时间，毫秒时间戳
     * <p> 示例值：1698292282660
     */
    @SerializedName("create_time")
    private String createTime;
    /**
     * 三方协议修改时间，毫秒时间戳
     * <p> 示例值：1698292282661
     */
    @SerializedName("modify_time")
    private String modifyTime;

    // builder 开始
    public TripartiteAgreementInfo() {
    }

    public TripartiteAgreementInfo(Builder builder) {
        /**
         * 三方协议 ID
         * <p> 示例值：6930815272790114324
         */
        this.id = builder.id;
        /**
         * 投递ID
         * <p> 示例值：6930815272790114325
         */
        this.applicationId = builder.applicationId;
        /**
         * 三方协议状态
         * <p> 示例值：1
         */
        this.state = builder.state;
        /**
         * 三方协议创建时间，毫秒时间戳
         * <p> 示例值：1698292282660
         */
        this.createTime = builder.createTime;
        /**
         * 三方协议修改时间，毫秒时间戳
         * <p> 示例值：1698292282661
         */
        this.modifyTime = builder.modifyTime;
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

    public String getApplicationId() {
        return this.applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public Integer getState() {
        return this.state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifyTime() {
        return this.modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public static class Builder {
        /**
         * 三方协议 ID
         * <p> 示例值：6930815272790114324
         */
        private String id;
        /**
         * 投递ID
         * <p> 示例值：6930815272790114325
         */
        private String applicationId;
        /**
         * 三方协议状态
         * <p> 示例值：1
         */
        private Integer state;
        /**
         * 三方协议创建时间，毫秒时间戳
         * <p> 示例值：1698292282660
         */
        private String createTime;
        /**
         * 三方协议修改时间，毫秒时间戳
         * <p> 示例值：1698292282661
         */
        private String modifyTime;

        /**
         * 三方协议 ID
         * <p> 示例值：6930815272790114324
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 投递ID
         * <p> 示例值：6930815272790114325
         *
         * @param applicationId
         * @return
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }


        /**
         * 三方协议状态
         * <p> 示例值：1
         *
         * @param state
         * @return
         */
        public Builder state(Integer state) {
            this.state = state;
            return this;
        }


        /**
         * 三方协议创建时间，毫秒时间戳
         * <p> 示例值：1698292282660
         *
         * @param createTime
         * @return
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }


        /**
         * 三方协议修改时间，毫秒时间戳
         * <p> 示例值：1698292282661
         *
         * @param modifyTime
         * @return
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }


        public TripartiteAgreementInfo build() {
            return new TripartiteAgreementInfo(this);
        }
    }
}
