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

package com.lark.oapi.service.im.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.im.v2.enums.*;
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

public class UpdateChatPin {
    /**
     * 置顶是否被固定到置顶列表前方,目前每个群内最多可以固定一个置顶。
     * <p> 示例值：
     */
    @SerializedName("is_fixed")
    private Boolean isFixed;
    /**
     * <p> 示例值：
     */
    @SerializedName("update_url_pin")
    private UpdateUrlPin updateUrlPin;

    // builder 开始
    public UpdateChatPin() {
    }

    public UpdateChatPin(Builder builder) {
        /**
         * 置顶是否被固定到置顶列表前方,目前每个群内最多可以固定一个置顶。
         * <p> 示例值：
         */
        this.isFixed = builder.isFixed;
        /**
         *
         * <p> 示例值：
         */
        this.updateUrlPin = builder.updateUrlPin;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Boolean getIsFixed() {
        return this.isFixed;
    }

    public void setIsFixed(Boolean isFixed) {
        this.isFixed = isFixed;
    }

    public UpdateUrlPin getUpdateUrlPin() {
        return this.updateUrlPin;
    }

    public void setUpdateUrlPin(UpdateUrlPin updateUrlPin) {
        this.updateUrlPin = updateUrlPin;
    }

    public static class Builder {
        /**
         * 置顶是否被固定到置顶列表前方,目前每个群内最多可以固定一个置顶。
         * <p> 示例值：
         */
        private Boolean isFixed;
        /**
         * <p> 示例值：
         */
        private UpdateUrlPin updateUrlPin;

        /**
         * 置顶是否被固定到置顶列表前方,目前每个群内最多可以固定一个置顶。
         * <p> 示例值：
         *
         * @param isFixed
         * @return
         */
        public Builder isFixed(Boolean isFixed) {
            this.isFixed = isFixed;
            return this;
        }


        /**
         * <p> 示例值：
         *
         * @param updateUrlPin
         * @return
         */
        public Builder updateUrlPin(UpdateUrlPin updateUrlPin) {
            this.updateUrlPin = updateUrlPin;
            return this;
        }


        public UpdateChatPin build() {
            return new UpdateChatPin(this);
        }
    }
}
