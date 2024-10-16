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

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.corehr.v2.enums.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class HiberarchyCommon {
    /**
     * 上级组织
     * <p> 示例值：4719168654814483759
     */
    @SerializedName("parent_id")
    private String parentId;
    /**
     * 名称
     * <p> 示例值：
     */
    @SerializedName("name")
    private I18n[] name;
    /**
     * 组织类型
     * <p> 示例值：
     */
    @SerializedName("type")
    private Enum type;
    /**
     * 启用
     * <p> 示例值：true
     */
    @SerializedName("active")
    private Boolean active;
    /**
     * 生效时间
     * <p> 示例值：2020-05-01 00:00:00
     */
    @SerializedName("effective_time")
    private String effectiveTime;
    /**
     * 失效时间
     * <p> 示例值：2020-05-02 00:00:00
     */
    @SerializedName("expiration_time")
    private String expirationTime;
    /**
     * 编码
     * <p> 示例值：12456
     */
    @SerializedName("code")
    private String code;
    /**
     * 描述
     * <p> 示例值：
     */
    @SerializedName("description")
    private I18n[] description;
    /**
     * 树形排序，代表同层级的部门排序序号
     * <p> 示例值：123
     */
    @SerializedName("tree_order")
    private String treeOrder;
    /**
     * 列表排序，代表所有部门的混排序号
     * <p> 示例值：123
     */
    @SerializedName("list_order")
    private String listOrder;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("custom_fields")
    private ObjectFieldData[] customFields;

    // builder 开始
    public HiberarchyCommon() {
    }

    public HiberarchyCommon(Builder builder) {
        /**
         * 上级组织
         * <p> 示例值：4719168654814483759
         */
        this.parentId = builder.parentId;
        /**
         * 名称
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 组织类型
         * <p> 示例值：
         */
        this.type = builder.type;
        /**
         * 启用
         * <p> 示例值：true
         */
        this.active = builder.active;
        /**
         * 生效时间
         * <p> 示例值：2020-05-01 00:00:00
         */
        this.effectiveTime = builder.effectiveTime;
        /**
         * 失效时间
         * <p> 示例值：2020-05-02 00:00:00
         */
        this.expirationTime = builder.expirationTime;
        /**
         * 编码
         * <p> 示例值：12456
         */
        this.code = builder.code;
        /**
         * 描述
         * <p> 示例值：
         */
        this.description = builder.description;
        /**
         * 树形排序，代表同层级的部门排序序号
         * <p> 示例值：123
         */
        this.treeOrder = builder.treeOrder;
        /**
         * 列表排序，代表所有部门的混排序号
         * <p> 示例值：123
         */
        this.listOrder = builder.listOrder;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        this.customFields = builder.customFields;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getParentId() {
        return this.parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public I18n[] getName() {
        return this.name;
    }

    public void setName(I18n[] name) {
        this.name = name;
    }

    public Enum getType() {
        return this.type;
    }

    public void setType(Enum type) {
        this.type = type;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public String getExpirationTime() {
        return this.expirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public I18n[] getDescription() {
        return this.description;
    }

    public void setDescription(I18n[] description) {
        this.description = description;
    }

    public String getTreeOrder() {
        return this.treeOrder;
    }

    public void setTreeOrder(String treeOrder) {
        this.treeOrder = treeOrder;
    }

    public String getListOrder() {
        return this.listOrder;
    }

    public void setListOrder(String listOrder) {
        this.listOrder = listOrder;
    }

    public ObjectFieldData[] getCustomFields() {
        return this.customFields;
    }

    public void setCustomFields(ObjectFieldData[] customFields) {
        this.customFields = customFields;
    }

    public static class Builder {
        /**
         * 上级组织
         * <p> 示例值：4719168654814483759
         */
        private String parentId;
        /**
         * 名称
         * <p> 示例值：
         */
        private I18n[] name;
        /**
         * 组织类型
         * <p> 示例值：
         */
        private Enum type;
        /**
         * 启用
         * <p> 示例值：true
         */
        private Boolean active;
        /**
         * 生效时间
         * <p> 示例值：2020-05-01 00:00:00
         */
        private String effectiveTime;
        /**
         * 失效时间
         * <p> 示例值：2020-05-02 00:00:00
         */
        private String expirationTime;
        /**
         * 编码
         * <p> 示例值：12456
         */
        private String code;
        /**
         * 描述
         * <p> 示例值：
         */
        private I18n[] description;
        /**
         * 树形排序，代表同层级的部门排序序号
         * <p> 示例值：123
         */
        private String treeOrder;
        /**
         * 列表排序，代表所有部门的混排序号
         * <p> 示例值：123
         */
        private String listOrder;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private ObjectFieldData[] customFields;

        /**
         * 上级组织
         * <p> 示例值：4719168654814483759
         *
         * @param parentId
         * @return
         */
        public Builder parentId(String parentId) {
            this.parentId = parentId;
            return this;
        }


        /**
         * 名称
         * <p> 示例值：
         *
         * @param name
         * @return
         */
        public Builder name(I18n[] name) {
            this.name = name;
            return this;
        }


        /**
         * 组织类型
         * <p> 示例值：
         *
         * @param type
         * @return
         */
        public Builder type(Enum type) {
            this.type = type;
            return this;
        }


        /**
         * 启用
         * <p> 示例值：true
         *
         * @param active
         * @return
         */
        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }


        /**
         * 生效时间
         * <p> 示例值：2020-05-01 00:00:00
         *
         * @param effectiveTime
         * @return
         */
        public Builder effectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }


        /**
         * 失效时间
         * <p> 示例值：2020-05-02 00:00:00
         *
         * @param expirationTime
         * @return
         */
        public Builder expirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }


        /**
         * 编码
         * <p> 示例值：12456
         *
         * @param code
         * @return
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }


        /**
         * 描述
         * <p> 示例值：
         *
         * @param description
         * @return
         */
        public Builder description(I18n[] description) {
            this.description = description;
            return this;
        }


        /**
         * 树形排序，代表同层级的部门排序序号
         * <p> 示例值：123
         *
         * @param treeOrder
         * @return
         */
        public Builder treeOrder(String treeOrder) {
            this.treeOrder = treeOrder;
            return this;
        }


        /**
         * 列表排序，代表所有部门的混排序号
         * <p> 示例值：123
         *
         * @param listOrder
         * @return
         */
        public Builder listOrder(String listOrder) {
            this.listOrder = listOrder;
            return this;
        }


        /**
         * 自定义字段
         * <p> 示例值：
         *
         * @param customFields
         * @return
         */
        public Builder customFields(ObjectFieldData[] customFields) {
            this.customFields = customFields;
            return this;
        }


        public HiberarchyCommon build() {
            return new HiberarchyCommon(this);
        }
    }
}
