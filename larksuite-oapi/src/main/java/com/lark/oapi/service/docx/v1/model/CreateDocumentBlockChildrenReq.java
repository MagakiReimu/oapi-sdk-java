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

package com.lark.oapi.service.docx.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class CreateDocumentBlockChildrenReq {
    /**
     * 操作的文档版本，-1表示文档最新版本。若此时操作的版本为文档最新版本，则需要持有文档的阅读权限；若此时操作的版本为文档的历史版本，则需要持有文档的编辑权限。
     * <p> 示例值：-1
     */
    @Query
    @SerializedName("document_revision_id")
    private Integer documentRevisionId;
    /**
     * 操作的唯一标识，与接口返回值的 client_token 相对应，用于幂等的进行更新操作。此值为空表示将发起一次新的请求，此值非空表示幂等的进行更新操作。
     * <p> 示例值：fe599b60-450f-46ff-b2ef-9f6675625b97
     */
    @Query
    @SerializedName("client_token")
    private String clientToken;
    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 文档的唯一标识
     * <p> 示例值：doxcnePuYufKa49ISjhD8Ih0ikh
     */
    @Path
    @SerializedName("document_id")
    private String documentId;
    /**
     * Block 的唯一标识
     * <p> 示例值：doxcnO6UW6wAw2qIcYf4hZpFIth
     */
    @Path
    @SerializedName("block_id")
    private String blockId;
    @Body
    private CreateDocumentBlockChildrenReqBody body;

    // builder 开始
    public CreateDocumentBlockChildrenReq() {
    }

    public CreateDocumentBlockChildrenReq(Builder builder) {
        /**
         * 操作的文档版本，-1表示文档最新版本。若此时操作的版本为文档最新版本，则需要持有文档的阅读权限；若此时操作的版本为文档的历史版本，则需要持有文档的编辑权限。
         * <p> 示例值：-1
         */
        this.documentRevisionId = builder.documentRevisionId;
        /**
         * 操作的唯一标识，与接口返回值的 client_token 相对应，用于幂等的进行更新操作。此值为空表示将发起一次新的请求，此值非空表示幂等的进行更新操作。
         * <p> 示例值：fe599b60-450f-46ff-b2ef-9f6675625b97
         */
        this.clientToken = builder.clientToken;
        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         */
        this.userIdType = builder.userIdType;
        /**
         * 文档的唯一标识
         * <p> 示例值：doxcnePuYufKa49ISjhD8Ih0ikh
         */
        this.documentId = builder.documentId;
        /**
         * Block 的唯一标识
         * <p> 示例值：doxcnO6UW6wAw2qIcYf4hZpFIth
         */
        this.blockId = builder.blockId;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getDocumentRevisionId() {
        return this.documentRevisionId;
    }

    public void setDocumentRevisionId(Integer documentRevisionId) {
        this.documentRevisionId = documentRevisionId;
    }

    public String getClientToken() {
        return this.clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public String getDocumentId() {
        return this.documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getBlockId() {
        return this.blockId;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    public CreateDocumentBlockChildrenReqBody getCreateDocumentBlockChildrenReqBody() {
        return this.body;
    }

    public void setCreateDocumentBlockChildrenReqBody(CreateDocumentBlockChildrenReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private Integer documentRevisionId; // 操作的文档版本，-1表示文档最新版本。若此时操作的版本为文档最新版本，则需要持有文档的阅读权限；若此时操作的版本为文档的历史版本，则需要持有文档的编辑权限。
        private String clientToken; // 操作的唯一标识，与接口返回值的 client_token 相对应，用于幂等的进行更新操作。此值为空表示将发起一次新的请求，此值非空表示幂等的进行更新操作。
        private String userIdType; // 此次调用中使用的用户ID的类型
        private String documentId; // 文档的唯一标识
        private String blockId; // Block 的唯一标识
        private CreateDocumentBlockChildrenReqBody body;

        /**
         * 操作的文档版本，-1表示文档最新版本。若此时操作的版本为文档最新版本，则需要持有文档的阅读权限；若此时操作的版本为文档的历史版本，则需要持有文档的编辑权限。
         * <p> 示例值：-1
         *
         * @param documentRevisionId
         * @return
         */
        public Builder documentRevisionId(Integer documentRevisionId) {
            this.documentRevisionId = documentRevisionId;
            return this;
        }

        /**
         * 操作的唯一标识，与接口返回值的 client_token 相对应，用于幂等的进行更新操作。此值为空表示将发起一次新的请求，此值非空表示幂等的进行更新操作。
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
         * @param userIdType {@link com.lark.oapi.service.docx.v1.enums.CreateDocumentBlockChildrenUserIdTypeEnum}
         * @return
         */
        public Builder userIdType(com.lark.oapi.service.docx.v1.enums.CreateDocumentBlockChildrenUserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }

        /**
         * 文档的唯一标识
         * <p> 示例值：doxcnePuYufKa49ISjhD8Ih0ikh
         *
         * @param documentId
         * @return
         */
        public Builder documentId(String documentId) {
            this.documentId = documentId;
            return this;
        }

        /**
         * Block 的唯一标识
         * <p> 示例值：doxcnO6UW6wAw2qIcYf4hZpFIth
         *
         * @param blockId
         * @return
         */
        public Builder blockId(String blockId) {
            this.blockId = blockId;
            return this;
        }

        public CreateDocumentBlockChildrenReqBody getCreateDocumentBlockChildrenReqBody() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder createDocumentBlockChildrenReqBody(CreateDocumentBlockChildrenReqBody body) {
            this.body = body;
            return this;
        }

        public CreateDocumentBlockChildrenReq build() {
            return new CreateDocumentBlockChildrenReq(this);
        }
    }
}
