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

public class P2ApplicationCreatedV6Data {
    /**
     * 用户 ID
     * <p> 示例值：
     */
    @SerializedName("operator_id")
    private UserId operatorId;
    /**
     * 应用 ID
     * <p> 示例值：cli_9f5343c580712544
     */
    @SerializedName("app_id")
    private String appId;
    /**
     * 应用名称
     * <p> 示例值：应用名称
     */
    @SerializedName("name")
    private String name;
    /**
     * 应用描述
     * <p> 示例值：应用描述
     */
    @SerializedName("description")
    private String description;
    /**
     * 应用图标链接
     * <p> 示例值：https://s1-imfile.feishucdn.com/static-resource/v1/c1f2f629-65e5-462c-be6a-bf327f971edg
     */
    @SerializedName("avatar")
    private String avatar;
    /**
     * 应用类型，0: 自建应用，1: 应用商店应用
     * <p> 示例值：0
     */
    @SerializedName("app_scene_type")
    private Integer appSceneType;
    /**
     * 应用主语言
     * <p> 示例值：zh_cn
     */
    @SerializedName("primary_language")
    private String primaryLanguage;
    /**
     * 应用创建来源
     * <p> 示例值：developer_console
     */
    @SerializedName("create_source")
    private String createSource;

    public UserId getOperatorId() {
        return this.operatorId;
    }

    public void setOperatorId(UserId operatorId) {
        this.operatorId = operatorId;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getAppSceneType() {
        return this.appSceneType;
    }

    public void setAppSceneType(Integer appSceneType) {
        this.appSceneType = appSceneType;
    }

    public String getPrimaryLanguage() {
        return this.primaryLanguage;
    }

    public void setPrimaryLanguage(String primaryLanguage) {
        this.primaryLanguage = primaryLanguage;
    }

    public String getCreateSource() {
        return this.createSource;
    }

    public void setCreateSource(String createSource) {
        this.createSource = createSource;
    }

}
