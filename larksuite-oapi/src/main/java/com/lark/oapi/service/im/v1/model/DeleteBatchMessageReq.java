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

package com.lark.oapi.service.im.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.im.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class DeleteBatchMessageReq {
    /**
     * 待撤回的批量消息的ID，为[批量发送消息](https://open.feishu.cn/document/ukTMukTMukTM/ucDO1EjL3gTNx4yN4UTM)接口返回值中的`message_id`字段，用于标识一次批量发送消息请求。
     * <p> 示例值：bm-dc13264520392913993dd051dba21dcf
     */
    @Path
    @SerializedName("batch_message_id")
    private String batchMessageId;

    // builder 开始
    public DeleteBatchMessageReq() {
    }

    public DeleteBatchMessageReq(Builder builder) {
        /**
         * 待撤回的批量消息的ID，为[批量发送消息](https://open.feishu.cn/document/ukTMukTMukTM/ucDO1EjL3gTNx4yN4UTM)接口返回值中的`message_id`字段，用于标识一次批量发送消息请求。
         * <p> 示例值：bm-dc13264520392913993dd051dba21dcf
         */
        this.batchMessageId = builder.batchMessageId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getBatchMessageId() {
        return this.batchMessageId;
    }

    public void setBatchMessageId(String batchMessageId) {
        this.batchMessageId = batchMessageId;
    }

    public static class Builder {

        private String batchMessageId; // 待撤回的批量消息的ID，为[批量发送消息](https://open.feishu.cn/document/ukTMukTMukTM/ucDO1EjL3gTNx4yN4UTM)接口返回值中的`message_id`字段，用于标识一次批量发送消息请求。

        /**
         * 待撤回的批量消息的ID，为[批量发送消息](https://open.feishu.cn/document/ukTMukTMukTM/ucDO1EjL3gTNx4yN4UTM)接口返回值中的`message_id`字段，用于标识一次批量发送消息请求。
         * <p> 示例值：bm-dc13264520392913993dd051dba21dcf
         *
         * @param batchMessageId
         * @return
         */
        public Builder batchMessageId(String batchMessageId) {
            this.batchMessageId = batchMessageId;
            return this;
        }


        public DeleteBatchMessageReq build() {
            return new DeleteBatchMessageReq(this);
        }
    }
}
