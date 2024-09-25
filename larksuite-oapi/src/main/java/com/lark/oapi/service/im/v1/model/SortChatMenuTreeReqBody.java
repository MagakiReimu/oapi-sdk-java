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

package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class SortChatMenuTreeReqBody {
    /**
     * 新的一级菜单的顺序，进行排序ID列表需要跟群内目前存在的一级菜单ID列表对齐。通过 [获取群菜单](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-menu_tree/get) 接口获取群内菜单详情。
     * <p> 示例值：7156553273518882844
     */
    @SerializedName("chat_menu_top_level_ids")
    private String[] chatMenuTopLevelIds;

    // builder 开始
    public SortChatMenuTreeReqBody() {
    }

    public SortChatMenuTreeReqBody(Builder builder) {
        /**
         * 新的一级菜单的顺序，进行排序ID列表需要跟群内目前存在的一级菜单ID列表对齐。通过 [获取群菜单](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-menu_tree/get) 接口获取群内菜单详情。
         * <p> 示例值：7156553273518882844
         */
        this.chatMenuTopLevelIds = builder.chatMenuTopLevelIds;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String[] getChatMenuTopLevelIds() {
        return this.chatMenuTopLevelIds;
    }

    public void setChatMenuTopLevelIds(String[] chatMenuTopLevelIds) {
        this.chatMenuTopLevelIds = chatMenuTopLevelIds;
    }

    public static class Builder {
        /**
         * 新的一级菜单的顺序，进行排序ID列表需要跟群内目前存在的一级菜单ID列表对齐。通过 [获取群菜单](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-menu_tree/get) 接口获取群内菜单详情。
         * <p> 示例值：7156553273518882844
         */
        private String[] chatMenuTopLevelIds;

        /**
         * 新的一级菜单的顺序，进行排序ID列表需要跟群内目前存在的一级菜单ID列表对齐。通过 [获取群菜单](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-menu_tree/get) 接口获取群内菜单详情。
         * <p> 示例值：7156553273518882844
         *
         * @param chatMenuTopLevelIds
         * @return
         */
        public Builder chatMenuTopLevelIds(String[] chatMenuTopLevelIds) {
            this.chatMenuTopLevelIds = chatMenuTopLevelIds;
            return this;
        }


        public SortChatMenuTreeReqBody build() {
            return new SortChatMenuTreeReqBody(this);
        }
    }
}
