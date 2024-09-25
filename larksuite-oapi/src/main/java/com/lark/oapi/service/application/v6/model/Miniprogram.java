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

package com.lark.oapi.service.application.v6.model;

import com.google.gson.annotations.SerializedName;

public class Miniprogram {
    /**
     * pc 支持的小程序模式，bit 位表示
     * <p> 示例值：1
     */
    @SerializedName("enable_pc_mode")
    private Integer enablePcMode;
    /**
     * schema url 列表
     * <p> 示例值：
     */
    @SerializedName("schema_urls")
    private String[] schemaUrls;
    /**
     * pc 端是否使用小程序版本
     * <p> 示例值：false
     */
    @SerializedName("pc_use_mobile_pkg")
    private Boolean pcUseMobilePkg;
    /**
     * pc 的小程序版本号
     * <p> 示例值：1.0.0
     */
    @SerializedName("pc_version_id")
    private String pcVersionId;
    /**
     * 移动端小程序版本号
     * <p> 示例值：1.0.0
     */
    @SerializedName("mobile_version_id")
    private String mobileVersionId;
    /**
     * 移动端兼容的最低飞书版本
     * <p> 示例值：2.0
     */
    @SerializedName("mobile_min_lark_version")
    private String mobileMinLarkVersion;
    /**
     * pc 端兼容的最低飞书版本
     * <p> 示例值：2.0
     */
    @SerializedName("pc_min_lark_version")
    private String pcMinLarkVersion;

    // builder 开始
    public Miniprogram() {
    }

    public Miniprogram(Builder builder) {
        /**
         * pc 支持的小程序模式，bit 位表示
         * <p> 示例值：1
         */
        this.enablePcMode = builder.enablePcMode;
        /**
         * schema url 列表
         * <p> 示例值：
         */
        this.schemaUrls = builder.schemaUrls;
        /**
         * pc 端是否使用小程序版本
         * <p> 示例值：false
         */
        this.pcUseMobilePkg = builder.pcUseMobilePkg;
        /**
         * pc 的小程序版本号
         * <p> 示例值：1.0.0
         */
        this.pcVersionId = builder.pcVersionId;
        /**
         * 移动端小程序版本号
         * <p> 示例值：1.0.0
         */
        this.mobileVersionId = builder.mobileVersionId;
        /**
         * 移动端兼容的最低飞书版本
         * <p> 示例值：2.0
         */
        this.mobileMinLarkVersion = builder.mobileMinLarkVersion;
        /**
         * pc 端兼容的最低飞书版本
         * <p> 示例值：2.0
         */
        this.pcMinLarkVersion = builder.pcMinLarkVersion;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getEnablePcMode() {
        return this.enablePcMode;
    }

    public void setEnablePcMode(Integer enablePcMode) {
        this.enablePcMode = enablePcMode;
    }

    public String[] getSchemaUrls() {
        return this.schemaUrls;
    }

    public void setSchemaUrls(String[] schemaUrls) {
        this.schemaUrls = schemaUrls;
    }

    public Boolean getPcUseMobilePkg() {
        return this.pcUseMobilePkg;
    }

    public void setPcUseMobilePkg(Boolean pcUseMobilePkg) {
        this.pcUseMobilePkg = pcUseMobilePkg;
    }

    public String getPcVersionId() {
        return this.pcVersionId;
    }

    public void setPcVersionId(String pcVersionId) {
        this.pcVersionId = pcVersionId;
    }

    public String getMobileVersionId() {
        return this.mobileVersionId;
    }

    public void setMobileVersionId(String mobileVersionId) {
        this.mobileVersionId = mobileVersionId;
    }

    public String getMobileMinLarkVersion() {
        return this.mobileMinLarkVersion;
    }

    public void setMobileMinLarkVersion(String mobileMinLarkVersion) {
        this.mobileMinLarkVersion = mobileMinLarkVersion;
    }

    public String getPcMinLarkVersion() {
        return this.pcMinLarkVersion;
    }

    public void setPcMinLarkVersion(String pcMinLarkVersion) {
        this.pcMinLarkVersion = pcMinLarkVersion;
    }

    public static class Builder {
        /**
         * pc 支持的小程序模式，bit 位表示
         * <p> 示例值：1
         */
        private Integer enablePcMode;
        /**
         * schema url 列表
         * <p> 示例值：
         */
        private String[] schemaUrls;
        /**
         * pc 端是否使用小程序版本
         * <p> 示例值：false
         */
        private Boolean pcUseMobilePkg;
        /**
         * pc 的小程序版本号
         * <p> 示例值：1.0.0
         */
        private String pcVersionId;
        /**
         * 移动端小程序版本号
         * <p> 示例值：1.0.0
         */
        private String mobileVersionId;
        /**
         * 移动端兼容的最低飞书版本
         * <p> 示例值：2.0
         */
        private String mobileMinLarkVersion;
        /**
         * pc 端兼容的最低飞书版本
         * <p> 示例值：2.0
         */
        private String pcMinLarkVersion;

        /**
         * pc 支持的小程序模式，bit 位表示
         * <p> 示例值：1
         *
         * @param enablePcMode
         * @return
         */
        public Builder enablePcMode(Integer enablePcMode) {
            this.enablePcMode = enablePcMode;
            return this;
        }

        /**
         * pc 支持的小程序模式，bit 位表示
         * <p> 示例值：1
         *
         * @param enablePcMode {@link com.lark.oapi.service.application.v6.enums.MiniprogramMpEnablePcModeEnum}
         * @return
         */
        public Builder enablePcMode(com.lark.oapi.service.application.v6.enums.MiniprogramMpEnablePcModeEnum enablePcMode) {
            this.enablePcMode = enablePcMode.getValue();
            return this;
        }


        /**
         * schema url 列表
         * <p> 示例值：
         *
         * @param schemaUrls
         * @return
         */
        public Builder schemaUrls(String[] schemaUrls) {
            this.schemaUrls = schemaUrls;
            return this;
        }


        /**
         * pc 端是否使用小程序版本
         * <p> 示例值：false
         *
         * @param pcUseMobilePkg
         * @return
         */
        public Builder pcUseMobilePkg(Boolean pcUseMobilePkg) {
            this.pcUseMobilePkg = pcUseMobilePkg;
            return this;
        }


        /**
         * pc 的小程序版本号
         * <p> 示例值：1.0.0
         *
         * @param pcVersionId
         * @return
         */
        public Builder pcVersionId(String pcVersionId) {
            this.pcVersionId = pcVersionId;
            return this;
        }


        /**
         * 移动端小程序版本号
         * <p> 示例值：1.0.0
         *
         * @param mobileVersionId
         * @return
         */
        public Builder mobileVersionId(String mobileVersionId) {
            this.mobileVersionId = mobileVersionId;
            return this;
        }


        /**
         * 移动端兼容的最低飞书版本
         * <p> 示例值：2.0
         *
         * @param mobileMinLarkVersion
         * @return
         */
        public Builder mobileMinLarkVersion(String mobileMinLarkVersion) {
            this.mobileMinLarkVersion = mobileMinLarkVersion;
            return this;
        }


        /**
         * pc 端兼容的最低飞书版本
         * <p> 示例值：2.0
         *
         * @param pcMinLarkVersion
         * @return
         */
        public Builder pcMinLarkVersion(String pcMinLarkVersion) {
            this.pcMinLarkVersion = pcMinLarkVersion;
            return this;
        }


        public Miniprogram build() {
            return new Miniprogram(this);
        }
    }
}
