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

public class P2ChatAccessEventBotP2pChatEnteredV1Data {
    /**
     * 群组ID
     * <p> 示例值：oc_413871888e0d5492e25b173f0812efb7
     */
    @SerializedName("chat_id")
    private String chatId;
    /**
     * 进入与机器人会话的操作人ID
     * <p> 示例值：
     */
    @SerializedName("operator_id")
    private UserId operatorId;
    /**
     * 会话内用户可见的最新消息ID
     * <p> 示例值：om_dc13264520392913993dd051dba21dcf
     */
    @SerializedName("last_message_id")
    private String lastMessageId;
    /**
     * 会话内用户可见的最新消息发送时间，毫秒时间戳
     * <p> 示例值：1615380573411
     */
    @SerializedName("last_message_create_time")
    private String lastMessageCreateTime;

    public String getChatId() {
        return this.chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public UserId getOperatorId() {
        return this.operatorId;
    }

    public void setOperatorId(UserId operatorId) {
        this.operatorId = operatorId;
    }

    public String getLastMessageId() {
        return this.lastMessageId;
    }

    public void setLastMessageId(String lastMessageId) {
        this.lastMessageId = lastMessageId;
    }

    public String getLastMessageCreateTime() {
        return this.lastMessageCreateTime;
    }

    public void setLastMessageCreateTime(String lastMessageCreateTime) {
        this.lastMessageCreateTime = lastMessageCreateTime;
    }

}
