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

package com.lark.oapi.service.baike.v1.model;

import com.google.gson.annotations.SerializedName;

public class Entity {

  @SerializedName("id")
  private String id;
  @SerializedName("main_keys")
  private Term[] mainKeys;
  @SerializedName("aliases")
  private Term[] aliases;
  @SerializedName("description")
  private String description;
  @SerializedName("create_time")
  private String createTime;
  @SerializedName("update_time")
  private String updateTime;
  @SerializedName("related_meta")
  private RelatedMeta relatedMeta;
  @SerializedName("categories")
  private String[] categories;
  @SerializedName("statistics")
  private Statistics statistics;
  @SerializedName("outer_info")
  private OuterInfo outerInfo;
  @SerializedName("rich_text")
  private String richText;

  // builder 开始
  public Entity() {
  }

  public Entity(Builder builder) {
    this.id = builder.id;
    this.mainKeys = builder.mainKeys;
    this.aliases = builder.aliases;
    this.description = builder.description;
    this.createTime = builder.createTime;
    this.updateTime = builder.updateTime;
    this.relatedMeta = builder.relatedMeta;
    this.categories = builder.categories;
    this.statistics = builder.statistics;
    this.outerInfo = builder.outerInfo;
    this.richText = builder.richText;
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

  public Term[] getMainKeys() {
    return this.mainKeys;
  }

  public void setMainKeys(Term[] mainKeys) {
    this.mainKeys = mainKeys;
  }

  public Term[] getAliases() {
    return this.aliases;
  }

  public void setAliases(Term[] aliases) {
    this.aliases = aliases;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public String getUpdateTime() {
    return this.updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public RelatedMeta getRelatedMeta() {
    return this.relatedMeta;
  }

  public void setRelatedMeta(RelatedMeta relatedMeta) {
    this.relatedMeta = relatedMeta;
  }

  public String[] getCategories() {
    return this.categories;
  }

  public void setCategories(String[] categories) {
    this.categories = categories;
  }

  public Statistics getStatistics() {
    return this.statistics;
  }

  public void setStatistics(Statistics statistics) {
    this.statistics = statistics;
  }

  public OuterInfo getOuterInfo() {
    return this.outerInfo;
  }

  public void setOuterInfo(OuterInfo outerInfo) {
    this.outerInfo = outerInfo;
  }

  public String getRichText() {
    return this.richText;
  }

  public void setRichText(String richText) {
    this.richText = richText;
  }

  public static class Builder {

    private String id;
    private Term[] mainKeys;
    private Term[] aliases;
    private String description;
    private String createTime;
    private String updateTime;
    private RelatedMeta relatedMeta;
    private String[] categories;
    private Statistics statistics;
    private OuterInfo outerInfo;
    private String richText;

    public Builder id(String id) {
      this.id = id;
      return this;
    }

    public Builder mainKeys(Term[] mainKeys) {
      this.mainKeys = mainKeys;
      return this;
    }


    public Builder aliases(Term[] aliases) {
      this.aliases = aliases;
      return this;
    }

    public Builder description(String description) {
      this.description = description;
      return this;
    }

    public Builder createTime(String createTime) {
      this.createTime = createTime;
      return this;
    }

    public Builder updateTime(String updateTime) {
      this.updateTime = updateTime;
      return this;
    }

    public Builder relatedMeta(RelatedMeta relatedMeta) {
      this.relatedMeta = relatedMeta;
      return this;
    }

    public Builder categories(String[] categories) {
      this.categories = categories;
      return this;
    }

    public Builder statistics(Statistics statistics) {
      this.statistics = statistics;
      return this;
    }

    public Builder outerInfo(OuterInfo outerInfo) {
      this.outerInfo = outerInfo;
      return this;
    }

    public Builder richText(String richText) {
      this.richText = richText;
      return this;
    }


    public Entity build() {
      return new Entity(this);
    }
  }
}
