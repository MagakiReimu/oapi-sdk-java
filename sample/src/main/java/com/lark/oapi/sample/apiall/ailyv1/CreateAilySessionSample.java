package com.lark.oapi.sample.apiall.ailyv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.aily.v1.model.CreateAilySessionReq;
import com.lark.oapi.service.aily.v1.model.CreateAilySessionReqBody;
import com.lark.oapi.service.aily.v1.model.CreateAilySessionResp;

// POST /open-apis/aily/v1/sessions
public class CreateAilySessionSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        CreateAilySessionReq req = CreateAilySessionReq.newBuilder()
                .createAilySessionReqBody(CreateAilySessionReqBody.newBuilder()
                        .channelContext("{}")
                        .metadata("{}")
                        .build())
                .build();

        // 发起请求
        CreateAilySessionResp resp = client.aily().v1().ailySession().create(req);

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
