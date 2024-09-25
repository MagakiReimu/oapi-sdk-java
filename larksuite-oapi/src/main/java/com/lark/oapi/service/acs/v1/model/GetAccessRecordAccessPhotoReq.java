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

package com.lark.oapi.service.acs.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Path;

public class GetAccessRecordAccessPhotoReq {
    /**
     * 门禁访问记录 ID
     * <p> 示例值：6939433228970082591
     */
    @Path
    @SerializedName("access_record_id")
    private String accessRecordId;

    // builder 开始
    public GetAccessRecordAccessPhotoReq() {
    }

    public GetAccessRecordAccessPhotoReq(Builder builder) {
        /**
         * 门禁访问记录 ID
         * <p> 示例值：6939433228970082591
         */
        this.accessRecordId = builder.accessRecordId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getAccessRecordId() {
        return this.accessRecordId;
    }

    public void setAccessRecordId(String accessRecordId) {
        this.accessRecordId = accessRecordId;
    }

    public static class Builder {

        private String accessRecordId; // 门禁访问记录 ID

        /**
         * 门禁访问记录 ID
         * <p> 示例值：6939433228970082591
         *
         * @param accessRecordId
         * @return
         */
        public Builder accessRecordId(String accessRecordId) {
            this.accessRecordId = accessRecordId;
            return this;
        }

        public GetAccessRecordAccessPhotoReq build() {
            return new GetAccessRecordAccessPhotoReq(this);
        }
    }
}
