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

public class Application {

  @SerializedName("app_id")
  private String appId;
  @SerializedName("creator_id")
  private String creatorId;
  @SerializedName("status")
  private Integer status;
  @SerializedName("scene_type")
  private Integer sceneType;
  @SerializedName("payment_type")
  private Integer paymentType;
  @SerializedName("redirect_urls")
  private String[] redirectUrls;
  @SerializedName("online_version_id")
  private String onlineVersionId;
  @SerializedName("unaudit_version_id")
  private String unauditVersionId;
  @SerializedName("app_name")
  private String appName;
  @SerializedName("avatar_url")
  private String avatarUrl;
  @SerializedName("description")
  private String description;
  @SerializedName("scopes")
  private AppScope[] scopes;
  @SerializedName("back_home_url")
  private String backHomeUrl;
  @SerializedName("i18n")
  private AppI18nInfo[] i18n;
  @SerializedName("primary_language")
  private String primaryLanguage;
  @SerializedName("common_categories")
  private String[] commonCategories;
  @SerializedName("owner")
  private ApplicationOwner owner;

  // builder 开始
  public Application() {
  }

  public Application(Builder builder) {
    this.appId = builder.appId;
    this.creatorId = builder.creatorId;
    this.status = builder.status;
    this.sceneType = builder.sceneType;
    this.paymentType = builder.paymentType;
    this.redirectUrls = builder.redirectUrls;
    this.onlineVersionId = builder.onlineVersionId;
    this.unauditVersionId = builder.unauditVersionId;
    this.appName = builder.appName;
    this.avatarUrl = builder.avatarUrl;
    this.description = builder.description;
    this.scopes = builder.scopes;
    this.backHomeUrl = builder.backHomeUrl;
    this.i18n = builder.i18n;
    this.primaryLanguage = builder.primaryLanguage;
    this.commonCategories = builder.commonCategories;
    this.owner = builder.owner;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getAppId() {
    return this.appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public String getCreatorId() {
    return this.creatorId;
  }

  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }

  public Integer getStatus() {
    return this.status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Integer getSceneType() {
    return this.sceneType;
  }

  public void setSceneType(Integer sceneType) {
    this.sceneType = sceneType;
  }

  public Integer getPaymentType() {
    return this.paymentType;
  }

  public void setPaymentType(Integer paymentType) {
    this.paymentType = paymentType;
  }

  public String[] getRedirectUrls() {
    return this.redirectUrls;
  }

  public void setRedirectUrls(String[] redirectUrls) {
    this.redirectUrls = redirectUrls;
  }

  public String getOnlineVersionId() {
    return this.onlineVersionId;
  }

  public void setOnlineVersionId(String onlineVersionId) {
    this.onlineVersionId = onlineVersionId;
  }

  public String getUnauditVersionId() {
    return this.unauditVersionId;
  }

  public void setUnauditVersionId(String unauditVersionId) {
    this.unauditVersionId = unauditVersionId;
  }

  public String getAppName() {
    return this.appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public String getAvatarUrl() {
    return this.avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AppScope[] getScopes() {
    return this.scopes;
  }

  public void setScopes(AppScope[] scopes) {
    this.scopes = scopes;
  }

  public String getBackHomeUrl() {
    return this.backHomeUrl;
  }

  public void setBackHomeUrl(String backHomeUrl) {
    this.backHomeUrl = backHomeUrl;
  }

  public AppI18nInfo[] getI18n() {
    return this.i18n;
  }

  public void setI18n(AppI18nInfo[] i18n) {
    this.i18n = i18n;
  }

  public String getPrimaryLanguage() {
    return this.primaryLanguage;
  }

  public void setPrimaryLanguage(String primaryLanguage) {
    this.primaryLanguage = primaryLanguage;
  }

  public String[] getCommonCategories() {
    return this.commonCategories;
  }

  public void setCommonCategories(String[] commonCategories) {
    this.commonCategories = commonCategories;
  }

  public ApplicationOwner getOwner() {
    return this.owner;
  }

  public void setOwner(ApplicationOwner owner) {
    this.owner = owner;
  }

  public static class Builder {

    private String appId;
    private String creatorId;
    private Integer status;
    private Integer sceneType;
    private Integer paymentType;
    private String[] redirectUrls;
    private String onlineVersionId;
    private String unauditVersionId;
    private String appName;
    private String avatarUrl;
    private String description;
    private AppScope[] scopes;
    private String backHomeUrl;
    private AppI18nInfo[] i18n;
    private String primaryLanguage;
    private String[] commonCategories;
    private ApplicationOwner owner;

    public Builder appId(String appId) {
      this.appId = appId;
      return this;
    }

    public Builder creatorId(String creatorId) {
      this.creatorId = creatorId;
      return this;
    }

    public Builder status(Integer status) {
      this.status = status;
      return this;
    }

    public Builder status(com.lark.oapi.service.application.v6.enums.AppStatusEnum status) {
      this.status = status.getValue();
      return this;
    }

    public Builder sceneType(Integer sceneType) {
      this.sceneType = sceneType;
      return this;
    }

    public Builder sceneType(
        com.lark.oapi.service.application.v6.enums.AppSceneTypeEnum sceneType) {
      this.sceneType = sceneType.getValue();
      return this;
    }

    public Builder paymentType(Integer paymentType) {
      this.paymentType = paymentType;
      return this;
    }

    public Builder paymentType(
        com.lark.oapi.service.application.v6.enums.PaymentTypeEnum paymentType) {
      this.paymentType = paymentType.getValue();
      return this;
    }

    public Builder redirectUrls(String[] redirectUrls) {
      this.redirectUrls = redirectUrls;
      return this;
    }

    public Builder onlineVersionId(String onlineVersionId) {
      this.onlineVersionId = onlineVersionId;
      return this;
    }

    public Builder unauditVersionId(String unauditVersionId) {
      this.unauditVersionId = unauditVersionId;
      return this;
    }

    public Builder appName(String appName) {
      this.appName = appName;
      return this;
    }

    public Builder avatarUrl(String avatarUrl) {
      this.avatarUrl = avatarUrl;
      return this;
    }

    public Builder description(String description) {
      this.description = description;
      return this;
    }

    public Builder scopes(AppScope[] scopes) {
      this.scopes = scopes;
      return this;
    }

    public Builder backHomeUrl(String backHomeUrl) {
      this.backHomeUrl = backHomeUrl;
      return this;
    }

    public Builder i18n(AppI18nInfo[] i18n) {
      this.i18n = i18n;
      return this;
    }

    public Builder primaryLanguage(String primaryLanguage) {
      this.primaryLanguage = primaryLanguage;
      return this;
    }

    public Builder primaryLanguage(
        com.lark.oapi.service.application.v6.enums.I18nKeyEnum primaryLanguage) {
      this.primaryLanguage = primaryLanguage.getValue();
      return this;
    }

    public Builder commonCategories(String[] commonCategories) {
      this.commonCategories = commonCategories;
      return this;
    }

    public Builder owner(ApplicationOwner owner) {
      this.owner = owner;
      return this;
    }


    public Application build() {
      return new Application(this);
    }
  }
}
