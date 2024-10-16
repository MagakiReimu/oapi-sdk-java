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

public class UpdateAppTableRecordReq {
    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 多维表格的唯一标识符 [app_token 参数说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/notification#8121eebe)
     * <p> 示例值：appbcbWCzen6D8dezhoCH2RpMAh
     */
    @Path
    @SerializedName("app_token")
    private String appToken;
    /**
     * 多维表格数据表的唯一标识符 [table_id 参数说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/notification#735fe883)
     * <p> 示例值：tblsRc9GRRXKqhvW
     */
    @Path
    @SerializedName("table_id")
    private String tableId;
    /**
     * 一条记录的唯一标识 id [record_id 参数说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/notification#15d8db94)
     * <p> 示例值：recqwIwhc6
     */
    @Path
    @SerializedName("record_id")
    private String recordId;
    @Body
    private AppTableRecord body;

    // builder 开始
    public UpdateAppTableRecordReq() {
    }

    public UpdateAppTableRecordReq(Builder builder) {
        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         */
        this.userIdType = builder.userIdType;
        /**
         * 多维表格的唯一标识符 [app_token 参数说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/notification#8121eebe)
         * <p> 示例值：appbcbWCzen6D8dezhoCH2RpMAh
         */
        this.appToken = builder.appToken;
        /**
         * 多维表格数据表的唯一标识符 [table_id 参数说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/notification#735fe883)
         * <p> 示例值：tblsRc9GRRXKqhvW
         */
        this.tableId = builder.tableId;
        /**
         * 一条记录的唯一标识 id [record_id 参数说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/notification#15d8db94)
         * <p> 示例值：recqwIwhc6
         */
        this.recordId = builder.recordId;
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

    public String getRecordId() {
        return this.recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public AppTableRecord getAppTableRecord() {
        return this.body;
    }

    public void setAppTableRecord(AppTableRecord body) {
        this.body = body;
    }

    public static class Builder {
        private String userIdType; // 此次调用中使用的用户ID的类型
        private String appToken; // 多维表格的唯一标识符 [app_token 参数说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/notification#8121eebe)
        private String tableId; // 多维表格数据表的唯一标识符 [table_id 参数说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/notification#735fe883)
        private String recordId; // 一条记录的唯一标识 id [record_id 参数说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/notification#15d8db94)
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
         * @param userIdType {@link com.lark.oapi.service.bitable.v1.enums.UpdateAppTableRecordUserIdTypeEnum}
         * @return
         */
        public Builder userIdType(com.lark.oapi.service.bitable.v1.enums.UpdateAppTableRecordUserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }

        /**
         * 多维表格的唯一标识符 [app_token 参数说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/notification#8121eebe)
         * <p> 示例值：appbcbWCzen6D8dezhoCH2RpMAh
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
         * <p> 示例值：tblsRc9GRRXKqhvW
         *
         * @param tableId
         * @return
         */
        public Builder tableId(String tableId) {
            this.tableId = tableId;
            return this;
        }

        /**
         * 一条记录的唯一标识 id [record_id 参数说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/notification#15d8db94)
         * <p> 示例值：recqwIwhc6
         *
         * @param recordId
         * @return
         */
        public Builder recordId(String recordId) {
            this.recordId = recordId;
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

        public UpdateAppTableRecordReq build() {
            return new UpdateAppTableRecordReq(this);
        }
    }
}
