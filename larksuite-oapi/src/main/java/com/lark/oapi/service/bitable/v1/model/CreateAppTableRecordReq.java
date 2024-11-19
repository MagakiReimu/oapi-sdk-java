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

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.bitable.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class CreateAppTableRecordReq {
    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 格式为标准的 uuid，操作的唯一标识，用于幂等的进行更新操作。此值为空表示将发起一次新的请求，此值非空表示幂等的进行更新操作。
     * <p> 示例值：fe599b60-450f-46ff-b2ef-9f6675625b97
     */
    @Query
    @SerializedName("client_token")
    private String clientToken;
    /**
     * 用于控制一致性读写，默认开启检查
     * <p> 示例值：true
     */
    @Query
    @SerializedName("ignore_consistency_check")
    private Boolean ignoreConsistencyCheck;
    /**
     * 多维表格的唯一标识符 [app_token 参数说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/notification#8121eebe)
     * <p> 示例值：bascng7vrxcxpig7geggXiCtadY
     */
    @Path
    @SerializedName("app_token")
    private String appToken;
    /**
     * 多维表格数据表的唯一标识符 [table_id 参数说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/notification#735fe883)
     * <p> 示例值：tblUa9vcYjWQYJCj
     */
    @Path
    @SerializedName("table_id")
    private String tableId;
    @Body
    private AppTableRecord body;

    // builder 开始
    public CreateAppTableRecordReq() {
    }

    public CreateAppTableRecordReq(Builder builder) {
        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         */
        this.userIdType = builder.userIdType;
        /**
         * 格式为标准的 uuid，操作的唯一标识，用于幂等的进行更新操作。此值为空表示将发起一次新的请求，此值非空表示幂等的进行更新操作。
         * <p> 示例值：fe599b60-450f-46ff-b2ef-9f6675625b97
         */
        this.clientToken = builder.clientToken;
        /**
         * 用于控制一致性读写，默认开启检查
         * <p> 示例值：true
         */
        this.ignoreConsistencyCheck = builder.ignoreConsistencyCheck;
        /**
         * 多维表格的唯一标识符 [app_token 参数说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/notification#8121eebe)
         * <p> 示例值：bascng7vrxcxpig7geggXiCtadY
         */
        this.appToken = builder.appToken;
        /**
         * 多维表格数据表的唯一标识符 [table_id 参数说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/notification#735fe883)
         * <p> 示例值：tblUa9vcYjWQYJCj
         */
        this.tableId = builder.tableId;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public String getClientToken() {
        return this.clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public Boolean getIgnoreConsistencyCheck() {
        return this.ignoreConsistencyCheck;
    }

    public void setIgnoreConsistencyCheck(Boolean ignoreConsistencyCheck) {
        this.ignoreConsistencyCheck = ignoreConsistencyCheck;
    }

    public String getAppToken() {
        return this.appToken;
    }

    public void setAppToken(String appToken) {
        this.appToken = appToken;
    }

    public String getTableId() {
        return this.tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public AppTableRecord getAppTableRecord() {
        return this.body;
    }

    public void setAppTableRecord(AppTableRecord body) {
        this.body = body;
    }

    public static class Builder {
        private String userIdType; // 此次调用中使用的用户ID的类型
        private String clientToken; // 格式为标准的 uuid，操作的唯一标识，用于幂等的进行更新操作。此值为空表示将发起一次新的请求，此值非空表示幂等的进行更新操作。
        private Boolean ignoreConsistencyCheck; // 用于控制一致性读写，默认开启检查
        private String appToken; // 多维表格的唯一标识符 [app_token 参数说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/notification#8121eebe)
        private String tableId; // 多维表格数据表的唯一标识符 [table_id 参数说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/notification#735fe883)
        private AppTableRecord body;

        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         *
         * @param userIdType
         * @return
         */
        public Builder userIdType(String userIdType) {
            this.userIdType = userIdType;
            return this;
        }

        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         *
         * @param userIdType {@link com.lark.oapi.service.bitable.v1.enums.CreateAppTableRecordUserIdTypeEnum}
         * @return
         */
        public Builder userIdType(com.lark.oapi.service.bitable.v1.enums.CreateAppTableRecordUserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }

        /**
         * 格式为标准的 uuid，操作的唯一标识，用于幂等的进行更新操作。此值为空表示将发起一次新的请求，此值非空表示幂等的进行更新操作。
         * <p> 示例值：fe599b60-450f-46ff-b2ef-9f6675625b97
         *
         * @param clientToken
         * @return
         */
        public Builder clientToken(String clientToken) {
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 用于控制一致性读写，默认开启检查
         * <p> 示例值：true
         *
         * @param ignoreConsistencyCheck
         * @return
         */
        public Builder ignoreConsistencyCheck(Boolean ignoreConsistencyCheck) {
            this.ignoreConsistencyCheck = ignoreConsistencyCheck;
            return this;
        }

        /**
         * 多维表格的唯一标识符 [app_token 参数说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/notification#8121eebe)
         * <p> 示例值：bascng7vrxcxpig7geggXiCtadY
         *
         * @param appToken
         * @return
         */
        public Builder appToken(String appToken) {
            this.appToken = appToken;
            return this;
        }

        /**
         * 多维表格数据表的唯一标识符 [table_id 参数说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/notification#735fe883)
         * <p> 示例值：tblUa9vcYjWQYJCj
         *
         * @param tableId
         * @return
         */
        public Builder tableId(String tableId) {
            this.tableId = tableId;
            return this;
        }

        public AppTableRecord getAppTableRecord() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder appTableRecord(AppTableRecord body) {
            this.body = body;
            return this;
        }

        public CreateAppTableRecordReq build() {
            return new CreateAppTableRecordReq(this);
        }
    }
}
