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

package com.lark.oapi.service.vc.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.vc.v1.enums.*;
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

public class MyAiVcRoomScenarioContext {
    /**
     * 会话选择的插件列表
     * <p> 示例值：
     */
    @SerializedName("plugins")
    private MyAiPluginContext[] plugins;
    /**
     * 透传数据
     * <p> 示例值：
     */
    @SerializedName("extra")
    private MyAiVcRoomExtra extra;

    // builder 开始
    public MyAiVcRoomScenarioContext() {
    }

    public MyAiVcRoomScenarioContext(Builder builder) {
        /**
         * 会话选择的插件列表
         * <p> 示例值：
         */
        this.plugins = builder.plugins;
        /**
         * 透传数据
         * <p> 示例值：
         */
        this.extra = builder.extra;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public MyAiPluginContext[] getPlugins() {
        return this.plugins;
    }

    public void setPlugins(MyAiPluginContext[] plugins) {
        this.plugins = plugins;
    }

    public MyAiVcRoomExtra getExtra() {
        return this.extra;
    }

    public void setExtra(MyAiVcRoomExtra extra) {
        this.extra = extra;
    }

    public static class Builder {
        /**
         * 会话选择的插件列表
         * <p> 示例值：
         */
        private MyAiPluginContext[] plugins;
        /**
         * 透传数据
         * <p> 示例值：
         */
        private MyAiVcRoomExtra extra;

        /**
         * 会话选择的插件列表
         * <p> 示例值：
         *
         * @param plugins
         * @return
         */
        public Builder plugins(MyAiPluginContext[] plugins) {
            this.plugins = plugins;
            return this;
        }


        /**
         * 透传数据
         * <p> 示例值：
         *
         * @param extra
         * @return
         */
        public Builder extra(MyAiVcRoomExtra extra) {
            this.extra = extra;
            return this;
        }


        public MyAiVcRoomScenarioContext build() {
            return new MyAiVcRoomScenarioContext(this);
        }
    }
}
