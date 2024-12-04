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

package com.lark.oapi.service.admin.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.admin.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class DeleteBadgeGrantReq {
    /**
     * 企业勋章的唯一ID
     * <p> 示例值：m_DjMzaK
     */
    @Path
    @SerializedName("badge_id")
    private String badgeId;
    /**
     * 租户内授予名单的唯一标识，该值由系统随机生成。
     * <p> 示例值：g_uS4yux
     */
    @Path
    @SerializedName("grant_id")
    private String grantId;

    // builder 开始
    public DeleteBadgeGrantReq() {
    }

    public DeleteBadgeGrantReq(Builder builder) {
        /**
         * 企业勋章的唯一ID
         * <p> 示例值：m_DjMzaK
         */
        this.badgeId = builder.badgeId;
        /**
         * 租户内授予名单的唯一标识，该值由系统随机生成。
         * <p> 示例值：g_uS4yux
         */
        this.grantId = builder.grantId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getBadgeId() {
        return this.badgeId;
    }

    public void setBadgeId(String badgeId) {
        this.badgeId = badgeId;
    }

    public String getGrantId() {
        return this.grantId;
    }

    public void setGrantId(String grantId) {
        this.grantId = grantId;
    }

    public static class Builder {

        private String badgeId; // 企业勋章的唯一ID
        private String grantId; // 租户内授予名单的唯一标识，该值由系统随机生成。

        /**
         * 企业勋章的唯一ID
         * <p> 示例值：m_DjMzaK
         *
         * @param badgeId
         * @return
         */
        public Builder badgeId(String badgeId) {
            this.badgeId = badgeId;
            return this;
        }


        /**
         * 租户内授予名单的唯一标识，该值由系统随机生成。
         * <p> 示例值：g_uS4yux
         *
         * @param grantId
         * @return
         */
        public Builder grantId(String grantId) {
            this.grantId = grantId;
            return this;
        }


        public DeleteBadgeGrantReq build() {
            return new DeleteBadgeGrantReq(this);
        }
    }
}
