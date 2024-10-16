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

package com.lark.oapi.service.speech_to_text.v1.model;

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

public class Speech {
    /**
     * pcm格式音频文件（文件识别）或音频分片（流式识别）经base64编码后的内容
     * <p> 示例值：PdmrfE267Cd/Z9KpmNFh71A2PSJZxSp7+8upCg==
     */
    @SerializedName("speech")
    private String speech;
    /**
     * 上传到 drive 存储平台后获取到的 key （暂不支持）
     * <p> 示例值：
     */
    @SerializedName("speech_key")
    private String speechKey;

    // builder 开始
    public Speech() {
    }

    public Speech(Builder builder) {
        /**
         * pcm格式音频文件（文件识别）或音频分片（流式识别）经base64编码后的内容
         * <p> 示例值：PdmrfE267Cd/Z9KpmNFh71A2PSJZxSp7+8upCg==
         */
        this.speech = builder.speech;
        /**
         * 上传到 drive 存储平台后获取到的 key （暂不支持）
         * <p> 示例值：
         */
        this.speechKey = builder.speechKey;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getSpeech() {
        return this.speech;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    public String getSpeechKey() {
        return this.speechKey;
    }

    public void setSpeechKey(String speechKey) {
        this.speechKey = speechKey;
    }

    public static class Builder {
        /**
         * pcm格式音频文件（文件识别）或音频分片（流式识别）经base64编码后的内容
         * <p> 示例值：PdmrfE267Cd/Z9KpmNFh71A2PSJZxSp7+8upCg==
         */
        private String speech;
        /**
         * 上传到 drive 存储平台后获取到的 key （暂不支持）
         * <p> 示例值：
         */
        private String speechKey;

        /**
         * pcm格式音频文件（文件识别）或音频分片（流式识别）经base64编码后的内容
         * <p> 示例值：PdmrfE267Cd/Z9KpmNFh71A2PSJZxSp7+8upCg==
         *
         * @param speech
         * @return
         */
        public Builder speech(String speech) {
            this.speech = speech;
            return this;
        }


        /**
         * 上传到 drive 存储平台后获取到的 key （暂不支持）
         * <p> 示例值：
         *
         * @param speechKey
         * @return
         */
        public Builder speechKey(String speechKey) {
            this.speechKey = speechKey;
            return this;
        }


        public Speech build() {
            return new Speech(this);
        }
    }
}
