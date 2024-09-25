package com.lark.oapi.sample.apiall.hirev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.hire.v1.model.GetAgencyReq;
import com.lark.oapi.service.hire.v1.model.GetAgencyResp;

// GET /open-apis/hire/v1/agencies/:agency_id
public class GetAgencySample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        GetAgencyReq req = GetAgencyReq.newBuilder()
                .agencyId("6898173495386147079")
                .userIdType("open_id")
                .build();

        // 发起请求
        GetAgencyResp resp = client.hire().v1().agency().get(req);

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
