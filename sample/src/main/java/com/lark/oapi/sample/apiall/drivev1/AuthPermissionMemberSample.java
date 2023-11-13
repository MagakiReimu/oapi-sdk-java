package com.lark.oapi.sample.apiall.drivev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.drive.v1.model.AuthPermissionMemberReq;
import com.lark.oapi.service.drive.v1.model.AuthPermissionMemberResp;

// GET /open-apis/drive/v1/permissions/:token/members/auth
public class AuthPermissionMemberSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        AuthPermissionMemberReq req = AuthPermissionMemberReq.newBuilder()
                .token("doccnBKgoMyY5OMbUG6FioTXuBe")
                .type("doc")
                .action("view")
                .build();

        // 发起请求
        AuthPermissionMemberResp resp = client.drive().permissionMember().auth(req);

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
