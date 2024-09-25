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

import com.google.gson.annotations.SerializedName;

public class PatchTagFailReason {
    /**
     * 名称重复的标签id
     * <p> 示例值：716168xxxxx
     */
    @SerializedName("duplicate_id")
    private String duplicateId;

    // builder 开始
    public PatchTagFailReason() {
    }

    public PatchTagFailReason(Builder builder) {
        /**
         * 名称重复的标签id
         * <p> 示例值：716168xxxxx
         */
        this.duplicateId = builder.duplicateId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getDuplicateId() {
        return this.duplicateId;
    }

    public void setDuplicateId(String duplicateId) {
        this.duplicateId = duplicateId;
    }

    public static class Builder {
        /**
         * 名称重复的标签id
         * <p> 示例值：716168xxxxx
         */
        private String duplicateId;

        /**
         * 名称重复的标签id
         * <p> 示例值：716168xxxxx
         *
         * @param duplicateId
         * @return
         */
        public Builder duplicateId(String duplicateId) {
            this.duplicateId = duplicateId;
            return this;
        }


        public PatchTagFailReason build() {
            return new PatchTagFailReason(this);
        }
    }
}
