package com.lark.oapi.sample.apiall.imv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.im.v1.model.ChatMenuItem;
import com.lark.oapi.service.im.v1.model.PatchChatMenuItemReq;
import com.lark.oapi.service.im.v1.model.PatchChatMenuItemReqBody;
import com.lark.oapi.service.im.v1.model.PatchChatMenuItemResp;

// PATCH /open-apis/im/v1/chats/:chat_id/menu_items/:menu_item_id
public class PatchChatMenuItemSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        PatchChatMenuItemReq req = PatchChatMenuItemReq.newBuilder()
                .chatId("oc_a0553eda9014c201e6969b478895c230")
                .menuItemId("7156553273518882844")
                .patchChatMenuItemReqBody(PatchChatMenuItemReqBody.newBuilder()
                        .updateFields(new String[]{})
                        .chatMenuItem(ChatMenuItem.newBuilder().build())
                        .build())
                .build();

        // 发起请求
        PatchChatMenuItemResp resp = client.im().chatMenuItem().patch(req);

        // 处理服务端错误
        if (!resp.success()) {
            System.out.println(String.format("code:%s,msg:%s,reqId:%s"
                    , resp.getCode(), resp.getMsg(), resp.getRequestId()));
            return;
        }

        // 业务数据处理
        System.out.println(Jsons.DEFAULT.toJson(resp.getData()));
    }
}
