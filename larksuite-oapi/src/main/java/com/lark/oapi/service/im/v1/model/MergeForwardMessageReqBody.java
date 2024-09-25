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

import com.google.gson.annotations.SerializedName;

public class MergeForwardMessageReqBody {
    /**
     * 依据receive_id_type的值，填写对应的转发目标的ID
     * <p> 示例值：oc_a0553eda9014c201e6969b478895c230
     */
    @SerializedName("receive_id")
    private String receiveId;
    /**
     * 要转发的消息ID列表
     * <p> 示例值：
     */
    @SerializedName("message_id_list")
    private String[] messageIdList;

    // builder 开始
    public MergeForwardMessageReqBody() {
    }

    public MergeForwardMessageReqBody(Builder builder) {
        /**
         * 依据receive_id_type的值，填写对应的转发目标的ID
         * <p> 示例值：oc_a0553eda9014c201e6969b478895c230
         */
        this.receiveId = builder.receiveId;
        /**
         * 要转发的消息ID列表
         * <p> 示例值：
         */
        this.messageIdList = builder.messageIdList;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getReceiveId() {
        return this.receiveId;
    }

    public void setReceiveId(String receiveId) {
        this.receiveId = receiveId;
    }

    public String[] getMessageIdList() {
        return this.messageIdList;
    }

    public void setMessageIdList(String[] messageIdList) {
        this.messageIdList = messageIdList;
    }

    public static class Builder {
        /**
         * 依据receive_id_type的值，填写对应的转发目标的ID
         * <p> 示例值：oc_a0553eda9014c201e6969b478895c230
         */
        private String receiveId;
        /**
         * 要转发的消息ID列表
         * <p> 示例值：
         */
        private String[] messageIdList;

        /**
         * 依据receive_id_type的值，填写对应的转发目标的ID
         * <p> 示例值：oc_a0553eda9014c201e6969b478895c230
         *
         * @param receiveId
         * @return
         */
        public Builder receiveId(String receiveId) {
            this.receiveId = receiveId;
            return this;
        }


        /**
         * 要转发的消息ID列表
         * <p> 示例值：
         *
         * @param messageIdList
         * @return
         */
        public Builder messageIdList(String[] messageIdList) {
            this.messageIdList = messageIdList;
            return this;
        }


        public MergeForwardMessageReqBody build() {
            return new MergeForwardMessageReqBody(this);
        }
    }
}
