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

package com.lark.oapi.service.moments.v1.model;

import com.google.gson.annotations.SerializedName;

public class P2PostCreatedV1Data {
    /**
     * 帖子ID
     * <p> 示例值："248381241"
     */
    @SerializedName("id")
    private String id;
    /**
     * 发帖用户ID
     * <p> 示例值："ou_xxxxx"
     */
    @SerializedName("user_id")
    private UserId userId;
    /**
     * 帖子创建时间
     * <p> 示例值："2022-05-23T00:00:00+08:00"
     */
    @SerializedName("create_time")
    private String createTime;
    /**
     * 帖子所属板块
     * <p> 示例值：
     */
    @SerializedName("category_ids")
    private String[] categoryIds;
    /**
     * 帖子链接
     * <p> 示例值："https://applink.feishu.cn/client/moments/detail?postId=7254"
     */
    @SerializedName("link")
    private String link;
    /**
     * 发帖人类型
     * <p> 示例值：1
     */
    @SerializedName("user_type")
    private Integer userType;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserId getUserId() {
        return this.userId;
    }

    public void setUserId(UserId userId) {
        this.userId = userId;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String[] getCategoryIds() {
        return this.categoryIds;
    }

    public void setCategoryIds(String[] categoryIds) {
        this.categoryIds = categoryIds;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getUserType() {
        return this.userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

}
