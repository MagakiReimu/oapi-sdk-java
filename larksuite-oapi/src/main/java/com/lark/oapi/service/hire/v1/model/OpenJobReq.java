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

package com.lark.oapi.service.hire.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;

public class OpenJobReq {
    /**
     * 职位 ID
     * <p> 示例值：6960663240925956555
     */
    @Path
    @SerializedName("job_id")
    private String jobId;
    @Body
    private OpenJobReqBody body;

    // builder 开始
    public OpenJobReq() {
    }

    public OpenJobReq(Builder builder) {
        /**
         * 职位 ID
         * <p> 示例值：6960663240925956555
         */
        this.jobId = builder.jobId;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getJobId() {
        return this.jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public OpenJobReqBody getOpenJobReqBody() {
        return this.body;
    }

    public void setOpenJobReqBody(OpenJobReqBody body) {
        this.body = body;
    }

    public static class Builder {

        private String jobId; // 职位 ID
        private OpenJobReqBody body;

        /**
         * 职位 ID
         * <p> 示例值：6960663240925956555
         *
         * @param jobId
         * @return
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        public OpenJobReqBody getOpenJobReqBody() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder openJobReqBody(OpenJobReqBody body) {
            this.body = body;
            return this;
        }

        public OpenJobReq build() {
            return new OpenJobReq(this);
        }
    }
}
