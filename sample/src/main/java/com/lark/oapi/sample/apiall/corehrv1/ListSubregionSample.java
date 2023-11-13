package com.lark.oapi.sample.apiall.corehrv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.corehr.v1.model.ListSubregionReq;
import com.lark.oapi.service.corehr.v1.model.ListSubregionResp;

// GET /open-apis/corehr/v1/subregions
public class ListSubregionSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        ListSubregionReq req = ListSubregionReq.newBuilder()
                .pageToken("1231231987")
                .pageSize("100")
                .subdivisionId("100")
                .build();

        // 发起请求
        ListSubregionResp resp = client.corehr().subregion().list(req);

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
