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

public class P2UserUpdatedV1Data {
    /**
     * 用户 ID
     * <p> 示例值：
     */
    @SerializedName("user_id")
    private UserId userId;
    /**
     * 卡号
     * <p> 示例值：123456
     */
    @SerializedName("card")
    private Integer card;
    /**
     * 是否上传人脸图片
     * <p> 示例值：true
     */
    @SerializedName("face_uploaded")
    private Boolean faceUploaded;

    public UserId getUserId() {
        return this.userId;
    }

    public void setUserId(UserId userId) {
        this.userId = userId;
    }

    public Integer getCard() {
        return this.card;
    }

    public void setCard(Integer card) {
        this.card = card;
    }

    public Boolean getFaceUploaded() {
        return this.faceUploaded;
    }

    public void setFaceUploaded(Boolean faceUploaded) {
        this.faceUploaded = faceUploaded;
    }

}
