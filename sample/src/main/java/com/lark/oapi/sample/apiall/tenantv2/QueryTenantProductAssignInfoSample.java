package com.lark.oapi.sample.apiall.tenantv2;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.tenant.v2.model.QueryTenantProductAssignInfoResp;

// GET /open-apis/tenant/v2/tenant/assign_info_list/query
public class QueryTenantProductAssignInfoSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象

        // 发起请求
        QueryTenantProductAssignInfoResp resp = client.tenant().tenantProductAssignInfo().query();

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
