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

package com.lark.oapi.service.task.v1.model;

import com.google.gson.annotations.SerializedName;

public class Follower {
    /**
     * 任务关注人 ID
     * <p> 示例值：ou_99e1a581b36ecc4862cbfbce473f3123
     */
    @SerializedName("id")
    private String id;
    /**
     * 要删除的关注人ID列表
     * <p> 示例值：[;  "ou_550cc75233d8b7b9fcbdad65f34433f4", "ou_d1e9d27cf3235b40ca9a67c67ef088b0";]
     */
    @SerializedName("id_list")
    private String[] idList;

    // builder 开始
    public Follower() {
    }

    public Follower(Builder builder) {
        /**
         * 任务关注人 ID
         * <p> 示例值：ou_99e1a581b36ecc4862cbfbce473f3123
         */
        this.id = builder.id;
        /**
         * 要删除的关注人ID列表
         * <p> 示例值：[;  "ou_550cc75233d8b7b9fcbdad65f34433f4", "ou_d1e9d27cf3235b40ca9a67c67ef088b0";]
         */
        this.idList = builder.idList;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String[] getIdList() {
        return this.idList;
    }

    public void setIdList(String[] idList) {
        this.idList = idList;
    }

    public static class Builder {
        /**
         * 任务关注人 ID
         * <p> 示例值：ou_99e1a581b36ecc4862cbfbce473f3123
         */
        private String id;
        /**
         * 要删除的关注人ID列表
         * <p> 示例值：[;  "ou_550cc75233d8b7b9fcbdad65f34433f4", "ou_d1e9d27cf3235b40ca9a67c67ef088b0";]
         */
        private String[] idList;

        /**
         * 任务关注人 ID
         * <p> 示例值：ou_99e1a581b36ecc4862cbfbce473f3123
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 要删除的关注人ID列表
         * <p> 示例值：[;  "ou_550cc75233d8b7b9fcbdad65f34433f4", "ou_d1e9d27cf3235b40ca9a67c67ef088b0";]
         *
         * @param idList
         * @return
         */
        public Builder idList(String[] idList) {
            this.idList = idList;
            return this;
        }


        public Follower build() {
            return new Follower(this);
        }
    }
}
