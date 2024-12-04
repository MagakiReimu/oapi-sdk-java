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

public class BatchQueryExternalBackgroundCheckReqBody {
    /**
     * 外部背调 ID 列表,当传递此值时,以此值为准
     * <p> 示例值：6960663240925956660
     */
    @SerializedName("external_background_check_id_list")
    private String[] externalBackgroundCheckIdList;

    // builder 开始
    public BatchQueryExternalBackgroundCheckReqBody() {
    }

    public BatchQueryExternalBackgroundCheckReqBody(Builder builder) {
        /**
         * 外部背调 ID 列表,当传递此值时,以此值为准
         * <p> 示例值：6960663240925956660
         */
        this.externalBackgroundCheckIdList = builder.externalBackgroundCheckIdList;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String[] getExternalBackgroundCheckIdList() {
        return this.externalBackgroundCheckIdList;
    }

    public void setExternalBackgroundCheckIdList(String[] externalBackgroundCheckIdList) {
        this.externalBackgroundCheckIdList = externalBackgroundCheckIdList;
    }

    public static class Builder {
        /**
         * 外部背调 ID 列表,当传递此值时,以此值为准
         * <p> 示例值：6960663240925956660
         */
        private String[] externalBackgroundCheckIdList;

        /**
         * 外部背调 ID 列表,当传递此值时,以此值为准
         * <p> 示例值：6960663240925956660
         *
         * @param externalBackgroundCheckIdList
         * @return
         */
        public Builder externalBackgroundCheckIdList(String[] externalBackgroundCheckIdList) {
            this.externalBackgroundCheckIdList = externalBackgroundCheckIdList;
            return this;
        }


        public BatchQueryExternalBackgroundCheckReqBody build() {
            return new BatchQueryExternalBackgroundCheckReqBody(this);
        }
    }
}
