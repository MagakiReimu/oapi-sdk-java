package com.lark.oapi.sample.apiall.drivev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.drive.v1.model.ListFileVersionReq;
import com.lark.oapi.service.drive.v1.model.ListFileVersionResp;

// GET /open-apis/drive/v1/files/:file_token/versions
public class ListFileVersionSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        ListFileVersionReq req = ListFileVersionReq.newBuilder()
                .fileToken("shtbcpM2mm3znrLfWnf4browTYp23")
                .pageSize(10)
                .pageToken("1665739388")
                .objType("doc/docx/sheet/bitable")
                .userIdType("open_id")
                .build();

        // 发起请求
        ListFileVersionResp resp = client.drive().fileVersion().list(req);

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
