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

package com.lark.oapi.service.admin.v1.model;

import com.google.gson.annotations.SerializedName;

public class ListBadge {

  /**
   * 勋章列表
   * <p> 示例值：[     {         "badge_id": "m_DjMzaK",         "name": "字节范勋章",         "explanation":
   * "奖励给值得鼓励的同学",         "badge_image": {             "image_key": "a210ea02-e406-49ee-997c-9acc57c59eac",
   *             "image_url": "https://s1-imfile.feishucdn.com/static-resource/v1/a210ea02-e406-49ee-997c-9acc57c59eac~?image_size=noop&cut_type=&quality=&format=image&sticker_format=.webp"
   *         },         "show_image": {             "image_key": "c23dcb4f-ee63-49c8-9b7d-85a7fe8f13cj",
   *             "image_url": "https://s1-imfile.feishucdn.com/static-resource/v1/c23dcb4f-ee63-49c8-9b7d-85a7fe8f13cj~?image_size=noop&cut_type=&quality=&format=image&sticker_format=.webp"
   * }     } ]
   */
  @SerializedName("badges")
  private Badge[] badges;
  /**
   * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
   * <p> 示例值：h121921
   */
  @SerializedName("page_token")
  private String pageToken;
  /**
   * 是否已经遍历完，表示本次页面请求已经拿到所有列表数据
   * <p> 示例值：false
   */
  @SerializedName("has_more")
  private Boolean hasMore;

  public Badge[] getBadges() {
    return this.badges;
  }

  public void setBadges(Badge[] badges) {
    this.badges = badges;
  }

  public String getPageToken() {
    return this.pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }

  public Boolean getHasMore() {
    return this.hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

}
