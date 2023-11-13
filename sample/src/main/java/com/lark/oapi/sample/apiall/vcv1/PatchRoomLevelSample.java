package com.lark.oapi.sample.apiall.vcv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.vc.v1.model.PatchRoomLevelReq;
import com.lark.oapi.service.vc.v1.model.PatchRoomLevelResp;
import com.lark.oapi.service.vc.v1.model.RoomLevel;

// PATCH /open-apis/vc/v1/room_levels/:room_level_id
public class PatchRoomLevelSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        PatchRoomLevelReq req = PatchRoomLevelReq.newBuilder()
                .roomLevelId("omb_4ad1a2c7a2fbc5fc9570f38456931293")
                .roomLevel(RoomLevel.newBuilder()
                        .name("测试层级2")
                        .parentId("omb_8d020b12fe49e82847c2af3c193d5754")
                        .customGroupId("zidingyi")
                        .build())
                .build();

        // 发起请求
        PatchRoomLevelResp resp = client.vc().roomLevel().patch(req);

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
