package com.lark.oapi.sample.apiall.corehrv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.corehr.v1.model.DeletePersonReq;
import com.lark.oapi.service.corehr.v1.model.DeletePersonResp;

// DELETE /open-apis/corehr/v1/persons/:person_id
public class DeletePersonSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        DeletePersonReq req = DeletePersonReq.newBuilder()
                .personId("654637829201")
                .build();

        // 发起请求
        DeletePersonResp resp = client.corehr().person().delete(req);

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
