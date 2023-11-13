package com.lark.oapi.sample.apiall.okrv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.okr.v1.model.GetProgressRecordReq;
import com.lark.oapi.service.okr.v1.model.GetProgressRecordResp;

// GET /open-apis/okr/v1/progress_records/:progress_id
public class GetProgressRecordSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        GetProgressRecordReq req = GetProgressRecordReq.newBuilder()
                .progressId("7041857032248410131")
                .userIdType("user_id")
                .build();

        // 发起请求
        GetProgressRecordResp resp = client.okr().progressRecord().get(req);

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
