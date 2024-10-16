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

package com.lark.oapi.service.moments.v1.model;

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

public class P2ReactionDeletedV1Data {
    /**
     * reaction 类型
     * <p> 示例值："OK"
     */
    @SerializedName("type")
    private String type;
    /**
     * reaction 所属用户ID
     * <p> 示例值：
     */
    @SerializedName("user_id")
    private UserId userId;
    /**
     * reaction 所属实体ID
     * <p> 示例值："248381241"
     */
    @SerializedName("entity_id")
    private String entityId;
    /**
     * Reaction的ID
     * <p> 示例值："MS8yL1NPQg=="
     */
    @SerializedName("id")
    private String id;
    /**
     * 表情回复所属实体类型
     * <p> 示例值：1
     */
    @SerializedName("entity_type")
    private Integer entityType;
    /**
     * 表情回复人类型
     * <p> 示例值：1
     */
    @SerializedName("user_type")
    private Integer userType;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UserId getUserId() {
        return this.userId;
    }

    public void setUserId(UserId userId) {
        this.userId = userId;
    }

    public String getEntityId() {
        return this.entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getEntityType() {
        return this.entityType;
    }

    public void setEntityType(Integer entityType) {
        this.entityType = entityType;
    }

    public Integer getUserType() {
        return this.userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

}
