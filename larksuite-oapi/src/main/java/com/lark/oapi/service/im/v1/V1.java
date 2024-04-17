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

package com.lark.oapi.service.im.v1;

import com.lark.oapi.core.Config;
import com.lark.oapi.service.im.v1.resource.Thread;
import com.lark.oapi.service.im.v1.resource.*;

public class V1 {
    private final BatchMessage batchMessage; // 消息 - 批量消息
    private final Chat chat; // 群组
    private final ChatAnnouncement chatAnnouncement; // 群组 - 群公告
    private final ChatManagers chatManagers; // 群组 - 群成员
    private final ChatMemberBot chatMemberBot; // 事件
    private final ChatMemberUser chatMemberUser; // 事件
    private final ChatMembers chatMembers; // 群组 - 群成员
    private final ChatMenuItem chatMenuItem; // chat.menu_item
    private final ChatMenuTree chatMenuTree; // 群组 - 群菜单
    private final ChatModeration chatModeration; // chat.moderation
    private final ChatTab chatTab; // 群组 - 会话标签页
    private final ChatTopNotice chatTopNotice; // chat.top_notice
    private final File file; // 消息 - 文件信息
    private final Image image; // 消息 - 图片信息
    private final Message message; // 消息加急
    private final MessageReaction messageReaction; // 消息 - 表情回复
    private final MessageResource messageResource; // message.resource
    private final Pin pin; // 消息 - Pin
    private final Thread thread; // thread

    public V1(Config config) {
        this.batchMessage = new BatchMessage(config);
        this.chat = new Chat(config);
        this.chatAnnouncement = new ChatAnnouncement(config);
        this.chatManagers = new ChatManagers(config);
        this.chatMemberBot = new ChatMemberBot(config);
        this.chatMemberUser = new ChatMemberUser(config);
        this.chatMembers = new ChatMembers(config);
        this.chatMenuItem = new ChatMenuItem(config);
        this.chatMenuTree = new ChatMenuTree(config);
        this.chatModeration = new ChatModeration(config);
        this.chatTab = new ChatTab(config);
        this.chatTopNotice = new ChatTopNotice(config);
        this.file = new File(config);
        this.image = new Image(config);
        this.message = new Message(config);
        this.messageReaction = new MessageReaction(config);
        this.messageResource = new MessageResource(config);
        this.pin = new Pin(config);
        this.thread = new Thread(config);
    }

    public BatchMessage batchMessage() {
        return batchMessage;
    }

    public Chat chat() {
        return chat;
    }

    public ChatAnnouncement chatAnnouncement() {
        return chatAnnouncement;
    }

    public ChatManagers chatManagers() {
        return chatManagers;
    }

    public ChatMemberBot chatMemberBot() {
        return chatMemberBot;
    }

    public ChatMemberUser chatMemberUser() {
        return chatMemberUser;
    }

    public ChatMembers chatMembers() {
        return chatMembers;
    }

    public ChatMenuItem chatMenuItem() {
        return chatMenuItem;
    }

    public ChatMenuTree chatMenuTree() {
        return chatMenuTree;
    }

    public ChatModeration chatModeration() {
        return chatModeration;
    }

    public ChatTab chatTab() {
        return chatTab;
    }

    public ChatTopNotice chatTopNotice() {
        return chatTopNotice;
    }

    public File file() {
        return file;
    }

    public Image image() {
        return image;
    }

    public Message message() {
        return message;
    }

    public MessageReaction messageReaction() {
        return messageReaction;
    }

    public MessageResource messageResource() {
        return messageResource;
    }

    public Pin pin() {
        return pin;
    }

    public Thread thread() {
        return thread;
    }
}