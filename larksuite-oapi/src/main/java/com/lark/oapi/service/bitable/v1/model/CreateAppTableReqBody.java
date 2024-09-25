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

package com.lark.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;

public class CreateAppTableReqBody {
    /**
     * 数据表
     * <p> 示例值：
     */
    @SerializedName("table")
    private ReqTable table;

    // builder 开始
    public CreateAppTableReqBody() {
    }

    public CreateAppTableReqBody(Builder builder) {
        /**
         * 数据表
         * <p> 示例值：
         */
        this.table = builder.table;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public ReqTable getTable() {
        return this.table;
    }

    public void setTable(ReqTable table) {
        this.table = table;
    }

    public static class Builder {
        /**
         * 数据表
         * <p> 示例值：
         */
        private ReqTable table;

        /**
         * 数据表
         * <p> 示例值：
         *
         * @param table
         * @return
         */
        public Builder table(ReqTable table) {
            this.table = table;
            return this;
        }


        public CreateAppTableReqBody build() {
            return new CreateAppTableReqBody(this);
        }
    }
}
