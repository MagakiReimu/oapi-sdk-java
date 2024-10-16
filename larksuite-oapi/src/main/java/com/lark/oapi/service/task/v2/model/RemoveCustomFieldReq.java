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

package com.lark.oapi.service.task.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.task.v2.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class RemoveCustomFieldReq {
    /**
     * 自定义字段GUID
     * <p> 示例值：0110a4bd-f24b-4a93-8c1a-1732b94f9593
     */
    @Path
    @SerializedName("custom_field_guid")
    private String customFieldGuid;
    @Body
    private RemoveCustomFieldReqBody body;

    // builder 开始
    public RemoveCustomFieldReq() {
    }

    public RemoveCustomFieldReq(Builder builder) {
        /**
         * 自定义字段GUID
         * <p> 示例值：0110a4bd-f24b-4a93-8c1a-1732b94f9593
         */
        this.customFieldGuid = builder.customFieldGuid;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getCustomFieldGuid() {
        return this.customFieldGuid;
    }

    public void setCustomFieldGuid(String customFieldGuid) {
        this.customFieldGuid = customFieldGuid;
    }

    public RemoveCustomFieldReqBody getRemoveCustomFieldReqBody() {
        return this.body;
    }

    public void setRemoveCustomFieldReqBody(RemoveCustomFieldReqBody body) {
        this.body = body;
    }

    public static class Builder {

        private String customFieldGuid; // 自定义字段GUID
        private RemoveCustomFieldReqBody body;

        /**
         * 自定义字段GUID
         * <p> 示例值：0110a4bd-f24b-4a93-8c1a-1732b94f9593
         *
         * @param customFieldGuid
         * @return
         */
        public Builder customFieldGuid(String customFieldGuid) {
            this.customFieldGuid = customFieldGuid;
            return this;
        }

        public RemoveCustomFieldReqBody getRemoveCustomFieldReqBody() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder removeCustomFieldReqBody(RemoveCustomFieldReqBody body) {
            this.body = body;
            return this;
        }

        public RemoveCustomFieldReq build() {
            return new RemoveCustomFieldReq(this);
        }
    }
}
