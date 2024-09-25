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

package com.lark.oapi.service.corehr.v2.model;

import com.google.gson.annotations.SerializedName;

public class SignatureTemplatePermissionInfo {
    /**
     * 读权限
     * <p> 示例值：
     */
    @SerializedName("read_permission")
    private Boolean readPermission;
    /**
     * 写权限
     * <p> 示例值：
     */
    @SerializedName("write_permission")
    private Boolean writePermission;
    /**
     * 转换权限
     * <p> 示例值：
     */
    @SerializedName("switch_permission")
    private Boolean switchPermission;
    /**
     * 复制权限
     * <p> 示例值：
     */
    @SerializedName("copy_permission")
    private Boolean copyPermission;
    /**
     * 删除权限
     * <p> 示例值：
     */
    @SerializedName("delete_permission")
    private Boolean deletePermission;

    // builder 开始
    public SignatureTemplatePermissionInfo() {
    }

    public SignatureTemplatePermissionInfo(Builder builder) {
        /**
         * 读权限
         * <p> 示例值：
         */
        this.readPermission = builder.readPermission;
        /**
         * 写权限
         * <p> 示例值：
         */
        this.writePermission = builder.writePermission;
        /**
         * 转换权限
         * <p> 示例值：
         */
        this.switchPermission = builder.switchPermission;
        /**
         * 复制权限
         * <p> 示例值：
         */
        this.copyPermission = builder.copyPermission;
        /**
         * 删除权限
         * <p> 示例值：
         */
        this.deletePermission = builder.deletePermission;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Boolean getReadPermission() {
        return this.readPermission;
    }

    public void setReadPermission(Boolean readPermission) {
        this.readPermission = readPermission;
    }

    public Boolean getWritePermission() {
        return this.writePermission;
    }

    public void setWritePermission(Boolean writePermission) {
        this.writePermission = writePermission;
    }

    public Boolean getSwitchPermission() {
        return this.switchPermission;
    }

    public void setSwitchPermission(Boolean switchPermission) {
        this.switchPermission = switchPermission;
    }

    public Boolean getCopyPermission() {
        return this.copyPermission;
    }

    public void setCopyPermission(Boolean copyPermission) {
        this.copyPermission = copyPermission;
    }

    public Boolean getDeletePermission() {
        return this.deletePermission;
    }

    public void setDeletePermission(Boolean deletePermission) {
        this.deletePermission = deletePermission;
    }

    public static class Builder {
        /**
         * 读权限
         * <p> 示例值：
         */
        private Boolean readPermission;
        /**
         * 写权限
         * <p> 示例值：
         */
        private Boolean writePermission;
        /**
         * 转换权限
         * <p> 示例值：
         */
        private Boolean switchPermission;
        /**
         * 复制权限
         * <p> 示例值：
         */
        private Boolean copyPermission;
        /**
         * 删除权限
         * <p> 示例值：
         */
        private Boolean deletePermission;

        /**
         * 读权限
         * <p> 示例值：
         *
         * @param readPermission
         * @return
         */
        public Builder readPermission(Boolean readPermission) {
            this.readPermission = readPermission;
            return this;
        }


        /**
         * 写权限
         * <p> 示例值：
         *
         * @param writePermission
         * @return
         */
        public Builder writePermission(Boolean writePermission) {
            this.writePermission = writePermission;
            return this;
        }


        /**
         * 转换权限
         * <p> 示例值：
         *
         * @param switchPermission
         * @return
         */
        public Builder switchPermission(Boolean switchPermission) {
            this.switchPermission = switchPermission;
            return this;
        }


        /**
         * 复制权限
         * <p> 示例值：
         *
         * @param copyPermission
         * @return
         */
        public Builder copyPermission(Boolean copyPermission) {
            this.copyPermission = copyPermission;
            return this;
        }


        /**
         * 删除权限
         * <p> 示例值：
         *
         * @param deletePermission
         * @return
         */
        public Builder deletePermission(Boolean deletePermission) {
            this.deletePermission = deletePermission;
            return this;
        }


        public SignatureTemplatePermissionInfo build() {
            return new SignatureTemplatePermissionInfo(this);
        }
    }
}
