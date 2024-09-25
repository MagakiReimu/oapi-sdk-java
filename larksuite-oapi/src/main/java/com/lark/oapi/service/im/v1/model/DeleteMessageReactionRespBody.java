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

public class DeleteMessageReactionRespBody {
    /**
     * reaction资源ID
     * <p> 示例值：
     */
    @SerializedName("reaction_id")
    private String reactionId;
    /**
     * 添加reaction的操作人
     * <p> 示例值：
     */
    @SerializedName("operator")
    private Operator operator;
    /**
     * reaction动作的的unix timestamp(单位:ms)
     * <p> 示例值：
     */
    @SerializedName("action_time")
    private String actionTime;
    /**
     * reaction资源类型
     * <p> 示例值：
     */
    @SerializedName("reaction_type")
    private Emoji reactionType;

    public String getReactionId() {
        return this.reactionId;
    }

    public void setReactionId(String reactionId) {
        this.reactionId = reactionId;
    }

    public Operator getOperator() {
        return this.operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public String getActionTime() {
        return this.actionTime;
    }

    public void setActionTime(String actionTime) {
        this.actionTime = actionTime;
    }

    public Emoji getReactionType() {
        return this.reactionType;
    }

    public void setReactionType(Emoji reactionType) {
        this.reactionType = reactionType;
    }

}
