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

package com.lark.oapi.service.im.v1.enums;

/**
 * Tab类型
 */
public enum ChatTabTabTypeEnum {
    MESSAGE("message"), // 消息类型
    DOCLIST("doc_list"), // 云文档列表
    DOC("doc"), // 文档
    PIN("pin"), // Pin
    MEETINGMINUTE("meeting_minute"), // 会议纪要
    CHATANNOUNCEMENT("chat_announcement"), // 群公告
    URL("url"), // URL
    FILE("file"), // 文件
    FILES_RESOURCES("files_resources"), // 合并类型, 包含文件、Doc文档、URL链接
    IMAGES_VIDEOS("images_videos"), // 合并类型，包含图片、视频
    TASK("task"), // 任务
    ;
    private String value;

    ChatTabTabTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}