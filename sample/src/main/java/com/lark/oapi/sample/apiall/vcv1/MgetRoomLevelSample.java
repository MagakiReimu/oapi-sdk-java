package com.lark.oapi.sample.apiall.vcv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.vc.v1.model.MgetRoomLevelReq;
import com.lark.oapi.service.vc.v1.model.MgetRoomLevelReqBody;
import com.lark.oapi.service.vc.v1.model.MgetRoomLevelResp;

// POST /open-apis/vc/v1/room_levels/mget
public class MgetRoomLevelSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        MgetRoomLevelReq req = MgetRoomLevelReq.newBuilder()
                .mgetRoomLevelReqBody(MgetRoomLevelReqBody.newBuilder()
                        .levelIds(new String[]{})
                        .build())
                .build();

        // 发起请求
        MgetRoomLevelResp resp = client.vc().roomLevel().mget(req);

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
