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

package com.lark.oapi.service.authen.v1.model;

import com.lark.oapi.core.response.EmptyData;
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

public class UserInfo {
    /**
     * 用户姓名
     * <p> 示例值：zhangsan
     */
    @SerializedName("name")
    private String name;
    /**
     * 用户英文名称
     * <p> 示例值：zhangsan
     */
    @SerializedName("en_name")
    private String enName;
    /**
     * 用户头像
     * <p> 示例值：www.feishu.cn/avatar/icon
     */
    @SerializedName("avatar_url")
    private String avatarUrl;
    /**
     * 用户头像 72x72
     * <p> 示例值：www.feishu.cn/avatar/icon
     */
    @SerializedName("avatar_thumb")
    private String avatarThumb;
    /**
     * 用户头像 240x240
     * <p> 示例值：www.feishu.cn/avatar/icon
     */
    @SerializedName("avatar_middle")
    private String avatarMiddle;
    /**
     * 用户头像 640x640
     * <p> 示例值：www.feishu.cn/avatar/icon
     */
    @SerializedName("avatar_big")
    private String avatarBig;
    /**
     * 用户在应用内的唯一标识
     * <p> 示例值：ou-caecc734c2e3328a62489fe0648c4b98779515d3
     */
    @SerializedName("open_id")
    private String openId;
    /**
     * 用户统一ID
     * <p> 示例值：on-d89jhsdhjsajkda7828enjdj328ydhhw3u43yjhdj
     */
    @SerializedName("union_id")
    private String unionId;
    /**
     * 用户邮箱
     * <p> 示例值：zhangsan@feishu.cn
     */
    @SerializedName("email")
    private String email;
    /**
     * 企业邮箱，请先确保已在管理后台启用飞书邮箱服务
     * <p> 示例值：zhangsan@feishu.cn
     */
    @SerializedName("enterprise_email")
    private String enterpriseEmail;
    /**
     * 用户 user_id
     * <p> 示例值：5d9bdxxx
     */
    @SerializedName("user_id")
    private String userId;
    /**
     * 用户手机号
     * <p> 示例值：+86130002883xx
     */
    @SerializedName("mobile")
    private String mobile;
    /**
     * 当前企业标识
     * <p> 示例值：736588c92lxf175d
     */
    @SerializedName("tenant_key")
    private String tenantKey;
    /**
     * 用户工号
     * <p> 示例值：111222333
     */
    @SerializedName("employee_no")
    private String employeeNo;

    // builder 开始
    public UserInfo() {
    }

    public UserInfo(Builder builder) {
        /**
         * 用户姓名
         * <p> 示例值：zhangsan
         */
        this.name = builder.name;
        /**
         * 用户英文名称
         * <p> 示例值：zhangsan
         */
        this.enName = builder.enName;
        /**
         * 用户头像
         * <p> 示例值：www.feishu.cn/avatar/icon
         */
        this.avatarUrl = builder.avatarUrl;
        /**
         * 用户头像 72x72
         * <p> 示例值：www.feishu.cn/avatar/icon
         */
        this.avatarThumb = builder.avatarThumb;
        /**
         * 用户头像 240x240
         * <p> 示例值：www.feishu.cn/avatar/icon
         */
        this.avatarMiddle = builder.avatarMiddle;
        /**
         * 用户头像 640x640
         * <p> 示例值：www.feishu.cn/avatar/icon
         */
        this.avatarBig = builder.avatarBig;
        /**
         * 用户在应用内的唯一标识
         * <p> 示例值：ou-caecc734c2e3328a62489fe0648c4b98779515d3
         */
        this.openId = builder.openId;
        /**
         * 用户统一ID
         * <p> 示例值：on-d89jhsdhjsajkda7828enjdj328ydhhw3u43yjhdj
         */
        this.unionId = builder.unionId;
        /**
         * 用户邮箱
         * <p> 示例值：zhangsan@feishu.cn
         */
        this.email = builder.email;
        /**
         * 企业邮箱，请先确保已在管理后台启用飞书邮箱服务
         * <p> 示例值：zhangsan@feishu.cn
         */
        this.enterpriseEmail = builder.enterpriseEmail;
        /**
         * 用户 user_id
         * <p> 示例值：5d9bdxxx
         */
        this.userId = builder.userId;
        /**
         * 用户手机号
         * <p> 示例值：+86130002883xx
         */
        this.mobile = builder.mobile;
        /**
         * 当前企业标识
         * <p> 示例值：736588c92lxf175d
         */
        this.tenantKey = builder.tenantKey;
        /**
         * 用户工号
         * <p> 示例值：111222333
         */
        this.employeeNo = builder.employeeNo;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnName() {
        return this.enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getAvatarThumb() {
        return this.avatarThumb;
    }

    public void setAvatarThumb(String avatarThumb) {
        this.avatarThumb = avatarThumb;
    }

    public String getAvatarMiddle() {
        return this.avatarMiddle;
    }

    public void setAvatarMiddle(String avatarMiddle) {
        this.avatarMiddle = avatarMiddle;
    }

    public String getAvatarBig() {
        return this.avatarBig;
    }

    public void setAvatarBig(String avatarBig) {
        this.avatarBig = avatarBig;
    }

    public String getOpenId() {
        return this.openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUnionId() {
        return this.unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnterpriseEmail() {
        return this.enterpriseEmail;
    }

    public void setEnterpriseEmail(String enterpriseEmail) {
        this.enterpriseEmail = enterpriseEmail;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTenantKey() {
        return this.tenantKey;
    }

    public void setTenantKey(String tenantKey) {
        this.tenantKey = tenantKey;
    }

    public String getEmployeeNo() {
        return this.employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public static class Builder {
        /**
         * 用户姓名
         * <p> 示例值：zhangsan
         */
        private String name;
        /**
         * 用户英文名称
         * <p> 示例值：zhangsan
         */
        private String enName;
        /**
         * 用户头像
         * <p> 示例值：www.feishu.cn/avatar/icon
         */
        private String avatarUrl;
        /**
         * 用户头像 72x72
         * <p> 示例值：www.feishu.cn/avatar/icon
         */
        private String avatarThumb;
        /**
         * 用户头像 240x240
         * <p> 示例值：www.feishu.cn/avatar/icon
         */
        private String avatarMiddle;
        /**
         * 用户头像 640x640
         * <p> 示例值：www.feishu.cn/avatar/icon
         */
        private String avatarBig;
        /**
         * 用户在应用内的唯一标识
         * <p> 示例值：ou-caecc734c2e3328a62489fe0648c4b98779515d3
         */
        private String openId;
        /**
         * 用户统一ID
         * <p> 示例值：on-d89jhsdhjsajkda7828enjdj328ydhhw3u43yjhdj
         */
        private String unionId;
        /**
         * 用户邮箱
         * <p> 示例值：zhangsan@feishu.cn
         */
        private String email;
        /**
         * 企业邮箱，请先确保已在管理后台启用飞书邮箱服务
         * <p> 示例值：zhangsan@feishu.cn
         */
        private String enterpriseEmail;
        /**
         * 用户 user_id
         * <p> 示例值：5d9bdxxx
         */
        private String userId;
        /**
         * 用户手机号
         * <p> 示例值：+86130002883xx
         */
        private String mobile;
        /**
         * 当前企业标识
         * <p> 示例值：736588c92lxf175d
         */
        private String tenantKey;
        /**
         * 用户工号
         * <p> 示例值：111222333
         */
        private String employeeNo;

        /**
         * 用户姓名
         * <p> 示例值：zhangsan
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 用户英文名称
         * <p> 示例值：zhangsan
         *
         * @param enName
         * @return
         */
        public Builder enName(String enName) {
            this.enName = enName;
            return this;
        }


        /**
         * 用户头像
         * <p> 示例值：www.feishu.cn/avatar/icon
         *
         * @param avatarUrl
         * @return
         */
        public Builder avatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }


        /**
         * 用户头像 72x72
         * <p> 示例值：www.feishu.cn/avatar/icon
         *
         * @param avatarThumb
         * @return
         */
        public Builder avatarThumb(String avatarThumb) {
            this.avatarThumb = avatarThumb;
            return this;
        }


        /**
         * 用户头像 240x240
         * <p> 示例值：www.feishu.cn/avatar/icon
         *
         * @param avatarMiddle
         * @return
         */
        public Builder avatarMiddle(String avatarMiddle) {
            this.avatarMiddle = avatarMiddle;
            return this;
        }


        /**
         * 用户头像 640x640
         * <p> 示例值：www.feishu.cn/avatar/icon
         *
         * @param avatarBig
         * @return
         */
        public Builder avatarBig(String avatarBig) {
            this.avatarBig = avatarBig;
            return this;
        }


        /**
         * 用户在应用内的唯一标识
         * <p> 示例值：ou-caecc734c2e3328a62489fe0648c4b98779515d3
         *
         * @param openId
         * @return
         */
        public Builder openId(String openId) {
            this.openId = openId;
            return this;
        }


        /**
         * 用户统一ID
         * <p> 示例值：on-d89jhsdhjsajkda7828enjdj328ydhhw3u43yjhdj
         *
         * @param unionId
         * @return
         */
        public Builder unionId(String unionId) {
            this.unionId = unionId;
            return this;
        }


        /**
         * 用户邮箱
         * <p> 示例值：zhangsan@feishu.cn
         *
         * @param email
         * @return
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }


        /**
         * 企业邮箱，请先确保已在管理后台启用飞书邮箱服务
         * <p> 示例值：zhangsan@feishu.cn
         *
         * @param enterpriseEmail
         * @return
         */
        public Builder enterpriseEmail(String enterpriseEmail) {
            this.enterpriseEmail = enterpriseEmail;
            return this;
        }


        /**
         * 用户 user_id
         * <p> 示例值：5d9bdxxx
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        /**
         * 用户手机号
         * <p> 示例值：+86130002883xx
         *
         * @param mobile
         * @return
         */
        public Builder mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }


        /**
         * 当前企业标识
         * <p> 示例值：736588c92lxf175d
         *
         * @param tenantKey
         * @return
         */
        public Builder tenantKey(String tenantKey) {
            this.tenantKey = tenantKey;
            return this;
        }


        /**
         * 用户工号
         * <p> 示例值：111222333
         *
         * @param employeeNo
         * @return
         */
        public Builder employeeNo(String employeeNo) {
            this.employeeNo = employeeNo;
            return this;
        }


        public UserInfo build() {
            return new UserInfo(this);
        }
    }
}
