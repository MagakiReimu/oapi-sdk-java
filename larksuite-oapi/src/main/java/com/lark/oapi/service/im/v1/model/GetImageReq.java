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

public class GetImageReq {
    /**
     * 图片的key，通过[上传图片](	https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/image/create)接口上传图片后获得
     * <p> 示例值：img_8d5181ca-0aed-40f0-b0d1-b1452132afbg
     */
    @Path
    @SerializedName("image_key")
    private String imageKey;

    // builder 开始
    public GetImageReq() {
    }

    public GetImageReq(Builder builder) {
        /**
         * 图片的key，通过[上传图片](	https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/image/create)接口上传图片后获得
         * <p> 示例值：img_8d5181ca-0aed-40f0-b0d1-b1452132afbg
         */
        this.imageKey = builder.imageKey;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getImageKey() {
        return this.imageKey;
    }

    public void setImageKey(String imageKey) {
        this.imageKey = imageKey;
    }

    public static class Builder {

        private String imageKey; // 图片的key，通过[上传图片](	https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/image/create)接口上传图片后获得

        /**
         * 图片的key，通过[上传图片](	https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/image/create)接口上传图片后获得
         * <p> 示例值：img_8d5181ca-0aed-40f0-b0d1-b1452132afbg
         *
         * @param imageKey
         * @return
         */
        public Builder imageKey(String imageKey) {
            this.imageKey = imageKey;
            return this;
        }


        public GetImageReq build() {
            return new GetImageReq(this);
        }
    }
}
