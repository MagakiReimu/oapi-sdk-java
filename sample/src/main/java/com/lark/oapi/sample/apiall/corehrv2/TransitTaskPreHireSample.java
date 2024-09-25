package com.lark.oapi.sample.apiall.corehrv2;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.corehr.v2.model.TransitTaskPreHireReq;
import com.lark.oapi.service.corehr.v2.model.TransitTaskPreHireReqBody;
import com.lark.oapi.service.corehr.v2.model.TransitTaskPreHireResp;

// POST /open-apis/corehr/v2/pre_hires/:pre_hire_id/transit_task
public class TransitTaskPreHireSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        TransitTaskPreHireReq req = TransitTaskPreHireReq.newBuilder()
                .preHireId("7345005664477775407")
                .transitTaskPreHireReqBody(TransitTaskPreHireReqBody.newBuilder()
                        .taskId("1")
                        .build())
                .build();

        // 发起请求
        TransitTaskPreHireResp resp = client.corehr().v2().preHire().transitTask(req);

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
