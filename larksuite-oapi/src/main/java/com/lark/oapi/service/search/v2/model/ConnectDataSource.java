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

package com.lark.oapi.service.search.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.search.v2.enums.*;
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

public class ConnectDataSource {
    /**
     * 要托管的服务API地址，例如https://open.feishu.cn/xxxx/xxxx
     * <p> 示例值：
     */
    @SerializedName("service_url")
    private String serviceUrl;
    /**
     * 项目地址，只能包含小写字母，如bytedance_test
     * <p> 示例值：
     */
    @SerializedName("project_name")
    private String projectName;
    /**
     * datasource名称，会展示在飞书搜索分类按钮（searchTab）中，如：公司wiki
     * <p> 示例值：
     */
    @SerializedName("display_name")
    private String displayName;
    /**
     * 描述datasource
     * <p> 示例值：
     */
    @SerializedName("description")
    private String description;
    /**
     * 图标
     * <p> 示例值：
     */
    @SerializedName("icon_url")
    private String iconUrl;
    /**
     * 托管api的描述
     * <p> 示例值：
     */
    @SerializedName("project_description")
    private String projectDescription;
    /**
     * 联系人邮箱，开发人员的邮箱，用于托管API的SLA（Service Level Agreement）问题沟通
     * <p> 示例值：
     */
    @SerializedName("contact_email")
    private String contactEmail;
    /**
     * 创建api的组织名称，对企业开发者来说，建议使用企业名称
     * <p> 示例值：
     */
    @SerializedName("tenant_name")
    private String tenantName;

    // builder 开始
    public ConnectDataSource() {
    }

    public ConnectDataSource(Builder builder) {
        /**
         * 要托管的服务API地址，例如https://open.feishu.cn/xxxx/xxxx
         * <p> 示例值：
         */
        this.serviceUrl = builder.serviceUrl;
        /**
         * 项目地址，只能包含小写字母，如bytedance_test
         * <p> 示例值：
         */
        this.projectName = builder.projectName;
        /**
         * datasource名称，会展示在飞书搜索分类按钮（searchTab）中，如：公司wiki
         * <p> 示例值：
         */
        this.displayName = builder.displayName;
        /**
         * 描述datasource
         * <p> 示例值：
         */
        this.description = builder.description;
        /**
         * 图标
         * <p> 示例值：
         */
        this.iconUrl = builder.iconUrl;
        /**
         * 托管api的描述
         * <p> 示例值：
         */
        this.projectDescription = builder.projectDescription;
        /**
         * 联系人邮箱，开发人员的邮箱，用于托管API的SLA（Service Level Agreement）问题沟通
         * <p> 示例值：
         */
        this.contactEmail = builder.contactEmail;
        /**
         * 创建api的组织名称，对企业开发者来说，建议使用企业名称
         * <p> 示例值：
         */
        this.tenantName = builder.tenantName;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getServiceUrl() {
        return this.serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public String getProjectName() {
        return this.projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getProjectDescription() {
        return this.projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getContactEmail() {
        return this.contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getTenantName() {
        return this.tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public static class Builder {
        /**
         * 要托管的服务API地址，例如https://open.feishu.cn/xxxx/xxxx
         * <p> 示例值：
         */
        private String serviceUrl;
        /**
         * 项目地址，只能包含小写字母，如bytedance_test
         * <p> 示例值：
         */
        private String projectName;
        /**
         * datasource名称，会展示在飞书搜索分类按钮（searchTab）中，如：公司wiki
         * <p> 示例值：
         */
        private String displayName;
        /**
         * 描述datasource
         * <p> 示例值：
         */
        private String description;
        /**
         * 图标
         * <p> 示例值：
         */
        private String iconUrl;
        /**
         * 托管api的描述
         * <p> 示例值：
         */
        private String projectDescription;
        /**
         * 联系人邮箱，开发人员的邮箱，用于托管API的SLA（Service Level Agreement）问题沟通
         * <p> 示例值：
         */
        private String contactEmail;
        /**
         * 创建api的组织名称，对企业开发者来说，建议使用企业名称
         * <p> 示例值：
         */
        private String tenantName;

        /**
         * 要托管的服务API地址，例如https://open.feishu.cn/xxxx/xxxx
         * <p> 示例值：
         *
         * @param serviceUrl
         * @return
         */
        public Builder serviceUrl(String serviceUrl) {
            this.serviceUrl = serviceUrl;
            return this;
        }


        /**
         * 项目地址，只能包含小写字母，如bytedance_test
         * <p> 示例值：
         *
         * @param projectName
         * @return
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }


        /**
         * datasource名称，会展示在飞书搜索分类按钮（searchTab）中，如：公司wiki
         * <p> 示例值：
         *
         * @param displayName
         * @return
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }


        /**
         * 描述datasource
         * <p> 示例值：
         *
         * @param description
         * @return
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }


        /**
         * 图标
         * <p> 示例值：
         *
         * @param iconUrl
         * @return
         */
        public Builder iconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }


        /**
         * 托管api的描述
         * <p> 示例值：
         *
         * @param projectDescription
         * @return
         */
        public Builder projectDescription(String projectDescription) {
            this.projectDescription = projectDescription;
            return this;
        }


        /**
         * 联系人邮箱，开发人员的邮箱，用于托管API的SLA（Service Level Agreement）问题沟通
         * <p> 示例值：
         *
         * @param contactEmail
         * @return
         */
        public Builder contactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }


        /**
         * 创建api的组织名称，对企业开发者来说，建议使用企业名称
         * <p> 示例值：
         *
         * @param tenantName
         * @return
         */
        public Builder tenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }


        public ConnectDataSource build() {
            return new ConnectDataSource(this);
        }
    }
}
