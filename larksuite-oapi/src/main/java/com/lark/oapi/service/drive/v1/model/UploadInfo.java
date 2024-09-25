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

import com.google.gson.annotations.SerializedName;

public class UploadInfo {
    /**
     * 文件名
     * <p> 示例值：
     */
    @SerializedName("file_name")
    private String fileName;
    /**
     * 父节点类型（父文件系统类型）
     * <p> 示例值：
     */
    @SerializedName("parent_type")
    private String parentType;
    /**
     * 父节点
     * <p> 示例值：
     */
    @SerializedName("parent_node")
    private String parentNode;
    /**
     * 文件大小
     * <p> 示例值：
     */
    @SerializedName("size")
    private Integer size;

    // builder 开始
    public UploadInfo() {
    }

    public UploadInfo(Builder builder) {
        /**
         * 文件名
         * <p> 示例值：
         */
        this.fileName = builder.fileName;
        /**
         * 父节点类型（父文件系统类型）
         * <p> 示例值：
         */
        this.parentType = builder.parentType;
        /**
         * 父节点
         * <p> 示例值：
         */
        this.parentNode = builder.parentNode;
        /**
         * 文件大小
         * <p> 示例值：
         */
        this.size = builder.size;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getParentType() {
        return this.parentType;
    }

    public void setParentType(String parentType) {
        this.parentType = parentType;
    }

    public String getParentNode() {
        return this.parentNode;
    }

    public void setParentNode(String parentNode) {
        this.parentNode = parentNode;
    }

    public Integer getSize() {
        return this.size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public static class Builder {
        /**
         * 文件名
         * <p> 示例值：
         */
        private String fileName;
        /**
         * 父节点类型（父文件系统类型）
         * <p> 示例值：
         */
        private String parentType;
        /**
         * 父节点
         * <p> 示例值：
         */
        private String parentNode;
        /**
         * 文件大小
         * <p> 示例值：
         */
        private Integer size;

        /**
         * 文件名
         * <p> 示例值：
         *
         * @param fileName
         * @return
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }


        /**
         * 父节点类型（父文件系统类型）
         * <p> 示例值：
         *
         * @param parentType
         * @return
         */
        public Builder parentType(String parentType) {
            this.parentType = parentType;
            return this;
        }

        /**
         * 父节点类型（父文件系统类型）
         * <p> 示例值：
         *
         * @param parentType {@link com.lark.oapi.service.drive.v1.enums.UploadInfoParentTypeEnum}
         * @return
         */
        public Builder parentType(com.lark.oapi.service.drive.v1.enums.UploadInfoParentTypeEnum parentType) {
            this.parentType = parentType.getValue();
            return this;
        }


        /**
         * 父节点
         * <p> 示例值：
         *
         * @param parentNode
         * @return
         */
        public Builder parentNode(String parentNode) {
            this.parentNode = parentNode;
            return this;
        }


        /**
         * 文件大小
         * <p> 示例值：
         *
         * @param size
         * @return
         */
        public Builder size(Integer size) {
            this.size = size;
            return this;
        }


        public UploadInfo build() {
            return new UploadInfo(this);
        }
    }
}
