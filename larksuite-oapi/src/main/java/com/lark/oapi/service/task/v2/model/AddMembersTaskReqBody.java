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

package com.lark.oapi.service.task.v2.model;

import com.google.gson.annotations.SerializedName;

public class AddMembersTaskReqBody {
    /**
     * 要添加的members列表
     * <p> 示例值：
     */
    @SerializedName("members")
    private Member[] members;
    /**
     * 幂等token，如果提供则实现幂等行为
     * <p> 示例值：6d99f59c-4d7d-4452-98d6-3d0556393cf6
     */
    @SerializedName("client_token")
    private String clientToken;

    // builder 开始
    public AddMembersTaskReqBody() {
    }

    public AddMembersTaskReqBody(Builder builder) {
        /**
         * 要添加的members列表
         * <p> 示例值：
         */
        this.members = builder.members;
        /**
         * 幂等token，如果提供则实现幂等行为
         * <p> 示例值：6d99f59c-4d7d-4452-98d6-3d0556393cf6
         */
        this.clientToken = builder.clientToken;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Member[] getMembers() {
        return this.members;
    }

    public void setMembers(Member[] members) {
        this.members = members;
    }

    public String getClientToken() {
        return this.clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public static class Builder {
        /**
         * 要添加的members列表
         * <p> 示例值：
         */
        private Member[] members;
        /**
         * 幂等token，如果提供则实现幂等行为
         * <p> 示例值：6d99f59c-4d7d-4452-98d6-3d0556393cf6
         */
        private String clientToken;

        /**
         * 要添加的members列表
         * <p> 示例值：
         *
         * @param members
         * @return
         */
        public Builder members(Member[] members) {
            this.members = members;
            return this;
        }


        /**
         * 幂等token，如果提供则实现幂等行为
         * <p> 示例值：6d99f59c-4d7d-4452-98d6-3d0556393cf6
         *
         * @param clientToken
         * @return
         */
        public Builder clientToken(String clientToken) {
            this.clientToken = clientToken;
            return this;
        }


        public AddMembersTaskReqBody build() {
            return new AddMembersTaskReqBody(this);
        }
    }
}
