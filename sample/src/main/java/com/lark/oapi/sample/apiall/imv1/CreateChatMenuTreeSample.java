package com.lark.oapi.sample.apiall.imv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.im.v1.model.ChatMenuTree;
import com.lark.oapi.service.im.v1.model.CreateChatMenuTreeReq;
import com.lark.oapi.service.im.v1.model.CreateChatMenuTreeReqBody;
import com.lark.oapi.service.im.v1.model.CreateChatMenuTreeResp;

// POST /open-apis/im/v1/chats/:chat_id/menu_tree
public class CreateChatMenuTreeSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        CreateChatMenuTreeReq req = CreateChatMenuTreeReq.newBuilder()
                .chatId("oc_a0553eda9014c201e6969b478895c230")
                .createChatMenuTreeReqBody(CreateChatMenuTreeReqBody.newBuilder()
                        .menuTree(ChatMenuTree.newBuilder().build())
                        .build())
                .build();

        // 发起请求
        CreateChatMenuTreeResp resp = client.im().chatMenuTree().create(req);

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
