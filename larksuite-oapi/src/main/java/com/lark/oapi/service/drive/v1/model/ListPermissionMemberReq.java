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

package com.lark.oapi.service.drive.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.drive.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class ListPermissionMemberReq {
    /**
     * 文件类型，需要与文件的 token 相匹配
     * <p> 示例值：doc
     */
    @Query
    @SerializedName("type")
    private String type;
    /**
     * 指定返回的协作者字段信息，如无指定则默认不返回;;**可选值有：** ;- `name`：协作者名;- `type`：协作者类型;- `avatar`：头像;- `external_label`：外部标签;;**注意：** ;- 你可以使用特殊值`*`指定返回目前支持的所有字段;- 你可以使用`,`分隔若干个你想指定返回的字段，如：`name,avatar`;- 按需指定返回字段接口性能更好
     * <p> 示例值：*
     */
    @Query
    @SerializedName("fields")
    private String fields;
    /**
     * 协作者的权限角色类型
     * <p> 示例值：container
     */
    @Query
    @SerializedName("perm_type")
    private String permType;
    /**
     * 文件的 token，获取方式见 [如何获取云文档资源相关 token](https://open.feishu.cn/document/ukTMukTMukTM/uczNzUjL3czM14yN3MTN#08bb5df6)
     * <p> 示例值：doccnBKgoMyY5OMbUG6FioTXuBe
     */
    @Path
    @SerializedName("token")
    private String token;

    // builder 开始
    public ListPermissionMemberReq() {
    }

    public ListPermissionMemberReq(Builder builder) {
        /**
         * 文件类型，需要与文件的 token 相匹配
         * <p> 示例值：doc
         */
        this.type = builder.type;
        /**
         * 指定返回的协作者字段信息，如无指定则默认不返回;;**可选值有：** ;- `name`：协作者名;- `type`：协作者类型;- `avatar`：头像;- `external_label`：外部标签;;**注意：** ;- 你可以使用特殊值`*`指定返回目前支持的所有字段;- 你可以使用`,`分隔若干个你想指定返回的字段，如：`name,avatar`;- 按需指定返回字段接口性能更好
         * <p> 示例值：*
         */
        this.fields = builder.fields;
        /**
         * 协作者的权限角色类型
         * <p> 示例值：container
         */
        this.permType = builder.permType;
        /**
         * 文件的 token，获取方式见 [如何获取云文档资源相关 token](https://open.feishu.cn/document/ukTMukTMukTM/uczNzUjL3czM14yN3MTN#08bb5df6)
         * <p> 示例值：doccnBKgoMyY5OMbUG6FioTXuBe
         */
        this.token = builder.token;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFields() {
        return this.fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getPermType() {
        return this.permType;
    }

    public void setPermType(String permType) {
        this.permType = permType;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static class Builder {
        private String type; // 文件类型，需要与文件的 token 相匹配
        private String fields; // 指定返回的协作者字段信息，如无指定则默认不返回;;**可选值有：** ;- `name`：协作者名;- `type`：协作者类型;- `avatar`：头像;- `external_label`：外部标签;;**注意：** ;- 你可以使用特殊值`*`指定返回目前支持的所有字段;- 你可以使用`,`分隔若干个你想指定返回的字段，如：`name,avatar`;- 按需指定返回字段接口性能更好
        private String permType; // 协作者的权限角色类型
        private String token; // 文件的 token，获取方式见 [如何获取云文档资源相关 token](https://open.feishu.cn/document/ukTMukTMukTM/uczNzUjL3czM14yN3MTN#08bb5df6)

        /**
         * 文件类型，需要与文件的 token 相匹配
         * <p> 示例值：doc
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * 文件类型，需要与文件的 token 相匹配
         * <p> 示例值：doc
         *
         * @param type {@link com.lark.oapi.service.drive.v1.enums.ListPermissionMemberTokenTypeEnum}
         * @return
         */
        public Builder type(com.lark.oapi.service.drive.v1.enums.ListPermissionMemberTokenTypeEnum type) {
            this.type = type.getValue();
            return this;
        }

        /**
         * 指定返回的协作者字段信息，如无指定则默认不返回;;**可选值有：** ;- `name`：协作者名;- `type`：协作者类型;- `avatar`：头像;- `external_label`：外部标签;;**注意：** ;- 你可以使用特殊值`*`指定返回目前支持的所有字段;- 你可以使用`,`分隔若干个你想指定返回的字段，如：`name,avatar`;- 按需指定返回字段接口性能更好
         * <p> 示例值：*
         *
         * @param fields
         * @return
         */
        public Builder fields(String fields) {
            this.fields = fields;
            return this;
        }

        /**
         * 协作者的权限角色类型
         * <p> 示例值：container
         *
         * @param permType
         * @return
         */
        public Builder permType(String permType) {
            this.permType = permType;
            return this;
        }

        /**
         * 协作者的权限角色类型
         * <p> 示例值：container
         *
         * @param permType {@link com.lark.oapi.service.drive.v1.enums.ListPermissionMemberPermTypeEnum}
         * @return
         */
        public Builder permType(com.lark.oapi.service.drive.v1.enums.ListPermissionMemberPermTypeEnum permType) {
            this.permType = permType.getValue();
            return this;
        }

        /**
         * 文件的 token，获取方式见 [如何获取云文档资源相关 token](https://open.feishu.cn/document/ukTMukTMukTM/uczNzUjL3czM14yN3MTN#08bb5df6)
         * <p> 示例值：doccnBKgoMyY5OMbUG6FioTXuBe
         *
         * @param token
         * @return
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public ListPermissionMemberReq build() {
            return new ListPermissionMemberReq(this);
        }
    }
}
