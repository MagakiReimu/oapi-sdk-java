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

public class SignatureTemplateBriefInfo {
    /**
     * id
     * <p> 示例值：1
     */
    @SerializedName("id")
    private String id;
    /**
     * 名称 支持多语
     * <p> 示例值：
     */
    @SerializedName("label")
    private I18n[] label;
    /**
     * 模版类别
     * <p> 示例值：
     */
    @SerializedName("category")
    private Enum category;
    /**
     * 模版用法
     * <p> 示例值：
     */
    @SerializedName("usage")
    private Enum usage;
    /**
     * 模版签署人标签
     * <p> 示例值：
     */
    @SerializedName("signatory_labels")
    private SignatureSignatoryLabel[] signatoryLabels;
    /**
     * 是否激活
     * <p> 示例值：true
     */
    @SerializedName("active")
    private Boolean active;
    /**
     * 创建人
     * <p> 示例值：123123123123123123
     */
    @SerializedName("create_by")
    private String createBy;
    /**
     * 修改人
     * <p> 示例值：123123123123123123
     */
    @SerializedName("modify_by")
    private String modifyBy;
    /**
     * 适用范围
     * <p> 示例值：
     */
    @SerializedName("applicability")
    private Enum applicability;
    /**
     * 创建方法
     * <p> 示例值：online_edit
     */
    @SerializedName("creation_method")
    private String creationMethod;
    /**
     * 版本
     * <p> 示例值：v1
     */
    @SerializedName("version")
    private String version;
    /**
     * 更新时间
     * <p> 示例值：31231232123
     */
    @SerializedName("update_time")
    private String updateTime;
    /**
     * 创建时间
     * <p> 示例值：3123123211
     */
    @SerializedName("create_time")
    private String createTime;
    /**
     * 模板设置，包含开启骑缝章的类型等
     * <p> 示例值：
     */
    @SerializedName("template_setting")
    private SignatureTemplateSetting templateSetting;
    /**
     * 模板适用区域
     * <p> 示例值：
     */
    @SerializedName("template_region_info")
    private SignatureTemplateRegionInfo templateRegionInfo;
    /**
     * 模板编码
     * <p> 示例值：1234
     */
    @SerializedName("template_code")
    private String templateCode;
    /**
     * 模板描述 支持多语
     * <p> 示例值：
     */
    @SerializedName("template_desc")
    private I18n[] templateDesc;

    // builder 开始
    public SignatureTemplateBriefInfo() {
    }

    public SignatureTemplateBriefInfo(Builder builder) {
        /**
         * id
         * <p> 示例值：1
         */
        this.id = builder.id;
        /**
         * 名称 支持多语
         * <p> 示例值：
         */
        this.label = builder.label;
        /**
         * 模版类别
         * <p> 示例值：
         */
        this.category = builder.category;
        /**
         * 模版用法
         * <p> 示例值：
         */
        this.usage = builder.usage;
        /**
         * 模版签署人标签
         * <p> 示例值：
         */
        this.signatoryLabels = builder.signatoryLabels;
        /**
         * 是否激活
         * <p> 示例值：true
         */
        this.active = builder.active;
        /**
         * 创建人
         * <p> 示例值：123123123123123123
         */
        this.createBy = builder.createBy;
        /**
         * 修改人
         * <p> 示例值：123123123123123123
         */
        this.modifyBy = builder.modifyBy;
        /**
         * 适用范围
         * <p> 示例值：
         */
        this.applicability = builder.applicability;
        /**
         * 创建方法
         * <p> 示例值：online_edit
         */
        this.creationMethod = builder.creationMethod;
        /**
         * 版本
         * <p> 示例值：v1
         */
        this.version = builder.version;
        /**
         * 更新时间
         * <p> 示例值：31231232123
         */
        this.updateTime = builder.updateTime;
        /**
         * 创建时间
         * <p> 示例值：3123123211
         */
        this.createTime = builder.createTime;
        /**
         * 模板设置，包含开启骑缝章的类型等
         * <p> 示例值：
         */
        this.templateSetting = builder.templateSetting;
        /**
         * 模板适用区域
         * <p> 示例值：
         */
        this.templateRegionInfo = builder.templateRegionInfo;
        /**
         * 模板编码
         * <p> 示例值：1234
         */
        this.templateCode = builder.templateCode;
        /**
         * 模板描述 支持多语
         * <p> 示例值：
         */
        this.templateDesc = builder.templateDesc;
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

    public I18n[] getLabel() {
        return this.label;
    }

    public void setLabel(I18n[] label) {
        this.label = label;
    }

    public Enum getCategory() {
        return this.category;
    }

    public void setCategory(Enum category) {
        this.category = category;
    }

    public Enum getUsage() {
        return this.usage;
    }

    public void setUsage(Enum usage) {
        this.usage = usage;
    }

    public SignatureSignatoryLabel[] getSignatoryLabels() {
        return this.signatoryLabels;
    }

    public void setSignatoryLabels(SignatureSignatoryLabel[] signatoryLabels) {
        this.signatoryLabels = signatoryLabels;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getCreateBy() {
        return this.createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getModifyBy() {
        return this.modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Enum getApplicability() {
        return this.applicability;
    }

    public void setApplicability(Enum applicability) {
        this.applicability = applicability;
    }

    public String getCreationMethod() {
        return this.creationMethod;
    }

    public void setCreationMethod(String creationMethod) {
        this.creationMethod = creationMethod;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public SignatureTemplateSetting getTemplateSetting() {
        return this.templateSetting;
    }

    public void setTemplateSetting(SignatureTemplateSetting templateSetting) {
        this.templateSetting = templateSetting;
    }

    public SignatureTemplateRegionInfo getTemplateRegionInfo() {
        return this.templateRegionInfo;
    }

    public void setTemplateRegionInfo(SignatureTemplateRegionInfo templateRegionInfo) {
        this.templateRegionInfo = templateRegionInfo;
    }

    public String getTemplateCode() {
        return this.templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public I18n[] getTemplateDesc() {
        return this.templateDesc;
    }

    public void setTemplateDesc(I18n[] templateDesc) {
        this.templateDesc = templateDesc;
    }

    public static class Builder {
        /**
         * id
         * <p> 示例值：1
         */
        private String id;
        /**
         * 名称 支持多语
         * <p> 示例值：
         */
        private I18n[] label;
        /**
         * 模版类别
         * <p> 示例值：
         */
        private Enum category;
        /**
         * 模版用法
         * <p> 示例值：
         */
        private Enum usage;
        /**
         * 模版签署人标签
         * <p> 示例值：
         */
        private SignatureSignatoryLabel[] signatoryLabels;
        /**
         * 是否激活
         * <p> 示例值：true
         */
        private Boolean active;
        /**
         * 创建人
         * <p> 示例值：123123123123123123
         */
        private String createBy;
        /**
         * 修改人
         * <p> 示例值：123123123123123123
         */
        private String modifyBy;
        /**
         * 适用范围
         * <p> 示例值：
         */
        private Enum applicability;
        /**
         * 创建方法
         * <p> 示例值：online_edit
         */
        private String creationMethod;
        /**
         * 版本
         * <p> 示例值：v1
         */
        private String version;
        /**
         * 更新时间
         * <p> 示例值：31231232123
         */
        private String updateTime;
        /**
         * 创建时间
         * <p> 示例值：3123123211
         */
        private String createTime;
        /**
         * 模板设置，包含开启骑缝章的类型等
         * <p> 示例值：
         */
        private SignatureTemplateSetting templateSetting;
        /**
         * 模板适用区域
         * <p> 示例值：
         */
        private SignatureTemplateRegionInfo templateRegionInfo;
        /**
         * 模板编码
         * <p> 示例值：1234
         */
        private String templateCode;
        /**
         * 模板描述 支持多语
         * <p> 示例值：
         */
        private I18n[] templateDesc;

        /**
         * id
         * <p> 示例值：1
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 名称 支持多语
         * <p> 示例值：
         *
         * @param label
         * @return
         */
        public Builder label(I18n[] label) {
            this.label = label;
            return this;
        }


        /**
         * 模版类别
         * <p> 示例值：
         *
         * @param category
         * @return
         */
        public Builder category(Enum category) {
            this.category = category;
            return this;
        }


        /**
         * 模版用法
         * <p> 示例值：
         *
         * @param usage
         * @return
         */
        public Builder usage(Enum usage) {
            this.usage = usage;
            return this;
        }


        /**
         * 模版签署人标签
         * <p> 示例值：
         *
         * @param signatoryLabels
         * @return
         */
        public Builder signatoryLabels(SignatureSignatoryLabel[] signatoryLabels) {
            this.signatoryLabels = signatoryLabels;
            return this;
        }


        /**
         * 是否激活
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
         * 创建人
         * <p> 示例值：123123123123123123
         *
         * @param createBy
         * @return
         */
        public Builder createBy(String createBy) {
            this.createBy = createBy;
            return this;
        }


        /**
         * 修改人
         * <p> 示例值：123123123123123123
         *
         * @param modifyBy
         * @return
         */
        public Builder modifyBy(String modifyBy) {
            this.modifyBy = modifyBy;
            return this;
        }


        /**
         * 适用范围
         * <p> 示例值：
         *
         * @param applicability
         * @return
         */
        public Builder applicability(Enum applicability) {
            this.applicability = applicability;
            return this;
        }


        /**
         * 创建方法
         * <p> 示例值：online_edit
         *
         * @param creationMethod
         * @return
         */
        public Builder creationMethod(String creationMethod) {
            this.creationMethod = creationMethod;
            return this;
        }


        /**
         * 版本
         * <p> 示例值：v1
         *
         * @param version
         * @return
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }


        /**
         * 更新时间
         * <p> 示例值：31231232123
         *
         * @param updateTime
         * @return
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }


        /**
         * 创建时间
         * <p> 示例值：3123123211
         *
         * @param createTime
         * @return
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }


        /**
         * 模板设置，包含开启骑缝章的类型等
         * <p> 示例值：
         *
         * @param templateSetting
         * @return
         */
        public Builder templateSetting(SignatureTemplateSetting templateSetting) {
            this.templateSetting = templateSetting;
            return this;
        }


        /**
         * 模板适用区域
         * <p> 示例值：
         *
         * @param templateRegionInfo
         * @return
         */
        public Builder templateRegionInfo(SignatureTemplateRegionInfo templateRegionInfo) {
            this.templateRegionInfo = templateRegionInfo;
            return this;
        }


        /**
         * 模板编码
         * <p> 示例值：1234
         *
         * @param templateCode
         * @return
         */
        public Builder templateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }


        /**
         * 模板描述 支持多语
         * <p> 示例值：
         *
         * @param templateDesc
         * @return
         */
        public Builder templateDesc(I18n[] templateDesc) {
            this.templateDesc = templateDesc;
            return this;
        }


        public SignatureTemplateBriefInfo build() {
            return new SignatureTemplateBriefInfo(this);
        }
    }
}
