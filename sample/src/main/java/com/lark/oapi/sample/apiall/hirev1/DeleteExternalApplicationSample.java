package com.lark.oapi.sample.apiall.hirev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.hire.v1.model.DeleteExternalApplicationReq;
import com.lark.oapi.service.hire.v1.model.DeleteExternalApplicationResp;

// DELETE /open-apis/hire/v1/external_applications/:external_application_id
public class DeleteExternalApplicationSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        DeleteExternalApplicationReq req = DeleteExternalApplicationReq.newBuilder()
                .externalApplicationId("6960663240925956660")
                .talentId("6960663240925956660")
                .build();

        // 发起请求
        DeleteExternalApplicationResp resp = client.hire().externalApplication().delete(req);

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
